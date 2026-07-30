package p153l;

import java.util.HashMap;
import java.util.Map;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
public final class b560<T, K, V> implements C22421c.c<Map<K, V>, T> {

    /* JADX INFO: renamed from: a */
    public final qcj<? super T, ? extends K> f75028a;

    /* JADX INFO: renamed from: b */
    public final qcj<? super T, ? extends V> f75029b;

    /* JADX INFO: renamed from: c */
    public final pcj<? extends Map<K, V>> f75030c;

    /* JADX INFO: renamed from: l.b560$a */
    public class C15931a extends gcg0<T> {

        /* JADX INFO: renamed from: e */
        public Map<K, V> f75031e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ Map f75032f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ gcg0 f75033g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15931a(gcg0 gcg0Var, Map map, gcg0 gcg0Var2) {
            super(gcg0Var);
            this.f75032f = map;
            this.f75033g = gcg0Var2;
            this.f75031e = map;
        }

        @Override // p153l.gcg0
        /* JADX INFO: renamed from: d */
        public void mo95884d() {
            m129868e(Long.MAX_VALUE);
        }

        @Override // p153l.bb50
        public void onCompleted() {
            Map<K, V> map = this.f75031e;
            this.f75031e = null;
            this.f75033g.onNext(map);
            this.f75033g.onCompleted();
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            this.f75031e = null;
            this.f75033g.onError(th);
        }

        @Override // p153l.bb50
        public void onNext(T t) {
            try {
                this.f75031e.put(b560.this.f75028a.call(t), b560.this.f75029b.call(t));
            } catch (Throwable th) {
                j6f.m143664f(th, this.f75033g);
            }
        }
    }

    /* JADX INFO: renamed from: l.b560$b */
    public static final class C15932b<K, V> implements pcj<Map<K, V>> {
        @Override // p153l.pcj, java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map<K, V> call() {
            return new HashMap();
        }
    }

    public b560(qcj<? super T, ? extends K> qcjVar, qcj<? super T, ? extends V> qcjVar2, pcj<? extends Map<K, V>> pcjVar) {
        this.f75028a = qcjVar;
        this.f75029b = qcjVar2;
        this.f75030c = pcjVar;
    }

    @Override // p153l.qcj
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public gcg0<? super T> call(gcg0<? super Map<K, V>> gcg0Var) {
        try {
            return new C15931a(gcg0Var, this.f75030c.call(), gcg0Var);
        } catch (Throwable th) {
            j6f.m143664f(th, gcg0Var);
            gcg0<? super T> gcg0VarM139434a = icg0.m139434a();
            gcg0VarM139434a.unsubscribe();
            return gcg0VarM139434a;
        }
    }

    public b560(qcj<? super T, ? extends K> qcjVar, qcj<? super T, ? extends V> qcjVar2) {
        this(qcjVar, qcjVar2, new C15932b());
    }
}
