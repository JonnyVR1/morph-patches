package p003l;

import p014rx.C1099c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class nw50<T> implements C1099c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final w9j<? super T, Boolean> f5988a;

    /* JADX INFO: renamed from: l.nw50$a */
    public class C0442a implements rc90 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C0443b f5989a;

        public C0442a(C0443b c0443b) {
            this.f5989a = c0443b;
        }

        @Override // p003l.rc90
        public void request(long j) {
            this.f5989a.m6575g(j);
        }
    }

    /* JADX INFO: renamed from: l.nw50$b */
    public final class C0443b extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final z3g0<? super T> f5991e;

        /* JADX INFO: renamed from: f */
        public boolean f5992f;

        public C0443b(z3g0<? super T> z3g0Var) {
            this.f5991e = z3g0Var;
        }

        /* JADX INFO: renamed from: g */
        public void m6575g(long j) {
            m9242e(j);
        }

        @Override // p003l.m250
        public void onCompleted() {
            if (this.f5992f) {
                return;
            }
            this.f5991e.onCompleted();
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            if (this.f5992f) {
                return;
            }
            this.f5991e.onError(th);
        }

        @Override // p003l.m250
        public void onNext(T t) {
            this.f5991e.onNext(t);
            try {
                if (nw50.this.f5988a.call(t).booleanValue()) {
                    this.f5992f = true;
                    this.f5991e.onCompleted();
                    unsubscribe();
                }
            } catch (Throwable th) {
                this.f5992f = true;
                f5f.m3966g(th, this.f5991e, t);
                unsubscribe();
            }
        }
    }

    public nw50(w9j<? super T, Boolean> w9jVar) {
        this.f5988a = w9jVar;
    }

    @Override // p003l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super T> z3g0Var) {
        C0443b c0443b = new C0443b(z3g0Var);
        z3g0Var.m9240b(c0443b);
        z3g0Var.mo3257f(new C0442a(c0443b));
        return c0443b;
    }
}
