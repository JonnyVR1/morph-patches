package okio;

import com.clevertap.android.sdk.Constants;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.wtq0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88119bv = {1, 0, 2}, m88120d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 \u00172\u00020\u0001:\u0002\u0017\u0018B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\n\u001a\u00020\u0004J\u0015\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0002\b\rJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\rJ\u0012\u0010\u000f\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014J\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007H\u0002J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0015J\b\u0010\u0016\u001a\u00020\tH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m88121d2 = {"Lokio/AsyncTimeout;", "Lokio/Timeout;", "()V", "inQueue", "", "next", "timeoutAt", "", "enter", "", "exit", "Ljava/io/IOException;", "cause", "exit$jvm", "throwOnTimeout", "newTimeoutException", "remainingNanos", "now", "sink", "Lokio/Sink;", "source", "Lokio/Source;", "timedOut", "Companion", "Watchdog", "jvm"}, m88122k = 1, m88123mv = {1, 1, 11})
public class AsyncTimeout extends Timeout {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long IDLE_TIMEOUT_MILLIS = Constants.ONE_MIN_IN_MILLIS;
    private static final long IDLE_TIMEOUT_NANOS = TimeUnit.MILLISECONDS.toNanos(Constants.ONE_MIN_IN_MILLIS);
    private static final int TIMEOUT_WRITE_SIZE = 65536;
    private static AsyncTimeout head;
    private boolean inQueue;
    private AsyncTimeout next;
    private long timeoutAt;

    @Metadata(m88119bv = {1, 0, 2}, m88120d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0000¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, m88121d2 = {"Lokio/AsyncTimeout$Watchdog;", "Ljava/lang/Thread;", "()V", "run", "", "jvm"}, m88122k = 1, m88123mv = {1, 1, 11})
    public static final class Watchdog extends Thread {
        public Watchdog() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            AsyncTimeout asyncTimeoutAwaitTimeout$jvm;
            while (true) {
                try {
                    synchronized (AsyncTimeout.class) {
                        asyncTimeoutAwaitTimeout$jvm = AsyncTimeout.INSTANCE.awaitTimeout$jvm();
                        if (asyncTimeoutAwaitTimeout$jvm == AsyncTimeout.head) {
                            AsyncTimeout.head = null;
                            return;
                        }
                        Unit unit = Unit.INSTANCE;
                    }
                    if (asyncTimeoutAwaitTimeout$jvm != null) {
                        asyncTimeoutAwaitTimeout$jvm.timedOut();
                    }
                } catch (InterruptedException unused) {
                    continue;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long remainingNanos(long now) {
        return this.timeoutAt - now;
    }

    public final void enter() {
        if (this.inQueue) {
            wtq0.m207906a("Unbalanced enter/exit");
            return;
        }
        long timeoutNanos = getTimeoutNanos();
        boolean hasDeadline = getHasDeadline();
        if (timeoutNanos != 0 || hasDeadline) {
            this.inQueue = true;
            INSTANCE.scheduleTimeout(this, timeoutNanos, hasDeadline);
        }
    }

    public final boolean exit() {
        if (!this.inQueue) {
            return false;
        }
        this.inQueue = false;
        return INSTANCE.cancelScheduledTimeout(this);
    }

    public final void exit$jvm(boolean throwOnTimeout) throws IOException {
        if (exit() && throwOnTimeout) {
            throw newTimeoutException(null);
        }
    }

    @NotNull
    public IOException newTimeoutException(@Nullable IOException cause) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (cause != null) {
            interruptedIOException.initCause(cause);
        }
        return interruptedIOException;
    }

    @NotNull
    public final Sink sink(@NotNull final Sink sink) {
        sink.getClass();
        return new Sink() { // from class: okio.AsyncTimeout.sink.1
            @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                AsyncTimeout.this.enter();
                try {
                    try {
                        sink.close();
                        AsyncTimeout.this.exit$jvm(true);
                    } catch (IOException e) {
                        throw AsyncTimeout.this.exit$jvm(e);
                    }
                } catch (Throwable th) {
                    AsyncTimeout.this.exit$jvm(false);
                    throw th;
                }
            }

            @Override // okio.Sink, java.io.Flushable
            public void flush() throws IOException {
                AsyncTimeout.this.enter();
                try {
                    try {
                        sink.flush();
                        AsyncTimeout.this.exit$jvm(true);
                    } catch (IOException e) {
                        throw AsyncTimeout.this.exit$jvm(e);
                    }
                } catch (Throwable th) {
                    AsyncTimeout.this.exit$jvm(false);
                    throw th;
                }
            }

            @NotNull
            public String toString() {
                return "AsyncTimeout.sink(" + sink + ')';
            }

            @Override // okio.Sink
            public void write(@NotNull Buffer source, long byteCount) throws IOException {
                source.getClass();
                Util.checkOffsetAndCount(source.size(), 0L, byteCount);
                while (true) {
                    long j = 0;
                    if (byteCount <= 0) {
                        return;
                    }
                    Segment segment = source.head;
                    if (segment == null) {
                        Intrinsics.m88386m();
                    }
                    while (j < 65536) {
                        j += (long) (segment.limit - segment.pos);
                        if (j >= byteCount) {
                            j = byteCount;
                            break;
                        } else {
                            segment = segment.next;
                            if (segment == null) {
                                Intrinsics.m88386m();
                            }
                        }
                    }
                    AsyncTimeout.this.enter();
                    try {
                        try {
                            sink.write(source, j);
                            byteCount -= j;
                            AsyncTimeout.this.exit$jvm(true);
                        } catch (IOException e) {
                            throw AsyncTimeout.this.exit$jvm(e);
                        }
                    } catch (Throwable th) {
                        AsyncTimeout.this.exit$jvm(false);
                        throw th;
                    }
                }
            }

            @Override // okio.Sink
            @NotNull
            /* JADX INFO: renamed from: timeout, reason: from getter */
            public AsyncTimeout getTimeout() {
                return AsyncTimeout.this;
            }
        };
    }

