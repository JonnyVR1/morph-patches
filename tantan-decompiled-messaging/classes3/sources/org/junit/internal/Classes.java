package org.junit.internal;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class Classes {
    public static Class<?> getClass(String str) throws ClassNotFoundException {
        return Class.forName(str, true, Thread.currentThread().getContextClassLoader());
    }
}
