package p149l;

import com.google.android.gms.common.api.Api;
import com.google.zxing.FormatException;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes7.dex */
public final class j0l0 {

    /* JADX INFO: renamed from: e */
    public static final int[] f115680e = {31892, 34236, 39577, 42195, 48118, 51042, 55367, 58893, 63784, 68472, 70749, 76311, 79154, 84390, 87683, 92361, 96236, 102084, 102881, 110507, 110734, 117786, 119615, 126325, 127568, 133589, 136944, 141498, 145311, 150283, 152622, 158308, 161089, 167017};

    /* JADX INFO: renamed from: f */
    public static final j0l0[] f115681f = m139166b();

    /* JADX INFO: renamed from: a */
    public final int f115682a;

    /* JADX INFO: renamed from: b */
    public final int[] f115683b;

    /* JADX INFO: renamed from: c */
    public final C17662b[] f115684c;

    /* JADX INFO: renamed from: d */
    public final int f115685d;

    /* JADX INFO: renamed from: l.j0l0$a */
    public static final class C17661a {

        /* JADX INFO: renamed from: a */
        public final int f115686a;

        /* JADX INFO: renamed from: b */
        public final int f115687b;

        public C17661a(int i, int i2) {
            this.f115686a = i;
            this.f115687b = i2;
        }

        /* JADX INFO: renamed from: a */
        public int m139176a() {
            return this.f115686a;
        }

        /* JADX INFO: renamed from: b */
        public int m139177b() {
            return this.f115687b;
        }
    }

    /* JADX INFO: renamed from: l.j0l0$b */
    public static final class C17662b {

        /* JADX INFO: renamed from: a */
        public final int f115688a;

        /* JADX INFO: renamed from: b */
        public final C17661a[] f115689b;

        public C17662b(int i, C17661a... c17661aArr) {
            this.f115688a = i;
            this.f115689b = c17661aArr;
        }

        /* JADX INFO: renamed from: a */
        public C17661a[] m139178a() {
            return this.f115689b;
        }

        /* JADX INFO: renamed from: b */
        public int m139179b() {
            return this.f115688a;
        }

        /* JADX INFO: renamed from: c */
        public int m139180c() {
            int iM139176a = 0;
            for (C17661a c17661a : this.f115689b) {
                iM139176a += c17661a.m139176a();
            }
            return iM139176a;
        }

        /* JADX INFO: renamed from: d */
        public int m139181d() {
            return this.f115688a * m139180c();
        }
    }

    public j0l0(int i, int[] iArr, C17662b... c17662bArr) {
        this.f115682a = i;
        this.f115683b = iArr;
        this.f115684c = c17662bArr;
        int iM139179b = c17662bArr[0].m139179b();
        int iM139176a = 0;
        for (C17661a c17661a : c17662bArr[0].m139178a()) {
            iM139176a += c17661a.m139176a() * (c17661a.m139177b() + iM139179b);
        }
        this.f115685d = iM139176a;
    }

