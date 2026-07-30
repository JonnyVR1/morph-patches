package p003l;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import p014rx.C1099c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class gg50<T> implements C1099c.a<T> {

    /* JADX INFO: renamed from: a */
    public final vv5<? extends T> f3865a;

    /* JADX INFO: renamed from: b */
    public volatile bs5 f3866b = new bs5();

    /* JADX INFO: renamed from: c */
    public final AtomicInteger f3867c = new AtomicInteger(0);

    /* JADX INFO: renamed from: d */
    public final ReentrantLock f3868d = new ReentrantLock();

    /* JADX INFO: renamed from: l.gg50$a */
    public class C0304a implements e30<c4g0> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ z3g0 f3869a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AtomicBoolean f3870b;

        public C0304a(z3g0 z3g0Var, AtomicBoolean atomicBoolean) {
            this.f3869a = z3g0Var;
            this.f3870b = atomicBoolean;
        }

        @Override // p003l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(c4g0 c4g0Var) {
            try {
                gg50.this.f3866b.m3164a(c4g0Var);
                gg50 gg50Var = gg50.this;
                gg50Var.m4539c(this.f3869a, gg50Var.f3866b);
            } finally {
                gg50.this.f3868d.unlock();
                this.f3870b.set(false);
            }
        }
    }

    /* JADX INFO: renamed from: l.gg50$b */
    public class C0305b extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ z3g0 f3872e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ bs5 f3873f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0305b(z3g0 z3g0Var, z3g0 z3g0Var2, bs5 bs5Var) {
            super(z3g0Var);
            this.f3872e = z3g0Var2;
            this.f3873f = bs5Var;
        }

        /* JADX INFO: renamed from: g */
        public void m4542g() {
            gg50.this.f3868d.lock();
            try {
                if (gg50.this.f3866b == this.f3873f) {
                    gg50.this.f3866b.unsubscribe();
                    gg50.this.f3866b = new bs5();
                    gg50.this.f3867c.set(0);
                }
            } finally {
                gg50.this.f3868d.unlock();
            }
        }

        @Override // p003l.m250
        public void onCompleted() {
            m4542g();
            this.f3872e.onCompleted();
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            m4542g();
            this.f3872e.onError(th);
        }

        @Override // p003l.m250
        public void onNext(T t) {
            this.f3872e.onNext(t);
        }
    }

    /* JADX INFO: renamed from: l.gg50$c */
    public class C0306c implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ bs5 f3875a;

        public C0306c(bs5 bs5Var) {
            this.f3875a = bs5Var;
        }

        @Override // p003l.d30
        public void call() {
            gg50.this.f3868d.lock();
            try {
                if (gg50.this.f3866b == this.f3875a && gg50.this.f3867c.decrementAndGet() == 0) {
                    gg50.this.f3866b.unsubscribe();
                    gg50.this.f3866b = new bs5();
                }
            } finally {
                gg50.this.f3868d.unlock();
            }
        }
    }

    public gg50(vv5<? extends T> vv5Var) {
        this.f3865a = vv5Var;
    }

    @Override // p003l.e30
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(z3g0<? super T> z3g0Var) {
        this.f3868d.lock();
        if (this.f3867c.incrementAndGet() != 1) {
            try {
                m4539c(z3g0Var, this.f3866b);
            } finally {
                this.f3868d.unlock();
            }
        } else {
            AtomicBoolean atomicBoolean = new AtomicBoolean(true);
            try {
                this.f3865a.mo8404c(m4540d(z3g0Var, atomicBoolean));
            } finally {
                if (atomicBoolean.get()) {
                    this.f3868d.unlock();
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final c4g0 m4538b(bs5 bs5Var) {
        return h4g0.m4914a(new C0306c(bs5Var));
    }

    /* JADX INFO: renamed from: c */
    public void m4539c(z3g0<? super T> z3g0Var, bs5 bs5Var) {
        z3g0Var.m9240b(m4538b(bs5Var));
        this.f3865a.unsafeSubscribe(new C0305b(z3g0Var, z3g0Var, bs5Var));
    }

    /* JADX INFO: renamed from: d */
    public final e30<c4g0> m4540d(z3g0<? super T> z3g0Var, AtomicBoolean atomicBoolean) {
        return new C0304a(z3g0Var, atomicBoolean);
    }
}
