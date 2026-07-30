package p133rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import p133rx.C22306c;
import p133rx.exceptions.CompositeException;
import p149l.a4g0;
import p149l.c4g0;
import p149l.d30;
import p149l.e30;
import p149l.f5f;
import p149l.v9j;
import p149l.w9j;
import p149l.z3g0;

/* JADX INFO: loaded from: classes3.dex */
public final class OnSubscribeUsing<T, Resource> implements C22306c.a<T> {

    /* JADX INFO: renamed from: a */
    public final v9j<Resource> f207168a;

    /* JADX INFO: renamed from: b */
    public final w9j<? super Resource, ? extends C22306c<? extends T>> f207169b;

    /* JADX INFO: renamed from: c */
    public final e30<? super Resource> f207170c;

    /* JADX INFO: renamed from: d */
    public final boolean f207171d;

    public static final class DisposeAction<Resource> extends AtomicBoolean implements d30, c4g0 {
        private static final long serialVersionUID = 4262875056400218316L;
        private e30<? super Resource> dispose;
        private Resource resource;

        public DisposeAction(e30<? super Resource> e30Var, Resource resource) {
            this.dispose = e30Var;
            this.resource = resource;
            lazySet(false);
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [Resource, l.e30<? super Resource>] */
        @Override // p149l.d30
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

        @Override // p149l.c4g0
        public boolean isUnsubscribed() {
            return get();
        }

        @Override // p149l.c4g0
        public void unsubscribe() {
            call();
        }
    }

    public OnSubscribeUsing(v9j<Resource> v9jVar, w9j<? super Resource, ? extends C22306c<? extends T>> w9jVar, e30<? super Resource> e30Var, boolean z) {
        this.f207168a = v9jVar;
        this.f207169b = w9jVar;
        this.f207170c = e30Var;
        this.f207171d = z;
    }

    @Override // p149l.e30
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(z3g0<? super T> z3g0Var) {
        try {
            Resource resourceCall = this.f207168a.call();
            DisposeAction disposeAction = new DisposeAction(this.f207170c, resourceCall);
            z3g0Var.m217046b(disposeAction);
            try {
                C22306c<? extends T> c22306cCall = this.f207169b.call(resourceCall);
                try {
                    (this.f207171d ? c22306cCall.doOnTerminate(disposeAction) : c22306cCall.doAfterTerminate(disposeAction)).unsafeSubscribe(a4g0.m94919c(z3g0Var));
                } catch (Throwable th) {
                    Throwable thM221355b = m221355b(disposeAction);
                    f5f.m119491e(th);
                    f5f.m119491e(thM221355b);
                    if (thM221355b != null) {
                        z3g0Var.onError(new CompositeException(th, thM221355b));
                    } else {
                        z3g0Var.onError(th);
                    }
                }
            } catch (Throwable th2) {
                Throwable thM221355b2 = m221355b(disposeAction);
                f5f.m119491e(th2);
                f5f.m119491e(thM221355b2);
                if (thM221355b2 != null) {
                    z3g0Var.onError(new CompositeException(th2, thM221355b2));
                } else {
                    z3g0Var.onError(th2);
                }
            }
        } catch (Throwable th3) {
            f5f.m119492f(th3, z3g0Var);
        }
    }

    /* JADX INFO: renamed from: b */
    public final Throwable m221355b(d30 d30Var) {
        try {
            d30Var.call();
            return null;
        } catch (Throwable th) {
            return th;
        }
    }
}
