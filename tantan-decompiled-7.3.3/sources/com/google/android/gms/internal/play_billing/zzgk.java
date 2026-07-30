package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;
import p153l.bqg0;
import p153l.buw0;
import p153l.c0y0;
import p153l.kpw0;
import p153l.srx0;
import p153l.ysw0;
import p153l.yze;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zzgk implements Iterable, Serializable {
    public static final zzgk zzb = new zzgi(srx0.f170386b);
    private int zza = 0;

    static {
        int i = kpw0.f128134a;
    }

    public static int zzh(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            bqg0.m105918a("Beginning index: ", i, " < 0");
            return 0;
        }
        if (i2 < i) {
            yze.m218021a("Beginning index larger than ending index: ", i, ", ", i2);
            return 0;
        }
        yze.m218021a("End index: ", i2, " >= ", i3);
        return 0;
    }

    public static zzgk zzj(byte[] bArr, int i, int i2) {
        zzh(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new zzgi(bArr2);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iZze = this.zza;
        if (iZze == 0) {
            int iZzd = zzd();
            iZze = zze(iZzd, 0, iZzd);
            if (iZze == 0) {
                iZze = 1;
            }
            this.zza = iZze;
        }
        return iZze;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new buw0(this);
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(zzd()), zzd() <= 50 ? c0y0.m107473a(this) : c0y0.m107473a(zzf(0, 47)).concat("..."));
    }

    public abstract byte zza(int i);

    public abstract byte zzb(int i);

    public abstract int zzd();

    public abstract int zze(int i, int i2, int i3);

    public abstract zzgk zzf(int i, int i2);

    public abstract void zzg(ysw0 ysw0Var) throws IOException;

    public final int zzi() {
        return this.zza;
    }
}
