package p149l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p133rx.C22306c;
import p133rx.internal.producers.SingleDelayedProducer;

/* JADX INFO: loaded from: classes3.dex */
public final class yw50<T> implements C22306c.c<List<T>, T> {

    /* JADX INFO: renamed from: c */
    public static final Comparator f200371c = new C21554c();

    /* JADX INFO: renamed from: a */
    public final Comparator<? super T> f200372a;

    /* JADX INFO: renamed from: b */
    public final int f200373b;

    /* JADX INFO: renamed from: l.yw50$a */
    public class C21552a implements Comparator<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ x9j f200374a;

        public C21552a(x9j x9jVar) {
            this.f200374a = x9jVar;
        }

        @Override // java.util.Comparator
        public int compare(T t, T t2) {
            return ((Integer) this.f200374a.call(t, t2)).intValue();
        }
    }

    /* JADX INFO: renamed from: l.yw50$b */
    public class C21553b extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public List<T> f200376e;

        /* JADX INFO: renamed from: f */
        public boolean f200377f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ SingleDelayedProducer f200378g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ z3g0 f200379h;

        public C21553b(SingleDelayedProducer singleDelayedProducer, z3g0 z3g0Var) {
            this.f200378g = singleDelayedProducer;
            this.f200379h = z3g0Var;
            this.f200376e = new ArrayList(yw50.this.f200373b);
        }

        @Override // p149l.z3g0
        /* JADX INFO: renamed from: d */
        public void mo99382d() {
            m217048e(Long.MAX_VALUE);
        }

        @Override // p149l.m250
        public void onCompleted() {
            if (this.f200377f) {
                return;
            }
            this.f200377f = true;
            List<T> list = this.f200376e;
            this.f200376e = null;
            try {
                Collections.sort(list, yw50.this.f200372a);
                this.f200378g.setValue(list);
            } catch (Throwable th) {
                f5f.m119492f(th, this);
            }
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            this.f200379h.onError(th);
        }

        @Override // p149l.m250
        public void onNext(T t) {
            if (this.f200377f) {
                return;
            }
            this.f200376e.add(t);
        }
    }

    /* JADX INFO: renamed from: l.yw50$c */
    public static final class C21554c implements Comparator<Object> {
        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo((Comparable) obj2);
        }
    }

    public yw50(x9j<? super T, ? super T, Integer> x9jVar, int i) {
        this.f200373b = i;
        this.f200372a = new C21552a(x9jVar);
    }

    @Override // p149l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super List<T>> z3g0Var) {
        SingleDelayedProducer singleDelayedProducer = new SingleDelayedProducer(z3g0Var);
        C21553b c21553b = new C21553b(singleDelayedProducer, z3g0Var);
        z3g0Var.m217046b(c21553b);
        z3g0Var.mo106696f(singleDelayedProducer);
        return c21553b;
    }

    public yw50(int i) {
        this.f200372a = f200371c;
        this.f200373b = i;
    }
}
