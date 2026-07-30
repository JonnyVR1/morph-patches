package p153l;

import com.google.android.gms.common.api.Api;
import com.google.zxing.FormatException;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes7.dex */
public final class o9l0 {

    /* JADX INFO: renamed from: e */
    public static final int[] f145599e = {31892, 34236, 39577, 42195, 48118, 51042, 55367, 58893, 63784, 68472, 70749, 76311, 79154, 84390, 87683, 92361, 96236, 102084, 102881, 110507, 110734, 117786, 119615, 126325, 127568, 133589, 136944, 141498, 145311, 150283, 152622, 158308, 161089, 167017};

    /* JADX INFO: renamed from: f */
    public static final o9l0[] f145600f = m166742b();

    /* JADX INFO: renamed from: a */
    public final int f145601a;

    /* JADX INFO: renamed from: b */
    public final int[] f145602b;

    /* JADX INFO: renamed from: c */
    public final C19061b[] f145603c;

    /* JADX INFO: renamed from: d */
    public final int f145604d;

    /* JADX INFO: renamed from: l.o9l0$a */
    public static final class C19060a {

        /* JADX INFO: renamed from: a */
        public final int f145605a;

        /* JADX INFO: renamed from: b */
        public final int f145606b;

        public C19060a(int i, int i2) {
            this.f145605a = i;
            this.f145606b = i2;
        }

        /* JADX INFO: renamed from: a */
        public int m166752a() {
            return this.f145605a;
        }

        /* JADX INFO: renamed from: b */
        public int m166753b() {
            return this.f145606b;
        }
    }

    /* JADX INFO: renamed from: l.o9l0$b */
    public static final class C19061b {

        /* JADX INFO: renamed from: a */
        public final int f145607a;

        /* JADX INFO: renamed from: b */
        public final C19060a[] f145608b;

        public C19061b(int i, C19060a... c19060aArr) {
            this.f145607a = i;
            this.f145608b = c19060aArr;
        }

        /* JADX INFO: renamed from: a */
        public C19060a[] m166754a() {
            return this.f145608b;
        }

        /* JADX INFO: renamed from: b */
        public int m166755b() {
            return this.f145607a;
        }

        /* JADX INFO: renamed from: c */
        public int m166756c() {
            int iM166752a = 0;
            for (C19060a c19060a : this.f145608b) {
                iM166752a += c19060a.m166752a();
            }
            return iM166752a;
        }

        /* JADX INFO: renamed from: d */
        public int m166757d() {
            return this.f145607a * m166756c();
        }
    }

    public o9l0(int i, int[] iArr, C19061b... c19061bArr) {
        this.f145601a = i;
        this.f145602b = iArr;
        this.f145603c = c19061bArr;
        int iM166755b = c19061bArr[0].m166755b();
        int iM166752a = 0;
        for (C19060a c19060a : c19061bArr[0].m166754a()) {
            iM166752a += c19060a.m166752a() * (c19060a.m166753b() + iM166755b);
        }
        this.f145604d = iM166752a;
    }

