package p133rx.schedulers;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import p149l.bud0;
import p149l.c4g0;
import p149l.d30;
import p149l.h4g0;
import p149l.u53;

/* JADX INFO: loaded from: classes3.dex */
public class TestScheduler extends bud0 {

    /* JADX INFO: renamed from: d */
    public static long f207453d;

    /* JADX INFO: renamed from: b */
    public final Queue<C22386c> f207454b = new PriorityQueue(11, new C22384a());

    /* JADX INFO: renamed from: c */
    public long f207455c;

    /* JADX INFO: renamed from: rx.schedulers.TestScheduler$a */
    public static final class C22384a implements Comparator<C22386c> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C22386c c22386c, C22386c c22386c2) {
            long j = c22386c.f207462a;
            long j2 = c22386c2.f207462a;
            if (j == j2) {
                if (c22386c.f207465d < c22386c2.f207465d) {
                    return -1;
                }
                return c22386c.f207465d > c22386c2.f207465d ? 1 : 0;
            }
            if (j < j2) {
                return -1;
            }
            return j > j2 ? 1 : 0;
        }
    }

    /* JADX INFO: renamed from: rx.schedulers.TestScheduler$b */
    public final class C22385b extends bud0.AbstractC15976a {

        /* JADX INFO: renamed from: a */
        public final u53 f207456a = new u53();

        /* JADX INFO: renamed from: rx.schedulers.TestScheduler$b$a */
        public class a implements d30 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C22386c f207458a;

            public a(C22386c c22386c) {
                this.f207458a = c22386c;
            }

            @Override // p149l.d30
            public void call() {
                TestScheduler.this.f207454b.remove(this.f207458a);
            }
        }

        /* JADX INFO: renamed from: rx.schedulers.TestScheduler$b$b */
        public class b implements d30 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C22386c f207460a;

            public b(C22386c c22386c) {
                this.f207460a = c22386c;
            }

            @Override // p149l.d30
            public void call() {
                TestScheduler.this.f207454b.remove(this.f207460a);
            }
        }

        public C22385b() {
        }

        @Override // p149l.bud0.AbstractC15976a
        /* JADX INFO: renamed from: a */
        public long mo103919a() {
            return TestScheduler.this.now();
        }

        @Override // p149l.bud0.AbstractC15976a
        /* JADX INFO: renamed from: b */
        public c4g0 mo99201b(d30 d30Var) {
            C22386c c22386c = new C22386c(this, 0L, d30Var);
            TestScheduler.this.f207454b.add(c22386c);
            return h4g0.m129240a(new b(c22386c));
        }

        @Override // p149l.bud0.AbstractC15976a
        /* JADX INFO: renamed from: c */
        public c4g0 mo99202c(d30 d30Var, long j, TimeUnit timeUnit) {
            C22386c c22386c = new C22386c(this, TestScheduler.this.f207455c + timeUnit.toNanos(j), d30Var);
            TestScheduler.this.f207454b.add(c22386c);
            return h4g0.m129240a(new a(c22386c));
        }

        @Override // p149l.c4g0
        public boolean isUnsubscribed() {
            return this.f207456a.isUnsubscribed();
        }

        @Override // p149l.c4g0
        public void unsubscribe() {
            this.f207456a.unsubscribe();
        }
    }

    /* JADX INFO: renamed from: rx.schedulers.TestScheduler$c */
    public static final class C22386c {

        /* JADX INFO: renamed from: a */
        public final long f207462a;

        /* JADX INFO: renamed from: b */
        public final d30 f207463b;

        /* JADX INFO: renamed from: c */
        public final bud0.AbstractC15976a f207464c;

        /* JADX INFO: renamed from: d */
        public final long f207465d;

        public C22386c(bud0.AbstractC15976a abstractC15976a, long j, d30 d30Var) {
            long j2 = TestScheduler.f207453d;
            TestScheduler.f207453d = 1 + j2;
            this.f207465d = j2;
            this.f207462a = j;
            this.f207463b = d30Var;
            this.f207464c = abstractC15976a;
        }

        public String toString() {
            return String.format("TimedAction(time = %d, action = %s)", Long.valueOf(this.f207462a), this.f207463b.toString());
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m221496a(long j) {
        while (!this.f207454b.isEmpty()) {
            C22386c c22386cPeek = this.f207454b.peek();
            long j2 = c22386cPeek.f207462a;
            if (j2 > j) {
                break;
            }
            if (j2 == 0) {
                j2 = this.f207455c;
            }
            this.f207455c = j2;
            this.f207454b.remove();
            if (!c22386cPeek.f207464c.isUnsubscribed()) {
                c22386cPeek.f207463b.call();
            }
        }
        this.f207455c = j;
    }

    public void advanceTimeBy(long j, TimeUnit timeUnit) {
        advanceTimeTo(this.f207455c + timeUnit.toNanos(j), TimeUnit.NANOSECONDS);
    }

    public void advanceTimeTo(long j, TimeUnit timeUnit) {
        m221496a(timeUnit.toNanos(j));
    }

    @Override // p149l.bud0
    public bud0.AbstractC15976a createWorker() {
        return new C22385b();
    }

    @Override // p149l.bud0
    public long now() {
        return this.f207455c / 1000000;
    }

    public void triggerActions() {
        m221496a(this.f207455c);
    }
}
