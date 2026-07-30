package p149l;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.measurement.internal.C2457f;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: loaded from: classes6.dex */
public final class kjx0 extends gqx0 {

    /* JADX INFO: renamed from: l */
    public static final AtomicLong f123507l = new AtomicLong(Long.MIN_VALUE);

    /* JADX INFO: renamed from: c */
    @Nullable
    public yjx0 f123508c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public yjx0 f123509d;

    /* JADX INFO: renamed from: e */
    public final PriorityBlockingQueue<C2457f<?>> f123510e;

    /* JADX INFO: renamed from: f */
    public final BlockingQueue<C2457f<?>> f123511f;

    /* JADX INFO: renamed from: g */
    public final Thread.UncaughtExceptionHandler f123512g;

    /* JADX INFO: renamed from: h */
    public final Thread.UncaughtExceptionHandler f123513h;

    /* JADX INFO: renamed from: i */
    public final Object f123514i;

    /* JADX INFO: renamed from: j */
    public final Semaphore f123515j;

    /* JADX INFO: renamed from: k */
    public volatile boolean f123516k;

    public kjx0(ujx0 ujx0Var) {
        super(ujx0Var);
        this.f123514i = new Object();
        this.f123515j = new Semaphore(2);
        this.f123510e = new PriorityBlockingQueue<>();
        this.f123511f = new LinkedBlockingQueue();
        this.f123512g = new qjx0(this, "Thread death: Uncaught exception on worker thread");
        this.f123513h = new qjx0(this, "Thread death: Uncaught exception on network thread");
    }

    /* JADX INFO: renamed from: A */
    public final void m146298A(Runnable runnable) throws IllegalStateException {
        m127632j();
        Preconditions.checkNotNull(runnable);
        m146302r(new C2457f<>(this, runnable, true, "Task exception on worker thread"));
    }

    /* JADX INFO: renamed from: D */
    public final boolean m146299D() {
        return Thread.currentThread() == this.f123508c;
    }

    @Override // p149l.spx0
    @Pure
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ u9r0 mo15085a() {
        return super.mo15085a();
    }

    @Override // p149l.spx0
    @Pure
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ iyr0 mo15086b() {
        return super.mo15086b();
    }

    @Override // p149l.spx0
    @Pure
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ qow0 mo15087c() {
        return super.mo15087c();
    }

    @Override // p149l.spx0
    @Pure
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ u9x0 mo15088d() {
        return super.mo15088d();
    }

    @Override // p149l.spx0
    @Pure
    /* JADX INFO: renamed from: e */
    public final /* bridge */ /* synthetic */ bey0 mo15089e() {
        return super.mo15089e();
    }

    @Override // p149l.spx0
    /* JADX INFO: renamed from: f */
    public final void mo15090f() {
        if (Thread.currentThread() == this.f123509d) {
            return;
        }
        qkq0.m175383a("Call expected from network thread");
    }

    @Override // p149l.spx0
    /* JADX INFO: renamed from: g */
    public final /* bridge */ /* synthetic */ void mo15091g() {
        super.mo15091g();
    }

    @Override // p149l.spx0
    /* JADX INFO: renamed from: h */
    public final void mo15092h() {
        if (Thread.currentThread() == this.f123508c) {
            return;
        }
        qkq0.m175383a("Call expected from worker thread");
    }

    @Override // p149l.gqx0
    /* JADX INFO: renamed from: n */
    public final boolean mo101492n() {
        return false;
    }

    @Nullable
    /* JADX INFO: renamed from: o */
    public final <T> T m146300o(AtomicReference<T> atomicReference, long j, String str, Runnable runnable) {
        synchronized (atomicReference) {
            zzl().m146305w(runnable);
            try {
                atomicReference.wait(j);
            } catch (InterruptedException unused) {
                zzj().m211417F().m123936a("Interrupted waiting for " + str);
                return null;
            }
        }
        T t = atomicReference.get();
        if (t == null) {
            zzj().m211417F().m123936a("Timed out waiting for " + str);
        }
        return t;
    }

    /* JADX INFO: renamed from: p */
    public final <V> Future<V> m146301p(Callable<V> callable) throws IllegalStateException {
        m127632j();
        Preconditions.checkNotNull(callable);
        C2457f<?> c2457f = new C2457f<>(this, (Callable<?>) callable, false, "Task exception on worker thread");
        if (Thread.currentThread() != this.f123508c) {
            m146302r(c2457f);
            return c2457f;
        }
        if (!this.f123510e.isEmpty()) {
            zzj().m211417F().m123936a("Callable skipped the worker queue.");
        }
        c2457f.run();
        return c2457f;
    }

    /* JADX INFO: renamed from: r */
    public final void m146302r(C2457f<?> c2457f) {
        synchronized (this.f123514i) {
            try {
                this.f123510e.add(c2457f);
                yjx0 yjx0Var = this.f123508c;
                if (yjx0Var == null) {
                    yjx0 yjx0Var2 = new yjx0(this, "Measurement Worker", this.f123510e);
                    this.f123508c = yjx0Var2;
                    yjx0Var2.setUncaughtExceptionHandler(this.f123512g);
                    this.f123508c.start();
                } else {
                    yjx0Var.m215099a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m146303s(Runnable runnable) throws IllegalStateException {
        m127632j();
        Preconditions.checkNotNull(runnable);
        C2457f<?> c2457f = new C2457f<>(this, runnable, false, "Task exception on network thread");
        synchronized (this.f123514i) {
            try {
                this.f123511f.add(c2457f);
                yjx0 yjx0Var = this.f123509d;
                if (yjx0Var == null) {
                    yjx0 yjx0Var2 = new yjx0(this, "Measurement Network", this.f123511f);
                    this.f123509d = yjx0Var2;
                    yjx0Var2.setUncaughtExceptionHandler(this.f123513h);
                    this.f123509d.start();
                } else {
                    yjx0Var.m215099a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public final <V> Future<V> m146304u(Callable<V> callable) throws IllegalStateException {
        m127632j();
        Preconditions.checkNotNull(callable);
        C2457f<?> c2457f = new C2457f<>(this, (Callable<?>) callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.f123508c) {
            c2457f.run();
            return c2457f;
        }
        m146302r(c2457f);
        return c2457f;
    }

    /* JADX INFO: renamed from: w */
    public final void m146305w(Runnable runnable) throws IllegalStateException {
        m127632j();
        Preconditions.checkNotNull(runnable);
        m146302r(new C2457f<>(this, runnable, false, "Task exception on worker thread"));
    }

    @Override // p149l.spx0, p149l.bqx0
    @Pure
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    @Override // p149l.spx0, p149l.bqx0
    @Pure
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    @Override // p149l.spx0, p149l.bqx0
    @Pure
    public final /* bridge */ /* synthetic */ t2r0 zzd() {
        return super.zzd();
    }

    @Override // p149l.spx0, p149l.bqx0
    @Pure
    public final /* bridge */ /* synthetic */ xww0 zzj() {
        return super.zzj();
    }

    @Override // p149l.spx0, p149l.bqx0
    @Pure
    public final /* bridge */ /* synthetic */ kjx0 zzl() {
        return super.zzl();
    }
}
