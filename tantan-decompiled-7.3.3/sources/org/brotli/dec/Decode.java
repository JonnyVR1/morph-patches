package org.brotli.dec;

import com.tantanapp.ijk.media.player.IjkMediaPlayer;
import p153l.p7f;
import p153l.wtq0;

/* JADX INFO: loaded from: classes2.dex */
final class Decode {
    private static final int CODE_LENGTH_CODES = 18;
    private static final int CODE_LENGTH_REPEAT_CODE = 16;
    private static final int DEFAULT_CODE_LENGTH = 8;
    private static final int DISTANCE_CONTEXT_BITS = 2;
    private static final int HUFFMAN_TABLE_BITS = 8;
    private static final int HUFFMAN_TABLE_MASK = 255;
    private static final int LITERAL_CONTEXT_BITS = 6;
    private static final int NUM_BLOCK_LENGTH_CODES = 26;
    private static final int NUM_DISTANCE_SHORT_CODES = 16;
    private static final int NUM_INSERT_AND_COPY_CODES = 704;
    private static final int NUM_LITERAL_CODES = 256;
    private static final int[] CODE_LENGTH_CODE_ORDER = {1, 2, 3, 4, 0, 5, 17, 6, 16, 7, 8, 9, 10, 11, 12, 13, 14, 15};
    private static final int[] DISTANCE_SHORT_CODE_INDEX_OFFSET = {3, 2, 1, 0, 3, 3, 3, 3, 3, 3, 2, 2, 2, 2, 2, 2};
    private static final int[] DISTANCE_SHORT_CODE_VALUE_OFFSET = {0, 0, 0, 0, -1, 1, -2, 2, -3, 3, -1, 1, -2, 2, -3, 3};
    private static final int[] FIXED_TABLE = {131072, 131076, IjkMediaPlayer.OnNativeInvokeListener.CTRL_WILL_HTTP_OPEN, 196610, 131072, 131076, IjkMediaPlayer.OnNativeInvokeListener.CTRL_WILL_HTTP_OPEN, 262145, 131072, 131076, IjkMediaPlayer.OnNativeInvokeListener.CTRL_WILL_HTTP_OPEN, 196610, 131072, 131076, IjkMediaPlayer.OnNativeInvokeListener.CTRL_WILL_HTTP_OPEN, 262149};

    private static void copyUncompressedData(State state) {
        BitReader bitReader = state.f206811br;
        byte[] bArr = state.ringBuffer;
        int i = state.metaBlockLength;
        if (i <= 0) {
            BitReader.reload(bitReader);
            state.runningState = 1;
            return;
        }
        int iMin = Math.min(state.ringBufferSize - state.pos, i);
        BitReader.copyBytes(bitReader, bArr, state.pos, iMin);
        state.metaBlockLength -= iMin;
        int i2 = state.pos + iMin;
        state.pos = i2;
        int i3 = state.ringBufferSize;
        if (i2 != i3) {
            BitReader.reload(bitReader);
            state.runningState = 1;
        } else {
            state.nextRunningState = 5;
            state.bytesToWrite = i3;
            state.bytesWritten = 0;
            state.runningState = 12;
        }
    }

    private static void decodeBlockTypeAndLength(State state, int i) {
        int i2;
        BitReader bitReader = state.f206811br;
        int[] iArr = state.blockTypeRb;
        int i3 = i * 2;
        BitReader.fillBitWindow(bitReader);
        int i4 = i * 1080;
        int symbol = readSymbol(state.blockTypeTrees, i4, bitReader);
        state.blockLength[i] = readBlockLength(state.blockLenTrees, i4, bitReader);
        if (symbol == 1) {
            i2 = iArr[i3 + 1] + 1;
        } else {
            i2 = symbol == 0 ? iArr[i3] : symbol - 2;
        }
        int i5 = state.numBlockTypes[i];
        if (i2 >= i5) {
            i2 -= i5;
        }
        int i6 = i3 + 1;
        iArr[i3] = iArr[i6];
        iArr[i6] = i2;
    }

    private static void decodeCommandBlockSwitch(State state) {
        decodeBlockTypeAndLength(state, 1);
        state.treeCommandOffset = state.hGroup1.trees[state.blockTypeRb[3]];
    }

    private static int decodeContextMap(int i, byte[] bArr, BitReader bitReader) {
        BitReader.readMoreInput(bitReader);
        int iDecodeVarLenUnsignedByte = decodeVarLenUnsignedByte(bitReader) + 1;
        if (iDecodeVarLenUnsignedByte == 1) {
            Utils.fillWithZeroes(bArr, 0, i);
            return iDecodeVarLenUnsignedByte;
        }
        int bits = BitReader.readBits(bitReader, 1) == 1 ? BitReader.readBits(bitReader, 4) + 1 : 0;
        int[] iArr = new int[1080];
        readHuffmanCode(iDecodeVarLenUnsignedByte + bits, iArr, 0, bitReader);
        int i2 = 0;
        while (i2 < i) {
            BitReader.readMoreInput(bitReader);
            BitReader.fillBitWindow(bitReader);
            int symbol = readSymbol(iArr, 0, bitReader);
            if (symbol == 0) {
                bArr[i2] = 0;
            } else if (symbol <= bits) {
                for (int bits2 = (1 << symbol) + BitReader.readBits(bitReader, symbol); bits2 != 0; bits2--) {
                    if (i2 >= i) {
                        C21997a.m222361a("Corrupted context map");
                        return 0;
                    }
                    bArr[i2] = 0;
                    i2++;
                }
            } else {
                bArr[i2] = (byte) (symbol - bits);
            }
            i2++;
        }
        if (BitReader.readBits(bitReader, 1) == 1) {
            inverseMoveToFrontTransform(bArr, i);
        }
        return iDecodeVarLenUnsignedByte;
    }

    private static void decodeDistanceBlockSwitch(State state) {
        decodeBlockTypeAndLength(state, 2);
        state.distContextMapSlice = state.blockTypeRb[5] << 2;
    }

    private static void decodeLiteralBlockSwitch(State state) {
        decodeBlockTypeAndLength(state, 0);
        int i = state.blockTypeRb[1];
        int i2 = i << 6;
        state.contextMapSlice = i2;
        int i3 = state.contextMap[i2] & 255;
        state.literalTreeIndex = i3;
        state.literalTree = state.hGroup0.trees[i3];
        byte b = state.contextModes[i];
        int[] iArr = Context.LOOKUP_OFFSETS;
        state.contextLookupOffset1 = iArr[b];
        state.contextLookupOffset2 = iArr[b + 1];
    }

