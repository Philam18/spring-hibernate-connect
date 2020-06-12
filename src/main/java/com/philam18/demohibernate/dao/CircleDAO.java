package com.philam18.demohibernate.dao;

import javax.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("CircleDAO")
public class CircleDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return this.sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public int getCircleCount() {
        Session session = getSessionFactory().openSession();
        String hql = "select count(*) from Circle";
        TypedQuery<Long> query = session.createQuery(hql, Long.class);
        return query.getSingleResult().intValue();
    }


}