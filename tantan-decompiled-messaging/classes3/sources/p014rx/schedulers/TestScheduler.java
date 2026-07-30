package p014rx.schedulers;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import p003l.bud0;
import p003l.c4g0;
import p003l.d30;
import p003l.h4g0;
import p003l.u53;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class TestScheduler extends bud0 {

    /* JADX INFO: renamed from: d */
    public static long f11078d;

    /* JADX INFO: renamed from: b */
    public final Queue<C1179c> f11079b = new PriorityQueue(11, new C1177a());

    /* JADX INFO: renamed from: c */
    public long f11080c;

    /* JADX INFO: renamed from: rx.schedulers.TestScheduler$a */
    public static final class C1177a implements Comparator<C1179c> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C1179c c1179c, C1179c c1179c2) {
            long j = c1179c.f11087a;
            long j2 = c1179c2.f11087a;
            if (j == j2) {
                if (c1179c.f11090d < c1179c2.f11090d) {
                    return -1;
                }
                return c1179c.f11090d > c1179c2.f11090d ? 1 : 0;
            }
            if (j < j2) {
                return -1;
            }
            return j > j2 ? 1 : 0;
        }
    }

    /* JADX INFO: renamed from: rx.schedulers.TestScheduler$b */
    public final class C1178b extends bud0.AbstractC0185a {

        /* JADX INFO: renamed from: a */
        public final u53 f11081a = new u53();

        /* JADX INFO: renamed from: rx.schedulers.TestScheduler$b$a */
        public class a implements d30 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C1179c f11083a;

            public a(C1179c c1179c) {
                this.f11083a = c1179c;
            }

            @Override // p003l.d30
            public void call() {
                TestScheduler.this.f11079b.remove(this.f11083a);
            }
        }

        /* JADX INFO: renamed from: rx.schedulers.TestScheduler$b$b */
        public class b implements d30 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C1179c f11085a;

            public b(C1179c c1179c) {
                this.f11085a = c1179c;
            }

            @Override // p003l.d30
            public void call() {
                TestScheduler.this.f11079b.remove(this.f11085a);
            }
        }

        public C1178b() {
        }

        @Override // p003l.bud0.AbstractC0185a
        /* JADX INFO: renamed from: a */
        public long mo3171a() {
            return TestScheduler.this.now();
        }

        @Override // p003l.bud0.AbstractC0185a
        /* JADX INFO: renamed from: b */
        public c4g0 mo2914b(d30 d30Var) {
            C1179c c1179c = new C1179c(this, 0L, d30Var);
            TestScheduler.this.f11079b.add(c1179c);
            return h4g0.m4914a(new b(c1179c));
        }

        @Override // p003l.bud0.AbstractC0185a
        /* JADX INFO: renamed from: c */
        public c4g0 mo2915c(d30 d30Var, long j, TimeUnit timeUnit) {
            C1179c c1179c = new C1179c(this, TestScheduler.this.f11080c + timeUnit.toNanos(j), d30Var);
            TestScheduler.this.f11079b.add(c1179c);
            return h4g0.m4914a(new a(c1179c));
        }

        @Override // p003l.c4g0
        public boolean isUnsubscribed() {
            return this.f11081a.isUnsubscribed();
        }

        @Override // p003l.c4g0
        public void unsubscribe() {
            this.f11081a.unsubscribe();
        }
    }

    /* JADX INFO: renamed from: rx.schedulers.TestScheduler$c */
    public static final class C1179c {

        /* JADX INFO: renamed from: a */
        public final long f11087a;

        /* JADX INFO: renamed from: b */
        public final d30 f11088b;

        /* JADX INFO: renamed from: c */
        public final bud0.AbstractC0185a f11089c;

        /* JADX INFO: renamed from: d */
        public final long f11090d;

        public C1179c(bud0.AbstractC0185a abstractC0185a, long j, d30 d30Var) {
            long j2 = TestScheduler.f11078d;
            TestScheduler.f11078d = 1 + j2;
            this.f11090d = j2;
            this.f11087a = j;
            this.f11088b = d30Var;
            this.f11089c = abstractC0185a;
        }

        public String toString() {
            return String.format("TimedAction(time = %d, action = %s)", Long.valueOf(this.f11087a), this.f11088b.toString());
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m9953a(long j) {
        while (!this.f11079b.isEmpty()) {
            C1179c c1179cPeek = this.f11079b.peek();
            long j2 = c1179cPeek.f11087a;
            if (j2 > j) {
                break;
            }
            if (j2 == 0) {
                j2 = this.f11080c;
            }
            this.f11080c = j2;
            this.f11079b.remove();
            if (!c1179cPeek.f11089c.isUnsubscribed()) {
                c1179cPeek.f11088b.call();
            }
        }
        this.f11080c = j;
    }

    public void advanceTimeBy(long j, TimeUnit timeUnit) {
        advanceTimeTo(this.f11080c + timeUnit.toNanos(j), TimeUnit.NANOSECONDS);
    }

    public void advanceTimeTo(long j, TimeUnit timeUnit) {
        m9953a(timeUnit.toNanos(j));
    }

    @Override // p003l.bud0
    public bud0.AbstractC0185a createWorker() {
        return new C1178b();
    }

    @Override // p003l.bud0
    public long now() {
        return this.f11080c / 1000000;
    }

    public void triggerActions() {
        m9953a(this.f11080c);
    }
}