    /* JADX INFO: renamed from: b */
    public static o9l0[] m166742b() {
        return new o9l0[]{new o9l0(1, new int[0], new C19061b(7, new C19060a(1, 19)), new C19061b(10, new C19060a(1, 16)), new C19061b(13, new C19060a(1, 13)), new C19061b(17, new C19060a(1, 9))), new o9l0(2, new int[]{6, 18}, new C19061b(10, new C19060a(1, 34)), new C19061b(16, new C19060a(1, 28)), new C19061b(22, new C19060a(1, 22)), new C19061b(28, new C19060a(1, 16))), new o9l0(3, new int[]{6, 22}, new C19061b(15, new C19060a(1, 55)), new C19061b(26, new C19060a(1, 44)), new C19061b(18, new C19060a(2, 17)), new C19061b(22, new C19060a(2, 13))), new o9l0(4, new int[]{6, 26}, new C19061b(20, new C19060a(1, 80)), new C19061b(18, new C19060a(2, 32)), new C19061b(26, new C19060a(2, 24)), new C19061b(16, new C19060a(4, 9))), new o9l0(5, new int[]{6, 30}, new C19061b(26, new C19060a(1, 108)), new C19061b(24, new C19060a(2, 43)), new C19061b(18, new C19060a(2, 15), new C19060a(2, 16)), new C19061b(22, new C19060a(2, 11), new C19060a(2, 12))), new o9l0(6, new int[]{6, 34}, new C19061b(18, new C19060a(2, 68)), new C19061b(16, new C19060a(4, 27)), new C19061b(24, new C19060a(4, 19)), new C19061b(28, new C19060a(4, 15))), new o9l0(7, new int[]{6, 22, 38}, new C19061b(20, new C19060a(2, 78)), new C19061b(18, new C19060a(4, 31)), new C19061b(18, new C19060a(2, 14), new C19060a(4, 15)), new C19061b(26, new C19060a(4, 13), new C19060a(1, 14))), new o9l0(8, new int[]{6, 24, 42}, new C19061b(24, new C19060a(2, 97)), new C19061b(22, new C19060a(2, 38), new C19060a(2, 39)), new C19061b(22, new C19060a(4, 18), new C19060a(2, 19)), new C19061b(26, new C19060a(4, 14), new C19060a(2, 15))), new o9l0(9, new int[]{6, 26, 46}, new C19061b(30, new C19060a(2, 116)), new C19061b(22, new C19060a(3, 36), new C19060a(2, 37)), new C19061b(20, new C19060a(4, 16), new C19060a(4, 17)), new C19061b(24, new C19060a(4, 12), new C19060a(4, 13))), new o9l0(10, new int[]{6, 28, 50}, new C19061b(18, new C19060a(2, 68), new C19060a(2, 69)), new C19061b(26, new C19060a(4, 43), new C19060a(1, 44)), new C19061b(24, new C19060a(6, 19), new C19060a(2, 20)), new C19061b(28, new C19060a(6, 15), new C19060a(2, 16))), new o9l0(11, new int[]{6, 30, 54}, new C19061b(20, new C19060a(4, 81)), new C19061b(30, new C19060a(1, 50), new C19060a(4, 51)), new C19061b(28, new C19060a(4, 22), new C19060a(4, 23)), new C19061b(24, new C19060a(3, 12), new C19060a(8, 13))), new o9l0(12, new int[]{6, 32, 58}, new C19061b(24, new C19060a(2, 92), new C19060a(2, 93)), new C19061b(22, new C19060a(6, 36), new C19060a(2, 37)), new C19061b(26, new C19060a(4, 20), new C19060a(6, 21)), new C19061b(28, new C19060a(7, 14), new C19060a(4, 15))), new o9l0(13, new int[]{6, 34, 62}, new C19061b(26, new C19060a(4, 107)), new C19061b(22, new C19060a(8, 37), new C19060a(1, 38)), new C19061b(24, new C19060a(8, 20), new C19060a(4, 21)), new C19061b(22, new C19060a(12, 11), new C19060a(4, 12))), new o9l0(14, new int[]{6, 26, 46, 66}, new C19061b(30, new C19060a(3, 115), new C19060a(1, 116)), new C19061b(24, new C19060a(4, 40), new C19060a(5, 41)), new C19061b(20, new C19060a(11, 16), new C19060a(5, 17)), new C19061b(24, new C19060a(11, 12), new C19060a(5, 13))), new o9l0(15, new int[]{6, 26, 48, 70}, new C19061b(22, new C19060a(5, 87), new C19060a(1, 88)), new C19061b(24, new C19060a(5, 41), new C19060a(5, 42)), new C19061b(30, new C19060a(5, 24), new C19060a(7, 25)), new C19061b(24, new C19060a(11, 12), new C19060a(7, 13))), new o9l0(16, new int[]{6, 26, 50, 74}, new C19061b(24, new C19060a(5, 98), new C19060a(1, 99)), new C19061b(28, new C19060a(7, 45), new C19060a(3, 46)), new C19061b(24, new C19060a(15, 19), new C19060a(2, 20)), new C19061b(30, new C19060a(3, 15), new C19060a(13, 16))), new o9l0(17, new int[]{6, 30, 54, 78}, new C19061b(28, new C19060a(1, 107), new C19060a(5, 108)), new C19061b(28, new C19060a(10, 46), new C19060a(1, 47)), new C19061b(28, new C19060a(1, 22), new C19060a(15, 23)), new C19061b(28, new C19060a(2, 14), new C19060a(17, 15))), new o9l0(18, new int[]{6, 30, 56, 82}, new C19061b(30, new C19060a(5, 120), new C19060a(1, 121)), new C19061b(26, new C19060a(9, 43), new C19060a(4, 44)), new C19061b(28, new C19060a(17, 22), new C19060a(1, 23)), new C19061b(28, new C19060a(2, 14), new C19060a(19, 15))), new o9l0(19, new int[]{6, 30, 58, 86}, new C19061b(28, new C19060a(3, 113), new C19060a(4, 114)), new C19061b(26, new C19060a(3, 44), new C19060a(11, 45)), new C19061b(26, new C19060a(17, 21), new C19060a(4, 22)), new C19061b(26, new C19060a(9, 13), new C19060a(16, 14))), new o9l0(20, new int[]{6, 34, 62, 90}, new C19061b(28, new C19060a(3, 107), new C19060a(5, 108)), new C19061b(26, new C19060a(3, 41), new C19060a(13, 42)), new C19061b(30, new C19060a(15, 24), new C19060a(5, 25)), new C19061b(28, new C19060a(15, 15), new C19060a(10, 16))), new o9l0(21, new int[]{6, 28, 50, 72, 94}, new C19061b(28, new C19060a(4, 116), new C19060a(4, 117)), new C19061b(26, new C19060a(17, 42)), new C19061b(28, new C19060a(17, 22), new C19060a(6, 23)), new C19061b(30, new C19060a(19, 16), new C19060a(6, 17))), new o9l0(22, new int[]{6, 26, 50, 74, 98}, new C19061b(28, new C19060a(2, 111), new C19060a(7, 112)), new C19061b(28, new C19060a(17, 46)), new C19061b(30, new C19060a(7, 24), new C19060a(16, 25)), new C19061b(24, new C19060a(34, 13))), new o9l0(23, new int[]{6, 30, 54, 78, 102}, new C19061b(30, new C19060a(4, 121), new C19060a(5, 122)), new C19061b(28, new C19060a(4, 47), new C19060a(14, 48)), new C19061b(30, new C19060a(11, 24), new C19060a(14, 25)), new C19061b(30, new C19060a(16, 15), new C19060a(14, 16))), new o9l0(24, new int[]{6, 28, 54, 80, 106}, new C19061b(30, new C19060a(6, 117), new C19060a(4, 118)), new C19061b(28, new C19060a(6, 45), new C19060a(14, 46)), new C19061b(30, new C19060a(11, 24), new C19060a(16, 25)), new C19061b(30, new C19060a(30, 16), new C19060a(2, 17))), new o9l0(25, new int[]{6, 32, 58, 84, 110}, new C19061b(26, new C19060a(8, 106), new C19060a(4, 107)), new C19061b(28, new C19060a(8, 47), new C19060a(13, 48)), new C19061b(30, new C19060a(7, 24), new C19060a(22, 25)), new C19061b(30, new C19060a(22, 15), new C19060a(13, 16))), new o9l0(26, new int[]{6, 30, 58, 86, 114}, new C19061b(28, new C19060a(10, 114), new C19060a(2, 115)), new C19061b(28, new C19060a(19, 46), new C19060a(4, 47)), new C19061b(28, new C19060a(28, 22), new C19060a(6, 23)), new C19061b(30, new C19060a(33, 16), new C19060a(4, 17))), new o9l0(27, new int[]{6, 34, 62, 90, 118}, new C19061b(30, new C19060a(8, 122), new C19060a(4, 123)), new C19061b(28, new C19060a(22, 45), new C19060a(3, 46)), new C19061b(30, new C19060a(8, 23), new C19060a(26, 24)), new C19061b(30, new C19060a(12, 15), new C19060a(28, 16))), new o9l0(28, new int[]{6, 26, 50, 74, 98, 122}, new C19061b(30, new C19060a(3, 117), new C19060a(10, 118)), new C19061b(28, new C19060a(3, 45), new C19060a(23, 46)), new C19061b(30, new C19060a(4, 24), new C19060a(31, 25)), new C19061b(30, new C19060a(11, 15), new C19060a(31, 16))), new o9l0(29, new int[]{6, 30, 54, 78, 102, 126}, new C19061b(30, new C19060a(7, 116), new C19060a(7, 117)), new C19061b(28, new C19060a(21, 45), new C19060a(7, 46)), new C19061b(30, new C19060a(1, 23), new C19060a(37, 24)), new C19061b(30, new C19060a(19, 15), new C19060a(26, 16))), new o9l0(30, new int[]{6, 26, 52, 78, 104, 130}, new C19061b(30, new C19060a(5, 115), new C19060a(10, 116)), new C19061b(28, new C19060a(19, 47), new C19060a(10, 48)), new C19061b(30, new C19060a(15, 24), new C19060a(25, 25)), new C19061b(30, new C19060a(23, 15), new C19060a(25, 16))), new o9l0(31, new int[]{6, 30, 56, 82, 108, 134}, new C19061b(30, new C19060a(13, 115), new C19060a(3, 116)), new C19061b(28, new C19060a(2, 46), new C19060a(29, 47)), new C19061b(30, new C19060a(42, 24), new C19060a(1, 25)), new C19061b(30, new C19060a(23, 15), new C19060a(28, 16))), new o9l0(32, new int[]{6, 34, 60, 86, 112, CipherSuite.TLS_PSK_WITH_RC4_128_SHA}, new C19061b(30, new C19060a(17, 115)), new C19061b(28, new C19060a(10, 46), new C19060a(23, 47)), new C19061b(30, new C19060a(10, 24), new C19060a(35, 25)), new C19061b(30, new C19060a(19, 15), new C19060a(35, 16))), new o9l0(33, new int[]{6, 30, 58, 86, 114, CipherSuite.TLS_DHE_PSK_WITH_RC4_128_SHA}, new C19061b(30, new C19060a(17, 115), new C19060a(1, 116)), new C19061b(28, new C19060a(14, 46), new C19060a(21, 47)), new C19061b(30, new C19060a(29, 24), new C19060a(19, 25)), new C19061b(30, new C19060a(11, 15), new C19060a(46, 16))), new o9l0(34, new int[]{6, 34, 62, 90, 118, CipherSuite.TLS_RSA_PSK_WITH_RC4_128_SHA}, new C19061b(30, new C19060a(13, 115), new C19060a(6, 116)), new C19061b(28, new C19060a(14, 46), new C19060a(23, 47)), new C19061b(30, new C19060a(44, 24), new C19060a(7, 25)), new C19061b(30, new C19060a(59, 16), new C19060a(1, 17))), new o9l0(35, new int[]{6, 30, 54, 78, 102, 126, 150}, new C19061b(30, new C19060a(12, 121), new C19060a(7, 122)), new C19061b(28, new C19060a(12, 47), new C19060a(26, 48)), new C19061b(30, new C19060a(39, 24), new C19060a(14, 25)), new C19061b(30, new C19060a(22, 15), new C19060a(41, 16))), new o9l0(36, new int[]{6, 24, 50, 76, 102, 128, 154}, new C19061b(30, new C19060a(6, 121), new C19060a(14, 122)), new C19061b(28, new C19060a(6, 47), new C19060a(34, 48)), new C19061b(30, new C19060a(46, 24), new C19060a(10, 25)), new C19061b(30, new C19060a(2, 15), new C19060a(64, 16))), new o9l0(37, new int[]{6, 28, 54, 80, 106, CipherSuite.TLS_RSA_WITH_CAMELLIA_256_CBC_SHA, 158}, new C19061b(30, new C19060a(17, 122), new C19060a(4, 123)), new C19061b(28, new C19060a(29, 46), new C19060a(14, 47)), new C19061b(30, new C19060a(49, 24), new C19060a(10, 25)), new C19061b(30, new C19060a(24, 15), new C19060a(46, 16))), new o9l0(38, new int[]{6, 32, 58, 84, 110, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA, 162}, new C19061b(30, new C19060a(4, 122), new C19060a(18, 123)), new C19061b(28, new C19060a(13, 46), new C19060a(32, 47)), new C19061b(30, new C19060a(48, 24), new C19060a(14, 25)), new C19061b(30, new C19060a(42, 15), new C19060a(32, 16))), new o9l0(39, new int[]{6, 26, 54, 82, 110, CipherSuite.TLS_PSK_WITH_RC4_128_SHA, 166}, new C19061b(30, new C19060a(20, 117), new C19060a(4, 118)), new C19061b(28, new C19060a(40, 47), new C19060a(7, 48)), new C19061b(30, new C19060a(43, 24), new C19060a(22, 25)), new C19061b(30, new C19060a(10, 15), new C19060a(67, 16))), new o9l0(40, new int[]{6, 30, 58, 86, 114, CipherSuite.TLS_DHE_PSK_WITH_RC4_128_SHA, CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256}, new C19061b(30, new C19060a(19, 118), new C19060a(6, 119)), new C19061b(28, new C19060a(18, 47), new C19060a(31, 48)), new C19061b(30, new C19060a(34, 24), new C19060a(34, 25)), new C19061b(30, new C19060a(20, 15), new C19060a(61, 16)))};
    }

