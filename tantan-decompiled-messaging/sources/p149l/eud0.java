package p149l;

import com.clevertap.android.sdk.Constants;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.scheduling.CoroutineScheduler;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ#\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0013\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J+\u0010\u0017\u001a\u00020\u00102\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e2\u0006\u0010\f\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010'\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006,"}, m87232d2 = {"Ll/eud0;", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "", "corePoolSize", "maxPoolSize", "", "idleWorkerKeepAliveNs", "", "schedulerName", "<init>", "(IIJLjava/lang/String;)V", "Lkotlin/coroutines/CoroutineContext;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "dispatch", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "dispatchYield", "Ll/vei0;", "", "tailDispatch", "c0", "(Ljava/lang/Runnable;Ll/vei0;Z)V", "close", "()V", "Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "Z", "()Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "b", "I", "c", Constants.INAPP_DATA_TAG, "J", "e", "Ljava/lang/String;", "f", "Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "coroutineScheduler", "Ljava/util/concurrent/Executor;", "Y", "()Ljava/util/concurrent/Executor;", "executor", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
public class eud0 extends ExecutorCoroutineDispatcher {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int corePoolSize;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final int maxPoolSize;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final long idleWorkerKeepAliveNs;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final String schedulerName;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public CoroutineScheduler coroutineScheduler;

    public /* synthetic */ eud0(int i, int i2, long j, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? ufi0.f176259c : i, (i3 & 2) != 0 ? ufi0.f176260d : i2, (i3 & 4) != 0 ? ufi0.f176261e : j, (i3 & 8) != 0 ? "CoroutineScheduler" : str);
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher
    @NotNull
    /* JADX INFO: renamed from: Y */
    public Executor getExecutor() {
        return this.coroutineScheduler;
    }

    /* JADX INFO: renamed from: Z */
    public final CoroutineScheduler m118163Z() {
        return new CoroutineScheduler(this.corePoolSize, this.maxPoolSize, this.idleWorkerKeepAliveNs, this.schedulerName);
    }

    /* JADX INFO: renamed from: c0 */
    public final void m118164c0(@NotNull Runnable block, @NotNull vei0 context, boolean tailDispatch) {
        this.coroutineScheduler.m94271u(block, context, tailDispatch);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws InterruptedException {
        this.coroutineScheduler.close();
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatch(@NotNull CoroutineContext context, @NotNull Runnable block) {
        CoroutineScheduler.m94255v(this.coroutineScheduler, block, null, false, 6, null);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatchYield(@NotNull CoroutineContext context, @NotNull Runnable block) {
        CoroutineScheduler.m94255v(this.coroutineScheduler, block, null, true, 2, null);
    }

    public eud0() {
        this(0, 0, 0L, null, 15, null);
    }

    public eud0(int i, int i2, long j, @NotNull String str) {
        this.corePoolSize = i;
        this.maxPoolSize = i2;
        this.idleWorkerKeepAliveNs = j;
        this.schedulerName = str;
        this.coroutineScheduler = m118163Z();
    }
}
