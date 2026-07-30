package com.google.android.gms.internal.ads;

import p153l.t7x0;

/* JADX INFO: loaded from: classes6.dex */
public final class zzgpl extends RuntimeException {
    public zzgpl(String str) {
        super(str);
    }

    public static Object zza(t7x0 t7x0Var) {
        try {
            return t7x0Var.zza();
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