    private static void decodeMetaBlockLength(BitReader bitReader, State state) {
        boolean z = BitReader.readBits(bitReader, 1) == 1;
        state.inputEnd = z;
        state.metaBlockLength = 0;
        state.isUncompressed = false;
        state.isMetadata = false;
        if (!z || BitReader.readBits(bitReader, 1) == 0) {
            int bits = BitReader.readBits(bitReader, 2) + 4;
            if (bits == 7) {
                state.isMetadata = true;
                if (BitReader.readBits(bitReader, 1) != 0) {
                    C21997a.m222361a("Corrupted reserved bit");
                    return;
                }
                int bits2 = BitReader.readBits(bitReader, 2);
                if (bits2 == 0) {
                    return;
                }
                for (int i = 0; i < bits2; i++) {
                    int bits3 = BitReader.readBits(bitReader, 8);
                    if (bits3 == 0 && i + 1 == bits2 && bits2 > 1) {
                        C21997a.m222361a("Exuberant nibble");
                        return;
                    }
                    state.metaBlockLength = (bits3 << (i * 8)) | state.metaBlockLength;
                }
            } else {
                for (int i2 = 0; i2 < bits; i2++) {
                    int bits4 = BitReader.readBits(bitReader, 4);
                    if (bits4 == 0 && i2 + 1 == bits && bits > 4) {
                        C21997a.m222361a("Exuberant nibble");
                        return;
                    }
                    state.metaBlockLength = (bits4 << (i2 * 4)) | state.metaBlockLength;
                }
            }
            state.metaBlockLength++;
            if (state.inputEnd) {
                return;
            }
            state.isUncompressed = BitReader.readBits(bitReader, 1) == 1;
        }
    }

