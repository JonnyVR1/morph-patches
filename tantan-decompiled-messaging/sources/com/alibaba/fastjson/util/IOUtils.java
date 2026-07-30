package com.alibaba.fastjson.util;

import androidx.room.RoomDatabase;
import com.alibaba.fastjson.JSONException;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.api.Api;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Arrays;
import java.util.Properties;
import okio.Utf8;
import p149l.piq;

/* JADX INFO: loaded from: classes.dex */
public class IOUtils {
    public static final char[] ASCII_CHARS;

    /* JADX INFO: renamed from: CA */
    public static final char[] f3878CA;
    static final char[] DigitOnes;
    static final char[] DigitTens;
    public static final String FASTJSON_COMPATIBLEWITHFIELDNAME = "fastjson.compatibleWithFieldName";
    public static final String FASTJSON_COMPATIBLEWITHJAVABEAN = "fastjson.compatibleWithJavaBean";
    public static final String FASTJSON_PROPERTIES = "fastjson.properties";

    /* JADX INFO: renamed from: IA */
    public static final int[] f3879IA;
    static final char[] digits;
    public static final char[] replaceChars;
    static final int[] sizeTable;
    public static final byte[] specicalFlags_doubleQuotes;
    public static final boolean[] specicalFlags_doubleQuotesFlags;
    public static final byte[] specicalFlags_singleQuotes;
    public static final boolean[] specicalFlags_singleQuotesFlags;
    public static final Properties DEFAULT_PROPERTIES = new Properties();
    public static final Charset UTF8 = Charset.forName("UTF-8");
    public static final char[] DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final boolean[] firstIdentifierFlags = new boolean[256];
    public static final boolean[] identifierFlags = new boolean[256];

