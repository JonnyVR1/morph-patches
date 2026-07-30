package com.google.android.gms.internal.measurement;

import java.io.IOException;
import p149l.b6y0;
import p149l.cvx0;
import p149l.g0y0;
import p149l.gtx0;
import p149l.hmx0;
import p149l.i3y0;
import p149l.prx0;
import p149l.y5y0;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.p0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2339p0 {

    /* JADX INFO: renamed from: a */
    public static volatile int f10250a = 100;

    /* JADX INFO: renamed from: a */
    public static double m14255a(byte[] bArr, int i) {
        return Double.longBitsToDouble(m14275u(bArr, i));
    }

    /* JADX INFO: renamed from: b */
    public static int m14256b(int i, byte[] bArr, int i2, int i3, Object obj, g0y0 g0y0Var, b6y0<y5y0, y5y0> b6y0Var, hmx0 hmx0Var) throws IOException {
        if (hmx0Var.f108508d.m14281b(g0y0Var, i >>> 3) == null) {
            return m14259e(i, bArr, i2, i3, C2353w0.m14432G(obj), hmx0Var);
        }
        AbstractC2349u0.d dVar = (AbstractC2349u0.d) obj;
        dVar.m14384B();
        prx0<AbstractC2349u0.c> prx0Var = dVar.zzc;
        throw new NoSuchMethodError();
    }

    /* JADX INFO: renamed from: c */
    public static int m14257c(int i, byte[] bArr, int i2, int i3, hmx0 hmx0Var) throws zzkb {
        if ((i >>> 3) == 0) {
            throw zzkb.zzc();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            return m14274t(bArr, i2, hmx0Var);
        }
        if (i4 == 1) {
            return i2 + 8;
        }
        if (i4 == 2) {
            return m14273s(bArr, i2, hmx0Var) + hmx0Var.f108505a;
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
            i2 = m14273s(bArr, i2, hmx0Var);
            i6 = hmx0Var.f108505a;
            if (i6 == i5) {
                break;
            }
            i2 = m14257c(i6, bArr, i2, i3, hmx0Var);
        }
        if (i2 > i3 || i6 != i5) {
            throw zzkb.zzg();
        }
        return i2;
    }

    /* JADX INFO: renamed from: d */
    public static int m14258d(int i, byte[] bArr, int i2, int i3, cvx0<?> cvx0Var, hmx0 hmx0Var) {
        gtx0 gtx0Var = (gtx0) cvx0Var;
        int iM14273s = m14273s(bArr, i2, hmx0Var);
        gtx0Var.m128008g(hmx0Var.f108505a);
        while (iM14273s < i3) {
            int iM14273s2 = m14273s(bArr, iM14273s, hmx0Var);
            if (i != hmx0Var.f108505a) {
                break;
            }
            iM14273s = m14273s(bArr, iM14273s2, hmx0Var);
            gtx0Var.m128008g(hmx0Var.f108505a);
        }
        return iM14273s;
    }

    /* JADX INFO: renamed from: e */
    public static int m14259e(int i, byte[] bArr, int i2, int i3, y5y0 y5y0Var, hmx0 hmx0Var) throws zzkb {
        if ((i >>> 3) == 0) {
            throw zzkb.zzc();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iM14274t = m14274t(bArr, i2, hmx0Var);
            y5y0Var.m213028e(i, Long.valueOf(hmx0Var.f108506b));
            return iM14274t;
        }
        if (i4 == 1) {
            y5y0Var.m213028e(i, Long.valueOf(m14275u(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iM14273s = m14273s(bArr, i2, hmx0Var);
            int i5 = hmx0Var.f108505a;
            if (i5 < 0) {
                throw zzkb.zzf();
            }
            if (i5 > bArr.length - iM14273s) {
                throw zzkb.zzi();
            }
            if (i5 == 0) {
                y5y0Var.m213028e(i, zzik.zza);
            } else {
                y5y0Var.m213028e(i, zzik.zza(bArr, iM14273s, i5));
            }
            return iM14273s + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw zzkb.zzc();
            }
            y5y0Var.m213028e(i, Integer.valueOf(m14272r(bArr, i2)));
            return i2 + 4;
        }
        y5y0 y5y0VarM213024l = y5y0.m213024l();
        int i6 = (i & (-8)) | 4;
        int i7 = hmx0Var.f108509e + 1;
        hmx0Var.f108509e = i7;
        m14268n(i7);
        int i8 = 0;
        while (i2 < i3) {
            int iM14273s2 = m14273s(bArr, i2, hmx0Var);
            i8 = hmx0Var.f108505a;
            if (i8 == i6) {
                i2 = iM14273s2;
                break;
            }
            i2 = m14259e(i8, bArr, iM14273s2, i3, y5y0VarM213024l, hmx0Var);
        }
        hmx0Var.f108509e--;
        if (i2 > i3 || i8 != i6) {
            throw zzkb.zzg();
        }
        y5y0Var.m213028e(i, y5y0VarM213024l);
        return i2;
    }

    /* JADX INFO: renamed from: f */
    public static int m14260f(int i, byte[] bArr, int i2, hmx0 hmx0Var) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            hmx0Var.f108505a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & 127) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            hmx0Var.f108505a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            hmx0Var.f108505a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            hmx0Var.f108505a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                hmx0Var.f108505a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    /* JADX INFO: renamed from: g */
    public static int m14261g(Object obj, i3y0 i3y0Var, byte[] bArr, int i, int i2, int i3, hmx0 hmx0Var) throws IOException {
        int i4 = hmx0Var.f108509e + 1;
        hmx0Var.f108509e = i4;
        m14268n(i4);
        int iM14464j = ((C2353w0) i3y0Var).m14464j(obj, bArr, i, i2, i3, hmx0Var);
        hmx0Var.f108509e--;
        hmx0Var.f108507c = obj;
        return iM14464j;
    }

    /* JADX INFO: renamed from: h */
    public static int m14262h(Object obj, i3y0 i3y0Var, byte[] bArr, int i, int i2, hmx0 hmx0Var) throws IOException {
        int iM14260f = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iM14260f = m14260f(i3, bArr, iM14260f, hmx0Var);
            i3 = hmx0Var.f108505a;
        }
        int i4 = iM14260f;
        if (i3 < 0 || i3 > i2 - i4) {
            throw zzkb.zzi();
        }
        int i5 = hmx0Var.f108509e + 1;
        hmx0Var.f108509e = i5;
        m14268n(i5);
        int i6 = i4 + i3;
        i3y0Var.mo14460e(obj, bArr, i4, i6, hmx0Var);
        hmx0Var.f108509e--;
        hmx0Var.f108507c = obj;
        return i6;
    }

    /* JADX INFO: renamed from: i */
    public static int m14263i(i3y0 i3y0Var, int i, byte[] bArr, int i2, int i3, cvx0<?> cvx0Var, hmx0 hmx0Var) throws IOException {
        int i4 = (i & (-8)) | 4;
        int iM14264j = m14264j(i3y0Var, bArr, i2, i3, i4, hmx0Var);
        cvx0Var.add(hmx0Var.f108507c);
        while (iM14264j < i3) {
            int iM14273s = m14273s(bArr, iM14264j, hmx0Var);
            if (i != hmx0Var.f108505a) {
                break;
            }
            iM14264j = m14264j(i3y0Var, bArr, iM14273s, i3, i4, hmx0Var);
            cvx0Var.add(hmx0Var.f108507c);
        }
        return iM14264j;
    }

    /* JADX INFO: renamed from: j */
    public static int m14264j(i3y0 i3y0Var, byte[] bArr, int i, int i2, int i3, hmx0 hmx0Var) throws IOException {
        Object objZza = i3y0Var.zza();
        int iM14261g = m14261g(objZza, i3y0Var, bArr, i, i2, i3, hmx0Var);
        i3y0Var.zzd(objZza);
        hmx0Var.f108507c = objZza;
        return iM14261g;
    }

    /* JADX INFO: renamed from: k */
    public static int m14265k(i3y0 i3y0Var, byte[] bArr, int i, int i2, hmx0 hmx0Var) throws IOException {
        Object objZza = i3y0Var.zza();
        int iM14262h = m14262h(objZza, i3y0Var, bArr, i, i2, hmx0Var);
        i3y0Var.zzd(objZza);
        hmx0Var.f108507c = objZza;
        return iM14262h;
    }

    /* JADX INFO: renamed from: l */
    public static int m14266l(byte[] bArr, int i, hmx0 hmx0Var) throws zzkb {
        int iM14273s = m14273s(bArr, i, hmx0Var);
        int i2 = hmx0Var.f108505a;
        if (i2 < 0) {
            throw zzkb.zzf();
        }
        if (i2 > bArr.length - iM14273s) {
            throw zzkb.zzi();
        }
        if (i2 == 0) {
            hmx0Var.f108507c = zzik.zza;
            return iM14273s;
        }
        hmx0Var.f108507c = zzik.zza(bArr, iM14273s, i2);
        return iM14273s + i2;
    }

    /* JADX INFO: renamed from: m */
    public static int m14267m(byte[] bArr, int i, cvx0<?> cvx0Var, hmx0 hmx0Var) throws IOException {
        gtx0 gtx0Var = (gtx0) cvx0Var;
        int iM14273s = m14273s(bArr, i, hmx0Var);
        int i2 = hmx0Var.f108505a + iM14273s;
        while (iM14273s < i2) {
            iM14273s = m14273s(bArr, iM14273s, hmx0Var);
            gtx0Var.m128008g(hmx0Var.f108505a);
        }
        if (iM14273s == i2) {
            return iM14273s;
        }
        throw zzkb.zzi();
    }

    /* JADX INFO: renamed from: n */
    public static void m14268n(int i) throws zzkb {
        if (i >= f10250a) {
            throw zzkb.zzh();
        }
    }

    /* JADX INFO: renamed from: o */
    public static float m14269o(byte[] bArr, int i) {
        return Float.intBitsToFloat(m14272r(bArr, i));
    }

    /* JADX INFO: renamed from: p */
    public static int m14270p(i3y0<?> i3y0Var, int i, byte[] bArr, int i2, int i3, cvx0<?> cvx0Var, hmx0 hmx0Var) throws IOException {
        int iM14265k = m14265k(i3y0Var, bArr, i2, i3, hmx0Var);
        cvx0Var.add(hmx0Var.f108507c);
        while (iM14265k < i3) {
            int iM14273s = m14273s(bArr, iM14265k, hmx0Var);
            if (i != hmx0Var.f108505a) {
                break;
            }
            iM14265k = m14265k(i3y0Var, bArr, iM14273s, i3, hmx0Var);
            cvx0Var.add(hmx0Var.f108507c);
        }
        return iM14265k;
    }

    /* JADX INFO: renamed from: q */
    public static int m14271q(byte[] bArr, int i, hmx0 hmx0Var) throws zzkb {
        int iM14273s = m14273s(bArr, i, hmx0Var);
        int i2 = hmx0Var.f108505a;
        if (i2 < 0) {
            throw zzkb.zzf();
        }
        if (i2 == 0) {
            hmx0Var.f108507c = "";
            return iM14273s;
        }
        hmx0Var.f108507c = C2359z0.m14552d(bArr, iM14273s, i2);
        return iM14273s + i2;
    }

    /* JADX INFO: renamed from: r */
    public static int m14272r(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: s */
    public static int m14273s(byte[] bArr, int i, hmx0 hmx0Var) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m14260f(b, bArr, i2, hmx0Var);
        }
        hmx0Var.f108505a = b;
        return i2;
    }

    /* JADX INFO: renamed from: t */
    public static int m14274t(byte[] bArr, int i, hmx0 hmx0Var) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            hmx0Var.f108506b = j;
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
        hmx0Var.f108506b = j2;
        return i3;
    }

    /* JADX INFO: renamed from: u */
    public static long m14275u(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }
}
