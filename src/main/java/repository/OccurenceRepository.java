package repository;

import model.OccurenceEntity;

import javax.persistence.EntityManager;
import java.util.List;


public class OccurenceRepository {
    private final EntityManager entityManager;

    public OccurenceRepository(EntityManager entityManager) {
        this.entityManager = entityManager;

    }

    public OccurenceEntity findById(Integer id) {
        return entityManager.find(OccurenceEntity.class, id);
    }

    public OccurenceEntity findByName(String place) {
        return entityManager.createQuery("Select o From OccurenceEntity o where name= :", OccurenceEntity.class)
                .setParameter("name", place)
                .getSingleResult();
    }

    public List<OccurenceEntity> findByYear(Integer year) {
        return entityManager.createQuery("select o from OccurenceEntity o where year = :year"
                        , OccurenceEntity.class)
                .setParameter("year", year)
                .getResultList();
    }
}



