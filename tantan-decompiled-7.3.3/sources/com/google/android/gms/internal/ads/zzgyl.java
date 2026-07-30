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
import p153l.bqg0;
import p153l.cgx0;
import p153l.dpq0;
import p153l.gjx0;
import p153l.gzi0;
import p153l.jgx0;
import p153l.kgx0;
import p153l.lgx0;
import p153l.ngx0;
import p153l.nlx0;
import p153l.qr3;
import p153l.rgx0;
import p153l.rr3;
import p153l.wgx0;
import p153l.yze;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zzgyl implements Iterable, Serializable {
    private static final Comparator zza;
    public static final zzgyl zzb = new zzgyh(gjx0.f104691d);
    private static final rgx0 zzd;
    private int zzc = 0;

    static {
        int i = cgx0.f81747a;
        zzd = new rgx0(null);
        zza = new lgx0();
    }

    private static zzgyl zzc(Iterator it, int i) {
        if (i <= 0) {
            gzi0.m133102a("length (%s) must be >= 1", new Object[]{Integer.valueOf(i)});
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
        dpq0.m117417a("ByteString would be too long: ", zzgylVarZzc.zzd(), Marker.ANY_NON_NULL_MARKER, zzgylVarZzc2.zzd());
        return null;
    }

    public static int zzq(int i, int i2, int i3) {
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

    public static C2189i5 zzt() {
        return new C2189i5(128);
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
        return new zzgyh(str.getBytes(gjx0.f104689b));
    }

    public static void zzy(int i, int i2) {
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                qr3.m177532a(i);
            } else {
                rr3.m182687a(i, i2);
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
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(zzd()), zzd() <= 50 ? nlx0.m163784a(this) : nlx0.m163784a(zzk(0, 47)).concat("..."));
    }

    public final byte[] zzA() {
        int iZzd = zzd();
        if (iZzd == 0) {
            return gjx0.f104691d;
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

    public abstract wgx0 zzl();

    public abstract String zzm(Charset charset);

    public abstract ByteBuffer zzn();

    public abstract void zzo(jgx0 jgx0Var) throws IOException;

    public abstract boolean zzp();

    public final int zzr() {
        return this.zzc;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: zzs, reason: merged with bridge method [inline-methods] */
    public ngx0 iterator() {
        return new kgx0(this);
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
