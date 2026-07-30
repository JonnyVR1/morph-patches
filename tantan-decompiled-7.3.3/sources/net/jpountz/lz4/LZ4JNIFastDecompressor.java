package net.jpountz.lz4;

import java.nio.ByteBuffer;
import net.jpountz.util.ByteBufferUtils;
import net.jpountz.util.SafeUtils;
import p153l.e7r;

/* JADX INFO: loaded from: classes2.dex */
final class LZ4JNIFastDecompressor extends LZ4FastDecompressor {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final LZ4JNIFastDecompressor INSTANCE = new LZ4JNIFastDecompressor();
    private static LZ4FastDecompressor SAFE_INSTANCE;

    @Override // net.jpountz.lz4.LZ4FastDecompressor
    public int decompress(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, int i3) {
        byte[] bArr;
        int iArrayOffset;
        ByteBuffer byteBuffer3;
        byte[] bArrArray;
        ByteBufferUtils.checkNotReadOnly(byteBuffer2);
        ByteBufferUtils.checkRange(byteBuffer, i);
        ByteBufferUtils.checkRange(byteBuffer2, i2, i3);
        if ((!byteBuffer.hasArray() && !byteBuffer.isDirect()) || (!byteBuffer2.hasArray() && !byteBuffer2.isDirect())) {
            LZ4FastDecompressor lZ4FastDecompressorFastDecompressor = SAFE_INSTANCE;
            if (lZ4FastDecompressorFastDecompressor == null) {
                lZ4FastDecompressorFastDecompressor = LZ4Factory.safeInstance().fastDecompressor();
                SAFE_INSTANCE = lZ4FastDecompressorFastDecompressor;
            }
            return lZ4FastDecompressorFastDecompressor.decompress(byteBuffer, i, byteBuffer2, i2, i3);
        }
        ByteBuffer byteBuffer4 = byteBuffer;
        int i4 = i;
        if (byteBuffer4.hasArray()) {
            byte[] bArrArray2 = byteBuffer4.array();
            int iArrayOffset2 = byteBuffer4.arrayOffset() + i4;
            bArr = bArrArray2;
            byteBuffer4 = null;
            i4 = iArrayOffset2;
        } else {
            bArr = null;
        }
        if (byteBuffer2.hasArray()) {
            bArrArray = byteBuffer2.array();
            byteBuffer3 = null;
            iArrayOffset = i2 + byteBuffer2.arrayOffset();
        } else {
            iArrayOffset = i2;
            byteBuffer3 = byteBuffer2;
            bArrArray = null;
        }
        int iLZ4_decompress_fast = LZ4JNI.LZ4_decompress_fast(bArr, byteBuffer4, i4, bArrArray, byteBuffer3, iArrayOffset, i3);
        if (iLZ4_decompress_fast >= 0) {
            return iLZ4_decompress_fast;
        }
        e7r.m119767a(i4 - iLZ4_decompress_fast);
        return 0;
    }

    @Override // net.jpountz.lz4.LZ4FastDecompressor, net.jpountz.lz4.LZ4Decompressor
    public final int decompress(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        SafeUtils.checkRange(bArr, i);
        SafeUtils.checkRange(bArr2, i2, i3);
        int iLZ4_decompress_fast = LZ4JNI.LZ4_decompress_fast(bArr, null, i, bArr2, null, i2, i3);
        if (iLZ4_decompress_fast >= 0) {
            return iLZ4_decompress_fast;
        }
        e7r.m119767a(i - iLZ4_decompress_fast);
        return 0;
    }
}
