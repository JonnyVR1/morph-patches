package p153l;

import com.google.zxing.WriterException;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes7.dex */
public final class ohx {

    /* JADX INFO: renamed from: a */
    public static final int[][] f147491a = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};

    /* JADX INFO: renamed from: b */
    public static final int[][] f147492b = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};

    /* JADX INFO: renamed from: c */
    public static final int[][] f147493c = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, CipherSuite.TLS_PSK_WITH_RC4_128_SHA, -1}, new int[]{6, 30, 58, 86, 114, CipherSuite.TLS_DHE_PSK_WITH_RC4_128_SHA, -1}, new int[]{6, 34, 62, 90, 118, CipherSuite.TLS_RSA_PSK_WITH_RC4_128_SHA, -1}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, CipherSuite.TLS_RSA_WITH_CAMELLIA_256_CBC_SHA, 158}, new int[]{6, 32, 58, 84, 110, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA, 162}, new int[]{6, 26, 54, 82, 110, CipherSuite.TLS_PSK_WITH_RC4_128_SHA, 166}, new int[]{6, 30, 58, 86, 114, CipherSuite.TLS_DHE_PSK_WITH_RC4_128_SHA, CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256}};

    /* JADX INFO: renamed from: d */
    public static final int[][] f147494d = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    /* JADX INFO: renamed from: a */
    public static void m167743a(b13 b13Var, ErrorCorrectionLevel errorCorrectionLevel, o9l0 o9l0Var, int i, hr3 hr3Var) throws WriterException {
        m167745c(hr3Var);
        m167746d(o9l0Var, hr3Var);
        m167754l(errorCorrectionLevel, i, hr3Var);
        m167761s(o9l0Var, hr3Var);
        m167748f(b13Var, i, hr3Var);
    }

    /* JADX INFO: renamed from: b */
    public static int m167744b(int i, int i2) {
        if (i2 == 0) {
            wg3.m206174a("0 polynomial");
            return 0;
        }
        int iM167756n = m167756n(i2);
        int iM167756n2 = i << (iM167756n - 1);
        while (m167756n(iM167756n2) >= iM167756n) {
            iM167756n2 ^= i2 << (m167756n(iM167756n2) - iM167756n);
        }
        return iM167756n2;
    }

    /* JADX INFO: renamed from: c */
    public static void m167745c(hr3 hr3Var) {
        hr3Var.m136736a((byte) -1);
    }

    /* JADX INFO: renamed from: d */
    public static void m167746d(o9l0 o9l0Var, hr3 hr3Var) throws WriterException {
        m167752j(hr3Var);
        m167747e(hr3Var);
        m167760r(o9l0Var, hr3Var);
        m167753k(hr3Var);
    }

    /* JADX INFO: renamed from: e */
    public static void m167747e(hr3 hr3Var) throws WriterException {
        if (hr3Var.m136737b(8, hr3Var.m136739d() - 8) == 0) {
            throw new WriterException();
        }
        hr3Var.m136741f(8, hr3Var.m136739d() - 8, 1);
    }

    /* JADX INFO: renamed from: f */
    public static void m167748f(b13 b13Var, int i, hr3 hr3Var) throws WriterException {
        boolean zM101398f;
        int iM136740e = hr3Var.m136740e() - 1;
        int iM136739d = hr3Var.m136739d() - 1;
        int i2 = 0;
        int i3 = -1;
        while (iM136740e > 0) {
            if (iM136740e == 6) {
                iM136740e--;
            }
            while (iM136739d >= 0 && iM136739d < hr3Var.m136739d()) {
                for (int i4 = 0; i4 < 2; i4++) {
                    int i5 = iM136740e - i4;
                    if (m167757o(hr3Var.m136737b(i5, iM136739d))) {
                        if (i2 < b13Var.m101402m()) {
                            zM101398f = b13Var.m101398f(i2);
                            i2++;
                        } else {
                            zM101398f = false;
                        }
                        if (i != -1 && k6x.m148584f(i, i5, iM136739d)) {
                            zM101398f = !zM101398f;
                        }
                        hr3Var.m136742g(i5, iM136739d, zM101398f);
                    }
                }
                iM136739d += i3;
            }
            i3 = -i3;
            iM136739d += i3;
            iM136740e -= 2;
        }
        if (i2 == b13Var.m101402m()) {
            return;
        }
        throw new WriterException("Not all bits consumed: " + i2 + '/' + b13Var.m101402m());
    }

    /* JADX INFO: renamed from: g */
    public static void m167749g(int i, int i2, hr3 hr3Var) throws WriterException {
        for (int i3 = 0; i3 < 8; i3++) {
            int i4 = i + i3;
            if (!m167757o(hr3Var.m136737b(i4, i2))) {
                throw new WriterException();
            }
            hr3Var.m136741f(i4, i2, 0);
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m167750h(int i, int i2, hr3 hr3Var) {
        for (int i3 = 0; i3 < 5; i3++) {
            int[] iArr = f147492b[i3];
            for (int i4 = 0; i4 < 5; i4++) {
                hr3Var.m136741f(i + i4, i2 + i3, iArr[i4]);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m167751i(int i, int i2, hr3 hr3Var) {
        for (int i3 = 0; i3 < 7; i3++) {
            int[] iArr = f147491a[i3];
            for (int i4 = 0; i4 < 7; i4++) {
                hr3Var.m136741f(i + i4, i2 + i3, iArr[i4]);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m167752j(hr3 hr3Var) throws WriterException {
        int length = f147491a[0].length;
        m167751i(0, 0, hr3Var);
        m167751i(hr3Var.m136740e() - length, 0, hr3Var);
        m167751i(0, hr3Var.m136740e() - length, hr3Var);
        m167749g(0, 7, hr3Var);
        m167749g(hr3Var.m136740e() - 8, 7, hr3Var);
        m167749g(0, hr3Var.m136740e() - 8, hr3Var);
        m167755m(7, 0, hr3Var);
        m167755m(hr3Var.m136739d() - 8, 0, hr3Var);
        m167755m(7, hr3Var.m136739d() - 7, hr3Var);
    }

    /* JADX INFO: renamed from: k */
    public static void m167753k(hr3 hr3Var) {
        int i = 8;
        while (i < hr3Var.m136740e() - 8) {
            int i2 = i + 1;
            int i3 = i2 % 2;
            if (m167757o(hr3Var.m136737b(i, 6))) {
                hr3Var.m136741f(i, 6, i3);
            }
            if (m167757o(hr3Var.m136737b(6, i))) {
                hr3Var.m136741f(6, i, i3);
            }
            i = i2;
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m167754l(ErrorCorrectionLevel errorCorrectionLevel, int i, hr3 hr3Var) throws WriterException {
        b13 b13Var = new b13();
        m167758p(errorCorrectionLevel, i, b13Var);
        for (int i2 = 0; i2 < b13Var.m101402m(); i2++) {
            boolean zM101398f = b13Var.m101398f((b13Var.m101402m() - 1) - i2);
            int[] iArr = f147494d[i2];
            hr3Var.m136742g(iArr[0], iArr[1], zM101398f);
            if (i2 < 8) {
                hr3Var.m136742g((hr3Var.m136740e() - i2) - 1, 8, zM101398f);
            } else {
                hr3Var.m136742g(8, (hr3Var.m136739d() - 7) + (i2 - 8), zM101398f);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m167755m(int i, int i2, hr3 hr3Var) throws WriterException {
        for (int i3 = 0; i3 < 7; i3++) {
            int i4 = i2 + i3;
            if (!m167757o(hr3Var.m136737b(i, i4))) {
                throw new WriterException();
            }
            hr3Var.m136741f(i, i4, 0);
        }
    }

    /* JADX INFO: renamed from: n */
    public static int m167756n(int i) {
        return 32 - Integer.numberOfLeadingZeros(i);
    }

    /* JADX INFO: renamed from: o */
    public static boolean m167757o(int i) {
        return i == -1;
    }

    /* JADX INFO: renamed from: p */
    public static void m167758p(ErrorCorrectionLevel errorCorrectionLevel, int i, b13 b13Var) throws WriterException {
        if (!ivb0.m142277b(i)) {
            throw new WriterException("Invalid mask pattern");
        }
        int bits = (errorCorrectionLevel.getBits() << 3) | i;
        b13Var.m101395c(bits, 5);
        b13Var.m101395c(m167744b(bits, 1335), 10);
        b13 b13Var2 = new b13();
        b13Var2.m101395c(21522, 15);
        b13Var.m101409u(b13Var2);
        if (b13Var.m101402m() == 15) {
            return;
        }
        throw new WriterException("should not happen but we got: " + b13Var.m101402m());
    }

    /* JADX INFO: renamed from: q */
    public static void m167759q(o9l0 o9l0Var, b13 b13Var) throws WriterException {
        b13Var.m101395c(o9l0Var.m166751j(), 6);
        b13Var.m101395c(m167744b(o9l0Var.m166751j(), 7973), 12);
        if (b13Var.m101402m() == 18) {
            return;
        }
        throw new WriterException("should not happen but we got: " + b13Var.m101402m());
    }

    /* JADX INFO: renamed from: r */
    public static void m167760r(o9l0 o9l0Var, hr3 hr3Var) {
        if (o9l0Var.m166751j() < 2) {
            return;
        }
        int[] iArr = f147493c[o9l0Var.m166751j() - 1];
        for (int i : iArr) {
            if (i >= 0) {
                for (int i2 : iArr) {
                    if (i2 >= 0 && m167757o(hr3Var.m136737b(i2, i))) {
                        m167750h(i2 - 2, i - 2, hr3Var);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m167761s(o9l0 o9l0Var, hr3 hr3Var) throws WriterException {
        if (o9l0Var.m166751j() < 7) {
            return;
        }
        b13 b13Var = new b13();
        m167759q(o9l0Var, b13Var);
        int i = 17;
        for (int i2 = 0; i2 < 6; i2++) {
            for (int i3 = 0; i3 < 3; i3++) {
                boolean zM101398f = b13Var.m101398f(i);
                i--;
                hr3Var.m136742g(i2, (hr3Var.m136739d() - 11) + i3, zM101398f);
                hr3Var.m136742g((hr3Var.m136739d() - 11) + i3, i2, zM101398f);
            }
        }
    }
}
