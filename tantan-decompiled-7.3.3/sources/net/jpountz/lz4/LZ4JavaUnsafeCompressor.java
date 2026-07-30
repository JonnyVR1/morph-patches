package net.jpountz.lz4;

import java.nio.ByteBuffer;
import java.util.Arrays;
import net.jpountz.util.ByteBufferUtils;
import net.jpountz.util.UnsafeUtils;

/* JADX INFO: loaded from: classes2.dex */
final class LZ4JavaUnsafeCompressor extends LZ4Compressor {
    public static final LZ4Compressor INSTANCE = new LZ4JavaUnsafeCompressor();

    public static int compress64k(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8 = i;
        int i9 = i8 + i2;
        int i10 = i9 - 5;
        int i11 = i9 - 12;
        if (i2 >= 13) {
            short[] sArr = new short[8192];
            int i12 = i8 + 1;
            int i13 = i3;
            int i14 = i8;
            loop0: while (true) {
                int i15 = 1;
                int i16 = 1 << LZ4Constants.SKIP_STRENGTH;
                while (true) {
                    int i17 = i15 + i12;
                    int i18 = i16 + 1;
                    int i19 = i16 >>> LZ4Constants.SKIP_STRENGTH;
                    if (i17 > i11) {
                        i5 = i9;
                        i8 = i14;
                        break loop0;
                    }
                    int iHash64k = LZ4Utils.hash64k(UnsafeUtils.readInt(bArr, i12));
                    i7 = UnsafeUtils.readShort(sArr, iHash64k) + i8;
                    i5 = i9;
                    UnsafeUtils.writeShort(sArr, iHash64k, i12 - i8);
                    if (LZ4UnsafeUtils.readIntEquals(bArr, i7, i12)) {
                        break;
                    }
                    i12 = i17;
                    i9 = i5;
                    i15 = i19;
                    i16 = i18;
                }
                int iCommonBytesBackward = LZ4UnsafeUtils.commonBytesBackward(bArr, i7, i12, i8, i14);
                int i20 = i12 - iCommonBytesBackward;
                int i21 = i7 - iCommonBytesBackward;
                int i22 = i20 - i14;
                int iWriteLen = i13 + 1;
                if (iWriteLen + i22 + 8 + (i22 >>> 8) > i4) {
                    throw new LZ4Exception("maxDestLen is too small");
                }
                if (i22 >= 15) {
                    UnsafeUtils.writeByte(bArr2, i13, 240);
                    iWriteLen = LZ4UnsafeUtils.writeLen(i22 - 15, bArr2, iWriteLen);
                } else {
                    UnsafeUtils.writeByte(bArr2, i13, i22 << 4);
                }
                LZ4UnsafeUtils.wildArraycopy(bArr, i14, bArr2, iWriteLen, i22);
                int i23 = iWriteLen + i22;
                while (true) {
                    UnsafeUtils.writeShortLE(bArr2, i23, (short) (i20 - i21));
                    int iWriteLen2 = i23 + 2;
                    int i24 = i20 + 4;
                    int iCommonBytes = LZ4UnsafeUtils.commonBytes(bArr, i21 + 4, i24, i10);
                    if (i23 + 8 + (iCommonBytes >>> 8) > i4) {
                        throw new LZ4Exception("maxDestLen is too small");
                    }
                    i20 = i24 + iCommonBytes;
                    if (iCommonBytes >= 15) {
                        UnsafeUtils.writeByte(bArr2, i13, UnsafeUtils.readByte(bArr2, i13) | 15);
                        iWriteLen2 = LZ4UnsafeUtils.writeLen(iCommonBytes - 15, bArr2, iWriteLen2);
                    } else {
                        UnsafeUtils.writeByte(bArr2, i13, iCommonBytes | UnsafeUtils.readByte(bArr2, i13));
                    }
                    i13 = iWriteLen2;
                    if (i20 > i11) {
                        i8 = i20;
                        break loop0;
                    }
                    int i25 = i20 - 2;
                    UnsafeUtils.writeShort(sArr, LZ4Utils.hash64k(UnsafeUtils.readInt(bArr, i25)), i25 - i8);
                    int iHash64k2 = LZ4Utils.hash64k(UnsafeUtils.readInt(bArr, i20));
                    i21 = i8 + UnsafeUtils.readShort(sArr, iHash64k2);
                    UnsafeUtils.writeShort(sArr, iHash64k2, i20 - i8);
                    if (!LZ4UnsafeUtils.readIntEquals(bArr, i20, i21)) {
                        break;
                    }
                    i23 = i13 + 1;
                    UnsafeUtils.writeByte(bArr2, i13, 0);
                }
                i14 = i20;
                i12 = i20 + 1;
                i9 = i5;
            }
            i6 = i13;
        } else {
            i5 = i9;
            i6 = i3;
        }
        return LZ4UnsafeUtils.lastLiterals(bArr, i8, i5 - i8, bArr2, i6, i4) - i3;
    }

