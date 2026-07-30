package net.jpountz.lz4;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class LZ4CompressorWithLength {
    private final LZ4Compressor compressor;

    public LZ4CompressorWithLength(LZ4Compressor lZ4Compressor) {
        this.compressor = lZ4Compressor;
    }

    private void putOriginalLength(ByteBuffer byteBuffer, int i, int i2) {
        byteBuffer.put(i, (byte) i2);
        byteBuffer.put(i + 1, (byte) (i2 >> 8));
        byteBuffer.put(i + 2, (byte) (i2 >> 16));
        byteBuffer.put(i + 3, (byte) (i2 >> 24));
    }

    public void compress(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        int iCompress = compress(byteBuffer, byteBuffer.position(), byteBuffer.remaining(), byteBuffer2, byteBuffer2.position(), byteBuffer2.remaining());
        byteBuffer.position(byteBuffer.limit());
        byteBuffer2.position(byteBuffer2.position() + iCompress);
    }

    public int maxCompressedLength(int i) {
        return this.compressor.maxCompressedLength(i) + 4;
    }

    private void putOriginalLength(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) i2;
        bArr[i + 1] = (byte) (i2 >> 8);
        bArr[i + 2] = (byte) (i2 >> 16);
        bArr[i + 3] = (byte) (i2 >> 24);
    }

    public byte[] compress(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[maxCompressedLength(i2)];
        return Arrays.copyOf(bArr2, compress(bArr, i, i2, bArr2, 0));
    }

    public int compress(byte[] bArr, byte[] bArr2) {
        return compress(bArr, 0, bArr.length, bArr2, 0);
    }

    public int compress(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        return compress(bArr, i, i2, bArr2, i3, bArr2.length - i3);
    }

    public int compress(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        int iCompress = this.compressor.compress(bArr, i, i2, bArr2, i3 + 4, i4 - 4);
        putOriginalLength(bArr2, i3, i2);
        return iCompress + 4;
    }

    public byte[] compress(byte[] bArr) {
        return compress(bArr, 0, bArr.length);
    }

    public int compress(ByteBuffer byteBuffer, int i, int i2, ByteBuffer byteBuffer2, int i3, int i4) {
        int iCompress = this.compressor.compress(byteBuffer, i, i2, byteBuffer2, i3 + 4, i4 - 4);
        putOriginalLength(byteBuffer2, i3, i2);
        return iCompress + 4;
    }
}
