package org.seamless.util;

import p153l.wg3;

/* JADX INFO: loaded from: classes3.dex */
public class Exceptions {
    public static Throwable unwrap(Throwable th) throws IllegalArgumentException {
        if (th == null) {
            wg3.m206174a("Cannot unwrap null throwable");
            return null;
        }
        Throwable th2 = th;
        while (th != null) {
            th2 = th;
            th = th.getCause();
        }
        return th2;
    }
}
