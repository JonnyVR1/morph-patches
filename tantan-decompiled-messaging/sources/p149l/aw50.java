package p149l;

import java.util.ArrayDeque;
import java.util.Deque;
import p133rx.C22306c;
import p133rx.internal.operators.NotificationLite;

/* JADX INFO: loaded from: classes3.dex */
public class aw50<T> implements C22306c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final int f72013a;

    /* JADX INFO: renamed from: l.aw50$a */
    public class C15736a extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final NotificationLite<T> f72014e;

        /* JADX INFO: renamed from: f */
        public final Deque<Object> f72015f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ z3g0 f72016g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15736a(z3g0 z3g0Var, z3g0 z3g0Var2) {
            super(z3g0Var);
            this.f72016g = z3g0Var2;
            this.f72014e = NotificationLite.m221335f();
            this.f72015f = new ArrayDeque();
        }

        @Override // p149l.m250
        public void onCompleted() {
            this.f72016g.onCompleted();
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            this.f72016g.onError(th);
        }

        @Override // p149l.m250
        public void onNext(T t) {
            if (aw50.this.f72013a == 0) {
                this.f72016g.onNext(t);
                return;
            }
            if (this.f72015f.size() == aw50.this.f72013a) {
                this.f72016g.onNext(this.f72014e.m221340e(this.f72015f.removeFirst()));
            } else {
                m217048e(1L);
            }
            this.f72015f.offerLast(this.f72014e.m221344j(t));
        }
    }

    public aw50(int i) {
        if (i >= 0) {
            this.f72013a = i;
        } else {
            jwm.m143661a("count could not be negative");
            throw null;
        }
    }

    @Override // p149l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super T> z3g0Var) {
        return new C15736a(z3g0Var, z3g0Var);
    }
}
