package okio;

import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.ijk.media.player.IjkMediaPlayer;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;
import p153l.vg3;
import p153l.wtq0;
import p153l.zpg0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88119bv = {1, 0, 2}, m88120d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0001H\u0016J\b\u0010\u0011\u001a\u00020\u0001H\u0016J\b\u0010\u0012\u001a\u00020\u000fH\u0016J\b\u0010\u0013\u001a\u00020\rH\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u001eH\u0016J \u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001bH\u0016J\u0018\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010 \u001a\u00020!H\u0016J\u0010\u0010\u001a\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020#H\u0016J\u0018\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020$2\u0006\u0010 \u001a\u00020!H\u0016J\u0010\u0010%\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020$H\u0016J\u0010\u0010&\u001a\u00020\u00012\u0006\u0010'\u001a\u00020\u001bH\u0016J\u0010\u0010(\u001a\u00020\u00012\u0006\u0010)\u001a\u00020!H\u0016J\u0010\u0010*\u001a\u00020\u00012\u0006\u0010)\u001a\u00020!H\u0016J\u0010\u0010+\u001a\u00020\u00012\u0006\u0010,\u001a\u00020\u001bH\u0016J\u0010\u0010-\u001a\u00020\u00012\u0006\u0010,\u001a\u00020\u001bH\u0016J\u0010\u0010.\u001a\u00020\u00012\u0006\u0010)\u001a\u00020!H\u0016J\u0010\u0010/\u001a\u00020\u00012\u0006\u0010)\u001a\u00020!H\u0016J\u0010\u00100\u001a\u00020\u00012\u0006\u00101\u001a\u00020\u001bH\u0016J\u0010\u00102\u001a\u00020\u00012\u0006\u00101\u001a\u00020\u001bH\u0016J\u0018\u00103\u001a\u00020\u00012\u0006\u00104\u001a\u00020\u00192\u0006\u00105\u001a\u000206H\u0016J(\u00103\u001a\u00020\u00012\u0006\u00104\u001a\u00020\u00192\u0006\u00107\u001a\u00020\u001b2\u0006\u00108\u001a\u00020\u001b2\u0006\u00105\u001a\u000206H\u0016J\u0010\u00109\u001a\u00020\u00012\u0006\u00104\u001a\u00020\u0019H\u0016J \u00109\u001a\u00020\u00012\u0006\u00104\u001a\u00020\u00192\u0006\u00107\u001a\u00020\u001b2\u0006\u00108\u001a\u00020\u001bH\u0016J\u0010\u0010:\u001a\u00020\u00012\u0006\u0010;\u001a\u00020\u001bH\u0016R\u001b\u0010\u0005\u001a\u00020\u00068Ö\u0002X\u0097\u0004¢\u0006\f\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006<"}, m88121d2 = {"Lokio/RealBufferedSink;", "Lokio/BufferedSink;", "sink", "Lokio/Sink;", "(Lokio/Sink;)V", "buffer", "Lokio/Buffer;", "buffer$annotations", "()V", "getBuffer", "()Lokio/Buffer;", "bufferField", "closed", "", "close", "", "emit", "emitCompleteSegments", "flush", "isOpen", "outputStream", "Ljava/io/OutputStream;", "timeout", "Lokio/Timeout;", "toString", "", "write", "", "source", "Ljava/nio/ByteBuffer;", "", IjkMediaPlayer.OnNativeInvokeListener.ARG_OFFSET, "byteCount", "", "byteString", "Lokio/ByteString;", "Lokio/Source;", "writeAll", "writeByte", "b", "writeDecimalLong", ResourceDirection.f39656v, "writeHexadecimalUnsignedLong", "writeInt", RXScreenCaptureService.KEY_INDEX, "writeIntLe", "writeLong", "writeLongLe", "writeShort", BLiveStormDanmakuGiftResourceType.f45294s, "writeShortLe", "writeString", "string", "charset", "Ljava/nio/charset/Charset;", "beginIndex", "endIndex", "writeUtf8", "writeUtf8CodePoint", "codePoint", "jvm"}, m88122k = 1, m88123mv = {1, 1, 11})
public final class RealBufferedSink implements BufferedSink {

    @JvmField
    @NotNull
    public final Buffer bufferField;

    @JvmField
    public boolean closed;

    @JvmField
    @NotNull
    public final Sink sink;

    public RealBufferedSink(@NotNull Sink sink) {
        sink.getClass();
        this.sink = sink;
        this.bufferField = new Buffer();
    }

