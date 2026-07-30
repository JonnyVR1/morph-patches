package okio;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.ci70;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87230bv = {1, 0, 2}, m87231d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0011\u001a\u00020\nJ\r\u0010\u0011\u001a\u00020\nH\u0007¢\u0006\u0002\b J\r\u0010\u0018\u001a\u00020\u0019H\u0007¢\u0006\u0002\b!J&\u0010\"\u001a\u00020\u001f*\u00020\n2\u0017\u0010#\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001f0$¢\u0006\u0002\b%H\u0082\bR\u0014\u0010\u0005\u001a\u00020\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0011\u001a\u00020\n8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u001a\u0010\u0012\u001a\u00020\u0013X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0018\u001a\u00020\u00198\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u0013X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017¨\u0006&"}, m87232d2 = {"Lokio/Pipe;", "", "maxBufferSize", "", "(J)V", "buffer", "Lokio/Buffer;", "getBuffer$jvm", "()Lokio/Buffer;", "foldedSink", "Lokio/Sink;", "getFoldedSink$jvm", "()Lokio/Sink;", "setFoldedSink$jvm", "(Lokio/Sink;)V", "getMaxBufferSize$jvm", "()J", "sink", "sinkClosed", "", "getSinkClosed$jvm", "()Z", "setSinkClosed$jvm", "(Z)V", "source", "Lokio/Source;", "()Lokio/Source;", "sourceClosed", "getSourceClosed$jvm", "setSourceClosed$jvm", "fold", "", "-deprecated_sink", "-deprecated_source", "forward", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "jvm"}, m87233k = 1, m87234mv = {1, 1, 11})
public final class Pipe {

    @NotNull
    private final Buffer buffer = new Buffer();

    @Nullable
    private Sink foldedSink;
    private final long maxBufferSize;

    @NotNull
    private final Sink sink;
    private boolean sinkClosed;

    @NotNull
    private final Source source;
    private boolean sourceClosed;

