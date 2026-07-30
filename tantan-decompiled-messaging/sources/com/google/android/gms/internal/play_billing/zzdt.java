package com.google.android.gms.internal.play_billing;

import com.clevertap.android.sdk.Constants;
import java.util.Iterator;
import p149l.jnu0;
import p149l.rtt0;

/* JADX INFO: loaded from: classes6.dex */
final class zzdt extends zzcv {
    final transient Object zza;

    public zzdt(Object obj) {
        obj.getClass();
        this.zza = obj;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcj, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.zza.equals(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.zzcv, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // com.google.android.gms.internal.play_billing.zzcv, com.google.android.gms.internal.play_billing.zzcj, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new rtt0(this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.zza.toString() + Constants.AES_SUFFIX;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcj
    public final int zza(Object[] objArr, int i) {
        objArr[0] = this.zza;
        return 1;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcv, com.google.android.gms.internal.play_billing.zzcj
    public final zzco zzd() {
        return zzco.zzm(this.zza);
    }

    @Override // com.google.android.gms.internal.play_billing.zzcv, com.google.android.gms.internal.play_billing.zzcj
    /* JADX INFO: renamed from: zze */
    public final jnu0 iterator() {
        return new rtt0(this.zza);
    }

    @Override // com.google.android.gms.internal.play_billing.zzcj
    public final boolean zzf() {
        throw null;
    }
}
