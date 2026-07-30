package net.jpountz.lz4;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Locale;
import p153l.azk0;
import p153l.cmq0;
import p153l.emq0;
import p153l.onl;
import p153l.wg3;
import p153l.wtq0;
import p153l.z7g0;

/* JADX INFO: loaded from: classes2.dex */
public class LZ4FrameOutputStream extends FilterOutputStream {
    static final String CLOSED_STREAM = "The stream is already closed";
    static final FLG.Bits[] DEFAULT_FEATURES = {FLG.Bits.BLOCK_INDEPENDENCE};
    static final int INTEGER_BYTES = 4;
    static final int LONG_BYTES = 8;
    static final int LZ4_FRAME_INCOMPRESSIBLE_MASK = Integer.MIN_VALUE;
    static final int LZ4_MAX_HEADER_LENGTH = 15;
    static final int MAGIC = 407708164;
    private final ByteBuffer buffer;
    private final cmq0 checksum;
    private final byte[] compressedBuffer;
    private final LZ4Compressor compressor;
    private FrameInfo frameInfo;
    private final ByteBuffer intLEBuffer;
    private final long knownSize;
    private final int maxBlockSize;

    /* JADX INFO: renamed from: net.jpountz.lz4.LZ4FrameOutputStream$BD */
    public static class C21950BD {
        private static final int RESERVED_MASK = 143;
        private final BLOCKSIZE blockSizeValue;

        private C21950BD(BLOCKSIZE blocksize) {
            this.blockSizeValue = blocksize;
        }

        public static C21950BD fromByte(byte b) {
            int i = (b >>> 4) & 7;
            if ((b & 143) <= 0) {
                return new C21950BD(BLOCKSIZE.valueOf(i));
            }
            azk0.m101074a("Reserved fields must be 0");
            return null;
        }

        public int getBlockMaximumSize() {
            return 1 << ((this.blockSizeValue.getIndicator() * 2) + 8);
        }

        public byte toByte() {
            return (byte) ((this.blockSizeValue.getIndicator() & 7) << 4);
        }
    }

    public enum BLOCKSIZE {
        SIZE_64KB(4),
        SIZE_256KB(5),
        SIZE_1MB(6),
        SIZE_4MB(7);

        private final int indicator;

        BLOCKSIZE(int i) {
            this.indicator = i;
        }

        public static BLOCKSIZE valueOf(int i) {
            if (i == 4) {
                return SIZE_64KB;
            }
            if (i == 5) {
                return SIZE_256KB;
            }
            if (i == 6) {
                return SIZE_1MB;
            }
            if (i == 7) {
                return SIZE_4MB;
            }
            wg3.m206174a(String.format(Locale.ROOT, "Block size must be 4-7. Cannot use value of [%d]", Integer.valueOf(i)));
            return null;
        }

        public int getIndicator() {
            return this.indicator;
        }
    }

    public static class FrameInfo {

        /* JADX INFO: renamed from: bd */
        private final C21950BD f206765bd;
        private boolean finished = false;
        private final FLG flg;
        private final z7g0 streamHash;

        public FrameInfo(FLG flg, C21950BD c21950bd) {
            this.flg = flg;
            this.f206765bd = c21950bd;
            if (flg.isEnabled(FLG.Bits.CONTENT_CHECKSUM)) {
                emq0.m121374b().m121381g(0);
            }
        }

        public int currentStreamHash() {
            throw null;
        }

        public void finish() {
            this.finished = true;
        }

        public C21950BD getBD() {
            return this.f206765bd;
        }

        public FLG getFLG() {
            return this.flg;
        }

        public boolean isEnabled(FLG.Bits bits) {
            return this.flg.isEnabled(bits);
        }

        public boolean isFinished() {
            return this.finished;
        }

        public void updateStreamHash(byte[] bArr, int i, int i2) {
            throw null;
        }
    }