    private static int decodeVarLenUnsignedByte(BitReader bitReader) {
        if (BitReader.readBits(bitReader, 1) == 0) {
            return 0;
        }
        int bits = BitReader.readBits(bitReader, 3);
        if (bits == 0) {
            return 1;
        }
        return BitReader.readBits(bitReader, bits) + (1 << bits);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:101:0x0291  */
    /* JADX WARN: Code duplicated, block: B:104:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:107:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:115:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:120:0x030c  */
    /* JADX WARN: Code duplicated, block: B:155:0x0313 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:156:0x030f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:0x0328 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x0328 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x02da A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:169:0x02fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:170:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:? A[LOOP:2: B:113:0x02dc->B:171:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:174:0x016a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:175:? A[LOOP:4: B:50:0x0132->B:175:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:0x01dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:0x01f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:50:0x0132 A[LOOP:4: B:50:0x0132->B:175:?, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:52:0x0138  */
    /* JADX WARN: Code duplicated, block: B:54:0x0141  */
    /* JADX WARN: Code duplicated, block: B:59:0x017a  */
    /* JADX WARN: Code duplicated, block: B:62:0x0191  */
    /* JADX WARN: Code duplicated, block: B:64:0x019a  */
    /* JADX WARN: Code duplicated, block: B:68:0x01e8 A[LOOP:5: B:60:0x0189->B:68:0x01e8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:73:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:75:0x0201  */
    /* JADX WARN: Code duplicated, block: B:76:0x0205  */
    /* JADX WARN: Code duplicated, block: B:78:0x0209  */
    /* JADX WARN: Code duplicated, block: B:80:0x0212  */
    /* JADX WARN: Code duplicated, block: B:83:0x022e  */
    /* JADX WARN: Code duplicated, block: B:84:0x0230  */
    /* JADX WARN: Code duplicated, block: B:87:0x0243  */
    /* JADX WARN: Code duplicated, block: B:90:0x0270  */
    /* JADX WARN: Code duplicated, block: B:92:0x0276  */
    /* JADX WARN: Code duplicated, block: B:95:0x027d  */
    /* JADX WARN: Code duplicated, block: B:98:0x0287  */
    /* JADX WARN: Code duplicated, block: B:99:0x028d  */
    /* JADX WARN: Multi-variable type inference failed */
    public static void decompress(State state) {
        int i;
        int i2;
        int i3;
        char c;
        int symbol;
        int i4;
        int i5;
        int iTranslateShortCodes;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int symbol2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19 = state.runningState;
        if (i19 == 0) {
            wtq0.m207906a("Can't decompress until initialized");
            return;
        }
        if (i19 == 11) {
            wtq0.m207906a("Can't decompress after close");
            return;
        }
        BitReader bitReader = state.f206811br;
        int i20 = 1;
        int i21 = state.ringBufferSize - 1;
        byte[] bArr = state.ringBuffer;
        while (true) {
            int i22 = state.runningState;
            if (i22 == 10) {
                boolean z = i20;
                if (i22 == 10) {
                    if (state.metaBlockLength < 0) {
                        C21997a.m222361a("Invalid metablock length");
                        return;
                    } else {
                        BitReader.jumpToByteBoundary(bitReader);
                        BitReader.checkHealth(state.f206811br, z);
                        return;
                    }
                }
                return;
            }
            if (i22 != 12) {
                char c2 = 2;
                int i23 = 0;
                switch (i22) {
                    case 1:
                        i = i20;
                        if (state.metaBlockLength < 0) {
                            C21997a.m222361a("Invalid metablock length");
                            return;
                        }
                        readMetablockInfo(state);
                        i21 = state.ringBufferSize - 1;
                        bArr = state.ringBuffer;
                        break;
                        break;
                    case 2:
                        readMetablockHuffmanCodesAndContextMaps(state);
                        state.runningState = 3;
                        if (state.metaBlockLength <= 0) {
                            state.runningState = i20;
                            i = i20;
                        } else {
                            BitReader.readMoreInput(bitReader);
                            if (state.blockLength[i20] == 0) {
                                decodeCommandBlockSwitch(state);
                            }
                            int[] iArr = state.blockLength;
                            iArr[i20] = iArr[i20] - i20;
                            BitReader.fillBitWindow(bitReader);
                            int symbol3 = readSymbol(state.hGroup1.codes, state.treeCommandOffset, bitReader);
                            i13 = symbol3 >>> 6;
                            state.distanceCode = 0;
                            if (i13 >= 2) {
                                i13 -= 2;
                                state.distanceCode = -1;
                            }
                            int i24 = Prefix.INSERT_RANGE_LUT[i13] + ((symbol3 >>> 3) & 7);
                            int i25 = Prefix.COPY_RANGE_LUT[i13] + (symbol3 & 7);
                            state.insertLength = Prefix.INSERT_LENGTH_OFFSET[i24] + BitReader.readBits(bitReader, Prefix.INSERT_LENGTH_N_BITS[i24]);
                            state.copyLength = Prefix.COPY_LENGTH_OFFSET[i25] + BitReader.readBits(bitReader, Prefix.COPY_LENGTH_N_BITS[i25]);
                            state.f206812j = 0;
                            state.runningState = 6;
                            if (state.trivialLiteralContext) {
                                while (state.f206812j < state.insertLength) {
                                    BitReader.readMoreInput(bitReader);
                                    if (state.blockLength[0] == 0) {
                                        decodeLiteralBlockSwitch(state);
                                    }
                                    int[] iArr2 = state.blockLength;
                                    iArr2[0] = iArr2[0] - i20;
                                    BitReader.fillBitWindow(bitReader);
                                    bArr[state.pos] = (byte) readSymbol(state.hGroup0.codes, state.literalTree, bitReader);
                                    state.f206812j += i20;
                                    i12 = state.pos;
                                    state.pos = i12 + 1;
                                    if (i12 == i21) {
                                        state.nextRunningState = 6;
                                        state.bytesToWrite = state.ringBufferSize;
                                        state.bytesWritten = 0;
                                        state.runningState = 12;
                                        i = i20;
                                        c = 2;
                                    }
                                }
                                i = i20;
                                c = 2;
                            } else {
                                int i26 = state.pos;
                                i2 = bArr[(i26 - 1) & i21] & 255;
                                i3 = bArr[(i26 - 2) & i21] & 255;
                                while (true) {
                                    c = c2;
                                    if (state.f206812j < state.insertLength) {
                                        BitReader.readMoreInput(bitReader);
                                        if (state.blockLength[0] == 0) {
                                            decodeLiteralBlockSwitch(state);
                                        }
                                        byte[] bArr2 = state.contextMap;
                                        int i27 = state.contextMapSlice;
                                        int[] iArr3 = Context.LOOKUP;
                                        i = i20;
                                        int i28 = bArr2[i27 + (iArr3[state.contextLookupOffset1 + i2] | iArr3[state.contextLookupOffset2 + i3])] & 255;
                                        int[] iArr4 = state.blockLength;
                                        iArr4[0] = iArr4[0] - 1;
                                        BitReader.fillBitWindow(bitReader);
                                        HuffmanTreeGroup huffmanTreeGroup = state.hGroup0;
                                        symbol = readSymbol(huffmanTreeGroup.codes, huffmanTreeGroup.trees[i28], bitReader);
                                        i4 = state.pos;
                                        bArr[i4] = (byte) symbol;
                                        state.f206812j++;
                                        state.pos = i4 + 1;
                                        if (i4 == i21) {
                                            state.nextRunningState = 6;
                                            state.bytesToWrite = state.ringBufferSize;
                                            state.bytesWritten = 0;
                                            state.runningState = 12;
                                        } else {
                                            i3 = i2;
                                            c2 = c;
                                            i2 = symbol;
                                            i20 = i;
                                        }
                                    } else {
                                        i = i20;
                                    }
                                }
                            }
                            if (state.runningState != 6) {
                                continue;
                            } else {
                                i5 = state.metaBlockLength - state.insertLength;
                                state.metaBlockLength = i5;
                                if (i5 <= 0) {
                                    state.runningState = 3;
                                } else {
                                    if (state.distanceCode < 0) {
                                        BitReader.readMoreInput(bitReader);
                                        if (state.blockLength[c] == 0) {
                                            decodeDistanceBlockSwitch(state);
                                        }
                                        int[] iArr5 = state.blockLength;
                                        iArr5[c] = iArr5[c] - 1;
                                        BitReader.fillBitWindow(bitReader);
                                        HuffmanTreeGroup huffmanTreeGroup2 = state.hGroup2;
                                        int[] iArr6 = huffmanTreeGroup2.codes;
                                        int[] iArr7 = huffmanTreeGroup2.trees;
                                        byte[] bArr3 = state.distContextMap;
                                        int i29 = state.distContextMapSlice;
                                        i9 = state.copyLength;
                                        if (i9 > 4) {
                                            i10 = 3;
                                        } else {
                                            i10 = i9 - 2;
                                        }
                                        symbol2 = readSymbol(iArr6, iArr7[bArr3[i29 + i10] & 255], bitReader);
                                        state.distanceCode = symbol2;
                                        i11 = state.numDirectDistanceCodes;
                                        if (symbol2 >= i11) {
                                            int i30 = symbol2 - i11;
                                            int i31 = state.distancePostfixMask & i30;
                                            int i32 = i30 >>> state.distancePostfixBits;
                                            state.distanceCode = i32;
                                            int i33 = (i32 >>> 1) + 1;
                                            state.distanceCode = i11 + i31 + ((((((i32 & 1) + 2) << i33) - 4) + BitReader.readBits(bitReader, i33)) << state.distancePostfixBits);
                                        }
                                    }
                                    iTranslateShortCodes = translateShortCodes(state.distanceCode, state.distRb, state.distRbIdx);
                                    state.distance = iTranslateShortCodes;
                                    if (iTranslateShortCodes < 0) {
                                        C21997a.m222361a("Negative distance");
                                        return;
                                    }
                                    i6 = state.maxDistance;
                                    i7 = state.maxBackwardDistance;
                                    if (i6 != i7 || (i8 = state.pos) >= i7) {
                                        state.maxDistance = i7;
                                    } else {
                                        state.maxDistance = i8;
                                    }
                                    state.copyDst = state.pos;
                                    if (iTranslateShortCodes > state.maxDistance) {
                                        state.runningState = 9;
                                    } else {
                                        if (state.distanceCode > 0) {
                                            int[] iArr8 = state.distRb;
                                            int i34 = state.distRbIdx;
                                            iArr8[i34 & 3] = iTranslateShortCodes;
                                            state.distRbIdx = i34 + 1;
                                        }
                                        if (state.copyLength > state.metaBlockLength) {
                                            C21997a.m222361a("Invalid backward reference");
                                            return;
                                        }
                                        state.f206812j = 0;
                                        state.runningState = 7;
                                        int i35 = state.pos;
                                        i14 = (i35 - state.distance) & i21;
                                        i15 = state.copyLength - state.f206812j;
                                        if (i14 + i15 < i21 || i35 + i15 >= i21) {
                                            while (true) {
                                                i16 = state.f206812j;
                                                if (i16 < state.copyLength) {
                                                    i17 = state.pos;
                                                    bArr[i17] = bArr[(i17 - state.distance) & i21];
                                                    state.metaBlockLength--;
                                                    state.f206812j = i16 + 1;
                                                    state.pos = i17 + 1;
                                                    if (i17 == i21) {
                                                        i18 = 7;
                                                        state.nextRunningState = 7;
                                                        state.bytesToWrite = state.ringBufferSize;
                                                        state.bytesWritten = 0;
                                                        state.runningState = 12;
                                                    }
                                                }
                                            }
                                            if (state.runningState == i18) {
                                                state.runningState = 3;
                                            }
                                        } else {
                                            while (i23 < i15) {
                                                bArr[i35] = bArr[i14];
                                                i23++;
                                                i35++;
                                                i14++;
                                            }
                                            state.f206812j += i15;
                                            state.metaBlockLength -= i15;
                                            state.pos += i15;
                                        }
                                        i18 = 7;
                                        if (state.runningState == i18) {
                                            state.runningState = 3;
                                        }
                                    }
                                }
                            }
                        }
                        break;
                    case 3:
                        if (state.metaBlockLength <= 0) {
                            state.runningState = i20;
                            i = i20;
                        } else {
                            BitReader.readMoreInput(bitReader);
                            if (state.blockLength[i20] == 0) {
                                decodeCommandBlockSwitch(state);
                            }
                            int[] iArr9 = state.blockLength;
                            iArr9[i20] = iArr9[i20] - i20;
                            BitReader.fillBitWindow(bitReader);
                            int symbol4 = readSymbol(state.hGroup1.codes, state.treeCommandOffset, bitReader);
                            i13 = symbol4 >>> 6;
                            state.distanceCode = 0;
                            if (i13 >= 2) {
                                i13 -= 2;
                                state.distanceCode = -1;
                            }
                            int i210 = Prefix.INSERT_RANGE_LUT[i13] + ((symbol4 >>> 3) & 7);
                            int i211 = Prefix.COPY_RANGE_LUT[i13] + (symbol4 & 7);
                            state.insertLength = Prefix.INSERT_LENGTH_OFFSET[i210] + BitReader.readBits(bitReader, Prefix.INSERT_LENGTH_N_BITS[i210]);
                            state.copyLength = Prefix.COPY_LENGTH_OFFSET[i211] + BitReader.readBits(bitReader, Prefix.COPY_LENGTH_N_BITS[i211]);
                            state.f206812j = 0;
                            state.runningState = 6;
                            if (state.trivialLiteralContext) {
                                while (state.f206812j < state.insertLength) {
                                    BitReader.readMoreInput(bitReader);
                                    if (state.blockLength[0] == 0) {
                                        decodeLiteralBlockSwitch(state);
                                    }
                                    int[] iArr10 = state.blockLength;
                                    iArr10[0] = iArr10[0] - i20;
                                    BitReader.fillBitWindow(bitReader);
                                    bArr[state.pos] = (byte) readSymbol(state.hGroup0.codes, state.literalTree, bitReader);
                                    state.f206812j += i20;
                                    i12 = state.pos;
                                    state.pos = i12 + 1;
                                    if (i12 == i21) {
                                        state.nextRunningState = 6;
                                        state.bytesToWrite = state.ringBufferSize;
                                        state.bytesWritten = 0;
                                        state.runningState = 12;
                                        i = i20;
                                        c = 2;
                                    }
                                }
                                i = i20;
                                c = 2;
                            } else {
                                int i212 = state.pos;
                                i2 = bArr[(i212 - 1) & i21] & 255;
                                i3 = bArr[(i212 - 2) & i21] & 255;
                                while (true) {
                                    c = c2;
                                    if (state.f206812j < state.insertLength) {
                                        BitReader.readMoreInput(bitReader);
                                        if (state.blockLength[0] == 0) {
                                            decodeLiteralBlockSwitch(state);
                                        }
                                        byte[] bArr4 = state.contextMap;
                                        int i213 = state.contextMapSlice;
                                        int[] iArr11 = Context.LOOKUP;
                                        i = i20;
                                        int i214 = bArr4[i213 + (iArr11[state.contextLookupOffset1 + i2] | iArr11[state.contextLookupOffset2 + i3])] & 255;
                                        int[] iArr12 = state.blockLength;
                                        iArr12[0] = iArr12[0] - 1;
                                        BitReader.fillBitWindow(bitReader);
                                        HuffmanTreeGroup huffmanTreeGroup3 = state.hGroup0;
                                        symbol = readSymbol(huffmanTreeGroup3.codes, huffmanTreeGroup3.trees[i214], bitReader);
                                        i4 = state.pos;
                                        bArr[i4] = (byte) symbol;
                                        state.f206812j++;
                                        state.pos = i4 + 1;
                                        if (i4 == i21) {
                                            state.nextRunningState = 6;
                                            state.bytesToWrite = state.ringBufferSize;
                                            state.bytesWritten = 0;
                                            state.runningState = 12;
                                        } else {
                                            i3 = i2;
                                            c2 = c;
                                            i2 = symbol;
                                            i20 = i;
                                        }
                                    } else {
                                        i = i20;
                                    }
                                }
                            }
                            if (state.runningState != 6) {
                                continue;
                            } else {
                                i5 = state.metaBlockLength - state.insertLength;
                                state.metaBlockLength = i5;
                                if (i5 <= 0) {
                                    state.runningState = 3;
                                } else {
                                    if (state.distanceCode < 0) {
                                        BitReader.readMoreInput(bitReader);
                                        if (state.blockLength[c] == 0) {
                                            decodeDistanceBlockSwitch(state);
                                        }
                                        int[] iArr13 = state.blockLength;
                                        iArr13[c] = iArr13[c] - 1;
                                        BitReader.fillBitWindow(bitReader);
                                        HuffmanTreeGroup huffmanTreeGroup4 = state.hGroup2;
                                        int[] iArr14 = huffmanTreeGroup4.codes;
                                        int[] iArr15 = huffmanTreeGroup4.trees;
                                        byte[] bArr5 = state.distContextMap;
                                        int i215 = state.distContextMapSlice;
                                        i9 = state.copyLength;
                                        if (i9 > 4) {
                                            i10 = 3;
                                        } else {
                                            i10 = i9 - 2;
                                        }
                                        symbol2 = readSymbol(iArr14, iArr15[bArr5[i215 + i10] & 255], bitReader);
                                        state.distanceCode = symbol2;
                                        i11 = state.numDirectDistanceCodes;
                                        if (symbol2 >= i11) {
                                            int i36 = symbol2 - i11;
                                            int i37 = state.distancePostfixMask & i36;
                                            int i38 = i36 >>> state.distancePostfixBits;
                                            state.distanceCode = i38;
                                            int i39 = (i38 >>> 1) + 1;
                                            state.distanceCode = i11 + i37 + ((((((i38 & 1) + 2) << i39) - 4) + BitReader.readBits(bitReader, i39)) << state.distancePostfixBits);
                                        }
                                    }
                                    iTranslateShortCodes = translateShortCodes(state.distanceCode, state.distRb, state.distRbIdx);
                                    state.distance = iTranslateShortCodes;
                                    if (iTranslateShortCodes < 0) {
                                        C21997a.m222361a("Negative distance");
                                        return;
                                    }
                                    i6 = state.maxDistance;
                                    i7 = state.maxBackwardDistance;
                                    if (i6 != i7) {
                                        state.maxDistance = i7;
                                    } else {
                                        state.maxDistance = i7;
                                    }
                                    state.copyDst = state.pos;
                                    if (iTranslateShortCodes > state.maxDistance) {
                                        state.runningState = 9;
                                    } else {
                                        if (state.distanceCode > 0) {
                                            int[] iArr16 = state.distRb;
                                            int i310 = state.distRbIdx;
                                            iArr16[i310 & 3] = iTranslateShortCodes;
                                            state.distRbIdx = i310 + 1;
                                        }
                                        if (state.copyLength > state.metaBlockLength) {
                                            C21997a.m222361a("Invalid backward reference");
                                            return;
                                        }
                                        state.f206812j = 0;
                                        state.runningState = 7;
                                        int i311 = state.pos;
                                        i14 = (i311 - state.distance) & i21;
                                        i15 = state.copyLength - state.f206812j;
                                        if (i14 + i15 < i21) {
                                            while (true) {
                                                i16 = state.f206812j;
                                                if (i16 < state.copyLength) {
                                                    i17 = state.pos;
                                                    bArr[i17] = bArr[(i17 - state.distance) & i21];
                                                    state.metaBlockLength--;
                                                    state.f206812j = i16 + 1;
                                                    state.pos = i17 + 1;
                                                    if (i17 == i21) {
                                                        i18 = 7;
                                                        state.nextRunningState = 7;
                                                        state.bytesToWrite = state.ringBufferSize;
                                                        state.bytesWritten = 0;
                                                        state.runningState = 12;
                                                    }
                                                } else {
                                                    i18 = 7;
                                                }
                                            }
                                        } else {
                                            while (true) {
                                                i16 = state.f206812j;
                                                if (i16 < state.copyLength) {
                                                    i17 = state.pos;
                                                    bArr[i17] = bArr[(i17 - state.distance) & i21];
                                                    state.metaBlockLength--;
                                                    state.f206812j = i16 + 1;
                                                    state.pos = i17 + 1;
                                                    if (i17 == i21) {
                                                        i18 = 7;
                                                        state.nextRunningState = 7;
                                                        state.bytesToWrite = state.ringBufferSize;
                                                        state.bytesWritten = 0;
                                                        state.runningState = 12;
                                                    }
                                                } else {
                                                    i18 = 7;
                                                }
                                            }
                                        }
                                        if (state.runningState == i18) {
                                            state.runningState = 3;
                                        }
                                    }
                                }
                            }
                        }
                        break;
                    case 4:
                        while (state.metaBlockLength > 0) {
                            BitReader.readMoreInput(bitReader);
                            BitReader.readBits(bitReader, 8);
                            state.metaBlockLength -= i20;
                        }
                        state.runningState = i20;
                        i = i20;
                        break;
                    case 5:
                        copyUncompressedData(state);
                        i = i20;
                        break;
                    case 6:
                        if (state.trivialLiteralContext) {
                            while (state.f206812j < state.insertLength) {
                                BitReader.readMoreInput(bitReader);
                                if (state.blockLength[0] == 0) {
                                    decodeLiteralBlockSwitch(state);
                                }
                                int[] iArr17 = state.blockLength;
                                iArr17[0] = iArr17[0] - i20;
                                BitReader.fillBitWindow(bitReader);
                                bArr[state.pos] = (byte) readSymbol(state.hGroup0.codes, state.literalTree, bitReader);
                                state.f206812j += i20;
                                i12 = state.pos;
                                state.pos = i12 + 1;
                                if (i12 == i21) {
                                    state.nextRunningState = 6;
                                    state.bytesToWrite = state.ringBufferSize;
                                    state.bytesWritten = 0;
                                    state.runningState = 12;
                                    i = i20;
                                    c = 2;
                                }
                            }
                            i = i20;
                            c = 2;
                        } else {
                            int i216 = state.pos;
                            i2 = bArr[(i216 - 1) & i21] & 255;
                            i3 = bArr[(i216 - 2) & i21] & 255;
                            while (true) {
                                c = c2;
                                if (state.f206812j < state.insertLength) {
                                    BitReader.readMoreInput(bitReader);
                                    if (state.blockLength[0] == 0) {
                                        decodeLiteralBlockSwitch(state);
                                    }
                                    byte[] bArr6 = state.contextMap;
                                    int i217 = state.contextMapSlice;
                                    int[] iArr18 = Context.LOOKUP;
                                    i = i20;
                                    int i218 = bArr6[i217 + (iArr18[state.contextLookupOffset1 + i2] | iArr18[state.contextLookupOffset2 + i3])] & 255;
                                    int[] iArr19 = state.blockLength;
                                    iArr19[0] = iArr19[0] - 1;
                                    BitReader.fillBitWindow(bitReader);
                                    HuffmanTreeGroup huffmanTreeGroup5 = state.hGroup0;
                                    symbol = readSymbol(huffmanTreeGroup5.codes, huffmanTreeGroup5.trees[i218], bitReader);
                                    i4 = state.pos;
                                    bArr[i4] = (byte) symbol;
                                    state.f206812j++;
                                    state.pos = i4 + 1;
                                    if (i4 == i21) {
                                        state.nextRunningState = 6;
                                        state.bytesToWrite = state.ringBufferSize;
                                        state.bytesWritten = 0;
                                        state.runningState = 12;
                                    } else {
                                        i3 = i2;
                                        c2 = c;
                                        i2 = symbol;
                                        i20 = i;
                                    }
                                } else {
                                    i = i20;
                                }
                            }
                        }
                        if (state.runningState != 6) {
                            continue;
                        } else {
                            i5 = state.metaBlockLength - state.insertLength;
                            state.metaBlockLength = i5;
                            if (i5 <= 0) {
                                state.runningState = 3;
                            } else {
                                if (state.distanceCode < 0) {
                                    BitReader.readMoreInput(bitReader);
                                    if (state.blockLength[c] == 0) {
                                        decodeDistanceBlockSwitch(state);
                                    }
                                    int[] iArr110 = state.blockLength;
                                    iArr110[c] = iArr110[c] - 1;
                                    BitReader.fillBitWindow(bitReader);
                                    HuffmanTreeGroup huffmanTreeGroup6 = state.hGroup2;
                                    int[] iArr111 = huffmanTreeGroup6.codes;
                                    int[] iArr112 = huffmanTreeGroup6.trees;
                                    byte[] bArr7 = state.distContextMap;
                                    int i219 = state.distContextMapSlice;
                                    i9 = state.copyLength;
                                    if (i9 > 4) {
                                        i10 = 3;
                                    } else {
                                        i10 = i9 - 2;
                                    }
                                    symbol2 = readSymbol(iArr111, iArr112[bArr7[i219 + i10] & 255], bitReader);
                                    state.distanceCode = symbol2;
                                    i11 = state.numDirectDistanceCodes;
                                    if (symbol2 >= i11) {
                                        int i312 = symbol2 - i11;
                                        int i313 = state.distancePostfixMask & i312;
                                        int i314 = i312 >>> state.distancePostfixBits;
                                        state.distanceCode = i314;
                                        int i315 = (i314 >>> 1) + 1;
                                        state.distanceCode = i11 + i313 + ((((((i314 & 1) + 2) << i315) - 4) + BitReader.readBits(bitReader, i315)) << state.distancePostfixBits);
                                    }
                                }
                                iTranslateShortCodes = translateShortCodes(state.distanceCode, state.distRb, state.distRbIdx);
                                state.distance = iTranslateShortCodes;
                                if (iTranslateShortCodes < 0) {
                                    C21997a.m222361a("Negative distance");
                                    return;
                                }
                                i6 = state.maxDistance;
                                i7 = state.maxBackwardDistance;
                                if (i6 != i7) {
                                    state.maxDistance = i7;
                                } else {
                                    state.maxDistance = i7;
                                }
                                state.copyDst = state.pos;
                                if (iTranslateShortCodes > state.maxDistance) {
                                    state.runningState = 9;
                                } else {
                                    if (state.distanceCode > 0) {
                                        int[] iArr113 = state.distRb;
                                        int i316 = state.distRbIdx;
                                        iArr113[i316 & 3] = iTranslateShortCodes;
                                        state.distRbIdx = i316 + 1;
                                    }
                                    if (state.copyLength > state.metaBlockLength) {
                                        C21997a.m222361a("Invalid backward reference");
                                        return;
                                    }
                                    state.f206812j = 0;
                                    state.runningState = 7;
                                    int i317 = state.pos;
                                    i14 = (i317 - state.distance) & i21;
                                    i15 = state.copyLength - state.f206812j;
                                    if (i14 + i15 < i21) {
                                        while (true) {
                                            i16 = state.f206812j;
                                            if (i16 < state.copyLength) {
                                                i17 = state.pos;
                                                bArr[i17] = bArr[(i17 - state.distance) & i21];
                                                state.metaBlockLength--;
                                                state.f206812j = i16 + 1;
                                                state.pos = i17 + 1;
                                                if (i17 == i21) {
                                                    i18 = 7;
                                                    state.nextRunningState = 7;
                                                    state.bytesToWrite = state.ringBufferSize;
                                                    state.bytesWritten = 0;
                                                    state.runningState = 12;
                                                }
                                            } else {
                                                i18 = 7;
                                            }
                                        }
                                    } else {
                                        while (true) {
                                            i16 = state.f206812j;
                                            if (i16 < state.copyLength) {
                                                i17 = state.pos;
                                                bArr[i17] = bArr[(i17 - state.distance) & i21];
                                                state.metaBlockLength--;
                                                state.f206812j = i16 + 1;
                                                state.pos = i17 + 1;
                                                if (i17 == i21) {
                                                    i18 = 7;
                                                    state.nextRunningState = 7;
                                                    state.bytesToWrite = state.ringBufferSize;
                                                    state.bytesWritten = 0;
                                                    state.runningState = 12;
                                                }
                                            } else {
                                                i18 = 7;
                                            }
                                        }
                                    }
                                    if (state.runningState == i18) {
                                        state.runningState = 3;
                                    }
                                }
                            }
                        }
                        break;
                    case 7:
                        i = i20;
                        int i318 = state.pos;
                        i14 = (i318 - state.distance) & i21;
                        i15 = state.copyLength - state.f206812j;
                        if (i14 + i15 < i21) {
                            while (true) {
                                i16 = state.f206812j;
                                if (i16 < state.copyLength) {
                                    i17 = state.pos;
                                    bArr[i17] = bArr[(i17 - state.distance) & i21];
                                    state.metaBlockLength--;
                                    state.f206812j = i16 + 1;
                                    state.pos = i17 + 1;
                                    if (i17 == i21) {
                                        i18 = 7;
                                        state.nextRunningState = 7;
                                        state.bytesToWrite = state.ringBufferSize;
                                        state.bytesWritten = 0;
                                        state.runningState = 12;
                                    }
                                } else {
                                    i18 = 7;
                                }
                            }
                        } else {
                            while (true) {
                                i16 = state.f206812j;
                                if (i16 < state.copyLength) {
                                    i17 = state.pos;
                                    bArr[i17] = bArr[(i17 - state.distance) & i21];
                                    state.metaBlockLength--;
                                    state.f206812j = i16 + 1;
                                    state.pos = i17 + 1;
                                    if (i17 == i21) {
                                        i18 = 7;
                                        state.nextRunningState = 7;
                                        state.bytesToWrite = state.ringBufferSize;
                                        state.bytesWritten = 0;
                                        state.runningState = 12;
                                    }
                                } else {
                                    i18 = 7;
                                }
                            }
                        }
                        if (state.runningState == i18) {
                            state.runningState = 3;
                        }
                        break;
                    case 8:
                        int i40 = state.ringBufferSize;
                        System.arraycopy(bArr, i40, bArr, 0, state.copyDst - i40);
                        state.runningState = 3;
                        i = i20;
                        break;
                    case 9:
                        int i41 = state.copyLength;
                        if (i41 < 4 || i41 > 24) {
                            C21997a.m222361a("Invalid backward reference");
                            return;
                        }
                        int i42 = Dictionary.OFFSETS_BY_LENGTH[i41];
                        int i43 = (state.distance - state.maxDistance) - i20;
                        int i44 = Dictionary.SIZE_BITS_BY_LENGTH[i41];
                        int i45 = ((i20 << i44) - i20) & i43;
                        int i46 = i43 >>> i44;
                        int i47 = i42 + (i45 * i41);
                        Transform[] transformArr = Transform.TRANSFORMS;
                        if (i46 >= transformArr.length) {
                            C21997a.m222361a("Invalid backward reference");
                            return;
                        }
                        int iTransformDictionaryWord = Transform.transformDictionaryWord(bArr, state.copyDst, Dictionary.getData(), i47, state.copyLength, transformArr[i46]);
                        int i48 = state.copyDst + iTransformDictionaryWord;
                        state.copyDst = i48;
                        state.pos += iTransformDictionaryWord;
                        state.metaBlockLength -= iTransformDictionaryWord;
                        int i49 = state.ringBufferSize;
                        if (i48 >= i49) {
                            state.nextRunningState = 8;
                            state.bytesToWrite = i49;
                            state.bytesWritten = 0;
                            state.runningState = 12;
                        } else {
                            state.runningState = 3;
                        }
                        i = i20;
                        break;
                        break;
                    default:
                        throw new BrotliRuntimeException("Unexpected state " + state.runningState);
                }
            } else {
                i = i20;
                if (!writeRingBuffer(state)) {
                    return;
                }
                int i50 = state.pos;
                int i51 = state.maxBackwardDistance;
                if (i50 >= i51) {
                    state.maxDistance = i51;
                }
                state.pos = i50 & i21;
                state.runningState = state.nextRunningState;
            }
            i20 = i;
        }
    }

    private static void inverseMoveToFrontTransform(byte[] bArr, int i) {
        int[] iArr = new int[256];
        for (int i2 = 0; i2 < 256; i2++) {
            iArr[i2] = i2;
        }
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = bArr[i3] & 255;
            bArr[i3] = (byte) iArr[i4];
            if (i4 != 0) {
                moveToFront(iArr, i4);
            }
        }
    }

