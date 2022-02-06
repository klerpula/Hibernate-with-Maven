package model;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import repository.OccurenceRepository;

import javax.persistence.EntityManager;

public class Main {


    public static void main(String[] args) {
        SessionFactory sessionFactory =  new Configuration()
                .configure("db.xml")
                .buildSessionFactory();
EntityManager entityManager=  sessionFactory.createEntityManager();

        OccurenceRepository occurenceRepository= new OccurenceRepository(entityManager);
        System.out.println(occurenceRepository.findById(2));
    }

}
