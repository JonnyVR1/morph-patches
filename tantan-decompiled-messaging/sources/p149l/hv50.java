package p149l;

import p133rx.C22306c;

/* JADX INFO: loaded from: classes3.dex */
public class hv50<T> implements C22306c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final e30<Long> f109619a;

    /* JADX INFO: renamed from: l.hv50$a */
    public class C17409a implements rc90 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C17410b f109620a;

        public C17409a(C17410b c17410b) {
            this.f109620a = c17410b;
        }

        @Override // p149l.rc90
        public void request(long j) {
            hv50.this.f109619a.call(Long.valueOf(j));
            this.f109620a.m133151h(j);
        }
    }

    /* JADX INFO: renamed from: l.hv50$b */
    public static final class C17410b<T> extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final z3g0<? super T> f109622e;

        public C17410b(z3g0<? super T> z3g0Var) {
            this.f109622e = z3g0Var;
            m217048e(0L);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public void m133151h(long j) {
            m217048e(j);
        }

        @Override // p149l.m250
        public void onCompleted() {
            this.f109622e.onCompleted();
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            this.f109622e.onError(th);
        }

        @Override // p149l.m250
        public void onNext(T t) {
            this.f109622e.onNext(t);
        }
    }

    public hv50(e30<Long> e30Var) {
        this.f109619a = e30Var;
    }

    @Override // p149l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super T> z3g0Var) {
        C17410b c17410b = new C17410b(z3g0Var);
        z3g0Var.mo106696f(new C17409a(c17410b));
        z3g0Var.m217046b(c17410b);
        return c17410b;
    }
}
