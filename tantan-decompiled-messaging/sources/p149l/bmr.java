package p149l;

import com.clevertap.android.sdk.Constants;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.InterfaceC15477h;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001!B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J,\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\n\u0010\f\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0096\u0001¢\u0006\u0004\b\u0010\u0010\u0011J&\u0010\u0015\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\n\u0010\f\u001a\u00060\nj\u0002`\u000bH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\n\u0010\f\u001a\u00060\nj\u0002`\u000bH\u0017¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000bH\u0002¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001e\u0010(\u001a\f\u0012\b\u0012\u00060\nj\u0002`\u000b0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010-\u001a\u00060)j\u0002`*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u000b\u0010/\u001a\u00020.8\u0002X\u0082\u0004¨\u00060"}, m87232d2 = {"Ll/bmr;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlinx/coroutines/h;", "dispatcher", "", "parallelism", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;I)V", "", "timeMillis", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlin/coroutines/CoroutineContext;", "context", "Ll/l4e;", "invokeOnTimeout", "(JLjava/lang/Runnable;Lkotlin/coroutines/CoroutineContext;)Ll/l4e;", "Ll/bf4;", "", "continuation", "scheduleResumeAfterDelay", "(JLl/bf4;)V", "limitedParallelism", "(I)Lkotlinx/coroutines/CoroutineDispatcher;", "dispatch", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "dispatchYield", "", "c0", "()Z", "Z", "()Ljava/lang/Runnable;", "a", "Lkotlinx/coroutines/CoroutineDispatcher;", "b", "I", "Ll/ewv;", Constants.INAPP_DATA_TAG, "Ll/ewv;", "queue", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "e", "Ljava/lang/Object;", "workerAllocationLock", "Lkotlinx/atomicfu/AtomicInt;", "runningWorkers", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
@SourceDebugExtension
public final class bmr extends CoroutineDispatcher implements InterfaceC15477h {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f76310f = AtomicIntegerFieldUpdater.newUpdater(bmr.class, "runningWorkers$volatile");

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final CoroutineDispatcher dispatcher;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int parallelism;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC15477h f76313c;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final ewv<Runnable> queue;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final Object workerAllocationLock;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX INFO: renamed from: l.bmr$a */
    @Metadata(m87231d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00060\u0001j\u0002`\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, m87232d2 = {"Ll/bmr$a;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "currentTask", "<init>", "(Ll/bmr;Ljava/lang/Runnable;)V", "", "run", "()V", "a", "Ljava/lang/Runnable;", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
    public final class RunnableC15911a implements Runnable {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public Runnable currentTask;

        public RunnableC15911a(Runnable runnable) {
            this.currentTask = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = 0;
            while (true) {
                try {
                    this.currentTask.run();
                } catch (Throwable th) {
                    mpb.m155795a(EmptyCoroutineContext.INSTANCE, th);
                }
                Runnable runnableM102672Z = bmr.this.m102672Z();
                if (runnableM102672Z == null) {
                    return;
                }
                this.currentTask = runnableM102672Z;
                i++;
                if (i >= 16 && bmr.this.dispatcher.isDispatchNeeded(bmr.this)) {
                    bmr.this.dispatcher.dispatch(bmr.this, this);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public bmr(@NotNull CoroutineDispatcher coroutineDispatcher, int i) {
        this.dispatcher = coroutineDispatcher;
        this.parallelism = i;
        InterfaceC15477h interfaceC15477h = coroutineDispatcher instanceof InterfaceC15477h ? (InterfaceC15477h) coroutineDispatcher : null;
        this.f76313c = interfaceC15477h == null ? jnd.m142372a() : interfaceC15477h;
        this.queue = new ewv<>(false);
        this.workerAllocationLock = new Object();
    }

    /* JADX INFO: renamed from: Z */
    public final Runnable m102672Z() {
        while (true) {
            Runnable runnableM118525e = this.queue.m118525e();
            if (runnableM118525e != null) {
                return runnableM118525e;
            }
            synchronized (this.workerAllocationLock) {
                f76310f.decrementAndGet(this);
                if (this.queue.m118524c() == 0) {
                    return null;
                }
                f76310f.incrementAndGet(this);
            }
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final boolean m102673c0() {
        synchronized (this.workerAllocationLock) {
            if (f76310f.get(this) >= this.parallelism) {
                return false;
            }
            f76310f.incrementAndGet(this);
            return true;
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatch(@NotNull CoroutineContext context, @NotNull Runnable block) {
        Runnable runnableM102672Z;
        this.queue.m118522a(block);
        if (f76310f.get(this) >= this.parallelism || !m102673c0() || (runnableM102672Z = m102672Z()) == null) {
            return;
        }
        this.dispatcher.dispatch(this, new RunnableC15911a(runnableM102672Z));
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatchYield(@NotNull CoroutineContext context, @NotNull Runnable block) {
        Runnable runnableM102672Z;
        this.queue.m118522a(block);
        if (f76310f.get(this) >= this.parallelism || !m102673c0() || (runnableM102672Z = m102672Z()) == null) {
            return;
        }
        this.dispatcher.dispatchYield(this, new RunnableC15911a(runnableM102672Z));
    }

    @Override // kotlinx.coroutines.InterfaceC15477h
    @NotNull
    public l4e invokeOnTimeout(long timeMillis, @NotNull Runnable block, @NotNull CoroutineContext context) {
        return this.f76313c.invokeOnTimeout(timeMillis, block, context);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    @NotNull
    public CoroutineDispatcher limitedParallelism(int parallelism) {
        cmr.m107694a(parallelism);
        return parallelism >= this.parallelism ? this : super.limitedParallelism(parallelism);
    }

    @Override // kotlinx.coroutines.InterfaceC15477h
    public void scheduleResumeAfterDelay(long timeMillis, @NotNull bf4<? super Unit> continuation) {
        this.f76313c.scheduleResumeAfterDelay(timeMillis, continuation);
    }
}
