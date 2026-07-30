package p149l;

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
public final class qze {

    /* JADX INFO: renamed from: a */
    public static final int[] f157040a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    /* JADX INFO: renamed from: l.qze$a */
    public static /* synthetic */ class C19614a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f157041a;

        static {
            int[] iArr = new int[Mode.values().length];
            f157041a = iArr;
            try {
                iArr[Mode.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f157041a[Mode.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f157041a[Mode.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f157041a[Mode.KANJI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m177178a(String str, m03 m03Var, String str2) throws WriterException {
        try {
            for (byte b : str.getBytes(str2)) {
                m03Var.m152487c(b, 8);
            }
        } catch (UnsupportedEncodingException e) {
            throw new WriterException(e);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m177179b(CharSequence charSequence, m03 m03Var) throws WriterException {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int iM177193p = m177193p(charSequence.charAt(i));
            if (iM177193p == -1) {
                throw new WriterException();
            }
            int i2 = i + 1;
            if (i2 < length) {
                int iM177193p2 = m177193p(charSequence.charAt(i2));
                if (iM177193p2 == -1) {
                    throw new WriterException();
                }
                m03Var.m152487c((iM177193p * 45) + iM177193p2, 11);
                i += 2;
            } else {
                m03Var.m152487c(iM177193p, 6);
                i = i2;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m177180c(String str, Mode mode, m03 m03Var, String str2) throws WriterException {
        int i = C19614a.f157041a[mode.ordinal()];
        if (i == 1) {
            m177185h(str, m03Var);
            return;
        }
        if (i == 2) {
            m177179b(str, m03Var);
        } else if (i == 3) {
            m177178a(str, m03Var, str2);
        } else {
            if (i != 4) {
                throw new WriterException("Invalid mode: ".concat(String.valueOf(mode)));
            }
            m177182e(str, m03Var);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m177181d(CharacterSetECI characterSetECI, m03 m03Var) {
        m03Var.m152487c(Mode.ECI.getBits(), 4);
        m03Var.m152487c(characterSetECI.getValue(), 8);
    }

    /* JADX INFO: renamed from: e */
    public static void m177182e(String str, m03 m03Var) throws WriterException {
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
                m03Var.m152487c(((i >> 8) * 192) + (i & 255), 13);
            }
        } catch (UnsupportedEncodingException e) {
            throw new WriterException(e);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m177183f(int i, j0l0 j0l0Var, Mode mode, m03 m03Var) throws WriterException {
        int characterCountBits = mode.getCharacterCountBits(j0l0Var);
        int i2 = 1 << characterCountBits;
        if (i < i2) {
            m03Var.m152487c(i, characterCountBits);
            return;
        }
        throw new WriterException(i + " is bigger than " + (i2 - 1));
    }

    /* JADX INFO: renamed from: g */
    public static void m177184g(Mode mode, m03 m03Var) {
        m03Var.m152487c(mode.getBits(), 4);
    }

    /* JADX INFO: renamed from: h */
    public static void m177185h(CharSequence charSequence, m03 m03Var) {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int iCharAt = charSequence.charAt(i) - '0';
            int i2 = i + 2;
            if (i2 < length) {
                m03Var.m152487c((iCharAt * 100) + ((charSequence.charAt(i + 1) - '0') * 10) + (charSequence.charAt(i2) - '0'), 10);
                i += 3;
            } else {
                i++;
                if (i < length) {
                    m03Var.m152487c((iCharAt * 10) + (charSequence.charAt(i) - '0'), 7);
                    i = i2;
                } else {
                    m03Var.m152487c(iCharAt, 4);
                }
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static int m177186i(Mode mode, m03 m03Var, m03 m03Var2, j0l0 j0l0Var) {
        return m03Var.m152494m() + mode.getCharacterCountBits(j0l0Var) + m03Var2.m152494m();
    }

    /* JADX INFO: renamed from: j */
    public static int m177187j(hq3 hq3Var) {
        return l3x.m148410a(hq3Var) + l3x.m148412c(hq3Var) + l3x.m148413d(hq3Var) + l3x.m148414e(hq3Var);
    }

    /* JADX INFO: renamed from: k */
    public static int m177188k(m03 m03Var, ErrorCorrectionLevel errorCorrectionLevel, j0l0 j0l0Var, hq3 hq3Var) throws WriterException {
        int i = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        int i2 = -1;
        for (int i3 = 0; i3 < 8; i3++) {
            pex.m168562a(m03Var, errorCorrectionLevel, j0l0Var, i3, hq3Var);
            int iM177187j = m177187j(hq3Var);
            if (iM177187j < i) {
                i2 = i3;
                i = iM177187j;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: l */
    public static Mode m177189l(String str, String str2) {
        if ("Shift_JIS".equals(str2) && m177196s(str)) {
            return Mode.KANJI;
        }
        boolean z = false;
        boolean z2 = false;
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= '0' && cCharAt <= '9') {
                z2 = true;
            } else {
                if (m177193p(cCharAt) == -1) {
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
    public static j0l0 m177190m(int i, ErrorCorrectionLevel errorCorrectionLevel) throws WriterException {
        for (int i2 = 1; i2 <= 40; i2++) {
            j0l0 j0l0VarM139169i = j0l0.m139169i(i2);
            if (m177199v(i, j0l0VarM139169i, errorCorrectionLevel)) {
                return j0l0VarM139169i;
            }
        }
        throw new WriterException("Data too big");
    }

    /* JADX WARN: Code duplicated, block: B:31:0x008d  */
    /* JADX INFO: renamed from: n */
    public static enb0 m177191n(String str, ErrorCorrectionLevel errorCorrectionLevel, Map<EncodeHintType, ?> map) throws WriterException {
        j0l0 j0l0VarM177197t;
        CharacterSetECI characterSetECIByName;
        boolean z = map != null && map.containsKey(EncodeHintType.CHARACTER_SET);
        String string = z ? map.get(EncodeHintType.CHARACTER_SET).toString() : "ISO-8859-1";
        Mode modeM177189l = m177189l(str, string);
        m03 m03Var = new m03();
        Mode mode = Mode.BYTE;
        if (modeM177189l == mode && z && (characterSetECIByName = CharacterSetECI.getCharacterSetECIByName(string)) != null) {
            m177181d(characterSetECIByName, m03Var);
        }
        if (map != null) {
            EncodeHintType encodeHintType = EncodeHintType.GS1_FORMAT;
            if (map.containsKey(encodeHintType) && Boolean.valueOf(map.get(encodeHintType).toString()).booleanValue()) {
                m177184g(Mode.FNC1_FIRST_POSITION, m03Var);
            }
        }
        m177184g(modeM177189l, m03Var);
        m03 m03Var2 = new m03();
        m177180c(str, modeM177189l, m03Var2, string);
        if (map != null) {
            EncodeHintType encodeHintType2 = EncodeHintType.QR_VERSION;
            if (map.containsKey(encodeHintType2)) {
                j0l0VarM177197t = j0l0.m139169i(Integer.parseInt(map.get(encodeHintType2).toString()));
                if (!m177199v(m177186i(modeM177189l, m03Var, m03Var2, j0l0VarM177197t), j0l0VarM177197t, errorCorrectionLevel)) {
                    throw new WriterException("Data too big for requested version");
                }
            } else {
                j0l0VarM177197t = m177197t(errorCorrectionLevel, modeM177189l, m03Var, m03Var2);
            }
        } else {
            j0l0VarM177197t = m177197t(errorCorrectionLevel, modeM177189l, m03Var, m03Var2);
        }
        m03 m03Var3 = new m03();
        m03Var3.m152486b(m03Var);
        m177183f(modeM177189l == mode ? m03Var2.m152495n() : str.length(), j0l0VarM177197t, modeM177189l, m03Var3);
        m03Var3.m152486b(m03Var2);
        j0l0.C17662b c17662bM139173f = j0l0VarM177197t.m139173f(errorCorrectionLevel);
        int iM139174h = j0l0VarM177197t.m139174h() - c17662bM139173f.m139181d();
        m177198u(iM139174h, m03Var3);
        m03 m03VarM177195r = m177195r(m03Var3, j0l0VarM177197t.m139174h(), iM139174h, c17662bM139173f.m139180c());
        enb0 enb0Var = new enb0();
        enb0Var.m117252c(errorCorrectionLevel);
        enb0Var.m117255f(modeM177189l);
        enb0Var.m117256g(j0l0VarM177197t);
        int iM139172e = j0l0VarM177197t.m139172e();
        hq3 hq3Var = new hq3(iM139172e, iM139172e);
        int iM177188k = m177188k(m03VarM177195r, errorCorrectionLevel, j0l0VarM177197t, hq3Var);
        enb0Var.m117253d(iM177188k);
        pex.m168562a(m03VarM177195r, errorCorrectionLevel, j0l0VarM177197t, iM177188k, hq3Var);
        enb0Var.m117254e(hq3Var);
        return enb0Var;
    }

    /* JADX INFO: renamed from: o */
    public static byte[] m177192o(byte[] bArr, int i) {
        int length = bArr.length;
        int[] iArr = new int[length + i];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        new zlc0(gjj.f103074l).m219274b(iArr, i);
        byte[] bArr2 = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr2[i3] = (byte) iArr[length + i3];
        }
        return bArr2;
    }

    /* JADX INFO: renamed from: p */
    public static int m177193p(int i) {
        int[] iArr = f157040a;
        if (i < iArr.length) {
            return iArr[i];
        }
        return -1;
    }

    /* JADX INFO: renamed from: q */
    public static void m177194q(int i, int i2, int i3, int i4, int[] iArr, int[] iArr2) throws WriterException {
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
    public static m03 m177195r(m03 m03Var, int i, int i2, int i3) throws WriterException {
        if (m03Var.m152495n() != i2) {
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
            m177194q(i6, i7, i8, i4, iArr, iArr2);
            int i9 = iArr[0];
            byte[] bArr = new byte[i9];
            m03Var.m152500t(i5 << 3, bArr, 0, i9);
            byte[] bArrM177192o = m177192o(bArr, iArr2[0]);
            arrayList.add(new s33(bArr, bArrM177192o));
            iMax = Math.max(iMax, i9);
            iMax2 = Math.max(iMax2, bArrM177192o.length);
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
        m03 m03Var2 = new m03();
        for (int i11 = 0; i11 < iMax; i11++) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                byte[] bArrM182090a = ((s33) it.next()).m182090a();
                if (i11 < bArrM182090a.length) {
                    m03Var2.m152487c(bArrM182090a[i11], 8);
                }
            }
        }
        for (int i12 = 0; i12 < iMax2; i12++) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                byte[] bArrM182091b = ((s33) it2.next()).m182091b();
                if (i12 < bArrM182091b.length) {
                    m03Var2.m152487c(bArrM182091b[i12], 8);
                }
            }
        }
        if (i10 == m03Var2.m152495n()) {
            return m03Var2;
        }
        throw new WriterException("Interleaving error: " + i10 + " and " + m03Var2.m152495n() + " differ.");
    }

    /* JADX INFO: renamed from: s */
    public static boolean m177196s(String str) {
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
    public static j0l0 m177197t(ErrorCorrectionLevel errorCorrectionLevel, Mode mode, m03 m03Var, m03 m03Var2) throws WriterException {
        return m177190m(m177186i(mode, m03Var, m03Var2, m177190m(m177186i(mode, m03Var, m03Var2, j0l0.m139169i(1)), errorCorrectionLevel)), errorCorrectionLevel);
    }

    /* JADX INFO: renamed from: u */
    public static void m177198u(int i, m03 m03Var) throws WriterException {
        int i2 = i << 3;
        if (m03Var.m152494m() > i2) {
            throw new WriterException("data bits cannot fit in the QR Code" + m03Var.m152494m() + " > " + i2);
        }
        for (int i3 = 0; i3 < 4 && m03Var.m152494m() < i2; i3++) {
            m03Var.m152485a(false);
        }
        int iM152494m = m03Var.m152494m() & 7;
        if (iM152494m > 0) {
            while (iM152494m < 8) {
                m03Var.m152485a(false);
                iM152494m++;
            }
        }
        int iM152495n = i - m03Var.m152495n();
        for (int i4 = 0; i4 < iM152495n; i4++) {
            m03Var.m152487c((i4 & 1) == 0 ? 236 : 17, 8);
        }
        if (m03Var.m152494m() != i2) {
            throw new WriterException("Bits size does not equal capacity");
        }
    }

    /* JADX INFO: renamed from: v */
    public static boolean m177199v(int i, j0l0 j0l0Var, ErrorCorrectionLevel errorCorrectionLevel) {
        return j0l0Var.m139174h() - j0l0Var.m139173f(errorCorrectionLevel).m139181d() >= (i + 7) / 8;
    }
}
