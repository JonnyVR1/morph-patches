package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;
import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import org.slf4j.Marker;
import p149l.aax0;
import p149l.d7x0;
import p149l.dqi0;
import p149l.e7x0;
import p149l.f7x0;
import p149l.h7x0;
import p149l.hcx0;
import p149l.l7x0;
import p149l.q7x0;
import p149l.rq3;
import p149l.sq3;
import p149l.thg0;
import p149l.uye;
import p149l.w6x0;
import p149l.yfq0;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zzgyl implements Iterable, Serializable {
    private static final Comparator zza;
    public static final zzgyl zzb = new zzgyh(aax0.f68610d);
    private static final l7x0 zzd;
    private int zzc = 0;

    static {
        int i = w6x0.f185008a;
        zzd = new l7x0(null);
        zza = new f7x0();
    }

    private static zzgyl zzc(Iterator it, int i) {
        if (i <= 0) {
            dqi0.m113073a("length (%s) must be >= 1", new Object[]{Integer.valueOf(i)});
            return null;
        }
        if (i == 1) {
            return (zzgyl) it.next();
        }
        int i2 = i >>> 1;
        zzgyl zzgylVarZzc = zzc(it, i2);
        zzgyl zzgylVarZzc2 = zzc(it, i - i2);
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - zzgylVarZzc.zzd() >= zzgylVarZzc2.zzd()) {
            return zzhbx.zzC(zzgylVarZzc, zzgylVarZzc2);
        }
        yfq0.m214580a("ByteString would be too long: ", zzgylVarZzc.zzd(), Marker.ANY_NON_NULL_MARKER, zzgylVarZzc2.zzd());
        return null;
    }

    public static int zzq(int i, int i2, int i3) {
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

    public static C2166i5 zzt() {
        return new C2166i5(128);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static zzgyl zzu(Iterable iterable) {
        int size;
        if (iterable instanceof Collection) {
            size = iterable.size();
        } else {
            Iterator it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        }
        return size == 0 ? zzb : zzc(iterable.iterator(), size);
    }

    public static zzgyl zzv(byte[] bArr, int i, int i2) {
        zzq(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new zzgyh(bArr2);
    }

    public static zzgyl zzw(String str) {
        return new zzgyh(str.getBytes(aax0.f68608b));
    }

    public static void zzy(int i, int i2) {
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                rq3.m180408a(i);
            } else {
                sq3.m185449a(i, i2);
            }
        }
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iZzi = this.zzc;
        if (iZzi == 0) {
            int iZzd = zzd();
            iZzi = zzi(iZzd, 0, iZzd);
            if (iZzi == 0) {
                iZzi = 1;
            }
            this.zzc = iZzi;
        }
        return iZzi;
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(zzd()), zzd() <= 50 ? hcx0.m130523a(this) : hcx0.m130523a(zzk(0, 47)).concat("..."));
    }

    public final byte[] zzA() {
        int iZzd = zzd();
        if (iZzd == 0) {
            return aax0.f68610d;
        }
        byte[] bArr = new byte[iZzd];
        zze(bArr, 0, 0, iZzd);
        return bArr;
    }

    public abstract byte zza(int i);

    public abstract byte zzb(int i);

    public abstract int zzd();

    public abstract void zze(byte[] bArr, int i, int i2, int i3);

    public abstract int zzf();

    public abstract boolean zzh();

    public abstract int zzi(int i, int i2, int i3);

    public abstract int zzj(int i, int i2, int i3);

    public abstract zzgyl zzk(int i, int i2);

    public abstract q7x0 zzl();

    public abstract String zzm(Charset charset);

    public abstract ByteBuffer zzn();

    public abstract void zzo(d7x0 d7x0Var) throws IOException;

    public abstract boolean zzp();

    public final int zzr() {
        return this.zzc;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: zzs, reason: merged with bridge method [inline-methods] */
    public h7x0 iterator() {
        return new e7x0(this);
    }

    public final String zzx(Charset charset) {
        return zzd() == 0 ? "" : zzm(charset);
    }

    @Deprecated
    public final void zzz(byte[] bArr, int i, int i2, int i3) {
        zzq(0, i3, zzd());
        zzq(i2, i2 + i3, bArr.length);
        if (i3 > 0) {
            zze(bArr, 0, i2, i3);
        }
    }
}
