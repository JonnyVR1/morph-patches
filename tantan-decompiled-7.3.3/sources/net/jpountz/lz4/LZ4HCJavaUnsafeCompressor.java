package net.jpountz.lz4;

import java.nio.ByteBuffer;
import java.util.Arrays;
import net.jpountz.util.ByteBufferUtils;
import net.jpountz.util.UnsafeUtils;

/* JADX INFO: loaded from: classes2.dex */
final class LZ4HCJavaUnsafeCompressor extends LZ4Compressor {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final LZ4Compressor INSTANCE = new LZ4HCJavaUnsafeCompressor();
    final int compressionLevel;
    private final int maxAttempts;

    public LZ4HCJavaUnsafeCompressor(int i) {
        this.maxAttempts = 1 << (i - 1);
        this.compressionLevel = i;
    }

    @Override // net.jpountz.lz4.LZ4Compressor
    public int compress(ByteBuffer byteBuffer, int i, int i2, ByteBuffer byteBuffer2, int i3, int i4) {
        HashTable hashTable;
        ByteBuffer byteBuffer3;
        LZ4Utils.Match match;
        int i5;
        char c;
        ByteBuffer byteBuffer4;
        LZ4Utils.Match match2;
        int iEnd = i;
        if (byteBuffer.hasArray() && byteBuffer2.hasArray()) {
            return compress(byteBuffer.array(), iEnd + byteBuffer.arrayOffset(), i2, byteBuffer2.array(), i3 + byteBuffer2.arrayOffset(), i4);
        }
        ByteBuffer byteBufferInNativeByteOrder = ByteBufferUtils.inNativeByteOrder(byteBuffer);
        ByteBuffer byteBufferInNativeByteOrder2 = ByteBufferUtils.inNativeByteOrder(byteBuffer2);
        ByteBufferUtils.checkRange(byteBufferInNativeByteOrder, iEnd, i2);
        ByteBufferUtils.checkRange(byteBufferInNativeByteOrder2, i3, i4);
        int i6 = iEnd + i2;
        int i7 = i3 + i4;
        int i8 = i6 - 12;
        int i9 = i6 - 5;
        int iEnd2 = iEnd + 1;
        HashTable hashTable2 = new HashTable(iEnd);
        LZ4Utils.Match match3 = new LZ4Utils.Match();
        LZ4Utils.Match match4 = new LZ4Utils.Match();
        LZ4Utils.Match match5 = new LZ4Utils.Match();
        LZ4Utils.Match match6 = new LZ4Utils.Match();
        int iEncodeSequence = i3;
        while (iEnd2 < i8) {
            if (hashTable2.insertAndFindBestMatch(byteBufferInNativeByteOrder, iEnd2, i9, match4)) {
                LZ4Utils.copyTo(match4, match3);
                int iEncodeSequence2 = iEncodeSequence;
                while (true) {
                    if (match4.end() < i8) {
                        boolean zInsertAndFindWiderMatch = hashTable2.insertAndFindWiderMatch(byteBufferInNativeByteOrder, match4.end() - 2, match4.start + 1, i9, match4.len, match5);
                        ByteBuffer byteBuffer5 = byteBufferInNativeByteOrder;
                        HashTable hashTable3 = hashTable2;
                        byteBuffer3 = byteBuffer5;
                        LZ4Utils.Match match7 = match5;
                        if (zInsertAndFindWiderMatch) {
                            int i10 = match3.start;
                            int i11 = match4.start;
                            if (i10 < i11 && match7.start < i11 + match3.len) {
                                LZ4Utils.copyTo(match3, match4);
                            }
                            char c2 = 3;
                            if (match7.start - match4.start < 3) {
                                LZ4Utils.copyTo(match7, match4);
                                byteBufferInNativeByteOrder = byteBuffer3;
                                hashTable2 = hashTable3;
                                match5 = match7;
                            } else {
                                while (true) {
                                    int i12 = match7.start;
                                    int i13 = match4.start;
                                    int i14 = iEnd;
                                    if (i12 - i13 < 18) {
                                        int i15 = match4.len;
                                        if (i15 > 18) {
                                            i15 = 18;
                                        }
                                        c = c2;
                                        if (i13 + i15 > match7.end() - 4) {
                                            i15 = ((match7.start - match4.start) + match7.len) - 4;
                                        }
                                        int i16 = i15 - (match7.start - match4.start);
                                        if (i16 > 0) {
                                            match7.fix(i16);
                                        }
                                    } else {
                                        c = c2;
                                    }
                                    if (match7.start + match7.len < i8) {
                                        HashTable hashTable4 = hashTable3;
                                        ByteBuffer byteBuffer6 = byteBuffer3;
                                        LZ4Utils.Match match8 = match6;
                                        match = match7;
                                        char c3 = c;
                                        hashTable = hashTable4;
                                        byteBuffer3 = byteBuffer6;
                                        i5 = i9;
                                        if (hashTable4.insertAndFindWiderMatch(byteBuffer6, match7.end() - 3, match7.start, i9, match7.len, match8)) {
                                            if (match8.start >= match4.end() + 3) {
                                                byteBuffer4 = byteBufferInNativeByteOrder2;
                                                match2 = match8;
                                                int i17 = iEncodeSequence2;
                                                if (match.start < match4.end()) {
                                                    int i18 = match.start;
                                                    int i19 = match4.start;
                                                    if (i18 - i19 < 15) {
                                                        if (match4.len > 18) {
                                                            match4.len = 18;
                                                        }
                                                        if (match4.end() > match.end() - 4) {
                                                            match4.len = (match.end() - match4.start) - 4;
                                                        }
                                                        match.fix(match4.end() - match.start);
                                                    } else {
                                                        match4.len = i18 - i19;
                                                    }
                                                }
                                                iEncodeSequence2 = LZ4ByteBufferUtils.encodeSequence(byteBuffer3, i14, match4.start, match4.ref, match4.len, byteBuffer4, i17, i7);
                                                iEnd = match4.end();
                                                LZ4Utils.copyTo(match, match4);
                                                LZ4Utils.copyTo(match2, match);
                                            } else if (match8.start >= match4.end()) {
                                                if (match.start < match4.end()) {
                                                    match.fix(match4.end() - match.start);
                                                    if (match.len < 4) {
                                                        LZ4Utils.copyTo(match8, match);
                                                    }
                                                }
                                                ByteBuffer byteBuffer7 = byteBufferInNativeByteOrder2;
                                                iEncodeSequence2 = LZ4ByteBufferUtils.encodeSequence(byteBuffer3, i14, match4.start, match4.ref, match4.len, byteBuffer7, iEncodeSequence2, i7);
                                                iEnd = match4.end();
                                                LZ4Utils.copyTo(match8, match4);
                                                LZ4Utils.copyTo(match, match3);
                                                byteBufferInNativeByteOrder = byteBuffer3;
                                                match5 = match;
                                                i9 = i5;
                                                hashTable2 = hashTable;
                                                match6 = match8;
                                                byteBufferInNativeByteOrder2 = byteBuffer7;
                                            } else {
                                                byteBuffer4 = byteBufferInNativeByteOrder2;
                                                match2 = match8;
                                                LZ4Utils.copyTo(match2, match);
                                                iEnd = i14;
                                            }
                                            match7 = match;
                                            i9 = i5;
                                            hashTable3 = hashTable;
                                            match6 = match2;
                                            byteBufferInNativeByteOrder2 = byteBuffer4;
                                            c2 = c3;
                                        } else {
                                            match6 = match8;
                                        }
                                    } else {
                                        hashTable = hashTable3;
                                        i5 = i9;
                                        match6 = match6;
                                        match = match7;
                                    }
                                    int i20 = iEncodeSequence2;
                                    if (match.start < match4.end()) {
                                        match4.len = match.start - match4.start;
                                    }
                                    iEncodeSequence = LZ4ByteBufferUtils.encodeSequence(byteBuffer3, match4.end(), match.start, match.ref, match.len, byteBufferInNativeByteOrder2, LZ4ByteBufferUtils.encodeSequence(byteBuffer3, i14, match4.start, match4.ref, match4.len, byteBufferInNativeByteOrder2, i20, i7), i7);
                                    iEnd2 = match.end();
                                }
                            }
                        } else {
                            hashTable = hashTable3;
                            match = match7;
                        }
                        byteBufferInNativeByteOrder = byteBuffer3;
                        iEnd = iEnd2;
                        match5 = match;
                        i9 = i5;
                        hashTable2 = hashTable;
                        match6 = match6;
                        byteBufferInNativeByteOrder2 = byteBufferInNativeByteOrder2;
                    } else {
                        hashTable = hashTable2;
                        byteBuffer3 = byteBufferInNativeByteOrder;
                        match = match5;
                    }
                    i5 = i9;
                    iEncodeSequence = LZ4ByteBufferUtils.encodeSequence(byteBuffer3, iEnd, match4.start, match4.ref, match4.len, byteBufferInNativeByteOrder2, iEncodeSequence2, i7);
                    iEnd2 = match4.end();
                    byteBufferInNativeByteOrder = byteBuffer3;
                    iEnd = iEnd2;
                    match5 = match;
                    i9 = i5;
                    hashTable2 = hashTable;
                    match6 = match6;
                    byteBufferInNativeByteOrder2 = byteBufferInNativeByteOrder2;
                }
            } else {
                iEnd2++;
            }
        }
        return LZ4ByteBufferUtils.lastLiterals(byteBufferInNativeByteOrder, iEnd, i6 - iEnd, byteBufferInNativeByteOrder2, iEncodeSequence, i7) - i3;
    }