    private static void maybeReallocateRingBuffer(State state) {
        int i;
        int i2 = state.maxRingBufferSize;
        long j = i2;
        long j2 = state.expectedTotalSize;
        if (j > j2) {
            while (true) {
                int i3 = i2 >> 1;
                if (i3 <= ((int) j2) + state.customDictionary.length) {
                    break;
                } else {
                    i2 = i3;
                }
            }
            if (!state.inputEnd && i2 < 16384 && state.maxRingBufferSize >= 16384) {
                i2 = 16384;
            }
        }
        int i4 = state.ringBufferSize;
        if (i2 <= i4) {
            return;
        }
        byte[] bArr = new byte[i2 + 37];
        byte[] bArr2 = state.ringBuffer;
        if (bArr2 != null) {
            System.arraycopy(bArr2, 0, bArr, 0, i4);
        } else {
            byte[] bArr3 = state.customDictionary;
            if (bArr3.length != 0) {
                int length = bArr3.length;
                int i5 = state.maxBackwardDistance;
                if (length > i5) {
                    i = length - i5;
                } else {
                    i5 = length;
                    i = 0;
                }
                System.arraycopy(bArr3, i, bArr, 0, i5);
                state.pos = i5;
                state.bytesToIgnore = i5;
            }
        }
        state.ringBuffer = bArr;
        state.ringBufferSize = i2;
    }

