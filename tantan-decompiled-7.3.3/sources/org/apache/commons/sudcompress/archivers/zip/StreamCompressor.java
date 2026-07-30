package org.apache.commons.sudcompress.archivers.zip;

import java.io.Closeable;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import p153l.qjg0;
import p153l.sng0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class StreamCompressor implements Closeable {
    private static final int BUFFER_SIZE = 4096;
    private static final int DEFLATER_BLOCK_SIZE = 8192;
    private final Deflater def;
    private final CRC32 crc = new CRC32();
    private long writtenToOutputStreamForLastEntry = 0;
    private long sourcePayloadLength = 0;
    private long totalWrittenToOutputStream = 0;
    private final byte[] outputBuffer = new byte[4096];
    private final byte[] readerBuf = new byte[4096];

    public static final class DataOutputCompressor extends StreamCompressor {
        private final DataOutput raf;

        public DataOutputCompressor(Deflater deflater, DataOutput dataOutput) {
            super(deflater);
            this.raf = dataOutput;
        }

        @Override // org.apache.commons.sudcompress.archivers.zip.StreamCompressor
        public final void writeOut(byte[] bArr, int i, int i2) throws IOException {
            this.raf.write(bArr, i, i2);
        }
    }

    public static final class OutputStreamCompressor extends StreamCompressor {

        /* JADX INFO: renamed from: os */
        private final OutputStream f206794os;

        public OutputStreamCompressor(Deflater deflater, OutputStream outputStream) {
            super(deflater);
            this.f206794os = outputStream;
        }

        @Override // org.apache.commons.sudcompress.archivers.zip.StreamCompressor
        public final void writeOut(byte[] bArr, int i, int i2) throws IOException {
            this.f206794os.write(bArr, i, i2);
        }
    }

    public static final class ScatterGatherBackingStoreCompressor extends StreamCompressor {

        /* JADX INFO: renamed from: bs */
        private final sng0 f206795bs;

        public ScatterGatherBackingStoreCompressor(Deflater deflater, sng0 sng0Var) {
            super(deflater);
            this.f206795bs = sng0Var;
        }

        @Override // org.apache.commons.sudcompress.archivers.zip.StreamCompressor
        public final void writeOut(byte[] bArr, int i, int i2) throws IOException {
            ((qjg0) this.f206795bs).f157969b.write(bArr, i, i2);
        }
    }

    public static final class SeekableByteChannelCompressor extends StreamCompressor {
        private final SeekableByteChannel channel;

        public SeekableByteChannelCompressor(Deflater deflater, SeekableByteChannel seekableByteChannel) {
            super(deflater);
            this.channel = seekableByteChannel;
        }

        @Override // org.apache.commons.sudcompress.archivers.zip.StreamCompressor
        public final void writeOut(byte[] bArr, int i, int i2) throws IOException {
            this.channel.write(ByteBuffer.wrap(bArr, i, i2));
        }
    }

    public StreamCompressor(Deflater deflater) {
        this.def = deflater;
    }

    public static StreamCompressor create(OutputStream outputStream) {
        return create(outputStream, new Deflater(-1, true));
    }

    private void deflateUntilInputIsNeeded() {
        while (!this.def.needsInput()) {
            deflate();
        }
    }

    private void writeDeflated(byte[] bArr, int i, int i2) {
        if (i2 <= 0 || this.def.finished()) {
            return;
        }
        if (i2 <= 8192) {
            this.def.setInput(bArr, i, i2);
            deflateUntilInputIsNeeded();
            return;
        }
        int i3 = i2 / 8192;
        for (int i4 = 0; i4 < i3; i4++) {
            this.def.setInput(bArr, (i4 * 8192) + i, 8192);
            deflateUntilInputIsNeeded();
        }
        int i5 = i3 * 8192;
        if (i5 < i2) {
            this.def.setInput(bArr, i + i5, i2 - i5);
            deflateUntilInputIsNeeded();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.def.end();
    }

    public void deflate(InputStream inputStream, int i) throws IOException {
        reset();
        while (true) {
            byte[] bArr = this.readerBuf;
            int i2 = inputStream.read(bArr, 0, bArr.length);
            if (i2 < 0) {
                break;
            } else {
                write(this.readerBuf, 0, i2, i);
            }
        }
        if (i == 8) {
            flushDeflater();
        }
    }

    public void flushDeflater() {
        this.def.finish();
        while (!this.def.finished()) {
            deflate();
        }
    }

    public long getBytesRead() {
        return this.sourcePayloadLength;
    }

    public long getBytesWrittenForLastEntry() {
        return this.writtenToOutputStreamForLastEntry;
    }

    public long getCrc32() {
        return this.crc.getValue();
    }

    public long getTotalBytesWritten() {
        return this.totalWrittenToOutputStream;
    }

    public void reset() {
        this.crc.reset();
        this.def.reset();
        this.sourcePayloadLength = 0L;
        this.writtenToOutputStreamForLastEntry = 0L;
    }

    public long write(byte[] bArr, int i, int i2, int i3) {
        long j = this.writtenToOutputStreamForLastEntry;
        this.crc.update(bArr, i, i2);
        if (i3 == 8) {
            writeDeflated(bArr, i, i2);
        } else {
            writeCounted(bArr, i, i2);
        }
        this.sourcePayloadLength += (long) i2;
        return this.writtenToOutputStreamForLastEntry - j;
    }

    public void writeCounted(byte[] bArr, int i, int i2) {
        writeOut(bArr, i, i2);
        long j = i2;
        this.writtenToOutputStreamForLastEntry += j;
        this.totalWrittenToOutputStream += j;
    }

    public abstract void writeOut(byte[] bArr, int i, int i2);

    public static StreamCompressor create(OutputStream outputStream, Deflater deflater) {
        return new OutputStreamCompressor(deflater, outputStream);
    }

    public static StreamCompressor create(DataOutput dataOutput, Deflater deflater) {
        return new DataOutputCompressor(deflater, dataOutput);
    }

    public static StreamCompressor create(SeekableByteChannel seekableByteChannel, Deflater deflater) {
        return new SeekableByteChannelCompressor(deflater, seekableByteChannel);
    }

    public static StreamCompressor create(int i, sng0 sng0Var) {
        return new ScatterGatherBackingStoreCompressor(new Deflater(i, true), sng0Var);
    }

    public void writeCounted(byte[] bArr) {
        writeCounted(bArr, 0, bArr.length);
    }

    public static StreamCompressor create(sng0 sng0Var) {
        return create(-1, sng0Var);
    }

    public void deflate() {
        Deflater deflater = this.def;
        byte[] bArr = this.outputBuffer;
        int iDeflate = deflater.deflate(bArr, 0, bArr.length);
        if (iDeflate > 0) {
            writeCounted(this.outputBuffer, 0, iDeflate);
        }
    }
}
