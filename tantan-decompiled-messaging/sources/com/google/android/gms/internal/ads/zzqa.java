package com.google.android.gms.internal.ads;

import p149l.mhr0;

/* JADX INFO: loaded from: classes6.dex */
public final class zzqa extends Exception {
    public final int zza;
    public final boolean zzb;
    public final mhr0 zzc;

    public zzqa(int i, mhr0 mhr0Var, boolean z) {
        super("AudioTrack write failed: " + i);
        this.zzb = z;
        this.zza = i;
        this.zzc = mhr0Var;
    }
}
