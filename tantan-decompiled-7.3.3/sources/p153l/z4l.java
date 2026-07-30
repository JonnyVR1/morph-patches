package p153l;

import com.google.android.gms.common.api.Api;
import com.google.zxing.datamatrix.encoder.SymbolShapeHint;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class z4l {
    /* JADX INFO: renamed from: a */
    public static int m218593a(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = 0;
        if (i < length) {
            char cCharAt = charSequence.charAt(i);
            while (m218598f(cCharAt) && i < length) {
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
    public static String m218594b(String str, SymbolShapeHint symbolShapeHint, s2e s2eVar, s2e s2eVar2) {
        int iM204147e = 0;
        t0f[] t0fVarArr = {new C20445u1(), new yr3(), new sri0(), new ukq0(), new nke(), new me2()};
        w0f w0fVar = new w0f(str);
        w0fVar.m204156n(symbolShapeHint);
        w0fVar.m204154l(s2eVar, s2eVar2);
        if (str.startsWith("[)>\u001e05\u001d") && str.endsWith("\u001e\u0004")) {
            w0fVar.m204160r((char) 236);
            w0fVar.m204155m(2);
            w0fVar.f186568f += 7;
        } else if (str.startsWith("[)>\u001e06\u001d") && str.endsWith("\u001e\u0004")) {
            w0fVar.m204160r((char) 237);
            w0fVar.m204155m(2);
            w0fVar.f186568f += 7;
        }
        while (w0fVar.m204151i()) {
            t0fVarArr[iM204147e].mo158010a(w0fVar);
            if (w0fVar.m204147e() >= 0) {
                iM204147e = w0fVar.m204147e();
                w0fVar.m204152j();
            }
        }
        int iM204143a = w0fVar.m204143a();
        w0fVar.m204158p();
        int iM136421a = w0fVar.m204149g().m136421a();
        if (iM204143a < iM136421a && iM204147e != 0 && iM204147e != 5 && iM204147e != 4) {
            w0fVar.m204160r((char) 254);
        }
        StringBuilder sbM204144b = w0fVar.m204144b();
        if (sbM204144b.length() < iM136421a) {
            sbM204144b.append((char) 129);
        }
        while (sbM204144b.length() < iM136421a) {
            sbM204144b.append(m218607o((char) 129, sbM204144b.length() + 1));
        }
        return w0fVar.m204144b().toString();
    }

    /* JADX INFO: renamed from: c */
    public static int m218595c(float[] fArr, int[] iArr, int i, byte[] bArr) {
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
    public static int m218596d(byte[] bArr) {
        int i = 0;
        for (int i2 = 0; i2 < 6; i2++) {
            i += bArr[i2];
        }
        return i;
    }

    /* JADX INFO: renamed from: e */
    public static void m218597e(char c) {
        String hexString = Integer.toHexString(c);
        throw new IllegalArgumentException("Illegal character: " + c + " (0x" + "0000".substring(0, 4 - hexString.length()).concat(hexString) + ')');
    }

    /* JADX INFO: renamed from: f */
    public static boolean m218598f(char c) {
        return c >= '0' && c <= '9';
    }

    /* JADX INFO: renamed from: g */
    public static boolean m218599g(char c) {
        return c >= 128 && c <= 255;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m218600h(char c) {
        if (c == ' ') {
            return true;
        }
        if (c < '0' || c > '9') {
            return c >= 'A' && c <= 'Z';
        }
        return true;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m218601i(char c) {
        return c >= ' ' && c <= '^';
    }

    /* JADX INFO: renamed from: j */
    public static boolean m218602j(char c) {
        if (c == ' ') {
            return true;
        }
        if (c < '0' || c > '9') {
            return c >= 'a' && c <= 'z';
        }
        return true;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m218603k(char c) {
        if (m218605m(c) || c == ' ') {
            return true;
        }
        if (c < '0' || c > '9') {
            return c >= 'A' && c <= 'Z';
        }
        return true;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m218604l(char c) {
        return false;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m218605m(char c) {
        return c == '\r' || c == '*' || c == '>';
    }

    /* JADX INFO: renamed from: n */
    public static int m218606n(CharSequence charSequence, int i, int i2) {
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
                int iM218595c = m218595c(fArr, iArr, Api.BaseClientBuilder.API_PRIORITY_OTHER, bArr);
                int iM218596d = m218596d(bArr);
                if (iArr[0] == iM218595c) {
                    return 0;
                }
                if (iM218596d == 1 && bArr[i3] > 0) {
                    return i3;
                }
                if (iM218596d == 1 && bArr[4] > 0) {
                    return 4;
                }
                if (iM218596d != 1 || bArr[2] <= 0) {
                    return (iM218596d != 1 || bArr[3] <= 0) ? 1 : 3;
                }
                return 2;
            }
            char cCharAt = charSequence.charAt(i5);
            i4++;
            if (m218598f(cCharAt)) {
                fArr[0] = fArr[0] + 0.5f;
                f = f3;
            } else if (m218599g(cCharAt)) {
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
            if (m218600h(cCharAt)) {
                fArr[1] = fArr[1] + 0.6666667f;
            } else if (m218599g(cCharAt)) {
                fArr[1] = fArr[1] + 2.6666667f;
            } else {
                fArr[1] = fArr[1] + 1.3333334f;
            }
            if (m218602j(cCharAt)) {
                fArr[2] = fArr[2] + 0.6666667f;
            } else if (m218599g(cCharAt)) {
                fArr[2] = fArr[2] + 2.6666667f;
            } else {
                fArr[2] = fArr[2] + 1.3333334f;
            }
            if (m218603k(cCharAt)) {
                fArr[3] = fArr[3] + 0.6666667f;
            } else if (m218599g(cCharAt)) {
                fArr[3] = fArr[3] + 4.3333335f;
            } else {
                fArr[3] = fArr[3] + 3.3333333f;
            }
            if (m218601i(cCharAt)) {
                fArr[4] = fArr[4] + 0.75f;
            } else if (m218599g(cCharAt)) {
                fArr[4] = fArr[4] + 4.25f;
            } else {
                fArr[4] = fArr[4] + 3.25f;
            }
            if (m218604l(cCharAt)) {
                fArr[i3] = fArr[i3] + 4.0f;
            } else {
                fArr[i3] = fArr[i3] + f;
            }
            if (i4 >= 4) {
                int[] iArr2 = new int[6];
                byte[] bArr2 = new byte[6];
                m218595c(fArr, iArr2, Api.BaseClientBuilder.API_PRIORITY_OTHER, bArr2);
                int iM218596d2 = m218596d(bArr2);
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
                        if (iM218596d2 == 1 && b4 > 0) {
                            return 4;
                        }
                        if (iM218596d2 == 1 && b2 > 0) {
                            return 2;
                        }
                        if (iM218596d2 == 1 && b3 > 0) {
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
                                    if (m218605m(cCharAt2)) {
                                        return 3;
                                    }
                                    if (!m218603k(cCharAt2)) {
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
    public static char m218607o(char c, int i) {
        int i2 = c + ((i * 149) % 253) + 1;
        if (i2 > 254) {
            i2 -= 254;
        }
        return (char) i2;
    }
}
