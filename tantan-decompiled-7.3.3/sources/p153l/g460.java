package p153l;

import java.util.ArrayDeque;
import java.util.Deque;
import p137rx.C22421c;
import p137rx.internal.operators.NotificationLite;

/* JADX INFO: loaded from: classes3.dex */
public class g460<T> implements C22421c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final int f102138a;

    /* JADX INFO: renamed from: l.g460$a */
    public class C17148a extends gcg0<T> {

        /* JADX INFO: renamed from: e */
        public final NotificationLite<T> f102139e;

        /* JADX INFO: renamed from: f */
        public final Deque<Object> f102140f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ gcg0 f102141g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17148a(gcg0 gcg0Var, gcg0 gcg0Var2) {
            super(gcg0Var);
            this.f102141g = gcg0Var2;
            this.f102139e = NotificationLite.m222581f();
            this.f102140f = new ArrayDeque();
        }

        @Override // p153l.bb50
        public void onCompleted() {
            this.f102141g.onCompleted();
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            this.f102141g.onError(th);
        }

        @Override // p153l.bb50
        public void onNext(T t) {
            if (g460.this.f102138a == 0) {
                this.f102141g.onNext(t);
                return;
            }
            if (this.f102140f.size() == g460.this.f102138a) {
                this.f102141g.onNext(this.f102139e.m222586e(this.f102140f.removeFirst()));
            } else {
                m129868e(1L);
            }
            this.f102140f.offerLast(this.f102139e.m222590j(t));
        }
    }

    public g460(int i) {
        if (i >= 0) {
            this.f102138a = i;
        } else {
            kym.m151996a("count could not be negative");
            throw null;
        }
    }

    @Override // p153l.qcj
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public gcg0<? super T> call(gcg0<? super T> gcg0Var) {
        return new C17148a(gcg0Var, gcg0Var);
    }
}
