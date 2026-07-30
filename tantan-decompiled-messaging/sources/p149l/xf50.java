package p149l;

import p133rx.C22306c;
import p133rx.exceptions.OnErrorThrowable;

/* JADX INFO: loaded from: classes3.dex */
public final class xf50<T> implements C22306c.a<T> {

    /* JADX INFO: renamed from: a */
    public final C22306c<T> f192657a;

    /* JADX INFO: renamed from: b */
    public final w9j<? super T, Boolean> f192658b;

    /* JADX INFO: renamed from: l.xf50$a */
    public static final class C21142a<T> extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final z3g0<? super T> f192659e;

        /* JADX INFO: renamed from: f */
        public final w9j<? super T, Boolean> f192660f;

        /* JADX INFO: renamed from: g */
        public boolean f192661g;

        public C21142a(z3g0<? super T> z3g0Var, w9j<? super T, Boolean> w9jVar) {
            this.f192659e = z3g0Var;
            this.f192660f = w9jVar;
            m217048e(0L);
        }

        @Override // p149l.z3g0
        /* JADX INFO: renamed from: f */
        public void mo106696f(rc90 rc90Var) {
            super.mo106696f(rc90Var);
            this.f192659e.mo106696f(rc90Var);
        }

        @Override // p149l.m250
        public void onCompleted() {
            if (this.f192661g) {
                return;
            }
            this.f192659e.onCompleted();
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            if (this.f192661g) {
                ejd0.m116793j(th);
            } else {
                this.f192661g = true;
                this.f192659e.onError(th);
            }
        }

        @Override // p149l.m250
        public void onNext(T t) {
            try {
                if (this.f192660f.call(t).booleanValue()) {
                    this.f192659e.onNext(t);
                } else {
                    m217048e(1L);
                }
            } catch (Throwable th) {
                f5f.m119491e(th);
                unsubscribe();
                onError(OnErrorThrowable.addValueAsLastCause(th, t));
            }
        }
    }

    public xf50(C22306c<T> c22306c, w9j<? super T, Boolean> w9jVar) {
        this.f192657a = c22306c;
        this.f192658b = w9jVar;
    }

    @Override // p149l.e30
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(z3g0<? super T> z3g0Var) {
        C21142a c21142a = new C21142a(z3g0Var, this.f192658b);
        z3g0Var.m217046b(c21142a);
        this.f192657a.unsafeSubscribe(c21142a);
    }
}
