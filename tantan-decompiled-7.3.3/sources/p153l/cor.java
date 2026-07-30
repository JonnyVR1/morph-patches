package p153l;

import com.clevertap.android.sdk.Constants;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.InterfaceC15584h;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001!B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J,\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\n\u0010\f\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0096\u0001¢\u0006\u0004\b\u0010\u0010\u0011J&\u0010\u0015\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\n\u0010\f\u001a\u00060\nj\u0002`\u000bH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\n\u0010\f\u001a\u00060\nj\u0002`\u000bH\u0017¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000bH\u0002¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001e\u0010(\u001a\f\u0012\b\u0012\u00060\nj\u0002`\u000b0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010-\u001a\u00060)j\u0002`*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u000b\u0010/\u001a\u00020.8\u0002X\u0082\u0004¨\u00060"}, m88121d2 = {"Ll/cor;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlinx/coroutines/h;", "dispatcher", "", "parallelism", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;I)V", "", "timeMillis", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlin/coroutines/CoroutineContext;", "context", "Ll/z5e;", "invokeOnTimeout", "(JLjava/lang/Runnable;Lkotlin/coroutines/CoroutineContext;)Ll/z5e;", "Ll/ag4;", "", "continuation", "scheduleResumeAfterDelay", "(JLl/ag4;)V", "limitedParallelism", "(I)Lkotlinx/coroutines/CoroutineDispatcher;", "dispatch", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "dispatchYield", "", "d0", "()Z", "a0", "()Ljava/lang/Runnable;", "a", "Lkotlinx/coroutines/CoroutineDispatcher;", "b", "I", "Ll/fyv;", Constants.INAPP_DATA_TAG, "Ll/fyv;", "queue", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "e", "Ljava/lang/Object;", "workerAllocationLock", "Lkotlinx/atomicfu/AtomicInt;", "runningWorkers", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
@SourceDebugExtension
public final class cor extends CoroutineDispatcher implements InterfaceC15584h {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f82907f = AtomicIntegerFieldUpdater.newUpdater(cor.class, "runningWorkers$volatile");

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final CoroutineDispatcher dispatcher;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int parallelism;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC15584h f82910c;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final fyv<Runnable> queue;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final Object workerAllocationLock;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX INFO: renamed from: l.cor$a */
    @Metadata(m88120d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00060\u0001j\u0002`\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, m88121d2 = {"Ll/cor$a;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "currentTask", "<init>", "(Ll/cor;Ljava/lang/Runnable;)V", "", "run", "()V", "a", "Ljava/lang/Runnable;", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
    public final class RunnableC16329a implements Runnable {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public Runnable currentTask;

        public RunnableC16329a(Runnable runnable) {
            this.currentTask = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = 0;
            while (true) {
                try {
                    this.currentTask.run();
                } catch (Throwable th) {
                    arb.m99658a(EmptyCoroutineContext.INSTANCE, th);
                }
                Runnable runnableM111687a0 = cor.this.m111687a0();
                if (runnableM111687a0 == null) {
                    return;
                }
                this.currentTask = runnableM111687a0;
                i++;
                if (i >= 16 && cor.this.dispatcher.isDispatchNeeded(cor.this)) {
                    cor.this.dispatcher.dispatch(cor.this, this);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public cor(@NotNull CoroutineDispatcher coroutineDispatcher, int i) {
        this.dispatcher = coroutineDispatcher;
        this.parallelism = i;
        InterfaceC15584h interfaceC15584h = coroutineDispatcher instanceof InterfaceC15584h ? (InterfaceC15584h) coroutineDispatcher : null;
        this.f82910c = interfaceC15584h == null ? ood.m168571a() : interfaceC15584h;
        this.queue = new fyv<>(false);
        this.workerAllocationLock = new Object();
    }

    /* JADX INFO: renamed from: a0 */
    public final Runnable m111687a0() {
        while (true) {
            Runnable runnableM128135e = this.queue.m128135e();
            if (runnableM128135e != null) {
                return runnableM128135e;
            }
            synchronized (this.workerAllocationLock) {
                f82907f.decrementAndGet(this);
                if (this.queue.m128134c() == 0) {
                    return null;
                }
                f82907f.incrementAndGet(this);
            }
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final boolean m111688d0() {
        synchronized (this.workerAllocationLock) {
            if (f82907f.get(this) >= this.parallelism) {
                return false;
            }
            f82907f.incrementAndGet(this);
            return true;
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatch(@NotNull CoroutineContext context, @NotNull Runnable block) {
        Runnable runnableM111687a0;
        this.queue.m128132a(block);
        if (f82907f.get(this) >= this.parallelism || !m111688d0() || (runnableM111687a0 = m111687a0()) == null) {
            return;
        }
        this.dispatcher.dispatch(this, new RunnableC16329a(runnableM111687a0));
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatchYield(@NotNull CoroutineContext context, @NotNull Runnable block) {
        Runnable runnableM111687a0;
        this.queue.m128132a(block);
        if (f82907f.get(this) >= this.parallelism || !m111688d0() || (runnableM111687a0 = m111687a0()) == null) {
            return;
        }
        this.dispatcher.dispatchYield(this, new RunnableC16329a(runnableM111687a0));
    }

    @Override // kotlinx.coroutines.InterfaceC15584h
    @NotNull
    public z5e invokeOnTimeout(long timeMillis, @NotNull Runnable block, @NotNull CoroutineContext context) {
        return this.f82910c.invokeOnTimeout(timeMillis, block, context);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    @NotNull
    public CoroutineDispatcher limitedParallelism(int parallelism) {
        dor.m117361a(parallelism);
        return parallelism >= this.parallelism ? this : super.limitedParallelism(parallelism);
    }

    @Override // kotlinx.coroutines.InterfaceC15584h
    public void scheduleResumeAfterDelay(long timeMillis, @NotNull ag4<? super Unit> continuation) {
        this.f82910c.scheduleResumeAfterDelay(timeMillis, continuation);
    }
}
