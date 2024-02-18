package com.project.bookyourticket.Util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.springframework.beans.factory.annotation.Autowired;

public class HibernateUtil {
    @Autowired
    private static StandardServiceRegistry standardServiceRegistry;
    @Autowired
    private static SessionFactory sessionFactory;

    static{
        if (sessionFactory == null) try {
            standardServiceRegistry = new StandardServiceRegistryBuilder()
                    .configure()
                    .build();
            MetadataSources metadataSources = new MetadataSources(standardServiceRegistry);
            Metadata metadata = metadataSources.getMetadataBuilder().build();
            sessionFactory = metadata.getSessionFactoryBuilder().build();
        } catch (Exception e) {
            e.printStackTrace();
            if (standardServiceRegistry != null) {
                StandardServiceRegistryBuilder.destroy(standardServiceRegistry);
            }
        }
    }
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
