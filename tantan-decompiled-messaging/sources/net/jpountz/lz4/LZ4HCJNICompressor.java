package net.jpountz.lz4;

import java.nio.ByteBuffer;
import net.jpountz.util.ByteBufferUtils;
import net.jpountz.util.SafeUtils;

/* JADX INFO: loaded from: classes2.dex */
final class LZ4HCJNICompressor extends LZ4Compressor {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final LZ4HCJNICompressor INSTANCE = new LZ4HCJNICompressor();
    private static LZ4Compressor SAFE_INSTANCE;
    private final int compressionLevel;

    public LZ4HCJNICompressor() {
        this(9);
    }

    @Override // net.jpountz.lz4.LZ4Compressor
    public int compress(ByteBuffer byteBuffer, int i, int i2, ByteBuffer byteBuffer2, int i3, int i4) {
        byte[] bArrArray;
        ByteBuffer byteBuffer3;
        byte[] bArr;
        ByteBufferUtils.checkNotReadOnly(byteBuffer2);
        ByteBufferUtils.checkRange(byteBuffer, i, i2);
        ByteBufferUtils.checkRange(byteBuffer2, i3, i4);
        if ((!byteBuffer.hasArray() && !byteBuffer.isDirect()) || (!byteBuffer2.hasArray() && !byteBuffer2.isDirect())) {
            LZ4Compressor lZ4CompressorHighCompressor = SAFE_INSTANCE;
            if (lZ4CompressorHighCompressor == null) {
                lZ4CompressorHighCompressor = LZ4Factory.safeInstance().highCompressor(this.compressionLevel);
                SAFE_INSTANCE = lZ4CompressorHighCompressor;
            }
            return lZ4CompressorHighCompressor.compress(byteBuffer, i, i2, byteBuffer2, i3, i4);
        }
        if (byteBuffer.hasArray()) {
            bArrArray = byteBuffer.array();
            i += byteBuffer.arrayOffset();
            byteBuffer = null;
        } else {
            bArrArray = null;
        }
        int i5 = i;
        if (byteBuffer2.hasArray()) {
            byte[] bArrArray2 = byteBuffer2.array();
            i3 += byteBuffer2.arrayOffset();
            bArr = bArrArray2;
            byteBuffer3 = null;
        } else {
            byteBuffer3 = byteBuffer2;
            bArr = null;
        }
        int iLZ4_compressHC = LZ4JNI.LZ4_compressHC(bArrArray, byteBuffer, i5, i2, bArr, byteBuffer3, i3, i4, this.compressionLevel);
        if (iLZ4_compressHC > 0) {
            return iLZ4_compressHC;
        }
        throw new LZ4Exception();
    }

    public LZ4HCJNICompressor(int i) {
        this.compressionLevel = i;
    }

    @Override // net.jpountz.lz4.LZ4Compressor
    public int compress(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        SafeUtils.checkRange(bArr, i, i2);
        SafeUtils.checkRange(bArr2, i3, i4);
        int iLZ4_compressHC = LZ4JNI.LZ4_compressHC(bArr, null, i, i2, bArr2, null, i3, i4, this.compressionLevel);
        if (iLZ4_compressHC > 0) {
            return iLZ4_compressHC;
        }
        throw new LZ4Exception();
    }
}
