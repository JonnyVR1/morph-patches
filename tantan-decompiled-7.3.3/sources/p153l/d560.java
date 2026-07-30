package p153l;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import p137rx.C22421c;
import p137rx.internal.producers.SingleDelayedProducer;

/* JADX INFO: loaded from: classes3.dex */
public final class d560<T> implements C22421c.c<List<T>, T> {

    /* JADX INFO: renamed from: l.d560$a */
    public class C16452a extends gcg0<T> {

        /* JADX INFO: renamed from: e */
        public boolean f85126e;

        /* JADX INFO: renamed from: f */
        public List<T> f85127f = new LinkedList();

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ SingleDelayedProducer f85128g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ gcg0 f85129h;

        public C16452a(SingleDelayedProducer singleDelayedProducer, gcg0 gcg0Var) {
            this.f85128g = singleDelayedProducer;
            this.f85129h = gcg0Var;
        }

        @Override // p153l.gcg0
        /* JADX INFO: renamed from: d */
        public void mo95884d() {
            m129868e(Long.MAX_VALUE);
        }

        @Override // p153l.bb50
        public void onCompleted() {
            if (this.f85126e) {
                return;
            }
            this.f85126e = true;
            try {
                ArrayList arrayList = new ArrayList(this.f85127f);
                this.f85127f = null;
                this.f85128g.setValue(arrayList);
            } catch (Throwable th) {
                j6f.m143664f(th, this);
            }
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            this.f85129h.onError(th);
        }

        @Override // p153l.bb50
        public void onNext(T t) {
            if (this.f85126e) {
                return;
            }
            this.f85127f.add(t);
        }
    }

    /* JADX INFO: renamed from: l.d560$b */
    public static final class C16453b {
        static final d560<Object> INSTANCE = new d560<>();
    }

    /* JADX INFO: renamed from: b */
    public static <T> d560<T> m114290b() {
        return (d560<T>) C16453b.INSTANCE;
    }

    @Override // p153l.qcj
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public gcg0<? super T> call(gcg0<? super List<T>> gcg0Var) {
        SingleDelayedProducer singleDelayedProducer = new SingleDelayedProducer(gcg0Var);
        C16452a c16452a = new C16452a(singleDelayedProducer, gcg0Var);
        gcg0Var.m129866b(c16452a);
        gcg0Var.mo95773f(singleDelayedProducer);
        return c16452a;
    }
}
