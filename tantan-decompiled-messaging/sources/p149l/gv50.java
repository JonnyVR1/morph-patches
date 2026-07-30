package p149l;

import java.util.Arrays;
import p133rx.C22306c;
import p133rx.exceptions.CompositeException;

/* JADX INFO: loaded from: classes3.dex */
public class gv50<T> implements C22306c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final m250<? super T> f104530a;

    /* JADX INFO: renamed from: l.gv50$a */
    public class C17166a extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public boolean f104531e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ z3g0 f104532f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17166a(z3g0 z3g0Var, z3g0 z3g0Var2) {
            super(z3g0Var);
            this.f104532f = z3g0Var2;
        }

        @Override // p149l.m250
        public void onCompleted() {
            if (this.f104531e) {
                return;
            }
            try {
                gv50.this.f104530a.onCompleted();
                this.f104531e = true;
                this.f104532f.onCompleted();
            } catch (Throwable th) {
                f5f.m119492f(th, this);
            }
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            f5f.m119491e(th);
            if (this.f104531e) {
                return;
            }
            this.f104531e = true;
            try {
                gv50.this.f104530a.onError(th);
                this.f104532f.onError(th);
            } catch (Throwable th2) {
                f5f.m119491e(th2);
                this.f104532f.onError(new CompositeException(Arrays.asList(th, th2)));
            }
        }

        @Override // p149l.m250
        public void onNext(T t) {
            if (this.f104531e) {
                return;
            }
            try {
                gv50.this.f104530a.onNext(t);
                this.f104532f.onNext(t);
            } catch (Throwable th) {
                f5f.m119493g(th, this, t);
            }
        }
    }

    public gv50(m250<? super T> m250Var) {
        this.f104530a = m250Var;
    }

    @Override // p149l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super T> z3g0Var) {
        return new C17166a(z3g0Var, z3g0Var);
    }
}