    public class HashTable {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        static final int MASK = 65535;
        private final int base;
        private final short[] chainTable;
        private final int[] hashTable;
        int nextToUpdate;

        public HashTable(int i) {
            this.base = i;
            this.nextToUpdate = i;
            int[] iArr = new int[32768];
            this.hashTable = iArr;
            Arrays.fill(iArr, -1);
            this.chainTable = new short[65536];
        }

        private void addHash(int i, int i2) {
            int iHashHC = LZ4Utils.hashHC(i);
            int[] iArr = this.hashTable;
            int i3 = i2 - iArr[iHashHC];
            if (i3 >= 65536) {
                i3 = 65535;
            }
            this.chainTable[i2 & 65535] = (short) i3;
            iArr[iHashHC] = i2;
        }

        private int hashPointer(byte[] bArr, int i) {
            return hashPointer(UnsafeUtils.readInt(bArr, i));
        }

        private int next(int i) {
            return i - (this.chainTable[i & 65535] & 65535);
        }

        public void insert(int i, byte[] bArr) {
            while (true) {
                int i2 = this.nextToUpdate;
                if (i2 >= i) {
                    return;
                }
                addHash(bArr, i2);
                this.nextToUpdate++;
            }
        }

        public boolean insertAndFindBestMatch(byte[] bArr, int i, int i2, LZ4Utils.Match match) {
            int i3;
            int iCommonBytes;
            int iCommonBytes2;
            match.start = i;
            match.len = 0;
            insert(i, bArr);
            int iHashPointer = hashPointer(bArr, i);
            if (iHashPointer < i - 4 || iHashPointer > i || iHashPointer < this.base) {
                i3 = 0;
                iCommonBytes = 0;
            } else {
                if (LZ4UnsafeUtils.readIntEquals(bArr, iHashPointer, i)) {
                    i3 = i - iHashPointer;
                    iCommonBytes = LZ4UnsafeUtils.commonBytes(bArr, iHashPointer + 4, i + 4, i2) + 4;
                    match.len = iCommonBytes;
                    match.ref = iHashPointer;
                } else {
                    i3 = 0;
                    iCommonBytes = 0;
                }
                iHashPointer = next(iHashPointer);
            }
            for (int i4 = 0; i4 < LZ4HCJavaUnsafeCompressor.this.maxAttempts && iHashPointer >= Math.max(this.base, i - 65535) && iHashPointer <= i; i4++) {
                if (LZ4UnsafeUtils.readIntEquals(bArr, iHashPointer, i) && (iCommonBytes2 = LZ4UnsafeUtils.commonBytes(bArr, iHashPointer + 4, i + 4, i2) + 4) > match.len) {
                    match.ref = iHashPointer;
                    match.len = iCommonBytes2;
                }
                iHashPointer = next(iHashPointer);
            }
            if (iCommonBytes != 0) {
                int i5 = (iCommonBytes + i) - 3;
                while (i < i5 - i3) {
                    this.chainTable[i & 65535] = (short) i3;
                    i++;
                }
                do {
                    this.chainTable[i & 65535] = (short) i3;
                    this.hashTable[LZ4Utils.hashHC(UnsafeUtils.readInt(bArr, i))] = i;
                    i++;
                } while (i < i5);
                this.nextToUpdate = i5;
            }
            return match.len != 0;
        }

