package net.jpountz.lz4;

import java.nio.ByteBuffer;
import net.jpountz.util.ByteBufferUtils;
import net.jpountz.util.SafeUtils;
import p149l.e5r;

/* JADX INFO: loaded from: classes2.dex */
final class LZ4JavaSafeSafeDecompressor extends LZ4SafeDecompressor {
    public static final LZ4SafeDecompressor INSTANCE = new LZ4JavaSafeSafeDecompressor();

    @Override // net.jpountz.lz4.LZ4SafeDecompressor
    public int decompress(ByteBuffer byteBuffer, int i, int i2, ByteBuffer byteBuffer2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = i;
        if (byteBuffer.hasArray() && byteBuffer2.hasArray()) {
            return decompress(byteBuffer.array(), i10 + byteBuffer.arrayOffset(), i2, byteBuffer2.array(), i3 + byteBuffer2.arrayOffset(), i4);
        }
        ByteBuffer byteBufferInNativeByteOrder = ByteBufferUtils.inNativeByteOrder(byteBuffer);
        ByteBuffer byteBufferInNativeByteOrder2 = ByteBufferUtils.inNativeByteOrder(byteBuffer2);
        ByteBufferUtils.checkRange(byteBufferInNativeByteOrder, i10, i2);
        ByteBufferUtils.checkRange(byteBufferInNativeByteOrder2, i3, i4);
        int i11 = 0;
        int i12 = 1;
        if (i4 == 0) {
            if (i2 == 1 && ByteBufferUtils.readByte(byteBufferInNativeByteOrder, i10) == 0) {
                return 0;
            }
            throw new LZ4Exception("Output buffer too small");
        }
        int i13 = i2 + i10;
        int i14 = i4 + i3;
        int i15 = i3;
        while (true) {
            byte b = ByteBufferUtils.readByte(byteBufferInNativeByteOrder, i10);
            i5 = i10 + i12;
            i6 = (b & 255) >>> 4;
            if (i6 == 15) {
                byte b2 = -1;
                while (i5 < i13) {
                    int i16 = i5 + 1;
                    byte b3 = ByteBufferUtils.readByte(byteBufferInNativeByteOrder, i5);
                    if (b3 != -1) {
                        b2 = b3;
                        i5 = i16;
                        break;
                    }
                    i6 += 255;
                    b2 = b3;
                    i5 = i16;
                }
                i6 += b2 & 255;
            }
            i7 = i15 + i6;
            int i17 = i14 - 8;
            i8 = i11;
            if (i7 > i17 || (i9 = i5 + i6) > i13 - 8) {
                break;
            }
            LZ4ByteBufferUtils.wildArraycopy(byteBufferInNativeByteOrder, i5, byteBufferInNativeByteOrder2, i15, i6);
            int shortLE = ByteBufferUtils.readShortLE(byteBufferInNativeByteOrder, i9);
            int i18 = i9 + 2;
            int i19 = i7 - shortLE;
            if (i19 < i3) {
                e5r.m114891a("Malformed input at ", i18);
                return i8;
            }
            int i20 = b & 15;
            if (i20 == 15) {
                byte b4 = -1;
                while (i18 < i13) {
                    int i21 = i18 + 1;
                    byte b5 = ByteBufferUtils.readByte(byteBufferInNativeByteOrder, i18);
                    if (b5 != -1) {
                        b4 = b5;
                        i18 = i21;
                        break;
                    }
                    i20 += 255;
                    b4 = b5;
                    i18 = i21;
                }
                i20 += b4 & 255;
            }
            int i22 = i20 + 4;
            i15 = i7 + i22;
            if (i15 <= i17) {
                LZ4ByteBufferUtils.wildIncrementalCopy(byteBufferInNativeByteOrder2, i19, i7, i15);
            } else {
                if (i15 > i14) {
                    e5r.m114891a("Malformed input at ", i18);
                    return i8;
                }
                LZ4ByteBufferUtils.safeIncrementalCopy(byteBufferInNativeByteOrder2, i19, i7, i22);
            }
            i12 = 1;
            i10 = i18;
            i11 = i8;
        }
        if (i7 > i14) {
            throw new LZ4Exception();
        }
        if (i5 + i6 == i13) {
            LZ4ByteBufferUtils.safeArraycopy(byteBufferInNativeByteOrder, i5, byteBufferInNativeByteOrder2, i15, i6);
            return i7 - i3;
        }
        e5r.m114891a("Malformed input at ", i5);
        return i8;
    }

    @Override // net.jpountz.lz4.LZ4SafeDecompressor, net.jpountz.lz4.LZ4UnknownSizeDecompressor
    public int decompress(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        SafeUtils.checkRange(bArr, i, i2);
        SafeUtils.checkRange(bArr2, i3, i4);
        int i9 = 1;
        if (i4 == 0) {
            if (i2 == 1 && SafeUtils.readByte(bArr, i) == 0) {
                return 0;
            }
            throw new LZ4Exception("Output buffer too small");
        }
        int i10 = i + i2;
        int i11 = i3 + i4;
        int i12 = i;
        int i13 = i3;
        while (true) {
            byte b = SafeUtils.readByte(bArr, i12);
            i5 = i12 + i9;
            i6 = (b & 255) >>> 4;
            if (i6 == 15) {
                byte b2 = -1;
                while (i5 < i10) {
                    int i14 = i5 + 1;
                    byte b3 = SafeUtils.readByte(bArr, i5);
                    if (b3 != -1) {
                        b2 = b3;
                        i5 = i14;
                        break;
                    }
                    i6 += 255;
                    b2 = b3;
                    i5 = i14;
                }
                i6 += b2 & 255;
            }
            i7 = i13 + i6;
            int i15 = i11 - 8;
            if (i7 > i15 || (i8 = i5 + i6) > i10 - 8) {
                break;
            }
            LZ4SafeUtils.wildArraycopy(bArr, i5, bArr2, i13, i6);
            int shortLE = SafeUtils.readShortLE(bArr, i8);
            int i16 = i8 + 2;
            int i17 = i7 - shortLE;
            if (i17 < i3) {
                e5r.m114891a("Malformed input at ", i16);
                return 0;
            }
            int i18 = b & 15;
            if (i18 == 15) {
                byte b4 = -1;
                while (i16 < i10) {
                    int i19 = i16 + 1;
                    byte b5 = SafeUtils.readByte(bArr, i16);
                    if (b5 != -1) {
                        i16 = i19;
                        b4 = b5;
                        break;
                    }
                    i18 += 255;
                    i16 = i19;
                    b4 = b5;
                }
                i18 += b4 & 255;
            }
            int i20 = i18 + 4;
            i13 = i7 + i20;
            if (i13 <= i15) {
                LZ4SafeUtils.wildIncrementalCopy(bArr2, i17, i7, i13);
            } else if (i13 <= i11) {
                LZ4SafeUtils.safeIncrementalCopy(bArr2, i17, i7, i20);
            } else {
                e5r.m114891a("Malformed input at ", i16);
                return 0;
            }
            i12 = i16;
            i9 = 1;
        }
        if (i7 > i11) {
            throw new LZ4Exception();
        }
        if (i5 + i6 == i10) {
            LZ4SafeUtils.safeArraycopy(bArr, i5, bArr2, i13, i6);
            return i7 - i3;
        }
        e5r.m114891a("Malformed input at ", i5);
        return 0;
    }
}
