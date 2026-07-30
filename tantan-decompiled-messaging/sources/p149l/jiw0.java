package p149l;

import com.google.android.gms.internal.play_billing.C2388h0;
import com.google.android.gms.internal.play_billing.zzgk;
import com.google.android.gms.internal.play_billing.zzhr;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class jiw0 {

    /* JADX INFO: renamed from: a */
    public static volatile int f118142a = 100;

    /* JADX INFO: renamed from: a */
    public static int m141666a(byte[] bArr, int i, sgw0 sgw0Var) throws zzhr {
        int iM141673h = m141673h(bArr, i, sgw0Var);
        int i2 = sgw0Var.f164490a;
        if (i2 < 0) {
            hiw0.m131310a("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        if (i2 > bArr.length - iM141673h) {
            hiw0.m131310a("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        if (i2 == 0) {
            sgw0Var.f164492c = zzgk.zzb;
            return iM141673h;
        }
        sgw0Var.f164492c = zzgk.zzj(bArr, iM141673h, i2);
        return iM141673h + i2;
    }

    /* JADX INFO: renamed from: b */
    public static int m141667b(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    /* JADX INFO: renamed from: c */
    public static int m141668c(oox0 oox0Var, byte[] bArr, int i, int i2, int i3, sgw0 sgw0Var) throws IOException {
        Object objZze = oox0Var.zze();
        int iM141677l = m141677l(objZze, oox0Var, bArr, i, i2, i3, sgw0Var);
        oox0Var.mo14814a(objZze);
        sgw0Var.f164492c = objZze;
        return iM141677l;
    }

    /* JADX INFO: renamed from: d */
    public static int m141669d(oox0 oox0Var, byte[] bArr, int i, int i2, sgw0 sgw0Var) throws IOException {
        Object objZze = oox0Var.zze();
        int iM141678m = m141678m(objZze, oox0Var, bArr, i, i2, sgw0Var);
        oox0Var.mo14814a(objZze);
        sgw0Var.f164492c = objZze;
        return iM141678m;
    }

    /* JADX INFO: renamed from: e */
    public static int m141670e(oox0 oox0Var, int i, byte[] bArr, int i2, int i3, iix0 iix0Var, sgw0 sgw0Var) throws IOException {
        int iM141669d = m141669d(oox0Var, bArr, i2, i3, sgw0Var);
        iix0Var.add(sgw0Var.f164492c);
        while (iM141669d < i3) {
            int iM141673h = m141673h(bArr, iM141669d, sgw0Var);
            if (i != sgw0Var.f164490a) {
                break;
            }
            iM141669d = m141669d(oox0Var, bArr, iM141673h, i3, sgw0Var);
            iix0Var.add(sgw0Var.f164492c);
        }
        return iM141669d;
    }

    /* JADX INFO: renamed from: f */
    public static int m141671f(byte[] bArr, int i, iix0 iix0Var, sgw0 sgw0Var) throws IOException {
        whx0 whx0Var = (whx0) iix0Var;
        int iM141673h = m141673h(bArr, i, sgw0Var);
        int i2 = sgw0Var.f164490a + iM141673h;
        while (iM141673h < i2) {
            iM141673h = m141673h(bArr, iM141673h, sgw0Var);
            whx0Var.m203256g(sgw0Var.f164490a);
        }
        if (iM141673h == i2) {
            return iM141673h;
        }
        hiw0.m131310a("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return 0;
    }

    /* JADX INFO: renamed from: g */
    public static int m141672g(int i, byte[] bArr, int i2, int i3, irx0 irx0Var, sgw0 sgw0Var) throws zzhr {
        if ((i >>> 3) == 0) {
            hiw0.m131310a("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iM141676k = m141676k(bArr, i2, sgw0Var);
            irx0Var.m137930j(i, Long.valueOf(sgw0Var.f164491b));
            return iM141676k;
        }
        if (i4 == 1) {
            irx0Var.m137930j(i, Long.valueOf(m141679n(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iM141673h = m141673h(bArr, i2, sgw0Var);
            int i5 = sgw0Var.f164490a;
            if (i5 < 0) {
                hiw0.m131310a("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                return 0;
            }
            if (i5 > bArr.length - iM141673h) {
                hiw0.m131310a("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return 0;
            }
            if (i5 == 0) {
                irx0Var.m137930j(i, zzgk.zzb);
            } else {
                irx0Var.m137930j(i, zzgk.zzj(bArr, iM141673h, i5));
            }
            return iM141673h + i5;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                irx0Var.m137930j(i, Integer.valueOf(m141667b(bArr, i2)));
                return i2 + 4;
            }
            hiw0.m131310a("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i6 = (i & (-8)) | 4;
        irx0 irx0VarM137923f = irx0.m137923f();
        int i7 = sgw0Var.f164494e + 1;
        sgw0Var.f164494e = i7;
        m141680o(i7);
        int i8 = 0;
        while (i2 < i3) {
            int iM141673h2 = m141673h(bArr, i2, sgw0Var);
            int i9 = sgw0Var.f164490a;
            if (i9 == i6) {
                i8 = i9;
                i2 = iM141673h2;
                break;
            }
            i2 = m141672g(i9, bArr, iM141673h2, i3, irx0VarM137923f, sgw0Var);
            i8 = i9;
        }
        sgw0Var.f164494e--;
        if (i2 > i3 || i8 != i6) {
            hiw0.m131310a("Failed to parse the message.");
            return 0;
        }
        irx0Var.m137930j(i, irx0VarM137923f);
        return i2;
    }

    /* JADX INFO: renamed from: h */
    public static int m141673h(byte[] bArr, int i, sgw0 sgw0Var) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m141674i(b, bArr, i2, sgw0Var);
        }
        sgw0Var.f164490a = b;
        return i2;
    }

    /* JADX INFO: renamed from: i */
    public static int m141674i(int i, byte[] bArr, int i2, sgw0 sgw0Var) {
        byte b = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b >= 0) {
            sgw0Var.f164490a = i4 | (b << 7);
            return i3;
        }
        int i5 = i4 | ((b & 127) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            sgw0Var.f164490a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            sgw0Var.f164490a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            sgw0Var.f164490a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                sgw0Var.f164490a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    /* JADX INFO: renamed from: j */
    public static int m141675j(int i, byte[] bArr, int i2, int i3, iix0 iix0Var, sgw0 sgw0Var) {
        whx0 whx0Var = (whx0) iix0Var;
        int iM141673h = m141673h(bArr, i2, sgw0Var);
        whx0Var.m203256g(sgw0Var.f164490a);
        while (iM141673h < i3) {
            int iM141673h2 = m141673h(bArr, iM141673h, sgw0Var);
            if (i != sgw0Var.f164490a) {
                break;
            }
            iM141673h = m141673h(bArr, iM141673h2, sgw0Var);
            whx0Var.m203256g(sgw0Var.f164490a);
        }
        return iM141673h;
    }

    /* JADX INFO: renamed from: k */
    public static int m141676k(byte[] bArr, int i, sgw0 sgw0Var) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            sgw0Var.f164491b = j;
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
        sgw0Var.f164491b = j2;
        return i3;
    }

    /* JADX INFO: renamed from: l */
    public static int m141677l(Object obj, oox0 oox0Var, byte[] bArr, int i, int i2, int i3, sgw0 sgw0Var) throws IOException {
        int i4 = sgw0Var.f164494e + 1;
        sgw0Var.f164494e = i4;
        m141680o(i4);
        int iM14829u = ((C2388h0) oox0Var).m14829u(obj, bArr, i, i2, i3, sgw0Var);
        sgw0Var.f164494e--;
        sgw0Var.f164492c = obj;
        return iM14829u;
    }

    /* JADX INFO: renamed from: m */
    public static int m141678m(Object obj, oox0 oox0Var, byte[] bArr, int i, int i2, sgw0 sgw0Var) throws IOException {
        int iM141674i = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iM141674i = m141674i(i3, bArr, iM141674i, sgw0Var);
            i3 = sgw0Var.f164490a;
        }
        int i4 = iM141674i;
        if (i3 < 0 || i3 > i2 - i4) {
            hiw0.m131310a("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        int i5 = sgw0Var.f164494e + 1;
        sgw0Var.f164494e = i5;
        m141680o(i5);
        int i6 = i4 + i3;
        oox0Var.mo14817d(obj, bArr, i4, i6, sgw0Var);
        sgw0Var.f164494e--;
        sgw0Var.f164492c = obj;
        return i6;
    }

    /* JADX INFO: renamed from: n */
    public static long m141679n(byte[] bArr, int i) {
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    /* JADX INFO: renamed from: o */
    public static void m141680o(int i) throws zzhr {
        if (i < f118142a) {
            return;
        }
        hiw0.m131310a("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }
}