        public boolean insertAndFindWiderMatch(byte[] bArr, int i, int i2, int i3, int i4, LZ4Utils.Match match) {
            match.len = i4;
            insert(i, bArr);
            int iHashPointer = hashPointer(bArr, i);
            for (int i5 = 0; i5 < LZ4HCJavaUnsafeCompressor.this.maxAttempts && iHashPointer >= Math.max(this.base, i - 65535) && iHashPointer <= i; i5++) {
                if (LZ4UnsafeUtils.readIntEquals(bArr, iHashPointer, i)) {
                    int iCommonBytes = LZ4UnsafeUtils.commonBytes(bArr, iHashPointer + 4, i + 4, i3) + 4;
                    int iCommonBytesBackward = LZ4UnsafeUtils.commonBytesBackward(bArr, iHashPointer, i, this.base, i2);
                    int i6 = iCommonBytes + iCommonBytesBackward;
                    if (i6 > match.len) {
                        match.len = i6;
                        match.ref = iHashPointer - iCommonBytesBackward;
                        match.start = i - iCommonBytesBackward;
                    }
                }
                iHashPointer = next(iHashPointer);
            }
            return match.len > i4;
        }

        private int hashPointer(ByteBuffer byteBuffer, int i) {
            return hashPointer(ByteBufferUtils.readInt(byteBuffer, i));
        }

