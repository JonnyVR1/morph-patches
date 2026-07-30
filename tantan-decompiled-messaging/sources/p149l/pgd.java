package p149l;

import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.common.CharacterSetECI;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.Mode;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class pgd {

    /* JADX INFO: renamed from: a */
    public static final char[] f148632a = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:".toCharArray();

    /* JADX INFO: renamed from: l.pgd$a */
    public static /* synthetic */ class C19202a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f148633a;

        static {
            int[] iArr = new int[Mode.values().length];
            f148633a = iArr;
            try {
                iArr[Mode.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f148633a[Mode.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f148633a[Mode.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f148633a[Mode.KANJI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f148633a[Mode.TERMINATOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f148633a[Mode.FNC1_FIRST_POSITION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f148633a[Mode.FNC1_SECOND_POSITION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f148633a[Mode.STRUCTURED_APPEND.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f148633a[Mode.ECI.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f148633a[Mode.HANZI.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static ghd m168667a(byte[] bArr, j0l0 j0l0Var, ErrorCorrectionLevel errorCorrectionLevel, Map<DecodeHintType, ?> map) throws FormatException {
        byte[] bArr2 = bArr;
        s03 s03Var = new s03(bArr2);
        StringBuilder sb = new StringBuilder(50);
        ArrayList arrayList = new ArrayList(1);
        int iM181816d = -1;
        int iM181816d2 = -1;
        boolean z = false;
        CharacterSetECI characterSetECIByValue = null;
        while (true) {
            try {
                Mode modeForBits = s03Var.m181813a() < 4 ? Mode.TERMINATOR : Mode.forBits(s03Var.m181816d(4));
                int[] iArr = C19202a.f148633a;
                switch (iArr[modeForBits.ordinal()]) {
                    case 5:
                        break;
                    case 6:
                    case 7:
                        z = true;
                        break;
                    case 8:
                        if (s03Var.m181813a() < 16) {
                            throw FormatException.getFormatInstance();
                        }
                        iM181816d = s03Var.m181816d(8);
                        iM181816d2 = s03Var.m181816d(8);
                        break;
                        break;
                    case 9:
                        characterSetECIByValue = CharacterSetECI.getCharacterSetECIByValue(m168673g(s03Var));
                        if (characterSetECIByValue == null) {
                            throw FormatException.getFormatInstance();
                        }
                        break;
                        break;
                    case 10:
                        int iM181816d3 = s03Var.m181816d(4);
                        int iM181816d4 = s03Var.m181816d(modeForBits.getCharacterCountBits(j0l0Var));
                        if (iM181816d3 == 1) {
                            m168670d(s03Var, sb, iM181816d4);
                        }
                        break;
                    default:
                        int iM181816d5 = s03Var.m181816d(modeForBits.getCharacterCountBits(j0l0Var));
                        int i = iArr[modeForBits.ordinal()];
                        if (i == 1) {
                            m168672f(s03Var, sb, iM181816d5);
                        } else if (i == 2) {
                            m168668b(s03Var, sb, iM181816d5, z);
                        } else if (i == 3) {
                            m168669c(s03Var, sb, iM181816d5, characterSetECIByValue, arrayList, map);
                        } else {
                            if (i != 4) {
                                throw FormatException.getFormatInstance();
                            }
                            m168671e(s03Var, sb, iM181816d5);
                        }
                        break;
                }
                if (modeForBits == Mode.TERMINATOR) {
                    String string = sb.toString();
                    if (arrayList.isEmpty()) {
                        arrayList = null;
                    }
                    return new ghd(bArr2, string, arrayList, errorCorrectionLevel != null ? errorCorrectionLevel.toString() : null, iM181816d, iM181816d2);
                }
                bArr2 = bArr;
            } catch (IllegalArgumentException unused) {
                throw FormatException.getFormatInstance();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006a  */
    /* JADX INFO: renamed from: b */
    public static void m168668b(s03 s03Var, StringBuilder sb, int i, boolean z) throws FormatException {
        while (i > 1) {
            if (s03Var.m181813a() < 11) {
                throw FormatException.getFormatInstance();
            }
            int iM181816d = s03Var.m181816d(11);
            sb.append(m168674h(iM181816d / 45));
            sb.append(m168674h(iM181816d % 45));
            i -= 2;
        }
        if (i == 1) {
            if (s03Var.m181813a() < 6) {
                throw FormatException.getFormatInstance();
            }
            sb.append(m168674h(s03Var.m181816d(6)));
        }
        if (z) {
            for (int length = sb.length(); length < sb.length(); length++) {
                if (sb.charAt(length) == '%') {
                    if (length < sb.length() - 1) {
                        int i2 = length + 1;
                        if (sb.charAt(i2) == '%') {
                            sb.deleteCharAt(i2);
                        } else {
                            sb.setCharAt(length, (char) 29);
                        }
                    } else {
                        sb.setCharAt(length, (char) 29);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m168669c(s03 s03Var, StringBuilder sb, int i, CharacterSetECI characterSetECI, Collection<byte[]> collection, Map<DecodeHintType, ?> map) throws FormatException {
        if ((i << 3) > s03Var.m181813a()) {
            throw FormatException.getFormatInstance();
        }
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) s03Var.m181816d(8);
        }
        try {
            sb.append(new String(bArr, characterSetECI == null ? f0g0.m119039a(bArr, map) : characterSetECI.name()));
            collection.add(bArr);
        } catch (UnsupportedEncodingException unused) {
            throw FormatException.getFormatInstance();
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m168670d(s03 s03Var, StringBuilder sb, int i) throws FormatException {
        if (i * 13 > s03Var.m181813a()) {
            throw FormatException.getFormatInstance();
        }
        byte[] bArr = new byte[i * 2];
        int i2 = 0;
        while (i > 0) {
            int iM181816d = s03Var.m181816d(13);
            int i3 = (iM181816d % 96) | ((iM181816d / 96) << 8);
            int i4 = i3 + (i3 < 959 ? 41377 : 42657);
            bArr[i2] = (byte) (i4 >> 8);
            bArr[i2 + 1] = (byte) i4;
            i2 += 2;
            i--;
        }
        try {
            sb.append(new String(bArr, "GB2312"));
        } catch (UnsupportedEncodingException unused) {
            throw FormatException.getFormatInstance();
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m168671e(s03 s03Var, StringBuilder sb, int i) throws FormatException {
        if (i * 13 > s03Var.m181813a()) {
            throw FormatException.getFormatInstance();
        }
        byte[] bArr = new byte[i * 2];
        int i2 = 0;
        while (i > 0) {
            int iM181816d = s03Var.m181816d(13);
            int i3 = (iM181816d % 192) | ((iM181816d / 192) << 8);
            int i4 = i3 + (i3 < 7936 ? 33088 : 49472);
            bArr[i2] = (byte) (i4 >> 8);
            bArr[i2 + 1] = (byte) i4;
            i2 += 2;
            i--;
        }
        try {
            sb.append(new String(bArr, "SJIS"));
        } catch (UnsupportedEncodingException unused) {
            throw FormatException.getFormatInstance();
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m168672f(s03 s03Var, StringBuilder sb, int i) throws FormatException {
        while (i >= 3) {
            if (s03Var.m181813a() < 10) {
                throw FormatException.getFormatInstance();
            }
            int iM181816d = s03Var.m181816d(10);
            if (iM181816d >= 1000) {
                throw FormatException.getFormatInstance();
            }
            sb.append(m168674h(iM181816d / 100));
            sb.append(m168674h((iM181816d / 10) % 10));
            sb.append(m168674h(iM181816d % 10));
            i -= 3;
        }
        if (i == 2) {
            if (s03Var.m181813a() < 7) {
                throw FormatException.getFormatInstance();
            }
            int iM181816d2 = s03Var.m181816d(7);
            if (iM181816d2 >= 100) {
                throw FormatException.getFormatInstance();
            }
            sb.append(m168674h(iM181816d2 / 10));
            sb.append(m168674h(iM181816d2 % 10));
            return;
        }
        if (i == 1) {
            if (s03Var.m181813a() < 4) {
                throw FormatException.getFormatInstance();
            }
            int iM181816d3 = s03Var.m181816d(4);
            if (iM181816d3 >= 10) {
                throw FormatException.getFormatInstance();
            }
            sb.append(m168674h(iM181816d3));
        }
    }

    /* JADX INFO: renamed from: g */
    public static int m168673g(s03 s03Var) throws FormatException {
        int iM181816d = s03Var.m181816d(8);
        if ((iM181816d & 128) == 0) {
            return iM181816d & 127;
        }
        if ((iM181816d & 192) == 128) {
            return s03Var.m181816d(8) | ((iM181816d & 63) << 8);
        }
        if ((iM181816d & 224) == 192) {
            return s03Var.m181816d(16) | ((iM181816d & 31) << 16);
        }
        throw FormatException.getFormatInstance();
    }

    /* JADX INFO: renamed from: h */
    public static char m168674h(int i) throws FormatException {
        char[] cArr = f148632a;
        if (i < cArr.length) {
            return cArr[i];
        }
        throw FormatException.getFormatInstance();
    }
}
