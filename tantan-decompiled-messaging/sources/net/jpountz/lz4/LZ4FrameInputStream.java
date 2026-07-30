package net.jpountz.lz4;

import com.google.android.gms.common.api.Api;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Locale;
import p149l.qq3;
import p149l.rhg0;
import p149l.xcq0;
import p149l.zcq0;
import p149l.zkl;

/* JADX INFO: loaded from: classes2.dex */
public class LZ4FrameInputStream extends FilterInputStream {
    static final String BLOCK_HASH_MISMATCH = "Block checksum mismatch";
    static final String DESCRIPTOR_HASH_MISMATCH = "Stream frame descriptor corrupted";
    static final int MAGIC_SKIPPABLE_BASE = 407710288;
    static final String NOT_SUPPORTED = "Stream unsupported";
    static final String PREMATURE_EOS = "Stream ended prematurely";
    private ByteBuffer buffer;
    private final xcq0 checksum;
    private byte[] compressedBuffer;
    private final LZ4SafeDecompressor decompressor;
    private long expectedContentSize;
    private LZ4FrameOutputStream.FrameInfo frameInfo;
    private final byte[] headerArray;
    private final ByteBuffer headerBuffer;
    private int maxBlockSize;
    private byte[] rawBuffer;
    private final ByteBuffer readNumberBuff;
    private final boolean readSingleFrame;
    private long totalContentSize;

    public LZ4FrameInputStream(InputStream inputStream, LZ4SafeDecompressor lZ4SafeDecompressor, xcq0 xcq0Var, boolean z) throws IOException {
        super(inputStream);
        byte[] bArr = new byte[15];
        this.headerArray = bArr;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        this.headerBuffer = byteBufferWrap.order(byteOrder);
        this.buffer = null;
        this.rawBuffer = null;
        this.maxBlockSize = -1;
        this.expectedContentSize = -1L;
        this.totalContentSize = 0L;
        this.frameInfo = null;
        this.readNumberBuff = ByteBuffer.allocate(8).order(byteOrder);
        this.decompressor = lZ4SafeDecompressor;
        this.checksum = xcq0Var;
        this.readSingleFrame = z;
        nextFrameInfo();
    }

    private boolean nextFrameInfo() throws IOException {
        while (true) {
            int i = 0;
            do {
                int i2 = ((FilterInputStream) this).in.read(this.readNumberBuff.array(), i, 4 - i);
                if (i2 < 0) {
                    return false;
                }
                i += i2;
            } while (i < 4);
            int i3 = this.readNumberBuff.getInt(0);
            if (i3 == 407708164) {
                readHeader();
                return true;
            }
            if ((i3 >>> 4) != 25481893) {
                rhg0.m179353a(NOT_SUPPORTED);
                return false;
            }
            skippableFrame();
        }
    }

    private void readBlock() throws IOException {
        int i = readInt(((FilterInputStream) this).in);
        boolean z = (Integer.MIN_VALUE & i) == 0;
        int iDecompress = i & Api.BaseClientBuilder.API_PRIORITY_OTHER;
        if (iDecompress == 0) {
            if (this.frameInfo.isEnabled(LZ4FrameOutputStream.FLG.Bits.CONTENT_CHECKSUM) && readInt(((FilterInputStream) this).in) != this.frameInfo.currentStreamHash()) {
                rhg0.m179353a("Content checksum mismatch");
                return;
            } else if (!this.frameInfo.isEnabled(LZ4FrameOutputStream.FLG.Bits.CONTENT_SIZE) || this.expectedContentSize == this.totalContentSize) {
                this.frameInfo.finish();
                return;
            } else {
                rhg0.m179353a("Size check mismatch");
                return;
            }
        }
        byte[] bArr = z ? this.compressedBuffer : this.rawBuffer;
        if (iDecompress > this.maxBlockSize) {
            rhg0.m179353a(String.format(Locale.ROOT, "Block size %s exceeded max: %s", Integer.valueOf(iDecompress), Integer.valueOf(this.maxBlockSize)));
            return;
        }
        int i2 = 0;
        while (i2 < iDecompress) {
            int i3 = ((FilterInputStream) this).in.read(bArr, i2, iDecompress - i2);
            if (i3 < 0) {
                rhg0.m179353a(PREMATURE_EOS);
                return;
            }
            i2 += i3;
        }
        if (this.frameInfo.isEnabled(LZ4FrameOutputStream.FLG.Bits.BLOCK_CHECKSUM) && readInt(((FilterInputStream) this).in) != this.checksum.m208128a(bArr, 0, iDecompress, 0)) {
            rhg0.m179353a(BLOCK_HASH_MISMATCH);
            return;
        }
        if (z) {
            try {
                LZ4SafeDecompressor lZ4SafeDecompressor = this.decompressor;
                byte[] bArr2 = this.rawBuffer;
                iDecompress = lZ4SafeDecompressor.decompress(bArr, 0, iDecompress, bArr2, 0, bArr2.length);
            } catch (LZ4Exception e) {
                throw new IOException(e);
            }
        }
        if (this.frameInfo.isEnabled(LZ4FrameOutputStream.FLG.Bits.CONTENT_CHECKSUM)) {
            this.frameInfo.updateStreamHash(this.rawBuffer, 0, iDecompress);
        }
        this.totalContentSize += (long) iDecompress;
        this.buffer.limit(iDecompress);
        this.buffer.rewind();
    }

