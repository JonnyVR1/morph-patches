package p137rx.internal.schedulers;

import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p137rx.exceptions.OnErrorNotImplementedException;
import p153l.ft5;
import p153l.hrd0;
import p153l.kcg0;
import p153l.ocg0;
import p153l.x20;

/* JADX INFO: loaded from: classes3.dex */
public final class ScheduledAction extends AtomicReference<Thread> implements Runnable, kcg0 {
    private static final long serialVersionUID = -3962399486978279857L;
    final x20 action;
    final ocg0 cancel;

    public static final class Remover extends AtomicBoolean implements kcg0 {
        private static final long serialVersionUID = 247232374289553518L;
        final ft5 parent;

        /* JADX INFO: renamed from: s */
        final ScheduledAction f208305s;

        public Remover(ScheduledAction scheduledAction, ft5 ft5Var) {
            this.f208305s = scheduledAction;
            this.parent = ft5Var;
        }

        @Override // p153l.kcg0
        public boolean isUnsubscribed() {
            return this.f208305s.isUnsubscribed();
        }

        @Override // p153l.kcg0
        public void unsubscribe() {
            if (compareAndSet(false, true)) {
                this.parent.m127300d(this.f208305s);
            }
        }
    }

    public static final class Remover2 extends AtomicBoolean implements kcg0 {
        private static final long serialVersionUID = 247232374289553518L;
        final ocg0 parent;

        /* JADX INFO: renamed from: s */
        final ScheduledAction f208306s;

        public Remover2(ScheduledAction scheduledAction, ocg0 ocg0Var) {
            this.f208306s = scheduledAction;
            this.parent = ocg0Var;
        }

        @Override // p153l.kcg0
        public boolean isUnsubscribed() {
            return this.f208306s.isUnsubscribed();
        }

        @Override // p153l.kcg0
        public void unsubscribe() {
            if (compareAndSet(false, true)) {
                this.parent.m167214b(this.f208306s);
            }
        }
    }

    /* JADX INFO: renamed from: rx.internal.schedulers.ScheduledAction$a */
    public final class C22467a implements kcg0 {

        /* JADX INFO: renamed from: a */
        public final Future<?> f208307a;

        public C22467a(Future<?> future) {
            this.f208307a = future;
        }

        @Override // p153l.kcg0
        public boolean isUnsubscribed() {
            return this.f208307a.isCancelled();
        }

        @Override // p153l.kcg0
        public void unsubscribe() {
            Thread thread = ScheduledAction.this.get();
            Thread threadCurrentThread = Thread.currentThread();
            Future<?> future = this.f208307a;
            if (thread != threadCurrentThread) {
                future.cancel(true);
            } else {
                future.cancel(false);
            }
        }
    }

    public ScheduledAction(x20 x20Var, ft5 ft5Var) {
        this.action = x20Var;
        this.cancel = new ocg0(new Remover(this, ft5Var));
    }

    public void add(Future<?> future) {
        this.cancel.m167213a(new C22467a(future));
    }

    public void addParent(ft5 ft5Var) {
        this.cancel.m167213a(new Remover(this, ft5Var));
    }

    @Override // p153l.kcg0
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
        hrd0.m136792j(th);
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
    }

    @Override // p153l.kcg0
    public void unsubscribe() {
        if (this.cancel.isUnsubscribed()) {
            return;
        }
        this.cancel.unsubscribe();
    }

    public void add(kcg0 kcg0Var) {
        this.cancel.m167213a(kcg0Var);
    }

    public void addParent(ocg0 ocg0Var) {
        this.cancel.m167213a(new Remover2(this, ocg0Var));
    }

    public ScheduledAction(x20 x20Var) {
        this.action = x20Var;
        this.cancel = new ocg0();
    }

    public ScheduledAction(x20 x20Var, ocg0 ocg0Var) {
        this.action = x20Var;
        this.cancel = new ocg0(new Remover2(this, ocg0Var));
    }
}
