package p149l;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import p133rx.C22306c;
import p133rx.internal.producers.SingleDelayedProducer;

/* JADX INFO: loaded from: classes3.dex */
public final class xw50<T> implements C22306c.c<List<T>, T> {

    /* JADX INFO: renamed from: l.xw50$a */
    public class C21247a extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public boolean f194700e;

        /* JADX INFO: renamed from: f */
        public List<T> f194701f = new LinkedList();

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ SingleDelayedProducer f194702g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ z3g0 f194703h;

        public C21247a(SingleDelayedProducer singleDelayedProducer, z3g0 z3g0Var) {
            this.f194702g = singleDelayedProducer;
            this.f194703h = z3g0Var;
        }

        @Override // p149l.z3g0
        /* JADX INFO: renamed from: d */
        public void mo99382d() {
            m217048e(Long.MAX_VALUE);
        }

        @Override // p149l.m250
        public void onCompleted() {
            if (this.f194700e) {
                return;
            }
            this.f194700e = true;
            try {
                ArrayList arrayList = new ArrayList(this.f194701f);
                this.f194701f = null;
                this.f194702g.setValue(arrayList);
            } catch (Throwable th) {
                f5f.m119492f(th, this);
            }
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            this.f194703h.onError(th);
        }

        @Override // p149l.m250
        public void onNext(T t) {
            if (this.f194700e) {
                return;
            }
            this.f194701f.add(t);
        }
    }

    /* JADX INFO: renamed from: l.xw50$b */
    public static final class C21248b {
        static final xw50<Object> INSTANCE = new xw50<>();
    }

    /* JADX INFO: renamed from: b */
    public static <T> xw50<T> m211315b() {
        return (xw50<T>) C21248b.INSTANCE;
    }

    @Override // p149l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super List<T>> z3g0Var) {
        SingleDelayedProducer singleDelayedProducer = new SingleDelayedProducer(z3g0Var);
        C21247a c21247a = new C21247a(singleDelayedProducer, z3g0Var);
        z3g0Var.m217046b(c21247a);
        z3g0Var.mo106696f(singleDelayedProducer);
        return c21247a;
    }
}
