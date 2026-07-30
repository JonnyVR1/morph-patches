package p003l;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import p014rx.C1099c;
import p014rx.internal.producers.SingleDelayedProducer;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class xw50<T> implements C1099c.c<List<T>, T> {

    /* JADX INFO: renamed from: l.xw50$a */
    public class C0649a extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public boolean f8867e;

        /* JADX INFO: renamed from: f */
        public List<T> f8868f = new LinkedList();

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ SingleDelayedProducer f8869g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ z3g0 f8870h;

        public C0649a(SingleDelayedProducer singleDelayedProducer, z3g0 z3g0Var) {
            this.f8869g = singleDelayedProducer;
            this.f8870h = z3g0Var;
        }

        @Override // p003l.z3g0
        /* JADX INFO: renamed from: d */
        public void mo2918d() {
            m9242e(Long.MAX_VALUE);
        }

        @Override // p003l.m250
        public void onCompleted() {
            if (this.f8867e) {
                return;
            }
            this.f8867e = true;
            try {
                ArrayList arrayList = new ArrayList(this.f8868f);
                this.f8868f = null;
                this.f8869g.setValue(arrayList);
            } catch (Throwable th) {
                f5f.m3965f(th, this);
            }
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            this.f8870h.onError(th);
        }

        @Override // p003l.m250
        public void onNext(T t) {
            if (this.f8867e) {
                return;
            }
            this.f8868f.add(t);
        }
    }

    /* JADX INFO: renamed from: l.xw50$b */
    public static final class C0650b {
        static final xw50<Object> INSTANCE = new xw50<>();
    }

    /* JADX INFO: renamed from: b */
    public static <T> xw50<T> m8873b() {
        return (xw50<T>) C0650b.INSTANCE;
    }

    @Override // p003l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super List<T>> z3g0Var) {
        SingleDelayedProducer singleDelayedProducer = new SingleDelayedProducer(z3g0Var);
        C0649a c0649a = new C0649a(singleDelayedProducer, z3g0Var);
        z3g0Var.m9240b(c0649a);
        z3g0Var.mo3257f(singleDelayedProducer);
        return c0649a;
    }
}
