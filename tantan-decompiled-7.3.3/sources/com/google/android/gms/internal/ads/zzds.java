package com.google.android.gms.internal.ads;

import p153l.mqu0;

/* JADX INFO: loaded from: classes6.dex */
public final class zzds extends Exception {
    public final mqu0 zza;

    public zzds(String str, mqu0 mqu0Var) {
        super("Unhandled input format: ".concat(String.valueOf(mqu0Var)));
        this.zza = mqu0Var;
    }
}
