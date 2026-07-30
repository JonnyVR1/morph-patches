package p149l;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes3.dex */
public class bw50<T> implements C22306c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final long f77583a;

    /* JADX INFO: renamed from: b */
    public final bud0 f77584b;

    /* JADX INFO: renamed from: l.bw50$a */
    public class C15994a extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public Deque<hri0<T>> f77585e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ z3g0 f77586f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15994a(z3g0 z3g0Var, z3g0 z3g0Var2) {
            super(z3g0Var);
            this.f77586f = z3g0Var2;
            this.f77585e = new ArrayDeque();
        }

        /* JADX INFO: renamed from: g */
        public final void m104131g(long j) {
            long j2 = j - bw50.this.f77583a;
            while (!this.f77585e.isEmpty()) {
                hri0<T> first = this.f77585e.getFirst();
                if (first.m132687a() >= j2) {
                    return;
                }
                this.f77585e.removeFirst();
                this.f77586f.onNext(first.m132688b());
            }
        }

        @Override // p149l.m250
        public void onCompleted() {
            m104131g(bw50.this.f77584b.now());
            this.f77586f.onCompleted();
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            this.f77586f.onError(th);
        }

        @Override // p149l.m250
        public void onNext(T t) {
            long jNow = bw50.this.f77584b.now();
            m104131g(jNow);
            this.f77585e.offerLast(new hri0<>(jNow, t));
        }
    }

    public bw50(long j, TimeUnit timeUnit, bud0 bud0Var) {
        this.f77583a = timeUnit.toMillis(j);
        this.f77584b = bud0Var;
    }

    @Override // p149l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super T> z3g0Var) {
        return new C15994a(z3g0Var, z3g0Var);
    }
}
