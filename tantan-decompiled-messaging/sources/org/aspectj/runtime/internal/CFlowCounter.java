package org.aspectj.runtime.internal;

import com.google.firebase.crashlytics.internal.common.IdManager;
import com.google.firebase.ktx.BuildConfig;
import org.aspectj.runtime.internal.cflowstack.ThreadCounter;
import org.aspectj.runtime.internal.cflowstack.ThreadStackFactory;
import org.aspectj.runtime.internal.cflowstack.ThreadStackFactoryImpl;
import org.aspectj.runtime.internal.cflowstack.ThreadStackFactoryImpl11;

/* JADX INFO: loaded from: classes2.dex */
public class CFlowCounter {
    private static ThreadStackFactory tsFactory;
    private ThreadCounter flowHeightHandler = tsFactory.getNewThreadCounter();

    static {
        selectFactoryForVMVersion();
    }

    private static String getSystemPropertyWithoutSecurityException(String str, String str2) {
        try {
            return System.getProperty(str, str2);
        } catch (SecurityException unused) {
            return str2;
        }
    }

    private static ThreadStackFactory getThreadLocalStackFactory() {
        return new ThreadStackFactoryImpl();
    }

    private static ThreadStackFactory getThreadLocalStackFactoryFor11() {
        return new ThreadStackFactoryImpl11();
    }

    public static String getThreadStackFactoryClassName() {
        return tsFactory.getClass().getName();
    }

    private static void selectFactoryForVMVersion() {
        String systemPropertyWithoutSecurityException = getSystemPropertyWithoutSecurityException("aspectj.runtime.cflowstack.usethreadlocal", BuildConfig.VERSION_NAME);
        if (!systemPropertyWithoutSecurityException.equals(BuildConfig.VERSION_NAME) ? !(systemPropertyWithoutSecurityException.equals("yes") || systemPropertyWithoutSecurityException.equals("true")) : System.getProperty("java.class.version", IdManager.DEFAULT_VERSION_NAME).compareTo("46.0") < 0) {
            tsFactory = getThreadLocalStackFactory();
        } else {
            tsFactory = getThreadLocalStackFactoryFor11();
        }
    }

    public void dec() {
        this.flowHeightHandler.dec();
        if (this.flowHeightHandler.isNotZero()) {
            return;
        }
        this.flowHeightHandler.removeThreadCounter();
    }

    public void inc() {
        this.flowHeightHandler.inc();
    }

    public boolean isValid() {
        return this.flowHeightHandler.isNotZero();
    }
}
