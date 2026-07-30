package com.google.android.gms.internal.ads;

import p149l.nyw0;

/* JADX INFO: loaded from: classes6.dex */
public final class zzgpl extends RuntimeException {
    public zzgpl(String str) {
        super(str);
    }

    public static Object zza(nyw0 nyw0Var) {
        try {
            return nyw0Var.zza();
        } catch (Exception e) {
            throw new zzgpl(e);
        }
    }

    public zzgpl(String str, Throwable th) {
        super(str, th);
    }

    public zzgpl(Throwable th) {
        super(th);
    }
}
