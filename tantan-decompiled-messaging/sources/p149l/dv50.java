package p149l;

import java.util.HashSet;
import java.util.Set;
import p133rx.C22306c;
import p133rx.internal.util.UtilityFunctions;

/* JADX INFO: loaded from: classes3.dex */
public final class dv50<T, U> implements C22306c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final w9j<? super T, ? extends U> f88035a;

    /* JADX INFO: renamed from: l.dv50$a */
    public class C16475a extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public Set<U> f88036e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ z3g0 f88037f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16475a(z3g0 z3g0Var, z3g0 z3g0Var2) {
            super(z3g0Var);
            this.f88037f = z3g0Var2;
            this.f88036e = new HashSet();
        }

        @Override // p149l.m250
        public void onCompleted() {
            this.f88036e = null;
            this.f88037f.onCompleted();
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            this.f88036e = null;
            this.f88037f.onError(th);
        }

        @Override // p149l.m250
        public void onNext(T t) {
            if (this.f88036e.add(dv50.this.f88035a.call(t))) {
                this.f88037f.onNext(t);
            } else {
                m217048e(1L);
            }
        }
    }

    /* JADX INFO: renamed from: l.dv50$b */
    public static final class C16476b {
        static final dv50<?, ?> INSTANCE = new dv50<>(UtilityFunctions.m221487b());
    }

    public dv50(w9j<? super T, ? extends U> w9jVar) {
        this.f88035a = w9jVar;
    }

    /* JADX INFO: renamed from: b */
    public static <T> dv50<T, T> m113763b() {
        return (dv50<T, T>) C16476b.INSTANCE;
    }

    @Override // p149l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super T> z3g0Var) {
        return new C16475a(z3g0Var, z3g0Var);
    }
}
