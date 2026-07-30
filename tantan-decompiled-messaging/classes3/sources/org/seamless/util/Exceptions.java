package org.seamless.util;

import l.ig3;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class Exceptions {
    public static Throwable unwrap(Throwable th) throws IllegalArgumentException {
        if (th == null) {
            ig3.a("Cannot unwrap null throwable");
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
