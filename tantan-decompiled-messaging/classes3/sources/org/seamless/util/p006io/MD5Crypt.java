package org.seamless.util.p006io;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class MD5Crypt {
    private static final String SALTCHARS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
    private static final String itoa64 = "./0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

    private static final int bytes2u(byte b) {
        return b & 255;
    }

    private static final void clearbits(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            bArr[i] = 0;
        }
    }

    public static final String crypt(String str, String str2, String str3) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("md5");
            MessageDigest messageDigest2 = MessageDigest.getInstance("md5");
            if (str2.startsWith(str3)) {
                str2 = str2.substring(str3.length());
            }
            if (str2.indexOf(36) != -1) {
                str2 = str2.substring(0, str2.indexOf(36));
            }
            if (str2.length() > 8) {
                str2 = str2.substring(0, 8);
            }
            messageDigest.update(str.getBytes());
            messageDigest.update(str3.getBytes());
            messageDigest.update(str2.getBytes());
            messageDigest2.update(str.getBytes());
            messageDigest2.update(str2.getBytes());
            messageDigest2.update(str.getBytes());
            byte[] bArrDigest = messageDigest2.digest();
            int length = str.length();
            while (true) {
                int i = 16;
                if (length <= 0) {
                    break;
                }
                if (length <= 16) {
                    i = length;
                }
                messageDigest.update(bArrDigest, 0, i);
                length -= 16;
            }
            clearbits(bArrDigest);
            for (int length2 = str.length(); length2 != 0; length2 >>>= 1) {
                if ((length2 & 1) != 0) {
                    messageDigest.update(bArrDigest, 0, 1);
                } else {
                    messageDigest.update(str.getBytes(), 0, 1);
                }
            }
            byte[] bArrDigest2 = messageDigest.digest();
            for (int i2 = 0; i2 < 1000; i2++) {
                try {
                    MessageDigest messageDigest3 = MessageDigest.getInstance("md5");
                    int i3 = i2 & 1;
                    if (i3 != 0) {
                        messageDigest3.update(str.getBytes());
                    } else {
                        messageDigest3.update(bArrDigest2, 0, 16);
                    }
                    if (i2 % 3 != 0) {
                        messageDigest3.update(str2.getBytes());
                    }
                    if (i2 % 7 != 0) {
                        messageDigest3.update(str.getBytes());
                    }
                    if (i3 != 0) {
                        messageDigest3.update(bArrDigest2, 0, 16);
                    } else {
                        messageDigest3.update(str.getBytes());
                    }
                    bArrDigest2 = messageDigest3.digest();
                } catch (NoSuchAlgorithmException unused) {
                    return null;
                }
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(str3);
            stringBuffer.append(str2);
            stringBuffer.append("$");
            stringBuffer.append(to64((bytes2u(bArrDigest2[0]) << 16) | (bytes2u(bArrDigest2[6]) << 8) | bytes2u(bArrDigest2[12]), 4));
            stringBuffer.append(to64((bytes2u(bArrDigest2[1]) << 16) | (bytes2u(bArrDigest2[7]) << 8) | bytes2u(bArrDigest2[13]), 4));
            stringBuffer.append(to64((bytes2u(bArrDigest2[2]) << 16) | (bytes2u(bArrDigest2[8]) << 8) | bytes2u(bArrDigest2[14]), 4));
            stringBuffer.append(to64((bytes2u(bArrDigest2[3]) << 16) | (bytes2u(bArrDigest2[9]) << 8) | bytes2u(bArrDigest2[15]), 4));
            stringBuffer.append(to64((bytes2u(bArrDigest2[4]) << 16) | (bytes2u(bArrDigest2[10]) << 8) | bytes2u(bArrDigest2[5]), 4));
            stringBuffer.append(to64(bytes2u(bArrDigest2[11]), 2));
            clearbits(bArrDigest2);
            return stringBuffer.toString();
        } catch (NoSuchAlgorithmException e) {
            System.err.println(e);
            return null;
        }
    }

    public static boolean isEqual(char[] cArr, String str) {
        String[] strArrSplit = str.split("\\$");
        if (strArrSplit.length != 4) {
            return false;
        }
        char[] charArray = str.toCharArray();
        char[] charArray2 = crypt(new String(cArr), strArrSplit[2], "$" + strArrSplit[1] + "$").toCharArray();
        if (charArray == null || charArray2 == null) {
            return charArray == charArray2;
        }
        if (charArray.length != charArray2.length) {
            return false;
        }
        boolean z = true;
        for (int i = 0; i < charArray.length && z; i++) {
            z = charArray[i] == charArray2[i];
        }
        return z;
    }

    private static final String to64(long j, int i) {
        StringBuffer stringBuffer = new StringBuffer();
        while (true) {
            i--;
            if (i < 0) {
                return stringBuffer.toString();
            }
            stringBuffer.append(itoa64.charAt((int) (63 & j)));
            j >>>= 6;
        }
    }

    public static boolean isEqual(String str, String str2) {
        return isEqual(str.toCharArray(), str2);
    }

    public static final String crypt(String str, String str2) {
        return crypt(str, str2, "$1$");
    }

    public static final String crypt(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        Random random = new Random();
        while (stringBuffer.length() < 8) {
            int iNextFloat = (int) (random.nextFloat() * 62.0f);
            stringBuffer.append(SALTCHARS.substring(iNextFloat, iNextFloat + 1));
        }
        return crypt(str, stringBuffer.toString(), "$1$");
    }
}
