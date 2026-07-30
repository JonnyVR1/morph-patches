package com.google.android.gms.internal.play_billing;

import java.io.Serializable;
import java.util.Set;
import p149l.y9s0;

/* JADX INFO: loaded from: classes6.dex */
public final class zzct extends y9s0 implements Serializable {
    private static final zzct zza;
    private static final zzct zzb;
    private final transient zzco zzc;

    static {
        int i = zzco.zzd;
        zza = new zzct(zzdk.zza);
        zzb = new zzct(zzco.zzm(zzdh.zza()));
    }

    public zzct(zzco zzcoVar) {
        this.zzc = zzcoVar;
    }

    public static zzct zza() {
        return zzb;
    }

    public static zzct zzb() {
        return zza;
    }

    @Override // p149l.l7u0
    public final /* bridge */ /* synthetic */ Set zzc() {
        return this.zzc.isEmpty() ? zzdq.zza : new zzdr(this.zzc, zzdg.zza);
    }
}
