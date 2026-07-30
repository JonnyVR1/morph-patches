package org.eclipse.jetty.servlet.listener;

import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import javax.servlet.ServletContextEvent;
import org.eclipse.jetty.util.Loader;
import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.Logger;
import p153l.cse0;

/* JADX INFO: loaded from: classes2.dex */
public class ELContextCleaner implements cse0 {
    private static final Logger LOG = Log.getLogger((Class<?>) ELContextCleaner.class);

    @Override // p153l.cse0
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        try {
            purgeEntries(getField(Loader.loadClass(getClass(), "javax.el.BeanELResolver")));
            LOG.info("javax.el.BeanELResolver purged", new Object[0]);
        } catch (ClassNotFoundException unused) {
        } catch (IllegalAccessException e) {
            LOG.warn("Cannot purge classes from javax.el.BeanELResolver", e);
        } catch (IllegalArgumentException e2) {
            LOG.warn("Cannot purge classes from javax.el.BeanELResolver", e2);
        } catch (NoSuchFieldException unused2) {
            LOG.info("Not cleaning cached beans: no such field javax.el.BeanELResolver.properties", new Object[0]);
        } catch (SecurityException e3) {
            LOG.warn("Cannot purge classes from javax.el.BeanELResolver", e3);
        }
    }

    @Override // p153l.cse0
    public void contextInitialized(ServletContextEvent servletContextEvent) {
    }

    public Field getField(Class cls) throws NoSuchFieldException, SecurityException {
        if (cls == null) {
            return null;
        }
        return cls.getDeclaredField("properties");
    }

    public void purgeEntries(Field field) throws IllegalAccessException, IllegalArgumentException {
        if (field == null) {
            return;
        }
        if (!field.isAccessible()) {
            field.setAccessible(true);
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) field.get(null);
        if (concurrentHashMap == null) {
            return;
        }
        Iterator it = concurrentHashMap.keySet().iterator();
        while (it.hasNext()) {
            Class cls = (Class) it.next();
            Logger logger = LOG;
            logger.info("Clazz: " + cls + " loaded by " + cls.getClassLoader(), new Object[0]);
            if (Thread.currentThread().getContextClassLoader().equals(cls.getClassLoader())) {
                it.remove();
                logger.info("removed", new Object[0]);
            } else {
                logger.info("not removed: contextclassloader=" + Thread.currentThread().getContextClassLoader() + "clazz's classloader=" + cls.getClassLoader(), new Object[0]);
            }
        }
    }
}
