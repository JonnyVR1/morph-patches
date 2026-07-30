package p153l;

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
public final class vhd {

    /* JADX INFO: renamed from: a */
    public static final char[] f184159a = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:".toCharArray();

    /* JADX INFO: renamed from: l.vhd$a */
    public static /* synthetic */ class C20834a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f184160a;

        static {
            int[] iArr = new int[Mode.values().length];
            f184160a = iArr;
            try {
                iArr[Mode.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f184160a[Mode.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f184160a[Mode.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f184160a[Mode.KANJI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f184160a[Mode.TERMINATOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f184160a[Mode.FNC1_FIRST_POSITION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f184160a[Mode.FNC1_SECOND_POSITION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f184160a[Mode.STRUCTURED_APPEND.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f184160a[Mode.ECI.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f184160a[Mode.HANZI.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static mid m201278a(byte[] bArr, o9l0 o9l0Var, ErrorCorrectionLevel errorCorrectionLevel, Map<DecodeHintType, ?> map) throws FormatException {
        byte[] bArr2 = bArr;
        h13 h13Var = new h13(bArr2);
        StringBuilder sb = new StringBuilder(50);
        ArrayList arrayList = new ArrayList(1);
        int iM133272d = -1;
        int iM133272d2 = -1;
        boolean z = false;
        CharacterSetECI characterSetECIByValue = null;
        while (true) {
            try {
                Mode modeForBits = h13Var.m133269a() < 4 ? Mode.TERMINATOR : Mode.forBits(h13Var.m133272d(4));
                int[] iArr = C20834a.f184160a;
                switch (iArr[modeForBits.ordinal()]) {
                    case 5:
                        break;
                    case 6:
                    case 7:
                        z = true;
                        break;
                    case 8:
                        if (h13Var.m133269a() < 16) {
                            throw FormatException.getFormatInstance();
                        }
                        iM133272d = h13Var.m133272d(8);
                        iM133272d2 = h13Var.m133272d(8);
                        break;
                        break;
                    case 9:
                        characterSetECIByValue = CharacterSetECI.getCharacterSetECIByValue(m201284g(h13Var));
                        if (characterSetECIByValue == null) {
                            throw FormatException.getFormatInstance();
                        }
                        break;
                        break;
                    case 10:
                        int iM133272d3 = h13Var.m133272d(4);
                        int iM133272d4 = h13Var.m133272d(modeForBits.getCharacterCountBits(o9l0Var));
                        if (iM133272d3 == 1) {
                            m201281d(h13Var, sb, iM133272d4);
                        }
                        break;
                    default:
                        int iM133272d5 = h13Var.m133272d(modeForBits.getCharacterCountBits(o9l0Var));
                        int i = iArr[modeForBits.ordinal()];
                        if (i == 1) {
                            m201283f(h13Var, sb, iM133272d5);
                        } else if (i == 2) {
                            m201279b(h13Var, sb, iM133272d5, z);
                        } else if (i == 3) {
                            m201280c(h13Var, sb, iM133272d5, characterSetECIByValue, arrayList, map);
                        } else {
                            if (i != 4) {
                                throw FormatException.getFormatInstance();
                            }
                            m201282e(h13Var, sb, iM133272d5);
                        }
                        break;
                }
                if (modeForBits == Mode.TERMINATOR) {
                    String string = sb.toString();
                    if (arrayList.isEmpty()) {
                        arrayList = null;
                    }
                    return new mid(bArr2, string, arrayList, errorCorrectionLevel != null ? errorCorrectionLevel.toString() : null, iM133272d, iM133272d2);
                }
                bArr2 = bArr;
            } catch (IllegalArgumentException unused) {
                throw FormatException.getFormatInstance();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006a  */
    /* JADX INFO: renamed from: b */
    public static void m201279b(h13 h13Var, StringBuilder sb, int i, boolean z) throws FormatException {
        while (i > 1) {
            if (h13Var.m133269a() < 11) {
                throw FormatException.getFormatInstance();
            }
            int iM133272d = h13Var.m133272d(11);
            sb.append(m201285h(iM133272d / 45));
            sb.append(m201285h(iM133272d % 45));
            i -= 2;
        }
        if (i == 1) {
            if (h13Var.m133269a() < 6) {
                throw FormatException.getFormatInstance();
            }
            sb.append(m201285h(h13Var.m133272d(6)));
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
    public static void m201280c(h13 h13Var, StringBuilder sb, int i, CharacterSetECI characterSetECI, Collection<byte[]> collection, Map<DecodeHintType, ?> map) throws FormatException {
        if ((i << 3) > h13Var.m133269a()) {
            throw FormatException.getFormatInstance();
        }
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) h13Var.m133272d(8);
        }
        try {
            sb.append(new String(bArr, characterSetECI == null ? n8g0.m161922a(bArr, map) : characterSetECI.name()));
            collection.add(bArr);
        } catch (UnsupportedEncodingException unused) {
            throw FormatException.getFormatInstance();
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m201281d(h13 h13Var, StringBuilder sb, int i) throws FormatException {
        if (i * 13 > h13Var.m133269a()) {
            throw FormatException.getFormatInstance();
        }
        byte[] bArr = new byte[i * 2];
        int i2 = 0;
        while (i > 0) {
            int iM133272d = h13Var.m133272d(13);
            int i3 = (iM133272d % 96) | ((iM133272d / 96) << 8);
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
    public static void m201282e(h13 h13Var, StringBuilder sb, int i) throws FormatException {
        if (i * 13 > h13Var.m133269a()) {
            throw FormatException.getFormatInstance();
        }
        byte[] bArr = new byte[i * 2];
        int i2 = 0;
        while (i > 0) {
            int iM133272d = h13Var.m133272d(13);
            int i3 = (iM133272d % 192) | ((iM133272d / 192) << 8);
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
    public static void m201283f(h13 h13Var, StringBuilder sb, int i) throws FormatException {
        while (i >= 3) {
            if (h13Var.m133269a() < 10) {
                throw FormatException.getFormatInstance();
            }
            int iM133272d = h13Var.m133272d(10);
            if (iM133272d >= 1000) {
                throw FormatException.getFormatInstance();
            }
            sb.append(m201285h(iM133272d / 100));
            sb.append(m201285h((iM133272d / 10) % 10));
            sb.append(m201285h(iM133272d % 10));
            i -= 3;
        }
        if (i == 2) {
            if (h13Var.m133269a() < 7) {
                throw FormatException.getFormatInstance();
            }
            int iM133272d2 = h13Var.m133272d(7);
            if (iM133272d2 >= 100) {
                throw FormatException.getFormatInstance();
            }
            sb.append(m201285h(iM133272d2 / 10));
            sb.append(m201285h(iM133272d2 % 10));
            return;
        }
        if (i == 1) {
            if (h13Var.m133269a() < 4) {
                throw FormatException.getFormatInstance();
            }
            int iM133272d3 = h13Var.m133272d(4);
            if (iM133272d3 >= 10) {
                throw FormatException.getFormatInstance();
            }
            sb.append(m201285h(iM133272d3));
        }
    }

    /* JADX INFO: renamed from: g */
    public static int m201284g(h13 h13Var) throws FormatException {
        int iM133272d = h13Var.m133272d(8);
        if ((iM133272d & 128) == 0) {
            return iM133272d & 127;
        }
        if ((iM133272d & 192) == 128) {
            return h13Var.m133272d(8) | ((iM133272d & 63) << 8);
        }
        if ((iM133272d & 224) == 192) {
            return h13Var.m133272d(16) | ((iM133272d & 31) << 16);
        }
        throw FormatException.getFormatInstance();
    }

    /* JADX INFO: renamed from: h */
    public static char m201285h(int i) throws FormatException {
        char[] cArr = f184159a;
        if (i < cArr.length) {
            return cArr[i];
        }
        throw FormatException.getFormatInstance();
    }
}
