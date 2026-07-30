package p149l;

import p133rx.C22306c;

/* JADX INFO: loaded from: classes3.dex */
public final class nw50<T> implements C22306c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final w9j<? super T, Boolean> f140887a;

    /* JADX INFO: renamed from: l.nw50$a */
    public class C18792a implements rc90 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C18793b f140888a;

        public C18792a(C18793b c18793b) {
            this.f140888a = c18793b;
        }

        @Override // p149l.rc90
        public void request(long j) {
            this.f140888a.m161789g(j);
        }
    }

    /* JADX INFO: renamed from: l.nw50$b */
    public final class C18793b extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final z3g0<? super T> f140890e;

        /* JADX INFO: renamed from: f */
        public boolean f140891f;

        public C18793b(z3g0<? super T> z3g0Var) {
            this.f140890e = z3g0Var;
        }

        /* JADX INFO: renamed from: g */
        public void m161789g(long j) {
            m217048e(j);
        }

        @Override // p149l.m250
        public void onCompleted() {
            if (this.f140891f) {
                return;
            }
            this.f140890e.onCompleted();
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            if (this.f140891f) {
                return;
            }
            this.f140890e.onError(th);
        }

        @Override // p149l.m250
        public void onNext(T t) {
            this.f140890e.onNext(t);
            try {
                if (nw50.this.f140887a.call(t).booleanValue()) {
                    this.f140891f = true;
                    this.f140890e.onCompleted();
                    unsubscribe();
                }
            } catch (Throwable th) {
                this.f140891f = true;
                f5f.m119493g(th, this.f140890e, t);
                unsubscribe();
            }
        }
    }

    public nw50(w9j<? super T, Boolean> w9jVar) {
        this.f140887a = w9jVar;
    }

    @Override // p149l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super T> z3g0Var) {
        C18793b c18793b = new C18793b(z3g0Var);
        z3g0Var.m217046b(c18793b);
        z3g0Var.mo106696f(new C18792a(c18793b));
        return c18793b;
    }
}
