package p153l;

import com.google.android.gms.common.api.Api;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.CharacterSetECI;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.Mode;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class u0f {

    /* JADX INFO: renamed from: a */
    public static final int[] f176878a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    /* JADX INFO: renamed from: l.u0f$a */
    public static /* synthetic */ class C20441a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f176879a;

        static {
            int[] iArr = new int[Mode.values().length];
            f176879a = iArr;
            try {
                iArr[Mode.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f176879a[Mode.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f176879a[Mode.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f176879a[Mode.KANJI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m193809a(String str, b13 b13Var, String str2) throws WriterException {
        try {
            for (byte b : str.getBytes(str2)) {
                b13Var.m101395c(b, 8);
            }
        } catch (UnsupportedEncodingException e) {
            throw new WriterException(e);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m193810b(CharSequence charSequence, b13 b13Var) throws WriterException {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int iM193824p = m193824p(charSequence.charAt(i));
            if (iM193824p == -1) {
                throw new WriterException();
            }
            int i2 = i + 1;
            if (i2 < length) {
                int iM193824p2 = m193824p(charSequence.charAt(i2));
                if (iM193824p2 == -1) {
                    throw new WriterException();
                }
                b13Var.m101395c((iM193824p * 45) + iM193824p2, 11);
                i += 2;
            } else {
                b13Var.m101395c(iM193824p, 6);
                i = i2;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m193811c(String str, Mode mode, b13 b13Var, String str2) throws WriterException {
        int i = C20441a.f176879a[mode.ordinal()];
        if (i == 1) {
            m193816h(str, b13Var);
            return;
        }
        if (i == 2) {
            m193810b(str, b13Var);
        } else if (i == 3) {
            m193809a(str, b13Var, str2);
        } else {
            if (i != 4) {
                throw new WriterException("Invalid mode: ".concat(String.valueOf(mode)));
            }
            m193813e(str, b13Var);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m193812d(CharacterSetECI characterSetECI, b13 b13Var) {
        b13Var.m101395c(Mode.ECI.getBits(), 4);
        b13Var.m101395c(characterSetECI.getValue(), 8);
    }

    /* JADX INFO: renamed from: e */
    public static void m193813e(String str, b13 b13Var) throws WriterException {
        int i;
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            int length = bytes.length;
            for (int i2 = 0; i2 < length; i2 += 2) {
                int i3 = ((bytes[i2] & 255) << 8) | (bytes[i2 + 1] & 255);
                int i4 = 33088;
                if (i3 >= 33088 && i3 <= 40956) {
                    i = i3 - i4;
                } else if (i3 < 57408 || i3 > 60351) {
                    i = -1;
                } else {
                    i4 = 49472;
                    i = i3 - i4;
                }
                if (i == -1) {
                    throw new WriterException("Invalid byte sequence");
                }
                b13Var.m101395c(((i >> 8) * 192) + (i & 255), 13);
            }
        } catch (UnsupportedEncodingException e) {
            throw new WriterException(e);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m193814f(int i, o9l0 o9l0Var, Mode mode, b13 b13Var) throws WriterException {
        int characterCountBits = mode.getCharacterCountBits(o9l0Var);
        int i2 = 1 << characterCountBits;
        if (i < i2) {
            b13Var.m101395c(i, characterCountBits);
            return;
        }
        throw new WriterException(i + " is bigger than " + (i2 - 1));
    }

    /* JADX INFO: renamed from: g */
    public static void m193815g(Mode mode, b13 b13Var) {
        b13Var.m101395c(mode.getBits(), 4);
    }

    /* JADX INFO: renamed from: h */
    public static void m193816h(CharSequence charSequence, b13 b13Var) {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int iCharAt = charSequence.charAt(i) - '0';
            int i2 = i + 2;
            if (i2 < length) {
                b13Var.m101395c((iCharAt * 100) + ((charSequence.charAt(i + 1) - '0') * 10) + (charSequence.charAt(i2) - '0'), 10);
                i += 3;
            } else {
                i++;
                if (i < length) {
                    b13Var.m101395c((iCharAt * 10) + (charSequence.charAt(i) - '0'), 7);
                    i = i2;
                } else {
                    b13Var.m101395c(iCharAt, 4);
                }
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static int m193817i(Mode mode, b13 b13Var, b13 b13Var2, o9l0 o9l0Var) {
        return b13Var.m101402m() + mode.getCharacterCountBits(o9l0Var) + b13Var2.m101402m();
    }

    /* JADX INFO: renamed from: j */
    public static int m193818j(hr3 hr3Var) {
        return k6x.m148579a(hr3Var) + k6x.m148581c(hr3Var) + k6x.m148582d(hr3Var) + k6x.m148583e(hr3Var);
    }

    /* JADX INFO: renamed from: k */
    public static int m193819k(b13 b13Var, ErrorCorrectionLevel errorCorrectionLevel, o9l0 o9l0Var, hr3 hr3Var) throws WriterException {
        int i = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        int i2 = -1;
        for (int i3 = 0; i3 < 8; i3++) {
            ohx.m167743a(b13Var, errorCorrectionLevel, o9l0Var, i3, hr3Var);
            int iM193818j = m193818j(hr3Var);
            if (iM193818j < i) {
                i2 = i3;
                i = iM193818j;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: l */
    public static Mode m193820l(String str, String str2) {
        if ("Shift_JIS".equals(str2) && m193827s(str)) {
            return Mode.KANJI;
        }
        boolean z = false;
        boolean z2 = false;
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= '0' && cCharAt <= '9') {
                z2 = true;
            } else {
                if (m193824p(cCharAt) == -1) {
                    return Mode.BYTE;
                }
                z = true;
            }
        }
        if (z) {
            return Mode.ALPHANUMERIC;
        }
        return z2 ? Mode.NUMERIC : Mode.BYTE;
    }

    /* JADX INFO: renamed from: m */
    public static o9l0 m193821m(int i, ErrorCorrectionLevel errorCorrectionLevel) throws WriterException {
        for (int i2 = 1; i2 <= 40; i2++) {
            o9l0 o9l0VarM166745i = o9l0.m166745i(i2);
            if (m193830v(i, o9l0VarM166745i, errorCorrectionLevel)) {
                return o9l0VarM166745i;
            }
        }
        throw new WriterException("Data too big");
    }

    /* JADX WARN: Code duplicated, block: B:31:0x008d  */
    /* JADX INFO: renamed from: n */
    public static ivb0 m193822n(String str, ErrorCorrectionLevel errorCorrectionLevel, Map<EncodeHintType, ?> map) throws WriterException {
        o9l0 o9l0VarM193828t;
        CharacterSetECI characterSetECIByName;
        boolean z = map != null && map.containsKey(EncodeHintType.CHARACTER_SET);
        String string = z ? map.get(EncodeHintType.CHARACTER_SET).toString() : "ISO-8859-1";
        Mode modeM193820l = m193820l(str, string);
        b13 b13Var = new b13();
        Mode mode = Mode.BYTE;
        if (modeM193820l == mode && z && (characterSetECIByName = CharacterSetECI.getCharacterSetECIByName(string)) != null) {
            m193812d(characterSetECIByName, b13Var);
        }
        if (map != null) {
            EncodeHintType encodeHintType = EncodeHintType.GS1_FORMAT;
            if (map.containsKey(encodeHintType) && Boolean.valueOf(map.get(encodeHintType).toString()).booleanValue()) {
                m193815g(Mode.FNC1_FIRST_POSITION, b13Var);
            }
        }
        m193815g(modeM193820l, b13Var);
        b13 b13Var2 = new b13();
        m193811c(str, modeM193820l, b13Var2, string);
        if (map != null) {
            EncodeHintType encodeHintType2 = EncodeHintType.QR_VERSION;
            if (map.containsKey(encodeHintType2)) {
                o9l0VarM193828t = o9l0.m166745i(Integer.parseInt(map.get(encodeHintType2).toString()));
                if (!m193830v(m193817i(modeM193820l, b13Var, b13Var2, o9l0VarM193828t), o9l0VarM193828t, errorCorrectionLevel)) {
                    throw new WriterException("Data too big for requested version");
                }
            } else {
                o9l0VarM193828t = m193828t(errorCorrectionLevel, modeM193820l, b13Var, b13Var2);
            }
        } else {
            o9l0VarM193828t = m193828t(errorCorrectionLevel, modeM193820l, b13Var, b13Var2);
        }
        b13 b13Var3 = new b13();
        b13Var3.m101394b(b13Var);
        m193814f(modeM193820l == mode ? b13Var2.m101403n() : str.length(), o9l0VarM193828t, modeM193820l, b13Var3);
        b13Var3.m101394b(b13Var2);
        o9l0.C19061b c19061bM166749f = o9l0VarM193828t.m166749f(errorCorrectionLevel);
        int iM166750h = o9l0VarM193828t.m166750h() - c19061bM166749f.m166757d();
        m193829u(iM166750h, b13Var3);
        b13 b13VarM193826r = m193826r(b13Var3, o9l0VarM193828t.m166750h(), iM166750h, c19061bM166749f.m166756c());
        ivb0 ivb0Var = new ivb0();
        ivb0Var.m142279c(errorCorrectionLevel);
        ivb0Var.m142282f(modeM193820l);
        ivb0Var.m142283g(o9l0VarM193828t);
        int iM166748e = o9l0VarM193828t.m166748e();
        hr3 hr3Var = new hr3(iM166748e, iM166748e);
        int iM193819k = m193819k(b13VarM193826r, errorCorrectionLevel, o9l0VarM193828t, hr3Var);
        ivb0Var.m142280d(iM193819k);
        ohx.m167743a(b13VarM193826r, errorCorrectionLevel, o9l0VarM193828t, iM193819k, hr3Var);
        ivb0Var.m142281e(hr3Var);
        return ivb0Var;
    }

    /* JADX INFO: renamed from: o */
    public static byte[] m193823o(byte[] bArr, int i) {
        int length = bArr.length;
        int[] iArr = new int[length + i];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        new guc0(zlj.f204933l).m132278b(iArr, i);
        byte[] bArr2 = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr2[i3] = (byte) iArr[length + i3];
        }
        return bArr2;
    }

    /* JADX INFO: renamed from: p */
    public static int m193824p(int i) {
        int[] iArr = f176878a;
        if (i < iArr.length) {
            return iArr[i];
        }
        return -1;
    }

    /* JADX INFO: renamed from: q */
    public static void m193825q(int i, int i2, int i3, int i4, int[] iArr, int[] iArr2) throws WriterException {
        if (i4 >= i3) {
            throw new WriterException("Block ID too large");
        }
        int i5 = i % i3;
        int i6 = i3 - i5;
        int i7 = i / i3;
        int i8 = i7 + 1;
        int i9 = i2 / i3;
        int i10 = i9 + 1;
        int i11 = i7 - i9;
        int i12 = i8 - i10;
        if (i11 != i12) {
            throw new WriterException("EC bytes mismatch");
        }
        if (i3 != i6 + i5) {
            throw new WriterException("RS blocks mismatch");
        }
        if (i != ((i9 + i11) * i6) + ((i10 + i12) * i5)) {
            throw new WriterException("Total bytes mismatch");
        }
        if (i4 < i6) {
            iArr[0] = i9;
            iArr2[0] = i11;
        } else {
            iArr[0] = i10;
            iArr2[0] = i12;
        }
    }

    /* JADX INFO: renamed from: r */
    public static b13 m193826r(b13 b13Var, int i, int i2, int i3) throws WriterException {
        if (b13Var.m101403n() != i2) {
            throw new WriterException("Number of bits and data bytes does not match");
        }
        ArrayList arrayList = new ArrayList(i3);
        int i4 = 0;
        int i5 = 0;
        int iMax = 0;
        int iMax2 = 0;
        while (i4 < i3) {
            int[] iArr = new int[1];
            int[] iArr2 = new int[1];
            int i6 = i;
            int i7 = i2;
            int i8 = i3;
            m193825q(i6, i7, i8, i4, iArr, iArr2);
            int i9 = iArr[0];
            byte[] bArr = new byte[i9];
            b13Var.m101408t(i5 << 3, bArr, 0, i9);
            byte[] bArrM193823o = m193823o(bArr, iArr2[0]);
            arrayList.add(new i43(bArr, bArrM193823o));
            iMax = Math.max(iMax, i9);
            iMax2 = Math.max(iMax2, bArrM193823o.length);
            i5 += iArr[0];
            i4++;
            i = i6;
            i2 = i7;
            i3 = i8;
        }
        int i10 = i;
        if (i2 != i5) {
            throw new WriterException("Data bytes does not match offset");
        }
        b13 b13Var2 = new b13();
        for (int i11 = 0; i11 < iMax; i11++) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                byte[] bArrM138392a = ((i43) it.next()).m138392a();
                if (i11 < bArrM138392a.length) {
                    b13Var2.m101395c(bArrM138392a[i11], 8);
                }
            }
        }
        for (int i12 = 0; i12 < iMax2; i12++) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                byte[] bArrM138393b = ((i43) it2.next()).m138393b();
                if (i12 < bArrM138393b.length) {
                    b13Var2.m101395c(bArrM138393b[i12], 8);
                }
            }
        }
        if (i10 == b13Var2.m101403n()) {
            return b13Var2;
        }
        throw new WriterException("Interleaving error: " + i10 + " and " + b13Var2.m101403n() + " differ.");
    }

    /* JADX INFO: renamed from: s */
    public static boolean m193827s(String str) {
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            int length = bytes.length;
            if (length % 2 != 0) {
                return false;
            }
            for (int i = 0; i < length; i += 2) {
                int i2 = bytes[i] & 255;
                if ((i2 < 129 || i2 > 159) && (i2 < 224 || i2 > 235)) {
                    return false;
                }
            }
            return true;
        } catch (UnsupportedEncodingException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: t */
    public static o9l0 m193828t(ErrorCorrectionLevel errorCorrectionLevel, Mode mode, b13 b13Var, b13 b13Var2) throws WriterException {
        return m193821m(m193817i(mode, b13Var, b13Var2, m193821m(m193817i(mode, b13Var, b13Var2, o9l0.m166745i(1)), errorCorrectionLevel)), errorCorrectionLevel);
    }

    /* JADX INFO: renamed from: u */
    public static void m193829u(int i, b13 b13Var) throws WriterException {
        int i2 = i << 3;
        if (b13Var.m101402m() > i2) {
            throw new WriterException("data bits cannot fit in the QR Code" + b13Var.m101402m() + " > " + i2);
        }
        for (int i3 = 0; i3 < 4 && b13Var.m101402m() < i2; i3++) {
            b13Var.m101393a(false);
        }
        int iM101402m = b13Var.m101402m() & 7;
        if (iM101402m > 0) {
            while (iM101402m < 8) {
                b13Var.m101393a(false);
                iM101402m++;
            }
        }
        int iM101403n = i - b13Var.m101403n();
        for (int i4 = 0; i4 < iM101403n; i4++) {
            b13Var.m101395c((i4 & 1) == 0 ? 236 : 17, 8);
        }
        if (b13Var.m101402m() != i2) {
            throw new WriterException("Bits size does not equal capacity");
        }
    }

    /* JADX INFO: renamed from: v */
    public static boolean m193830v(int i, o9l0 o9l0Var, ErrorCorrectionLevel errorCorrectionLevel) {
        return o9l0Var.m166750h() - o9l0Var.m166749f(errorCorrectionLevel).m166757d() >= (i + 7) / 8;
    }
}
