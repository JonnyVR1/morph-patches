package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;
import p153l.bqg0;
import p153l.bwx0;
import p153l.exx0;
import p153l.i2y0;
import p153l.rwx0;
import p153l.vvx0;
import p153l.wey0;
import p153l.wvx0;
import p153l.yze;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zzik implements Serializable, Iterable<Byte> {
    public static final zzik zza = new zziv(i2y0.f112679b);
    private static final rwx0 zzb = new exx0();
    private int zzc = 0;

    static {
        new wvx0();
    }

    public static int zza(int i, int i2, int i3) {
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

    public static zzik zzb(byte[] bArr) {
        return new zziv(bArr);
    }

    public static C2364q0 zzc(int i) {
        return new C2364q0(i);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iZzb = this.zzc;
        if (iZzb == 0) {
            int iZzb2 = zzb();
            iZzb = zzb(iZzb2, 0, iZzb2);
            if (iZzb == 0) {
                iZzb = 1;
            }
            this.zzc = iZzb;
        }
        return iZzb;
    }

    @Override // java.lang.Iterable
    public /* synthetic */ Iterator<Byte> iterator() {
        return new bwx0(this);
    }

    public final String toString() {
        String strM206040a;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        Integer numValueOf = Integer.valueOf(zzb());
        if (zzb() <= 50) {
            strM206040a = wey0.m206040a(this);
        } else {
            strM206040a = wey0.m206040a(zza(0, 47)) + "...";
        }
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", hexString, numValueOf, strM206040a);
    }

    public abstract byte zza(int i);

    public abstract zzik zza(int i, int i2);

    public abstract void zza(vvx0 vvx0Var) throws IOException;

    public abstract byte zzb(int i);

    public abstract int zzb();

    public abstract int zzb(int i, int i2, int i3);

    public static /* synthetic */ int zza(byte b) {
        return b & 255;
    }

    public final int zza() {
        return this.zzc;
    }

    public static zzik zza(byte[] bArr) {
        return zza(bArr, 0, bArr.length);
    }

    public static zzik zza(byte[] bArr, int i, int i2) {
        zza(i, i + i2, bArr.length);
        return new zziv(zzb.mo123118a(bArr, i, i2));
    }

    public static zzik zza(String str) {
        return new zziv(str.getBytes(i2y0.f112678a));
    }
}
