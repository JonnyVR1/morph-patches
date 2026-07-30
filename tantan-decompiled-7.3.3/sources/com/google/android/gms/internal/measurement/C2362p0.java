package com.google.android.gms.internal.measurement;

import java.io.IOException;
import p153l.efy0;
import p153l.hfy0;
import p153l.i4y0;
import p153l.m2y0;
import p153l.m9y0;
import p153l.nvx0;
import p153l.ocy0;
import p153l.v0y0;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.p0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2362p0 {

    /* JADX INFO: renamed from: a */
    public static volatile int f10287a = 100;

    /* JADX INFO: renamed from: a */
    public static double m14309a(byte[] bArr, int i) {
        return Double.longBitsToDouble(m14329u(bArr, i));
    }

    /* JADX INFO: renamed from: b */
    public static int m14310b(int i, byte[] bArr, int i2, int i3, Object obj, m9y0 m9y0Var, hfy0<efy0, efy0> hfy0Var, nvx0 nvx0Var) throws IOException {
        if (nvx0Var.f143893d.m14335b(m9y0Var, i >>> 3) == null) {
            return m14313e(i, bArr, i2, i3, C2376w0.m14486G(obj), nvx0Var);
        }
        AbstractC2372u0.d dVar = (AbstractC2372u0.d) obj;
        dVar.m14438B();
        v0y0<AbstractC2372u0.c> v0y0Var = dVar.zzc;
        throw new NoSuchMethodError();
    }

    /* JADX INFO: renamed from: c */
    public static int m14311c(int i, byte[] bArr, int i2, int i3, nvx0 nvx0Var) throws zzkb {
        if ((i >>> 3) == 0) {
            throw zzkb.zzc();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            return m14328t(bArr, i2, nvx0Var);
        }
        if (i4 == 1) {
            return i2 + 8;
        }
        if (i4 == 2) {
            return m14327s(bArr, i2, nvx0Var) + nvx0Var.f143890a;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                return i2 + 4;
            }
            throw zzkb.zzc();
        }
        int i5 = (i & (-8)) | 4;
        int i6 = 0;
        while (i2 < i3) {
            i2 = m14327s(bArr, i2, nvx0Var);
            i6 = nvx0Var.f143890a;
            if (i6 == i5) {
                break;
            }
            i2 = m14311c(i6, bArr, i2, i3, nvx0Var);
        }
        if (i2 > i3 || i6 != i5) {
            throw zzkb.zzg();
        }
        return i2;
    }

    /* JADX INFO: renamed from: d */
    public static int m14312d(int i, byte[] bArr, int i2, int i3, i4y0<?> i4y0Var, nvx0 nvx0Var) {
        m2y0 m2y0Var = (m2y0) i4y0Var;
        int iM14327s = m14327s(bArr, i2, nvx0Var);
        m2y0Var.m156912g(nvx0Var.f143890a);
        while (iM14327s < i3) {
            int iM14327s2 = m14327s(bArr, iM14327s, nvx0Var);
            if (i != nvx0Var.f143890a) {
                break;
            }
            iM14327s = m14327s(bArr, iM14327s2, nvx0Var);
            m2y0Var.m156912g(nvx0Var.f143890a);
        }
        return iM14327s;
    }

    /* JADX INFO: renamed from: e */
    public static int m14313e(int i, byte[] bArr, int i2, int i3, efy0 efy0Var, nvx0 nvx0Var) throws zzkb {
        if ((i >>> 3) == 0) {
            throw zzkb.zzc();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iM14328t = m14328t(bArr, i2, nvx0Var);
            efy0Var.m120743e(i, Long.valueOf(nvx0Var.f143891b));
            return iM14328t;
        }
        if (i4 == 1) {
            efy0Var.m120743e(i, Long.valueOf(m14329u(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iM14327s = m14327s(bArr, i2, nvx0Var);
            int i5 = nvx0Var.f143890a;
            if (i5 < 0) {
                throw zzkb.zzf();
            }
            if (i5 > bArr.length - iM14327s) {
                throw zzkb.zzi();
            }
            if (i5 == 0) {
                efy0Var.m120743e(i, zzik.zza);
            } else {
                efy0Var.m120743e(i, zzik.zza(bArr, iM14327s, i5));
            }
            return iM14327s + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw zzkb.zzc();
            }
            efy0Var.m120743e(i, Integer.valueOf(m14326r(bArr, i2)));
            return i2 + 4;
        }
        efy0 efy0VarM120739l = efy0.m120739l();
        int i6 = (i & (-8)) | 4;
        int i7 = nvx0Var.f143894e + 1;
        nvx0Var.f143894e = i7;
        m14322n(i7);
        int i8 = 0;
        while (i2 < i3) {
            int iM14327s2 = m14327s(bArr, i2, nvx0Var);
            i8 = nvx0Var.f143890a;
            if (i8 == i6) {
                i2 = iM14327s2;
                break;
            }
            i2 = m14313e(i8, bArr, iM14327s2, i3, efy0VarM120739l, nvx0Var);
        }
        nvx0Var.f143894e--;
        if (i2 > i3 || i8 != i6) {
            throw zzkb.zzg();
        }
        efy0Var.m120743e(i, efy0VarM120739l);
        return i2;
    }

    /* JADX INFO: renamed from: f */
    public static int m14314f(int i, byte[] bArr, int i2, nvx0 nvx0Var) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            nvx0Var.f143890a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & 127) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            nvx0Var.f143890a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            nvx0Var.f143890a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            nvx0Var.f143890a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                nvx0Var.f143890a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    /* JADX INFO: renamed from: g */
    public static int m14315g(Object obj, ocy0 ocy0Var, byte[] bArr, int i, int i2, int i3, nvx0 nvx0Var) throws IOException {
        int i4 = nvx0Var.f143894e + 1;
        nvx0Var.f143894e = i4;
        m14322n(i4);
        int iM14518j = ((C2376w0) ocy0Var).m14518j(obj, bArr, i, i2, i3, nvx0Var);
        nvx0Var.f143894e--;
        nvx0Var.f143892c = obj;
        return iM14518j;
    }

    /* JADX INFO: renamed from: h */
    public static int m14316h(Object obj, ocy0 ocy0Var, byte[] bArr, int i, int i2, nvx0 nvx0Var) throws IOException {
        int iM14314f = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iM14314f = m14314f(i3, bArr, iM14314f, nvx0Var);
            i3 = nvx0Var.f143890a;
        }
        int i4 = iM14314f;
        if (i3 < 0 || i3 > i2 - i4) {
            throw zzkb.zzi();
        }
        int i5 = nvx0Var.f143894e + 1;
        nvx0Var.f143894e = i5;
        m14322n(i5);
        int i6 = i4 + i3;
        ocy0Var.mo14514e(obj, bArr, i4, i6, nvx0Var);
        nvx0Var.f143894e--;
        nvx0Var.f143892c = obj;
        return i6;
    }

    /* JADX INFO: renamed from: i */
    public static int m14317i(ocy0 ocy0Var, int i, byte[] bArr, int i2, int i3, i4y0<?> i4y0Var, nvx0 nvx0Var) throws IOException {
        int i4 = (i & (-8)) | 4;
        int iM14318j = m14318j(ocy0Var, bArr, i2, i3, i4, nvx0Var);
        i4y0Var.add(nvx0Var.f143892c);
        while (iM14318j < i3) {
            int iM14327s = m14327s(bArr, iM14318j, nvx0Var);
            if (i != nvx0Var.f143890a) {
                break;
            }
            iM14318j = m14318j(ocy0Var, bArr, iM14327s, i3, i4, nvx0Var);
            i4y0Var.add(nvx0Var.f143892c);
        }
        return iM14318j;
    }

    /* JADX INFO: renamed from: j */
    public static int m14318j(ocy0 ocy0Var, byte[] bArr, int i, int i2, int i3, nvx0 nvx0Var) throws IOException {
        Object objZza = ocy0Var.zza();
        int iM14315g = m14315g(objZza, ocy0Var, bArr, i, i2, i3, nvx0Var);
        ocy0Var.zzd(objZza);
        nvx0Var.f143892c = objZza;
        return iM14315g;
    }

    /* JADX INFO: renamed from: k */
    public static int m14319k(ocy0 ocy0Var, byte[] bArr, int i, int i2, nvx0 nvx0Var) throws IOException {
        Object objZza = ocy0Var.zza();
        int iM14316h = m14316h(objZza, ocy0Var, bArr, i, i2, nvx0Var);
        ocy0Var.zzd(objZza);
        nvx0Var.f143892c = objZza;
        return iM14316h;
    }

    /* JADX INFO: renamed from: l */
    public static int m14320l(byte[] bArr, int i, nvx0 nvx0Var) throws zzkb {
        int iM14327s = m14327s(bArr, i, nvx0Var);
        int i2 = nvx0Var.f143890a;
        if (i2 < 0) {
            throw zzkb.zzf();
        }
        if (i2 > bArr.length - iM14327s) {
            throw zzkb.zzi();
        }
        if (i2 == 0) {
            nvx0Var.f143892c = zzik.zza;
            return iM14327s;
        }
        nvx0Var.f143892c = zzik.zza(bArr, iM14327s, i2);
        return iM14327s + i2;
    }

    /* JADX INFO: renamed from: m */
    public static int m14321m(byte[] bArr, int i, i4y0<?> i4y0Var, nvx0 nvx0Var) throws IOException {
        m2y0 m2y0Var = (m2y0) i4y0Var;
        int iM14327s = m14327s(bArr, i, nvx0Var);
        int i2 = nvx0Var.f143890a + iM14327s;
        while (iM14327s < i2) {
            iM14327s = m14327s(bArr, iM14327s, nvx0Var);
            m2y0Var.m156912g(nvx0Var.f143890a);
        }
        if (iM14327s == i2) {
            return iM14327s;
        }
        throw zzkb.zzi();
    }

    /* JADX INFO: renamed from: n */
    public static void m14322n(int i) throws zzkb {
        if (i >= f10287a) {
            throw zzkb.zzh();
        }
    }

    /* JADX INFO: renamed from: o */
    public static float m14323o(byte[] bArr, int i) {
        return Float.intBitsToFloat(m14326r(bArr, i));
    }

    /* JADX INFO: renamed from: p */
    public static int m14324p(ocy0<?> ocy0Var, int i, byte[] bArr, int i2, int i3, i4y0<?> i4y0Var, nvx0 nvx0Var) throws IOException {
        int iM14319k = m14319k(ocy0Var, bArr, i2, i3, nvx0Var);
        i4y0Var.add(nvx0Var.f143892c);
        while (iM14319k < i3) {
            int iM14327s = m14327s(bArr, iM14319k, nvx0Var);
            if (i != nvx0Var.f143890a) {
                break;
            }
            iM14319k = m14319k(ocy0Var, bArr, iM14327s, i3, nvx0Var);
            i4y0Var.add(nvx0Var.f143892c);
        }
        return iM14319k;
    }

    /* JADX INFO: renamed from: q */
    public static int m14325q(byte[] bArr, int i, nvx0 nvx0Var) throws zzkb {
        int iM14327s = m14327s(bArr, i, nvx0Var);
        int i2 = nvx0Var.f143890a;
        if (i2 < 0) {
            throw zzkb.zzf();
        }
        if (i2 == 0) {
            nvx0Var.f143892c = "";
            return iM14327s;
        }
        nvx0Var.f143892c = C2382z0.m14606d(bArr, iM14327s, i2);
        return iM14327s + i2;
    }

    /* JADX INFO: renamed from: r */
    public static int m14326r(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: s */
    public static int m14327s(byte[] bArr, int i, nvx0 nvx0Var) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m14314f(b, bArr, i2, nvx0Var);
        }
        nvx0Var.f143890a = b;
        return i2;
    }

    /* JADX INFO: renamed from: t */
    public static int m14328t(byte[] bArr, int i, nvx0 nvx0Var) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            nvx0Var.f143891b = j;
            return i2;
        }
        int i3 = i + 2;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & 127)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b2 & 127)) << i4;
            b = b2;
            i3 = i5;
        }
        nvx0Var.f143891b = j2;
        return i3;
    }

    /* JADX INFO: renamed from: u */
    public static long m14329u(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }
}
