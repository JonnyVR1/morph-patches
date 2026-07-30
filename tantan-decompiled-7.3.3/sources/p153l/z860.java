package p153l;

import com.alibaba.fastjson.parser.JSONLexer;
import com.google.zxing.WriterException;
import com.google.zxing.common.CharacterSetECI;
import com.google.zxing.pdf417.encoder.Compaction;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import okio.Utf8;
import org.eclipse.jetty.http.HttpTokens;

/* JADX INFO: loaded from: classes7.dex */
public final class z860 {

    /* JADX INFO: renamed from: c */
    public static final byte[] f203320c;

    /* JADX INFO: renamed from: a */
    public static final byte[] f203318a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 38, HttpTokens.CARRIAGE_RETURN, 9, 44, HttpTokens.COLON, 35, 45, 46, 36, 47, 43, 37, 42, 61, 94, 0, HttpTokens.SPACE, 0, 0, 0};

    /* JADX INFO: renamed from: b */
    public static final byte[] f203319b = {HttpTokens.SEMI_COLON, 60, 62, 64, 91, 92, 93, 95, 96, 126, 33, HttpTokens.CARRIAGE_RETURN, 9, 44, HttpTokens.COLON, 10, 45, 46, 36, 47, 34, 124, 42, 40, 41, Utf8.REPLACEMENT_BYTE, 123, 125, 39, 0};

    /* JADX INFO: renamed from: d */
    public static final byte[] f203321d = new byte[128];

    /* JADX INFO: renamed from: e */
    public static final Charset f203322e = StandardCharsets.ISO_8859_1;

    /* JADX INFO: renamed from: l.z860$a */
    public static /* synthetic */ class C21776a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f203323a;

        static {
            int[] iArr = new int[Compaction.values().length];
            f203323a = iArr;
            try {
                iArr[Compaction.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f203323a[Compaction.BYTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f203323a[Compaction.NUMERIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        byte[] bArr = new byte[128];
        f203320c = bArr;
        Arrays.fill(bArr, (byte) -1);
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr2 = f203318a;
            if (i2 >= bArr2.length) {
                break;
            }
            byte b = bArr2[i2];
            if (b > 0) {
                f203320c[b] = (byte) i2;
            }
            i2++;
        }
        Arrays.fill(f203321d, (byte) -1);
        while (true) {
            byte[] bArr3 = f203319b;
            if (i >= bArr3.length) {
                return;
            }
            byte b2 = bArr3[i];
            if (b2 > 0) {
                f203321d[b2] = (byte) i;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m218944a(String str, int i, Charset charset) throws WriterException {
        int i2;
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        int length = str.length();
        int i3 = i;
        while (i3 < length) {
            char cCharAt = str.charAt(i3);
            int i4 = 0;
            while (i4 < 13 && m218954k(cCharAt) && (i2 = i3 + (i4 = i4 + 1)) < length) {
                cCharAt = str.charAt(i2);
            }
            if (i4 >= 13) {
                return i3 - i;
            }
            char cCharAt2 = str.charAt(i3);
            if (!charsetEncoderNewEncoder.canEncode(cCharAt2)) {
                throw new WriterException("Non-encodable character detected: " + cCharAt2 + " (Unicode: " + ((int) cCharAt2) + ')');
            }
            i3++;
        }
        return i3 - i;
    }

    /* JADX INFO: renamed from: b */
    public static int m218945b(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = 0;
        if (i < length) {
            char cCharAt = charSequence.charAt(i);
            while (m218954k(cCharAt) && i < length) {
                i2++;
                i++;
                if (i < length) {
                    cCharAt = charSequence.charAt(i);
                }
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: c */
    public static int m218946c(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = i;
        while (i2 < length) {
            char cCharAt = charSequence.charAt(i2);
            int i3 = 0;
            while (i3 < 13 && m218954k(cCharAt) && i2 < length) {
                i3++;
                i2++;
                if (i2 < length) {
                    cCharAt = charSequence.charAt(i2);
                }
            }
            if (i3 < 13) {
                if (i3 <= 0) {
                    if (!m218957n(charSequence.charAt(i2))) {
                        break;
                    }
                    i2++;
                }
            } else {
                return (i2 - i) - i3;
            }
        }
        return i2 - i;
    }

    /* JADX INFO: renamed from: d */
    public static void m218947d(byte[] bArr, int i, int i2, int i3, StringBuilder sb) {
        int i4;
        if (i2 == 1 && i3 == 0) {
            sb.append((char) 913);
        } else if (i2 % 6 == 0) {
            sb.append((char) 924);
        } else {
            sb.append((char) 901);
        }
        if (i2 >= 6) {
            char[] cArr = new char[5];
            i4 = i;
            while ((i + i2) - i4 >= 6) {
                long j = 0;
                for (int i5 = 0; i5 < 6; i5++) {
                    j = (j << 8) + ((long) (bArr[i4 + i5] & 255));
                }
                for (int i6 = 0; i6 < 5; i6++) {
                    cArr[i6] = (char) (j % 900);
                    j /= 900;
                }
                for (int i7 = 4; i7 >= 0; i7--) {
                    sb.append(cArr[i7]);
                }
                i4 += 6;
            }
        } else {
            i4 = i;
        }
        while (i4 < i + i2) {
            sb.append((char) (bArr[i4] & 255));
            i4++;
        }
    }

    /* JADX INFO: renamed from: e */
    public static String m218948e(String str, Compaction compaction, Charset charset) throws WriterException {
        CharacterSetECI characterSetECIByName;
        StringBuilder sb = new StringBuilder(str.length());
        if (charset == null) {
            charset = f203322e;
        } else if (!f203322e.equals(charset) && (characterSetECIByName = CharacterSetECI.getCharacterSetECIByName(charset.name())) != null) {
            m218951h(characterSetECIByName.getValue(), sb);
        }
        int length = str.length();
        int i = C21776a.f203323a[compaction.ordinal()];
        if (i == 1) {
            m218950g(str, 0, length, sb, 0);
        } else if (i == 2) {
            byte[] bytes = str.getBytes(charset);
            m218947d(bytes, 0, bytes.length, 1, sb);
        } else if (i != 3) {
            int i2 = 0;
            int iM218950g = 0;
            int i3 = 0;
            while (i2 < length) {
                int iM218945b = m218945b(str, i2);
                if (iM218945b >= 13) {
                    sb.append((char) 902);
                    m218949f(str, i2, iM218945b, sb);
                    i2 += iM218945b;
                    iM218950g = 0;
                    i3 = 2;
                } else {
                    int iM218946c = m218946c(str, i2);
                    if (iM218946c >= 5 || iM218945b == length) {
                        if (i3 != 0) {
                            sb.append((char) 900);
                            iM218950g = 0;
                            i3 = 0;
                        }
                        iM218950g = m218950g(str, i2, iM218946c, sb, iM218950g);
                        i2 += iM218946c;
                    } else {
                        int iM218944a = m218944a(str, i2, charset);
                        if (iM218944a == 0) {
                            iM218944a = 1;
                        }
                        int i4 = iM218944a + i2;
                        byte[] bytes2 = str.substring(i2, i4).getBytes(charset);
                        if (bytes2.length == 1 && i3 == 0) {
                            m218947d(bytes2, 0, 1, 0, sb);
                        } else {
                            m218947d(bytes2, 0, bytes2.length, i3, sb);
                            i3 = 1;
                            iM218950g = 0;
                        }
                        i2 = i4;
                    }
                }
            }
        } else {
            sb.append((char) 902);
            m218949f(str, 0, length, sb);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: f */
    public static void m218949f(String str, int i, int i2, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder((i2 / 3) + 1);
        BigInteger bigIntegerValueOf = BigInteger.valueOf(900L);
        BigInteger bigIntegerValueOf2 = BigInteger.valueOf(0L);
        int i3 = 0;
        while (i3 < i2) {
            sb2.setLength(0);
            int iMin = Math.min(44, i2 - i3);
            int i4 = i + i3;
            BigInteger bigInteger = new BigInteger("1".concat(str.substring(i4, i4 + iMin)));
            do {
                sb2.append((char) bigInteger.mod(bigIntegerValueOf).intValue());
                bigInteger = bigInteger.divide(bigIntegerValueOf);
            } while (!bigInteger.equals(bigIntegerValueOf2));
            for (int length = sb2.length() - 1; length >= 0; length--) {
                sb.append(sb2.charAt(length));
            }
            i3 += iMin;
        }
    }

    /* JADX WARN: Code duplicated, block: B:73:0x00f4 A[EDGE_INSN: B:73:0x00f4->B:55:0x00f4 BREAK  A[LOOP:0: B:3:0x000f->B:90:0x000f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x000f A[SYNTHETIC] */
    /* JADX INFO: renamed from: g */
    public static int m218950g(CharSequence charSequence, int i, int i2, StringBuilder sb, int i3) {
        StringBuilder sb2 = new StringBuilder(i2);
        int i4 = i3;
        int i5 = 0;
        while (true) {
            int i6 = i + i5;
            char cCharAt = charSequence.charAt(i6);
            if (i4 == 0) {
                if (m218953j(cCharAt)) {
                    if (cCharAt == ' ') {
                        sb2.append(JSONLexer.EOI);
                    } else {
                        sb2.append((char) (cCharAt - 'A'));
                    }
                } else if (m218952i(cCharAt)) {
                    sb2.append((char) 27);
                    i4 = 1;
                } else if (m218955l(cCharAt)) {
                    sb2.append((char) 28);
                    i4 = 2;
                } else {
                    sb2.append((char) 29);
                    sb2.append((char) f203321d[cCharAt]);
                }
                i5++;
                if (i5 >= i2) {
                    break;
                    break;
                }
            } else {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (m218956m(cCharAt)) {
                            sb2.append((char) f203321d[cCharAt]);
                        } else {
                            sb2.append((char) 29);
                            i4 = 0;
                        }
                    } else if (m218955l(cCharAt)) {
                        sb2.append((char) f203320c[cCharAt]);
                    } else if (m218953j(cCharAt)) {
                        sb2.append((char) 28);
                        i4 = 0;
                    } else if (m218952i(cCharAt)) {
                        sb2.append((char) 27);
                        i4 = 1;
                    } else {
                        int i7 = i6 + 1;
                        if (i7 >= i2 || !m218956m(charSequence.charAt(i7))) {
                            sb2.append((char) 29);
                            sb2.append((char) f203321d[cCharAt]);
                        } else {
                            sb2.append((char) 25);
                            i4 = 3;
                        }
                    }
                } else if (m218952i(cCharAt)) {
                    if (cCharAt == ' ') {
                        sb2.append(JSONLexer.EOI);
                    } else {
                        sb2.append((char) (cCharAt - 'a'));
                    }
                } else if (m218953j(cCharAt)) {
                    sb2.append((char) 27);
                    sb2.append((char) (cCharAt - 'A'));
                } else if (m218955l(cCharAt)) {
                    sb2.append((char) 28);
                    i4 = 2;
                } else {
                    sb2.append((char) 29);
                    sb2.append((char) f203321d[cCharAt]);
                }
                i5++;
                if (i5 >= i2) {
                    break;
                }
            }
        }
        int length = sb2.length();
        char cCharAt2 = 0;
        for (int i8 = 0; i8 < length; i8++) {
            if (i8 % 2 != 0) {
                cCharAt2 = (char) ((cCharAt2 * 30) + sb2.charAt(i8));
                sb.append(cCharAt2);
            } else {
                cCharAt2 = sb2.charAt(i8);
            }
        }
        if (length % 2 != 0) {
            sb.append((char) ((cCharAt2 * 30) + 29));
        }
        return i4;
    }

    /* JADX INFO: renamed from: h */
    public static void m218951h(int i, StringBuilder sb) throws WriterException {
        if (i >= 0 && i < 900) {
            sb.append((char) 927);
            sb.append((char) i);
        } else if (i < 810900) {
            sb.append((char) 926);
            sb.append((char) ((i / 900) - 1));
            sb.append((char) (i % 900));
        } else {
            if (i >= 811800) {
                throw new WriterException("ECI number not in valid range from 0..811799, but was ".concat(String.valueOf(i)));
            }
            sb.append((char) 925);
            sb.append((char) (810900 - i));
        }
    }

    /* JADX INFO: renamed from: i */
    public static boolean m218952i(char c) {
        if (c != ' ') {
            return c >= 'a' && c <= 'z';
        }
        return true;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m218953j(char c) {
        if (c != ' ') {
            return c >= 'A' && c <= 'Z';
        }
        return true;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m218954k(char c) {
        return c >= '0' && c <= '9';
    }

    /* JADX INFO: renamed from: l */
    public static boolean m218955l(char c) {
        return f203320c[c] != -1;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m218956m(char c) {
        return f203321d[c] != -1;
    }

    /* JADX INFO: renamed from: n */
    public static boolean m218957n(char c) {
        if (c == '\t' || c == '\n' || c == '\r') {
            return true;
        }
        return c >= ' ' && c <= '~';
    }
}
