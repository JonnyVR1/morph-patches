package p003l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import p014rx.C1099c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class ww50<T, K, V> implements C1099c.c<Map<K, Collection<V>>, T> {

    /* JADX INFO: renamed from: a */
    public final w9j<? super T, ? extends K> f8628a;

    /* JADX INFO: renamed from: b */
    public final w9j<? super T, ? extends V> f8629b;

    /* JADX INFO: renamed from: c */
    public final v9j<? extends Map<K, Collection<V>>> f8630c;

    /* JADX INFO: renamed from: d */
    public final w9j<? super K, ? extends Collection<V>> f8631d;

    /* JADX INFO: renamed from: l.ww50$a */
    public class C0621a extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public Map<K, Collection<V>> f8632e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ Map f8633f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ z3g0 f8634g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0621a(z3g0 z3g0Var, Map map, z3g0 z3g0Var2) {
            super(z3g0Var);
            this.f8633f = map;
            this.f8634g = z3g0Var2;
            this.f8632e = map;
        }

        @Override // p003l.z3g0
        /* JADX INFO: renamed from: d */
        public void mo2918d() {
            m9242e(Long.MAX_VALUE);
        }

        @Override // p003l.m250
        public void onCompleted() {
            Map<K, Collection<V>> map = this.f8632e;
            this.f8632e = null;
            this.f8634g.onNext(map);
            this.f8634g.onCompleted();
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            this.f8632e = null;
            this.f8634g.onError(th);
        }

        @Override // p003l.m250
        public void onNext(T t) {
            try {
                K kCall = ww50.this.f8628a.call(t);
                V vCall = ww50.this.f8629b.call(t);
                Collection<V> collectionCall = this.f8632e.get(kCall);
                if (collectionCall == null) {
                    try {
                        collectionCall = ww50.this.f8631d.call(kCall);
                        this.f8632e.put(kCall, collectionCall);
                    } catch (Throwable th) {
                        f5f.m3965f(th, this.f8634g);
                        return;
                    }
                }
                collectionCall.add(vCall);
            } catch (Throwable th2) {
                f5f.m3965f(th2, this.f8634g);
            }
        }
    }

    /* JADX INFO: renamed from: l.ww50$b */
    public static final class C0622b<K, V> implements w9j<K, Collection<V>> {
        @Override // p003l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Collection<V> call(K k) {
            return new ArrayList();
        }
    }

    /* JADX INFO: renamed from: l.ww50$c */
    public static final class C0623c<K, V> implements v9j<Map<K, Collection<V>>> {
        @Override // p003l.v9j, java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map<K, Collection<V>> call() {
            return new HashMap();
        }
    }

    public ww50(w9j<? super T, ? extends K> w9jVar, w9j<? super T, ? extends V> w9jVar2) {
        this(w9jVar, w9jVar2, new C0623c(), new C0622b());
    }

    @Override // p003l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super Map<K, Collection<V>>> z3g0Var) {
        try {
            return new C0621a(z3g0Var, this.f8630c.call(), z3g0Var);
        } catch (Throwable th) {
            f5f.m3964e(th);
            z3g0Var.onError(th);
            z3g0<? super T> z3g0VarM2741a = a4g0.m2741a();
            z3g0VarM2741a.unsubscribe();
            return z3g0VarM2741a;
        }
    }

    public ww50(w9j<? super T, ? extends K> w9jVar, w9j<? super T, ? extends V> w9jVar2, v9j<? extends Map<K, Collection<V>>> v9jVar) {
        this(w9jVar, w9jVar2, v9jVar, new C0622b());
    }

    public ww50(w9j<? super T, ? extends K> w9jVar, w9j<? super T, ? extends V> w9jVar2, v9j<? extends Map<K, Collection<V>>> v9jVar, w9j<? super K, ? extends Collection<V>> w9jVar3) {
        this.f8628a = w9jVar;
        this.f8629b = w9jVar2;
        this.f8630c = v9jVar;
        this.f8631d = w9jVar3;
    }
}