    @Override // net.jpountz.lz4.LZ4Compressor
    public int compress(ByteBuffer byteBuffer, int i, int i2, ByteBuffer byteBuffer2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        if (byteBuffer.hasArray() && byteBuffer2.hasArray()) {
            return compress(byteBuffer.array(), byteBuffer.arrayOffset() + i, i2, byteBuffer2.array(), i3 + byteBuffer2.arrayOffset(), i4);
        }
        ByteBuffer byteBufferInNativeByteOrder = ByteBufferUtils.inNativeByteOrder(byteBuffer);
        ByteBuffer byteBufferInNativeByteOrder2 = ByteBufferUtils.inNativeByteOrder(byteBuffer2);
        ByteBufferUtils.checkRange(byteBufferInNativeByteOrder, i, i2);
        ByteBufferUtils.checkRange(byteBufferInNativeByteOrder2, i3, i4);
        int i9 = i3 + i4;
        if (i2 < 65547) {
            return compress64k(byteBufferInNativeByteOrder, i, i2, byteBufferInNativeByteOrder2, i3, i9);
        }
        int i10 = i + i2;
        int i11 = i10 - 5;
        int i12 = i10 - 12;
        int[] iArr = new int[4096];
        Arrays.fill(iArr, i);
        int i13 = i3;
        int i14 = i + 1;
        int i15 = i;
        loop0: while (true) {
            int i16 = 1;
            int i17 = 1 << LZ4Constants.SKIP_STRENGTH;
            while (true) {
                int i18 = i16 + i14;
                int i19 = i17 + 1;
                int i20 = i17 >>> LZ4Constants.SKIP_STRENGTH;
                if (i18 > i12) {
                    i5 = i10;
                    i6 = i15;
                    break loop0;
                }
                int iHash = LZ4Utils.hash(ByteBufferUtils.readInt(byteBufferInNativeByteOrder, i14));
                i7 = UnsafeUtils.readInt(iArr, iHash);
                i5 = i10;
                i8 = i14 - i7;
                UnsafeUtils.writeInt(iArr, iHash, i14);
                if (i8 >= 65536 || !LZ4ByteBufferUtils.readIntEquals(byteBufferInNativeByteOrder, i7, i14)) {
                    i10 = i5;
                    i14 = i18;
                    i16 = i20;
                    i17 = i19;
                }
            }
            int iCommonBytesBackward = LZ4ByteBufferUtils.commonBytesBackward(byteBufferInNativeByteOrder, i7, i14, i, i15);
            int i21 = i14 - iCommonBytesBackward;
            int i22 = i7 - iCommonBytesBackward;
            int i23 = i21 - i15;
            int iWriteLen = i13 + 1;
            if (iWriteLen + i23 + 8 + (i23 >>> 8) > i9) {
                throw new LZ4Exception("maxDestLen is too small");
            }
            if (i23 >= 15) {
                ByteBufferUtils.writeByte(byteBufferInNativeByteOrder2, i13, 240);
                iWriteLen = LZ4ByteBufferUtils.writeLen(i23 - 15, byteBufferInNativeByteOrder2, iWriteLen);
            } else {
                ByteBufferUtils.writeByte(byteBufferInNativeByteOrder2, i13, i23 << 4);
            }
            LZ4ByteBufferUtils.wildArraycopy(byteBufferInNativeByteOrder, i15, byteBufferInNativeByteOrder2, iWriteLen, i23);
            int i24 = iWriteLen + i23;
            while (true) {
                ByteBufferUtils.writeShortLE(byteBufferInNativeByteOrder2, i24, i8);
                int iWriteLen2 = i24 + 2;
                int i25 = i21 + 4;
                int iCommonBytes = LZ4ByteBufferUtils.commonBytes(byteBufferInNativeByteOrder, i22 + 4, i25, i11);
                if (i24 + 8 + (iCommonBytes >>> 8) > i9) {
                    throw new LZ4Exception("maxDestLen is too small");
                }
                i21 = i25 + iCommonBytes;
                if (iCommonBytes >= 15) {
                    ByteBufferUtils.writeByte(byteBufferInNativeByteOrder2, i13, ByteBufferUtils.readByte(byteBufferInNativeByteOrder2, i13) | 15);
                    iWriteLen2 = LZ4ByteBufferUtils.writeLen(iCommonBytes - 15, byteBufferInNativeByteOrder2, iWriteLen2);
                } else {
                    ByteBufferUtils.writeByte(byteBufferInNativeByteOrder2, i13, iCommonBytes | ByteBufferUtils.readByte(byteBufferInNativeByteOrder2, i13));
                }
                i13 = iWriteLen2;
                if (i21 > i12) {
                    i6 = i21;
                    break loop0;
                }
                int i26 = i21 - 2;
                UnsafeUtils.writeInt(iArr, LZ4Utils.hash(ByteBufferUtils.readInt(byteBufferInNativeByteOrder, i26)), i26);
                int iHash2 = LZ4Utils.hash(ByteBufferUtils.readInt(byteBufferInNativeByteOrder, i21));
                i22 = UnsafeUtils.readInt(iArr, iHash2);
                UnsafeUtils.writeInt(iArr, iHash2, i21);
                i8 = i21 - i22;
                if (i8 >= 65536 || !LZ4ByteBufferUtils.readIntEquals(byteBufferInNativeByteOrder, i22, i21)) {
                    i15 = i21;
                    i14 = i21 + 1;
                    i10 = i5;
                } else {
                    i24 = i13 + 1;
                    ByteBufferUtils.writeByte(byteBufferInNativeByteOrder2, i13, 0);
                }
            }
        }
        return LZ4ByteBufferUtils.lastLiterals(byteBufferInNativeByteOrder, i6, i5 - i6, byteBufferInNativeByteOrder2, i13, i9) - i3;
    }