    static {
        char c = 0;
        while (true) {
            boolean[] zArr = firstIdentifierFlags;
            if (c >= zArr.length) {
                break;
            }
            if (c >= 'A' && c <= 'Z') {
                zArr[c] = true;
            } else if (c >= 'a' && c <= 'z') {
                zArr[c] = true;
            } else if (c == '_' || c == '$') {
                zArr[c] = true;
            }
            c = (char) (c + 1);
        }
        char c2 = 0;
        while (true) {
            boolean[] zArr2 = identifierFlags;
            if (c2 < zArr2.length) {
                if (c2 >= 'A' && c2 <= 'Z') {
                    zArr2[c2] = true;
                } else if (c2 >= 'a' && c2 <= 'z') {
                    zArr2[c2] = true;
                } else if (c2 == '_') {
                    zArr2[c2] = true;
                } else if (c2 >= '0' && c2 <= '9') {
                    zArr2[c2] = true;
                }
                c2 = (char) (c2 + 1);
            } else {
                try {
                    break;
                } catch (Throwable unused) {
                }
            }
        }
        loadPropertiesFromFile();
        byte[] bArr = new byte[161];
        specicalFlags_doubleQuotes = bArr;
        byte[] bArr2 = new byte[161];
        specicalFlags_singleQuotes = bArr2;
        specicalFlags_doubleQuotesFlags = new boolean[161];
        specicalFlags_singleQuotesFlags = new boolean[161];
        replaceChars = new char[93];
        bArr[0] = 4;
        bArr[1] = 4;
        bArr[2] = 4;
        bArr[3] = 4;
        bArr[4] = 4;
        bArr[5] = 4;
        bArr[6] = 4;
        bArr[7] = 4;
        bArr[8] = 1;
        bArr[9] = 1;
        bArr[10] = 1;
        bArr[11] = 4;
        bArr[12] = 1;
        bArr[13] = 1;
        bArr[34] = 1;
        bArr[92] = 1;
        bArr2[0] = 4;
        bArr2[1] = 4;
        bArr2[2] = 4;
        bArr2[3] = 4;
        bArr2[4] = 4;
        bArr2[5] = 4;
        bArr2[6] = 4;
        bArr2[7] = 4;
        bArr2[8] = 1;
        bArr2[9] = 1;
        bArr2[10] = 1;
        bArr2[11] = 4;
        bArr2[12] = 1;
        bArr2[13] = 1;
        bArr2[92] = 1;
        bArr2[39] = 1;
        for (int i = 14; i <= 31; i++) {
            specicalFlags_doubleQuotes[i] = 4;
            specicalFlags_singleQuotes[i] = 4;
        }
        for (int i2 = 127; i2 < 160; i2++) {
            specicalFlags_doubleQuotes[i2] = 4;
            specicalFlags_singleQuotes[i2] = 4;
        }
        for (int i3 = 0; i3 < 161; i3++) {
            specicalFlags_doubleQuotesFlags[i3] = specicalFlags_doubleQuotes[i3] != 0;
            specicalFlags_singleQuotesFlags[i3] = specicalFlags_singleQuotes[i3] != 0;
        }
        char[] cArr = replaceChars;
        cArr[0] = '0';
        cArr[1] = '1';
        cArr[2] = '2';
        cArr[3] = '3';
        cArr[4] = '4';
        cArr[5] = '5';
        cArr[6] = '6';
        cArr[7] = '7';
        cArr[8] = Constants.INAPP_POSITION_BOTTOM;
        cArr[9] = Constants.INAPP_POSITION_TOP;
        cArr[10] = 'n';
        cArr[11] = 'v';
        cArr[12] = 'f';
        cArr[13] = Constants.INAPP_POSITION_RIGHT;
        cArr[34] = '\"';
        cArr[39] = '\'';
        cArr[47] = '/';
        cArr[92] = '\\';
        ASCII_CHARS = new char[]{'0', '0', '0', '1', '0', '2', '0', '3', '0', '4', '0', '5', '0', '6', '0', '7', '0', '8', '0', '9', '0', 'A', '0', 'B', '0', 'C', '0', 'D', '0', 'E', '0', 'F', '1', '0', '1', '1', '1', '2', '1', '3', '1', '4', '1', '5', '1', '6', '1', '7', '1', '8', '1', '9', '1', 'A', '1', 'B', '1', 'C', '1', 'D', '1', 'E', '1', 'F', '2', '0', '2', '1', '2', '2', '2', '3', '2', '4', '2', '5', '2', '6', '2', '7', '2', '8', '2', '9', '2', 'A', '2', 'B', '2', 'C', '2', 'D', '2', 'E', '2', 'F'};
        digits = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', Constants.INAPP_POSITION_BOTTOM, Constants.INAPP_POSITION_CENTER, 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', Constants.INAPP_POSITION_LEFT, 'm', 'n', 'o', 'p', 'q', Constants.INAPP_POSITION_RIGHT, 's', Constants.INAPP_POSITION_TOP, 'u', 'v', 'w', 'x', 'y', 'z'};
        DigitTens = new char[]{'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '4', '4', '4', '4', '4', '4', '4', '4', '4', '4', '5', '5', '5', '5', '5', '5', '5', '5', '5', '5', '6', '6', '6', '6', '6', '6', '6', '6', '6', '6', '7', '7', '7', '7', '7', '7', '7', '7', '7', '7', '8', '8', '8', '8', '8', '8', '8', '8', '8', '8', '9', '9', '9', '9', '9', '9', '9', '9', '9', '9'};
        DigitOnes = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        sizeTable = new int[]{9, 99, RoomDatabase.MAX_BIND_PARAMETER_CNT, 9999, 99999, 999999, 9999999, 99999999, 999999999, Api.BaseClientBuilder.API_PRIORITY_OTHER};
        char[] charArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();
        f3878CA = charArray;
        int[] iArr = new int[256];
        f3879IA = iArr;
        Arrays.fill(iArr, -1);
        int length = charArray.length;
        for (int i4 = 0; i4 < length; i4++) {
            f3879IA[f3878CA[i4]] = i4;
        }
        f3879IA[61] = 0;
    }

