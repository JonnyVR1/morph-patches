package kotlinx.coroutines;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.C15167a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.AbstractC17712j8;
import p149l.C17950k8;
import p149l.l4e;
import p149l.s3f;
import p149l.toi0;

/* JADX INFO: renamed from: kotlinx.coroutines.g */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0002j\u0002`\u0003H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0005J+\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\n2\n\u0010\u0012\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0005J\u000f\u0010\u0019\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0019\u0010\u0005J\u000f\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0007H\u0002¢\u0006\u0004\b \u0010\u0005R\u0014\u0010#\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001e\u0010$\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b$\u0010%\u0012\u0004\b&\u0010\u0005R\u0016\u0010(\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020\u001a8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u001cR\u0014\u0010-\u001a\u00020\u001d8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\u001fR\u0014\u0010/\u001a\u00020\u001d8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\u001f¨\u00060"}, m87232d2 = {"Lkotlinx/coroutines/g;", "Lkotlinx/coroutines/k;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "<init>", "()V", "task", "", "s0", "(Ljava/lang/Runnable;)V", "", "now", "Lkotlinx/coroutines/k$c;", "delayedTask", "n0", "(JLkotlinx/coroutines/k$c;)V", "shutdown", "timeMillis", "block", "Lkotlin/coroutines/CoroutineContext;", "context", "Ll/l4e;", "invokeOnTimeout", "(JLjava/lang/Runnable;Lkotlin/coroutines/CoroutineContext;)Ll/l4e;", "run", "K0", "Ljava/lang/Thread;", "G0", "()Ljava/lang/Thread;", "", "J0", "()Z", "F0", "g", "J", "KEEP_ALIVE_NANOS", "_thread", "Ljava/lang/Thread;", "get_thread$annotations", "", "debugStatus", "I", "m0", "thread", "H0", "isShutDown", "I0", "isShutdownRequested", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
@SourceDebugExtension
public final class RunnableC15476g extends AbstractC15482k implements Runnable {

    @NotNull
    public static final RunnableC15476g INSTANCE;

    @Nullable
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public static final long KEEP_ALIVE_NANOS;

    static {
        Long l2;
        RunnableC15476g runnableC15476g = new RunnableC15476g();
        INSTANCE = runnableC15476g;
        s3f.m182150g0(runnableC15476g, false, 1, null);
        try {
            l2 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l2 = 1000L;
        }
        KEEP_ALIVE_NANOS = TimeUnit.MILLISECONDS.toNanos(l2.longValue());
    }

    /* JADX INFO: renamed from: F0 */
    public final synchronized void m94177F0() {
        if (m94180I0()) {
            debugStatus = 3;
            m94236z0();
            notifyAll();
        }
    }

    /* JADX INFO: renamed from: G0 */
    public final synchronized Thread m94178G0() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setContextClassLoader(RunnableC15476g.class.getClassLoader());
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    /* JADX INFO: renamed from: H0 */
    public final boolean m94179H0() {
        return debugStatus == 4;
    }

    /* JADX INFO: renamed from: I0 */
    public final boolean m94180I0() {
        int i = debugStatus;
        return i == 2 || i == 3;
    }

    /* JADX INFO: renamed from: J0 */
    public final synchronized boolean m94181J0() {
        if (m94180I0()) {
            return false;
        }
        debugStatus = 1;
        notifyAll();
        return true;
    }

    /* JADX INFO: renamed from: K0 */
    public final void m94182K0() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // kotlinx.coroutines.AbstractC15482k, kotlinx.coroutines.InterfaceC15477h
    @NotNull
    public l4e invokeOnTimeout(long timeMillis, @NotNull Runnable block, @NotNull CoroutineContext context) {
        return m94226C0(timeMillis, block);
    }

    @Override // kotlinx.coroutines.AbstractC15483l
    @NotNull
    /* JADX INFO: renamed from: m0 */
    public Thread getThread() {
        Thread thread = _thread;
        return thread == null ? m94178G0() : thread;
    }

    @Override // kotlinx.coroutines.AbstractC15483l
    /* JADX INFO: renamed from: n0 */
    public void mo94184n0(long now, @NotNull AbstractC15482k.c delayedTask) {
        m94182K0();
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zM94234x0;
        Unit unit;
        toi0.INSTANCE.m189888d(this);
        AbstractC17712j8 abstractC17712j8 = C17950k8.f121709a;
        if (abstractC17712j8 != null) {
            abstractC17712j8.m140176c();
        }
        try {
            if (!m94181J0()) {
                if (zM94234x0) {
                    return;
                } else {
                    return;
                }
            }
            long j = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long jMo94230j0 = mo94230j0();
                if (jMo94230j0 == Long.MAX_VALUE) {
                    AbstractC17712j8 abstractC17712j9 = C17950k8.f121709a;
                    long jM140174a = abstractC17712j9 != null ? abstractC17712j9.m140174a() : System.nanoTime();
                    if (j == Long.MAX_VALUE) {
                        j = KEEP_ALIVE_NANOS + jM140174a;
                    }
                    long j2 = j - jM140174a;
                    if (j2 <= 0) {
                        if (zM94234x0) {
                            return;
                        } else {
                            return;
                        }
                    }
                    jMo94230j0 = C15167a.m87600f(jMo94230j0, j2);
                } else {
                    j = Long.MAX_VALUE;
                }
                if (jMo94230j0 > 0) {
                    if (m94180I0()) {
                        if (zM94234x0) {
                            return;
                        } else {
                            return;
                        }
                    }
                    AbstractC17712j8 abstractC17712j10 = C17950k8.f121709a;
                    if (abstractC17712j10 != null) {
                        abstractC17712j10.m140175b(this, jMo94230j0);
                        unit = Unit.INSTANCE;
                    } else {
                        unit = null;
                    }
                    if (unit == null) {
                        LockSupport.parkNanos(this, jMo94230j0);
                    }
                }
            }
        } finally {
            _thread = null;
            m94177F0();
            AbstractC17712j8 abstractC17712j11 = C17950k8.f121709a;
            if (abstractC17712j11 != null) {
                abstractC17712j11.m140180g();
            }
            if (!m94234x0()) {
                getThread();
            }
        }
    }

    @Override // kotlinx.coroutines.AbstractC15482k
    /* JADX INFO: renamed from: s0 */
    public void mo94185s0(@NotNull Runnable task) {
        if (m94179H0()) {
            m94182K0();
        }
        super.mo94185s0(task);
    }

    @Override // kotlinx.coroutines.AbstractC15482k, p149l.s3f
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}
