package com.mycompany.hundefriseursalon.Persistence;

import com.mycompany.hundefriseursalon.BusinessLogik.Haustier;
import com.mycompany.hundefriseursalon.Persistence.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class HaustierJpaController implements Serializable {

    public HaustierJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    private EntityManagerFactory emf = null;
    
    public HaustierJpaController() {
        emf = Persistence.createEntityManagerFactory("HundefriseursalonPU");
    }
    
    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Haustier haustier) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(haustier);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Haustier haustier) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            haustier = em.merge(haustier);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = haustier.getNum_cliente();
                if (findHaustier(id) == null) {
                    throw new NonexistentEntityException("The haustier with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Haustier haustier;
            try {
                haustier = em.getReference(Haustier.class, id);
                haustier.getNum_cliente();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The haustier with id " + id + " no longer exists.", enfe);
            }
            em.remove(haustier);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Haustier> findHaustierEntities() {
        return findHaustierEntities(true, -1, -1);
    }

    public List<Haustier> findHaustierEntities(int maxResults, int firstResult) {
        return findHaustierEntities(false, maxResults, firstResult);
    }

    private List<Haustier> findHaustierEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Haustier.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Haustier findHaustier(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Haustier.class, id);
        } finally {
            em.close();
        }
    }

    public int getHaustierCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Haustier> rt = cq.from(Haustier.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
