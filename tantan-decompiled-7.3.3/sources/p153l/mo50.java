package p153l;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
public final class mo50<T> implements C22421c.a<T> {

    /* JADX INFO: renamed from: a */
    public final ax5<? extends T> f137773a;

    /* JADX INFO: renamed from: b */
    public volatile ft5 f137774b = new ft5();

    /* JADX INFO: renamed from: c */
    public final AtomicInteger f137775c = new AtomicInteger(0);

    /* JADX INFO: renamed from: d */
    public final ReentrantLock f137776d = new ReentrantLock();

    /* JADX INFO: renamed from: l.mo50$a */
    public class C18661a implements y20<kcg0> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ gcg0 f137777a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AtomicBoolean f137778b;

        public C18661a(gcg0 gcg0Var, AtomicBoolean atomicBoolean) {
            this.f137777a = gcg0Var;
            this.f137778b = atomicBoolean;
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(kcg0 kcg0Var) {
            try {
                mo50.this.f137774b.m127297a(kcg0Var);
                mo50 mo50Var = mo50.this;
                mo50Var.m159240c(this.f137777a, mo50Var.f137774b);
            } finally {
                mo50.this.f137776d.unlock();
                this.f137778b.set(false);
            }
        }
    }

    /* JADX INFO: renamed from: l.mo50$b */
    public class C18662b extends gcg0<T> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ gcg0 f137780e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ ft5 f137781f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18662b(gcg0 gcg0Var, gcg0 gcg0Var2, ft5 ft5Var) {
            super(gcg0Var);
            this.f137780e = gcg0Var2;
            this.f137781f = ft5Var;
        }

        /* JADX INFO: renamed from: g */
        public void m159243g() {
            mo50.this.f137776d.lock();
            try {
                if (mo50.this.f137774b == this.f137781f) {
                    mo50.this.f137774b.unsubscribe();
                    mo50.this.f137774b = new ft5();
                    mo50.this.f137775c.set(0);
                }
            } finally {
                mo50.this.f137776d.unlock();
            }
        }

        @Override // p153l.bb50
        public void onCompleted() {
            m159243g();
            this.f137780e.onCompleted();
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            m159243g();
            this.f137780e.onError(th);
        }

        @Override // p153l.bb50
        public void onNext(T t) {
            this.f137780e.onNext(t);
        }
    }

    /* JADX INFO: renamed from: l.mo50$c */
    public class C18663c implements x20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ft5 f137783a;

        public C18663c(ft5 ft5Var) {
            this.f137783a = ft5Var;
        }

        @Override // p153l.x20
        public void call() {
            mo50.this.f137776d.lock();
            try {
                if (mo50.this.f137774b == this.f137783a && mo50.this.f137775c.decrementAndGet() == 0) {
                    mo50.this.f137774b.unsubscribe();
                    mo50.this.f137774b = new ft5();
                }
            } finally {
                mo50.this.f137776d.unlock();
            }
        }
    }

    public mo50(ax5<? extends T> ax5Var) {
        this.f137773a = ax5Var;
    }

    @Override // p153l.y20
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(gcg0<? super T> gcg0Var) {
        this.f137776d.lock();
        if (this.f137775c.incrementAndGet() != 1) {
            try {
                m159240c(gcg0Var, this.f137774b);
            } finally {
                this.f137776d.unlock();
            }
        } else {
            AtomicBoolean atomicBoolean = new AtomicBoolean(true);
            try {
                this.f137773a.mo100759c(m159241d(gcg0Var, atomicBoolean));
            } finally {
                if (atomicBoolean.get()) {
                    this.f137776d.unlock();
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final kcg0 m159239b(ft5 ft5Var) {
        return pcg0.m171648a(new C18663c(ft5Var));
    }

    /* JADX INFO: renamed from: c */
    public void m159240c(gcg0<? super T> gcg0Var, ft5 ft5Var) {
        gcg0Var.m129866b(m159239b(ft5Var));
        this.f137773a.unsafeSubscribe(new C18662b(gcg0Var, gcg0Var, ft5Var));
    }

    /* JADX INFO: renamed from: d */
    public final y20<kcg0> m159241d(gcg0<? super T> gcg0Var, AtomicBoolean atomicBoolean) {
        return new C18661a(gcg0Var, atomicBoolean);
    }
}
