package com.google.android.gms.internal.ads;

import java.io.Serializable;
import p149l.yew0;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zzfwz implements Serializable {
    public static zzfwz zzc() {
        return zzfwi.zza;
    }

    public static zzfwz zzd(Object obj) {
        return obj == null ? zzfwi.zza : new zzfxj(obj);
    }

    public abstract zzfwz zza(yew0 yew0Var);

    public abstract Object zzb(Object obj);
}
