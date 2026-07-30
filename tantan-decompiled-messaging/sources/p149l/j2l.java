package p149l;

import com.google.android.gms.common.api.Api;
import com.google.zxing.datamatrix.encoder.SymbolShapeHint;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class j2l {
    /* JADX INFO: renamed from: a */
    public static int m139465a(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = 0;
        if (i < length) {
            char cCharAt = charSequence.charAt(i);
            while (m139470f(cCharAt) && i < length) {
                i2++;
                i++;
                if (i < length) {
                    cCharAt = charSequence.charAt(i);
                }
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: b */
    public static String m139466b(String str, SymbolShapeHint symbolShapeHint, e1e e1eVar, e1e e1eVar2) {
        int iM186765e = 0;
        pze[] pzeVarArr = {new C20329u1(), new zq3(), new sii0(), new pbq0(), new jje(), new fe2()};
        sze szeVar = new sze(str);
        szeVar.m186774n(symbolShapeHint);
        szeVar.m186772l(e1eVar, e1eVar2);
        if (str.startsWith("[)>\u001e05\u001d") && str.endsWith("\u001e\u0004")) {
            szeVar.m186778r((char) 236);
            szeVar.m186773m(2);
            szeVar.f167052f += 7;
        } else if (str.startsWith("[)>\u001e06\u001d") && str.endsWith("\u001e\u0004")) {
            szeVar.m186778r((char) 237);
            szeVar.m186773m(2);
            szeVar.f167052f += 7;
        }
        while (szeVar.m186769i()) {
            pzeVarArr[iM186765e].mo121015a(szeVar);
            if (szeVar.m186765e() >= 0) {
                iM186765e = szeVar.m186765e();
                szeVar.m186770j();
            }
        }
        int iM186761a = szeVar.m186761a();
        szeVar.m186776p();
        int iM218473a = szeVar.m186767g().m218473a();
        if (iM186761a < iM218473a && iM186765e != 0 && iM186765e != 5 && iM186765e != 4) {
            szeVar.m186778r((char) 254);
        }
        StringBuilder sbM186762b = szeVar.m186762b();
        if (sbM186762b.length() < iM218473a) {
            sbM186762b.append((char) 129);
        }
        while (sbM186762b.length() < iM218473a) {
            sbM186762b.append(m139479o((char) 129, sbM186762b.length() + 1));
        }
        return szeVar.m186762b().toString();
    }

    /* JADX INFO: renamed from: c */
    public static int m139467c(float[] fArr, int[] iArr, int i, byte[] bArr) {
        Arrays.fill(bArr, (byte) 0);
        for (int i2 = 0; i2 < 6; i2++) {
            int iCeil = (int) Math.ceil(fArr[i2]);
            iArr[i2] = iCeil;
            if (i > iCeil) {
                Arrays.fill(bArr, (byte) 0);
                i = iCeil;
            }
            if (i == iCeil) {
                bArr[i2] = (byte) (bArr[i2] + 1);
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: d */
    public static int m139468d(byte[] bArr) {
        int i = 0;
        for (int i2 = 0; i2 < 6; i2++) {
            i += bArr[i2];
        }
        return i;
    }

    /* JADX INFO: renamed from: e */
    public static void m139469e(char c) {
        String hexString = Integer.toHexString(c);
        throw new IllegalArgumentException("Illegal character: " + c + " (0x" + "0000".substring(0, 4 - hexString.length()).concat(hexString) + ')');
    }

    /* JADX INFO: renamed from: f */
    public static boolean m139470f(char c) {
        return c >= '0' && c <= '9';
    }

    /* JADX INFO: renamed from: g */
    public static boolean m139471g(char c) {
        return c >= 128 && c <= 255;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m139472h(char c) {
        if (c == ' ') {
            return true;
        }
        if (c < '0' || c > '9') {
            return c >= 'A' && c <= 'Z';
        }
        return true;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m139473i(char c) {
        return c >= ' ' && c <= '^';
    }

    /* JADX INFO: renamed from: j */
    public static boolean m139474j(char c) {
        if (c == ' ') {
            return true;
        }
        if (c < '0' || c > '9') {
            return c >= 'a' && c <= 'z';
        }
        return true;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m139475k(char c) {
        if (m139477m(c) || c == ' ') {
            return true;
        }
        if (c < '0' || c > '9') {
            return c >= 'A' && c <= 'Z';
        }
        return true;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m139476l(char c) {
        return false;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m139477m(char c) {
        return c == '\r' || c == '*' || c == '>';
    }

    /* JADX INFO: renamed from: n */
    public static int m139478n(CharSequence charSequence, int i, int i2) {
        float[] fArr;
        float f;
        if (i >= charSequence.length()) {
            return i2;
        }
        float f2 = 2.0f;
        float f3 = 1.0f;
        int i3 = 5;
        if (i2 == 0) {
            fArr = new float[]{0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.25f};
        } else {
            fArr = new float[6];
            fArr[0] = 1.0f;
            fArr[1] = 2.0f;
            fArr[2] = 2.0f;
            fArr[3] = 2.0f;
            fArr[4] = 2.0f;
            fArr[5] = 2.25f;
            fArr[i2] = 0.0f;
        }
        int i4 = 0;
        while (true) {
            int i5 = i + i4;
            if (i5 == charSequence.length()) {
                byte[] bArr = new byte[6];
                int[] iArr = new int[6];
                int iM139467c = m139467c(fArr, iArr, Api.BaseClientBuilder.API_PRIORITY_OTHER, bArr);
                int iM139468d = m139468d(bArr);
                if (iArr[0] == iM139467c) {
                    return 0;
                }
                if (iM139468d == 1 && bArr[i3] > 0) {
                    return i3;
                }
                if (iM139468d == 1 && bArr[4] > 0) {
                    return 4;
                }
                if (iM139468d != 1 || bArr[2] <= 0) {
                    return (iM139468d != 1 || bArr[3] <= 0) ? 1 : 3;
                }
                return 2;
            }
            char cCharAt = charSequence.charAt(i5);
            i4++;
            if (m139470f(cCharAt)) {
                fArr[0] = fArr[0] + 0.5f;
                f = f3;
            } else if (m139471g(cCharAt)) {
                f = f3;
                float fCeil = (float) Math.ceil(fArr[0]);
                fArr[0] = fCeil;
                fArr[0] = fCeil + f2;
            } else {
                f = f3;
                float fCeil2 = (float) Math.ceil(fArr[0]);
                fArr[0] = fCeil2;
                fArr[0] = fCeil2 + f;
            }
            if (m139472h(cCharAt)) {
                fArr[1] = fArr[1] + 0.6666667f;
            } else if (m139471g(cCharAt)) {
                fArr[1] = fArr[1] + 2.6666667f;
            } else {
                fArr[1] = fArr[1] + 1.3333334f;
            }
            if (m139474j(cCharAt)) {
                fArr[2] = fArr[2] + 0.6666667f;
            } else if (m139471g(cCharAt)) {
                fArr[2] = fArr[2] + 2.6666667f;
            } else {
                fArr[2] = fArr[2] + 1.3333334f;
            }
            if (m139475k(cCharAt)) {
                fArr[3] = fArr[3] + 0.6666667f;
            } else if (m139471g(cCharAt)) {
                fArr[3] = fArr[3] + 4.3333335f;
            } else {
                fArr[3] = fArr[3] + 3.3333333f;
            }
            if (m139473i(cCharAt)) {
                fArr[4] = fArr[4] + 0.75f;
            } else if (m139471g(cCharAt)) {
                fArr[4] = fArr[4] + 4.25f;
            } else {
                fArr[4] = fArr[4] + 3.25f;
            }
            if (m139476l(cCharAt)) {
                fArr[i3] = fArr[i3] + 4.0f;
            } else {
                fArr[i3] = fArr[i3] + f;
            }
            if (i4 >= 4) {
                int[] iArr2 = new int[6];
                byte[] bArr2 = new byte[6];
                m139467c(fArr, iArr2, Api.BaseClientBuilder.API_PRIORITY_OTHER, bArr2);
                int iM139468d2 = m139468d(bArr2);
                int i6 = iArr2[0];
                int i7 = iArr2[i3];
                if (i6 < i7 && i6 < iArr2[1] && i6 < iArr2[2] && i6 < iArr2[3] && i6 < iArr2[4]) {
                    return 0;
                }
                if (i7 >= i6) {
                    byte b = bArr2[1];
                    byte b2 = bArr2[2];
                    byte b3 = bArr2[3];
                    byte b4 = bArr2[4];
                    if (b + b2 + b3 + b4 != 0) {
                        if (iM139468d2 == 1 && b4 > 0) {
                            return 4;
                        }
                        if (iM139468d2 == 1 && b2 > 0) {
                            return 2;
                        }
                        if (iM139468d2 == 1 && b3 > 0) {
                            return 3;
                        }
                        int i8 = iArr2[1];
                        if (i8 + 1 < i6 && i8 + 1 < i7 && i8 + 1 < iArr2[4] && i8 + 1 < iArr2[2]) {
                            int i9 = iArr2[3];
                            if (i8 < i9) {
                                return 1;
                            }
                            if (i8 == i9) {
                                for (int i10 = i + i4 + 1; i10 < charSequence.length(); i10++) {
                                    char cCharAt2 = charSequence.charAt(i10);
                                    if (m139477m(cCharAt2)) {
                                        return 3;
                                    }
                                    if (!m139475k(cCharAt2)) {
                                        break;
                                    }
                                }
                                return 1;
                            }
                        }
                    }
                }
                return i3;
            }
            f3 = f;
            i3 = i3;
            f2 = 2.0f;
        }
    }

    /* JADX INFO: renamed from: o */
    public static char m139479o(char c, int i) {
        int i2 = c + ((i * 149) % 253) + 1;
        if (i2 > 254) {
            i2 -= 254;
        }
        return (char) i2;
    }
}