    private static void moveToFront(int[] iArr, int i) {
        int i2 = iArr[i];
        while (i > 0) {
            iArr[i] = iArr[i - 1];
            i--;
        }
        iArr[0] = i2;
    }

    private static int readBlockLength(int[] iArr, int i, BitReader bitReader) {
        BitReader.fillBitWindow(bitReader);
        int symbol = readSymbol(iArr, i, bitReader);
        return Prefix.BLOCK_LENGTH_OFFSET[symbol] + BitReader.readBits(bitReader, Prefix.BLOCK_LENGTH_N_BITS[symbol]);
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c7  */
    public static void readHuffmanCode(int i, int[] iArr, int i2, BitReader bitReader) {
        int i3;
        int i4;
        int i5;
        BitReader.readMoreInput(bitReader);
        int[] iArr2 = new int[i];
        int bits = BitReader.readBits(bitReader, 2);
        boolean z = false;
        boolean z2 = true;
        if (bits == 1) {
            int i6 = i - 1;
            int[] iArr3 = new int[4];
            int bits2 = BitReader.readBits(bitReader, 2) + 1;
            int i7 = 0;
            while (i6 != 0) {
                i6 >>= 1;
                i7++;
            }
            for (int i8 = 0; i8 < bits2; i8++) {
                int bits3 = BitReader.readBits(bitReader, i7) % i;
                iArr3[i8] = bits3;
                iArr2[bits3] = 2;
            }
            iArr2[iArr3[0]] = 1;
            if (bits2 != 1) {
                if (bits2 == 2) {
                    int i9 = iArr3[0];
                    int i10 = iArr3[1];
                    z = i9 != i10;
                    iArr2[i10] = 1;
                } else if (bits2 != 3) {
                    int i11 = iArr3[0];
                    int i12 = iArr3[1];
                    boolean z3 = (i11 == i12 || i11 == (i4 = iArr3[2]) || i11 == (i5 = iArr3[3]) || i12 == i4 || i12 == i5 || i4 == i5) ? false : true;
                    if (BitReader.readBits(bitReader, 1) == 1) {
                        iArr2[iArr3[2]] = 3;
                        iArr2[iArr3[3]] = 3;
                    } else {
                        iArr2[iArr3[0]] = 2;
                    }
                    z2 = z3;
                } else {
                    int i13 = iArr3[0];
                    int i14 = iArr3[1];
                    if (i13 != i14 && i13 != (i3 = iArr3[2]) && i14 != i3) {
                        z = true;
                    }
                }
            }
            if (z2) {
                Huffman.buildHuffmanTable(iArr, i2, 8, iArr2, i);
            } else {
                C21997a.m222361a("Can't readHuffmanCode");
            }
        }
        int[] iArr4 = new int[18];
        int i15 = 0;
        int i16 = 32;
        while (bits < 18 && i16 > 0) {
            int i17 = CODE_LENGTH_CODE_ORDER[bits];
            BitReader.fillBitWindow(bitReader);
            long j = bitReader.accumulator;
            int i18 = bitReader.bitOffset;
            int i19 = FIXED_TABLE[((int) (j >>> i18)) & 15];
            bitReader.bitOffset = i18 + (i19 >> 16);
            int i20 = i19 & p7f.COLOR_SPACE_UNCALIBRATED;
            iArr4[i17] = i20;
            if (i20 != 0) {
                i16 -= 32 >> i20;
                i15++;
            }
            bits++;
        }
        z = i15 == 1 || i16 == 0;
        readHuffmanCodeLengths(iArr4, i, iArr2, bitReader);
        z2 = z;
        if (z2) {
            Huffman.buildHuffmanTable(iArr, i2, 8, iArr2, i);
        } else {
            C21997a.m222361a("Can't readHuffmanCode");
        }
    }

    private static void readHuffmanCodeLengths(int[] iArr, int i, int[] iArr2, BitReader bitReader) {
        int[] iArr3 = new int[32];
        Huffman.buildHuffmanTable(iArr3, 0, 5, iArr, 18);
        int i2 = 8;
        int i3 = 32768;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < i && i3 > 0) {
            BitReader.readMoreInput(bitReader);
            BitReader.fillBitWindow(bitReader);
            long j = bitReader.accumulator;
            int i7 = bitReader.bitOffset;
            int i8 = iArr3[((int) (j >>> i7)) & 31];
            bitReader.bitOffset = i7 + (i8 >> 16);
            int i9 = i8 & p7f.COLOR_SPACE_UNCALIBRATED;
            if (i9 < 16) {
                i4++;
                iArr2[i4] = i9;
                if (i9 != 0) {
                    i3 -= 32768 >> i9;
                    i2 = i9;
                }
                i6 = 0;
            } else {
                int i10 = i9 - 14;
                int i11 = i9 == 16 ? i2 : 0;
                if (i5 != i11) {
                    i6 = 0;
                    i5 = i11;
                }
                int bits = (i6 > 0 ? (i6 - 2) << i10 : i6) + BitReader.readBits(bitReader, i10) + 3;
                int i12 = bits - i6;
                if (i4 + i12 > i) {
                    C21997a.m222361a("symbol + repeatDelta > numSymbols");
                    return;
                }
                int i13 = 0;
                while (i13 < i12) {
                    iArr2[i4] = i5;
                    i13++;
                    i4++;
                }
                if (i5 != 0) {
                    i3 -= i12 << (15 - i5);
                }
                i6 = bits;
            }
        }
        if (i3 == 0) {
            Utils.fillWithZeroes(iArr2, i4, i - i4);
        } else {
            C21997a.m222361a("Unused space");
        }
    }

