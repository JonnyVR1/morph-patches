package org.seamless.util.jpa;

import l.aag0;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class HibernateUtil {
    public static final Configuration configuration;
    public static final SessionFactory sessionFactory;

    static {
        try {
            Configuration configurationConfigure = new Configuration().configure();
            configuration = configurationConfigure;
            sessionFactory = configurationConfigure.buildSessionFactory();
        } catch (Throwable th) {
            aag0.a(th);
        }
    }

    public static Configuration getConfiguration() {
        return configuration;
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
