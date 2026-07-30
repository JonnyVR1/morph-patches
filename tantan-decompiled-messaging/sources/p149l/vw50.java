package p149l;

import java.util.HashMap;
import java.util.Map;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes3.dex */
public final class vw50<T, K, V> implements C22306c.c<Map<K, V>, T> {

    /* JADX INFO: renamed from: a */
    public final w9j<? super T, ? extends K> f183307a;

    /* JADX INFO: renamed from: b */
    public final w9j<? super T, ? extends V> f183308b;

    /* JADX INFO: renamed from: c */
    public final v9j<? extends Map<K, V>> f183309c;

    /* JADX INFO: renamed from: l.vw50$a */
    public class C20743a extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public Map<K, V> f183310e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ Map f183311f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ z3g0 f183312g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20743a(z3g0 z3g0Var, Map map, z3g0 z3g0Var2) {
            super(z3g0Var);
            this.f183311f = map;
            this.f183312g = z3g0Var2;
            this.f183310e = map;
        }

        @Override // p149l.z3g0
        /* JADX INFO: renamed from: d */
        public void mo99382d() {
            m217048e(Long.MAX_VALUE);
        }

        @Override // p149l.m250
        public void onCompleted() {
            Map<K, V> map = this.f183310e;
            this.f183310e = null;
            this.f183312g.onNext(map);
            this.f183312g.onCompleted();
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            this.f183310e = null;
            this.f183312g.onError(th);
        }

        @Override // p149l.m250
        public void onNext(T t) {
            try {
                this.f183310e.put(vw50.this.f183307a.call(t), vw50.this.f183308b.call(t));
            } catch (Throwable th) {
                f5f.m119492f(th, this.f183312g);
            }
        }
    }

    /* JADX INFO: renamed from: l.vw50$b */
    public static final class C20744b<K, V> implements v9j<Map<K, V>> {
        @Override // p149l.v9j, java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map<K, V> call() {
            return new HashMap();
        }
    }

    public vw50(w9j<? super T, ? extends K> w9jVar, w9j<? super T, ? extends V> w9jVar2, v9j<? extends Map<K, V>> v9jVar) {
        this.f183307a = w9jVar;
        this.f183308b = w9jVar2;
        this.f183309c = v9jVar;
    }

    @Override // p149l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super Map<K, V>> z3g0Var) {
        try {
            return new C20743a(z3g0Var, this.f183309c.call(), z3g0Var);
        } catch (Throwable th) {
            f5f.m119492f(th, z3g0Var);
            z3g0<? super T> z3g0VarM94917a = a4g0.m94917a();
            z3g0VarM94917a.unsubscribe();
            return z3g0VarM94917a;
        }
    }

    public vw50(w9j<? super T, ? extends K> w9jVar, w9j<? super T, ? extends V> w9jVar2) {
        this(w9jVar, w9jVar2, new C20744b());
    }
}
