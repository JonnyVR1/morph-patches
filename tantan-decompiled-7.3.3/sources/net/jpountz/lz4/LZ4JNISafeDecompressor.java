package net.jpountz.lz4;

import java.nio.ByteBuffer;
import net.jpountz.util.ByteBufferUtils;
import net.jpountz.util.SafeUtils;
import p153l.e7r;

/* JADX INFO: loaded from: classes2.dex */
final class LZ4JNISafeDecompressor extends LZ4SafeDecompressor {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final LZ4JNISafeDecompressor INSTANCE = new LZ4JNISafeDecompressor();
    private static LZ4SafeDecompressor SAFE_INSTANCE;

    @Override // net.jpountz.lz4.LZ4SafeDecompressor
    public int decompress(ByteBuffer byteBuffer, int i, int i2, ByteBuffer byteBuffer2, int i3, int i4) {
        byte[] bArr;
        int iArrayOffset;
        ByteBuffer byteBuffer3;
        byte[] bArrArray;
        ByteBufferUtils.checkNotReadOnly(byteBuffer2);
        ByteBufferUtils.checkRange(byteBuffer, i, i2);
        ByteBufferUtils.checkRange(byteBuffer2, i3, i4);
        if ((!byteBuffer.hasArray() && !byteBuffer.isDirect()) || (!byteBuffer2.hasArray() && !byteBuffer2.isDirect())) {
            LZ4SafeDecompressor lZ4SafeDecompressorSafeDecompressor = SAFE_INSTANCE;
            if (lZ4SafeDecompressorSafeDecompressor == null) {
                lZ4SafeDecompressorSafeDecompressor = LZ4Factory.safeInstance().safeDecompressor();
                SAFE_INSTANCE = lZ4SafeDecompressorSafeDecompressor;
            }
            return lZ4SafeDecompressorSafeDecompressor.decompress(byteBuffer, i, i2, byteBuffer2, i3, i4);
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
        int iLZ4_decompress_safe = LZ4JNI.LZ4_decompress_safe(bArr, byteBuffer4, i5, i2, bArrArray, byteBuffer3, iArrayOffset, i4);
        if (iLZ4_decompress_safe >= 0) {
            return iLZ4_decompress_safe;
        }
        e7r.m119767a(i5 - iLZ4_decompress_safe);
        return 0;
    }

    @Override // net.jpountz.lz4.LZ4SafeDecompressor, net.jpountz.lz4.LZ4UnknownSizeDecompressor
    public final int decompress(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        SafeUtils.checkRange(bArr, i, i2);
        SafeUtils.checkRange(bArr2, i3, i4);
        int iLZ4_decompress_safe = LZ4JNI.LZ4_decompress_safe(bArr, null, i, i2, bArr2, null, i3, i4);
        if (iLZ4_decompress_safe >= 0) {
            return iLZ4_decompress_safe;
        }
        e7r.m119767a(i - iLZ4_decompress_safe);
        return 0;
    }
}
