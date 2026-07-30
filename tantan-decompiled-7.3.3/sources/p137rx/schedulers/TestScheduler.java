package p137rx.schedulers;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import p153l.f2e0;
import p153l.k63;
import p153l.kcg0;
import p153l.pcg0;
import p153l.x20;

/* JADX INFO: loaded from: classes3.dex */
public class TestScheduler extends f2e0 {

    /* JADX INFO: renamed from: d */
    public static long f208375d;

    /* JADX INFO: renamed from: b */
    public final Queue<C22501c> f208376b = new PriorityQueue(11, new C22499a());

    /* JADX INFO: renamed from: c */
    public long f208377c;

    /* JADX INFO: renamed from: rx.schedulers.TestScheduler$a */
    public static final class C22499a implements Comparator<C22501c> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C22501c c22501c, C22501c c22501c2) {
            long j = c22501c.f208384a;
            long j2 = c22501c2.f208384a;
            if (j == j2) {
                if (c22501c.f208387d < c22501c2.f208387d) {
                    return -1;
                }
                return c22501c.f208387d > c22501c2.f208387d ? 1 : 0;
            }
            if (j < j2) {
                return -1;
            }
            return j > j2 ? 1 : 0;
        }
    }

    /* JADX INFO: renamed from: rx.schedulers.TestScheduler$b */
    public final class C22500b extends f2e0.AbstractC16877a {

        /* JADX INFO: renamed from: a */
        public final k63 f208378a = new k63();

        /* JADX INFO: renamed from: rx.schedulers.TestScheduler$b$a */
        public class a implements x20 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C22501c f208380a;

            public a(C22501c c22501c) {
                this.f208380a = c22501c;
            }

            @Override // p153l.x20
            public void call() {
                TestScheduler.this.f208376b.remove(this.f208380a);
            }
        }

        /* JADX INFO: renamed from: rx.schedulers.TestScheduler$b$b */
        public class b implements x20 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C22501c f208382a;

            public b(C22501c c22501c) {
                this.f208382a = c22501c;
            }

            @Override // p153l.x20
            public void call() {
                TestScheduler.this.f208376b.remove(this.f208382a);
            }
        }

        public C22500b() {
        }

        @Override // p153l.f2e0.AbstractC16877a
        /* JADX INFO: renamed from: a */
        public long mo123610a() {
            return TestScheduler.this.now();
        }

        @Override // p153l.f2e0.AbstractC16877a
        /* JADX INFO: renamed from: b */
        public kcg0 mo102836b(x20 x20Var) {
            C22501c c22501c = new C22501c(this, 0L, x20Var);
            TestScheduler.this.f208376b.add(c22501c);
            return pcg0.m171648a(new b(c22501c));
        }

        @Override // p153l.f2e0.AbstractC16877a
        /* JADX INFO: renamed from: c */
        public kcg0 mo102837c(x20 x20Var, long j, TimeUnit timeUnit) {
            C22501c c22501c = new C22501c(this, TestScheduler.this.f208377c + timeUnit.toNanos(j), x20Var);
            TestScheduler.this.f208376b.add(c22501c);
            return pcg0.m171648a(new a(c22501c));
        }

        @Override // p153l.kcg0
        public boolean isUnsubscribed() {
            return this.f208378a.isUnsubscribed();
        }

        @Override // p153l.kcg0
        public void unsubscribe() {
            this.f208378a.unsubscribe();
        }
    }

    /* JADX INFO: renamed from: rx.schedulers.TestScheduler$c */
    public static final class C22501c {

        /* JADX INFO: renamed from: a */
        public final long f208384a;

        /* JADX INFO: renamed from: b */
        public final x20 f208385b;

        /* JADX INFO: renamed from: c */
        public final f2e0.AbstractC16877a f208386c;

        /* JADX INFO: renamed from: d */
        public final long f208387d;

        public C22501c(f2e0.AbstractC16877a abstractC16877a, long j, x20 x20Var) {
            long j2 = TestScheduler.f208375d;
            TestScheduler.f208375d = 1 + j2;
            this.f208387d = j2;
            this.f208384a = j;
            this.f208385b = x20Var;
            this.f208386c = abstractC16877a;
        }

        public String toString() {
            return String.format("TimedAction(time = %d, action = %s)", Long.valueOf(this.f208384a), this.f208385b.toString());
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m222742a(long j) {
        while (!this.f208376b.isEmpty()) {
            C22501c c22501cPeek = this.f208376b.peek();
            long j2 = c22501cPeek.f208384a;
            if (j2 > j) {
                break;
            }
            if (j2 == 0) {
                j2 = this.f208377c;
            }
            this.f208377c = j2;
            this.f208376b.remove();
            if (!c22501cPeek.f208386c.isUnsubscribed()) {
                c22501cPeek.f208385b.call();
            }
        }
        this.f208377c = j;
    }

    public void advanceTimeBy(long j, TimeUnit timeUnit) {
        advanceTimeTo(this.f208377c + timeUnit.toNanos(j), TimeUnit.NANOSECONDS);
    }

    public void advanceTimeTo(long j, TimeUnit timeUnit) {
        m222742a(timeUnit.toNanos(j));
    }

    @Override // p153l.f2e0
    public f2e0.AbstractC16877a createWorker() {
        return new C22500b();
    }

    @Override // p153l.f2e0
    public long now() {
        return this.f208377c / 1000000;
    }

    public void triggerActions() {
        m222742a(this.f208377c);
    }
}
