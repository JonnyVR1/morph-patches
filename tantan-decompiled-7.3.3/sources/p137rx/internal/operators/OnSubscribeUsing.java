package p137rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import p137rx.C22421c;
import p137rx.exceptions.CompositeException;
import p153l.gcg0;
import p153l.icg0;
import p153l.j6f;
import p153l.kcg0;
import p153l.pcj;
import p153l.qcj;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes3.dex */
public final class OnSubscribeUsing<T, Resource> implements C22421c.a<T> {

    /* JADX INFO: renamed from: a */
    public final pcj<Resource> f208090a;

    /* JADX INFO: renamed from: b */
    public final qcj<? super Resource, ? extends C22421c<? extends T>> f208091b;

    /* JADX INFO: renamed from: c */
    public final y20<? super Resource> f208092c;

    /* JADX INFO: renamed from: d */
    public final boolean f208093d;

    public static final class DisposeAction<Resource> extends AtomicBoolean implements x20, kcg0 {
        private static final long serialVersionUID = 4262875056400218316L;
        private y20<? super Resource> dispose;
        private Resource resource;

        public DisposeAction(y20<? super Resource> y20Var, Resource resource) {
            this.dispose = y20Var;
            this.resource = resource;
            lazySet(false);
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [Resource, l.y20<? super Resource>] */
        @Override // p153l.x20
        public void call() {
            if (compareAndSet(false, true)) {
                ?? r0 = (Resource) null;
                try {
                    this.dispose.call(this.resource);
                } finally {
                    this.resource = null;
                    this.dispose = null;
                }
            }
        }

        @Override // p153l.kcg0
        public boolean isUnsubscribed() {
            return get();
        }

        @Override // p153l.kcg0
        public void unsubscribe() {
            call();
        }
    }

    public OnSubscribeUsing(pcj<Resource> pcjVar, qcj<? super Resource, ? extends C22421c<? extends T>> qcjVar, y20<? super Resource> y20Var, boolean z) {
        this.f208090a = pcjVar;
        this.f208091b = qcjVar;
        this.f208092c = y20Var;
        this.f208093d = z;
    }

    @Override // p153l.y20
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(gcg0<? super T> gcg0Var) {
        try {
            Resource resourceCall = this.f208090a.call();
            DisposeAction disposeAction = new DisposeAction(this.f208092c, resourceCall);
            gcg0Var.m129866b(disposeAction);
            try {
                C22421c<? extends T> c22421cCall = this.f208091b.call(resourceCall);
                try {
                    (this.f208093d ? c22421cCall.doOnTerminate(disposeAction) : c22421cCall.doAfterTerminate(disposeAction)).unsafeSubscribe(icg0.m139436c(gcg0Var));
                } catch (Throwable th) {
                    Throwable thM222601b = m222601b(disposeAction);
                    j6f.m143663e(th);
                    j6f.m143663e(thM222601b);
                    if (thM222601b != null) {
                        gcg0Var.onError(new CompositeException(th, thM222601b));
                    } else {
                        gcg0Var.onError(th);
                    }
                }
            } catch (Throwable th2) {
                Throwable thM222601b2 = m222601b(disposeAction);
                j6f.m143663e(th2);
                j6f.m143663e(thM222601b2);
                if (thM222601b2 != null) {
                    gcg0Var.onError(new CompositeException(th2, thM222601b2));
                } else {
                    gcg0Var.onError(th2);
                }
            }
        } catch (Throwable th3) {
            j6f.m143664f(th3, gcg0Var);
        }
    }

    /* JADX INFO: renamed from: b */
    public final Throwable m222601b(x20 x20Var) {
        try {
            x20Var.call();
            return null;
        } catch (Throwable th) {
            return th;
        }
    }
}
