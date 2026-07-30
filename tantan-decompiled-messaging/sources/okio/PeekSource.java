package okio;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87230bv = {1, 0, 2}, m87231d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u000eH\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m87232d2 = {"Lokio/PeekSource;", "Lokio/Source;", "upstream", "Lokio/BufferedSource;", "(Lokio/BufferedSource;)V", "buffer", "Lokio/Buffer;", "closed", "", "expectedPos", "", "expectedSegment", "Lokio/Segment;", Constants.INAPP_POSITION, "", "close", "", "read", "sink", "byteCount", "timeout", "Lokio/Timeout;", "jvm"}, m87233k = 1, m87234mv = {1, 1, 11})
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
        To view partially-correct add '--show-bad-code' argument
    */
    public long read(@org.jetbrains.annotations.NotNull okio.Buffer r9, long r10) throws java.io.IOException {
        /*
            r8 = this;
            r9.getClass()
            boolean r0 = r8.closed
            if (r0 != 0) goto L66
            okio.Segment r0 = r8.expectedSegment
            if (r0 == 0) goto L25
            okio.Buffer r1 = r8.buffer
            okio.Segment r1 = r1.head
            if (r0 != r1) goto L1d
            int r0 = r8.expectedPos
            if (r1 != 0) goto L18
            kotlin.jvm.internal.Intrinsics.m87497m()
        L18:
            int r1 = r1.pos
            if (r0 != r1) goto L1d
            goto L25
        L1d:
            java.lang.String r8 = "Peek source is invalid because upstream source was used"
            p149l.qkq0.m175383a(r8)
        L22:
            r8 = 0
            return r8
        L25:
            okio.BufferedSource r0 = r8.upstream
            long r1 = r8.pos
            long r1 = r1 + r10
            r0.request(r1)
            okio.Segment r0 = r8.expectedSegment
            if (r0 != 0) goto L42
            okio.Buffer r0 = r8.buffer
            okio.Segment r0 = r0.head
            if (r0 == 0) goto L42
            r8.expectedSegment = r0
            if (r0 != 0) goto L3e
            kotlin.jvm.internal.Intrinsics.m87497m()
        L3e:
            int r0 = r0.pos
            r8.expectedPos = r0
        L42:
            okio.Buffer r0 = r8.buffer
            long r0 = r0.size()
            long r2 = r8.pos
            long r0 = r0 - r2
            long r6 = java.lang.Math.min(r10, r0)
            r10 = 0
            int r10 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r10 > 0) goto L58
            r8 = -1
            return r8
        L58:
            okio.Buffer r2 = r8.buffer
            long r4 = r8.pos
            r3 = r9
            r2.copyTo(r3, r4, r6)
            long r9 = r8.pos
            long r9 = r9 + r6
            r8.pos = r9
            return r6
        L66:
            java.lang.String r8 = "closed"
            p149l.qkq0.m175383a(r8)
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.PeekSource.read(okio.Buffer, long):long");
    }

    @Override // okio.Source
    @NotNull
    /* JADX INFO: renamed from: timeout */
    public Timeout getTimeout() {
        return this.upstream.getTimeout();
    }
}