        private int hashPointer(int i) {
            return this.hashTable[LZ4Utils.hashHC(i)];
        }

        public void insert(int i, ByteBuffer byteBuffer) {
            while (true) {
                int i2 = this.nextToUpdate;
                if (i2 >= i) {
                    return;
                }
                addHash(byteBuffer, i2);
                this.nextToUpdate++;
            }
        }

        private void addHash(ByteBuffer byteBuffer, int i) {
            addHash(ByteBufferUtils.readInt(byteBuffer, i), i);
        }

        private void addHash(byte[] bArr, int i) {
            addHash(UnsafeUtils.readInt(bArr, i), i);
        }

        public boolean insertAndFindWiderMatch(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, LZ4Utils.Match match) {
            match.len = i4;
            insert(i, byteBuffer);
            int iHashPointer = hashPointer(byteBuffer, i);
            for (int i5 = 0; i5 < LZ4HCJavaUnsafeCompressor.this.maxAttempts && iHashPointer >= Math.max(this.base, i - 65535) && iHashPointer <= i; i5++) {
                if (LZ4ByteBufferUtils.readIntEquals(byteBuffer, iHashPointer, i)) {
                    int iCommonBytes = LZ4ByteBufferUtils.commonBytes(byteBuffer, iHashPointer + 4, i + 4, i3) + 4;
                    int iCommonBytesBackward = LZ4ByteBufferUtils.commonBytesBackward(byteBuffer, iHashPointer, i, this.base, i2);
                    int i6 = iCommonBytes + iCommonBytesBackward;
                    if (i6 > match.len) {
                        match.len = i6;
                        match.ref = iHashPointer - iCommonBytesBackward;
                        match.start = i - iCommonBytesBackward;
                    }
                }
                iHashPointer = next(iHashPointer);
            }
            return match.len > i4;
        }

