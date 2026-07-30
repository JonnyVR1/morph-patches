package p149l;

/* JADX INFO: loaded from: classes2.dex */
public class jxq0 {
    /* JADX INFO: renamed from: a */
    public static int m143820a(byte[] bArr) {
        if (bArr.length == 4) {
            return (bArr[3] & 255) | ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8);
        }
        ig3.m135964a("the length of bytes must be 4");
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m143821b(int i) {
        return new byte[]{(byte) (i >> 24), (byte) (i >> 16), (byte) (i >> 8), (byte) i};
    }
}
