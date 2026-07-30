package com.google.android.gms.internal.consent_sdk;

import com.clevertap.android.sdk.Constants;
import java.util.Iterator;
import p149l.n3u0;
import p149l.nyt0;

/* JADX INFO: loaded from: classes6.dex */
final class zzdf extends zzdb {
    final transient Object zza;

    public zzdf(Object obj) {
        obj.getClass();
        this.zza = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.zza.equals(obj);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdb, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdb, com.google.android.gms.internal.consent_sdk.zzcx, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new nyt0(this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.zza.toString() + Constants.AES_SUFFIX;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzcx
    public final int zza(Object[] objArr, int i) {
        objArr[0] = this.zza;
        return 1;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdb, com.google.android.gms.internal.consent_sdk.zzcx
    /* JADX INFO: renamed from: zzd */
    public final n3u0 iterator() {
        return new nyt0(this.zza);
    }
}
