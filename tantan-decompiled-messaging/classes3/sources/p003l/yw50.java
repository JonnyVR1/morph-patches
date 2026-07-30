package p003l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p014rx.C1099c;
import p014rx.internal.producers.SingleDelayedProducer;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class yw50<T> implements C1099c.c<List<T>, T> {

    /* JADX INFO: renamed from: c */
    public static final Comparator f9166c = new C0670c();

    /* JADX INFO: renamed from: a */
    public final Comparator<? super T> f9167a;

    /* JADX INFO: renamed from: b */
    public final int f9168b;

    /* JADX INFO: renamed from: l.yw50$a */
    public class C0668a implements Comparator<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ x9j f9169a;

        public C0668a(x9j x9jVar) {
            this.f9169a = x9jVar;
        }

        @Override // java.util.Comparator
        public int compare(T t, T t2) {
            return ((Integer) this.f9169a.call(t, t2)).intValue();
        }
    }

    /* JADX INFO: renamed from: l.yw50$b */
    public class C0669b extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public List<T> f9171e;

        /* JADX INFO: renamed from: f */
        public boolean f9172f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ SingleDelayedProducer f9173g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ z3g0 f9174h;

        public C0669b(SingleDelayedProducer singleDelayedProducer, z3g0 z3g0Var) {
            this.f9173g = singleDelayedProducer;
            this.f9174h = z3g0Var;
            this.f9171e = new ArrayList(yw50.this.f9168b);
        }

        @Override // p003l.z3g0
        /* JADX INFO: renamed from: d */
        public void mo2918d() {
            m9242e(Long.MAX_VALUE);
        }

        @Override // p003l.m250
        public void onCompleted() {
            if (this.f9172f) {
                return;
            }
            this.f9172f = true;
            List<T> list = this.f9171e;
            this.f9171e = null;
            try {
                Collections.sort(list, yw50.this.f9167a);
                this.f9173g.setValue(list);
            } catch (Throwable th) {
                f5f.m3965f(th, this);
            }
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            this.f9174h.onError(th);
        }

        @Override // p003l.m250
        public void onNext(T t) {
            if (this.f9172f) {
                return;
            }
            this.f9171e.add(t);
        }
    }

    /* JADX INFO: renamed from: l.yw50$c */
    public static final class C0670c implements Comparator<Object> {
        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo((Comparable) obj2);
        }
    }

    public yw50(x9j<? super T, ? super T, Integer> x9jVar, int i) {
        this.f9168b = i;
        this.f9167a = new C0668a(x9jVar);
    }

    @Override // p003l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super List<T>> z3g0Var) {
        SingleDelayedProducer singleDelayedProducer = new SingleDelayedProducer(z3g0Var);
        C0669b c0669b = new C0669b(singleDelayedProducer, z3g0Var);
        z3g0Var.m9240b(c0669b);
        z3g0Var.mo3257f(singleDelayedProducer);
        return c0669b;
    }

    public yw50(int i) {
        this.f9167a = f9166c;
        this.f9168b = i;
    }
}
