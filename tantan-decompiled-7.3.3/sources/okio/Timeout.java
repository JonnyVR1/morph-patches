package okio;

import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.InlineMarker;
import org.eclipse.jetty.util.security.Constraint;
import org.jetbrains.annotations.NotNull;
import p153l.iq70;
import p153l.wtq0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88119bv = {1, 0, 2}, m88120d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\u0000H\u0016J\b\u0010\t\u001a\u00020\u0000H\u0016J\u0016\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rJ\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u001f\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00002\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0012H\u0086\bJ\b\u0010\u0013\u001a\u00020\u000fH\u0016J\u0018\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\u000e\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0001R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m88121d2 = {"Lokio/Timeout;", "", "()V", "deadlineNanoTime", "", "hasDeadline", "", "timeoutNanos", "clearDeadline", "clearTimeout", "deadline", BLiveOperationTitleShowType.duration, "unit", "Ljava/util/concurrent/TimeUnit;", "intersectWith", "", "other", "block", "Lkotlin/Function0;", "throwIfReached", "timeout", "waitUntilNotified", "monitor", "Companion", "jvm"}, m88122k = 1, m88123mv = {1, 1, 11})
public class Timeout {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    public static final Timeout NONE = new Timeout() { // from class: okio.Timeout$Companion$NONE$1
        @Override // okio.Timeout
        @NotNull
        public Timeout deadlineNanoTime(long deadlineNanoTime) {
            return this;
        }

        @Override // okio.Timeout
        public void throwIfReached() {
        }

        @Override // okio.Timeout
        @NotNull
        public Timeout timeout(long timeout, @NotNull TimeUnit unit) {
            unit.getClass();
            return this;
        }
    };
    private long deadlineNanoTime;
    private boolean hasDeadline;
    private long timeoutNanos;

    @NotNull
    public Timeout clearDeadline() {
        this.hasDeadline = false;
        return this;
    }

    @NotNull
    public Timeout clearTimeout() {
        this.timeoutNanos = 0L;
        return this;
    }

    @NotNull
    public final Timeout deadline(long duration, @NotNull TimeUnit unit) {
        unit.getClass();
        if (duration > 0) {
            return deadlineNanoTime(System.nanoTime() + unit.toNanos(duration));
        }
        iq70.m141659a("duration <= 0: ", duration);
        return null;
    }

    public long deadlineNanoTime() {
        if (this.hasDeadline) {
            return this.deadlineNanoTime;
        }
        wtq0.m207906a("No deadline");
        return 0L;
    }

    /* JADX INFO: renamed from: hasDeadline, reason: from getter */
    public boolean getHasDeadline() {
        return this.hasDeadline;
    }

    public final void intersectWith(@NotNull Timeout other, @NotNull Function0<Unit> block) {
        other.getClass();
        block.getClass();
        long timeoutNanos = getTimeoutNanos();
        long jMinTimeout = INSTANCE.minTimeout(other.getTimeoutNanos(), getTimeoutNanos());
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        timeout(jMinTimeout, timeUnit);
        if (!getHasDeadline()) {
            if (other.getHasDeadline()) {
                deadlineNanoTime(other.deadlineNanoTime());
            }
            try {
                block.invoke();
                return;
            } finally {
                InlineMarker.m88372b(1);
                timeout(timeoutNanos, timeUnit);
                if (other.getHasDeadline()) {
                    clearDeadline();
                }
                InlineMarker.m88371a(1);
            }
        }
        long jDeadlineNanoTime = deadlineNanoTime();
        if (other.getHasDeadline()) {
            deadlineNanoTime(Math.min(deadlineNanoTime(), other.deadlineNanoTime()));
        }
        try {
            block.invoke();
        } finally {
            InlineMarker.m88372b(1);
            timeout(timeoutNanos, timeUnit);
            if (other.getHasDeadline()) {
                deadlineNanoTime(jDeadlineNanoTime);
            }
            InlineMarker.m88371a(1);
        }
    }

    public void throwIfReached() throws IOException {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
        if (this.hasDeadline && this.deadlineNanoTime - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    @NotNull
    public Timeout timeout(long timeout, @NotNull TimeUnit unit) {
        unit.getClass();
        if (timeout >= 0) {
            this.timeoutNanos = unit.toNanos(timeout);
            return this;
        }
        iq70.m141659a("timeout < 0: ", timeout);
        return null;
    }

    /* JADX INFO: renamed from: timeoutNanos, reason: from getter */
    public long getTimeoutNanos() {
        return this.timeoutNanos;
    }

    public final void waitUntilNotified(@NotNull Object monitor) throws InterruptedIOException {
        monitor.getClass();
        try {
            boolean hasDeadline = getHasDeadline();
            long timeoutNanos = getTimeoutNanos();
            long jNanoTime = 0;
            if (!hasDeadline && timeoutNanos == 0) {
                monitor.wait();
                return;
            }
            long jNanoTime2 = System.nanoTime();
            if (hasDeadline && timeoutNanos != 0) {
                timeoutNanos = Math.min(timeoutNanos, deadlineNanoTime() - jNanoTime2);
            } else if (hasDeadline) {
                timeoutNanos = deadlineNanoTime() - jNanoTime2;
            }
            if (timeoutNanos > 0) {
                long j = timeoutNanos / 1000000;
                monitor.wait(j, (int) (timeoutNanos - (1000000 * j)));
                jNanoTime = System.nanoTime() - jNanoTime2;
            }
            if (jNanoTime >= timeoutNanos) {
                throw new InterruptedIOException("timeout");
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }

    @Metadata(m88119bv = {1, 0, 2}, m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m88121d2 = {"Lokio/Timeout$Companion;", "", "()V", Constraint.NONE, "Lokio/Timeout;", "minTimeout", "", "aNanos", "bNanos", "jvm"}, m88122k = 1, m88123mv = {1, 1, 11})
    public static final class Companion {
        private Companion() {
        }

        public final long minTimeout(long aNanos, long bNanos) {
            return (aNanos != 0 && (bNanos == 0 || aNanos < bNanos)) ? aNanos : bNanos;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @NotNull
    public Timeout deadlineNanoTime(long deadlineNanoTime) {
        this.hasDeadline = true;
        this.deadlineNanoTime = deadlineNanoTime;
        return this;
    }
}
