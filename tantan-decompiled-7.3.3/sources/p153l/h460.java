package p153l;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
public class h460<T> implements C22421c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final long f107754a;

    /* JADX INFO: renamed from: b */
    public final f2e0 f107755b;

    /* JADX INFO: renamed from: l.h460$a */
    public class C17388a extends gcg0<T> {

        /* JADX INFO: renamed from: e */
        public Deque<k0j0<T>> f107756e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ gcg0 f107757f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17388a(gcg0 gcg0Var, gcg0 gcg0Var2) {
            super(gcg0Var);
            this.f107757f = gcg0Var2;
            this.f107756e = new ArrayDeque();
        }

        /* JADX INFO: renamed from: g */
        public final void m133545g(long j) {
            long j2 = j - h460.this.f107754a;
            while (!this.f107756e.isEmpty()) {
                k0j0<T> first = this.f107756e.getFirst();
                if (first.m147793a() >= j2) {
                    return;
                }
                this.f107756e.removeFirst();
                this.f107757f.onNext(first.m147794b());
            }
        }

        @Override // p153l.bb50
        public void onCompleted() {
            m133545g(h460.this.f107755b.now());
            this.f107757f.onCompleted();
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            this.f107757f.onError(th);
        }

        @Override // p153l.bb50
        public void onNext(T t) {
            long jNow = h460.this.f107755b.now();
            m133545g(jNow);
            this.f107756e.offerLast(new k0j0<>(jNow, t));
        }
    }

    public h460(long j, TimeUnit timeUnit, f2e0 f2e0Var) {
        this.f107754a = timeUnit.toMillis(j);
        this.f107755b = f2e0Var;
    }

    @Override // p153l.qcj
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public gcg0<? super T> call(gcg0<? super T> gcg0Var) {
        return new C17388a(gcg0Var, gcg0Var);
    }
}
