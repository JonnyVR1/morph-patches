package p149l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes3.dex */
public final class ww50<T, K, V> implements C22306c.c<Map<K, Collection<V>>, T> {

    /* JADX INFO: renamed from: a */
    public final w9j<? super T, ? extends K> f188331a;

    /* JADX INFO: renamed from: b */
    public final w9j<? super T, ? extends V> f188332b;

    /* JADX INFO: renamed from: c */
    public final v9j<? extends Map<K, Collection<V>>> f188333c;

    /* JADX INFO: renamed from: d */
    public final w9j<? super K, ? extends Collection<V>> f188334d;

    /* JADX INFO: renamed from: l.ww50$a */
    public class C20980a extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public Map<K, Collection<V>> f188335e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ Map f188336f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ z3g0 f188337g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20980a(z3g0 z3g0Var, Map map, z3g0 z3g0Var2) {
            super(z3g0Var);
            this.f188336f = map;
            this.f188337g = z3g0Var2;
            this.f188335e = map;
        }

        @Override // p149l.z3g0
        /* JADX INFO: renamed from: d */
        public void mo99382d() {
            m217048e(Long.MAX_VALUE);
        }

        @Override // p149l.m250
        public void onCompleted() {
            Map<K, Collection<V>> map = this.f188335e;
            this.f188335e = null;
            this.f188337g.onNext(map);
            this.f188337g.onCompleted();
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            this.f188335e = null;
            this.f188337g.onError(th);
        }

        @Override // p149l.m250
        public void onNext(T t) {
            try {
                K kCall = ww50.this.f188331a.call(t);
                V vCall = ww50.this.f188332b.call(t);
                Collection<V> collectionCall = this.f188335e.get(kCall);
                if (collectionCall == null) {
                    try {
                        collectionCall = ww50.this.f188334d.call(kCall);
                        this.f188335e.put(kCall, collectionCall);
                    } catch (Throwable th) {
                        f5f.m119492f(th, this.f188337g);
                        return;
                    }
                }
                collectionCall.add(vCall);
            } catch (Throwable th2) {
                f5f.m119492f(th2, this.f188337g);
            }
        }
    }

    /* JADX INFO: renamed from: l.ww50$b */
    public static final class C20981b<K, V> implements w9j<K, Collection<V>> {
        @Override // p149l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Collection<V> call(K k) {
            return new ArrayList();
        }
    }

    /* JADX INFO: renamed from: l.ww50$c */
    public static final class C20982c<K, V> implements v9j<Map<K, Collection<V>>> {
        @Override // p149l.v9j, java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map<K, Collection<V>> call() {
            return new HashMap();
        }
    }

    public ww50(w9j<? super T, ? extends K> w9jVar, w9j<? super T, ? extends V> w9jVar2) {
        this(w9jVar, w9jVar2, new C20982c(), new C20981b());
    }

    @Override // p149l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super Map<K, Collection<V>>> z3g0Var) {
        try {
            return new C20980a(z3g0Var, this.f188333c.call(), z3g0Var);
        } catch (Throwable th) {
            f5f.m119491e(th);
            z3g0Var.onError(th);
            z3g0<? super T> z3g0VarM94917a = a4g0.m94917a();
            z3g0VarM94917a.unsubscribe();
            return z3g0VarM94917a;
        }
    }

    public ww50(w9j<? super T, ? extends K> w9jVar, w9j<? super T, ? extends V> w9jVar2, v9j<? extends Map<K, Collection<V>>> v9jVar) {
        this(w9jVar, w9jVar2, v9jVar, new C20981b());
    }

    public ww50(w9j<? super T, ? extends K> w9jVar, w9j<? super T, ? extends V> w9jVar2, v9j<? extends Map<K, Collection<V>>> v9jVar, w9j<? super K, ? extends Collection<V>> w9jVar3) {
        this.f188331a = w9jVar;
        this.f188332b = w9jVar2;
        this.f188333c = v9jVar;
        this.f188334d = w9jVar3;
    }
}
