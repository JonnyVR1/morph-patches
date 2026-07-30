package com.google.android.gms.internal.play_billing;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import p153l.ses0;

/* JADX INFO: loaded from: classes6.dex */
final class zzcm extends zzco {
    private final transient zzco zza;

    public zzcm(zzco zzcoVar) {
        this.zza = zzcoVar;
    }

    private final int zzp(int i) {
        return (this.zza.size() - 1) - i;
    }

    @Override // com.google.android.gms.internal.play_billing.zzco, com.google.android.gms.internal.play_billing.zzcj, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.zza.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        ses0.m185566a(i, this.zza.size(), FirebaseAnalytics.Param.INDEX);
        return this.zza.get(zzp(i));
    }

    @Override // com.google.android.gms.internal.play_billing.zzco, java.util.List
    public final int indexOf(Object obj) {
        int iLastIndexOf = this.zza.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return zzp(iLastIndexOf);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.play_billing.zzco, java.util.List
    public final int lastIndexOf(Object obj) {
        int iIndexOf = this.zza.indexOf(obj);
        if (iIndexOf >= 0) {
            return zzp(iIndexOf);
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.play_billing.zzco, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzcj
    public final boolean zzf() {
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.play_billing.zzco
    public final zzco zzh() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.play_billing.zzco
    /* JADX INFO: renamed from: zzi */
    public final zzco subList(int i, int i2) {
        ses0.m185570e(i, i2, this.zza.size());
        zzco zzcoVar = this.zza;
        return zzcoVar.subList(zzcoVar.size() - i2, this.zza.size() - i).zzh();
    }
}
