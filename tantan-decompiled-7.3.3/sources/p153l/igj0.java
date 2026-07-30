package p153l;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class igj0 extends f2e0 {
    public static final igj0 INSTANCE = new igj0();

    /* JADX INFO: renamed from: l.igj0$a */
    public static final class C17715a extends f2e0.AbstractC16877a implements kcg0 {

        /* JADX INFO: renamed from: a */
        public final AtomicInteger f114785a = new AtomicInteger();

        /* JADX INFO: renamed from: b */
        public final PriorityBlockingQueue<C17716b> f114786b = new PriorityBlockingQueue<>();

        /* JADX INFO: renamed from: c */
        public final k63 f114787c = new k63();

        /* JADX INFO: renamed from: d */
        public final AtomicInteger f114788d = new AtomicInteger();

        /* JADX INFO: renamed from: l.igj0$a$a */
        public class a implements x20 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C17716b f114789a;

            public a(C17716b c17716b) {
                this.f114789a = c17716b;
            }

            @Override // p153l.x20
            public void call() {
                C17715a.this.f114786b.remove(this.f114789a);
            }
        }

        @Override // p153l.f2e0.AbstractC16877a
        /* JADX INFO: renamed from: b */
        public kcg0 mo102836b(x20 x20Var) {
            return m139930e(x20Var, mo123610a());
        }

        @Override // p153l.f2e0.AbstractC16877a
        /* JADX INFO: renamed from: c */
        public kcg0 mo102837c(x20 x20Var, long j, TimeUnit timeUnit) {
            long jMo123610a = mo123610a() + timeUnit.toMillis(j);
            return m139930e(new vrf0(x20Var, this, jMo123610a), jMo123610a);
        }

        /* JADX INFO: renamed from: e */
        public final kcg0 m139930e(x20 x20Var, long j) {
            if (this.f114787c.isUnsubscribed()) {
                return pcg0.m171651d();
            }
            C17716b c17716b = new C17716b(x20Var, Long.valueOf(j), this.f114785a.incrementAndGet());
            this.f114786b.add(c17716b);
            if (this.f114788d.getAndIncrement() != 0) {
                return pcg0.m171648a(new a(c17716b));
            }
            do {
                C17716b c17716bPoll = this.f114786b.poll();
                if (c17716bPoll != null) {
                    c17716bPoll.f114791a.call();
                }
            } while (this.f114788d.decrementAndGet() > 0);
            return pcg0.m171651d();
        }

        @Override // p153l.kcg0
        public boolean isUnsubscribed() {
            return this.f114787c.isUnsubscribed();
        }

        @Override // p153l.kcg0
        public void unsubscribe() {
            this.f114787c.unsubscribe();
        }
    }

    /* JADX INFO: renamed from: l.igj0$b */
    public static final class C17716b implements Comparable<C17716b> {

        /* JADX INFO: renamed from: a */
        public final x20 f114791a;

        /* JADX INFO: renamed from: b */
        public final Long f114792b;

        /* JADX INFO: renamed from: c */
        public final int f114793c;

        public C17716b(x20 x20Var, Long l2, int i) {
            this.f114791a = x20Var;
            this.f114792b = l2;
            this.f114793c = i;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(C17716b c17716b) {
            int iCompareTo = this.f114792b.compareTo(c17716b.f114792b);
            return iCompareTo == 0 ? igj0.m139929a(this.f114793c, c17716b.f114793c) : iCompareTo;
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m139929a(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    @Override // p153l.f2e0
    public f2e0.AbstractC16877a createWorker() {
        return new C17715a();
    }
}
