package com.google.android.gms.internal.ads;

import java.io.Serializable;
import p153l.ppw0;

/* JADX INFO: loaded from: classes6.dex */
final class zzfzw extends ppw0 implements Serializable {
    final Object zza;
    final Object zzb;

    public zzfzw(Object obj, Object obj2) {
        this.zza = obj;
        this.zzb = obj2;
    }

    @Override // p153l.ppw0, java.util.Map.Entry
    public final Object getKey() {
        return this.zza;
    }

    @Override // p153l.ppw0, java.util.Map.Entry
    public final Object getValue() {
        return this.zzb;
    }

    @Override // p153l.ppw0, java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
