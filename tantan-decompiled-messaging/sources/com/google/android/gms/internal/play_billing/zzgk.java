package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;
import p149l.egw0;
import p149l.mix0;
import p149l.sjw0;
import p149l.thg0;
import p149l.uye;
import p149l.vkw0;
import p149l.wqx0;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zzgk implements Iterable, Serializable {
    public static final zzgk zzb = new zzgi(mix0.f134048b);
    private int zza = 0;

    static {
        int i = egw0.f91264a;
    }

    public static int zzh(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            thg0.m188906a("Beginning index: ", i, " < 0");
            return 0;
        }
        if (i2 < i) {
            uye.m196285a("Beginning index larger than ending index: ", i, ", ", i2);
            return 0;
        }
        uye.m196285a("End index: ", i2, " >= ", i3);
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
        return new vkw0(this);
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(zzd()), zzd() <= 50 ? wqx0.m205072a(this) : wqx0.m205072a(zzf(0, 47)).concat("..."));
    }

    public abstract byte zza(int i);

    public abstract byte zzb(int i);

    public abstract int zzd();

    public abstract int zze(int i, int i2, int i3);

    public abstract zzgk zzf(int i, int i2);

    public abstract void zzg(sjw0 sjw0Var) throws IOException;

    public final int zzi() {
        return this.zza;
    }
}
