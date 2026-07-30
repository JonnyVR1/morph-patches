package p003l;

import java.util.Iterator;
import p014rx.C1099c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class gx50<T1, T2, R> implements C1099c.c<R, T1> {

    /* JADX INFO: renamed from: a */
    public final Iterable<? extends T2> f4074a;

    /* JADX INFO: renamed from: b */
    public final x9j<? super T1, ? super T2, ? extends R> f4075b;

    /* JADX INFO: renamed from: l.gx50$a */
    public class C0329a extends z3g0<T1> {

        /* JADX INFO: renamed from: e */
        public boolean f4076e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ z3g0 f4077f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ Iterator f4078g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0329a(z3g0 z3g0Var, z3g0 z3g0Var2, Iterator it) {
            super(z3g0Var);
            this.f4077f = z3g0Var2;
            this.f4078g = it;
        }

        @Override // p003l.m250
        public void onCompleted() {
            if (this.f4076e) {
                return;
            }
            this.f4076e = true;
            this.f4077f.onCompleted();
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            if (this.f4076e) {
                f5f.m3964e(th);
            } else {
                this.f4076e = true;
                this.f4077f.onError(th);
            }
        }

        @Override // p003l.m250
        public void onNext(T1 t1) {
            if (this.f4076e) {
                return;
            }
            try {
                this.f4077f.onNext(gx50.this.f4075b.call(t1, (Object) this.f4078g.next()));
                if (this.f4078g.hasNext()) {
                    return;
                }
                onCompleted();
            } catch (Throwable th) {
                f5f.m3965f(th, this);
            }
        }
    }

    public gx50(Iterable<? extends T2> iterable, x9j<? super T1, ? super T2, ? extends R> x9jVar) {
        this.f4074a = iterable;
        this.f4075b = x9jVar;
    }

    @Override // p003l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T1> call(z3g0<? super R> z3g0Var) {
        Iterator<? extends T2> it = this.f4074a.iterator();
        try {
            if (it.hasNext()) {
                return new C0329a(z3g0Var, z3g0Var, it);
            }
            z3g0Var.onCompleted();
            return a4g0.m2741a();
        } catch (Throwable th) {
            f5f.m3965f(th, z3g0Var);
            return a4g0.m2741a();
        }
    }
}
