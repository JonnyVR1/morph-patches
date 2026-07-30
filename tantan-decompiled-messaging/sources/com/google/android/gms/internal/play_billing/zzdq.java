package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import p149l.h5t0;
import p149l.jnu0;

/* JADX INFO: loaded from: classes6.dex */
final class zzdq extends zzcv {
    static final zzdq zza;
    private static final Object[] zzd;
    final transient Object[] zzb;
    final transient Object[] zzc;
    private final transient int zze;
    private final transient int zzf;
    private final transient int zzg;

    static {
        Object[] objArr = new Object[0];
        zzd = objArr;
        zza = new zzdq(objArr, 0, objArr, 0, 0);
    }

    public zzdq(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.zzb = objArr;
        this.zze = i;
        this.zzc = objArr2;
        this.zzf = i2;
        this.zzg = i3;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcj, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.zzc;
            if (objArr.length != 0) {
                int iM129457a = h5t0.m129457a(obj.hashCode());
                while (true) {
                    int i = iM129457a & this.zzf;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iM129457a = i + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcv, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcv, com.google.android.gms.internal.play_billing.zzcj, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return zzd().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcj
    public final int zza(Object[] objArr, int i) {
        System.arraycopy(this.zzb, 0, objArr, 0, this.zzg);
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcj
    public final int zzb() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcj
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcv, com.google.android.gms.internal.play_billing.zzcj
    /* JADX INFO: renamed from: zze */
    public final jnu0 iterator() {
        return zzd().listIterator(0);
    }

    @Override // com.google.android.gms.internal.play_billing.zzcj
    public final boolean zzf() {
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcj
    public final Object[] zzg() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcv
    public final zzco zzi() {
        return zzco.zzj(this.zzb, this.zzg);
    }

    @Override // com.google.android.gms.internal.play_billing.zzcv
    public final boolean zzk() {
        return true;
    }
}
