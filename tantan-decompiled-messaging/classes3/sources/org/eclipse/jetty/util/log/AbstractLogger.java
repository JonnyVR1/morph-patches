package org.eclipse.jetty.util.log;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class AbstractLogger implements Logger {
    private static boolean isBlank(String str) {
        if (str == null) {
            return true;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isWhitespace(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    @Override // org.eclipse.jetty.util.log.Logger
    public final Logger getLogger(String str) {
        if (isBlank(str)) {
            return this;
        }
        String name = getName();
        if (!isBlank(name) && Log.getRootLogger() != this) {
            str = name + "." + str;
        }
        Logger logger = Log.getLoggers().get(str);
        if (logger != null) {
            return logger;
        }
        Logger loggerNewLogger = newLogger(str);
        Logger loggerPutIfAbsent = Log.getMutableLoggers().putIfAbsent(str, loggerNewLogger);
        return loggerPutIfAbsent == null ? loggerNewLogger : loggerPutIfAbsent;
    }

    public abstract Logger newLogger(String str);
}
