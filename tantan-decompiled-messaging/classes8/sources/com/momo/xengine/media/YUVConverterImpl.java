package com.momo.xengine.media;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
final class YUVConverterImpl implements IYUVConverter {
    public native boolean nativeI420ToRGBA(byte[] bArr, byte[] bArr2, int i, int i2);

    @Override // com.momo.xengine.media.IYUVConverter
    public boolean yuv420pToRGBA(byte[] bArr, int i, int i2, byte[] bArr2) {
        if (bArr == null || bArr2 == null) {
            return false;
        }
        int i3 = i * i2;
        if (bArr.length >= ((double) i3) * 1.5d && bArr2.length >= i3 * 4) {
            return nativeI420ToRGBA(bArr, bArr2, i, i2);
        }
        return false;
    }
}
