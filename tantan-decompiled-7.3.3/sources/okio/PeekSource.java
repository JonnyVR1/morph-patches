package okio;

import com.clevertap.android.sdk.Constants;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p153l.wtq0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88119bv = {1, 0, 2}, m88120d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u000eH\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m88121d2 = {"Lokio/PeekSource;", "Lokio/Source;", "upstream", "Lokio/BufferedSource;", "(Lokio/BufferedSource;)V", "buffer", "Lokio/Buffer;", "closed", "", "expectedPos", "", "expectedSegment", "Lokio/Segment;", Constants.INAPP_POSITION, "", "close", "", "read", "sink", "byteCount", "timeout", "Lokio/Timeout;", "jvm"}, m88122k = 1, m88123mv = {1, 1, 11})
public final class PeekSource implements Source {
    private final Buffer buffer;
    private boolean closed;
    private int expectedPos;
    private Segment expectedSegment;
    private long pos;
    private final BufferedSource upstream;

    public PeekSource(@NotNull BufferedSource bufferedSource) {
        bufferedSource.getClass();
        this.upstream = bufferedSource;
        Buffer buffer = bufferedSource.getBuffer();
        this.buffer = buffer;
        Segment segment = buffer.head;
        this.expectedSegment = segment;
        this.expectedPos = segment != null ? segment.pos : -1;
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.closed = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001a, code lost:
    
        if (r0 == r1.pos) goto L17;
     */
    @Override // okio.Source
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long read(@NotNull Buffer sink, long byteCount) throws IOException {
        Segment segment;
        sink.getClass();
        if (this.closed) {
            wtq0.m207906a("closed");
            return 0L;
        }
        Segment segment2 = this.expectedSegment;
        if (segment2 != null) {
            Segment segment3 = this.buffer.head;
            if (segment2 == segment3) {
                int i = this.expectedPos;
                if (segment3 == null) {
                    Intrinsics.m88386m();
                }
            }
            wtq0.m207906a("Peek source is invalid because upstream source was used");
            return 0L;
        }
        this.upstream.request(this.pos + byteCount);
        if (this.expectedSegment == null && (segment = this.buffer.head) != null) {
            this.expectedSegment = segment;
            if (segment == null) {
                Intrinsics.m88386m();
            }
            this.expectedPos = segment.pos;
        }
        long jMin = Math.min(byteCount, this.buffer.size() - this.pos);
        if (jMin <= 0) {
            return -1L;
        }
        this.buffer.copyTo(sink, this.pos, jMin);
        this.pos += jMin;
        return jMin;
    }

    @Override // okio.Source
    @NotNull
    /* JADX INFO: renamed from: timeout */
    public Timeout getTimeout() {
        return this.upstream.getTimeout();
    }
}
