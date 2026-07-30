package p149l;

import p133rx.C22306c;
import p133rx.exceptions.OnErrorThrowable;

/* JADX INFO: loaded from: classes3.dex */
public final class cg50<T, R> implements C22306c.a<R> {

    /* JADX INFO: renamed from: a */
    public final C22306c<T> f80718a;

    /* JADX INFO: renamed from: b */
    public final w9j<? super T, ? extends R> f80719b;

    /* JADX INFO: renamed from: l.cg50$a */
    public static final class C16128a<T, R> extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final z3g0<? super R> f80720e;

        /* JADX INFO: renamed from: f */
        public final w9j<? super T, ? extends R> f80721f;

        /* JADX INFO: renamed from: g */
        public boolean f80722g;

        public C16128a(z3g0<? super R> z3g0Var, w9j<? super T, ? extends R> w9jVar) {
            this.f80720e = z3g0Var;
            this.f80721f = w9jVar;
        }

        @Override // p149l.z3g0
        /* JADX INFO: renamed from: f */
        public void mo106696f(rc90 rc90Var) {
            this.f80720e.mo106696f(rc90Var);
        }

        @Override // p149l.m250
        public void onCompleted() {
            if (this.f80722g) {
                return;
            }
            this.f80720e.onCompleted();
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            if (this.f80722g) {
                ejd0.m116793j(th);
            } else {
                this.f80722g = true;
                this.f80720e.onError(th);
            }
        }

        @Override // p149l.m250
        public void onNext(T t) {
            try {
                this.f80720e.onNext(this.f80721f.call(t));
            } catch (Throwable th) {
                f5f.m119491e(th);
                unsubscribe();
                onError(OnErrorThrowable.addValueAsLastCause(th, t));
            }
        }
    }

    public cg50(C22306c<T> c22306c, w9j<? super T, ? extends R> w9jVar) {
        this.f80718a = c22306c;
        this.f80719b = w9jVar;
    }

    @Override // p149l.e30
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(z3g0<? super R> z3g0Var) {
        C16128a c16128a = new C16128a(z3g0Var, this.f80719b);
        z3g0Var.m217046b(c16128a);
        this.f80718a.unsafeSubscribe(c16128a);
    }
}