    private static void readMetablockHuffmanCodesAndContextMaps(State state) {
        int i;
        int[] iArr;
        BitReader bitReader = state.f206811br;
        for (int i2 = 0; i2 < 3; i2++) {
            state.numBlockTypes[i2] = decodeVarLenUnsignedByte(bitReader) + 1;
            state.blockLength[i2] = 268435456;
            int i3 = state.numBlockTypes[i2];
            if (i3 > 1) {
                int i4 = i2 * 1080;
                readHuffmanCode(i3 + 2, state.blockTypeTrees, i4, bitReader);
                readHuffmanCode(26, state.blockLenTrees, i4, bitReader);
                state.blockLength[i2] = readBlockLength(state.blockLenTrees, i4, bitReader);
            }
        }
        BitReader.readMoreInput(bitReader);
        state.distancePostfixBits = BitReader.readBits(bitReader, 2);
        int bits = BitReader.readBits(bitReader, 4);
        int i5 = state.distancePostfixBits;
        int i6 = (bits << i5) + 16;
        state.numDirectDistanceCodes = i6;
        state.distancePostfixMask = (1 << i5) - 1;
        int i7 = i6 + (48 << i5);
        state.contextModes = new byte[state.numBlockTypes[0]];
        int i8 = 0;
        while (true) {
            i = state.numBlockTypes[0];
            if (i8 >= i) {
                break;
            }
            int iMin = Math.min(i8 + 96, i);
            while (i8 < iMin) {
                state.contextModes[i8] = (byte) (BitReader.readBits(bitReader, 2) << 1);
                i8++;
            }
            BitReader.readMoreInput(bitReader);
        }
        byte[] bArr = new byte[i << 6];
        state.contextMap = bArr;
        int iDecodeContextMap = decodeContextMap(i << 6, bArr, bitReader);
        state.trivialLiteralContext = true;
        int i9 = 0;
        while (true) {
            iArr = state.numBlockTypes;
            if (i9 >= (iArr[0] << 6)) {
                break;
            }
            if (state.contextMap[i9] != (i9 >> 6)) {
                state.trivialLiteralContext = false;
                break;
            }
            i9++;
        }
        int i10 = iArr[2];
        byte[] bArr2 = new byte[i10 << 2];
        state.distContextMap = bArr2;
        int iDecodeContextMap2 = decodeContextMap(i10 << 2, bArr2, bitReader);
        HuffmanTreeGroup.init(state.hGroup0, 256, iDecodeContextMap);
        HuffmanTreeGroup.init(state.hGroup1, 704, state.numBlockTypes[1]);
        HuffmanTreeGroup.init(state.hGroup2, i7, iDecodeContextMap2);
        HuffmanTreeGroup.decode(state.hGroup0, bitReader);
        HuffmanTreeGroup.decode(state.hGroup1, bitReader);
        HuffmanTreeGroup.decode(state.hGroup2, bitReader);
        state.contextMapSlice = 0;
        state.distContextMapSlice = 0;
        int[] iArr2 = Context.LOOKUP_OFFSETS;
        byte b = state.contextModes[0];
        state.contextLookupOffset1 = iArr2[b];
        state.contextLookupOffset2 = iArr2[b + 1];
        state.literalTreeIndex = 0;
        state.literalTree = state.hGroup0.trees[0];
        state.treeCommandOffset = state.hGroup1.trees[0];
        int[] iArr3 = state.blockTypeRb;
        iArr3[4] = 1;
        iArr3[2] = 1;
        iArr3[0] = 1;
        iArr3[5] = 0;
        iArr3[3] = 0;
        iArr3[1] = 0;
    }