    /* JADX INFO: renamed from: b */
    public static j0l0[] m139166b() {
        return new j0l0[]{new j0l0(1, new int[0], new C17662b(7, new C17661a(1, 19)), new C17662b(10, new C17661a(1, 16)), new C17662b(13, new C17661a(1, 13)), new C17662b(17, new C17661a(1, 9))), new j0l0(2, new int[]{6, 18}, new C17662b(10, new C17661a(1, 34)), new C17662b(16, new C17661a(1, 28)), new C17662b(22, new C17661a(1, 22)), new C17662b(28, new C17661a(1, 16))), new j0l0(3, new int[]{6, 22}, new C17662b(15, new C17661a(1, 55)), new C17662b(26, new C17661a(1, 44)), new C17662b(18, new C17661a(2, 17)), new C17662b(22, new C17661a(2, 13))), new j0l0(4, new int[]{6, 26}, new C17662b(20, new C17661a(1, 80)), new C17662b(18, new C17661a(2, 32)), new C17662b(26, new C17661a(2, 24)), new C17662b(16, new C17661a(4, 9))), new j0l0(5, new int[]{6, 30}, new C17662b(26, new C17661a(1, 108)), new C17662b(24, new C17661a(2, 43)), new C17662b(18, new C17661a(2, 15), new C17661a(2, 16)), new C17662b(22, new C17661a(2, 11), new C17661a(2, 12))), new j0l0(6, new int[]{6, 34}, new C17662b(18, new C17661a(2, 68)), new C17662b(16, new C17661a(4, 27)), new C17662b(24, new C17661a(4, 19)), new C17662b(28, new C17661a(4, 15))), new j0l0(7, new int[]{6, 22, 38}, new C17662b(20, new C17661a(2, 78)), new C17662b(18, new C17661a(4, 31)), new C17662b(18, new C17661a(2, 14), new C17661a(4, 15)), new C17662b(26, new C17661a(4, 13), new C17661a(1, 14))), new j0l0(8, new int[]{6, 24, 42}, new C17662b(24, new C17661a(2, 97)), new C17662b(22, new C17661a(2, 38), new C17661a(2, 39)), new C17662b(22, new C17661a(4, 18), new C17661a(2, 19)), new C17662b(26, new C17661a(4, 14), new C17661a(2, 15))), new j0l0(9, new int[]{6, 26, 46}, new C17662b(30, new C17661a(2, 116)), new C17662b(22, new C17661a(3, 36), new C17661a(2, 37)), new C17662b(20, new C17661a(4, 16), new C17661a(4, 17)), new C17662b(24, new C17661a(4, 12), new C17661a(4, 13))), new j0l0(10, new int[]{6, 28, 50}, new C17662b(18, new C17661a(2, 68), new C17661a(2, 69)), new C17662b(26, new C17661a(4, 43), new C17661a(1, 44)), new C17662b(24, new C17661a(6, 19), new C17661a(2, 20)), new C17662b(28, new C17661a(6, 15), new C17661a(2, 16))), new j0l0(11, new int[]{6, 30, 54}, new C17662b(20, new C17661a(4, 81)), new C17662b(30, new C17661a(1, 50), new C17661a(4, 51)), new C17662b(28, new C17661a(4, 22), new C17661a(4, 23)), new C17662b(24, new C17661a(3, 12), new C17661a(8, 13))), new j0l0(12, new int[]{6, 32, 58}, new C17662b(24, new C17661a(2, 92), new C17661a(2, 93)), new C17662b(22, new C17661a(6, 36), new C17661a(2, 37)), new C17662b(26, new C17661a(4, 20), new C17661a(6, 21)), new C17662b(28, new C17661a(7, 14), new C17661a(4, 15))), new j0l0(13, new int[]{6, 34, 62}, new C17662b(26, new C17661a(4, 107)), new C17662b(22, new C17661a(8, 37), new C17661a(1, 38)), new C17662b(24, new C17661a(8, 20), new C17661a(4, 21)), new C17662b(22, new C17661a(12, 11), new C17661a(4, 12))), new j0l0(14, new int[]{6, 26, 46, 66}, new C17662b(30, new C17661a(3, 115), new C17661a(1, 116)), new C17662b(24, new C17661a(4, 40), new C17661a(5, 41)), new C17662b(20, new C17661a(11, 16), new C17661a(5, 17)), new C17662b(24, new C17661a(11, 12), new C17661a(5, 13))), new j0l0(15, new int[]{6, 26, 48, 70}, new C17662b(22, new C17661a(5, 87), new C17661a(1, 88)), new C17662b(24, new C17661a(5, 41), new C17661a(5, 42)), new C17662b(30, new C17661a(5, 24), new C17661a(7, 25)), new C17662b(24, new C17661a(11, 12), new C17661a(7, 13))), new j0l0(16, new int[]{6, 26, 50, 74}, new C17662b(24, new C17661a(5, 98), new C17661a(1, 99)), new C17662b(28, new C17661a(7, 45), new C17661a(3, 46)), new C17662b(24, new C17661a(15, 19), new C17661a(2, 20)), new C17662b(30, new C17661a(3, 15), new C17661a(13, 16))), new j0l0(17, new int[]{6, 30, 54, 78}, new C17662b(28, new C17661a(1, 107), new C17661a(5, 108)), new C17662b(28, new C17661a(10, 46), new C17661a(1, 47)), new C17662b(28, new C17661a(1, 22), new C17661a(15, 23)), new C17662b(28, new C17661a(2, 14), new C17661a(17, 15))), new j0l0(18, new int[]{6, 30, 56, 82}, new C17662b(30, new C17661a(5, 120), new C17661a(1, 121)), new C17662b(26, new C17661a(9, 43), new C17661a(4, 44)), new C17662b(28, new C17661a(17, 22), new C17661a(1, 23)), new C17662b(28, new C17661a(2, 14), new C17661a(19, 15))), new j0l0(19, new int[]{6, 30, 58, 86}, new C17662b(28, new C17661a(3, 113), new C17661a(4, 114)), new C17662b(26, new C17661a(3, 44), new C17661a(11, 45)), new C17662b(26, new C17661a(17, 21), new C17661a(4, 22)), new C17662b(26, new C17661a(9, 13), new C17661a(16, 14))), new j0l0(20, new int[]{6, 34, 62, 90}, new C17662b(28, new C17661a(3, 107), new C17661a(5, 108)), new C17662b(26, new C17661a(3, 41), new C17661a(13, 42)), new C17662b(30, new C17661a(15, 24), new C17661a(5, 25)), new C17662b(28, new C17661a(15, 15), new C17661a(10, 16))), new j0l0(21, new int[]{6, 28, 50, 72, 94}, new C17662b(28, new C17661a(4, 116), new C17661a(4, 117)), new C17662b(26, new C17661a(17, 42)), new C17662b(28, new C17661a(17, 22), new C17661a(6, 23)), new C17662b(30, new C17661a(19, 16), new C17661a(6, 17))), new j0l0(22, new int[]{6, 26, 50, 74, 98}, new C17662b(28, new C17661a(2, 111), new C17661a(7, 112)), new C17662b(28, new C17661a(17, 46)), new C17662b(30, new C17661a(7, 24), new C17661a(16, 25)), new C17662b(24, new C17661a(34, 13))), new j0l0(23, new int[]{6, 30, 54, 78, 102}, new C17662b(30, new C17661a(4, 121), new C17661a(5, 122)), new C17662b(28, new C17661a(4, 47), new C17661a(14, 48)), new C17662b(30, new C17661a(11, 24), new C17661a(14, 25)), new C17662b(30, new C17661a(16, 15), new C17661a(14, 16))), new j0l0(24, new int[]{6, 28, 54, 80, 106}, new C17662b(30, new C17661a(6, 117), new C17661a(4, 118)), new C17662b(28, new C17661a(6, 45), new C17661a(14, 46)), new C17662b(30, new C17661a(11, 24), new C17661a(16, 25)), new C17662b(30, new C17661a(30, 16), new C17661a(2, 17))), new j0l0(25, new int[]{6, 32, 58, 84, 110}, new C17662b(26, new C17661a(8, 106), new C17661a(4, 107)), new C17662b(28, new C17661a(8, 47), new C17661a(13, 48)), new C17662b(30, new C17661a(7, 24), new C17661a(22, 25)), new C17662b(30, new C17661a(22, 15), new C17661a(13, 16))), new j0l0(26, new int[]{6, 30, 58, 86, 114}, new C17662b(28, new C17661a(10, 114), new C17661a(2, 115)), new C17662b(28, new C17661a(19, 46), new C17661a(4, 47)), new C17662b(28, new C17661a(28, 22), new C17661a(6, 23)), new C17662b(30, new C17661a(33, 16), new C17661a(4, 17))), new j0l0(27, new int[]{6, 34, 62, 90, 118}, new C17662b(30, new C17661a(8, 122), new C17661a(4, 123)), new C17662b(28, new C17661a(22, 45), new C17661a(3, 46)), new C17662b(30, new C17661a(8, 23), new C17661a(26, 24)), new C17662b(30, new C17661a(12, 15), new C17661a(28, 16))), new j0l0(28, new int[]{6, 26, 50, 74, 98, 122}, new C17662b(30, new C17661a(3, 117), new C17661a(10, 118)), new C17662b(28, new C17661a(3, 45), new C17661a(23, 46)), new C17662b(30, new C17661a(4, 24), new C17661a(31, 25)), new C17662b(30, new C17661a(11, 15), new C17661a(31, 16))), new j0l0(29, new int[]{6, 30, 54, 78, 102, 126}, new C17662b(30, new C17661a(7, 116), new C17661a(7, 117)), new C17662b(28, new C17661a(21, 45), new C17661a(7, 46)), new C17662b(30, new C17661a(1, 23), new C17661a(37, 24)), new C17662b(30, new C17661a(19, 15), new C17661a(26, 16))), new j0l0(30, new int[]{6, 26, 52, 78, 104, 130}, new C17662b(30, new C17661a(5, 115), new C17661a(10, 116)), new C17662b(28, new C17661a(19, 47), new C17661a(10, 48)), new C17662b(30, new C17661a(15, 24), new C17661a(25, 25)), new C17662b(30, new C17661a(23, 15), new C17661a(25, 16))), new j0l0(31, new int[]{6, 30, 56, 82, 108, 134}, new C17662b(30, new C17661a(13, 115), new C17661a(3, 116)), new C17662b(28, new C17661a(2, 46), new C17661a(29, 47)), new C17662b(30, new C17661a(42, 24), new C17661a(1, 25)), new C17662b(30, new C17661a(23, 15), new C17661a(28, 16))), new j0l0(32, new int[]{6, 34, 60, 86, 112, CipherSuite.TLS_PSK_WITH_RC4_128_SHA}, new C17662b(30, new C17661a(17, 115)), new C17662b(28, new C17661a(10, 46), new C17661a(23, 47)), new C17662b(30, new C17661a(10, 24), new C17661a(35, 25)), new C17662b(30, new C17661a(19, 15), new C17661a(35, 16))), new j0l0(33, new int[]{6, 30, 58, 86, 114, CipherSuite.TLS_DHE_PSK_WITH_RC4_128_SHA}, new C17662b(30, new C17661a(17, 115), new C17661a(1, 116)), new C17662b(28, new C17661a(14, 46), new C17661a(21, 47)), new C17662b(30, new C17661a(29, 24), new C17661a(19, 25)), new C17662b(30, new C17661a(11, 15), new C17661a(46, 16))), new j0l0(34, new int[]{6, 34, 62, 90, 118, CipherSuite.TLS_RSA_PSK_WITH_RC4_128_SHA}, new C17662b(30, new C17661a(13, 115), new C17661a(6, 116)), new C17662b(28, new C17661a(14, 46), new C17661a(23, 47)), new C17662b(30, new C17661a(44, 24), new C17661a(7, 25)), new C17662b(30, new C17661a(59, 16), new C17661a(1, 17))), new j0l0(35, new int[]{6, 30, 54, 78, 102, 126, 150}, new C17662b(30, new C17661a(12, 121), new C17661a(7, 122)), new C17662b(28, new C17661a(12, 47), new C17661a(26, 48)), new C17662b(30, new C17661a(39, 24), new C17661a(14, 25)), new C17662b(30, new C17661a(22, 15), new C17661a(41, 16))), new j0l0(36, new int[]{6, 24, 50, 76, 102, 128, 154}, new C17662b(30, new C17661a(6, 121), new C17661a(14, 122)), new C17662b(28, new C17661a(6, 47), new C17661a(34, 48)), new C17662b(30, new C17661a(46, 24), new C17661a(10, 25)), new C17662b(30, new C17661a(2, 15), new C17661a(64, 16))), new j0l0(37, new int[]{6, 28, 54, 80, 106, CipherSuite.TLS_RSA_WITH_CAMELLIA_256_CBC_SHA, 158}, new C17662b(30, new C17661a(17, 122), new C17661a(4, 123)), new C17662b(28, new C17661a(29, 46), new C17661a(14, 47)), new C17662b(30, new C17661a(49, 24), new C17661a(10, 25)), new C17662b(30, new C17661a(24, 15), new C17661a(46, 16))), new j0l0(38, new int[]{6, 32, 58, 84, 110, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA, 162}, new C17662b(30, new C17661a(4, 122), new C17661a(18, 123)), new C17662b(28, new C17661a(13, 46), new C17661a(32, 47)), new C17662b(30, new C17661a(48, 24), new C17661a(14, 25)), new C17662b(30, new C17661a(42, 15), new C17661a(32, 16))), new j0l0(39, new int[]{6, 26, 54, 82, 110, CipherSuite.TLS_PSK_WITH_RC4_128_SHA, 166}, new C17662b(30, new C17661a(20, 117), new C17661a(4, 118)), new C17662b(28, new C17661a(40, 47), new C17661a(7, 48)), new C17662b(30, new C17661a(43, 24), new C17661a(22, 25)), new C17662b(30, new C17661a(10, 15), new C17661a(67, 16))), new j0l0(40, new int[]{6, 30, 58, 86, 114, CipherSuite.TLS_DHE_PSK_WITH_RC4_128_SHA, CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256}, new C17662b(30, new C17661a(19, 118), new C17661a(6, 119)), new C17662b(28, new C17661a(18, 47), new C17661a(31, 48)), new C17662b(30, new C17661a(34, 24), new C17661a(34, 25)), new C17662b(30, new C17661a(20, 15), new C17661a(61, 16)))};
    }