    private void readHeader() throws IOException {
        this.headerBuffer.rewind();
        int i = ((FilterInputStream) this).in.read();
        if (i < 0) {
            rhg0.m179353a(PREMATURE_EOS);
            return;
        }
        int i2 = ((FilterInputStream) this).in.read();
        if (i2 < 0) {
            rhg0.m179353a(PREMATURE_EOS);
            return;
        }
        byte b = (byte) (i & 255);
        LZ4FrameOutputStream.FLG flgFromByte = LZ4FrameOutputStream.FLG.fromByte(b);
        this.headerBuffer.put(b);
        byte b2 = (byte) (i2 & 255);
        LZ4FrameOutputStream.C21829BD c21829bdFromByte = LZ4FrameOutputStream.C21829BD.fromByte(b2);
        this.headerBuffer.put(b2);
        this.frameInfo = new LZ4FrameOutputStream.FrameInfo(flgFromByte, c21829bdFromByte);
        if (flgFromByte.isEnabled(LZ4FrameOutputStream.FLG.Bits.CONTENT_SIZE)) {
            long j = readLong(((FilterInputStream) this).in);
            this.expectedContentSize = j;
            this.headerBuffer.putLong(j);
        }
        this.totalContentSize = 0L;
        byte bM208128a = (byte) ((this.checksum.m208128a(this.headerArray, 0, this.headerBuffer.position(), 0) >> 8) & 255);
        int i3 = ((FilterInputStream) this).in.read();
        if (i3 < 0) {
            rhg0.m179353a(PREMATURE_EOS);
            return;
        }
        if (bM208128a != ((byte) (i3 & 255))) {
            rhg0.m179353a(DESCRIPTOR_HASH_MISMATCH);
            return;
        }
        int blockMaximumSize = this.frameInfo.getBD().getBlockMaximumSize();
        this.maxBlockSize = blockMaximumSize;
        this.compressedBuffer = new byte[blockMaximumSize];
        byte[] bArr = new byte[blockMaximumSize];
        this.rawBuffer = bArr;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        this.buffer = byteBufferWrap;
        byteBufferWrap.limit(0);
    }

    private int readInt(InputStream inputStream) throws IOException {
        int i = 0;
        do {
            int i2 = inputStream.read(this.readNumberBuff.array(), i, 4 - i);
            if (i2 < 0) {
                rhg0.m179353a(PREMATURE_EOS);
                return 0;
            }
            i += i2;
        } while (i < 4);
        return this.readNumberBuff.getInt(0);
    }

    private long readLong(InputStream inputStream) throws IOException {
        int i = 0;
        do {
            int i2 = inputStream.read(this.readNumberBuff.array(), i, 8 - i);
            if (i2 < 0) {
                rhg0.m179353a(PREMATURE_EOS);
                return 0L;
            }
            i += i2;
        } while (i < 8);
        return this.readNumberBuff.getLong(0);
    }

    private void skippableFrame() throws IOException {
        int i = readInt(((FilterInputStream) this).in);
        byte[] bArr = new byte[1024];
        while (i > 0) {
            int i2 = ((FilterInputStream) this).in.read(bArr, 0, Math.min(i, 1024));
            if (i2 < 0) {
                rhg0.m179353a(PREMATURE_EOS);
                return;
            }
            i -= i2;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        return this.buffer.remaining();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
    }

    public long getExpectedContentSize() {
        if (this.readSingleFrame) {
            return this.expectedContentSize;
        }
        qq3.m175877a("Operation not permitted when multiple frames can be read");
        return 0L;
    }

    public boolean isExpectedContentSizeDefined() {
        return this.readSingleFrame && this.expectedContentSize >= 0;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i) {
        throw new UnsupportedOperationException("mark not supported");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            zkl.m219192a();
            return 0;
        }
        while (this.buffer.remaining() == 0) {
            if (this.frameInfo.isFinished() && (this.readSingleFrame || !nextFrameInfo())) {
                return -1;
            }
            readBlock();
        }
        int iMin = Math.min(i2, this.buffer.remaining());
        this.buffer.get(bArr, i, iMin);
        return iMin;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        throw new UnsupportedOperationException("reset not supported");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        if (j <= 0) {
            return 0L;
        }
        while (this.buffer.remaining() == 0) {
            if (this.frameInfo.isFinished() && (this.readSingleFrame || !nextFrameInfo())) {
                return 0L;
            }
            readBlock();
        }
        long jMin = Math.min(j, this.buffer.remaining());
        ByteBuffer byteBuffer = this.buffer;
        byteBuffer.position(byteBuffer.position() + ((int) jMin));
        return jMin;
    }

    public LZ4FrameInputStream(InputStream inputStream, boolean z) throws IOException {
        this(inputStream, LZ4Factory.fastestInstance().safeDecompressor(), zcq0.m218076b().m218082d(), z);
    }

    public LZ4FrameInputStream(InputStream inputStream, LZ4SafeDecompressor lZ4SafeDecompressor, xcq0 xcq0Var) throws IOException {
        this(inputStream, lZ4SafeDecompressor, xcq0Var, false);
    }

    public LZ4FrameInputStream(InputStream inputStream) throws IOException {
        this(inputStream, LZ4Factory.fastestInstance().safeDecompressor(), zcq0.m218076b().m218082d());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        while (this.buffer.remaining() == 0) {
            if (this.frameInfo.isFinished() && (this.readSingleFrame || !nextFrameInfo())) {
                return -1;
            }
            readBlock();
        }
        return this.buffer.get() & 255;
    }
}
