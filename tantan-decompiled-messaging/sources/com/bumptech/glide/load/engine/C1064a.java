package com.bumptech.glide.load.engine;

import android.os.Process;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import p149l.kxq;
import p149l.qf80;
import p149l.rvc0;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.a */
/* JADX INFO: loaded from: classes.dex */
final class C1064a {

    /* JADX INFO: renamed from: a */
    private final boolean f4420a;

    /* JADX INFO: renamed from: b */
    private final Executor f4421b;

    /* JADX INFO: renamed from: c */
    @VisibleForTesting
    final Map<kxq, c> f4422c;

    /* JADX INFO: renamed from: d */
    private final ReferenceQueue<C1076m<?>> f4423d;

    /* JADX INFO: renamed from: e */
    private C1076m.a f4424e;

    /* JADX INFO: renamed from: f */
    private volatile boolean f4425f;

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.a$a */
    public class a implements ThreadFactory {

        /* JADX INFO: renamed from: com.bumptech.glide.load.engine.a$a$a, reason: collision with other inner class name */
        public class RunnableC22660a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ Runnable f4426a;

            public RunnableC22660a(Runnable runnable) {
                this.f4426a = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                Process.setThreadPriority(10);
                this.f4426a.run();
            }
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@NonNull Runnable runnable) {
            return new Thread(new RunnableC22660a(runnable), "glide-active-resources");
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.a$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1064a.this.m5399b();
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.a$c */
    @VisibleForTesting
    public static final class c extends WeakReference<C1076m<?>> {

        /* JADX INFO: renamed from: a */
        final kxq f4429a;

        /* JADX INFO: renamed from: b */
        final boolean f4430b;

        /* JADX INFO: renamed from: c */
        @Nullable
        rvc0<?> f4431c;

        public c(@NonNull kxq kxqVar, @NonNull C1076m<?> c1076m, @NonNull ReferenceQueue<? super C1076m<?>> referenceQueue, boolean z) {
            super(c1076m, referenceQueue);
            this.f4429a = (kxq) qf80.m174276d(kxqVar);
            this.f4431c = (c1076m.m5478c() && z) ? (rvc0) qf80.m174276d(c1076m.m5477b()) : null;
            this.f4430b = c1076m.m5478c();
        }

        /* JADX INFO: renamed from: a */
        public void m5404a() {
            this.f4431c = null;
            clear();
        }
    }

    @VisibleForTesting
    public C1064a(boolean z, Executor executor) {
        this.f4422c = new HashMap();
        this.f4423d = new ReferenceQueue<>();
        this.f4420a = z;
        this.f4421b = executor;
        executor.execute(new b());
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m5398a(kxq kxqVar, C1076m<?> c1076m) {
        c cVarPut = this.f4422c.put(kxqVar, new c(kxqVar, c1076m, this.f4423d, this.f4420a));
        if (cVarPut != null) {
            cVarPut.m5404a();
        }
    }

    /* JADX INFO: renamed from: b */
    public void m5399b() {
        while (!this.f4425f) {
            try {
                m5400c((c) this.f4423d.remove());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m5400c(@NonNull c cVar) {
        rvc0<?> rvc0Var;
        synchronized (this) {
            this.f4422c.remove(cVar.f4429a);
            if (cVar.f4430b && (rvc0Var = cVar.f4431c) != null) {
                this.f4424e.mo5446d(cVar.f4429a, new C1076m<>(rvc0Var, true, false, cVar.f4429a, this.f4424e));
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public synchronized void m5401d(kxq kxqVar) {
        c cVarRemove = this.f4422c.remove(kxqVar);
        if (cVarRemove != null) {
            cVarRemove.m5404a();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public synchronized C1076m<?> m5402e(kxq kxqVar) {
        c cVar = this.f4422c.get(kxqVar);
        if (cVar == null) {
            return null;
        }
        C1076m<?> c1076m = cVar.get();
        if (c1076m == null) {
            m5400c(cVar);
        }
        return c1076m;
    }

    /* JADX INFO: renamed from: f */
    public void m5403f(C1076m.a aVar) {
        synchronized (aVar) {
            synchronized (this) {
                this.f4424e = aVar;
            }
        }
    }

    public C1064a(boolean z) {
        this(z, Executors.newSingleThreadExecutor(new a()));
    }
}
