package com.google.android.libraries.places.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class zzbvo extends zzbbo {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f10600a = 0;

    @Override // com.google.android.libraries.places.internal.zzbbb
    public final zzbbm zza(zzbbd zzbbdVar) {
        return new zzbvn(zzbbdVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbbo
    public final int zzb() {
        return 5;
    }

    @Override // com.google.android.libraries.places.internal.zzbbo
    public final zzbcp zzc(Map map) {
        return zzbcp.zza("no service config");
    }

    @Override // com.google.android.libraries.places.internal.zzbbo
    public final String zzd() {
        return "round_robin";
    }

    @Override // com.google.android.libraries.places.internal.zzbbo
    public final boolean zze() {
        return true;
    }
}
