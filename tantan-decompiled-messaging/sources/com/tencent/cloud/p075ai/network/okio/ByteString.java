package com.tencent.cloud.p075ai.network.okio;

import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.clevertap.android.sdk.Constants;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.eclipse.jetty.http.HttpTokens;
import p149l.fg3;
import p149l.hg3;
import p149l.ig3;
import p149l.k250;
import p149l.pac0;
import p149l.uq3;
import p149l.y9g0;

/* JADX INFO: loaded from: classes13.dex */
public class ByteString implements Serializable, Comparable<ByteString> {

    /* JADX INFO: renamed from: a */
    public final byte[] f56953a;

    /* JADX INFO: renamed from: b */
    public transient int f56954b;

    /* JADX INFO: renamed from: c */
    public transient String f56955c;

    /* JADX INFO: renamed from: d */
    public static final char[] f56952d = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', Constants.INAPP_POSITION_BOTTOM, Constants.INAPP_POSITION_CENTER, 'd', 'e', 'f'};
    public static final ByteString EMPTY = m81885of(new byte[0]);

    public ByteString(byte[] bArr) {
        this.f56953a = bArr;
    }

    /* JADX WARN: Code duplicated, block: B:68:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e2 A[RETURN] */
    /* JADX WARN: Multi-variable type inference failed */
    public static ByteString decodeBase64(String str) {
        ByteString byteString;
        int i;
        char cCharAt;
        if (str == null) {
            ig3.m135964a("base64 == null");
            return null;
        }
        int length = str.length();
        while (length > 0 && ((cCharAt = str.charAt(length - 1)) == '=' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == ' ' || cCharAt == '\t')) {
            length--;
        }
        int i2 = (int) ((((long) length) * 6) / 8);
        byte[] bArr = new byte[i2];
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (i3 >= length) {
                byteString = null;
                int i7 = i4 % 4;
                if (i7 == 1) {
                    break;
                }
                if (i7 == 2) {
                    bArr[i5] = (byte) ((i6 << 12) >> 16);
                    i5++;
                } else if (i7 == 3) {
                    int i8 = i6 << 6;
                    int i9 = i5 + 1;
                    bArr[i5] = (byte) (i8 >> 16);
                    i5 += 2;
                    bArr[i9] = (byte) (i8 >> 8);
                }
                if (i5 != i2) {
                    byte[] bArr2 = new byte[i5];
                    System.arraycopy(bArr, 0, bArr2, 0, i5);
                    bArr = bArr2;
                }
                if (bArr != 0) {
                    return new ByteString(bArr);
                }
                return byteString;
            }
            char cCharAt2 = str.charAt(i3);
            if (cCharAt2 >= 'A' && cCharAt2 <= 'Z') {
                i = cCharAt2 - 'A';
            } else if (cCharAt2 >= 'a' && cCharAt2 <= 'z') {
                i = cCharAt2 - 'G';
            } else if (cCharAt2 >= '0' && cCharAt2 <= '9') {
                i = cCharAt2 + 4;
            } else if (cCharAt2 == '+' || cCharAt2 == '-') {
                i = 62;
            } else {
                if (cCharAt2 != '/' && cCharAt2 != '_') {
                    if (cCharAt2 != '\n' && cCharAt2 != '\r' && cCharAt2 != ' ' && cCharAt2 != '\t') {
                        byteString = null;
                        break;
                    }
                } else {
                    i = 63;
                }
                i3++;
            }
            i6 = (i6 << 6) | ((byte) i);
            i4++;
            if (i4 % 4 == 0) {
                bArr[i5] = (byte) (i6 >> 16);
                int i10 = i5 + 2;
                bArr[i5 + 1] = (byte) (i6 >> 8);
                i5 += 3;
                bArr[i10] = (byte) i6;
            }
            i3++;
        }
        bArr = byteString;
        if (bArr != 0) {
            return new ByteString(bArr);
        }
        return byteString;
    }

    public static ByteString decodeHex(String str) {
        if (str == null) {
            ig3.m135964a("hex == null");
            return null;
        }
        if (str.length() % 2 != 0) {
            ig3.m135964a("Unexpected hex string: ".concat(str));
            return null;
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) ((m81883a(str.charAt(i2)) << 4) + m81883a(str.charAt(i2 + 1)));
        }
        return m81885of(bArr);
    }

    public static ByteString encodeString(String str, Charset charset) {
        if (str == null) {
            ig3.m135964a("s == null");
            return null;
        }
        if (charset != null) {
            return new ByteString(str.getBytes(charset));
        }
        ig3.m135964a("charset == null");
        return null;
    }

    public static ByteString encodeUtf8(String str) {
        if (str == null) {
            ig3.m135964a("s == null");
            return null;
        }
        ByteString byteString = new ByteString(str.getBytes(C13796y.f57020a));
        byteString.f56955c = str;
        return byteString;
    }

    /* JADX INFO: renamed from: of */
    public static ByteString m81886of(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            ig3.m135964a("data == null");
            return null;
        }
        C13796y.m81981a(bArr.length, i, i2);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new ByteString(bArr2);
    }

    public static ByteString read(InputStream inputStream, int i) throws IOException {
        if (inputStream == null) {
            ig3.m135964a("in == null");
            return null;
        }
        if (i < 0) {
            k250.m144273a("byteCount < 0: ", i);
            return null;
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            if (i3 == -1) {
                hg3.m130807a();
                return null;
            }
            i2 += i3;
        }
        return new ByteString(bArr);
    }

    /* JADX INFO: renamed from: a */
    public final ByteString m81888a(String str, ByteString byteString) {
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(new SecretKeySpec(byteString.toByteArray(), str));
            return m81885of(mac.doFinal(this.f56953a));
        } catch (InvalidKeyException e) {
            fg3.m121203a(e);
            return null;
        } catch (NoSuchAlgorithmException e2) {
            y9g0.m213537a(e2);
            return null;
        }
    }

    public ByteBuffer asByteBuffer() {
        return ByteBuffer.wrap(this.f56953a).asReadOnlyBuffer();
    }

    public String base64() {
        return C13775d.m81895a(this.f56953a, C13775d.f56966a);
    }

    public String base64Url() {
        return C13775d.m81895a(this.f56953a, C13775d.f56967b);
    }

    @Override // java.lang.Comparable
    public int compareTo(ByteString byteString) {
        int size = size();
        int size2 = byteString.size();
        int iMin = Math.min(size, size2);
        for (int i = 0; i < iMin; i++) {
            int i2 = getByte(i) & 255;
            int i3 = byteString.getByte(i) & 255;
            if (i2 != i3) {
                return i2 < i3 ? -1 : 1;
            }
        }
        if (size == size2) {
            return 0;
        }
        return size < size2 ? -1 : 1;
    }

    public final boolean endsWith(ByteString byteString) {
        return rangeEquals(size() - byteString.size(), byteString, 0, byteString.size());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            int size = byteString.size();
            byte[] bArr = this.f56953a;
            if (size == bArr.length && byteString.rangeEquals(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public byte getByte(int i) {
        return this.f56953a[i];
    }

    public int hashCode() {
        int i = this.f56954b;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.f56953a);
        this.f56954b = iHashCode;
        return iHashCode;
    }

    public String hex() {
        byte[] bArr = this.f56953a;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = f56952d;
            cArr[i] = cArr2[(b >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public ByteString hmacSha1(ByteString byteString) {
        return m81888a("HmacSHA1", byteString);
    }

    public ByteString hmacSha256(ByteString byteString) {
        return m81888a("HmacSHA256", byteString);
    }

    public ByteString hmacSha512(ByteString byteString) {
        return m81888a("HmacSHA512", byteString);
    }

    public int indexOf(byte[] bArr, int i) {
        int length = this.f56953a.length - bArr.length;
        for (int iMax = Math.max(i, 0); iMax <= length; iMax++) {
            if (C13796y.m81983a(this.f56953a, iMax, bArr, 0, bArr.length)) {
                return iMax;
            }
        }
        return -1;
    }

    public int lastIndexOf(byte[] bArr, int i) {
        for (int iMin = Math.min(i, this.f56953a.length - bArr.length); iMin >= 0; iMin--) {
            if (C13796y.m81983a(this.f56953a, iMin, bArr, 0, bArr.length)) {
                return iMin;
            }
        }
        return -1;
    }

    public ByteString md5() {
        return m81887a("MD5");
    }

    public boolean rangeEquals(int i, byte[] bArr, int i2, int i3) {
        if (i < 0) {
            return false;
        }
        byte[] bArr2 = this.f56953a;
        return i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && C13796y.m81983a(bArr2, i, bArr, i2, i3);
    }

    public ByteString sha1() {
        return m81887a("SHA-1");
    }

    public ByteString sha256() {
        return m81887a("SHA-256");
    }

    public ByteString sha512() {
        return m81887a("SHA-512");
    }

    public int size() {
        return this.f56953a.length;
    }

    public final boolean startsWith(ByteString byteString) {
        return rangeEquals(0, byteString, 0, byteString.size());
    }

    public String string(Charset charset) {
        if (charset != null) {
            return new String(this.f56953a, charset);
        }
        ig3.m135964a("charset == null");
        return null;
    }

    public ByteString substring(int i, int i2) {
        if (i < 0) {
            ig3.m135964a("beginIndex < 0");
            return null;
        }
        byte[] bArr = this.f56953a;
        if (i2 > bArr.length) {
            pac0.m168085a("endIndex > length(", this.f56953a.length, ")");
            return null;
        }
        int i3 = i2 - i;
        if (i3 < 0) {
            ig3.m135964a("endIndex < beginIndex");
            return null;
        }
        if (i == 0 && i2 == bArr.length) {
            return this;
        }
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i, bArr2, 0, i3);
        return new ByteString(bArr2);
    }

    public ByteString toAsciiLowercase() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f56953a;
            if (i >= bArr.length) {
                return this;
            }
            byte b = bArr[i];
            if (b >= 65 && b <= 90) {
                byte[] bArr2 = (byte[]) bArr.clone();
                bArr2[i] = (byte) (b + HttpTokens.SPACE);
                for (int i2 = i + 1; i2 < bArr2.length; i2++) {
                    byte b2 = bArr2[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        bArr2[i2] = (byte) (b2 + HttpTokens.SPACE);
                    }
                }
                return new ByteString(bArr2);
            }
            i++;
        }
    }

    public ByteString toAsciiUppercase() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f56953a;
            if (i >= bArr.length) {
                return this;
            }
            byte b = bArr[i];
            if (b >= 97 && b <= 122) {
                byte[] bArr2 = (byte[]) bArr.clone();
                bArr2[i] = (byte) (b - 32);
                for (int i2 = i + 1; i2 < bArr2.length; i2++) {
                    byte b2 = bArr2[i2];
                    if (b2 >= 97 && b2 <= 122) {
                        bArr2[i2] = (byte) (b2 - 32);
                    }
                }
                return new ByteString(bArr2);
            }
            i++;
        }
    }

    public byte[] toByteArray() {
        return (byte[]) this.f56953a.clone();
    }

    public String toString() {
        if (this.f56953a.length == 0) {
            return "[size=0]";
        }
        String strUtf8 = utf8();
        int length = strUtf8.length();
        int length2 = 0;
        int i = 0;
        while (true) {
            if (length2 >= length) {
                length2 = strUtf8.length();
                break;
            }
            if (i != 64) {
                int iCodePointAt = strUtf8.codePointAt(length2);
                if ((Character.isISOControl(iCodePointAt) && iCodePointAt != 10 && iCodePointAt != 13) || iCodePointAt == 65533) {
                    length2 = -1;
                    break;
                }
                i++;
                length2 += Character.charCount(iCodePointAt);
            } else {
                break;
            }
        }
        if (length2 == -1) {
            if (this.f56953a.length <= 64) {
                return "[hex=" + hex() + Constants.AES_SUFFIX;
            }
            return "[size=" + this.f56953a.length + " hex=" + substring(0, 64).hex() + "…]";
        }
        String strReplace = strUtf8.substring(0, length2).replace("\\", "\\\\").replace(SignParameters.NEW_LINE, "\\n").replace("\r", "\\r");
        if (length2 >= strUtf8.length()) {
            return "[text=" + strReplace + Constants.AES_SUFFIX;
        }
        return "[size=" + this.f56953a.length + " text=" + strReplace + "…]";
    }

    public String utf8() {
        String str = this.f56955c;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.f56953a, C13796y.f57020a);
        this.f56955c = str2;
        return str2;
    }

    public void write(OutputStream outputStream) throws IOException {
        if (outputStream != null) {
            outputStream.write(this.f56953a);
        } else {
            ig3.m135964a("out == null");
        }
    }

    public final boolean startsWith(byte[] bArr) {
        return rangeEquals(0, bArr, 0, bArr.length);
    }

    public final boolean endsWith(byte[] bArr) {
        return rangeEquals(size() - bArr.length, bArr, 0, bArr.length);
    }

    public boolean rangeEquals(int i, ByteString byteString, int i2, int i3) {
        return byteString.rangeEquals(i2, this.f56953a, i, i3);
    }

    public final int indexOf(ByteString byteString, int i) {
        return indexOf(byteString.mo81890a(), i);
    }

    public final int lastIndexOf(ByteString byteString, int i) {
        return lastIndexOf(byteString.mo81890a(), i);
    }

    /* JADX INFO: renamed from: of */
    public static ByteString m81885of(byte... bArr) {
        if (bArr != null) {
            return new ByteString((byte[]) bArr.clone());
        }
        ig3.m135964a("data == null");
        return null;
    }

    public final int indexOf(byte[] bArr) {
        return indexOf(bArr, 0);
    }

    public final int lastIndexOf(byte[] bArr) {
        return lastIndexOf(bArr, size());
    }

    public final int indexOf(ByteString byteString) {
        return indexOf(byteString.mo81890a(), 0);
    }

    public final int lastIndexOf(ByteString byteString) {
        return lastIndexOf(byteString.mo81890a(), size());
    }

    /* JADX INFO: renamed from: of */
    public static ByteString m81884of(ByteBuffer byteBuffer) {
        if (byteBuffer != null) {
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            return new ByteString(bArr);
        }
        ig3.m135964a("data == null");
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final ByteString m81887a(String str) {
        try {
            return m81885of(MessageDigest.getInstance(str).digest(this.f56953a));
        } catch (NoSuchAlgorithmException e) {
            y9g0.m213537a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m81883a(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'a' && c <= 'f') {
            return c - 'W';
        }
        if (c >= 'A' && c <= 'F') {
            return c - '7';
        }
        uq3.m194950a("Unexpected hex digit: ", c);
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public byte[] mo81890a() {
        return this.f56953a;
    }

    /* JADX INFO: renamed from: a */
    public void mo81889a(C13776e c13776e) {
        byte[] bArr = this.f56953a;
        c13776e.m81918b(bArr, 0, bArr.length);
    }

    public ByteString substring(int i) {
        return substring(i, this.f56953a.length);
    }
}