    @NotNull
    public final Source source(@NotNull final Source source) {
        source.getClass();
        return new Source() { // from class: okio.AsyncTimeout.source.1
            @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                AsyncTimeout.this.enter();
                try {
                    try {
                        source.close();
                        AsyncTimeout.this.exit$jvm(true);
                    } catch (IOException e) {
                        throw AsyncTimeout.this.exit$jvm(e);
                    }
                } catch (Throwable th) {
                    AsyncTimeout.this.exit$jvm(false);
                    throw th;
                }
            }

            @Override // okio.Source
            public long read(@NotNull Buffer sink, long byteCount) throws IOException {
                sink.getClass();
                AsyncTimeout.this.enter();
                try {
                    try {
                        long j = source.read(sink, byteCount);
                        AsyncTimeout.this.exit$jvm(true);
                        return j;
                    } catch (IOException e) {
                        throw AsyncTimeout.this.exit$jvm(e);
                    }
                } catch (Throwable th) {
                    AsyncTimeout.this.exit$jvm(false);
                    throw th;
                }
            }

            @NotNull
            public String toString() {
                return "AsyncTimeout.source(" + source + ')';
            }

            @Override // okio.Source
            @NotNull
            /* JADX INFO: renamed from: timeout, reason: from getter */
            public AsyncTimeout getTimeout() {
                return AsyncTimeout.this;
            }
        };
    }

    public void timedOut() {
    }

