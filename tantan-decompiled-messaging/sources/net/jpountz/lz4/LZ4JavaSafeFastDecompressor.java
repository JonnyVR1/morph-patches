package net.jpountz.lz4;

import java.nio.ByteBuffer;
import net.jpountz.util.ByteBufferUtils;
import net.jpountz.util.SafeUtils;
import p149l.e5r;

/* JADX INFO: loaded from: classes2.dex */
final class LZ4JavaSafeFastDecompressor extends LZ4FastDecompressor {
    public static final LZ4FastDecompressor INSTANCE = new LZ4JavaSafeFastDecompressor();

    @Override // net.jpountz.lz4.LZ4FastDecompressor
    public int decompress(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, int i3) {
        int i4;
        byte b;
        int i5;
        byte b2;
        if (byteBuffer.hasArray() && byteBuffer2.hasArray()) {
            return decompress(byteBuffer.array(), i + byteBuffer.arrayOffset(), byteBuffer2.array(), i2 + byteBuffer2.arrayOffset(), i3);
        }
        ByteBuffer byteBufferInNativeByteOrder = ByteBufferUtils.inNativeByteOrder(byteBuffer);
        ByteBuffer byteBufferInNativeByteOrder2 = ByteBufferUtils.inNativeByteOrder(byteBuffer2);
        ByteBufferUtils.checkRange(byteBufferInNativeByteOrder, i);
        ByteBufferUtils.checkRange(byteBufferInNativeByteOrder2, i2, i3);
        if (i3 == 0) {
            if (ByteBufferUtils.readByte(byteBufferInNativeByteOrder, i) == 0) {
                return 1;
            }
            e5r.m114891a("Malformed input at ", i);
            return 0;
        }
        int i6 = i3 + i2;
        int i7 = i;
        int i8 = i2;
        while (true) {
            byte b3 = ByteBufferUtils.readByte(byteBufferInNativeByteOrder, i7);
            int i9 = i7 + 1;
            int i10 = (b3 & 255) >>> 4;
            if (i10 == 15) {
                while (true) {
                    i5 = i9 + 1;
                    b2 = ByteBufferUtils.readByte(byteBufferInNativeByteOrder, i9);
                    if (b2 != -1) {
                        break;
                    }
                    i10 += 255;
                    i9 = i5;
                }
                i10 += b2 & 255;
                i9 = i5;
            }
            int i11 = i8 + i10;
            int i12 = i6 - 8;
            if (i11 > i12) {
                if (i11 == i6) {
                    LZ4ByteBufferUtils.safeArraycopy(byteBufferInNativeByteOrder, i9, byteBufferInNativeByteOrder2, i8, i10);
                    return (i9 + i10) - i;
                }
                e5r.m114891a("Malformed input at ", i9);
                return 0;
            }
            LZ4ByteBufferUtils.wildArraycopy(byteBufferInNativeByteOrder, i9, byteBufferInNativeByteOrder2, i8, i10);
            int i13 = i9 + i10;
            int shortLE = ByteBufferUtils.readShortLE(byteBufferInNativeByteOrder, i13);
            i7 = i13 + 2;
            int i14 = i11 - shortLE;
            if (i14 < i2) {
                e5r.m114891a("Malformed input at ", i7);
                return 0;
            }
            int i15 = b3 & 15;
            if (i15 == 15) {
                while (true) {
                    i4 = i7 + 1;
                    b = ByteBufferUtils.readByte(byteBufferInNativeByteOrder, i7);
                    if (b != -1) {
                        break;
                    }
                    i15 += 255;
                    i7 = i4;
                }
                i15 += b & 255;
                i7 = i4;
            }
            int i16 = i15 + 4;
            int i17 = i11 + i16;
            if (i17 <= i12) {
                LZ4ByteBufferUtils.wildIncrementalCopy(byteBufferInNativeByteOrder2, i14, i11, i17);
            } else {
                if (i17 > i6) {
                    e5r.m114891a("Malformed input at ", i7);
                    return 0;
                }
                LZ4ByteBufferUtils.safeIncrementalCopy(byteBufferInNativeByteOrder2, i14, i11, i16);
            }
            i8 = i17;
        }
    }

    @Override // net.jpountz.lz4.LZ4FastDecompressor, net.jpountz.lz4.LZ4Decompressor
    public int decompress(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        int i4;
        byte b;
        int i5;
        byte b2;
        SafeUtils.checkRange(bArr, i);
        SafeUtils.checkRange(bArr2, i2, i3);
        if (i3 == 0) {
            if (SafeUtils.readByte(bArr, i) == 0) {
                return 1;
            }
            e5r.m114891a("Malformed input at ", i);
            return 0;
        }
        int i6 = i3 + i2;
        int i7 = i;
        int i8 = i2;
        while (true) {
            byte b3 = SafeUtils.readByte(bArr, i7);
            int i9 = i7 + 1;
            int i10 = (b3 & 255) >>> 4;
            if (i10 == 15) {
                while (true) {
                    i5 = i9 + 1;
                    b2 = SafeUtils.readByte(bArr, i9);
                    if (b2 != -1) {
                        break;
                    }
                    i10 += 255;
                    i9 = i5;
                }
                i10 += b2 & 255;
                i9 = i5;
            }
            int i11 = i8 + i10;
            int i12 = i6 - 8;
            if (i11 > i12) {
                if (i11 == i6) {
                    LZ4SafeUtils.safeArraycopy(bArr, i9, bArr2, i8, i10);
                    return (i9 + i10) - i;
                }
                e5r.m114891a("Malformed input at ", i9);
                return 0;
            }
            LZ4SafeUtils.wildArraycopy(bArr, i9, bArr2, i8, i10);
            int i13 = i9 + i10;
            int shortLE = SafeUtils.readShortLE(bArr, i13);
            i7 = i13 + 2;
            int i14 = i11 - shortLE;
            if (i14 < i2) {
                e5r.m114891a("Malformed input at ", i7);
                return 0;
            }
            int i15 = b3 & 15;
            if (i15 == 15) {
                while (true) {
                    i4 = i7 + 1;
                    b = SafeUtils.readByte(bArr, i7);
                    if (b != -1) {
                        break;
                    }
                    i15 += 255;
                    i7 = i4;
                }
                i15 += b & 255;
                i7 = i4;
            }
            int i16 = i15 + 4;
            int i17 = i11 + i16;
            if (i17 <= i12) {
                LZ4SafeUtils.wildIncrementalCopy(bArr2, i14, i11, i17);
            } else if (i17 <= i6) {
                LZ4SafeUtils.safeIncrementalCopy(bArr2, i14, i11, i16);
            } else {
                e5r.m114891a("Malformed input at ", i7);
                return 0;
            }
            i8 = i17;
        }
    }
}
