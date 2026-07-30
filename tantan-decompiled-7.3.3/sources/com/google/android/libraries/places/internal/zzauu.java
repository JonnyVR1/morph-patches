package com.google.android.libraries.places.internal;

import com.google.android.gms.common.api.Api;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import p153l.fig0;
import p153l.jym;
import p153l.kym;

/* JADX INFO: loaded from: classes7.dex */
final class zzauu extends zzarw implements RandomAccess, zzaub, zzavo {
    private static final zzauu zza = new zzauu(new long[0], 0, false);
    private long[] zzb;
    private int zzc;

    public zzauu() {
        this(new long[10], 0, true);
    }

    public static zzauu zzf() {
        return zza;
    }

    private final String zzh(int i) {
        return "Index:" + i + ", Size:" + this.zzc;
    }

    private final void zzi(int i) {
        if (i < 0 || i >= this.zzc) {
            kym.m151996a(zzh(i));
        }
    }

    @Override // com.google.android.libraries.places.internal.zzarw, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        long jLongValue = ((Long) obj).longValue();
        zza();
        if (i < 0 || i > (i2 = this.zzc)) {
            kym.m151996a(zzh(i));
            return;
        }
        int i3 = i + 1;
        long[] jArr = this.zzb;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i3, i2 - i);
        } else {
            long[] jArr2 = new long[((i2 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.zzb, i, jArr2, i3, this.zzc - i);
            this.zzb = jArr2;
        }
        this.zzb[i] = jLongValue;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.libraries.places.internal.zzarw, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        byte[] bArr = zzaud.zzd;
        collection.getClass();
        if (!(collection instanceof zzauu)) {
            return super.addAll(collection);
        }
        zzauu zzauuVar = (zzauu) collection;
        int i = zzauuVar.zzc;
        if (i == 0) {
            return false;
        }
        int i2 = this.zzc;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i2 < i) {
            jym.m147603a();
            return false;
        }
        int i3 = i2 + i;
        long[] jArr = this.zzb;
        if (i3 > jArr.length) {
            this.zzb = Arrays.copyOf(jArr, i3);
        }
        System.arraycopy(zzauuVar.zzb, 0, this.zzb, this.zzc, zzauuVar.zzc);
        this.zzc = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.libraries.places.internal.zzarw, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzauu)) {
            return super.equals(obj);
        }
        zzauu zzauuVar = (zzauu) obj;
        if (this.zzc != zzauuVar.zzc) {
            return false;
        }
        long[] jArr = zzauuVar.zzb;
        for (int i = 0; i < this.zzc; i++) {
            if (this.zzb[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        zzi(i);
        return Long.valueOf(this.zzb[i]);
    }

    @Override // com.google.android.libraries.places.internal.zzarw, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.zzc; i2++) {
            long j = this.zzb[i2];
            byte[] bArr = zzaud.zzd;
            i = (i * 31) + ((int) (j ^ (j >>> 32)));
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i = this.zzc;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.zzb[i2] == jLongValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.libraries.places.internal.zzarw, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        zza();
        zzi(i);
        long[] jArr = this.zzb;
        long j = jArr[i];
        int i2 = this.zzc;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        zza();
        if (i2 < i) {
            kym.m151996a("toIndex < fromIndex");
            return;
        }
        long[] jArr = this.zzb;
        System.arraycopy(jArr, i2, jArr, i, this.zzc - i2);
        this.zzc -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.libraries.places.internal.zzarw, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        zza();
        zzi(i);
        long[] jArr = this.zzb;
        long j = jArr[i];
        jArr[i] = jLongValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.internal.zzauc
    public final /* bridge */ /* synthetic */ zzauc zzd(int i) {
        if (i >= this.zzc) {
            return new zzauu(Arrays.copyOf(this.zzb, i), this.zzc, true);
        }
        fig0.m125680a();
        return null;
    }

    public final long zze(int i) {
        zzi(i);
        return this.zzb[i];
    }

    public final void zzg(long j) {
        zza();
        int i = this.zzc;
        long[] jArr = this.zzb;
        if (i == jArr.length) {
            long[] jArr2 = new long[((i * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.zzb = jArr2;
        }
        long[] jArr3 = this.zzb;
        int i2 = this.zzc;
        this.zzc = i2 + 1;
        jArr3[i2] = j;
    }

    private zzauu(long[] jArr, int i, boolean z) {
        super(z);
        this.zzb = jArr;
        this.zzc = i;
    }

    @Override // com.google.android.libraries.places.internal.zzarw, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzg(((Long) obj).longValue());
        return true;
    }
}