    /* JADX INFO: renamed from: c */
    public static j0l0 m139167c(int i) {
        int i2 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int[] iArr = f115680e;
            if (i3 >= iArr.length) {
                if (i2 <= 3) {
                    return m139169i(i4);
                }
                return null;
            }
            int i5 = iArr[i3];
            if (i5 == i) {
                return m139169i(i3 + 7);
            }
            int iM200653e = vyi.m200653e(i, i5);
            if (iM200653e < i2) {
                i4 = i3 + 7;
                i2 = iM200653e;
            }
            i3++;
        }
    }

    /* JADX INFO: renamed from: g */
    public static j0l0 m139168g(int i) throws FormatException {
        if (i % 4 != 1) {
            throw FormatException.getFormatInstance();
        }
        try {
            return m139169i((i - 17) / 4);
        } catch (IllegalArgumentException unused) {
            throw FormatException.getFormatInstance();
        }
    }

    /* JADX INFO: renamed from: i */
    public static j0l0 m139169i(int i) {
        if (i > 0 && i <= 40) {
            return f115681f[i - 1];
        }
        x9g0.m207497a();
        return null;
    }

    /* JADX INFO: renamed from: a */
    public o03 m139170a() {
        int iM139172e = m139172e();
        o03 o03Var = new o03(iM139172e);
        o03Var.m162119p(0, 0, 9, 9);
        int i = iM139172e - 8;
        o03Var.m162119p(i, 0, 8, 9);
        o03Var.m162119p(0, i, 9, 8);
        int length = this.f115683b.length;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = this.f115683b[i2] - 2;
            for (int i4 = 0; i4 < length; i4++) {
                if ((i2 != 0 || (i4 != 0 && i4 != length - 1)) && (i2 != length - 1 || i4 != 0)) {
                    o03Var.m162119p(this.f115683b[i4] - 2, i3, 5, 5);
                }
            }
        }
        int i5 = iM139172e - 17;
        o03Var.m162119p(6, 9, 1, i5);
        o03Var.m162119p(9, 6, i5, 1);
        if (this.f115682a > 6) {
            int i6 = iM139172e - 11;
            o03Var.m162119p(i6, 0, 3, 6);
            o03Var.m162119p(0, i6, 6, 3);
        }
        return o03Var;
    }

    /* JADX INFO: renamed from: d */
    public int[] m139171d() {
        return this.f115683b;
    }

    /* JADX INFO: renamed from: e */
    public int m139172e() {
        return (this.f115682a * 4) + 17;
    }

    /* JADX INFO: renamed from: f */
    public C17662b m139173f(ErrorCorrectionLevel errorCorrectionLevel) {
        return this.f115684c[errorCorrectionLevel.ordinal()];
    }

    /* JADX INFO: renamed from: h */
    public int m139174h() {
        return this.f115685d;
    }

    /* JADX INFO: renamed from: j */
    public int m139175j() {
        return this.f115682a;
    }

    public String toString() {
        return String.valueOf(this.f115682a);
    }
}
