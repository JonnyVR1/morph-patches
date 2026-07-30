package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.util.Arrays;
import p153l.iig0;
import p153l.l710;
import p153l.xpg0;

/* JADX INFO: loaded from: classes7.dex */
public final class zzawo {
    private static final zzawo zza = new zzawo(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzawo(int i, int[] iArr, Object[] objArr, boolean z) {
        this.zze = -1;
        this.zzb = i;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z;
    }

    public static zzawo zzc() {
        return zza;
    }

    public static zzawo zze(zzawo zzawoVar, zzawo zzawoVar2) {
        int i = zzawoVar.zzb + zzawoVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzawoVar.zzc, i);
        System.arraycopy(zzawoVar2.zzc, 0, iArrCopyOf, zzawoVar.zzb, zzawoVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zzawoVar.zzd, i);
        System.arraycopy(zzawoVar2.zzd, 0, objArrCopyOf, zzawoVar.zzb, zzawoVar2.zzb);
        return new zzawo(i, iArrCopyOf, objArrCopyOf, true);
    }

    public static zzawo zzf() {
        return new zzawo(0, new int[8], new Object[8], true);
    }

    private final void zzm(int i) {
        int[] iArr = this.zzc;
        if (i > iArr.length) {
            int i2 = this.zzb;
            int i3 = i2 + (i2 / 2);
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i);
            this.zzd = Arrays.copyOf(this.zzd, i);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzawo)) {
            return false;
        }
        zzawo zzawoVar = (zzawo) obj;
        int i = this.zzb;
        if (i == zzawoVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzawoVar.zzc;
            for (int i2 = 0; i2 < i; i2++) {
                if (iArr[i2] == iArr2[i2]) {
                }
            }
            Object[] objArr = this.zzd;
            Object[] objArr2 = zzawoVar.zzd;
            int i3 = this.zzb;
            for (int i4 = 0; i4 < i3; i4++) {
                if (objArr[i4].equals(objArr2[i4])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzb;
        int i2 = i + 527;
        int[] iArr = this.zzc;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = ((i2 * 31) + i3) * 31;
        Object[] objArr = this.zzd;
        int i6 = this.zzb;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }

    public final int zza() {
        int iZzB;
        int iZzC;
        int iZzB2;
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.zzb; i3++) {
            int i4 = this.zzc[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 == 1) {
                    ((Long) this.zzd[i3]).getClass();
                    iZzB2 = zzasx.zzB(i5 << 3) + 8;
                } else if (i6 == 2) {
                    int i7 = i5 << 3;
                    zzask zzaskVar = (zzask) this.zzd[i3];
                    int iZzB3 = zzasx.zzB(i7);
                    int iZzd = zzaskVar.zzd();
                    iZzB2 = iZzB3 + zzasx.zzB(iZzd) + iZzd;
                } else if (i6 == 3) {
                    int iZzB4 = zzasx.zzB(i5 << 3);
                    iZzB = iZzB4 + iZzB4;
                    iZzC = ((zzawo) this.zzd[i3]).zza();
                } else {
                    if (i6 != 5) {
                        xpg0.m212648a(zzauf.zza());
                        return 0;
                    }
                    ((Integer) this.zzd[i3]).getClass();
                    iZzB2 = zzasx.zzB(i5 << 3) + 4;
                }
                i2 += iZzB2;
            } else {
                int i8 = i5 << 3;
                long jLongValue = ((Long) this.zzd[i3]).longValue();
                iZzB = zzasx.zzB(i8);
                iZzC = zzasx.zzC(jLongValue);
            }
            iZzB2 = iZzB + iZzC;
            i2 += iZzB2;
        }
        this.zze = i2;
        return i2;
    }

    public final int zzb() {
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int iZzB = 0;
        for (int i2 = 0; i2 < this.zzb; i2++) {
            int i3 = this.zzc[i2] >>> 3;
            zzask zzaskVar = (zzask) this.zzd[i2];
            int iZzB2 = zzasx.zzB(8);
            int iZzB3 = zzasx.zzB(16) + zzasx.zzB(i3);
            int iZzB4 = zzasx.zzB(24);
            int iZzd = zzaskVar.zzd();
            iZzB += iZzB2 + iZzB2 + iZzB3 + iZzB4 + zzasx.zzB(iZzd) + iZzd;
        }
        this.zze = iZzB;
        return iZzB;
    }

    public final zzawo zzd(zzawo zzawoVar) {
        if (zzawoVar.equals(zza)) {
            return this;
        }
        zzg();
        int i = this.zzb + zzawoVar.zzb;
        zzm(i);
        System.arraycopy(zzawoVar.zzc, 0, this.zzc, this.zzb, zzawoVar.zzb);
        System.arraycopy(zzawoVar.zzd, 0, this.zzd, this.zzb, zzawoVar.zzb);
        this.zzb = i;
        return this;
    }

    public final void zzg() {
        if (this.zzf) {
            return;
        }
        l710.m153113a();
    }

    public final void zzh() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    public final void zzi(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            zzavh.zzb(sb, i, String.valueOf(this.zzc[i2] >>> 3), this.zzd[i2]);
        }
    }

    public final void zzj(int i, Object obj) {
        zzg();
        zzm(this.zzb + 1);
        int[] iArr = this.zzc;
        int i2 = this.zzb;
        iArr[i2] = i;
        this.zzd[i2] = obj;
        this.zzb = i2 + 1;
    }

    public final void zzk(zzasy zzasyVar) throws IOException {
        for (int i = 0; i < this.zzb; i++) {
            zzasyVar.zzw(this.zzc[i] >>> 3, this.zzd[i]);
        }
    }

    public final void zzl(zzasy zzasyVar) throws IOException {
        if (this.zzb != 0) {
            for (int i = 0; i < this.zzb; i++) {
                int i2 = this.zzc[i];
                Object obj = this.zzd[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    zzasyVar.zzt(i4, ((Long) obj).longValue());
                } else if (i3 == 1) {
                    zzasyVar.zzm(i4, ((Long) obj).longValue());
                } else if (i3 == 2) {
                    zzasyVar.zzd(i4, (zzask) obj);
                } else if (i3 == 3) {
                    zzasyVar.zzF(i4);
                    ((zzawo) obj).zzl(zzasyVar);
                    zzasyVar.zzh(i4);
                } else {
                    if (i3 != 5) {
                        iig0.m140070a(zzauf.zza());
                        return;
                    }
                    zzasyVar.zzk(i4, ((Integer) obj).intValue());
                }
            }
        }
    }

    private zzawo() {
        this(0, new int[8], new Object[8], true);
    }
}
