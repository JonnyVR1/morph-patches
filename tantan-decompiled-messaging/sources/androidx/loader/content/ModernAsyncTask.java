package androidx.loader.content;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p149l.pkq0;
import p149l.qkq0;

/* JADX INFO: loaded from: classes.dex */
public abstract class ModernAsyncTask<Params, Progress, Result> {

    /* JADX INFO: renamed from: f */
    public static final ThreadFactory f2364f;

    /* JADX INFO: renamed from: g */
    public static final BlockingQueue<Runnable> f2365g;

    /* JADX INFO: renamed from: h */
    public static final Executor f2366h;

    /* JADX INFO: renamed from: i */
    public static HandlerC0500f f2367i;

    /* JADX INFO: renamed from: j */
    public static volatile Executor f2368j;

    /* JADX INFO: renamed from: a */
    public final AbstractCallableC0501g<Params, Result> f2369a;

    /* JADX INFO: renamed from: b */
    public final FutureTask<Result> f2370b;

    /* JADX INFO: renamed from: c */
    public volatile Status f2371c = Status.PENDING;

    /* JADX INFO: renamed from: d */
    public final AtomicBoolean f2372d = new AtomicBoolean();

    /* JADX INFO: renamed from: e */
    public final AtomicBoolean f2373e = new AtomicBoolean();

    public enum Status {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* JADX INFO: renamed from: androidx.loader.content.ModernAsyncTask$a */
    public static class ThreadFactoryC0495a implements ThreadFactory {

        /* JADX INFO: renamed from: a */
        public final AtomicInteger f2374a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "ModernAsyncTask #" + this.f2374a.getAndIncrement());
        }
    }

    /* JADX INFO: renamed from: androidx.loader.content.ModernAsyncTask$b */
    public class C0496b extends AbstractCallableC0501g<Params, Result> {
        public C0496b() {
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // java.util.concurrent.Callable
        public Result call() throws Exception {
            ModernAsyncTask.this.f2373e.set(true);
            Result result = null;
            try {
                Process.setThreadPriority(10);
                result = (Result) ModernAsyncTask.this.mo3113b(this.f2380a);
                Binder.flushPendingCommands();
                ModernAsyncTask.this.m3122l(result);
                return result;
            } catch (Throwable th) {
                try {
                    ModernAsyncTask.this.f2372d.set(true);
                    throw th;
                } catch (Throwable th2) {
                    ModernAsyncTask.this.m3122l(result);
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.loader.content.ModernAsyncTask$c */
    public class C0497c extends FutureTask<Result> {
        public C0497c(Callable callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        public void done() {
            try {
                ModernAsyncTask.this.m3123m(get());
            } catch (InterruptedException unused) {
            } catch (CancellationException unused2) {
                ModernAsyncTask.this.m3123m(null);
            } catch (ExecutionException e) {
                pkq0.m170054a("An error occurred while executing doInBackground()", e.getCause());
            } catch (Throwable th) {
                pkq0.m170054a("An error occurred while executing doInBackground()", th);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.loader.content.ModernAsyncTask$d */
    public static /* synthetic */ class C0498d {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f2377a;

        static {
            int[] iArr = new int[Status.values().length];
            f2377a = iArr;
            try {
                iArr[Status.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2377a[Status.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: androidx.loader.content.ModernAsyncTask$e */
    public static class C0499e<Data> {

        /* JADX INFO: renamed from: a */
        public final ModernAsyncTask f2378a;

        /* JADX INFO: renamed from: b */
        public final Data[] f2379b;

        public C0499e(ModernAsyncTask modernAsyncTask, Data... dataArr) {
            this.f2378a = modernAsyncTask;
            this.f2379b = dataArr;
        }
    }

    /* JADX INFO: renamed from: androidx.loader.content.ModernAsyncTask$f */
    public static class HandlerC0500f extends Handler {
        public HandlerC0500f() {
            super(Looper.getMainLooper());
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            C0499e c0499e = (C0499e) message.obj;
            int i = message.what;
            if (i == 1) {
                c0499e.f2378a.m3115d(c0499e.f2379b[0]);
            } else {
                if (i != 2) {
                    return;
                }
                c0499e.f2378a.m3121k(c0499e.f2379b);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.loader.content.ModernAsyncTask$g */
    public static abstract class AbstractCallableC0501g<Params, Result> implements Callable<Result> {

        /* JADX INFO: renamed from: a */
        public Params[] f2380a;
    }

    static {
        ThreadFactoryC0495a threadFactoryC0495a = new ThreadFactoryC0495a();
        f2364f = threadFactoryC0495a;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(10);
        f2365g = linkedBlockingQueue;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, linkedBlockingQueue, threadFactoryC0495a);
        f2366h = threadPoolExecutor;
        f2368j = threadPoolExecutor;
    }

    public ModernAsyncTask() {
        C0496b c0496b = new C0496b();
        this.f2369a = c0496b;
        this.f2370b = new C0497c(c0496b);
    }

    /* JADX INFO: renamed from: e */
    public static Handler m3111e() {
        HandlerC0500f handlerC0500f;
        synchronized (ModernAsyncTask.class) {
            try {
                if (f2367i == null) {
                    f2367i = new HandlerC0500f();
                }
                handlerC0500f = f2367i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return handlerC0500f;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m3112a(boolean z) {
        this.f2372d.set(true);
        return this.f2370b.cancel(z);
    }

    /* JADX INFO: renamed from: b */
    public abstract Result mo3113b(Params... paramsArr);

    /* JADX INFO: renamed from: c */
    public final ModernAsyncTask<Params, Progress, Result> m3114c(Executor executor, Params... paramsArr) {
        if (this.f2371c == Status.PENDING) {
            this.f2371c = Status.RUNNING;
            m3120j();
            this.f2369a.f2380a = paramsArr;
            executor.execute(this.f2370b);
            return this;
        }
        int i = C0498d.f2377a[this.f2371c.ordinal()];
        if (i == 1) {
            qkq0.m175383a("Cannot execute task: the task is already running.");
            return null;
        }
        if (i != 2) {
            qkq0.m175383a("We should never reach this state");
            return null;
        }
        qkq0.m175383a("Cannot execute task: the task has already been executed (a task can be executed only once)");
        return null;
    }

    /* JADX INFO: renamed from: d */
    public void m3115d(Result result) {
        if (m3116f()) {
            mo3118h(result);
        } else {
            mo3119i(result);
        }
        this.f2371c = Status.FINISHED;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m3116f() {
        return this.f2372d.get();
    }

    /* JADX INFO: renamed from: g */
    public void m3117g() {
    }

    /* JADX INFO: renamed from: h */
    public void mo3118h(Result result) {
        m3117g();
    }

    /* JADX INFO: renamed from: i */
    public void mo3119i(Result result) {
    }

    /* JADX INFO: renamed from: j */
    public void m3120j() {
    }

    /* JADX INFO: renamed from: k */
    public void m3121k(Progress... progressArr) {
    }

    /* JADX INFO: renamed from: l */
    public Result m3122l(Result result) {
        m3111e().obtainMessage(1, new C0499e(this, result)).sendToTarget();
        return result;
    }

    /* JADX INFO: renamed from: m */
    public void m3123m(Result result) {
        if (this.f2373e.get()) {
            return;
        }
        m3122l(result);
    }
}
