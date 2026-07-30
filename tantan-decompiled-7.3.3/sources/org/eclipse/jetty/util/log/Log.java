package org.eclipse.jetty.util.log;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.eclipse.jetty.util.C22074IO;
import org.eclipse.jetty.util.Loader;

/* JADX INFO: loaded from: classes2.dex */
public class Log {
    public static final String EXCEPTION = "EXCEPTION ";
    public static final String IGNORED = "IGNORED ";
    private static Logger LOG;
    public static boolean __ignored;
    private static boolean __initialized;
    public static String __logClass;
    private static final ConcurrentMap<String, Logger> __loggers = new ConcurrentHashMap();
    protected static Properties __props = new Properties();

    static {
        AccessController.doPrivileged(new PrivilegedAction<Object>() { // from class: org.eclipse.jetty.util.log.Log.1
            @Override // java.security.PrivilegedAction
            public Object run() throws Throwable {
                InputStream inputStreamOpenStream;
                URL resource = Log.class.getClassLoader().getResource("jetty-logging.properties");
                InputStream inputStream = null;
                if (resource != null) {
                    try {
                        inputStreamOpenStream = resource.openStream();
                        try {
                            try {
                                Log.__props.load(inputStreamOpenStream);
                            } catch (IOException e) {
                                e = e;
                                System.err.println("Unable to load " + resource);
                                e.printStackTrace(System.err);
                            }
                        } catch (Throwable th) {
                            th = th;
                            inputStream = inputStreamOpenStream;
                            C22074IO.close(inputStream);
                            throw th;
                        }
                    } catch (IOException e2) {
                        e = e2;
                        inputStreamOpenStream = null;
                    } catch (Throwable th2) {
                        th = th2;
                        C22074IO.close(inputStream);
                        throw th;
                    }
                    C22074IO.close(inputStreamOpenStream);
                }
                Enumeration<?> enumerationPropertyNames = System.getProperties().propertyNames();
                while (enumerationPropertyNames.hasMoreElements()) {
                    String str = (String) enumerationPropertyNames.nextElement();
                    String property = System.getProperty(str);
                    if (property != null) {
                        Log.__props.setProperty(str, property);
                    }
                }
                Log.__logClass = Log.__props.getProperty("org.eclipse.jetty.util.log.class", "org.eclipse.jetty.util.log.Slf4jLog");
                Log.__ignored = Boolean.parseBoolean(Log.__props.getProperty("org.eclipse.jetty.util.log.IGNORED", "false"));
                return null;
            }
        });
    }

    @Deprecated
    public static void debug(String str, Object obj) {
        if (initialized()) {
            LOG.debug(str, obj);
        }
    }

    @Deprecated
    public static Logger getLog() {
        initialized();
        return LOG;
    }

    public static Logger getLogger(String str) {
        if (!initialized()) {
            return null;
        }
        if (str == null) {
            return LOG;
        }
        Logger logger = __loggers.get(str);
        return logger == null ? LOG.getLogger(str) : logger;
    }

    public static Map<String, Logger> getLoggers() {
        return Collections.unmodifiableMap(__loggers);
    }

    public static ConcurrentMap<String, Logger> getMutableLoggers() {
        return __loggers;
    }

    public static Logger getRootLogger() {
        initialized();
        return LOG;
    }

    @Deprecated
    public static void ignore(Throwable th) {
        if (initialized()) {
            LOG.ignore(th);
        }
    }

    @Deprecated
    public static void info(String str, Object obj) {
        if (initialized()) {
            LOG.info(str, obj);
        }
    }

    private static void initStandardLogging(Throwable th) {
        if (th != null && __ignored) {
            th.printStackTrace();
        }
        if (LOG == null) {
            StdErrLog stdErrLog = new StdErrLog();
            LOG = stdErrLog;
            stdErrLog.debug("Logging to {} via {}", stdErrLog, StdErrLog.class.getName());
        }
    }

    public static boolean initialized() {
        boolean z = true;
        if (LOG != null) {
            return true;
        }
        synchronized (Log.class) {
            try {
                if (__initialized) {
                    if (LOG == null) {
                        z = false;
                    }
                    return z;
                }
                __initialized = true;
                try {
                    Class clsLoadClass = Loader.loadClass(Log.class, __logClass);
                    Logger logger = LOG;
                    if (logger == null || !logger.getClass().equals(clsLoadClass)) {
                        Logger logger2 = (Logger) clsLoadClass.newInstance();
                        LOG = logger2;
                        logger2.debug("Logging to {} via {}", logger2, clsLoadClass.getName());
                    }
                } catch (Throwable th) {
                    initStandardLogging(th);
                }
                return LOG != null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Deprecated
    public static boolean isDebugEnabled() {
        if (initialized()) {
            return LOG.isDebugEnabled();
        }
        return false;
    }

    public static boolean isIgnored() {
        return __ignored;
    }

    public static void setLog(Logger logger) {
        LOG = logger;
    }

    public static void setLogToParent(String str) {
        ClassLoader classLoader = Log.class.getClassLoader();
        if (classLoader.getParent() == null) {
            setLog(getLogger(str));
            return;
        }
        try {
            setLog(new LoggerLog(classLoader.getParent().loadClass("org.eclipse.jetty.util.log.Log").getMethod("getLogger", String.class).invoke(null, str)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Deprecated
    public static void warn(String str, Object obj) {
        if (initialized()) {
            LOG.warn(str, obj);
        }
    }

    @Deprecated
    public static void debug(String str) {
        if (initialized()) {
            LOG.debug(str, new Object[0]);
        }
    }

    @Deprecated
    public static void info(String str) {
        if (initialized()) {
            LOG.info(str, new Object[0]);
        }
    }

    @Deprecated
    public static void warn(String str) {
        if (initialized()) {
            LOG.warn(str, new Object[0]);
        }
    }

    @Deprecated
    public static void debug(Throwable th) {
        if (isDebugEnabled()) {
            LOG.debug(EXCEPTION, th);
        }
    }

    @Deprecated
    public static void info(String str, Object obj, Object obj2) {
        if (initialized()) {
            LOG.info(str, obj, obj2);
        }
    }

    @Deprecated
    public static void warn(String str, Object obj, Object obj2) {
        if (initialized()) {
            LOG.warn(str, obj, obj2);
        }
    }

    @Deprecated
    public static void debug(String str, Object obj, Object obj2) {
        if (initialized()) {
            LOG.debug(str, obj, obj2);
        }
    }

    @Deprecated
    public static void warn(String str, Throwable th) {
        if (initialized()) {
            LOG.warn(str, th);
        }
    }

    @Deprecated
    public static void warn(Throwable th) {
        if (initialized()) {
            LOG.warn(EXCEPTION, th);
        }
    }

    public static Logger getLogger(Class<?> cls) {
        return getLogger(cls.getName());
    }
}
