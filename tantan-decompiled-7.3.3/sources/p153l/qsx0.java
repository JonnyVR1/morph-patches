package p153l;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.measurement.internal.C2480f;
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
public final class qsx0 extends mzx0 {

    /* JADX INFO: renamed from: l */
    public static final AtomicLong f159357l = new AtomicLong(Long.MIN_VALUE);

    /* JADX INFO: renamed from: c */
    @Nullable
    public etx0 f159358c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public etx0 f159359d;

    /* JADX INFO: renamed from: e */
    public final PriorityBlockingQueue<C2480f<?>> f159360e;

    /* JADX INFO: renamed from: f */
    public final BlockingQueue<C2480f<?>> f159361f;

    /* JADX INFO: renamed from: g */
    public final Thread.UncaughtExceptionHandler f159362g;

    /* JADX INFO: renamed from: h */
    public final Thread.UncaughtExceptionHandler f159363h;

    /* JADX INFO: renamed from: i */
    public final Object f159364i;

    /* JADX INFO: renamed from: j */
    public final Semaphore f159365j;

    /* JADX INFO: renamed from: k */
    public volatile boolean f159366k;

    public qsx0(atx0 atx0Var) {
        super(atx0Var);
        this.f159364i = new Object();
        this.f159365j = new Semaphore(2);
        this.f159360e = new PriorityBlockingQueue<>();
        this.f159361f = new LinkedBlockingQueue();
        this.f159362g = new wsx0(this, "Thread death: Uncaught exception on worker thread");
        this.f159363h = new wsx0(this, "Thread death: Uncaught exception on network thread");
    }

    /* JADX INFO: renamed from: A */
    public final void m177834A(Runnable runnable) throws IllegalStateException {
        m160930j();
        Preconditions.checkNotNull(runnable);
        m177838r(new C2480f<>(this, runnable, true, "Task exception on worker thread"));
    }

    /* JADX INFO: renamed from: D */
    public final boolean m177835D() {
        return Thread.currentThread() == this.f159358c;
    }

    @Override // p153l.yyx0
    @Pure
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ ajr0 mo15139a() {
        return super.mo15139a();
    }

    @Override // p153l.yyx0
    @Pure
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ o7s0 mo15140b() {
        return super.mo15140b();
    }

    @Override // p153l.yyx0
    @Pure
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ wxw0 mo15141c() {
        return super.mo15141c();
    }

    @Override // p153l.yyx0
    @Pure
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ ajx0 mo15142d() {
        return super.mo15142d();
    }

    @Override // p153l.yyx0
    @Pure
    /* JADX INFO: renamed from: e */
    public final /* bridge */ /* synthetic */ hny0 mo15143e() {
        return super.mo15143e();
    }

    @Override // p153l.yyx0
    /* JADX INFO: renamed from: f */
    public final void mo15144f() {
        if (Thread.currentThread() == this.f159359d) {
            return;
        }
        wtq0.m207906a("Call expected from network thread");
    }

    @Override // p153l.yyx0
    /* JADX INFO: renamed from: g */
    public final /* bridge */ /* synthetic */ void mo15145g() {
        super.mo15145g();
    }

    @Override // p153l.yyx0
    /* JADX INFO: renamed from: h */
    public final void mo15146h() {
        if (Thread.currentThread() == this.f159358c) {
            return;
        }
        wtq0.m207906a("Call expected from worker thread");
    }

    @Override // p153l.mzx0
    /* JADX INFO: renamed from: n */
    public final boolean mo98519n() {
        return false;
    }

    @Nullable
    /* JADX INFO: renamed from: o */
    public final <T> T m177836o(AtomicReference<T> atomicReference, long j, String str, Runnable runnable) {
        synchronized (atomicReference) {
            zzl().m177841w(runnable);
            try {
                atomicReference.wait(j);
            } catch (InterruptedException unused) {
                zzj().m114563F().m153300a("Interrupted waiting for " + str);
                return null;
            }
        }
        T t = atomicReference.get();
        if (t == null) {
            zzj().m114563F().m153300a("Timed out waiting for " + str);
        }
        return t;
    }

    /* JADX INFO: renamed from: p */
    public final <V> Future<V> m177837p(Callable<V> callable) throws IllegalStateException {
        m160930j();
        Preconditions.checkNotNull(callable);
        C2480f<?> c2480f = new C2480f<>(this, (Callable<?>) callable, false, "Task exception on worker thread");
        if (Thread.currentThread() != this.f159358c) {
            m177838r(c2480f);
            return c2480f;
        }
        if (!this.f159360e.isEmpty()) {
            zzj().m114563F().m153300a("Callable skipped the worker queue.");
        }
        c2480f.run();
        return c2480f;
    }

    /* JADX INFO: renamed from: r */
    public final void m177838r(C2480f<?> c2480f) {
        synchronized (this.f159364i) {
            try {
                this.f159360e.add(c2480f);
                etx0 etx0Var = this.f159358c;
                if (etx0Var == null) {
                    etx0 etx0Var2 = new etx0(this, "Measurement Worker", this.f159360e);
                    this.f159358c = etx0Var2;
                    etx0Var2.setUncaughtExceptionHandler(this.f159362g);
                    this.f159358c.start();
                } else {
                    etx0Var.m122512a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m177839s(Runnable runnable) throws IllegalStateException {
        m160930j();
        Preconditions.checkNotNull(runnable);
        C2480f<?> c2480f = new C2480f<>(this, runnable, false, "Task exception on network thread");
        synchronized (this.f159364i) {
            try {
                this.f159361f.add(c2480f);
                etx0 etx0Var = this.f159359d;
                if (etx0Var == null) {
                    etx0 etx0Var2 = new etx0(this, "Measurement Network", this.f159361f);
                    this.f159359d = etx0Var2;
                    etx0Var2.setUncaughtExceptionHandler(this.f159363h);
                    this.f159359d.start();
                } else {
                    etx0Var.m122512a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public final <V> Future<V> m177840u(Callable<V> callable) throws IllegalStateException {
        m160930j();
        Preconditions.checkNotNull(callable);
        C2480f<?> c2480f = new C2480f<>(this, (Callable<?>) callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.f159358c) {
            c2480f.run();
            return c2480f;
        }
        m177838r(c2480f);
        return c2480f;
    }

    /* JADX INFO: renamed from: w */
    public final void m177841w(Runnable runnable) throws IllegalStateException {
        m160930j();
        Preconditions.checkNotNull(runnable);
        m177838r(new C2480f<>(this, runnable, false, "Task exception on worker thread"));
    }

    @Override // p153l.yyx0, p153l.hzx0
    @Pure
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    @Override // p153l.yyx0, p153l.hzx0
    @Pure
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    @Override // p153l.yyx0, p153l.hzx0
    @Pure
    public final /* bridge */ /* synthetic */ zbr0 zzd() {
        return super.zzd();
    }

    @Override // p153l.yyx0, p153l.hzx0
    @Pure
    public final /* bridge */ /* synthetic */ d6x0 zzj() {
        return super.zzj();
    }

    @Override // p153l.yyx0, p153l.hzx0
    @Pure
    public final /* bridge */ /* synthetic */ qsx0 zzl() {
        return super.zzl();
    }
}
