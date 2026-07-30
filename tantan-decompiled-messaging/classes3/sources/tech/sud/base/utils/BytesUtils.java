package tech.sud.base.utils;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class BytesUtils {
    public static int bytesToInt(byte[] bArr) {
        if (bArr == null || bArr.length != 4) {
            return -1;
        }
        return (bArr[3] & 255) | ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8);
    }

    public static short bytesToShort(byte[] bArr) {
        if (bArr == null || bArr.length != 2) {
            return (short) -1;
        }
        return (short) ((bArr[1] & 255) | ((bArr[0] & 255) << 8));
    }
}
