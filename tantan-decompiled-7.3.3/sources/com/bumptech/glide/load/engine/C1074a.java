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
import p153l.kzq;
import p153l.u3d0;
import p153l.vn80;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.a */
/* JADX INFO: loaded from: classes.dex */
final class C1074a {

    /* JADX INFO: renamed from: a */
    private final boolean f4431a;

    /* JADX INFO: renamed from: b */
    private final Executor f4432b;

    /* JADX INFO: renamed from: c */
    @VisibleForTesting
    final Map<kzq, c> f4433c;

    /* JADX INFO: renamed from: d */
    private final ReferenceQueue<C1086m<?>> f4434d;

    /* JADX INFO: renamed from: e */
    private C1086m.a f4435e;

    /* JADX INFO: renamed from: f */
    private volatile boolean f4436f;

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.a$a */
    public class a implements ThreadFactory {

        /* JADX INFO: renamed from: com.bumptech.glide.load.engine.a$a$a, reason: collision with other inner class name */
        public class RunnableC22775a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ Runnable f4437a;

            public RunnableC22775a(Runnable runnable) {
                this.f4437a = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                Process.setThreadPriority(10);
                this.f4437a.run();
            }
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@NonNull Runnable runnable) {
            return new Thread(new RunnableC22775a(runnable), "glide-active-resources");
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.a$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1074a.this.m5424b();
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.a$c */
    @VisibleForTesting
    public static final class c extends WeakReference<C1086m<?>> {

        /* JADX INFO: renamed from: a */
        final kzq f4440a;

        /* JADX INFO: renamed from: b */
        final boolean f4441b;

        /* JADX INFO: renamed from: c */
        @Nullable
        u3d0<?> f4442c;

        public c(@NonNull kzq kzqVar, @NonNull C1086m<?> c1086m, @NonNull ReferenceQueue<? super C1086m<?>> referenceQueue, boolean z) {
            super(c1086m, referenceQueue);
            this.f4440a = (kzq) vn80.m201944d(kzqVar);
            this.f4442c = (c1086m.m5504c() && z) ? (u3d0) vn80.m201944d(c1086m.m5503b()) : null;
            this.f4441b = c1086m.m5504c();
        }

        /* JADX INFO: renamed from: a */
        public void m5429a() {
            this.f4442c = null;
            clear();
        }
    }

    @VisibleForTesting
    public C1074a(boolean z, Executor executor) {
        this.f4433c = new HashMap();
        this.f4434d = new ReferenceQueue<>();
        this.f4431a = z;
        this.f4432b = executor;
        executor.execute(new b());
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m5423a(kzq kzqVar, C1086m<?> c1086m) {
        c cVarPut = this.f4433c.put(kzqVar, new c(kzqVar, c1086m, this.f4434d, this.f4431a));
        if (cVarPut != null) {
            cVarPut.m5429a();
        }
    }

    /* JADX INFO: renamed from: b */
    public void m5424b() {
        while (!this.f4436f) {
            try {
                m5425c((c) this.f4434d.remove());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m5425c(@NonNull c cVar) {
        u3d0<?> u3d0Var;
        synchronized (this) {
            this.f4433c.remove(cVar.f4440a);
            if (cVar.f4441b && (u3d0Var = cVar.f4442c) != null) {
                this.f4435e.mo5472d(cVar.f4440a, new C1086m<>(u3d0Var, true, false, cVar.f4440a, this.f4435e));
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public synchronized void m5426d(kzq kzqVar) {
        c cVarRemove = this.f4433c.remove(kzqVar);
        if (cVarRemove != null) {
            cVarRemove.m5429a();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public synchronized C1086m<?> m5427e(kzq kzqVar) {
        c cVar = this.f4433c.get(kzqVar);
        if (cVar == null) {
            return null;
        }
        C1086m<?> c1086m = cVar.get();
        if (c1086m == null) {
            m5425c(cVar);
        }
        return c1086m;
    }

    /* JADX INFO: renamed from: f */
    public void m5428f(C1086m.a aVar) {
        synchronized (aVar) {
            synchronized (this) {
                this.f4435e = aVar;
            }
        }
    }

    public C1074a(boolean z) {
        this(z, Executors.newSingleThreadExecutor(new a()));
    }
}
