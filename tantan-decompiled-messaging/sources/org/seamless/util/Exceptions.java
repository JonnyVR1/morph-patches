package org.seamless.util;

import p149l.ig3;

/* JADX INFO: loaded from: classes3.dex */
public class Exceptions {
    public static Throwable unwrap(Throwable th) throws IllegalArgumentException {
        if (th == null) {
            ig3.m135964a("Cannot unwrap null throwable");
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
