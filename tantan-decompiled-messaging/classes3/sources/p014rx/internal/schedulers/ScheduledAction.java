package p014rx.internal.schedulers;

import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p003l.bs5;
import p003l.c4g0;
import p003l.d30;
import p003l.ejd0;
import p003l.g4g0;
import p014rx.exceptions.OnErrorNotImplementedException;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class ScheduledAction extends AtomicReference<Thread> implements Runnable, c4g0 {
    private static final long serialVersionUID = -3962399486978279857L;
    final d30 action;
    final g4g0 cancel;

    public static final class Remover extends AtomicBoolean implements c4g0 {
        private static final long serialVersionUID = 247232374289553518L;
        final bs5 parent;

        /* JADX INFO: renamed from: s */
        final ScheduledAction f11008s;

        public Remover(ScheduledAction scheduledAction, bs5 bs5Var) {
            this.f11008s = scheduledAction;
            this.parent = bs5Var;
        }

        @Override // p003l.c4g0
        public boolean isUnsubscribed() {
            return this.f11008s.isUnsubscribed();
        }

        @Override // p003l.c4g0
        public void unsubscribe() {
            if (compareAndSet(false, true)) {
                this.parent.m3167d(this.f11008s);
            }
        }
    }

    public static final class Remover2 extends AtomicBoolean implements c4g0 {
        private static final long serialVersionUID = 247232374289553518L;
        final g4g0 parent;

        /* JADX INFO: renamed from: s */
        final ScheduledAction f11009s;

        public Remover2(ScheduledAction scheduledAction, g4g0 g4g0Var) {
            this.f11009s = scheduledAction;
            this.parent = g4g0Var;
        }

        @Override // p003l.c4g0
        public boolean isUnsubscribed() {
            return this.f11009s.isUnsubscribed();
        }

        @Override // p003l.c4g0
        public void unsubscribe() {
            if (compareAndSet(false, true)) {
                this.parent.m4518b(this.f11009s);
            }
        }
    }

    /* JADX INFO: renamed from: rx.internal.schedulers.ScheduledAction$a */
    public final class C1145a implements c4g0 {

        /* JADX INFO: renamed from: a */
        public final Future<?> f11010a;

        public C1145a(Future<?> future) {
            this.f11010a = future;
        }

        @Override // p003l.c4g0
        public boolean isUnsubscribed() {
            return this.f11010a.isCancelled();
        }

        @Override // p003l.c4g0
        public void unsubscribe() {
            Thread thread = ScheduledAction.this.get();
            Thread threadCurrentThread = Thread.currentThread();
            Future<?> future = this.f11010a;
            if (thread != threadCurrentThread) {
                future.cancel(true);
            } else {
                future.cancel(false);
            }
        }
    }

    public ScheduledAction(d30 d30Var, bs5 bs5Var) {
        this.action = d30Var;
        this.cancel = new g4g0(new Remover(this, bs5Var));
    }

    public void add(Future<?> future) {
        this.cancel.m4517a(new C1145a(future));
    }

    public void addParent(bs5 bs5Var) {
        this.cancel.m4517a(new Remover(this, bs5Var));
    }

    @Override // p003l.c4g0
    public boolean isUnsubscribed() {
        return this.cancel.isUnsubscribed();
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            try {
                lazySet(Thread.currentThread());
                this.action.call();
                unsubscribe();
            } catch (Throwable th) {
                unsubscribe();
                throw th;
            }
        } catch (OnErrorNotImplementedException e) {
            signalError(new IllegalStateException("Exception thrown on Scheduler.Worker thread. Add `onError` handling.", e));
            unsubscribe();
        } catch (Throwable th2) {
            signalError(new IllegalStateException("Fatal Exception thrown on Scheduler.Worker thread.", th2));
            unsubscribe();
        }
    }

    public void signalError(Throwable th) {
        ejd0.m3864j(th);
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
    }

    @Override // p003l.c4g0
    public void unsubscribe() {
        if (this.cancel.isUnsubscribed()) {
            return;
        }
        this.cancel.unsubscribe();
    }

    public void add(c4g0 c4g0Var) {
        this.cancel.m4517a(c4g0Var);
    }

    public void addParent(g4g0 g4g0Var) {
        this.cancel.m4517a(new Remover2(this, g4g0Var));
    }

    public ScheduledAction(d30 d30Var) {
        this.action = d30Var;
        this.cancel = new g4g0();
    }

    public ScheduledAction(d30 d30Var, g4g0 g4g0Var) {
        this.action = d30Var;
        this.cancel = new g4g0(new Remover2(this, g4g0Var));
    }
}