    public static int compress64k(ByteBuffer byteBuffer, int i, int i2, ByteBuffer byteBuffer2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8 = i;
        int i9 = i8 + i2;
        int i10 = i9 - 5;
        int i11 = i9 - 12;
        if (i2 >= 13) {
            short[] sArr = new short[8192];
            int i12 = i8 + 1;
            int i13 = i3;
            int i14 = i8;
            loop0: while (true) {
                int i15 = 1;
                int i16 = 1 << LZ4Constants.SKIP_STRENGTH;
                while (true) {
                    int i17 = i15 + i12;
                    int i18 = i16 + 1;
                    int i19 = i16 >>> LZ4Constants.SKIP_STRENGTH;
                    if (i17 > i11) {
                        i5 = i9;
                        i8 = i14;
                        break loop0;
                    }
                    int iHash64k = LZ4Utils.hash64k(ByteBufferUtils.readInt(byteBuffer, i12));
                    i7 = UnsafeUtils.readShort(sArr, iHash64k) + i8;
                    i5 = i9;
                    UnsafeUtils.writeShort(sArr, iHash64k, i12 - i8);
                    if (LZ4ByteBufferUtils.readIntEquals(byteBuffer, i7, i12)) {
                        break;
                    }
                    i12 = i17;
                    i9 = i5;
                    i15 = i19;
                    i16 = i18;
                }
                int iCommonBytesBackward = LZ4ByteBufferUtils.commonBytesBackward(byteBuffer, i7, i12, i8, i14);
                int i20 = i12 - iCommonBytesBackward;
                int i21 = i7 - iCommonBytesBackward;
                int i22 = i20 - i14;
                int iWriteLen = i13 + 1;
                if (iWriteLen + i22 + 8 + (i22 >>> 8) <= i4) {
                    if (i22 >= 15) {
                        ByteBufferUtils.writeByte(byteBuffer2, i13, 240);
                        iWriteLen = LZ4ByteBufferUtils.writeLen(i22 - 15, byteBuffer2, iWriteLen);
                    } else {
                        ByteBufferUtils.writeByte(byteBuffer2, i13, i22 << 4);
                    }
                    LZ4ByteBufferUtils.wildArraycopy(byteBuffer, i14, byteBuffer2, iWriteLen, i22);
                    int i23 = iWriteLen + i22;
                    while (true) {
                        ByteBufferUtils.writeShortLE(byteBuffer2, i23, (short) (i20 - i21));
                        int iWriteLen2 = i23 + 2;
                        int i24 = i20 + 4;
                        int iCommonBytes = LZ4ByteBufferUtils.commonBytes(byteBuffer, i21 + 4, i24, i10);
                        if (i23 + 8 + (iCommonBytes >>> 8) > i4) {
                            throw new LZ4Exception("maxDestLen is too small");
                        }
                        i20 = i24 + iCommonBytes;
                        if (iCommonBytes >= 15) {
                            ByteBufferUtils.writeByte(byteBuffer2, i13, ByteBufferUtils.readByte(byteBuffer2, i13) | 15);
                            iWriteLen2 = LZ4ByteBufferUtils.writeLen(iCommonBytes - 15, byteBuffer2, iWriteLen2);
                        } else {
                            ByteBufferUtils.writeByte(byteBuffer2, i13, iCommonBytes | ByteBufferUtils.readByte(byteBuffer2, i13));
                        }
                        i13 = iWriteLen2;
                        if (i20 > i11) {
                            i8 = i20;
                            break loop0;
                        }
                        int i25 = i20 - 2;
                        UnsafeUtils.writeShort(sArr, LZ4Utils.hash64k(ByteBufferUtils.readInt(byteBuffer, i25)), i25 - i8);
                        int iHash64k2 = LZ4Utils.hash64k(ByteBufferUtils.readInt(byteBuffer, i20));
                        i21 = i8 + UnsafeUtils.readShort(sArr, iHash64k2);
                        UnsafeUtils.writeShort(sArr, iHash64k2, i20 - i8);
                        if (!LZ4ByteBufferUtils.readIntEquals(byteBuffer, i20, i21)) {
                            break;
                        }
                        i23 = i13 + 1;
                        ByteBufferUtils.writeByte(byteBuffer2, i13, 0);
                    }
                    i14 = i20;
                    i12 = i20 + 1;
                    i9 = i5;
                } else {
                    throw new LZ4Exception("maxDestLen is too small");
                }
            }
            i6 = i13;
        } else {
            i5 = i9;
            i6 = i3;
        }
        return LZ4ByteBufferUtils.lastLiterals(byteBuffer, i8, i5 - i8, byteBuffer2, i6, i4) - i3;
    }