    public Pipe(long j) {
        this.maxBufferSize = j;
        if (j < 1) {
            ci70.m107054a("maxBufferSize < 1: ", j);
            throw null;
        }
        this.sink = new Sink() { // from class: okio.Pipe.sink.1
            private final Timeout timeout = new Timeout();

            @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                boolean hasDeadline;
                synchronized (Pipe.this.getBuffer()) {
                    try {
                        if (Pipe.this.getSinkClosed()) {
                            return;
                        }
                        Sink foldedSink = Pipe.this.getFoldedSink();
                        if (foldedSink == null) {
                            if (Pipe.this.getSourceClosed() && Pipe.this.getBuffer().size() > 0) {
                                throw new IOException("source is closed");
                            }
                            Pipe.this.setSinkClosed$jvm(true);
                            Buffer buffer = Pipe.this.getBuffer();
                            if (buffer == null) {
                                throw new TypeCastException("null cannot be cast to non-null type java.lang.Object");
                            }
                            buffer.notifyAll();
                            foldedSink = null;
                        }
                        Unit unit = Unit.INSTANCE;
                        if (foldedSink != null) {
                            Pipe pipe = Pipe.this;
                            Timeout timeout = foldedSink.getTimeout();
                            Timeout timeout2 = pipe.sink().getTimeout();
                            long timeoutNanos = timeout.getTimeoutNanos();
                            timeout.timeout(Timeout.INSTANCE.minTimeout(timeout2.getTimeoutNanos(), timeout.getTimeoutNanos()), TimeUnit.NANOSECONDS);
                            if (!timeout.getHasDeadline()) {
                                if (timeout2.getHasDeadline()) {
                                    timeout.deadlineNanoTime(timeout2.deadlineNanoTime());
                                }
                                try {
                                    foldedSink.close();
                                    if (hasDeadline) {
                                        return;
                                    } else {
                                        return;
                                    }
                                } finally {
                                    timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                                    if (timeout2.getHasDeadline()) {
                                        timeout.clearDeadline();
                                    }
                                }
                            }
                            long jDeadlineNanoTime = timeout.deadlineNanoTime();
                            if (timeout2.getHasDeadline()) {
                                timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), timeout2.deadlineNanoTime()));
                            }
                            try {
                                foldedSink.close();
                            } finally {
                                timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                                if (timeout2.getHasDeadline()) {
                                    timeout.deadlineNanoTime(jDeadlineNanoTime);
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }

            @Override // okio.Sink, java.io.Flushable
            public void flush() {
                Sink foldedSink;
                boolean hasDeadline;
                synchronized (Pipe.this.getBuffer()) {
                    try {
                        if (Pipe.this.getSinkClosed()) {
                            throw new IllegalStateException("closed");
                        }
                        foldedSink = Pipe.this.getFoldedSink();
                        if (foldedSink == null) {
                            if (Pipe.this.getSourceClosed() && Pipe.this.getBuffer().size() > 0) {
                                throw new IOException("source is closed");
                            }
                            foldedSink = null;
                        }
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (foldedSink != null) {
                    Pipe pipe = Pipe.this;
                    Timeout timeout = foldedSink.getTimeout();
                    Timeout timeout2 = pipe.sink().getTimeout();
                    long timeoutNanos = timeout.getTimeoutNanos();
                    timeout.timeout(Timeout.INSTANCE.minTimeout(timeout2.getTimeoutNanos(), timeout.getTimeoutNanos()), TimeUnit.NANOSECONDS);
                    if (!timeout.getHasDeadline()) {
                        if (timeout2.getHasDeadline()) {
                            timeout.deadlineNanoTime(timeout2.deadlineNanoTime());
                        }
                        try {
                            foldedSink.flush();
                            if (hasDeadline) {
                                return;
                            } else {
                                return;
                            }
                        } finally {
                            timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                            if (timeout2.getHasDeadline()) {
                                timeout.clearDeadline();
                            }
                        }
                    }
                    long jDeadlineNanoTime = timeout.deadlineNanoTime();
                    if (timeout2.getHasDeadline()) {
                        timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), timeout2.deadlineNanoTime()));
                    }
                    try {
                        foldedSink.flush();
                    } finally {
                        timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                        if (timeout2.getHasDeadline()) {
                            timeout.deadlineNanoTime(jDeadlineNanoTime);
                        }
                    }
                }
            }

            @Override // okio.Sink
            @NotNull
            /* JADX INFO: renamed from: timeout, reason: from getter */
            public Timeout getTimeout() {
                return this.timeout;
            }

            @Override // okio.Sink
            public void write(@NotNull Buffer source, long byteCount) {
                Sink foldedSink;
                boolean hasDeadline;
                source.getClass();
                synchronized (Pipe.this.getBuffer()) {
                    try {
                        if (Pipe.this.getSinkClosed()) {
                            throw new IllegalStateException("closed");
                        }
                        while (true) {
                            if (byteCount <= 0) {
                                foldedSink = null;
                                break;
                            }
                            foldedSink = Pipe.this.getFoldedSink();
                            if (foldedSink != null) {
                                break;
                            }
                            if (Pipe.this.getSourceClosed()) {
                                throw new IOException("source is closed");
                            }
                            long maxBufferSize = Pipe.this.getMaxBufferSize() - Pipe.this.getBuffer().size();
                            if (maxBufferSize == 0) {
                                this.timeout.waitUntilNotified(Pipe.this.getBuffer());
                            } else {
                                long jMin = Math.min(maxBufferSize, byteCount);
                                Pipe.this.getBuffer().write(source, jMin);
                                byteCount -= jMin;
                                Buffer buffer = Pipe.this.getBuffer();
                                if (buffer == null) {
                                    throw new TypeCastException("null cannot be cast to non-null type java.lang.Object");
                                }
                                buffer.notifyAll();
                            }
                        }
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (foldedSink != null) {
                    Pipe pipe = Pipe.this;
                    Timeout timeout = foldedSink.getTimeout();
                    Timeout timeout2 = pipe.sink().getTimeout();
                    long timeoutNanos = timeout.getTimeoutNanos();
                    timeout.timeout(Timeout.INSTANCE.minTimeout(timeout2.getTimeoutNanos(), timeout.getTimeoutNanos()), TimeUnit.NANOSECONDS);
                    if (!timeout.getHasDeadline()) {
                        if (timeout2.getHasDeadline()) {
                            timeout.deadlineNanoTime(timeout2.deadlineNanoTime());
                        }
                        try {
                            foldedSink.write(source, byteCount);
                            if (hasDeadline) {
                                return;
                            } else {
                                return;
                            }
                        } finally {
                            timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                            if (timeout2.getHasDeadline()) {
                                timeout.clearDeadline();
                            }
                        }
                    }
                    long jDeadlineNanoTime = timeout.deadlineNanoTime();
                    if (timeout2.getHasDeadline()) {
                        timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), timeout2.deadlineNanoTime()));
                    }
                    try {
                        foldedSink.write(source, byteCount);
                    } finally {
                        timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                        if (timeout2.getHasDeadline()) {
                            timeout.deadlineNanoTime(jDeadlineNanoTime);
                        }
                    }
                }
            }
        };
        this.source = new Source() { // from class: okio.Pipe.source.1
            private final Timeout timeout = new Timeout();

            @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                synchronized (Pipe.this.getBuffer()) {
                    Pipe.this.setSourceClosed$jvm(true);
                    Buffer buffer = Pipe.this.getBuffer();
                    if (buffer == null) {
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.Object");
                    }
                    buffer.notifyAll();
                    Unit unit = Unit.INSTANCE;
                }
            }

