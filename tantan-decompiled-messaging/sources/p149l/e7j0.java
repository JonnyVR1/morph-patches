package p149l;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class e7j0 extends bud0 {
    public static final e7j0 INSTANCE = new e7j0();

    /* JADX INFO: renamed from: l.e7j0$a */
    public static final class C16557a extends bud0.AbstractC15976a implements c4g0 {

        /* JADX INFO: renamed from: a */
        public final AtomicInteger f89712a = new AtomicInteger();

        /* JADX INFO: renamed from: b */
        public final PriorityBlockingQueue<C16558b> f89713b = new PriorityBlockingQueue<>();

        /* JADX INFO: renamed from: c */
        public final u53 f89714c = new u53();

        /* JADX INFO: renamed from: d */
        public final AtomicInteger f89715d = new AtomicInteger();

        /* JADX INFO: renamed from: l.e7j0$a$a */
        public class a implements d30 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C16558b f89716a;

            public a(C16558b c16558b) {
                this.f89716a = c16558b;
            }

            @Override // p149l.d30
            public void call() {
                C16557a.this.f89713b.remove(this.f89716a);
            }
        }

        @Override // p149l.bud0.AbstractC15976a
        /* JADX INFO: renamed from: b */
        public c4g0 mo99201b(d30 d30Var) {
            return m115202e(d30Var, mo103919a());
        }

        @Override // p149l.bud0.AbstractC15976a
        /* JADX INFO: renamed from: c */
        public c4g0 mo99202c(d30 d30Var, long j, TimeUnit timeUnit) {
            long jMo103919a = mo103919a() + timeUnit.toMillis(j);
            return m115202e(new mjf0(d30Var, this, jMo103919a), jMo103919a);
        }

        /* JADX INFO: renamed from: e */
        public final c4g0 m115202e(d30 d30Var, long j) {
            if (this.f89714c.isUnsubscribed()) {
                return h4g0.m129243d();
            }
            C16558b c16558b = new C16558b(d30Var, Long.valueOf(j), this.f89712a.incrementAndGet());
            this.f89713b.add(c16558b);
            if (this.f89715d.getAndIncrement() != 0) {
                return h4g0.m129240a(new a(c16558b));
            }
            do {
                C16558b c16558bPoll = this.f89713b.poll();
                if (c16558bPoll != null) {
                    c16558bPoll.f89718a.call();
                }
            } while (this.f89715d.decrementAndGet() > 0);
            return h4g0.m129243d();
        }

        @Override // p149l.c4g0
        public boolean isUnsubscribed() {
            return this.f89714c.isUnsubscribed();
        }

        @Override // p149l.c4g0
        public void unsubscribe() {
            this.f89714c.unsubscribe();
        }
    }

    /* JADX INFO: renamed from: l.e7j0$b */
    public static final class C16558b implements Comparable<C16558b> {

        /* JADX INFO: renamed from: a */
        public final d30 f89718a;

        /* JADX INFO: renamed from: b */
        public final Long f89719b;

        /* JADX INFO: renamed from: c */
        public final int f89720c;

        public C16558b(d30 d30Var, Long l2, int i) {
            this.f89718a = d30Var;
            this.f89719b = l2;
            this.f89720c = i;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(C16558b c16558b) {
            int iCompareTo = this.f89719b.compareTo(c16558b.f89719b);
            return iCompareTo == 0 ? e7j0.m115201a(this.f89720c, c16558b.f89720c) : iCompareTo;
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m115201a(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    @Override // p149l.bud0
    public bud0.AbstractC15976a createWorker() {
        return new C16557a();
    }
}