        public boolean insertAndFindBestMatch(ByteBuffer byteBuffer, int i, int i2, LZ4Utils.Match match) {
            int i3;
            int iCommonBytes;
            int iCommonBytes2;
            match.start = i;
            match.len = 0;
            insert(i, byteBuffer);
            int iHashPointer = hashPointer(byteBuffer, i);
            if (iHashPointer < i - 4 || iHashPointer > i || iHashPointer < this.base) {
                i3 = 0;
                iCommonBytes = 0;
            } else {
                if (LZ4ByteBufferUtils.readIntEquals(byteBuffer, iHashPointer, i)) {
                    i3 = i - iHashPointer;
                    iCommonBytes = LZ4ByteBufferUtils.commonBytes(byteBuffer, iHashPointer + 4, i + 4, i2) + 4;
                    match.len = iCommonBytes;
                    match.ref = iHashPointer;
                } else {
                    i3 = 0;
                    iCommonBytes = 0;
                }
                iHashPointer = next(iHashPointer);
            }
            for (int i4 = 0; i4 < LZ4HCJavaUnsafeCompressor.this.maxAttempts && iHashPointer >= Math.max(this.base, i - 65535) && iHashPointer <= i; i4++) {
                if (LZ4ByteBufferUtils.readIntEquals(byteBuffer, iHashPointer, i) && (iCommonBytes2 = LZ4ByteBufferUtils.commonBytes(byteBuffer, iHashPointer + 4, i + 4, i2) + 4) > match.len) {
                    match.ref = iHashPointer;
                    match.len = iCommonBytes2;
                }
                iHashPointer = next(iHashPointer);
            }
            if (iCommonBytes != 0) {
                int i5 = (iCommonBytes + i) - 3;
                while (i < i5 - i3) {
                    this.chainTable[i & 65535] = (short) i3;
                    i++;
                }
                do {
                    this.chainTable[i & 65535] = (short) i3;
                    this.hashTable[LZ4Utils.hashHC(ByteBufferUtils.readInt(byteBuffer, i))] = i;
                    i++;
                } while (i < i5);
                this.nextToUpdate = i5;
            }
            return match.len != 0;
        }
    }

    public LZ4HCJavaUnsafeCompressor() {
        this(9);
    }

