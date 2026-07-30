package kotlinx.coroutines;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.C15274a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.AbstractC16728e8;
import p153l.C16923f8;
import p153l.vxi0;
import p153l.w4f;
import p153l.z5e;

/* JADX INFO: renamed from: kotlinx.coroutines.g */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0002j\u0002`\u0003H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0005J+\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\n2\n\u0010\u0012\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0005J\u000f\u0010\u0019\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0019\u0010\u0005J\u000f\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0007H\u0002¢\u0006\u0004\b \u0010\u0005R\u0014\u0010#\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001e\u0010$\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b$\u0010%\u0012\u0004\b&\u0010\u0005R\u0016\u0010(\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020\u001a8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u001cR\u0014\u0010-\u001a\u00020\u001d8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\u001fR\u0014\u0010/\u001a\u00020\u001d8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\u001f¨\u00060"}, m88121d2 = {"Lkotlinx/coroutines/g;", "Lkotlinx/coroutines/k;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "<init>", "()V", "task", "", "t0", "(Ljava/lang/Runnable;)V", "", "now", "Lkotlinx/coroutines/k$c;", "delayedTask", "o0", "(JLkotlinx/coroutines/k$c;)V", "shutdown", "timeMillis", "block", "Lkotlin/coroutines/CoroutineContext;", "context", "Ll/z5e;", "invokeOnTimeout", "(JLjava/lang/Runnable;Lkotlin/coroutines/CoroutineContext;)Ll/z5e;", "run", "L0", "Ljava/lang/Thread;", "H0", "()Ljava/lang/Thread;", "", "K0", "()Z", "G0", "g", "J", "KEEP_ALIVE_NANOS", "_thread", "Ljava/lang/Thread;", "get_thread$annotations", "", "debugStatus", "I", "n0", "thread", "I0", "isShutDown", "J0", "isShutdownRequested", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
@SourceDebugExtension
public final class RunnableC15583g extends AbstractC15589k implements Runnable {

    @NotNull
    public static final RunnableC15583g INSTANCE;

    @Nullable
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public static final long KEEP_ALIVE_NANOS;

    static {
        Long l2;
        RunnableC15583g runnableC15583g = new RunnableC15583g();
        INSTANCE = runnableC15583g;
        w4f.m204874h0(runnableC15583g, false, 1, null);
        try {
            l2 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l2 = 1000L;
        }
        KEEP_ALIVE_NANOS = TimeUnit.MILLISECONDS.toNanos(l2.longValue());
    }

    /* JADX INFO: renamed from: G0 */
    public final synchronized void m95070G0() {
        if (m95073J0()) {
            debugStatus = 3;
            m95117A0();
            notifyAll();
        }
    }

    /* JADX INFO: renamed from: H0 */
    public final synchronized Thread m95071H0() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setContextClassLoader(RunnableC15583g.class.getClassLoader());
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    /* JADX INFO: renamed from: I0 */
    public final boolean m95072I0() {
        return debugStatus == 4;
    }

    /* JADX INFO: renamed from: J0 */
    public final boolean m95073J0() {
        int i = debugStatus;
        return i == 2 || i == 3;
    }

    /* JADX INFO: renamed from: K0 */
    public final synchronized boolean m95074K0() {
        if (m95073J0()) {
            return false;
        }
        debugStatus = 1;
        notifyAll();
        return true;
    }

    /* JADX INFO: renamed from: L0 */
    public final void m95075L0() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // kotlinx.coroutines.AbstractC15589k, kotlinx.coroutines.InterfaceC15584h
    @NotNull
    public z5e invokeOnTimeout(long timeMillis, @NotNull Runnable block, @NotNull CoroutineContext context) {
        return m95120D0(timeMillis, block);
    }

    @Override // kotlinx.coroutines.AbstractC15590l
    @NotNull
    /* JADX INFO: renamed from: n0 */
    public Thread getThread() {
        Thread thread = _thread;
        return thread == null ? m95071H0() : thread;
    }

    @Override // kotlinx.coroutines.AbstractC15590l
    /* JADX INFO: renamed from: o0 */
    public void mo95077o0(long now, @NotNull AbstractC15589k.c delayedTask) {
        m95075L0();
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zM95128y0;
        Unit unit;
        vxi0.INSTANCE.m203847d(this);
        AbstractC16728e8 abstractC16728e8 = C16923f8.f97691a;
        if (abstractC16728e8 != null) {
            abstractC16728e8.m119783c();
        }
        try {
            if (!m95074K0()) {
                if (zM95128y0) {
                    return;
                } else {
                    return;
                }
            }
            long j = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long jMo95124k0 = mo95124k0();
                if (jMo95124k0 == Long.MAX_VALUE) {
                    AbstractC16728e8 abstractC16728e9 = C16923f8.f97691a;
                    long jM119781a = abstractC16728e9 != null ? abstractC16728e9.m119781a() : System.nanoTime();
                    if (j == Long.MAX_VALUE) {
                        j = KEEP_ALIVE_NANOS + jM119781a;
                    }
                    long j2 = j - jM119781a;
                    if (j2 <= 0) {
                        if (zM95128y0) {
                            return;
                        } else {
                            return;
                        }
                    }
                    jMo95124k0 = C15274a.m88490f(jMo95124k0, j2);
                } else {
                    j = Long.MAX_VALUE;
                }
                if (jMo95124k0 > 0) {
                    if (m95073J0()) {
                        if (zM95128y0) {
                            return;
                        } else {
                            return;
                        }
                    }
                    AbstractC16728e8 abstractC16728e10 = C16923f8.f97691a;
                    if (abstractC16728e10 != null) {
                        abstractC16728e10.m119782b(this, jMo95124k0);
                        unit = Unit.INSTANCE;
                    } else {
                        unit = null;
                    }
                    if (unit == null) {
                        LockSupport.parkNanos(this, jMo95124k0);
                    }
                }
            }
        } finally {
            _thread = null;
            m95070G0();
            AbstractC16728e8 abstractC16728e11 = C16923f8.f97691a;
            if (abstractC16728e11 != null) {
                abstractC16728e11.m119787g();
            }
            if (!m95128y0()) {
                getThread();
            }
        }
    }

    @Override // kotlinx.coroutines.AbstractC15589k, p153l.w4f
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // kotlinx.coroutines.AbstractC15589k
    /* JADX INFO: renamed from: t0 */
    public void mo95078t0(@NotNull Runnable task) {
        if (m95072I0()) {
            m95075L0();
        }
        super.mo95078t0(task);
    }
}
