package p003l;

import p014rx.C1099c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class hv50<T> implements C1099c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final e30<Long> f4287a;

    /* JADX INFO: renamed from: l.hv50$a */
    public class C0337a implements rc90 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C0338b f4288a;

        public C0337a(C0338b c0338b) {
            this.f4288a = c0338b;
        }

        @Override // p003l.rc90
        public void request(long j) {
            hv50.this.f4287a.call(Long.valueOf(j));
            this.f4288a.m5000h(j);
        }
    }

    /* JADX INFO: renamed from: l.hv50$b */
    public static final class C0338b<T> extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final z3g0<? super T> f4290e;

        public C0338b(z3g0<? super T> z3g0Var) {
            this.f4290e = z3g0Var;
            m9242e(0L);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public void m5000h(long j) {
            m9242e(j);
        }

        @Override // p003l.m250
        public void onCompleted() {
            this.f4290e.onCompleted();
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            this.f4290e.onError(th);
        }

        @Override // p003l.m250
        public void onNext(T t) {
            this.f4290e.onNext(t);
        }
    }

    public hv50(e30<Long> e30Var) {
        this.f4287a = e30Var;
    }

    @Override // p003l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super T> z3g0Var) {
        C0338b c0338b = new C0338b(z3g0Var);
        z3g0Var.mo3257f(new C0337a(c0338b));
        z3g0Var.m9240b(c0338b);
        return c0338b;
    }
}
