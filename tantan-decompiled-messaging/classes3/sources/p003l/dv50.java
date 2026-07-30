package p003l;

import java.util.HashSet;
import java.util.Set;
import p014rx.C1099c;
import p014rx.internal.util.UtilityFunctions;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class dv50<T, U> implements C1099c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final w9j<? super T, ? extends U> f3119a;

    /* JADX INFO: renamed from: l.dv50$a */
    public class C0246a extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public Set<U> f3120e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ z3g0 f3121f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0246a(z3g0 z3g0Var, z3g0 z3g0Var2) {
            super(z3g0Var);
            this.f3121f = z3g0Var2;
            this.f3120e = new HashSet();
        }

        @Override // p003l.m250
        public void onCompleted() {
            this.f3120e = null;
            this.f3121f.onCompleted();
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            this.f3120e = null;
            this.f3121f.onError(th);
        }

        @Override // p003l.m250
        public void onNext(T t) {
            if (this.f3120e.add(dv50.this.f3119a.call(t))) {
                this.f3121f.onNext(t);
            } else {
                m9242e(1L);
            }
        }
    }

    /* JADX INFO: renamed from: l.dv50$b */
    public static final class C0247b {
        static final dv50<?, ?> INSTANCE = new dv50<>(UtilityFunctions.m9944b());
    }

    public dv50(w9j<? super T, ? extends U> w9jVar) {
        this.f3119a = w9jVar;
    }

    /* JADX INFO: renamed from: b */
    public static <T> dv50<T, T> m3739b() {
        return (dv50<T, T>) C0247b.INSTANCE;
    }

    @Override // p003l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super T> z3g0Var) {
        return new C0246a(z3g0Var, z3g0Var);
    }
}
