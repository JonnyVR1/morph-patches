package tech.sud.base.utils;

import java.util.zip.CRC32;

/* JADX INFO: loaded from: classes3.dex */
public class CrcChecker {
    public static long calcCrc32(byte[] bArr) {
        CRC32 crc32 = new CRC32();
        crc32.update(bArr);
        return crc32.getValue();
    }

    public static boolean check(byte[] bArr, byte[] bArr2) {
        return (bArr == null || bArr.length < 4 || bArr2 == null || bArr2.length == 0 || (((((((long) bArr[0]) & 255) << 24) | ((((long) bArr[1]) & 255) << 16)) | ((((long) bArr[2]) & 255) << 8)) | (255 & ((long) bArr[3]))) != calcCrc32(bArr2)) ? false : true;
    }

    public static boolean check(byte[] bArr) {
        if (bArr.length < 4) {
            return false;
        }
        long j = ((((long) bArr[0]) & 255) << 24) | ((((long) bArr[1]) & 255) << 16) | ((((long) bArr[2]) & 255) << 8) | (255 & ((long) bArr[3]));
        int length = bArr.length - 4;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 4, bArr2, 0, length);
        return j == calcCrc32(bArr2);
    }
}
