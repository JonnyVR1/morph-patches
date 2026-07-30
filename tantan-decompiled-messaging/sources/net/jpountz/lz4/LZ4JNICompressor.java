package net.jpountz.lz4;

import java.nio.ByteBuffer;
import net.jpountz.util.ByteBufferUtils;
import net.jpountz.util.SafeUtils;

/* JADX INFO: loaded from: classes2.dex */
final class LZ4JNICompressor extends LZ4Compressor {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final LZ4Compressor INSTANCE = new LZ4JNICompressor();
    private static LZ4Compressor SAFE_INSTANCE;

    @Override // net.jpountz.lz4.LZ4Compressor
    public int compress(ByteBuffer byteBuffer, int i, int i2, ByteBuffer byteBuffer2, int i3, int i4) {
        byte[] bArr;
        int iArrayOffset;
        ByteBuffer byteBuffer3;
        byte[] bArrArray;
        ByteBufferUtils.checkNotReadOnly(byteBuffer2);
        ByteBufferUtils.checkRange(byteBuffer, i, i2);
        ByteBufferUtils.checkRange(byteBuffer2, i3, i4);
        if ((!byteBuffer.hasArray() && !byteBuffer.isDirect()) || (!byteBuffer2.hasArray() && !byteBuffer2.isDirect())) {
            LZ4Compressor lZ4CompressorFastCompressor = SAFE_INSTANCE;
            if (lZ4CompressorFastCompressor == null) {
                lZ4CompressorFastCompressor = LZ4Factory.safeInstance().fastCompressor();
                SAFE_INSTANCE = lZ4CompressorFastCompressor;
            }
            return lZ4CompressorFastCompressor.compress(byteBuffer, i, i2, byteBuffer2, i3, i4);
        }
        ByteBuffer byteBuffer4 = byteBuffer;
        int i5 = i;
        if (byteBuffer4.hasArray()) {
            byte[] bArrArray2 = byteBuffer4.array();
            int iArrayOffset2 = byteBuffer4.arrayOffset() + i5;
            bArr = bArrArray2;
            byteBuffer4 = null;
            i5 = iArrayOffset2;
        } else {
            bArr = null;
        }
        if (byteBuffer2.hasArray()) {
            bArrArray = byteBuffer2.array();
            byteBuffer3 = null;
            iArrayOffset = i3 + byteBuffer2.arrayOffset();
        } else {
            iArrayOffset = i3;
            byteBuffer3 = byteBuffer2;
            bArrArray = null;
        }
        int iLZ4_compress_limitedOutput = LZ4JNI.LZ4_compress_limitedOutput(bArr, byteBuffer4, i5, i2, bArrArray, byteBuffer3, iArrayOffset, i4);
        if (iLZ4_compress_limitedOutput > 0) {
            return iLZ4_compress_limitedOutput;
        }
        throw new LZ4Exception("maxDestLen is too small");
    }

    @Override // net.jpountz.lz4.LZ4Compressor
    public int compress(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        SafeUtils.checkRange(bArr, i, i2);
        SafeUtils.checkRange(bArr2, i3, i4);
        int iLZ4_compress_limitedOutput = LZ4JNI.LZ4_compress_limitedOutput(bArr, null, i, i2, bArr2, null, i3, i4);
        if (iLZ4_compress_limitedOutput > 0) {
            return iLZ4_compress_limitedOutput;
        }
        throw new LZ4Exception("maxDestLen is too small");
    }
}
