package p149l;

import com.google.android.gms.internal.ads.C2246s5;
import com.google.android.gms.internal.ads.zzgyl;
import com.google.android.gms.internal.ads.zzhag;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class y6x0 {
    /* JADX INFO: renamed from: a */
    public static int m213258a(byte[] bArr, int i, x6x0 x6x0Var) throws zzhag {
        int iM213265h = m213265h(bArr, i, x6x0Var);
        int i2 = x6x0Var.f191293a;
        if (i2 < 0) {
            throw zzhag.zzf();
        }
        if (i2 > bArr.length - iM213265h) {
            throw zzhag.zzj();
        }
        if (i2 == 0) {
            x6x0Var.f191295c = zzgyl.zzb;
            return iM213265h;
        }
        x6x0Var.f191295c = zzgyl.zzv(bArr, iM213265h, i2);
        return iM213265h + i2;
    }

    /* JADX INFO: renamed from: b */
    public static int m213259b(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    /* JADX INFO: renamed from: c */
    public static int m213260c(obx0 obx0Var, byte[] bArr, int i, int i2, int i3, x6x0 x6x0Var) throws IOException {
        Object objZze = obx0Var.zze();
        int iM213269l = m213269l(objZze, obx0Var, bArr, i, i2, i3, x6x0Var);
        obx0Var.mo13284a(objZze);
        x6x0Var.f191295c = objZze;
        return iM213269l;
    }

    /* JADX INFO: renamed from: d */
    public static int m213261d(obx0 obx0Var, byte[] bArr, int i, int i2, x6x0 x6x0Var) throws IOException {
        Object objZze = obx0Var.zze();
        int iM213270m = m213270m(objZze, obx0Var, bArr, i, i2, x6x0Var);
        obx0Var.mo13284a(objZze);
        x6x0Var.f191295c = objZze;
        return iM213270m;
    }

    /* JADX INFO: renamed from: e */
    public static int m213262e(obx0 obx0Var, int i, byte[] bArr, int i2, int i3, z9x0 z9x0Var, x6x0 x6x0Var) throws IOException {
        int iM213261d = m213261d(obx0Var, bArr, i2, i3, x6x0Var);
        z9x0Var.add(x6x0Var.f191295c);
        while (iM213261d < i3) {
            int iM213265h = m213265h(bArr, iM213261d, x6x0Var);
            if (i != x6x0Var.f191293a) {
                break;
            }
            iM213261d = m213261d(obx0Var, bArr, iM213265h, i3, x6x0Var);
            z9x0Var.add(x6x0Var.f191295c);
        }
        return iM213261d;
    }

    /* JADX INFO: renamed from: f */
    public static int m213263f(byte[] bArr, int i, z9x0 z9x0Var, x6x0 x6x0Var) throws IOException {
        q8x0 q8x0Var = (q8x0) z9x0Var;
        int iM213265h = m213265h(bArr, i, x6x0Var);
        int i2 = x6x0Var.f191293a + iM213265h;
        while (iM213265h < i2) {
            iM213265h = m213265h(bArr, iM213265h, x6x0Var);
            q8x0Var.zzh(x6x0Var.f191293a);
        }
        if (iM213265h == i2) {
            return iM213265h;
        }
        throw zzhag.zzj();
    }

    /* JADX INFO: renamed from: g */
    public static int m213264g(int i, byte[] bArr, int i2, int i3, jcx0 jcx0Var, x6x0 x6x0Var) throws zzhag {
        if ((i >>> 3) == 0) {
            throw zzhag.zzc();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iM213268k = m213268k(bArr, i2, x6x0Var);
            jcx0Var.m141006j(i, Long.valueOf(x6x0Var.f191294b));
            return iM213268k;
        }
        if (i4 == 1) {
            jcx0Var.m141006j(i, Long.valueOf(m213271n(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iM213265h = m213265h(bArr, i2, x6x0Var);
            int i5 = x6x0Var.f191293a;
            if (i5 < 0) {
                throw zzhag.zzf();
            }
            if (i5 > bArr.length - iM213265h) {
                throw zzhag.zzj();
            }
            if (i5 == 0) {
                jcx0Var.m141006j(i, zzgyl.zzb);
            } else {
                jcx0Var.m141006j(i, zzgyl.zzv(bArr, iM213265h, i5));
            }
            return iM213265h + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw zzhag.zzc();
            }
            jcx0Var.m141006j(i, Integer.valueOf(m213259b(bArr, i2)));
            return i2 + 4;
        }
        int i6 = (i & (-8)) | 4;
        jcx0 jcx0VarM140999f = jcx0.m140999f();
        int i7 = 0;
        while (i2 < i3) {
            int iM213265h2 = m213265h(bArr, i2, x6x0Var);
            i7 = x6x0Var.f191293a;
            if (i7 == i6) {
                i2 = iM213265h2;
                break;
            }
            i2 = m213264g(i7, bArr, iM213265h2, i3, jcx0VarM140999f, x6x0Var);
        }
        if (i2 > i3 || i7 != i6) {
            throw zzhag.zzg();
        }
        jcx0Var.m141006j(i, jcx0VarM140999f);
        return i2;
    }

    /* JADX INFO: renamed from: h */
    public static int m213265h(byte[] bArr, int i, x6x0 x6x0Var) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m213266i(b, bArr, i2, x6x0Var);
        }
        x6x0Var.f191293a = b;
        return i2;
    }

    /* JADX INFO: renamed from: i */
    public static int m213266i(int i, byte[] bArr, int i2, x6x0 x6x0Var) {
        byte b = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b >= 0) {
            x6x0Var.f191293a = i4 | (b << 7);
            return i3;
        }
        int i5 = i4 | ((b & 127) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            x6x0Var.f191293a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            x6x0Var.f191293a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            x6x0Var.f191293a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                x6x0Var.f191293a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    /* JADX INFO: renamed from: j */
    public static int m213267j(int i, byte[] bArr, int i2, int i3, z9x0 z9x0Var, x6x0 x6x0Var) {
        q8x0 q8x0Var = (q8x0) z9x0Var;
        int iM213265h = m213265h(bArr, i2, x6x0Var);
        q8x0Var.zzh(x6x0Var.f191293a);
        while (iM213265h < i3) {
            int iM213265h2 = m213265h(bArr, iM213265h, x6x0Var);
            if (i != x6x0Var.f191293a) {
                break;
            }
            iM213265h = m213265h(bArr, iM213265h2, x6x0Var);
            q8x0Var.zzh(x6x0Var.f191293a);
        }
        return iM213265h;
    }

    /* JADX INFO: renamed from: k */
    public static int m213268k(byte[] bArr, int i, x6x0 x6x0Var) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            x6x0Var.f191294b = j;
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
        x6x0Var.f191294b = j2;
        return i3;
    }

    /* JADX INFO: renamed from: l */
    public static int m213269l(Object obj, obx0 obx0Var, byte[] bArr, int i, int i2, int i3, x6x0 x6x0Var) throws IOException {
        int iM13275A = ((C2246s5) obx0Var).m13275A(obj, bArr, i, i2, i3, x6x0Var);
        x6x0Var.f191295c = obj;
        return iM13275A;
    }

    /* JADX INFO: renamed from: m */
    public static int m213270m(Object obj, obx0 obx0Var, byte[] bArr, int i, int i2, x6x0 x6x0Var) throws IOException {
        int iM213266i = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iM213266i = m213266i(i3, bArr, iM213266i, x6x0Var);
            i3 = x6x0Var.f191293a;
        }
        int i4 = iM213266i;
        if (i3 < 0 || i3 > i2 - i4) {
            throw zzhag.zzj();
        }
        int i5 = i4 + i3;
        obx0Var.mo13287d(obj, bArr, i4, i5, x6x0Var);
        x6x0Var.f191295c = obj;
        return i5;
    }

    /* JADX INFO: renamed from: n */
    public static long m213271n(byte[] bArr, int i) {
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }
}