    public static /* synthetic */ void buffer$annotations() {
    }

    @Override // okio.BufferedSink
    @NotNull
    /* JADX INFO: renamed from: buffer, reason: from getter */
    public Buffer getBufferField() {
        return this.bufferField;
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.closed) {
            return;
        }
        if (this.bufferField.size() > 0) {
            Sink sink = this.sink;
            Buffer buffer = this.bufferField;
            sink.write(buffer, buffer.size());
        }
        th = null;
        try {
            this.sink.close();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        this.closed = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // okio.BufferedSink
    @NotNull
    public BufferedSink emit() throws IOException {
        if (this.closed) {
            wtq0.m207906a("closed");
            return null;
        }
        long size = this.bufferField.size();
        if (size > 0) {
            this.sink.write(this.bufferField, size);
        }
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    public BufferedSink emitCompleteSegments() throws IOException {
        if (this.closed) {
            wtq0.m207906a("closed");
            return null;
        }
        long jCompleteSegmentByteCount = this.bufferField.completeSegmentByteCount();
        if (jCompleteSegmentByteCount > 0) {
            this.sink.write(this.bufferField, jCompleteSegmentByteCount);
        }
        return this;
    }

    @Override // okio.BufferedSink, okio.Sink, java.io.Flushable
    public void flush() throws IOException {
        if (this.closed) {
            wtq0.m207906a("closed");
            return;
        }
        if (this.bufferField.size() > 0) {
            Sink sink = this.sink;
            Buffer buffer = this.bufferField;
            sink.write(buffer, buffer.size());
        }
        this.sink.flush();
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer getBuffer() {
        return this.bufferField;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.closed;
    }

    @Override // okio.BufferedSink
    @NotNull
    public OutputStream outputStream() {
        return new OutputStream() { // from class: okio.RealBufferedSink.outputStream.1
            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws Throwable {
                RealBufferedSink.this.close();
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public void flush() throws IOException {
                RealBufferedSink realBufferedSink = RealBufferedSink.this;
                if (realBufferedSink.closed) {
                    return;
                }
                realBufferedSink.flush();
            }

            @NotNull
            public String toString() {
                return RealBufferedSink.this + ".outputStream()";
            }

            @Override // java.io.OutputStream
            public void write(@NotNull byte[] data, int offset, int byteCount) throws IOException {
                data.getClass();
                RealBufferedSink realBufferedSink = RealBufferedSink.this;
                if (realBufferedSink.closed) {
                    zpg0.m220844a("closed");
                } else {
                    realBufferedSink.bufferField.write(data, offset, byteCount);
                    RealBufferedSink.this.emitCompleteSegments();
                }
            }

            @Override // java.io.OutputStream
            public void write(int b) throws IOException {
                RealBufferedSink realBufferedSink = RealBufferedSink.this;
                if (!realBufferedSink.closed) {
                    realBufferedSink.bufferField.writeByte((int) ((byte) b));
                    RealBufferedSink.this.emitCompleteSegments();
                } else {
                    zpg0.m220844a("closed");
                }
            }
        };
    }

    @Override // okio.Sink
    @NotNull
    /* JADX INFO: renamed from: timeout */
    public Timeout getTimeout() {
        return this.sink.getTimeout();
    }

    @NotNull
    public String toString() {
        return "buffer(" + this.sink + ')';
    }

    @Override // okio.BufferedSink
    @NotNull
    public BufferedSink write(@NotNull Source source, long byteCount) throws IOException {
        source.getClass();
        while (byteCount > 0) {
            long j = source.read(this.bufferField, byteCount);
            if (j == -1) {
                vg3.m201207a();
                return null;
            }
            byteCount -= j;
            emitCompleteSegments();
        }
        return this;
    }

    @Override // okio.BufferedSink
    public long writeAll(@NotNull Source source) throws IOException {
        source.getClass();
        long j = 0;
        while (true) {
            long j2 = source.read(this.bufferField, 8192L);
            if (j2 == -1) {
                return j;
            }
            j += j2;
            emitCompleteSegments();
        }
    }

    @Override // okio.BufferedSink
    @NotNull
    public BufferedSink writeByte(int b) {
        if (this.closed) {
            wtq0.m207906a("closed");
            return null;
        }
        this.bufferField.writeByte(b);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    @NotNull
    public BufferedSink writeDecimalLong(long v2) {
        if (this.closed) {
            wtq0.m207906a("closed");
            return null;
        }
        this.bufferField.writeDecimalLong(v2);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    @NotNull
    public BufferedSink writeHexadecimalUnsignedLong(long v2) {
        if (this.closed) {
            wtq0.m207906a("closed");
            return null;
        }
        this.bufferField.writeHexadecimalUnsignedLong(v2);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    @NotNull
    public BufferedSink writeInt(int i) {
        if (this.closed) {
            wtq0.m207906a("closed");
            return null;
        }
        this.bufferField.writeInt(i);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    @NotNull
    public BufferedSink writeIntLe(int i) {
        if (this.closed) {
            wtq0.m207906a("closed");
            return null;
        }
        this.bufferField.writeIntLe(i);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    @NotNull
    public BufferedSink writeLong(long v2) {
        if (this.closed) {
            wtq0.m207906a("closed");
            return null;
        }
        this.bufferField.writeLong(v2);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    @NotNull
    public BufferedSink writeLongLe(long v2) {
        if (this.closed) {
            wtq0.m207906a("closed");
            return null;
        }
        this.bufferField.writeLongLe(v2);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    @NotNull
    public BufferedSink writeShort(int s) {
        if (this.closed) {
            wtq0.m207906a("closed");
            return null;
        }
        this.bufferField.writeShort(s);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    @NotNull
    public BufferedSink writeShortLe(int s) {
        if (this.closed) {
            wtq0.m207906a("closed");
            return null;
        }
        this.bufferField.writeShortLe(s);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    @NotNull
    public BufferedSink writeString(@NotNull String string, @NotNull Charset charset) {
        string.getClass();
        charset.getClass();
        if (this.closed) {
            wtq0.m207906a("closed");
            return null;
        }
        this.bufferField.writeString(string, charset);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    @NotNull
    public BufferedSink writeUtf8(@NotNull String string) {
        string.getClass();
        if (this.closed) {
            wtq0.m207906a("closed");
            return null;
        }
        this.bufferField.writeUtf8(string);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    @NotNull
    public BufferedSink writeUtf8CodePoint(int codePoint) {
        if (this.closed) {
            wtq0.m207906a("closed");
            return null;
        }
        this.bufferField.writeUtf8CodePoint(codePoint);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    @NotNull
    public BufferedSink writeUtf8(@NotNull String string, int beginIndex, int endIndex) {
        string.getClass();
        if (!this.closed) {
            this.bufferField.writeUtf8(string, beginIndex, endIndex);
            return emitCompleteSegments();
        }
        wtq0.m207906a("closed");
        return null;
    }

    @Override // okio.BufferedSink
    @NotNull
    public BufferedSink writeString(@NotNull String string, int beginIndex, int endIndex, @NotNull Charset charset) {
        string.getClass();
        charset.getClass();
        if (!this.closed) {
            this.bufferField.writeString(string, beginIndex, endIndex, charset);
            return emitCompleteSegments();
        }
        wtq0.m207906a("closed");
        return null;
    }

    @Override // okio.BufferedSink
    @NotNull
    public BufferedSink write(@NotNull ByteString byteString) {
        byteString.getClass();
        if (!this.closed) {
            this.bufferField.write(byteString);
            return emitCompleteSegments();
        }
        wtq0.m207906a("closed");
        return null;
    }

    @Override // okio.BufferedSink
    @NotNull
    public BufferedSink write(@NotNull byte[] source) {
        source.getClass();
        if (!this.closed) {
            this.bufferField.write(source);
            return emitCompleteSegments();
        }
        wtq0.m207906a("closed");
        return null;
    }

    @Override // okio.BufferedSink
    @NotNull
    public BufferedSink write(@NotNull byte[] source, int offset, int byteCount) {
        source.getClass();
        if (!this.closed) {
            this.bufferField.write(source, offset, byteCount);
            return emitCompleteSegments();
        }
        wtq0.m207906a("closed");
        return null;
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(@NotNull ByteBuffer source) throws IOException {
        source.getClass();
        if (!this.closed) {
            int iWrite = this.bufferField.write(source);
            emitCompleteSegments();
            return iWrite;
        }
        wtq0.m207906a("closed");
        return 0;
    }

    @Override // okio.Sink
    public void write(@NotNull Buffer source, long byteCount) throws IOException {
        source.getClass();
        if (!this.closed) {
            this.bufferField.write(source, byteCount);
            emitCompleteSegments();
        } else {
            wtq0.m207906a("closed");
        }
    }
}
