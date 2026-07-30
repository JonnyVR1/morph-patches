package p003l;

import java.util.HashMap;
import java.util.Map;
import p014rx.C1099c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class vw50<T, K, V> implements C1099c.c<Map<K, V>, T> {

    /* JADX INFO: renamed from: a */
    public final w9j<? super T, ? extends K> f8450a;

    /* JADX INFO: renamed from: b */
    public final w9j<? super T, ? extends V> f8451b;

    /* JADX INFO: renamed from: c */
    public final v9j<? extends Map<K, V>> f8452c;

    /* JADX INFO: renamed from: l.vw50$a */
    public class C0603a extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public Map<K, V> f8453e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ Map f8454f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ z3g0 f8455g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0603a(z3g0 z3g0Var, Map map, z3g0 z3g0Var2) {
            super(z3g0Var);
            this.f8454f = map;
            this.f8455g = z3g0Var2;
            this.f8453e = map;
        }

        @Override // p003l.z3g0
        /* JADX INFO: renamed from: d */
        public void mo2918d() {
            m9242e(Long.MAX_VALUE);
        }

        @Override // p003l.m250
        public void onCompleted() {
            Map<K, V> map = this.f8453e;
            this.f8453e = null;
            this.f8455g.onNext(map);
            this.f8455g.onCompleted();
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            this.f8453e = null;
            this.f8455g.onError(th);
        }

        @Override // p003l.m250
        public void onNext(T t) {
            try {
                this.f8453e.put(vw50.this.f8450a.call(t), vw50.this.f8451b.call(t));
            } catch (Throwable th) {
                f5f.m3965f(th, this.f8455g);
            }
        }
    }

    /* JADX INFO: renamed from: l.vw50$b */
    public static final class C0604b<K, V> implements v9j<Map<K, V>> {
        @Override // p003l.v9j, java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map<K, V> call() {
            return new HashMap();
        }
    }

    public vw50(w9j<? super T, ? extends K> w9jVar, w9j<? super T, ? extends V> w9jVar2, v9j<? extends Map<K, V>> v9jVar) {
        this.f8450a = w9jVar;
        this.f8451b = w9jVar2;
        this.f8452c = v9jVar;
    }

    @Override // p003l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super Map<K, V>> z3g0Var) {
        try {
            return new C0603a(z3g0Var, this.f8452c.call(), z3g0Var);
        } catch (Throwable th) {
            f5f.m3965f(th, z3g0Var);
            z3g0<? super T> z3g0VarM2741a = a4g0.m2741a();
            z3g0VarM2741a.unsubscribe();
            return z3g0VarM2741a;
        }
    }

    public vw50(w9j<? super T, ? extends K> w9jVar, w9j<? super T, ? extends V> w9jVar2) {
        this(w9jVar, w9jVar2, new C0604b());
    }
}
