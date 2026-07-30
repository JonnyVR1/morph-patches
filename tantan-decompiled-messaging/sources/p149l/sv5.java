package p149l;

import com.clevertap.android.sdk.Constants;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\t\u001a\u0004\u0018\u00010\u0002*\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m87232d2 = {"", "isTaskExecutor", "Ljava/util/concurrent/Executor;", "e", "(Z)Ljava/util/concurrent/Executor;", "Ll/p5j0;", "f", "()Ll/p5j0;", "Lkotlin/coroutines/CoroutineContext;", Constants.INAPP_DATA_TAG, "(Lkotlin/coroutines/CoroutineContext;)Ljava/util/concurrent/Executor;", "work-runtime_release"}, m87233k = 2, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class sv5 {

    /* JADX INFO: renamed from: l.sv5$a */
    @Metadata(m87231d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b"}, m87232d2 = {"l/sv5$a", "Ljava/util/concurrent/ThreadFactory;", "Ljava/lang/Runnable;", "runnable", "Ljava/lang/Thread;", "newThread", "(Ljava/lang/Runnable;)Ljava/lang/Thread;", "Ljava/util/concurrent/atomic/AtomicInteger;", "a", "Ljava/util/concurrent/atomic/AtomicInteger;", "threadCount", "work-runtime_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class ThreadFactoryC20035a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final AtomicInteger threadCount = new AtomicInteger(0);

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f166528b;

        public ThreadFactoryC20035a(boolean z) {
            this.f166528b = z;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            runnable.getClass();
            return new Thread(runnable, (this.f166528b ? "WM.task-" : "androidx.work-") + this.threadCount.incrementAndGet());
        }
    }

    /* JADX INFO: renamed from: l.sv5$b */
    @Metadata(m87231d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, m87232d2 = {"l/sv5$b", "Ll/p5j0;", "", "isEnabled", "()Z", "", com.google.firebase.messaging.Constants.ScionAnalytics.PARAM_LABEL, "", "a", "(Ljava/lang/String;)V", "b", "()V", "methodName", "", "cookie", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;I)V", "c", "work-runtime_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class C20036b implements p5j0 {
        @Override // p149l.p5j0
        /* JADX INFO: renamed from: a */
        public void mo167486a(String label) {
            label.getClass();
            t4j0.m187208c(label);
        }

        @Override // p149l.p5j0
        /* JADX INFO: renamed from: b */
        public void mo167487b() {
            t4j0.m187211f();
        }

        @Override // p149l.p5j0
        /* JADX INFO: renamed from: c */
        public void mo167488c(String methodName, int cookie) {
            methodName.getClass();
            t4j0.m187209d(methodName, cookie);
        }

        @Override // p149l.p5j0
        /* JADX INFO: renamed from: d */
        public void mo167489d(String methodName, int cookie) {
            methodName.getClass();
            t4j0.m187206a(methodName, cookie);
        }

        @Override // p149l.p5j0
        public boolean isEnabled() {
            return t4j0.m187213h();
        }
    }

    /* JADX INFO: renamed from: d */
    public static final Executor m186040d(CoroutineContext coroutineContext) {
        ContinuationInterceptor continuationInterceptor = coroutineContext != null ? (ContinuationInterceptor) coroutineContext.get(ContinuationInterceptor.INSTANCE) : null;
        CoroutineDispatcher coroutineDispatcher = continuationInterceptor instanceof CoroutineDispatcher ? (CoroutineDispatcher) continuationInterceptor : null;
        if (coroutineDispatcher != null) {
            return z5f.m217296a(coroutineDispatcher);
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static final Executor m186041e(boolean z) {
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new ThreadFactoryC20035a(z));
        executorServiceNewFixedThreadPool.getClass();
        return executorServiceNewFixedThreadPool;
    }

    /* JADX INFO: renamed from: f */
    public static final p5j0 m186042f() {
        return new C20036b();
    }
}
