package org.brotli.dec;

import java.io.IOException;
import java.io.InputStream;
import p153l.wtq0;

/* JADX INFO: loaded from: classes2.dex */
final class State {
    int bytesToWrite;
    int bytesWritten;
    int contextLookupOffset1;
    int contextLookupOffset2;
    byte[] contextMap;
    int contextMapSlice;
    byte[] contextModes;
    int copyDst;
    int copyLength;
    byte[] distContextMap;
    int distContextMapSlice;
    int distance;
    int distanceCode;
    int distancePostfixBits;
    int distancePostfixMask;
    boolean inputEnd;
    int insertLength;
    boolean isMetadata;
    boolean isUncompressed;

    /* JADX INFO: renamed from: j */
    int f206812j;
    int literalTree;
    int maxBackwardDistance;
    int maxRingBufferSize;
    int metaBlockLength;
    int nextRunningState;
    int numDirectDistanceCodes;
    byte[] output;
    int outputLength;
    int outputOffset;
    int outputUsed;
    byte[] ringBuffer;
    int treeCommandOffset;
    int runningState = 0;

    /* JADX INFO: renamed from: br */
    final BitReader f206811br = new BitReader();
    final int[] blockTypeTrees = new int[3240];
    final int[] blockLenTrees = new int[3240];
    final HuffmanTreeGroup hGroup0 = new HuffmanTreeGroup();
    final HuffmanTreeGroup hGroup1 = new HuffmanTreeGroup();
    final HuffmanTreeGroup hGroup2 = new HuffmanTreeGroup();
    final int[] blockLength = new int[3];
    final int[] numBlockTypes = new int[3];
    final int[] blockTypeRb = new int[6];
    final int[] distRb = {16, 15, 11, 4};
    int pos = 0;
    int maxDistance = 0;
    int distRbIdx = 0;
    boolean trivialLiteralContext = false;
    int literalTreeIndex = 0;
    int ringBufferSize = 0;
    long expectedTotalSize = 0;
    byte[] customDictionary = new byte[0];
    int bytesToIgnore = 0;

    public static void close(State state) throws IOException {
        int i = state.runningState;
        if (i == 0) {
            wtq0.m207906a("State MUST be initialized");
        } else {
            if (i == 11) {
                return;
            }
            state.runningState = 11;
            BitReader.close(state.f206811br);
        }
    }

    private static int decodeWindowBits(BitReader bitReader) {
        if (BitReader.readBits(bitReader, 1) == 0) {
            return 16;
        }
        int bits = BitReader.readBits(bitReader, 3);
        if (bits != 0) {
            return bits + 17;
        }
        int bits2 = BitReader.readBits(bitReader, 3);
        if (bits2 != 0) {
            return bits2 + 8;
        }
        return 17;
    }

    public static void setInput(State state, InputStream inputStream) {
        if (state.runningState != 0) {
            wtq0.m207906a("State MUST be uninitialized");
            return;
        }
        BitReader.init(state.f206811br, inputStream);
        int iDecodeWindowBits = decodeWindowBits(state.f206811br);
        if (iDecodeWindowBits == 9) {
            C21997a.m222361a("Invalid 'windowBits' code");
            return;
        }
        int i = 1 << iDecodeWindowBits;
        state.maxRingBufferSize = i;
        state.maxBackwardDistance = i - 16;
        state.runningState = 1;
    }
}
