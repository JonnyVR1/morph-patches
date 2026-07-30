package p133rx.internal.schedulers;

import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p133rx.exceptions.OnErrorNotImplementedException;
import p149l.bs5;
import p149l.c4g0;
import p149l.d30;
import p149l.ejd0;
import p149l.g4g0;

/* JADX INFO: loaded from: classes3.dex */
public final class ScheduledAction extends AtomicReference<Thread> implements Runnable, c4g0 {
    private static final long serialVersionUID = -3962399486978279857L;
    final d30 action;
    final g4g0 cancel;

    public static final class Remover extends AtomicBoolean implements c4g0 {
        private static final long serialVersionUID = 247232374289553518L;
        final bs5 parent;

        /* JADX INFO: renamed from: s */
        final ScheduledAction f207383s;

        public Remover(ScheduledAction scheduledAction, bs5 bs5Var) {
            this.f207383s = scheduledAction;
            this.parent = bs5Var;
        }

        @Override // p149l.c4g0
        public boolean isUnsubscribed() {
            return this.f207383s.isUnsubscribed();
        }

        @Override // p149l.c4g0
        public void unsubscribe() {
            if (compareAndSet(false, true)) {
                this.parent.m103658d(this.f207383s);
            }
        }
    }

    public static final class Remover2 extends AtomicBoolean implements c4g0 {
        private static final long serialVersionUID = 247232374289553518L;
        final g4g0 parent;

        /* JADX INFO: renamed from: s */
        final ScheduledAction f207384s;

        public Remover2(ScheduledAction scheduledAction, g4g0 g4g0Var) {
            this.f207384s = scheduledAction;
            this.parent = g4g0Var;
        }

        @Override // p149l.c4g0
        public boolean isUnsubscribed() {
            return this.f207384s.isUnsubscribed();
        }

        @Override // p149l.c4g0
        public void unsubscribe() {
            if (compareAndSet(false, true)) {
                this.parent.m124368b(this.f207384s);
            }
        }
    }

    /* JADX INFO: renamed from: rx.internal.schedulers.ScheduledAction$a */
    public final class C22352a implements c4g0 {

        /* JADX INFO: renamed from: a */
        public final Future<?> f207385a;

        public C22352a(Future<?> future) {
            this.f207385a = future;
        }

        @Override // p149l.c4g0
        public boolean isUnsubscribed() {
            return this.f207385a.isCancelled();
        }

        @Override // p149l.c4g0
        public void unsubscribe() {
            Thread thread = ScheduledAction.this.get();
            Thread threadCurrentThread = Thread.currentThread();
            Future<?> future = this.f207385a;
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
        this.cancel.m124367a(new C22352a(future));
    }

    public void addParent(bs5 bs5Var) {
        this.cancel.m124367a(new Remover(this, bs5Var));
    }

    @Override // p149l.c4g0
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
        ejd0.m116793j(th);
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
    }

    @Override // p149l.c4g0
    public void unsubscribe() {
        if (this.cancel.isUnsubscribed()) {
            return;
        }
        this.cancel.unsubscribe();
    }

    public void add(c4g0 c4g0Var) {
        this.cancel.m124367a(c4g0Var);
    }

    public void addParent(g4g0 g4g0Var) {
        this.cancel.m124367a(new Remover2(this, g4g0Var));
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
