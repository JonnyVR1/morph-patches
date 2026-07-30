package org.slf4j.spi;

import org.slf4j.ILoggerFactory;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public interface LoggerFactoryBinder {
    ILoggerFactory getLoggerFactory();

    String getLoggerFactoryClassStr();
}
