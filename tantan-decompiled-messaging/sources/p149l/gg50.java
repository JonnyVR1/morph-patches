package p149l;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes3.dex */
public final class gg50<T> implements C22306c.a<T> {

    /* JADX INFO: renamed from: a */
    public final vv5<? extends T> f102451a;

    /* JADX INFO: renamed from: b */
    public volatile bs5 f102452b = new bs5();

    /* JADX INFO: renamed from: c */
    public final AtomicInteger f102453c = new AtomicInteger(0);

    /* JADX INFO: renamed from: d */
    public final ReentrantLock f102454d = new ReentrantLock();

    /* JADX INFO: renamed from: l.gg50$a */
    public class C17071a implements e30<c4g0> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ z3g0 f102455a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AtomicBoolean f102456b;

        public C17071a(z3g0 z3g0Var, AtomicBoolean atomicBoolean) {
            this.f102455a = z3g0Var;
            this.f102456b = atomicBoolean;
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(c4g0 c4g0Var) {
            try {
                gg50.this.f102452b.m103655a(c4g0Var);
                gg50 gg50Var = gg50.this;
                gg50Var.m125950c(this.f102455a, gg50Var.f102452b);
            } finally {
                gg50.this.f102454d.unlock();
                this.f102456b.set(false);
            }
        }
    }

    /* JADX INFO: renamed from: l.gg50$b */
    public class C17072b extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ z3g0 f102458e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ bs5 f102459f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17072b(z3g0 z3g0Var, z3g0 z3g0Var2, bs5 bs5Var) {
            super(z3g0Var);
            this.f102458e = z3g0Var2;
            this.f102459f = bs5Var;
        }

        /* JADX INFO: renamed from: g */
        public void m125953g() {
            gg50.this.f102454d.lock();
            try {
                if (gg50.this.f102452b == this.f102459f) {
                    gg50.this.f102452b.unsubscribe();
                    gg50.this.f102452b = new bs5();
                    gg50.this.f102453c.set(0);
                }
            } finally {
                gg50.this.f102454d.unlock();
            }
        }

        @Override // p149l.m250
        public void onCompleted() {
            m125953g();
            this.f102458e.onCompleted();
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            m125953g();
            this.f102458e.onError(th);
        }

        @Override // p149l.m250
        public void onNext(T t) {
            this.f102458e.onNext(t);
        }
    }

    /* JADX INFO: renamed from: l.gg50$c */
    public class C17073c implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ bs5 f102461a;

        public C17073c(bs5 bs5Var) {
            this.f102461a = bs5Var;
        }

        @Override // p149l.d30
        public void call() {
            gg50.this.f102454d.lock();
            try {
                if (gg50.this.f102452b == this.f102461a && gg50.this.f102453c.decrementAndGet() == 0) {
                    gg50.this.f102452b.unsubscribe();
                    gg50.this.f102452b = new bs5();
                }
            } finally {
                gg50.this.f102454d.unlock();
            }
        }
    }

    public gg50(vv5<? extends T> vv5Var) {
        this.f102451a = vv5Var;
    }

    @Override // p149l.e30
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(z3g0<? super T> z3g0Var) {
        this.f102454d.lock();
        if (this.f102453c.incrementAndGet() != 1) {
            try {
                m125950c(z3g0Var, this.f102452b);
            } finally {
                this.f102454d.unlock();
            }
        } else {
            AtomicBoolean atomicBoolean = new AtomicBoolean(true);
            try {
                this.f102451a.mo200174c(m125951d(z3g0Var, atomicBoolean));
            } finally {
                if (atomicBoolean.get()) {
                    this.f102454d.unlock();
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final c4g0 m125949b(bs5 bs5Var) {
        return h4g0.m129240a(new C17073c(bs5Var));
    }

    /* JADX INFO: renamed from: c */
    public void m125950c(z3g0<? super T> z3g0Var, bs5 bs5Var) {
        z3g0Var.m217046b(m125949b(bs5Var));
        this.f102451a.unsafeSubscribe(new C17072b(z3g0Var, z3g0Var, bs5Var));
    }

    /* JADX INFO: renamed from: d */
    public final e30<c4g0> m125951d(z3g0<? super T> z3g0Var, AtomicBoolean atomicBoolean) {
        return new C17071a(z3g0Var, atomicBoolean);
    }
}