    private static void readMetablockInfo(State state) {
        BitReader bitReader = state.f206811br;
        if (state.inputEnd) {
            state.nextRunningState = 10;
            state.bytesToWrite = state.pos;
            state.bytesWritten = 0;
            state.runningState = 12;
            return;
        }
        HuffmanTreeGroup huffmanTreeGroup = state.hGroup0;
        huffmanTreeGroup.codes = null;
        huffmanTreeGroup.trees = null;
        HuffmanTreeGroup huffmanTreeGroup2 = state.hGroup1;
        huffmanTreeGroup2.codes = null;
        huffmanTreeGroup2.trees = null;
        HuffmanTreeGroup huffmanTreeGroup3 = state.hGroup2;
        huffmanTreeGroup3.codes = null;
        huffmanTreeGroup3.trees = null;
        BitReader.readMoreInput(bitReader);
        decodeMetaBlockLength(bitReader, state);
        if (state.metaBlockLength != 0 || state.isMetadata) {
            if (state.isUncompressed || state.isMetadata) {
                BitReader.jumpToByteBoundary(bitReader);
                state.runningState = state.isMetadata ? 4 : 5;
            } else {
                state.runningState = 2;
            }
            if (state.isMetadata) {
                return;
            }
            state.expectedTotalSize += (long) state.metaBlockLength;
            if (state.ringBufferSize < state.maxRingBufferSize) {
                maybeReallocateRingBuffer(state);
            }
        }
    }

