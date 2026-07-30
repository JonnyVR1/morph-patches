package okio;

import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p149l.ci70;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87230bv = {1, 0, 2}, m87231d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nH\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m87232d2 = {"Lokio/InputStreamSource;", "Lokio/Source;", "input", "Ljava/io/InputStream;", "timeout", "Lokio/Timeout;", "(Ljava/io/InputStream;Lokio/Timeout;)V", "close", "", "read", "", "sink", "Lokio/Buffer;", "byteCount", "toString", "", "jvm"}, m87233k = 1, m87234mv = {1, 1, 11})
final class InputStreamSource implements Source {
    private final InputStream input;
    private final Timeout timeout;

    public InputStreamSource(@NotNull InputStream inputStream, @NotNull Timeout timeout) {
        inputStream.getClass();
        timeout.getClass();
        this.input = inputStream;
        this.timeout = timeout;
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.input.close();
    }

    @Override // okio.Source
    public long read(@NotNull Buffer sink, long byteCount) throws IOException {
        sink.getClass();
        if (byteCount == 0) {
            return 0L;
        }
        if (byteCount < 0) {
            ci70.m107054a("byteCount < 0: ", byteCount);
            return 0L;
        }
        try {
            this.timeout.throwIfReached();
            Segment segmentWritableSegment$jvm = sink.writableSegment$jvm(1);
            int i = this.input.read(segmentWritableSegment$jvm.data, segmentWritableSegment$jvm.limit, (int) Math.min(byteCount, 8192 - segmentWritableSegment$jvm.limit));
            if (i == -1) {
                return -1L;
            }
            segmentWritableSegment$jvm.limit += i;
            long j = i;
            sink.setSize$jvm(sink.size() + j);
            return j;
        } catch (AssertionError e) {
            if (Okio.isAndroidGetsocknameError(e)) {
                throw new IOException(e);
            }
            throw e;
        }
    }

    @Override // okio.Source
    @NotNull
    /* JADX INFO: renamed from: timeout, reason: from getter */
    public Timeout getTimeout() {
        return this.timeout;
    }

    @NotNull
    public String toString() {
        return "source(" + this.input + ')';
    }
}
