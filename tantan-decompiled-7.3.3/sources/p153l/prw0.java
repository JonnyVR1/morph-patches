package p153l;

import com.google.android.gms.internal.play_billing.C2411h0;
import com.google.android.gms.internal.play_billing.zzgk;
import com.google.android.gms.internal.play_billing.zzhr;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class prw0 {

    /* JADX INFO: renamed from: a */
    public static volatile int f153857a = 100;

    /* JADX INFO: renamed from: a */
    public static int m173562a(byte[] bArr, int i, ypw0 ypw0Var) throws zzhr {
        int iM173569h = m173569h(bArr, i, ypw0Var);
        int i2 = ypw0Var.f201135a;
        if (i2 < 0) {
            nrw0.m164535a("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        if (i2 > bArr.length - iM173569h) {
            nrw0.m164535a("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        if (i2 == 0) {
            ypw0Var.f201137c = zzgk.zzb;
            return iM173569h;
        }
        ypw0Var.f201137c = zzgk.zzj(bArr, iM173569h, i2);
        return iM173569h + i2;
    }

    /* JADX INFO: renamed from: b */
    public static int m173563b(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    /* JADX INFO: renamed from: c */
    public static int m173564c(uxx0 uxx0Var, byte[] bArr, int i, int i2, int i3, ypw0 ypw0Var) throws IOException {
        Object objZze = uxx0Var.zze();
        int iM173573l = m173573l(objZze, uxx0Var, bArr, i, i2, i3, ypw0Var);
        uxx0Var.mo14868a(objZze);
        ypw0Var.f201137c = objZze;
        return iM173573l;
    }

    /* JADX INFO: renamed from: d */
    public static int m173565d(uxx0 uxx0Var, byte[] bArr, int i, int i2, ypw0 ypw0Var) throws IOException {
        Object objZze = uxx0Var.zze();
        int iM173574m = m173574m(objZze, uxx0Var, bArr, i, i2, ypw0Var);
        uxx0Var.mo14868a(objZze);
        ypw0Var.f201137c = objZze;
        return iM173574m;
    }

    /* JADX INFO: renamed from: e */
    public static int m173566e(uxx0 uxx0Var, int i, byte[] bArr, int i2, int i3, orx0 orx0Var, ypw0 ypw0Var) throws IOException {
        int iM173565d = m173565d(uxx0Var, bArr, i2, i3, ypw0Var);
        orx0Var.add(ypw0Var.f201137c);
        while (iM173565d < i3) {
            int iM173569h = m173569h(bArr, iM173565d, ypw0Var);
            if (i != ypw0Var.f201135a) {
                break;
            }
            iM173565d = m173565d(uxx0Var, bArr, iM173569h, i3, ypw0Var);
            orx0Var.add(ypw0Var.f201137c);
        }
        return iM173565d;
    }

    /* JADX INFO: renamed from: f */
    public static int m173567f(byte[] bArr, int i, orx0 orx0Var, ypw0 ypw0Var) throws IOException {
        crx0 crx0Var = (crx0) orx0Var;
        int iM173569h = m173569h(bArr, i, ypw0Var);
        int i2 = ypw0Var.f201135a + iM173569h;
        while (iM173569h < i2) {
            iM173569h = m173569h(bArr, iM173569h, ypw0Var);
            crx0Var.m112094g(ypw0Var.f201135a);
        }
        if (iM173569h == i2) {
            return iM173569h;
        }
        nrw0.m164535a("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return 0;
    }

    /* JADX INFO: renamed from: g */
    public static int m173568g(int i, byte[] bArr, int i2, int i3, o0y0 o0y0Var, ypw0 ypw0Var) throws zzhr {
        if ((i >>> 3) == 0) {
            nrw0.m164535a("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iM173572k = m173572k(bArr, i2, ypw0Var);
            o0y0Var.m165564j(i, Long.valueOf(ypw0Var.f201136b));
            return iM173572k;
        }
        if (i4 == 1) {
            o0y0Var.m165564j(i, Long.valueOf(m173575n(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iM173569h = m173569h(bArr, i2, ypw0Var);
            int i5 = ypw0Var.f201135a;
            if (i5 < 0) {
                nrw0.m164535a("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                return 0;
            }
            if (i5 > bArr.length - iM173569h) {
                nrw0.m164535a("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return 0;
            }
            if (i5 == 0) {
                o0y0Var.m165564j(i, zzgk.zzb);
            } else {
                o0y0Var.m165564j(i, zzgk.zzj(bArr, iM173569h, i5));
            }
            return iM173569h + i5;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                o0y0Var.m165564j(i, Integer.valueOf(m173563b(bArr, i2)));
                return i2 + 4;
            }
            nrw0.m164535a("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i6 = (i & (-8)) | 4;
        o0y0 o0y0VarM165557f = o0y0.m165557f();
        int i7 = ypw0Var.f201139e + 1;
        ypw0Var.f201139e = i7;
        m173576o(i7);
        int i8 = 0;
        while (i2 < i3) {
            int iM173569h2 = m173569h(bArr, i2, ypw0Var);
            int i9 = ypw0Var.f201135a;
            if (i9 == i6) {
                i8 = i9;
                i2 = iM173569h2;
                break;
            }
            i2 = m173568g(i9, bArr, iM173569h2, i3, o0y0VarM165557f, ypw0Var);
            i8 = i9;
        }
        ypw0Var.f201139e--;
        if (i2 > i3 || i8 != i6) {
            nrw0.m164535a("Failed to parse the message.");
            return 0;
        }
        o0y0Var.m165564j(i, o0y0VarM165557f);
        return i2;
    }

    /* JADX INFO: renamed from: h */
    public static int m173569h(byte[] bArr, int i, ypw0 ypw0Var) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m173570i(b, bArr, i2, ypw0Var);
        }
        ypw0Var.f201135a = b;
        return i2;
    }

    /* JADX INFO: renamed from: i */
    public static int m173570i(int i, byte[] bArr, int i2, ypw0 ypw0Var) {
        byte b = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b >= 0) {
            ypw0Var.f201135a = i4 | (b << 7);
            return i3;
        }
        int i5 = i4 | ((b & 127) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            ypw0Var.f201135a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            ypw0Var.f201135a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            ypw0Var.f201135a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                ypw0Var.f201135a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    /* JADX INFO: renamed from: j */
    public static int m173571j(int i, byte[] bArr, int i2, int i3, orx0 orx0Var, ypw0 ypw0Var) {
        crx0 crx0Var = (crx0) orx0Var;
        int iM173569h = m173569h(bArr, i2, ypw0Var);
        crx0Var.m112094g(ypw0Var.f201135a);
        while (iM173569h < i3) {
            int iM173569h2 = m173569h(bArr, iM173569h, ypw0Var);
            if (i != ypw0Var.f201135a) {
                break;
            }
            iM173569h = m173569h(bArr, iM173569h2, ypw0Var);
            crx0Var.m112094g(ypw0Var.f201135a);
        }
        return iM173569h;
    }

    /* JADX INFO: renamed from: k */
    public static int m173572k(byte[] bArr, int i, ypw0 ypw0Var) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            ypw0Var.f201136b = j;
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
        ypw0Var.f201136b = j2;
        return i3;
    }

    /* JADX INFO: renamed from: l */
    public static int m173573l(Object obj, uxx0 uxx0Var, byte[] bArr, int i, int i2, int i3, ypw0 ypw0Var) throws IOException {
        int i4 = ypw0Var.f201139e + 1;
        ypw0Var.f201139e = i4;
        m173576o(i4);
        int iM14883u = ((C2411h0) uxx0Var).m14883u(obj, bArr, i, i2, i3, ypw0Var);
        ypw0Var.f201139e--;
        ypw0Var.f201137c = obj;
        return iM14883u;
    }

    /* JADX INFO: renamed from: m */
    public static int m173574m(Object obj, uxx0 uxx0Var, byte[] bArr, int i, int i2, ypw0 ypw0Var) throws IOException {
        int iM173570i = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iM173570i = m173570i(i3, bArr, iM173570i, ypw0Var);
            i3 = ypw0Var.f201135a;
        }
        int i4 = iM173570i;
        if (i3 < 0 || i3 > i2 - i4) {
            nrw0.m164535a("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        int i5 = ypw0Var.f201139e + 1;
        ypw0Var.f201139e = i5;
        m173576o(i5);
        int i6 = i4 + i3;
        uxx0Var.mo14871d(obj, bArr, i4, i6, ypw0Var);
        ypw0Var.f201139e--;
        ypw0Var.f201137c = obj;
        return i6;
    }

    /* JADX INFO: renamed from: n */
    public static long m173575n(byte[] bArr, int i) {
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    /* JADX INFO: renamed from: o */
    public static void m173576o(int i) throws zzhr {
        if (i < f153857a) {
            return;
        }
        nrw0.m164535a("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }
}
