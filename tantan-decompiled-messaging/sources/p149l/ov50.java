package p149l;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import p133rx.C22306c;
import p133rx.exceptions.MissingBackpressureException;
import p133rx.internal.operators.NotificationLite;
import p133rx.internal.util.unsafe.SpscArrayQueue;
import p133rx.internal.util.unsafe.UnsafeAccess;
import p133rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes3.dex */
public final class ov50<T> implements C22306c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final bud0 f145768a;

    /* JADX INFO: renamed from: b */
    public final boolean f145769b;

    /* JADX INFO: renamed from: c */
    public final int f145770c;

    /* JADX INFO: renamed from: l.ov50$a */
    public static class C19049a implements C22306c.c<T, T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f145771a;

        public C19049a(int i) {
            this.f145771a = i;
        }

        @Override // p149l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public z3g0<? super T> call(z3g0<? super T> z3g0Var) {
            C19050b c19050b = new C19050b(Schedulers.immediate(), z3g0Var, false, this.f145771a);
            c19050b.m166159h();
            return c19050b;
        }
    }

    /* JADX INFO: renamed from: l.ov50$b */
    public static final class C19050b<T> extends z3g0<T> implements d30 {

        /* JADX INFO: renamed from: e */
        public final z3g0<? super T> f145772e;

        /* JADX INFO: renamed from: f */
        public final bud0.AbstractC15976a f145773f;

        /* JADX INFO: renamed from: h */
        public final boolean f145775h;

        /* JADX INFO: renamed from: i */
        public final Queue<Object> f145776i;

        /* JADX INFO: renamed from: j */
        public final int f145777j;

        /* JADX INFO: renamed from: k */
        public volatile boolean f145778k;

        /* JADX INFO: renamed from: n */
        public Throwable f145781n;

        /* JADX INFO: renamed from: o */
        public long f145782o;

        /* JADX INFO: renamed from: l */
        public final AtomicLong f145779l = new AtomicLong();

        /* JADX INFO: renamed from: m */
        public final AtomicLong f145780m = new AtomicLong();

        /* JADX INFO: renamed from: g */
        public final NotificationLite<T> f145774g = NotificationLite.m221335f();

        /* JADX INFO: renamed from: l.ov50$b$a */
        public class a implements rc90 {
            public a() {
            }

            @Override // p149l.rc90
            public void request(long j) {
                if (j > 0) {
                    kc2.m145336b(C19050b.this.f145779l, j);
                    C19050b.this.m166160i();
                }
            }
        }

        public C19050b(bud0 bud0Var, z3g0<? super T> z3g0Var, boolean z, int i) {
            this.f145772e = z3g0Var;
            this.f145773f = bud0Var.createWorker();
            this.f145775h = z;
            i = i <= 0 ? rjd0.f159670g : i;
            this.f145777j = i - (i >> 2);
            if (UnsafeAccess.isUnsafeAvailable()) {
                this.f145776i = new SpscArrayQueue(i);
            } else {
                this.f145776i = new frf0(i);
            }
            m217048e(i);
        }

        @Override // p149l.d30
        public void call() {
            long j = this.f145782o;
            Queue<Object> queue = this.f145776i;
            z3g0<? super T> z3g0Var = this.f145772e;
            NotificationLite<T> notificationLite = this.f145774g;
            long jAddAndGet = 1;
            do {
                long j2 = this.f145779l.get();
                while (j2 != j) {
                    boolean z = this.f145778k;
                    Object objPoll = queue.poll();
                    boolean z2 = objPoll == null;
                    if (m166158g(z, z2, z3g0Var, queue)) {
                        return;
                    }
                    if (z2) {
                        break;
                    }
                    z3g0Var.onNext(notificationLite.m221340e(objPoll));
                    j++;
                    if (j == this.f145777j) {
                        long jM145343i = kc2.m145343i(this.f145779l, j);
                        m217048e(j);
                        j2 = jM145343i;
                        j = 0;
                    }
                }
                if (j2 == j && m166158g(this.f145778k, queue.isEmpty(), z3g0Var, queue)) {
                    return;
                }
                this.f145782o = j;
                jAddAndGet = this.f145780m.addAndGet(-jAddAndGet);
            } while (jAddAndGet != 0);
        }

        /* JADX INFO: renamed from: g */
        public boolean m166158g(boolean z, boolean z2, z3g0<? super T> z3g0Var, Queue<Object> queue) {
            if (z3g0Var.isUnsubscribed()) {
                queue.clear();
                return true;
            }
            if (!z) {
                return false;
            }
            if (this.f145775h) {
                if (!z2) {
                    return false;
                }
                Throwable th = this.f145781n;
                try {
                    if (th != null) {
                        z3g0Var.onError(th);
                    } else {
                        z3g0Var.onCompleted();
                    }
                    this = (C19050b<T>) this.f145773f;
                    this.unsubscribe();
                    return false;
                } catch (Throwable th2) {
                    this.f145773f.unsubscribe();
                    throw th2;
                }
            }
            Throwable th3 = this.f145781n;
            if (th3 != null) {
                queue.clear();
                try {
                    z3g0Var.onError(th3);
                    return true;
                } finally {
                    this.f145773f.unsubscribe();
                }
            }
            if (!z2) {
                return false;
            }
            try {
                z3g0Var.onCompleted();
                return true;
            } finally {
                this.f145773f.unsubscribe();
            }
        }

        /* JADX INFO: renamed from: h */
        public void m166159h() {
            z3g0<? super T> z3g0Var = this.f145772e;
            z3g0Var.mo106696f(new a());
            z3g0Var.m217046b(this.f145773f);
            z3g0Var.m217046b(this);
        }

        /* JADX INFO: renamed from: i */
        public void m166160i() {
            if (this.f145780m.getAndIncrement() == 0) {
                this.f145773f.mo99201b(this);
            }
        }

        @Override // p149l.m250
        public void onCompleted() {
            if (isUnsubscribed() || this.f145778k) {
                return;
            }
            this.f145778k = true;
            m166160i();
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            if (isUnsubscribed() || this.f145778k) {
                ejd0.m116793j(th);
                return;
            }
            this.f145781n = th;
            this.f145778k = true;
            m166160i();
        }

        @Override // p149l.m250
        public void onNext(T t) {
            if (isUnsubscribed() || this.f145778k) {
                return;
            }
            if (this.f145776i.offer(this.f145774g.m221344j(t))) {
                m166160i();
            } else {
                onError(new MissingBackpressureException());
            }
        }
    }

    public ov50(bud0 bud0Var, boolean z, int i) {
        this.f145768a = bud0Var;
        this.f145769b = z;
        this.f145770c = i <= 0 ? rjd0.f159670g : i;
    }

    /* JADX INFO: renamed from: b */
    public static <T> C22306c.c<T, T> m166155b(int i) {
        return new C19049a(i);
    }

    @Override // p149l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super T> z3g0Var) {
        bud0 bud0Var = this.f145768a;
        if ((bud0Var instanceof mjm) || (bud0Var instanceof e7j0)) {
            return z3g0Var;
        }
        C19050b c19050b = new C19050b(bud0Var, z3g0Var, this.f145769b, this.f145770c);
        c19050b.m166159h();
        return c19050b;
    }
}