    public LZ4FrameOutputStream(OutputStream outputStream, BLOCKSIZE blocksize, long j, LZ4Compressor lZ4Compressor, cmq0 cmq0Var, FLG.Bits... bitsArr) throws IOException {
        super(outputStream);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        this.intLEBuffer = byteBufferAllocate.order(byteOrder);
        this.frameInfo = null;
        this.compressor = lZ4Compressor;
        this.checksum = cmq0Var;
        FrameInfo frameInfo = new FrameInfo(new FLG(1, bitsArr), new C21950BD(blocksize));
        this.frameInfo = frameInfo;
        int blockMaximumSize = frameInfo.getBD().getBlockMaximumSize();
        this.maxBlockSize = blockMaximumSize;
        this.buffer = ByteBuffer.allocate(blockMaximumSize).order(byteOrder);
        this.compressedBuffer = new byte[lZ4Compressor.maxCompressedLength(blockMaximumSize)];
        if (this.frameInfo.getFLG().isEnabled(FLG.Bits.CONTENT_SIZE) && j < 0) {
            wg3.m206174a("Known size must be greater than zero in order to use the known size feature");
            throw null;
        }
        this.knownSize = j;
        writeHeader();
    }

    private void ensureNotFinished() {
        if (this.frameInfo.isFinished()) {
            wtq0.m207906a(CLOSED_STREAM);
        }
    }

    private void writeBlock() throws IOException {
        byte[] bArrCopyOf;
        int i;
        if (this.buffer.position() == 0) {
            return;
        }
        Arrays.fill(this.compressedBuffer, (byte) 0);
        int iCompress = this.compressor.compress(this.buffer.array(), 0, this.buffer.position(), this.compressedBuffer, 0);
        if (iCompress >= this.buffer.position()) {
            iCompress = this.buffer.position();
            bArrCopyOf = Arrays.copyOf(this.buffer.array(), iCompress);
            i = Integer.MIN_VALUE;
        } else {
            bArrCopyOf = this.compressedBuffer;
            i = 0;
        }
        this.intLEBuffer.putInt(0, i | iCompress);
        ((FilterOutputStream) this).out.write(this.intLEBuffer.array());
        ((FilterOutputStream) this).out.write(bArrCopyOf, 0, iCompress);
        if (this.frameInfo.isEnabled(FLG.Bits.BLOCK_CHECKSUM)) {
            this.intLEBuffer.putInt(0, this.checksum.m111313a(bArrCopyOf, 0, iCompress, 0));
            ((FilterOutputStream) this).out.write(this.intLEBuffer.array());
        }
        this.buffer.rewind();
    }

    private void writeEndMark() throws IOException {
        this.intLEBuffer.putInt(0, 0);
        ((FilterOutputStream) this).out.write(this.intLEBuffer.array());
        if (this.frameInfo.isEnabled(FLG.Bits.CONTENT_CHECKSUM)) {
            this.intLEBuffer.putInt(0, this.frameInfo.currentStreamHash());
            ((FilterOutputStream) this).out.write(this.intLEBuffer.array());
        }
        this.frameInfo.finish();
    }

