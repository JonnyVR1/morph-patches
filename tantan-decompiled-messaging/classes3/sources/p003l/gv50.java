package p003l;

import java.util.Arrays;
import p014rx.C1099c;
import p014rx.exceptions.CompositeException;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class gv50<T> implements C1099c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final m250<? super T> f4050a;

    /* JADX INFO: renamed from: l.gv50$a */
    public class C0324a extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public boolean f4051e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ z3g0 f4052f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0324a(z3g0 z3g0Var, z3g0 z3g0Var2) {
            super(z3g0Var);
            this.f4052f = z3g0Var2;
        }

        @Override // p003l.m250
        public void onCompleted() {
            if (this.f4051e) {
                return;
            }
            try {
                gv50.this.f4050a.onCompleted();
                this.f4051e = true;
                this.f4052f.onCompleted();
            } catch (Throwable th) {
                f5f.m3965f(th, this);
            }
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            f5f.m3964e(th);
            if (this.f4051e) {
                return;
            }
            this.f4051e = true;
            try {
                gv50.this.f4050a.onError(th);
                this.f4052f.onError(th);
            } catch (Throwable th2) {
                f5f.m3964e(th2);
                this.f4052f.onError(new CompositeException(Arrays.asList(th, th2)));
            }
        }

        @Override // p003l.m250
        public void onNext(T t) {
            if (this.f4051e) {
                return;
            }
            try {
                gv50.this.f4050a.onNext(t);
                this.f4052f.onNext(t);
            } catch (Throwable th) {
                f5f.m3966g(th, this, t);
            }
        }
    }

    public gv50(m250<? super T> m250Var) {
        this.f4050a = m250Var;
    }

    @Override // p003l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super T> z3g0Var) {
        return new C0324a(z3g0Var, z3g0Var);
    }
}
