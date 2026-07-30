package org.apache.commons.sudcompress.archivers.zip;

import java.io.IOException;
import java.io.InputStream;
import p149l.ig3;
import p149l.wqg0;
import p149l.zng0;

/* JADX INFO: loaded from: classes2.dex */
class ExplodingInputStream extends InputStream {
    private BitStream bits;
    private final int dictionarySize;
    private BinaryTree distanceTree;

    /* JADX INFO: renamed from: in */
    private final InputStream f205861in;
    private BinaryTree lengthTree;
    private BinaryTree literalTree;
    private final int minimumMatchLength;
    private final int numberOfTrees;
    private final CircularBuffer buffer = new CircularBuffer(32768);
    private long uncompressedCount = 0;
    private long treeSizes = 0;

    public ExplodingInputStream(int i, int i2, InputStream inputStream) {
        if (i != 4096 && i != 8192) {
            ig3.m135964a("The dictionary size must be 4096 or 8192");
            throw null;
        }
        if (i2 != 2 && i2 != 3) {
            ig3.m135964a("The number of trees must be 2 or 3");
            throw null;
        }
        this.dictionarySize = i;
        this.numberOfTrees = i2;
        this.minimumMatchLength = i2;
        this.f205861in = inputStream;
    }

    private void fillBuffer() throws IOException {
        init();
        int iNextBit = this.bits.nextBit();
        if (iNextBit == -1) {
            return;
        }
        if (iNextBit == 1) {
            BinaryTree binaryTree = this.literalTree;
            BitStream bitStream = this.bits;
            int iNextByte = binaryTree != null ? binaryTree.read(bitStream) : bitStream.nextByte();
            if (iNextByte == -1) {
                return;
            }
            this.buffer.put(iNextByte);
            return;
        }
        int i = this.dictionarySize == 4096 ? 6 : 7;
        int iNextBits = (int) this.bits.nextBits(i);
        int i2 = this.distanceTree.read(this.bits);
        if (i2 != -1 || iNextBits > 0) {
            int i3 = (i2 << i) | iNextBits;
            int i4 = this.lengthTree.read(this.bits);
            if (i4 == 63) {
                long jNextBits = this.bits.nextBits(8);
                if (jNextBits == -1) {
                    return;
                } else {
                    i4 = (int) (((long) i4) + jNextBits);
                }
            }
            this.buffer.copy(i3 + 1, i4 + this.minimumMatchLength);
        }
    }

    private void init() throws IOException {
        if (this.bits == null) {
            wqg0 wqg0Var = new wqg0(new zng0(this.f205861in));
            try {
                if (this.numberOfTrees == 3) {
                    this.literalTree = BinaryTree.decode(wqg0Var, 256);
                }
                this.lengthTree = BinaryTree.decode(wqg0Var, 64);
                this.distanceTree = BinaryTree.decode(wqg0Var, 64);
                this.treeSizes += wqg0Var.getBytesRead();
                wqg0Var.close();
                this.bits = new BitStream(this.f205861in);
            } catch (Throwable th) {
                try {
                    wqg0Var.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f205861in.close();
    }

    public long getCompressedCount() {
        return this.bits.getBytesRead() + this.treeSizes;
    }

    public long getUncompressedCount() {
        return this.uncompressedCount;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (!this.buffer.available()) {
            fillBuffer();
        }
        int i = this.buffer.get();
        if (i > -1) {
            this.uncompressedCount++;
        }
        return i;
    }
}
