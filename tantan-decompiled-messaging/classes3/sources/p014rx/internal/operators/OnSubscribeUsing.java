package p014rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import p003l.a4g0;
import p003l.c4g0;
import p003l.d30;
import p003l.e30;
import p003l.f5f;
import p003l.v9j;
import p003l.w9j;
import p003l.z3g0;
import p014rx.C1099c;
import p014rx.exceptions.CompositeException;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class OnSubscribeUsing<T, Resource> implements C1099c.a<T> {

    /* JADX INFO: renamed from: a */
    public final v9j<Resource> f10793a;

    /* JADX INFO: renamed from: b */
    public final w9j<? super Resource, ? extends C1099c<? extends T>> f10794b;

    /* JADX INFO: renamed from: c */
    public final e30<? super Resource> f10795c;

    /* JADX INFO: renamed from: d */
    public final boolean f10796d;

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
        @Override // p003l.d30
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

        @Override // p003l.c4g0
        public boolean isUnsubscribed() {
            return get();
        }

        @Override // p003l.c4g0
        public void unsubscribe() {
            call();
        }
    }

    public OnSubscribeUsing(v9j<Resource> v9jVar, w9j<? super Resource, ? extends C1099c<? extends T>> w9jVar, e30<? super Resource> e30Var, boolean z) {
        this.f10793a = v9jVar;
        this.f10794b = w9jVar;
        this.f10795c = e30Var;
        this.f10796d = z;
    }

    @Override // p003l.e30
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(z3g0<? super T> z3g0Var) {
        try {
            Resource resourceCall = this.f10793a.call();
            DisposeAction disposeAction = new DisposeAction(this.f10795c, resourceCall);
            z3g0Var.m9240b(disposeAction);
            try {
                C1099c<? extends T> c1099cCall = this.f10794b.call(resourceCall);
                try {
                    (this.f10796d ? c1099cCall.doOnTerminate(disposeAction) : c1099cCall.doAfterTerminate(disposeAction)).unsafeSubscribe(a4g0.m2743c(z3g0Var));
                } catch (Throwable th) {
                    Throwable thM9812b = m9812b(disposeAction);
                    f5f.m3964e(th);
                    f5f.m3964e(thM9812b);
                    if (thM9812b != null) {
                        z3g0Var.onError(new CompositeException(th, thM9812b));
                    } else {
                        z3g0Var.onError(th);
                    }
                }
            } catch (Throwable th2) {
                Throwable thM9812b2 = m9812b(disposeAction);
                f5f.m3964e(th2);
                f5f.m3964e(thM9812b2);
                if (thM9812b2 != null) {
                    z3g0Var.onError(new CompositeException(th2, thM9812b2));
                } else {
                    z3g0Var.onError(th2);
                }
            }
        } catch (Throwable th3) {
            f5f.m3965f(th3, z3g0Var);
        }
    }

    /* JADX INFO: renamed from: b */
    public final Throwable m9812b(d30 d30Var) {
        try {
            d30Var.call();
            return null;
        } catch (Throwable th) {
            return th;
        }
    }
}
