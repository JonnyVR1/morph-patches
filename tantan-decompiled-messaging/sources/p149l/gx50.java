package p149l;

import java.util.Iterator;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes3.dex */
public final class gx50<T1, T2, R> implements C22306c.c<R, T1> {

    /* JADX INFO: renamed from: a */
    public final Iterable<? extends T2> f104828a;

    /* JADX INFO: renamed from: b */
    public final x9j<? super T1, ? super T2, ? extends R> f104829b;

    /* JADX INFO: renamed from: l.gx50$a */
    public class C17188a extends z3g0<T1> {

        /* JADX INFO: renamed from: e */
        public boolean f104830e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ z3g0 f104831f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ Iterator f104832g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17188a(z3g0 z3g0Var, z3g0 z3g0Var2, Iterator it) {
            super(z3g0Var);
            this.f104831f = z3g0Var2;
            this.f104832g = it;
        }

        @Override // p149l.m250
        public void onCompleted() {
            if (this.f104830e) {
                return;
            }
            this.f104830e = true;
            this.f104831f.onCompleted();
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            if (this.f104830e) {
                f5f.m119491e(th);
            } else {
                this.f104830e = true;
                this.f104831f.onError(th);
            }
        }

        @Override // p149l.m250
        public void onNext(T1 t1) {
            if (this.f104830e) {
                return;
            }
            try {
                this.f104831f.onNext(gx50.this.f104829b.call(t1, (Object) this.f104832g.next()));
                if (this.f104832g.hasNext()) {
                    return;
                }
                onCompleted();
            } catch (Throwable th) {
                f5f.m119492f(th, this);
            }
        }
    }

    public gx50(Iterable<? extends T2> iterable, x9j<? super T1, ? super T2, ? extends R> x9jVar) {
        this.f104828a = iterable;
        this.f104829b = x9jVar;
    }

    @Override // p149l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T1> call(z3g0<? super R> z3g0Var) {
        Iterator<? extends T2> it = this.f104828a.iterator();
        try {
            if (it.hasNext()) {
                return new C17188a(z3g0Var, z3g0Var, it);
            }
            z3g0Var.onCompleted();
            return a4g0.m94917a();
        } catch (Throwable th) {
            f5f.m119492f(th, z3g0Var);
            return a4g0.m94917a();
        }
    }
}