    private void writeHeader() throws IOException {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(15).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.putInt(MAGIC);
        byteBufferOrder.put(this.frameInfo.getFLG().toByte());
        byteBufferOrder.put(this.frameInfo.getBD().toByte());
        if (this.frameInfo.isEnabled(FLG.Bits.CONTENT_SIZE)) {
            byteBufferOrder.putLong(this.knownSize);
        }
        byteBufferOrder.put((byte) ((this.checksum.m111313a(byteBufferOrder.array(), 4, byteBufferOrder.position() - 4, 0) >> 8) & 255));
        ((FilterOutputStream) this).out.write(byteBufferOrder.array(), 0, byteBufferOrder.position());
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.frameInfo.isFinished()) {
            flush();
            writeEndMark();
        }
        super.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        if (!this.frameInfo.isFinished()) {
            writeBlock();
        }
        super.flush();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        ByteBuffer byteBuffer;
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            onl.m168333a();
            return;
        }
        ensureNotFinished();
        while (true) {
            int iRemaining = this.buffer.remaining();
            byteBuffer = this.buffer;
            if (i2 <= iRemaining) {
                break;
            }
            int iRemaining2 = byteBuffer.remaining();
            this.buffer.put(bArr, i, iRemaining2);
            if (this.frameInfo.isEnabled(FLG.Bits.CONTENT_CHECKSUM)) {
                this.frameInfo.updateStreamHash(bArr, i, iRemaining2);
            }
            writeBlock();
            i += iRemaining2;
            i2 -= iRemaining2;
        }
        byteBuffer.put(bArr, i, i2);
        if (this.frameInfo.isEnabled(FLG.Bits.CONTENT_CHECKSUM)) {
            this.frameInfo.updateStreamHash(bArr, i, i2);
        }
    }

    public static class FLG {
        private static final int DEFAULT_VERSION = 1;
        private final BitSet bitSet;
        private final int version;

        public enum Bits {
            RESERVED_0(0),
            RESERVED_1(1),
            CONTENT_CHECKSUM(2),
            CONTENT_SIZE(3),
            BLOCK_CHECKSUM(4),
            BLOCK_INDEPENDENCE(5);

            private final int position;

            Bits(int i) {
                this.position = i;
            }
        }

        public FLG(int i, Bits... bitsArr) {
            this.bitSet = new BitSet(8);
            this.version = i;
            if (bitsArr != null) {
                for (Bits bits : bitsArr) {
                    this.bitSet.set(bits.position);
                }
            }
            validate();
        }

        public static FLG fromByte(byte b) {
            byte b2 = (byte) (b & 192);
            return new FLG(b2 >>> 6, (byte) (b ^ b2));
        }

        private void validate() {
            if (this.bitSet.get(Bits.RESERVED_0.position)) {
                azk0.m101074a("Reserved0 field must be 0");
                return;
            }
            if (this.bitSet.get(Bits.RESERVED_1.position)) {
                azk0.m101074a("Reserved1 field must be 0");
                return;
            }
            if (!this.bitSet.get(Bits.BLOCK_INDEPENDENCE.position)) {
                azk0.m101074a("Dependent block stream is unsupported (BLOCK_INDEPENDENCE must be set)");
                return;
            }
            int i = this.version;
            if (i == 1) {
                return;
            }
            azk0.m101074a(String.format(Locale.ROOT, "Version %d is unsupported", Integer.valueOf(i)));
        }

        public int getVersion() {
            return this.version;
        }

        public boolean isEnabled(Bits bits) {
            return this.bitSet.get(bits.position);
        }

        public byte toByte() {
            return (byte) (((this.version & 3) << 6) | this.bitSet.toByteArray()[0]);
        }

        private FLG(int i, byte b) {
            this.bitSet = BitSet.valueOf(new byte[]{b});
            this.version = i;
            validate();
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i) throws IOException {
        ensureNotFinished();
        if (this.buffer.position() == this.maxBlockSize) {
            writeBlock();
        }
        byte b = (byte) i;
        this.buffer.put(b);
        if (this.frameInfo.isEnabled(FLG.Bits.CONTENT_CHECKSUM)) {
            this.frameInfo.updateStreamHash(new byte[]{b}, 0, 1);
        }
    }

    public LZ4FrameOutputStream(OutputStream outputStream, BLOCKSIZE blocksize, long j, FLG.Bits... bitsArr) throws IOException {
        this(outputStream, blocksize, j, LZ4Factory.fastestInstance().fastCompressor(), emq0.m121374b().m121380d(), bitsArr);
    }

    public LZ4FrameOutputStream(OutputStream outputStream, BLOCKSIZE blocksize, FLG.Bits... bitsArr) throws IOException {
        this(outputStream, blocksize, -1L, bitsArr);
    }

    public LZ4FrameOutputStream(OutputStream outputStream, BLOCKSIZE blocksize) throws IOException {
        this(outputStream, blocksize, DEFAULT_FEATURES);
    }

    public LZ4FrameOutputStream(OutputStream outputStream) throws IOException {
        this(outputStream, BLOCKSIZE.SIZE_4MB);
    }
}
