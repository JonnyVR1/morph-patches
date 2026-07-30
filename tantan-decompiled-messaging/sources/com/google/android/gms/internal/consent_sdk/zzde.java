package com.google.android.gms.internal.consent_sdk;

import java.util.Iterator;
import p149l.n3u0;
import p149l.rpt0;

/* JADX INFO: loaded from: classes6.dex */
final class zzde extends zzdb {
    static final zzde zza;
    private static final Object[] zzd;
    final transient Object[] zzb;
    final transient Object[] zzc;
    private final transient int zze;
    private final transient int zzf;
    private final transient int zzg;

    static {
        Object[] objArr = new Object[0];
        zzd = objArr;
        zza = new zzde(objArr, 0, objArr, 0, 0);
    }

    public zzde(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.zzb = objArr;
        this.zze = i;
        this.zzc = objArr2;
        this.zzf = i2;
        this.zzg = i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.zzc;
            if (objArr.length != 0) {
                int iM180399a = rpt0.m180399a(obj.hashCode());
                while (true) {
                    int i = iM180399a & this.zzf;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iM180399a = i + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdb, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdb, com.google.android.gms.internal.consent_sdk.zzcx, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return zzg().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzcx
    public final int zza(Object[] objArr, int i) {
        System.arraycopy(this.zzb, 0, objArr, 0, this.zzg);
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzcx
    public final int zzb() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzcx
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdb, com.google.android.gms.internal.consent_sdk.zzcx
    /* JADX INFO: renamed from: zzd */
    public final n3u0 iterator() {
        return zzg().listIterator(0);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzcx
    public final Object[] zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdb
    public final zzda zzh() {
        return zzda.zzg(this.zzb, this.zzg);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdb
    public final boolean zzk() {
        return true;
    }
}
