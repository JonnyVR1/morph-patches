package com.google.android.gms.internal.ads;

import p153l.sqr0;

/* JADX INFO: loaded from: classes6.dex */
public final class zzqa extends Exception {
    public final int zza;
    public final boolean zzb;
    public final sqr0 zzc;

    public zzqa(int i, sqr0 sqr0Var, boolean z) {
        super("AudioTrack write failed: " + i);
        this.zzb = z;
        this.zza = i;
        this.zzc = sqr0Var;
    }
}