            @Override // okio.Source
            public long read(@NotNull Buffer sink, long byteCount) {
                sink.getClass();
                synchronized (Pipe.this.getBuffer()) {
                    try {
                        if (Pipe.this.getSourceClosed()) {
                            throw new IllegalStateException("closed");
                        }
                        while (true) {
                            long size = Pipe.this.getBuffer().size();
                            Pipe pipe = Pipe.this;
                            if (size != 0) {
                                long j2 = pipe.getBuffer().read(sink, byteCount);
                                Buffer buffer = Pipe.this.getBuffer();
                                if (buffer == null) {
                                    throw new TypeCastException("null cannot be cast to non-null type java.lang.Object");
                                }
                                buffer.notifyAll();
                                return j2;
                            }
                            if (pipe.getSinkClosed()) {
                                return -1L;
                            }
                            this.timeout.waitUntilNotified(Pipe.this.getBuffer());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }

            @Override // okio.Source
            @NotNull
            /* JADX INFO: renamed from: timeout, reason: from getter */
            public Timeout getTimeout() {
                return this.timeout;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void forward(@NotNull Sink sink, Function1<? super Sink, Unit> function1) {
        Timeout timeout = sink.getTimeout();
        Timeout timeout2 = sink().getTimeout();
        long timeoutNanos = timeout.getTimeoutNanos();
        long jMinTimeout = Timeout.INSTANCE.minTimeout(timeout2.getTimeoutNanos(), timeout.getTimeoutNanos());
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        timeout.timeout(jMinTimeout, timeUnit);
        if (!timeout.getHasDeadline()) {
            if (timeout2.getHasDeadline()) {
                timeout.deadlineNanoTime(timeout2.deadlineNanoTime());
            }
            try {
                function1.invoke(sink);
                return;
            } finally {
                InlineMarker.m87483b(1);
                timeout.timeout(timeoutNanos, timeUnit);
                if (timeout2.getHasDeadline()) {
                    timeout.clearDeadline();
                }
                InlineMarker.m87482a(1);
            }
        }
        long jDeadlineNanoTime = timeout.deadlineNanoTime();
        if (timeout2.getHasDeadline()) {
            timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), timeout2.deadlineNanoTime()));
        }
        try {
            function1.invoke(sink);
        } finally {
            InlineMarker.m87483b(1);
            timeout.timeout(timeoutNanos, timeUnit);
            if (timeout2.getHasDeadline()) {
                timeout.deadlineNanoTime(jDeadlineNanoTime);
            }
            InlineMarker.m87482a(1);
        }
    }

    @Deprecated
    @JvmName
    @NotNull
    /* JADX INFO: renamed from: -deprecated_sink, reason: not valid java name and from getter */
    public final Sink getSink() {
        return this.sink;
    }

    @Deprecated
    @JvmName
    @NotNull
    /* JADX INFO: renamed from: -deprecated_source, reason: not valid java name and from getter */
    public final Source getSource() {
        return this.source;
    }

    public final void fold(@NotNull Sink sink) throws IOException {
        boolean z;
        Buffer buffer;
        sink.getClass();
        while (true) {
            synchronized (this.buffer) {
                if (this.foldedSink != null) {
                    throw new IllegalStateException("sink already folded");
                }
                if (this.buffer.exhausted()) {
                    this.sourceClosed = true;
                    this.foldedSink = sink;
                    return;
                }
                z = this.sinkClosed;
                buffer = new Buffer();
                Buffer buffer2 = this.buffer;
                buffer.write(buffer2, buffer2.size());
                Buffer buffer3 = this.buffer;
                if (buffer3 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.Object");
                }
                buffer3.notifyAll();
                Unit unit = Unit.INSTANCE;
            }
            try {
                sink.write(buffer, buffer.size());
                if (z) {
                    sink.close();
                } else {
                    sink.flush();
                }
            } catch (Throwable th) {
                synchronized (this.buffer) {
                    try {
                        this.sourceClosed = true;
                        Buffer buffer4 = this.buffer;
                        if (buffer4 == null) {
                            throw new TypeCastException("null cannot be cast to non-null type java.lang.Object");
                        }
                        buffer4.notifyAll();
                        Unit unit2 = Unit.INSTANCE;
                        throw th;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: getBuffer$jvm, reason: from getter */
    public final Buffer getBuffer() {
        return this.buffer;
    }

    @Nullable
    /* JADX INFO: renamed from: getFoldedSink$jvm, reason: from getter */
    public final Sink getFoldedSink() {
        return this.foldedSink;
    }

    /* JADX INFO: renamed from: getMaxBufferSize$jvm, reason: from getter */
    public final long getMaxBufferSize() {
        return this.maxBufferSize;
    }

    /* JADX INFO: renamed from: getSinkClosed$jvm, reason: from getter */
    public final boolean getSinkClosed() {
        return this.sinkClosed;
    }

    /* JADX INFO: renamed from: getSourceClosed$jvm, reason: from getter */
    public final boolean getSourceClosed() {
        return this.sourceClosed;
    }

    public final void setFoldedSink$jvm(@Nullable Sink sink) {
        this.foldedSink = sink;
    }

    public final void setSinkClosed$jvm(boolean z) {
        this.sinkClosed = z;
    }

    public final void setSourceClosed$jvm(boolean z) {
        this.sourceClosed = z;
    }

    @JvmName
    @NotNull
    public final Sink sink() {
        return this.sink;
    }

    @JvmName
    @NotNull
    public final Source source() {
        return this.source;
    }
}
