package org.eclipse.jetty.util.log;

import org.slf4j.LoggerFactory;
import org.slf4j.spi.LocationAwareLogger;

/* JADX INFO: loaded from: classes2.dex */
public class Slf4jLog extends AbstractLogger {
    private final org.slf4j.Logger _logger;

    public Slf4jLog(String str) {
        org.slf4j.Logger logger = LoggerFactory.getLogger(str);
        if (logger instanceof LocationAwareLogger) {
            this._logger = new JettyAwareLogger((LocationAwareLogger) logger);
        } else {
            this._logger = logger;
        }
    }

    @Override // org.eclipse.jetty.util.log.Logger
    public void debug(String str, Object... objArr) {
        this._logger.debug(str, objArr);
    }

    @Override // org.eclipse.jetty.util.log.Logger
    public String getName() {
        return this._logger.getName();
    }

    @Override // org.eclipse.jetty.util.log.Logger
    public void ignore(Throwable th) {
        if (Log.isIgnored()) {
            warn(Log.IGNORED, th);
        }
    }

    @Override // org.eclipse.jetty.util.log.Logger
    public void info(String str, Object... objArr) {
        this._logger.info(str, objArr);
    }

    @Override // org.eclipse.jetty.util.log.Logger
    public boolean isDebugEnabled() {
        return this._logger.isDebugEnabled();
    }

    @Override // org.eclipse.jetty.util.log.AbstractLogger
    public Logger newLogger(String str) {
        return new Slf4jLog(str);
    }

    @Override // org.eclipse.jetty.util.log.Logger
    public void setDebugEnabled(boolean z) {
        warn("setDebugEnabled not implemented", null, null);
    }

    public String toString() {
        return this._logger.toString();
    }

    @Override // org.eclipse.jetty.util.log.Logger
    public void warn(String str, Object... objArr) {
        this._logger.warn(str, objArr);
    }

    @Override // org.eclipse.jetty.util.log.Logger
    public void debug(Throwable th) {
        debug("", th);
    }

    @Override // org.eclipse.jetty.util.log.Logger
    public void info(Throwable th) {
        info("", th);
    }

    @Override // org.eclipse.jetty.util.log.Logger
    public void warn(Throwable th) {
        warn("", th);
    }

    @Override // org.eclipse.jetty.util.log.Logger
    public void debug(String str, Throwable th) {
        this._logger.debug(str, th);
    }

    @Override // org.eclipse.jetty.util.log.Logger
    public void info(String str, Throwable th) {
        this._logger.info(str, th);
    }

    @Override // org.eclipse.jetty.util.log.Logger
    public void warn(String str, Throwable th) {
        this._logger.warn(str, th);
    }

    public Slf4jLog() throws Exception {
        this("org.eclipse.jetty.util.log");
    }
}