    @Override // net.jpountz.lz4.LZ4Compressor
    public int compress(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        UnsafeUtils.checkRange(bArr, i, i2);
        UnsafeUtils.checkRange(bArr2, i3, i4);
        int i9 = i3 + i4;
        if (i2 < 65547) {
            return compress64k(bArr, i, i2, bArr2, i3, i9);
        }
        int i10 = i + i2;
        int i11 = i10 - 5;
        int i12 = i10 - 12;
        int[] iArr = new int[4096];
        Arrays.fill(iArr, i);
        int i13 = i3;
        int i14 = i + 1;
        int i15 = i;
        loop0: while (true) {
            int i16 = 1;
            int i17 = 1 << LZ4Constants.SKIP_STRENGTH;
            while (true) {
                int i18 = i16 + i14;
                int i19 = i17 + 1;
                int i20 = i17 >>> LZ4Constants.SKIP_STRENGTH;
                if (i18 > i12) {
                    i5 = i10;
                    i6 = i15;
                    break loop0;
                }
                int iHash = LZ4Utils.hash(UnsafeUtils.readInt(bArr, i14));
                i7 = UnsafeUtils.readInt(iArr, iHash);
                i5 = i10;
                i8 = i14 - i7;
                UnsafeUtils.writeInt(iArr, iHash, i14);
                if (i8 >= 65536 || !LZ4UnsafeUtils.readIntEquals(bArr, i7, i14)) {
                    i10 = i5;
                    i14 = i18;
                    i16 = i20;
                    i17 = i19;
                }
            }
            int iCommonBytesBackward = LZ4UnsafeUtils.commonBytesBackward(bArr, i7, i14, i, i15);
            int i21 = i14 - iCommonBytesBackward;
            int i22 = i7 - iCommonBytesBackward;
            int i23 = i21 - i15;
            int iWriteLen = i13 + 1;
            if (iWriteLen + i23 + 8 + (i23 >>> 8) <= i9) {
                if (i23 >= 15) {
                    UnsafeUtils.writeByte(bArr2, i13, 240);
                    iWriteLen = LZ4UnsafeUtils.writeLen(i23 - 15, bArr2, iWriteLen);
                } else {
                    UnsafeUtils.writeByte(bArr2, i13, i23 << 4);
                }
                LZ4UnsafeUtils.wildArraycopy(bArr, i15, bArr2, iWriteLen, i23);
                int i24 = iWriteLen + i23;
                while (true) {
                    UnsafeUtils.writeShortLE(bArr2, i24, i8);
                    int iWriteLen2 = i24 + 2;
                    int i25 = i21 + 4;
                    int iCommonBytes = LZ4UnsafeUtils.commonBytes(bArr, i22 + 4, i25, i11);
                    if (i24 + 8 + (iCommonBytes >>> 8) > i9) {
                        throw new LZ4Exception("maxDestLen is too small");
                    }
                    i21 = i25 + iCommonBytes;
                    if (iCommonBytes >= 15) {
                        UnsafeUtils.writeByte(bArr2, i13, UnsafeUtils.readByte(bArr2, i13) | 15);
                        iWriteLen2 = LZ4UnsafeUtils.writeLen(iCommonBytes - 15, bArr2, iWriteLen2);
                    } else {
                        UnsafeUtils.writeByte(bArr2, i13, iCommonBytes | UnsafeUtils.readByte(bArr2, i13));
                    }
                    i13 = iWriteLen2;
                    if (i21 > i12) {
                        i6 = i21;
                        break loop0;
                    }
                    int i26 = i21 - 2;
                    UnsafeUtils.writeInt(iArr, LZ4Utils.hash(UnsafeUtils.readInt(bArr, i26)), i26);
                    int iHash2 = LZ4Utils.hash(UnsafeUtils.readInt(bArr, i21));
                    i22 = UnsafeUtils.readInt(iArr, iHash2);
                    UnsafeUtils.writeInt(iArr, iHash2, i21);
                    i8 = i21 - i22;
                    if (i8 >= 65536 || !LZ4UnsafeUtils.readIntEquals(bArr, i22, i21)) {
                        break;
                    }
                    i24 = i13 + 1;
                    UnsafeUtils.writeByte(bArr2, i13, 0);
                }
                i15 = i21;
                i14 = i21 + 1;
                i10 = i5;
            } else {
                throw new LZ4Exception("maxDestLen is too small");
            }
        }
        return LZ4UnsafeUtils.lastLiterals(bArr, i6, i5 - i6, bArr2, i13, i9) - i3;
    }
}
