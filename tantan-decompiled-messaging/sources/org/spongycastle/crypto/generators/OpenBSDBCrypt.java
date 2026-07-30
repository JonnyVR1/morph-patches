package org.spongycastle.crypto.generators;

import java.io.ByteArrayOutputStream;
import okio.Utf8;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.Strings;
import p149l.ap50;
import p149l.ctq0;
import p149l.ig3;
import p149l.k250;

/* JADX INFO: loaded from: classes3.dex */
public class OpenBSDBCrypt {
    private static final String version = "2a";
    private static final byte[] encodingTable = {46, 47, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57};
    private static final byte[] decodingTable = new byte[128];

    static {
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = decodingTable;
            if (i2 >= bArr.length) {
                break;
            }
            bArr[i2] = -1;
            i2++;
        }
        while (true) {
            byte[] bArr2 = encodingTable;
            if (i >= bArr2.length) {
                return;
            }
            decodingTable[bArr2[i]] = (byte) i;
            i++;
        }
    }

    public static boolean checkPassword(String str, char[] cArr) {
        if (str.length() != 60) {
            ap50.m98028a("Bcrypt String length: ", str.length(), ", 60 required.");
            return false;
        }
        if (str.charAt(0) != '$' || str.charAt(3) != '$' || str.charAt(6) != '$') {
            ig3.m135964a("Invalid Bcrypt String format.");
            return false;
        }
        if (!str.substring(1, 3).equals(version)) {
            ig3.m135964a("Wrong Bcrypt version, 2a expected.");
            return false;
        }
        try {
            int i = Integer.parseInt(str.substring(4, 6));
            if (i < 4 || i > 31) {
                ctq0.m108694a("Invalid cost factor: ", i, ", 4 < cost < 31 expected.");
                return false;
            }
            if (cArr != null) {
                return str.equals(generate(cArr, decodeSaltString(str.substring(str.lastIndexOf(36) + 1, str.length() - 31)), i));
            }
            ig3.m135964a("Missing password.");
            return false;
        } catch (NumberFormatException unused) {
            ig3.m135964a("Invalid cost factor:".concat(str.substring(4, 6)));
            return false;
        }
    }

    private static String createBcryptString(byte[] bArr, byte[] bArr2, int i) {
        String string;
        StringBuffer stringBuffer = new StringBuffer(60);
        stringBuffer.append("$2a$");
        if (i < 10) {
            string = "0" + i;
        } else {
            string = Integer.toString(i);
        }
        stringBuffer.append(string);
        stringBuffer.append('$');
        stringBuffer.append(encodeData(bArr2));
        stringBuffer.append(encodeData(BCrypt.generate(bArr, bArr2, i)));
        return stringBuffer.toString();
    }

    private static byte[] decodeSaltString(String str) {
        char[] charArray = str.toCharArray();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16);
        if (charArray.length != 22) {
            ap50.m98028a("Invalid base64 salt length: ", charArray.length, " , 22 required.");
            return null;
        }
        for (char c : charArray) {
            if (c > 'z' || c < '.' || (c > '9' && c < 'A')) {
                k250.m144273a("Salt string contains invalid character: ", c);
                return null;
            }
        }
        char[] cArr = new char[24];
        System.arraycopy(charArray, 0, cArr, 0, charArray.length);
        for (int i = 0; i < 24; i += 4) {
            byte[] bArr = decodingTable;
            byte b = bArr[cArr[i]];
            byte b2 = bArr[cArr[i + 1]];
            byte b3 = bArr[cArr[i + 2]];
            byte b4 = bArr[cArr[i + 3]];
            byteArrayOutputStream.write((b << 2) | (b2 >> 4));
            byteArrayOutputStream.write((b2 << 4) | (b3 >> 2));
            byteArrayOutputStream.write(b4 | (b3 << 6));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byte[] bArr2 = new byte[16];
        System.arraycopy(byteArray, 0, bArr2, 0, 16);
        return bArr2;
    }

    private static String encodeData(byte[] bArr) {
        boolean z;
        if (bArr.length != 24 && bArr.length != 16) {
            ap50.m98028a("Invalid length: ", bArr.length, ", 24 for key or 16 for salt expected");
            return null;
        }
        if (bArr.length == 16) {
            byte[] bArr2 = new byte[18];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            bArr = bArr2;
            z = true;
        } else {
            bArr[bArr.length - 1] = 0;
            z = false;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int length = bArr.length;
        for (int i = 0; i < length; i += 3) {
            int i2 = bArr[i] & 255;
            int i3 = bArr[i + 1] & 255;
            byte b = bArr[i + 2];
            byte[] bArr3 = encodingTable;
            byteArrayOutputStream.write(bArr3[(i2 >>> 2) & 63]);
            byteArrayOutputStream.write(bArr3[((i2 << 4) | (i3 >>> 4)) & 63]);
            byteArrayOutputStream.write(bArr3[((i3 << 2) | ((b & 255) >>> 6)) & 63]);
            byteArrayOutputStream.write(bArr3[b & Utf8.REPLACEMENT_BYTE]);
        }
        String strFromByteArray = Strings.fromByteArray(byteArrayOutputStream.toByteArray());
        return z ? strFromByteArray.substring(0, 22) : strFromByteArray.substring(0, strFromByteArray.length() - 1);
    }

    public static String generate(char[] cArr, byte[] bArr, int i) {
        if (cArr == null) {
            ig3.m135964a("Password required.");
            return null;
        }
        if (bArr == null) {
            ig3.m135964a("Salt required.");
            return null;
        }
        if (bArr.length != 16) {
            throw new DataLengthException("16 byte salt required: " + bArr.length);
        }
        if (i < 4 || i > 31) {
            ig3.m135964a("Invalid cost factor.");
            return null;
        }
        byte[] uTF8ByteArray = Strings.toUTF8ByteArray(cArr);
        int length = uTF8ByteArray.length < 72 ? uTF8ByteArray.length + 1 : 72;
        byte[] bArr2 = new byte[length];
        if (length > uTF8ByteArray.length) {
            System.arraycopy(uTF8ByteArray, 0, bArr2, 0, uTF8ByteArray.length);
        } else {
            System.arraycopy(uTF8ByteArray, 0, bArr2, 0, length);
        }
        Arrays.fill(uTF8ByteArray, (byte) 0);
        String strCreateBcryptString = createBcryptString(bArr2, bArr, i);
        Arrays.fill(bArr2, (byte) 0);
        return strCreateBcryptString;
    }
}