    @Metadata(m88119bv = {1, 0, 2}, m88120d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\n\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0002\b\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tH\u0002J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\rH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m88121d2 = {"Lokio/AsyncTimeout$Companion;", "", "()V", "IDLE_TIMEOUT_MILLIS", "", "IDLE_TIMEOUT_NANOS", "TIMEOUT_WRITE_SIZE", "", "head", "Lokio/AsyncTimeout;", "awaitTimeout", "awaitTimeout$jvm", "cancelScheduledTimeout", "", "node", "scheduleTimeout", "", "timeoutNanos", "hasDeadline", "jvm"}, m88122k = 1, m88123mv = {1, 1, 11})
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean cancelScheduledTimeout(AsyncTimeout node) {
            synchronized (AsyncTimeout.class) {
                for (AsyncTimeout asyncTimeout = AsyncTimeout.head; asyncTimeout != null; asyncTimeout = asyncTimeout.next) {
                    if (asyncTimeout.next == node) {
                        asyncTimeout.next = node.next;
                        node.next = null;
                        return false;
                    }
                }
                return true;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void scheduleTimeout(AsyncTimeout node, long timeoutNanos, boolean hasDeadline) {
            synchronized (AsyncTimeout.class) {
                try {
                    if (AsyncTimeout.head == null) {
                        AsyncTimeout.head = new AsyncTimeout();
                        new Watchdog().start();
                    }
                    long jNanoTime = System.nanoTime();
                    if (timeoutNanos != 0 && hasDeadline) {
                        node.timeoutAt = Math.min(timeoutNanos, node.deadlineNanoTime() - jNanoTime) + jNanoTime;
                    } else if (timeoutNanos != 0) {
                        node.timeoutAt = timeoutNanos + jNanoTime;
                    } else {
                        if (!hasDeadline) {
                            throw new AssertionError();
                        }
                        node.timeoutAt = node.deadlineNanoTime();
                    }
                    long jRemainingNanos = node.remainingNanos(jNanoTime);
                    AsyncTimeout asyncTimeout = AsyncTimeout.head;
                    if (asyncTimeout == null) {
                        Intrinsics.m88386m();
                    }
                    while (asyncTimeout.next != null) {
                        AsyncTimeout asyncTimeout2 = asyncTimeout.next;
                        if (asyncTimeout2 == null) {
                            Intrinsics.m88386m();
                        }
                        if (jRemainingNanos < asyncTimeout2.remainingNanos(jNanoTime)) {
                            break;
                        }
                        asyncTimeout = asyncTimeout.next;
                        if (asyncTimeout == null) {
                            Intrinsics.m88386m();
                        }
                    }
                    node.next = asyncTimeout.next;
                    asyncTimeout.next = node;
                    if (asyncTimeout == AsyncTimeout.head) {
                        AsyncTimeout.class.notify();
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Nullable
        public final AsyncTimeout awaitTimeout$jvm() throws InterruptedException {
            AsyncTimeout asyncTimeout = AsyncTimeout.head;
            if (asyncTimeout == null) {
                Intrinsics.m88386m();
            }
            AsyncTimeout asyncTimeout2 = asyncTimeout.next;
            if (asyncTimeout2 == null) {
                long jNanoTime = System.nanoTime();
                AsyncTimeout.class.wait(AsyncTimeout.IDLE_TIMEOUT_MILLIS);
                AsyncTimeout asyncTimeout3 = AsyncTimeout.head;
                if (asyncTimeout3 == null) {
                    Intrinsics.m88386m();
                }
                if (asyncTimeout3.next != null || System.nanoTime() - jNanoTime < AsyncTimeout.IDLE_TIMEOUT_NANOS) {
                    return null;
                }
                return AsyncTimeout.head;
            }
            long jRemainingNanos = asyncTimeout2.remainingNanos(System.nanoTime());
            if (jRemainingNanos > 0) {
                long j = jRemainingNanos / 1000000;
                AsyncTimeout.class.wait(j, (int) (jRemainingNanos - (1000000 * j)));
                return null;
            }
            AsyncTimeout asyncTimeout4 = AsyncTimeout.head;
            if (asyncTimeout4 == null) {
                Intrinsics.m88386m();
            }
            asyncTimeout4.next = asyncTimeout2.next;
            asyncTimeout2.next = null;
            return asyncTimeout2;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @NotNull
    public final IOException exit$jvm(@NotNull IOException cause) {
        cause.getClass();
        return !exit() ? cause : newTimeoutException(cause);
    }
}
