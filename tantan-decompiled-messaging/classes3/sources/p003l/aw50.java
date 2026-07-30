package p003l;

import java.util.ArrayDeque;
import java.util.Deque;
import l.jwm;
import p014rx.C1099c;
import p014rx.internal.operators.NotificationLite;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class aw50<T> implements C1099c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final int f2303a;

    /* JADX INFO: renamed from: l.aw50$a */
    public class C0167a extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final NotificationLite<T> f2304e;

        /* JADX INFO: renamed from: f */
        public final Deque<Object> f2305f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ z3g0 f2306g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0167a(z3g0 z3g0Var, z3g0 z3g0Var2) {
            super(z3g0Var);
            this.f2306g = z3g0Var2;
            this.f2304e = NotificationLite.m9792f();
            this.f2305f = new ArrayDeque();
        }

        @Override // p003l.m250
        public void onCompleted() {
            this.f2306g.onCompleted();
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            this.f2306g.onError(th);
        }

        @Override // p003l.m250
        public void onNext(T t) {
            if (aw50.this.f2303a == 0) {
                this.f2306g.onNext(t);
                return;
            }
            if (this.f2305f.size() == aw50.this.f2303a) {
                this.f2306g.onNext(this.f2304e.m9797e(this.f2305f.removeFirst()));
            } else {
                m9242e(1L);
            }
            this.f2305f.offerLast(this.f2304e.m9801j(t));
        }
    }

    public aw50(int i) {
        if (i >= 0) {
            this.f2303a = i;
        } else {
            jwm.a("count could not be negative");
            throw null;
        }
    }

    @Override // p003l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super T> z3g0Var) {
        return new C0167a(z3g0Var, z3g0Var);
    }
}