    @Override // net.jpountz.lz4.LZ4Compressor
    public int compress(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        HashTable hashTable;
        int i5;
        LZ4Utils.Match match;
        UnsafeUtils.checkRange(bArr, i, i2);
        UnsafeUtils.checkRange(bArr2, i3, i4);
        int i6 = i + i2;
        int i7 = i3 + i4;
        int i8 = i6 - 12;
        int i9 = i6 - 5;
        HashTable hashTable2 = new HashTable(i);
        LZ4Utils.Match match2 = new LZ4Utils.Match();
        LZ4Utils.Match match3 = new LZ4Utils.Match();
        LZ4Utils.Match match4 = new LZ4Utils.Match();
        LZ4Utils.Match match5 = new LZ4Utils.Match();
        int i10 = i;
        int iEnd = i + 1;
        int iEncodeSequence = i3;
        while (iEnd < i8) {
            bArr = bArr;
            if (hashTable2.insertAndFindBestMatch(bArr, iEnd, i9, match3)) {
                LZ4Utils.copyTo(match3, match2);
                int i11 = i10;
                int iEncodeSequence2 = iEncodeSequence;
                while (true) {
                    if (match3.end() < i8) {
                        match4 = match4;
                        if (hashTable2.insertAndFindWiderMatch(bArr, match3.end() - 2, match3.start + 1, i9, match3.len, match4)) {
                            int i12 = match2.start;
                            int i13 = match3.start;
                            if (i12 < i13 && match4.start < i13 + match2.len) {
                                LZ4Utils.copyTo(match2, match3);
                            }
                            char c = 3;
                            if (match4.start - match3.start < 3) {
                                LZ4Utils.copyTo(match4, match3);
                            } else {
                                while (true) {
                                    int i14 = match4.start;
                                    int i15 = match3.start;
                                    if (i14 - i15 < 18) {
                                        int i16 = match3.len;
                                        if (i16 > 18) {
                                            i16 = 18;
                                        }
                                        c = c;
                                        if (i15 + i16 > match4.end() - 4) {
                                            i16 = ((match4.start - match3.start) + match4.len) - 4;
                                        }
                                        int i17 = i16 - (match4.start - match3.start);
                                        if (i17 > 0) {
                                            match4.fix(i17);
                                        }
                                    } else {
                                        c = c;
                                    }
                                    if (match4.start + match4.len < i8) {
                                        LZ4Utils.Match match6 = match5;
                                        hashTable = hashTable2;
                                        i5 = i9;
                                        if (hashTable2.insertAndFindWiderMatch(bArr, match4.end() - 3, match4.start, i9, match4.len, match6)) {
                                            if (match6.start < match3.end() + 3) {
                                                if (match6.start >= match3.end()) {
                                                    if (match4.start < match3.end()) {
                                                        match4.fix(match3.end() - match4.start);
                                                        if (match4.len < 4) {
                                                            LZ4Utils.copyTo(match6, match4);
                                                        }
                                                    }
                                                    iEncodeSequence2 = LZ4UnsafeUtils.encodeSequence(bArr, i11, match3.start, match3.ref, match3.len, bArr2, iEncodeSequence2, i7);
                                                    int iEnd2 = match3.end();
                                                    LZ4Utils.copyTo(match6, match3);
                                                    LZ4Utils.copyTo(match4, match2);
                                                    match5 = match6;
                                                    i11 = iEnd2;
                                                    i9 = i5;
                                                    hashTable2 = hashTable;
                                                } else {
                                                    LZ4Utils.copyTo(match6, match4);
                                                    match5 = match6;
                                                    i11 = i11;
                                                }
                                            } else {
                                                int i18 = i11;
                                                int i19 = iEncodeSequence2;
                                                if (match4.start < match3.end()) {
                                                    int i20 = match4.start;
                                                    int i21 = match3.start;
                                                    if (i20 - i21 < 15) {
                                                        if (match3.len > 18) {
                                                            match3.len = 18;
                                                        }
                                                        if (match3.end() > match4.end() - 4) {
                                                            match3.len = (match4.end() - match3.start) - 4;
                                                        }
                                                        match4.fix(match3.end() - match4.start);
                                                    } else {
                                                        match3.len = i20 - i21;
                                                    }
                                                }
                                                iEncodeSequence2 = LZ4UnsafeUtils.encodeSequence(bArr, i18, match3.start, match3.ref, match3.len, bArr2, i19, i7);
                                                int iEnd3 = match3.end();
                                                LZ4Utils.copyTo(match4, match3);
                                                LZ4Utils.copyTo(match6, match4);
                                                match5 = match6;
                                                i11 = iEnd3;
                                            }
                                            i9 = i5;
                                            hashTable2 = hashTable;
                                        } else {
                                            match = match6;
                                        }
                                    } else {
                                        hashTable = hashTable2;
                                        i5 = i9;
                                        match = match5;
                                    }
                                    int i22 = iEncodeSequence2;
                                    if (match4.start < match3.end()) {
                                        match3.len = match4.start - match3.start;
                                    }
                                    iEncodeSequence = LZ4UnsafeUtils.encodeSequence(bArr, match3.end(), match4.start, match4.ref, match4.len, bArr2, LZ4UnsafeUtils.encodeSequence(bArr, i11, match3.start, match3.ref, match3.len, bArr2, i22, i7), i7);
                                    match5 = match;
                                    iEnd = match4.end();
                                }
                            }
                        }
                        i10 = iEnd;
                        match4 = match4;
                        i9 = i5;
                        hashTable2 = hashTable;
                    } else {
                        match4 = match4;
                    }
                    hashTable = hashTable2;
                    i5 = i9;
                    iEncodeSequence = LZ4UnsafeUtils.encodeSequence(bArr, i11, match3.start, match3.ref, match3.len, bArr2, iEncodeSequence2, i7);
                    iEnd = match3.end();
                    i10 = iEnd;
                    match4 = match4;
                    i9 = i5;
                    hashTable2 = hashTable;
                }
            } else {
                iEnd++;
            }
        }
        return LZ4UnsafeUtils.lastLiterals(bArr, i10, i6 - i10, bArr2, iEncodeSequence, i7) - i3;
    }
}
