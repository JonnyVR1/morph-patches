package okio;

import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87230bv = {1, 0, 2}, m87231d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\tH\u0003J\r\u0010\u000e\u001a\u00020\u000bH\u0000¢\u0006\u0002\b\u000fJ\b\u0010\u0010\u001a\u00020\u000bH\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m87232d2 = {"Lokio/DeflaterSink;", "Lokio/Sink;", "sink", "deflater", "Ljava/util/zip/Deflater;", "(Lokio/Sink;Ljava/util/zip/Deflater;)V", "Lokio/BufferedSink;", "(Lokio/BufferedSink;Ljava/util/zip/Deflater;)V", "closed", "", "close", "", "deflate", "syncFlush", "finishDeflate", "finishDeflate$jvm", "flush", "timeout", "Lokio/Timeout;", "toString", "", "write", "source", "Lokio/Buffer;", "byteCount", "", "jvm"}, m87233k = 1, m87234mv = {1, 1, 11})
public final class DeflaterSink implements Sink {
    private boolean closed;
    private final Deflater deflater;
    private final BufferedSink sink;

    public DeflaterSink(@NotNull BufferedSink bufferedSink, @NotNull Deflater deflater) {
        bufferedSink.getClass();
        deflater.getClass();
        this.sink = bufferedSink;
        this.deflater = deflater;
    }

    @IgnoreJRERequirement
    private final void deflate(boolean syncFlush) throws IOException {
        Segment segmentWritableSegment$jvm;
        int iDeflate;
        Buffer buffer = this.sink.getBuffer();
        while (true) {
            segmentWritableSegment$jvm = buffer.writableSegment$jvm(1);
            Deflater deflater = this.deflater;
            if (syncFlush) {
                byte[] bArr = segmentWritableSegment$jvm.data;
                int i = segmentWritableSegment$jvm.limit;
                iDeflate = deflater.deflate(bArr, i, 8192 - i, 2);
            } else {
                byte[] bArr2 = segmentWritableSegment$jvm.data;
                int i2 = segmentWritableSegment$jvm.limit;
                iDeflate = deflater.deflate(bArr2, i2, 8192 - i2);
            }
            if (iDeflate > 0) {
                segmentWritableSegment$jvm.limit += iDeflate;
                buffer.setSize$jvm(buffer.size() + ((long) iDeflate));
                this.sink.emitCompleteSegments();
            } else if (this.deflater.needsInput()) {
                break;
            }
        }
        if (segmentWritableSegment$jvm.pos == segmentWritableSegment$jvm.limit) {
            buffer.head = segmentWritableSegment$jvm.pop();
            SegmentPool.recycle(segmentWritableSegment$jvm);
        }
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.closed) {
            return;
        }
        finishDeflate$jvm();
        th = null;
        try {
            this.deflater.end();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        try {
            this.sink.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.closed = true;
        if (th != null) {
            throw th;
        }
    }

    public final void finishDeflate$jvm() throws IOException {
        this.deflater.finish();
        deflate(false);
    }

    @Override // okio.Sink, java.io.Flushable
    public void flush() throws IOException {
        deflate(true);
        this.sink.flush();
    }

    @Override // okio.Sink
    @NotNull
    public Timeout timeout() {
        return this.sink.timeout();
    }

    @NotNull
    public String toString() {
        return "DeflaterSink(" + this.sink + ')';
    }

    @Override // okio.Sink
    public void write(@NotNull Buffer source, long byteCount) throws IOException {
        source.getClass();
        Util.checkOffsetAndCount(source.size(), 0L, byteCount);
        while (byteCount > 0) {
            Segment segment = source.head;
            if (segment == null) {
                Intrinsics.m87497m();
            }
            int iMin = (int) Math.min(byteCount, segment.limit - segment.pos);
            this.deflater.setInput(segment.data, segment.pos, iMin);
            deflate(false);
            long j = iMin;
            source.setSize$jvm(source.size() - j);
            int i = segment.pos + iMin;
            segment.pos = i;
            if (i == segment.limit) {
                source.head = segment.pop();
                SegmentPool.recycle(segment);
            }
            byteCount -= j;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DeflaterSink(@NotNull Sink sink, @NotNull Deflater deflater) {
        this(Okio.buffer(sink), deflater);
        sink.getClass();
        deflater.getClass();
    }
}
