package okio;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88119bv = {1, 0, 2}, m88120d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0001H\u0016J\b\u0010\u0007\u001a\u00020\u0001H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\b\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001J\b\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\tH\u0016R\u001c\u0010\u0002\u001a\u00020\u00018\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0004\"\u0004\b\u0005\u0010\u0003¨\u0006\u0012"}, m88121d2 = {"Lokio/ForwardingTimeout;", "Lokio/Timeout;", "delegate", "(Lokio/Timeout;)V", "()Lokio/Timeout;", "setDelegate", "clearDeadline", "clearTimeout", "deadlineNanoTime", "", "hasDeadline", "", "throwIfReached", "", "timeout", "unit", "Ljava/util/concurrent/TimeUnit;", "timeoutNanos", "jvm"}, m88122k = 1, m88123mv = {1, 1, 11})
public class ForwardingTimeout extends Timeout {

    @NotNull
    private Timeout delegate;

    public ForwardingTimeout(@NotNull Timeout timeout) {
        timeout.getClass();
        this.delegate = timeout;
    }

    @Override // okio.Timeout
    @NotNull
    public Timeout clearDeadline() {
        return this.delegate.clearDeadline();
    }

    @Override // okio.Timeout
    @NotNull
    public Timeout clearTimeout() {
        return this.delegate.clearTimeout();
    }

    @Override // okio.Timeout
    public long deadlineNanoTime() {
        return this.delegate.deadlineNanoTime();
    }

    @JvmName
    @NotNull
    /* JADX INFO: renamed from: delegate, reason: from getter */
    public final Timeout getDelegate() {
        return this.delegate;
    }

    @Override // okio.Timeout
    /* JADX INFO: renamed from: hasDeadline */
    public boolean getHasDeadline() {
        return this.delegate.getHasDeadline();
    }

    /* JADX INFO: renamed from: setDelegate, reason: collision with other method in class */
    public final /* synthetic */ void m225929setDelegate(@NotNull Timeout timeout) {
        timeout.getClass();
        this.delegate = timeout;
    }

    @Override // okio.Timeout
    public void throwIfReached() throws IOException {
        this.delegate.throwIfReached();
    }

    @Override // okio.Timeout
    @NotNull
    public Timeout timeout(long timeout, @NotNull TimeUnit unit) {
        unit.getClass();
        return this.delegate.timeout(timeout, unit);
    }

    @Override // okio.Timeout
    /* JADX INFO: renamed from: timeoutNanos */
    public long getTimeoutNanos() {
        return this.delegate.getTimeoutNanos();
    }

    @NotNull
    public final ForwardingTimeout setDelegate(@NotNull Timeout delegate) {
        delegate.getClass();
        this.delegate = delegate;
        return this;
    }

    @Override // okio.Timeout
    @NotNull
    public Timeout deadlineNanoTime(long deadlineNanoTime) {
        return this.delegate.deadlineNanoTime(deadlineNanoTime);
    }
}