    public static void close(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public static void decode(CharsetDecoder charsetDecoder, ByteBuffer byteBuffer, CharBuffer charBuffer) {
        try {
            CoderResult coderResultDecode = charsetDecoder.decode(byteBuffer, charBuffer, true);
            if (!coderResultDecode.isUnderflow()) {
                coderResultDecode.throwException();
            }
            CoderResult coderResultFlush = charsetDecoder.flush(charBuffer);
            if (coderResultFlush.isUnderflow()) {
                return;
            }
            coderResultFlush.throwException();
        } catch (CharacterCodingException e) {
            throw new JSONException("utf8 decode error, " + e.getMessage(), e);
        }
    }

    public static byte[] decodeBase64(String str) {
        int i;
        int i2;
        int length = str.length();
        if (length == 0) {
            return new byte[0];
        }
        int i3 = length - 1;
        int i4 = 0;
        while (i4 < i3 && f3879IA[str.charAt(i4) & 255] < 0) {
            i4++;
        }
        while (i3 > 0 && f3879IA[str.charAt(i3) & 255] < 0) {
            i3--;
        }
        if (str.charAt(i3) == '=') {
            i = str.charAt(i3 + (-1)) == '=' ? 2 : 1;
        } else {
            i = 0;
        }
        int i5 = (i3 - i4) + 1;
        if (length > 76) {
            i2 = (str.charAt(76) == '\r' ? i5 / 78 : 0) << 1;
        } else {
            i2 = 0;
        }
        int i6 = (((i5 - i2) * 6) >> 3) - i;
        byte[] bArr = new byte[i6];
        int i7 = (i6 / 3) * 3;
        int i8 = 0;
        int i9 = 0;
        while (i8 < i7) {
            int[] iArr = f3879IA;
            int i10 = i4 + 4;
            int i11 = iArr[str.charAt(i4 + 3)] | (iArr[str.charAt(i4 + 1)] << 12) | (iArr[str.charAt(i4)] << 18) | (iArr[str.charAt(i4 + 2)] << 6);
            bArr[i8] = (byte) (i11 >> 16);
            int i12 = i8 + 2;
            bArr[i8 + 1] = (byte) (i11 >> 8);
            i8 += 3;
            bArr[i12] = (byte) i11;
            if (i2 <= 0 || (i9 = i9 + 1) != 19) {
                i4 = i10;
            } else {
                i4 += 6;
                i9 = 0;
            }
        }
        if (i8 < i6) {
            int i13 = 0;
            int i14 = 0;
            while (i4 <= i3 - i) {
                i13 |= f3879IA[str.charAt(i4)] << (18 - (i14 * 6));
                i14++;
                i4++;
            }
            int i15 = 16;
            while (i8 < i6) {
                bArr[i8] = (byte) (i13 >> i15);
                i15 -= 8;
                i8++;
            }
        }
        return bArr;
    }

    public static int decodeUTF8(byte[] bArr, int i, int i2, char[] cArr) {
        int i3 = i + i2;
        int iMin = Math.min(i2, cArr.length);
        int i4 = 0;
        while (i4 < iMin) {
            byte b = bArr[i];
            if (b < 0) {
                break;
            }
            i++;
            cArr[i4] = (char) b;
            i4++;
        }
        while (i < i3) {
            int i5 = i + 1;
            byte b2 = bArr[i];
            if (b2 >= 0) {
                cArr[i4] = (char) b2;
                i4++;
                i = i5;
            } else {
                if ((b2 >> 5) != -2 || (b2 & 30) == 0) {
                    if ((b2 >> 4) == -2) {
                        int i6 = i + 2;
                        if (i6 < i3) {
                            byte b3 = bArr[i5];
                            i += 3;
                            byte b4 = bArr[i6];
                            if ((b2 != -32 || (b3 & 224) != 128) && (b3 & 192) == 128 && (b4 & 192) == 128) {
                                char c = (char) (((b3 << 6) ^ (b2 << 12)) ^ ((-123008) ^ b4));
                                if (c >= 55296 && c < 57344) {
                                    return -1;
                                }
                                cArr[i4] = c;
                                i4++;
                            }
                        }
                        return -1;
                    }
                    if ((b2 >> 3) == -2 && i + 3 < i3) {
                        byte b5 = bArr[i5];
                        int i7 = i + 3;
                        byte b6 = bArr[i + 2];
                        i += 4;
                        byte b7 = bArr[i7];
                        int i8 = (((b2 << 18) ^ (b5 << 12)) ^ (b6 << 6)) ^ (3678080 ^ b7);
                        if ((b5 & 192) == 128 && (b6 & 192) == 128 && (b7 & 192) == 128 && i8 >= 65536 && i8 < 1114112) {
                            int i9 = i4 + 1;
                            cArr[i4] = (char) ((i8 >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
                            i4 += 2;
                            cArr[i9] = (char) ((i8 & 1023) + 56320);
                        }
                    }
                    return -1;
                }
                if (i5 >= i3) {
                    return -1;
                }
                i += 2;
                byte b8 = bArr[i5];
                if ((b8 & 192) != 128) {
                    return -1;
                }
                cArr[i4] = (char) ((b8 ^ (b2 << 6)) ^ Utf8.MASK_2BYTES);
                i4++;
            }
        }
        return i4;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0079  */
    /* JADX WARN: Code duplicated, block: B:37:0x007e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [char, int] */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v7, types: [int] */
    /* JADX WARN: Type inference failed for: r3v8 */
    public static int encodeUTF8(char[] cArr, int i, int i2, byte[] bArr) {
        int i3;
        char c;
        int i4 = i + i2;
        int iMin = Math.min(i2, bArr.length);
        int i5 = 0;
        while (i5 < iMin && (c = cArr[i]) < 128) {
            i++;
            bArr[i5] = (byte) c;
            i5++;
        }
        while (i < i4) {
            int i6 = i + 1;
            char c2 = cArr[i];
            if (c2 < 128) {
                i3 = i5 + 1;
                bArr[i5] = (byte) c2;
            } else {
                if (c2 < 2048) {
                    int i7 = i5 + 1;
                    bArr[i5] = (byte) ((c2 >> 6) | 192);
                    i5 += 2;
                    bArr[i7] = (byte) ((c2 & 63) | 128);
                } else if (c2 < 55296 || c2 >= 57344) {
                    bArr[i5] = (byte) ((c2 >> 12) | 224);
                    int i8 = i5 + 2;
                    bArr[i5 + 1] = (byte) ((63 & (c2 >> 6)) | 128);
                    i5 += 3;
                    bArr[i8] = (byte) ((c2 & 63) | 128);
                } else if (c2 >= 55296 && c2 < 56320) {
                    if (i4 - i < 2) {
                        c2 = -1;
                    } else {
                        char c3 = cArr[i + 1];
                        if (c3 < 56320 || c3 >= 57344) {
                            i3 = i5 + 1;
                            bArr[i5] = Utf8.REPLACEMENT_BYTE;
                        } else {
                            c2 = ((c2 << 10) + c3) - 56613888;
                        }
                    }
                    if (c2 < 0) {
                        i3 = i5 + 1;
                        bArr[i5] = Utf8.REPLACEMENT_BYTE;
                    } else {
                        bArr[i5] = (byte) ((c2 >> 18) | 240);
                        bArr[i5 + 1] = (byte) (((c2 >> 12) & 63) | 128);
                        bArr[i5 + 2] = (byte) ((63 & (c2 >> 6)) | 128);
                        bArr[i5 + 3] = (byte) ((c2 & 63) | 128);
                        i6 = i + 2;
                        i3 = i5 + 4;
                    }
                } else if (c2 >= 56320 && c2 < 57344) {
                    i3 = i5 + 1;
                    bArr[i5] = Utf8.REPLACEMENT_BYTE;
                } else if (c2 < 0) {
                    i3 = i5 + 1;
                    bArr[i5] = Utf8.REPLACEMENT_BYTE;
                } else {
                    bArr[i5] = (byte) ((c2 >> 18) | 240);
                    bArr[i5 + 1] = (byte) (((c2 >> 12) & 63) | 128);
                    bArr[i5 + 2] = (byte) ((63 & (c2 >> 6)) | 128);
                    bArr[i5 + 3] = (byte) ((c2 & 63) | 128);
                    i6 = i + 2;
                    i3 = i5 + 4;
                }
                i = i6;
            }
            i5 = i3;
            i = i6;
        }
        return i5;
    }

    public static boolean firstIdentifier(char c) {
        boolean[] zArr = firstIdentifierFlags;
        return c < zArr.length && zArr[c];
    }

    public static void getChars(long j, int i, char[] cArr) {
        char c;
        if (j < 0) {
            j = -j;
            c = '-';
        } else {
            c = 0;
        }
        while (j > 2147483647L) {
            long j2 = j / 100;
            int i2 = (int) (j - (((j2 << 6) + (j2 << 5)) + (j2 << 2)));
            cArr[i - 1] = DigitOnes[i2];
            i -= 2;
            cArr[i] = DigitTens[i2];
            j = j2;
        }
        int i3 = (int) j;
        while (i3 >= 65536) {
            int i4 = i3 / 100;
            int i5 = i3 - (((i4 << 6) + (i4 << 5)) + (i4 << 2));
            cArr[i - 1] = DigitOnes[i5];
            i -= 2;
            cArr[i] = DigitTens[i5];
            i3 = i4;
        }
        while (true) {
            int i6 = (52429 * i3) >>> 19;
            int i7 = i - 1;
            cArr[i7] = digits[i3 - ((i6 << 3) + (i6 << 1))];
            if (i6 == 0) {
                break;
            }
            i3 = i6;
            i = i7;
        }
        if (c != 0) {
            cArr[i - 2] = c;
        }
    }

    public static String getStringProperty(String str) {
        String property;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        return property == null ? DEFAULT_PROPERTIES.getProperty(str) : property;
    }

    public static boolean isIdent(char c) {
        boolean[] zArr = identifierFlags;
        return c < zArr.length && zArr[c];
    }

    public static boolean isValidJsonpQueryParam(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '.' && !isIdent(cCharAt)) {
                return false;
            }
        }
        return true;
    }

    public static void loadPropertiesFromFile() {
        InputStream inputStream = (InputStream) AccessController.doPrivileged(new PrivilegedAction<InputStream>() { // from class: com.alibaba.fastjson.util.IOUtils.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.security.PrivilegedAction
            public InputStream run() {
                ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
                return contextClassLoader != null ? contextClassLoader.getResourceAsStream(IOUtils.FASTJSON_PROPERTIES) : ClassLoader.getSystemResourceAsStream(IOUtils.FASTJSON_PROPERTIES);
            }
        });
        if (inputStream != null) {
            try {
                DEFAULT_PROPERTIES.load(inputStream);
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public static String readAll(Reader reader) {
        StringBuilder sb = new StringBuilder();
        try {
            char[] cArr = new char[2048];
            while (true) {
                int i = reader.read(cArr, 0, 2048);
                if (i < 0) {
                    return sb.toString();
                }
                sb.append(cArr, 0, i);
            }
        } catch (Exception e) {
            piq.m169752a("read string from reader error", e);
            return null;
        }
    }

    public static int stringSize(long j) {
        long j2 = 10;
        for (int i = 1; i < 19; i++) {
            if (j < j2) {
                return i;
            }
            j2 *= 10;
        }
        return 19;
    }

    public static int stringSize(int i) {
        int i2 = 0;
        while (i > sizeTable[i2]) {
            i2++;
        }
        return i2 + 1;
    }

    public static void getChars(int i, int i2, char[] cArr) {
        char c;
        if (i < 0) {
            i = -i;
            c = '-';
        } else {
            c = 0;
        }
        while (i >= 65536) {
            int i3 = i / 100;
            int i4 = i - (((i3 << 6) + (i3 << 5)) + (i3 << 2));
            cArr[i2 - 1] = DigitOnes[i4];
            i2 -= 2;
            cArr[i2] = DigitTens[i4];
            i = i3;
        }
        while (true) {
            int i5 = (52429 * i) >>> 19;
            int i6 = i2 - 1;
            cArr[i6] = digits[i - ((i5 << 3) + (i5 << 1))];
            if (i5 == 0) {
                break;
            }
            i = i5;
            i2 = i6;
        }
        if (c != 0) {
            cArr[i2 - 2] = c;
        }
    }

    public static void getChars(byte b, int i, char[] cArr) {
        char c;
        int i2;
        if (b < 0) {
            c = '-';
            i2 = -b;
        } else {
            c = 0;
            i2 = b;
        }
        while (true) {
            int i3 = (52429 * i2) >>> 19;
            int i4 = i - 1;
            cArr[i4] = digits[i2 - ((i3 << 3) + (i3 << 1))];
            if (i3 == 0) {
                break;
            }
            i2 = i3;
            i = i4;
        }
        if (c != 0) {
            cArr[i - 2] = c;
        }
    }

    public static byte[] decodeBase64(String str, int i, int i2) {
        int i3;
        int i4;
        if (i2 == 0) {
            return new byte[0];
        }
        int i5 = (i + i2) - 1;
        int i6 = i;
        while (i6 < i5 && f3879IA[str.charAt(i6)] < 0) {
            i6++;
        }
        while (i5 > 0 && f3879IA[str.charAt(i5)] < 0) {
            i5--;
        }
        if (str.charAt(i5) == '=') {
            i3 = str.charAt(i5 + (-1)) == '=' ? 2 : 1;
        } else {
            i3 = 0;
        }
        int i7 = (i5 - i6) + 1;
        if (i2 > 76) {
            i4 = (str.charAt(76) == '\r' ? i7 / 78 : 0) << 1;
        } else {
            i4 = 0;
        }
        int i8 = (((i7 - i4) * 6) >> 3) - i3;
        byte[] bArr = new byte[i8];
        int i9 = (i8 / 3) * 3;
        int i10 = 0;
        int i11 = 0;
        while (i10 < i9) {
            int[] iArr = f3879IA;
            int i12 = i6 + 4;
            int i13 = iArr[str.charAt(i6 + 3)] | (iArr[str.charAt(i6 + 1)] << 12) | (iArr[str.charAt(i6)] << 18) | (iArr[str.charAt(i6 + 2)] << 6);
            bArr[i10] = (byte) (i13 >> 16);
            int i14 = i10 + 2;
            bArr[i10 + 1] = (byte) (i13 >> 8);
            i10 += 3;
            bArr[i14] = (byte) i13;
            if (i4 <= 0 || (i11 = i11 + 1) != 19) {
                i6 = i12;
            } else {
                i6 += 6;
                i11 = 0;
            }
        }
        if (i10 < i8) {
            int i15 = 0;
            int i16 = 0;
            while (i6 <= i5 - i3) {
                i15 |= f3879IA[str.charAt(i6)] << (18 - (i16 * 6));
                i16++;
                i6++;
            }
            int i17 = 16;
            while (i10 < i8) {
                bArr[i10] = (byte) (i15 >> i17);
                i17 -= 8;
                i10++;
            }
        }
        return bArr;
    }

    public static byte[] decodeBase64(char[] cArr, int i, int i2) {
        int i3;
        int i4;
        int i5 = 0;
        if (i2 == 0) {
            return new byte[0];
        }
        int i6 = (i + i2) - 1;
        int i7 = i;
        while (i7 < i6 && f3879IA[cArr[i7]] < 0) {
            i7++;
        }
        while (i6 > 0 && f3879IA[cArr[i6]] < 0) {
            i6--;
        }
        if (cArr[i6] == '=') {
            i3 = cArr[i6 + (-1)] == '=' ? 2 : 1;
        } else {
            i3 = 0;
        }
        int i8 = (i6 - i7) + 1;
        if (i2 > 76) {
            i4 = (cArr[76] == '\r' ? i8 / 78 : 0) << 1;
        } else {
            i4 = 0;
        }
        int i9 = (((i8 - i4) * 6) >> 3) - i3;
        byte[] bArr = new byte[i9];
        int i10 = (i9 / 3) * 3;
        int i11 = 0;
        int i12 = 0;
        while (i11 < i10) {
            int[] iArr = f3879IA;
            int i13 = i7 + 4;
            int i14 = iArr[cArr[i7 + 3]] | (iArr[cArr[i7 + 1]] << 12) | (iArr[cArr[i7]] << 18) | (iArr[cArr[i7 + 2]] << 6);
            bArr[i11] = (byte) (i14 >> 16);
            int i15 = i11 + 2;
            bArr[i11 + 1] = (byte) (i14 >> 8);
            i11 += 3;
            bArr[i15] = (byte) i14;
            if (i4 <= 0 || (i12 = i12 + 1) != 19) {
                i7 = i13;
            } else {
                i7 += 6;
                i12 = 0;
            }
        }
        if (i11 < i9) {
            int i16 = 0;
            while (i7 <= i6 - i3) {
                i5 |= f3879IA[cArr[i7]] << (18 - (i16 * 6));
                i16++;
                i7++;
            }
            int i17 = 16;
            while (i11 < i9) {
                bArr[i11] = (byte) (i5 >> i17);
                i17 -= 8;
                i11++;
            }
        }
        return bArr;
    }
}
