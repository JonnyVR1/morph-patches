package com.google.android.gms.internal.ads;

import com.clevertap.android.sdk.Constants;
import java.util.Iterator;
import p153l.etw0;
import p153l.vrw0;

/* JADX INFO: loaded from: classes6.dex */
final class zzgcb extends zzgaf {
    final transient Object zza;

    public zzgcb(Object obj) {
        obj.getClass();
        this.zza = obj;
    }

    @Override // com.google.android.gms.internal.ads.zzfzv, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.zza.equals(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgaf, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzgaf, com.google.android.gms.internal.ads.zzfzv, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new vrw0(this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.zza.toString() + Constants.AES_SUFFIX;
    }

    @Override // com.google.android.gms.internal.ads.zzfzv
    public final int zza(Object[] objArr, int i) {
        objArr[i] = this.zza;
        return i + 1;
    }

    @Override // com.google.android.gms.internal.ads.zzgaf, com.google.android.gms.internal.ads.zzfzv
    public final zzgaa zzd() {
        return zzgaa.zzm(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgaf, com.google.android.gms.internal.ads.zzfzv
    /* JADX INFO: renamed from: zze */
    public final etw0 iterator() {
        return new vrw0(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfzv
    public final boolean zzf() {
        throw null;
    }
}
