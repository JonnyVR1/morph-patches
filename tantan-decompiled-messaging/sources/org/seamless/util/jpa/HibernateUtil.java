package org.seamless.util.jpa;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import p149l.aag0;

/* JADX INFO: loaded from: classes3.dex */
public class HibernateUtil {
    public static final Configuration configuration;
    public static final SessionFactory sessionFactory;

    static {
        try {
            Configuration configurationConfigure = new Configuration().configure();
            configuration = configurationConfigure;
            sessionFactory = configurationConfigure.buildSessionFactory();
        } catch (Throwable th) {
            aag0.m95543a(th);
        }
    }

    public static Configuration getConfiguration() {
        return configuration;
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