    private static int readSymbol(int[] iArr, int i, BitReader bitReader) {
        long j = bitReader.accumulator;
        int i2 = bitReader.bitOffset;
        int i3 = (int) (j >>> i2);
        int i4 = i + (i3 & 255);
        int i5 = iArr[i4];
        int i6 = i5 >> 16;
        int i7 = i5 & p7f.COLOR_SPACE_UNCALIBRATED;
        if (i6 <= 8) {
            bitReader.bitOffset = i2 + i6;
            return i7;
        }
        int i8 = iArr[i4 + i7 + ((i3 & ((1 << i6) - 1)) >>> 8)];
        bitReader.bitOffset = i2 + (i8 >> 16) + 8;
        return i8 & p7f.COLOR_SPACE_UNCALIBRATED;
    }

    public static void setCustomDictionary(State state, byte[] bArr) {
        if (bArr == null) {
            bArr = new byte[0];
        }
        state.customDictionary = bArr;
    }

    private static int translateShortCodes(int i, int[] iArr, int i2) {
        return i < 16 ? iArr[(i2 + DISTANCE_SHORT_CODE_INDEX_OFFSET[i]) & 3] + DISTANCE_SHORT_CODE_VALUE_OFFSET[i] : i - 15;
    }

    private static boolean writeRingBuffer(State state) {
        int i = state.bytesToIgnore;
        if (i != 0) {
            state.bytesWritten += i;
            state.bytesToIgnore = 0;
        }
        int iMin = Math.min(state.outputLength - state.outputUsed, state.bytesToWrite - state.bytesWritten);
        if (iMin != 0) {
            System.arraycopy(state.ringBuffer, state.bytesWritten, state.output, state.outputOffset + state.outputUsed, iMin);
            state.outputUsed += iMin;
            state.bytesWritten += iMin;
        }
        return state.outputUsed < state.outputLength;
    }
}
