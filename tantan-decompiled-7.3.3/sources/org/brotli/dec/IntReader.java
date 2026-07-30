package org.brotli.dec;

/* JADX INFO: loaded from: classes2.dex */
final class IntReader {
    private byte[] byteBuffer;
    private int[] intBuffer;

    public static void convert(IntReader intReader, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            int[] iArr = intReader.intBuffer;
            byte[] bArr = intReader.byteBuffer;
            int i3 = i2 * 4;
            iArr[i2] = ((bArr[i3 + 3] & 255) << 24) | (bArr[i3] & 255) | ((bArr[i3 + 1] & 255) << 8) | ((bArr[i3 + 2] & 255) << 16);
        }
    }

    public static void init(IntReader intReader, byte[] bArr, int[] iArr) {
        intReader.byteBuffer = bArr;
        intReader.intBuffer = iArr;
    }
}
