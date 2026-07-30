package p149l;

import com.google.zxing.WriterException;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes7.dex */
public final class pex {

    /* JADX INFO: renamed from: a */
    public static final int[][] f148501a = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};

    /* JADX INFO: renamed from: b */
    public static final int[][] f148502b = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};

    /* JADX INFO: renamed from: c */
    public static final int[][] f148503c = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, CipherSuite.TLS_PSK_WITH_RC4_128_SHA, -1}, new int[]{6, 30, 58, 86, 114, CipherSuite.TLS_DHE_PSK_WITH_RC4_128_SHA, -1}, new int[]{6, 34, 62, 90, 118, CipherSuite.TLS_RSA_PSK_WITH_RC4_128_SHA, -1}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, CipherSuite.TLS_RSA_WITH_CAMELLIA_256_CBC_SHA, 158}, new int[]{6, 32, 58, 84, 110, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA, 162}, new int[]{6, 26, 54, 82, 110, CipherSuite.TLS_PSK_WITH_RC4_128_SHA, 166}, new int[]{6, 30, 58, 86, 114, CipherSuite.TLS_DHE_PSK_WITH_RC4_128_SHA, CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256}};

    /* JADX INFO: renamed from: d */
    public static final int[][] f148504d = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    /* JADX INFO: renamed from: a */
    public static void m168562a(m03 m03Var, ErrorCorrectionLevel errorCorrectionLevel, j0l0 j0l0Var, int i, hq3 hq3Var) throws WriterException {
        m168564c(hq3Var);
        m168565d(j0l0Var, hq3Var);
        m168573l(errorCorrectionLevel, i, hq3Var);
        m168580s(j0l0Var, hq3Var);
        m168567f(m03Var, i, hq3Var);
    }

    /* JADX INFO: renamed from: b */
    public static int m168563b(int i, int i2) {
        if (i2 == 0) {
            ig3.m135964a("0 polynomial");
            return 0;
        }
        int iM168575n = m168575n(i2);
        int iM168575n2 = i << (iM168575n - 1);
        while (m168575n(iM168575n2) >= iM168575n) {
            iM168575n2 ^= i2 << (m168575n(iM168575n2) - iM168575n);
        }
        return iM168575n2;
    }

    /* JADX INFO: renamed from: c */
    public static void m168564c(hq3 hq3Var) {
        hq3Var.m132421a((byte) -1);
    }

    /* JADX INFO: renamed from: d */
    public static void m168565d(j0l0 j0l0Var, hq3 hq3Var) throws WriterException {
        m168571j(hq3Var);
        m168566e(hq3Var);
        m168579r(j0l0Var, hq3Var);
        m168572k(hq3Var);
    }

    /* JADX INFO: renamed from: e */
    public static void m168566e(hq3 hq3Var) throws WriterException {
        if (hq3Var.m132422b(8, hq3Var.m132424d() - 8) == 0) {
            throw new WriterException();
        }
        hq3Var.m132426f(8, hq3Var.m132424d() - 8, 1);
    }

    /* JADX INFO: renamed from: f */
    public static void m168567f(m03 m03Var, int i, hq3 hq3Var) throws WriterException {
        boolean zM152490f;
        int iM132425e = hq3Var.m132425e() - 1;
        int iM132424d = hq3Var.m132424d() - 1;
        int i2 = 0;
        int i3 = -1;
        while (iM132425e > 0) {
            if (iM132425e == 6) {
                iM132425e--;
            }
            while (iM132424d >= 0 && iM132424d < hq3Var.m132424d()) {
                for (int i4 = 0; i4 < 2; i4++) {
                    int i5 = iM132425e - i4;
                    if (m168576o(hq3Var.m132422b(i5, iM132424d))) {
                        if (i2 < m03Var.m152494m()) {
                            zM152490f = m03Var.m152490f(i2);
                            i2++;
                        } else {
                            zM152490f = false;
                        }
                        if (i != -1 && l3x.m148415f(i, i5, iM132424d)) {
                            zM152490f = !zM152490f;
                        }
                        hq3Var.m132427g(i5, iM132424d, zM152490f);
                    }
                }
                iM132424d += i3;
            }
            i3 = -i3;
            iM132424d += i3;
            iM132425e -= 2;
        }
        if (i2 == m03Var.m152494m()) {
            return;
        }
        throw new WriterException("Not all bits consumed: " + i2 + '/' + m03Var.m152494m());
    }

    /* JADX INFO: renamed from: g */
    public static void m168568g(int i, int i2, hq3 hq3Var) throws WriterException {
        for (int i3 = 0; i3 < 8; i3++) {
            int i4 = i + i3;
            if (!m168576o(hq3Var.m132422b(i4, i2))) {
                throw new WriterException();
            }
            hq3Var.m132426f(i4, i2, 0);
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m168569h(int i, int i2, hq3 hq3Var) {
        for (int i3 = 0; i3 < 5; i3++) {
            int[] iArr = f148502b[i3];
            for (int i4 = 0; i4 < 5; i4++) {
                hq3Var.m132426f(i + i4, i2 + i3, iArr[i4]);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m168570i(int i, int i2, hq3 hq3Var) {
        for (int i3 = 0; i3 < 7; i3++) {
            int[] iArr = f148501a[i3];
            for (int i4 = 0; i4 < 7; i4++) {
                hq3Var.m132426f(i + i4, i2 + i3, iArr[i4]);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m168571j(hq3 hq3Var) throws WriterException {
        int length = f148501a[0].length;
        m168570i(0, 0, hq3Var);
        m168570i(hq3Var.m132425e() - length, 0, hq3Var);
        m168570i(0, hq3Var.m132425e() - length, hq3Var);
        m168568g(0, 7, hq3Var);
        m168568g(hq3Var.m132425e() - 8, 7, hq3Var);
        m168568g(0, hq3Var.m132425e() - 8, hq3Var);
        m168574m(7, 0, hq3Var);
        m168574m(hq3Var.m132424d() - 8, 0, hq3Var);
        m168574m(7, hq3Var.m132424d() - 7, hq3Var);
    }

    /* JADX INFO: renamed from: k */
    public static void m168572k(hq3 hq3Var) {
        int i = 8;
        while (i < hq3Var.m132425e() - 8) {
            int i2 = i + 1;
            int i3 = i2 % 2;
            if (m168576o(hq3Var.m132422b(i, 6))) {
                hq3Var.m132426f(i, 6, i3);
            }
            if (m168576o(hq3Var.m132422b(6, i))) {
                hq3Var.m132426f(6, i, i3);
            }
            i = i2;
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m168573l(ErrorCorrectionLevel errorCorrectionLevel, int i, hq3 hq3Var) throws WriterException {
        m03 m03Var = new m03();
        m168577p(errorCorrectionLevel, i, m03Var);
        for (int i2 = 0; i2 < m03Var.m152494m(); i2++) {
            boolean zM152490f = m03Var.m152490f((m03Var.m152494m() - 1) - i2);
            int[] iArr = f148504d[i2];
            hq3Var.m132427g(iArr[0], iArr[1], zM152490f);
            if (i2 < 8) {
                hq3Var.m132427g((hq3Var.m132425e() - i2) - 1, 8, zM152490f);
            } else {
                hq3Var.m132427g(8, (hq3Var.m132424d() - 7) + (i2 - 8), zM152490f);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m168574m(int i, int i2, hq3 hq3Var) throws WriterException {
        for (int i3 = 0; i3 < 7; i3++) {
            int i4 = i2 + i3;
            if (!m168576o(hq3Var.m132422b(i, i4))) {
                throw new WriterException();
            }
            hq3Var.m132426f(i, i4, 0);
        }
    }

    /* JADX INFO: renamed from: n */
    public static int m168575n(int i) {
        return 32 - Integer.numberOfLeadingZeros(i);
    }

    /* JADX INFO: renamed from: o */
    public static boolean m168576o(int i) {
        return i == -1;
    }

    /* JADX INFO: renamed from: p */
    public static void m168577p(ErrorCorrectionLevel errorCorrectionLevel, int i, m03 m03Var) throws WriterException {
        if (!enb0.m117250b(i)) {
            throw new WriterException("Invalid mask pattern");
        }
        int bits = (errorCorrectionLevel.getBits() << 3) | i;
        m03Var.m152487c(bits, 5);
        m03Var.m152487c(m168563b(bits, 1335), 10);
        m03 m03Var2 = new m03();
        m03Var2.m152487c(21522, 15);
        m03Var.m152501u(m03Var2);
        if (m03Var.m152494m() == 15) {
            return;
        }
        throw new WriterException("should not happen but we got: " + m03Var.m152494m());
    }

    /* JADX INFO: renamed from: q */
    public static void m168578q(j0l0 j0l0Var, m03 m03Var) throws WriterException {
        m03Var.m152487c(j0l0Var.m139175j(), 6);
        m03Var.m152487c(m168563b(j0l0Var.m139175j(), 7973), 12);
        if (m03Var.m152494m() == 18) {
            return;
        }
        throw new WriterException("should not happen but we got: " + m03Var.m152494m());
    }

    /* JADX INFO: renamed from: r */
    public static void m168579r(j0l0 j0l0Var, hq3 hq3Var) {
        if (j0l0Var.m139175j() < 2) {
            return;
        }
        int[] iArr = f148503c[j0l0Var.m139175j() - 1];
        for (int i : iArr) {
            if (i >= 0) {
                for (int i2 : iArr) {
                    if (i2 >= 0 && m168576o(hq3Var.m132422b(i2, i))) {
                        m168569h(i2 - 2, i - 2, hq3Var);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m168580s(j0l0 j0l0Var, hq3 hq3Var) throws WriterException {
        if (j0l0Var.m139175j() < 7) {
            return;
        }
        m03 m03Var = new m03();
        m168578q(j0l0Var, m03Var);
        int i = 17;
        for (int i2 = 0; i2 < 6; i2++) {
            for (int i3 = 0; i3 < 3; i3++) {
                boolean zM152490f = m03Var.m152490f(i);
                i--;
                hq3Var.m132427g(i2, (hq3Var.m132424d() - 11) + i3, zM152490f);
                hq3Var.m132427g((hq3Var.m132424d() - 11) + i3, i2, zM152490f);
            }
        }
    }
}
