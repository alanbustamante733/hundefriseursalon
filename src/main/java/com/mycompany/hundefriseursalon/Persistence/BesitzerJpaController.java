package com.mycompany.hundefriseursalon.Persistence;

import com.mycompany.hundefriseursalon.BusinessLogik.Besitzer;
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

public class BesitzerJpaController implements Serializable {

    public BesitzerJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;
    
    public BesitzerJpaController() {
        emf = Persistence.createEntityManagerFactory("HundefriseursalonPU");
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Besitzer besitzer) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(besitzer);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Besitzer besitzer) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            besitzer = em.merge(besitzer);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = besitzer.getId_Besitzer();
                if (findBesitzer(id) == null) {
                    throw new NonexistentEntityException("The besitzer with id " + id + " no longer exists.");
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
            Besitzer besitzer;
            try {
                besitzer = em.getReference(Besitzer.class, id);
                besitzer.getId_Besitzer();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The besitzer with id " + id + " no longer exists.", enfe);
            }
            em.remove(besitzer);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Besitzer> findBesitzerEntities() {
        return findBesitzerEntities(true, -1, -1);
    }

    public List<Besitzer> findBesitzerEntities(int maxResults, int firstResult) {
        return findBesitzerEntities(false, maxResults, firstResult);
    }

    private List<Besitzer> findBesitzerEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Besitzer.class));
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

    public Besitzer findBesitzer(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Besitzer.class, id);
        } finally {
            em.close();
        }
    }

    public int getBesitzerCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Besitzer> rt = cq.from(Besitzer.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
