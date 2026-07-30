package p149l;

import p133rx.C22306c;

/* JADX INFO: loaded from: classes3.dex */
public final class mw50<T, E> implements C22306c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final C22306c<? extends E> f136018a;

    /* JADX INFO: renamed from: l.mw50$a */
    public class C18574a extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ z3g0 f136019e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18574a(z3g0 z3g0Var, boolean z, z3g0 z3g0Var2) {
            super(z3g0Var, z);
            this.f136019e = z3g0Var2;
        }

        @Override // p149l.m250
        public void onCompleted() {
            try {
                this.f136019e.onCompleted();
            } finally {
                this.f136019e.unsubscribe();
            }
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            try {
                this.f136019e.onError(th);
            } finally {
                this.f136019e.unsubscribe();
            }
        }

        @Override // p149l.m250
        public void onNext(T t) {
            this.f136019e.onNext(t);
        }
    }

    /* JADX INFO: renamed from: l.mw50$b */
    public class C18575b extends z3g0<E> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ z3g0 f136021e;

        public C18575b(z3g0 z3g0Var) {
            this.f136021e = z3g0Var;
        }

        @Override // p149l.z3g0
        /* JADX INFO: renamed from: d */
        public void mo99382d() {
            m217048e(Long.MAX_VALUE);
        }

        @Override // p149l.m250
        public void onCompleted() {
            this.f136021e.onCompleted();
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            this.f136021e.onError(th);
        }

        @Override // p149l.m250
        public void onNext(E e) {
            onCompleted();
        }
    }

    public mw50(C22306c<? extends E> c22306c) {
        this.f136018a = c22306c;
    }

    @Override // p149l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super T> z3g0Var) {
        vie0 vie0Var = new vie0(z3g0Var, false);
        C18574a c18574a = new C18574a(vie0Var, false, vie0Var);
        C18575b c18575b = new C18575b(c18574a);
        vie0Var.m217046b(c18574a);
        vie0Var.m217046b(c18575b);
        z3g0Var.m217046b(vie0Var);
        this.f136018a.unsafeSubscribe(c18575b);
        return c18574a;
    }
}
