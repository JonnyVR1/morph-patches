package p153l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p137rx.C22421c;
import p137rx.internal.producers.SingleDelayedProducer;

/* JADX INFO: loaded from: classes3.dex */
public final class e560<T> implements C22421c.c<List<T>, T> {

    /* JADX INFO: renamed from: c */
    public static final Comparator f92182c = new C16720c();

    /* JADX INFO: renamed from: a */
    public final Comparator<? super T> f92183a;

    /* JADX INFO: renamed from: b */
    public final int f92184b;

    /* JADX INFO: renamed from: l.e560$a */
    public class C16718a implements Comparator<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ rcj f92185a;

        public C16718a(rcj rcjVar) {
            this.f92185a = rcjVar;
        }

        @Override // java.util.Comparator
        public int compare(T t, T t2) {
            return ((Integer) this.f92185a.call(t, t2)).intValue();
        }
    }

    /* JADX INFO: renamed from: l.e560$b */
    public class C16719b extends gcg0<T> {

        /* JADX INFO: renamed from: e */
        public List<T> f92187e;

        /* JADX INFO: renamed from: f */
        public boolean f92188f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ SingleDelayedProducer f92189g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ gcg0 f92190h;

        public C16719b(SingleDelayedProducer singleDelayedProducer, gcg0 gcg0Var) {
            this.f92189g = singleDelayedProducer;
            this.f92190h = gcg0Var;
            this.f92187e = new ArrayList(e560.this.f92184b);
        }

        @Override // p153l.gcg0
        /* JADX INFO: renamed from: d */
        public void mo95884d() {
            m129868e(Long.MAX_VALUE);
        }

        @Override // p153l.bb50
        public void onCompleted() {
            if (this.f92188f) {
                return;
            }
            this.f92188f = true;
            List<T> list = this.f92187e;
            this.f92187e = null;
            try {
                Collections.sort(list, e560.this.f92183a);
                this.f92189g.setValue(list);
            } catch (Throwable th) {
                j6f.m143664f(th, this);
            }
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            this.f92190h.onError(th);
        }

        @Override // p153l.bb50
        public void onNext(T t) {
            if (this.f92188f) {
                return;
            }
            this.f92187e.add(t);
        }
    }

    /* JADX INFO: renamed from: l.e560$c */
    public static final class C16720c implements Comparator<Object> {
        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo((Comparable) obj2);
        }
    }

    public e560(rcj<? super T, ? super T, Integer> rcjVar, int i) {
        this.f92184b = i;
        this.f92183a = new C16718a(rcjVar);
    }

    @Override // p153l.qcj
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public gcg0<? super T> call(gcg0<? super List<T>> gcg0Var) {
        SingleDelayedProducer singleDelayedProducer = new SingleDelayedProducer(gcg0Var);
        C16719b c16719b = new C16719b(singleDelayedProducer, gcg0Var);
        gcg0Var.m129866b(c16719b);
        gcg0Var.mo95773f(singleDelayedProducer);
        return c16719b;
    }

    public e560(int i) {
        this.f92183a = f92182c;
        this.f92184b = i;
    }
}
