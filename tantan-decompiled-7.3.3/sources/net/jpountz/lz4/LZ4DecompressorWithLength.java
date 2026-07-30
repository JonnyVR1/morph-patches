package net.jpountz.lz4;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class LZ4DecompressorWithLength {
    private final LZ4FastDecompressor decompressor;

    public LZ4DecompressorWithLength(LZ4FastDecompressor lZ4FastDecompressor) {
        this.decompressor = lZ4FastDecompressor;
    }

    public static int getDecompressedLength(ByteBuffer byteBuffer, int i) {
        return (byteBuffer.get(i + 3) << 24) | (byteBuffer.get(i) & 255) | ((byteBuffer.get(i + 1) & 255) << 8) | ((byteBuffer.get(i + 2) & 255) << 16);
    }

    public void decompress(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        int decompressedLength = getDecompressedLength(byteBuffer, byteBuffer.position());
        byteBuffer.position(byteBuffer.position() + 4 + this.decompressor.decompress(byteBuffer, byteBuffer.position() + 4, byteBuffer2, byteBuffer2.position(), decompressedLength));
        byteBuffer2.position(byteBuffer2.position() + decompressedLength);
    }

    public static int getDecompressedLength(byte[] bArr, int i) {
        return (bArr[i + 3] << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static int getDecompressedLength(ByteBuffer byteBuffer) {
        return getDecompressedLength(byteBuffer, byteBuffer.position());
    }

    public static int getDecompressedLength(byte[] bArr) {
        return getDecompressedLength(bArr, 0);
    }

    public int decompress(byte[] bArr, int i, byte[] bArr2, int i2) {
        return this.decompressor.decompress(bArr, i + 4, bArr2, i2, getDecompressedLength(bArr, i)) + 4;
    }

    public byte[] decompress(byte[] bArr) {
        return decompress(bArr, 0);
    }

    public byte[] decompress(byte[] bArr, int i) {
        return this.decompressor.decompress(bArr, i + 4, getDecompressedLength(bArr, i));
    }

    public int decompress(byte[] bArr, byte[] bArr2) {
        return decompress(bArr, 0, bArr2, 0);
    }

    public int decompress(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2) {
        return this.decompressor.decompress(byteBuffer, i + 4, byteBuffer2, i2, getDecompressedLength(byteBuffer, i)) + 4;
    }
}
