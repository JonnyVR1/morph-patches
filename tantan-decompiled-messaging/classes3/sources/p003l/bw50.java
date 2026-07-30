package p003l;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.TimeUnit;
import p014rx.C1099c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class bw50<T> implements C1099c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final long f2519a;

    /* JADX INFO: renamed from: b */
    public final bud0 f2520b;

    /* JADX INFO: renamed from: l.bw50$a */
    public class C0188a extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public Deque<hri0<T>> f2521e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ z3g0 f2522f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0188a(z3g0 z3g0Var, z3g0 z3g0Var2) {
            super(z3g0Var);
            this.f2522f = z3g0Var2;
            this.f2521e = new ArrayDeque();
        }

        /* JADX INFO: renamed from: g */
        public final void m3192g(long j) {
            long j2 = j - bw50.this.f2519a;
            while (!this.f2521e.isEmpty()) {
                hri0<T> first = this.f2521e.getFirst();
                if (first.m4995a() >= j2) {
                    return;
                }
                this.f2521e.removeFirst();
                this.f2522f.onNext(first.m4996b());
            }
        }

        @Override // p003l.m250
        public void onCompleted() {
            m3192g(bw50.this.f2520b.now());
            this.f2522f.onCompleted();
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            this.f2522f.onError(th);
        }

        @Override // p003l.m250
        public void onNext(T t) {
            long jNow = bw50.this.f2520b.now();
            m3192g(jNow);
            this.f2521e.offerLast(new hri0<>(jNow, t));
        }
    }

    public bw50(long j, TimeUnit timeUnit, bud0 bud0Var) {
        this.f2519a = timeUnit.toMillis(j);
        this.f2520b = bud0Var;
    }

    @Override // p003l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super T> z3g0Var) {
        return new C0188a(z3g0Var, z3g0Var);
    }
}
