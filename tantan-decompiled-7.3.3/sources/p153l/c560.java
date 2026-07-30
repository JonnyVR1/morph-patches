package p153l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
public final class c560<T, K, V> implements C22421c.c<Map<K, Collection<V>>, T> {

    /* JADX INFO: renamed from: a */
    public final qcj<? super T, ? extends K> f79800a;

    /* JADX INFO: renamed from: b */
    public final qcj<? super T, ? extends V> f79801b;

    /* JADX INFO: renamed from: c */
    public final pcj<? extends Map<K, Collection<V>>> f79802c;

    /* JADX INFO: renamed from: d */
    public final qcj<? super K, ? extends Collection<V>> f79803d;

    /* JADX INFO: renamed from: l.c560$a */
    public class C16188a extends gcg0<T> {

        /* JADX INFO: renamed from: e */
        public Map<K, Collection<V>> f79804e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ Map f79805f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ gcg0 f79806g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16188a(gcg0 gcg0Var, Map map, gcg0 gcg0Var2) {
            super(gcg0Var);
            this.f79805f = map;
            this.f79806g = gcg0Var2;
            this.f79804e = map;
        }

        @Override // p153l.gcg0
        /* JADX INFO: renamed from: d */
        public void mo95884d() {
            m129868e(Long.MAX_VALUE);
        }

        @Override // p153l.bb50
        public void onCompleted() {
            Map<K, Collection<V>> map = this.f79804e;
            this.f79804e = null;
            this.f79806g.onNext(map);
            this.f79806g.onCompleted();
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            this.f79804e = null;
            this.f79806g.onError(th);
        }

        @Override // p153l.bb50
        public void onNext(T t) {
            try {
                K kCall = c560.this.f79800a.call(t);
                V vCall = c560.this.f79801b.call(t);
                Collection<V> collectionCall = this.f79804e.get(kCall);
                if (collectionCall == null) {
                    try {
                        collectionCall = c560.this.f79803d.call(kCall);
                        this.f79804e.put(kCall, collectionCall);
                    } catch (Throwable th) {
                        j6f.m143664f(th, this.f79806g);
                        return;
                    }
                }
                collectionCall.add(vCall);
            } catch (Throwable th2) {
                j6f.m143664f(th2, this.f79806g);
            }
        }
    }

    /* JADX INFO: renamed from: l.c560$b */
    public static final class C16189b<K, V> implements qcj<K, Collection<V>> {
        @Override // p153l.qcj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Collection<V> call(K k) {
            return new ArrayList();
        }
    }

    /* JADX INFO: renamed from: l.c560$c */
    public static final class C16190c<K, V> implements pcj<Map<K, Collection<V>>> {
        @Override // p153l.pcj, java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map<K, Collection<V>> call() {
            return new HashMap();
        }
    }

    public c560(qcj<? super T, ? extends K> qcjVar, qcj<? super T, ? extends V> qcjVar2) {
        this(qcjVar, qcjVar2, new C16190c(), new C16189b());
    }

    @Override // p153l.qcj
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public gcg0<? super T> call(gcg0<? super Map<K, Collection<V>>> gcg0Var) {
        try {
            return new C16188a(gcg0Var, this.f79802c.call(), gcg0Var);
        } catch (Throwable th) {
            j6f.m143663e(th);
            gcg0Var.onError(th);
            gcg0<? super T> gcg0VarM139434a = icg0.m139434a();
            gcg0VarM139434a.unsubscribe();
            return gcg0VarM139434a;
        }
    }

    public c560(qcj<? super T, ? extends K> qcjVar, qcj<? super T, ? extends V> qcjVar2, pcj<? extends Map<K, Collection<V>>> pcjVar) {
        this(qcjVar, qcjVar2, pcjVar, new C16189b());
    }

    public c560(qcj<? super T, ? extends K> qcjVar, qcj<? super T, ? extends V> qcjVar2, pcj<? extends Map<K, Collection<V>>> pcjVar, qcj<? super K, ? extends Collection<V>> qcjVar3) {
        this.f79800a = qcjVar;
        this.f79801b = qcjVar2;
        this.f79802c = pcjVar;
        this.f79803d = qcjVar3;
    }
}