    /* JADX INFO: renamed from: c */
    public static o9l0 m166743c(int i) {
        int i2 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int[] iArr = f145599e;
            if (i3 >= iArr.length) {
                if (i2 <= 3) {
                    return m166745i(i4);
                }
                return null;
            }
            int i5 = iArr[i3];
            if (i5 == i) {
                return m166745i(i3 + 7);
            }
            int iM174889e = q1j.m174889e(i, i5);
            if (iM174889e < i2) {
                i4 = i3 + 7;
                i2 = iM174889e;
            }
            i3++;
        }
    }

    /* JADX INFO: renamed from: g */
    public static o9l0 m166744g(int i) throws FormatException {
        if (i % 4 != 1) {
            throw FormatException.getFormatInstance();
        }
        try {
            return m166745i((i - 17) / 4);
        } catch (IllegalArgumentException unused) {
            throw FormatException.getFormatInstance();
        }
    }

    /* JADX INFO: renamed from: i */
    public static o9l0 m166745i(int i) {
        if (i > 0 && i <= 40) {
            return f145600f[i - 1];
        }
        fig0.m125680a();
        return null;
    }

    /* JADX INFO: renamed from: a */
    public d13 m166746a() {
        int iM166748e = m166748e();
        d13 d13Var = new d13(iM166748e);
        d13Var.m113489p(0, 0, 9, 9);
        int i = iM166748e - 8;
        d13Var.m113489p(i, 0, 8, 9);
        d13Var.m113489p(0, i, 9, 8);
        int length = this.f145602b.length;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = this.f145602b[i2] - 2;
            for (int i4 = 0; i4 < length; i4++) {
                if ((i2 != 0 || (i4 != 0 && i4 != length - 1)) && (i2 != length - 1 || i4 != 0)) {
                    d13Var.m113489p(this.f145602b[i4] - 2, i3, 5, 5);
                }
            }
        }
        int i5 = iM166748e - 17;
        d13Var.m113489p(6, 9, 1, i5);
        d13Var.m113489p(9, 6, i5, 1);
        if (this.f145601a > 6) {
            int i6 = iM166748e - 11;
            d13Var.m113489p(i6, 0, 3, 6);
            d13Var.m113489p(0, i6, 6, 3);
        }
        return d13Var;
    }

    /* JADX INFO: renamed from: d */
    public int[] m166747d() {
        return this.f145602b;
    }

    /* JADX INFO: renamed from: e */
    public int m166748e() {
        return (this.f145601a * 4) + 17;
    }

    /* JADX INFO: renamed from: f */
    public C19061b m166749f(ErrorCorrectionLevel errorCorrectionLevel) {
        return this.f145603c[errorCorrectionLevel.ordinal()];
    }

    /* JADX INFO: renamed from: h */
    public int m166750h() {
        return this.f145604d;
    }

    /* JADX INFO: renamed from: j */
    public int m166751j() {
        return this.f145601a;
    }

    public String toString() {
        return String.valueOf(this.f145601a);
    }
}
