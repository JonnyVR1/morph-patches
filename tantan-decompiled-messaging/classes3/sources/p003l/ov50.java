package p003l;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import p014rx.C1099c;
import p014rx.exceptions.MissingBackpressureException;
import p014rx.internal.operators.NotificationLite;
import p014rx.internal.util.unsafe.SpscArrayQueue;
import p014rx.internal.util.unsafe.UnsafeAccess;
import p014rx.schedulers.Schedulers;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class ov50<T> implements C1099c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final bud0 f6234a;

    /* JADX INFO: renamed from: b */
    public final boolean f6235b;

    /* JADX INFO: renamed from: c */
    public final int f6236c;

    /* JADX INFO: renamed from: l.ov50$a */
    public static class C0458a implements C1099c.c<T, T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f6237a;

        public C0458a(int i) {
            this.f6237a = i;
        }

        @Override // p003l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public z3g0<? super T> call(z3g0<? super T> z3g0Var) {
            C0459b c0459b = new C0459b(Schedulers.immediate(), z3g0Var, false, this.f6237a);
            c0459b.m6733h();
            return c0459b;
        }
    }

    /* JADX INFO: renamed from: l.ov50$b */
    public static final class C0459b<T> extends z3g0<T> implements d30 {

        /* JADX INFO: renamed from: e */
        public final z3g0<? super T> f6238e;

        /* JADX INFO: renamed from: f */
        public final bud0.AbstractC0185a f6239f;

        /* JADX INFO: renamed from: h */
        public final boolean f6241h;

        /* JADX INFO: renamed from: i */
        public final Queue<Object> f6242i;

        /* JADX INFO: renamed from: j */
        public final int f6243j;

        /* JADX INFO: renamed from: k */
        public volatile boolean f6244k;

        /* JADX INFO: renamed from: n */
        public Throwable f6247n;

        /* JADX INFO: renamed from: o */
        public long f6248o;

        /* JADX INFO: renamed from: l */
        public final AtomicLong f6245l = new AtomicLong();

        /* JADX INFO: renamed from: m */
        public final AtomicLong f6246m = new AtomicLong();

        /* JADX INFO: renamed from: g */
        public final NotificationLite<T> f6240g = NotificationLite.m9792f();

        /* JADX INFO: renamed from: l.ov50$b$a */
        public class a implements rc90 {
            public a() {
            }

            @Override // p003l.rc90
            public void request(long j) {
                if (j > 0) {
                    kc2.m5640b(C0459b.this.f6245l, j);
                    C0459b.this.m6734i();
                }
            }
        }

        public C0459b(bud0 bud0Var, z3g0<? super T> z3g0Var, boolean z, int i) {
            this.f6238e = z3g0Var;
            this.f6239f = bud0Var.createWorker();
            this.f6241h = z;
            i = i <= 0 ? rjd0.f6938g : i;
            this.f6243j = i - (i >> 2);
            if (UnsafeAccess.isUnsafeAvailable()) {
                this.f6242i = new SpscArrayQueue(i);
            } else {
                this.f6242i = new frf0(i);
            }
            m9242e(i);
        }

        @Override // p003l.d30
        public void call() {
            long j = this.f6248o;
            Queue<Object> queue = this.f6242i;
            z3g0<? super T> z3g0Var = this.f6238e;
            NotificationLite<T> notificationLite = this.f6240g;
            long jAddAndGet = 1;
            do {
                long j2 = this.f6245l.get();
                while (j2 != j) {
                    boolean z = this.f6244k;
                    Object objPoll = queue.poll();
                    boolean z2 = objPoll == null;
                    if (m6732g(z, z2, z3g0Var, queue)) {
                        return;
                    }
                    if (z2) {
                        break;
                    }
                    z3g0Var.onNext(notificationLite.m9797e(objPoll));
                    j++;
                    if (j == this.f6243j) {
                        long jM5647i = kc2.m5647i(this.f6245l, j);
                        m9242e(j);
                        j2 = jM5647i;
                        j = 0;
                    }
                }
                if (j2 == j && m6732g(this.f6244k, queue.isEmpty(), z3g0Var, queue)) {
                    return;
                }
                this.f6248o = j;
                jAddAndGet = this.f6246m.addAndGet(-jAddAndGet);
            } while (jAddAndGet != 0);
        }

        /* JADX INFO: renamed from: g */
        public boolean m6732g(boolean z, boolean z2, z3g0<? super T> z3g0Var, Queue<Object> queue) {
            if (z3g0Var.isUnsubscribed()) {
                queue.clear();
                return true;
            }
            if (!z) {
                return false;
            }
            if (this.f6241h) {
                if (!z2) {
                    return false;
                }
                Throwable th = this.f6247n;
                try {
                    if (th != null) {
                        z3g0Var.onError(th);
                    } else {
                        z3g0Var.onCompleted();
                    }
                    this = (C0459b<T>) this.f6239f;
                    this.unsubscribe();
                    return false;
                } catch (Throwable th2) {
                    this.f6239f.unsubscribe();
                    throw th2;
                }
            }
            Throwable th3 = this.f6247n;
            if (th3 != null) {
                queue.clear();
                try {
                    z3g0Var.onError(th3);
                    return true;
                } finally {
                    this.f6239f.unsubscribe();
                }
            }
            if (!z2) {
                return false;
            }
            try {
                z3g0Var.onCompleted();
                return true;
            } finally {
                this.f6239f.unsubscribe();
            }
        }

        /* JADX INFO: renamed from: h */
        public void m6733h() {
            z3g0<? super T> z3g0Var = this.f6238e;
            z3g0Var.mo3257f(new a());
            z3g0Var.m9240b(this.f6239f);
            z3g0Var.m9240b(this);
        }

        /* JADX INFO: renamed from: i */
        public void m6734i() {
            if (this.f6246m.getAndIncrement() == 0) {
                this.f6239f.mo2914b(this);
            }
        }

        @Override // p003l.m250
        public void onCompleted() {
            if (isUnsubscribed() || this.f6244k) {
                return;
            }
            this.f6244k = true;
            m6734i();
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            if (isUnsubscribed() || this.f6244k) {
                ejd0.m3864j(th);
                return;
            }
            this.f6247n = th;
            this.f6244k = true;
            m6734i();
        }

        @Override // p003l.m250
        public void onNext(T t) {
            if (isUnsubscribed() || this.f6244k) {
                return;
            }
            if (this.f6242i.offer(this.f6240g.m9801j(t))) {
                m6734i();
            } else {
                onError(new MissingBackpressureException());
            }
        }
    }

    public ov50(bud0 bud0Var, boolean z, int i) {
        this.f6234a = bud0Var;
        this.f6235b = z;
        this.f6236c = i <= 0 ? rjd0.f6938g : i;
    }

    /* JADX INFO: renamed from: b */
    public static <T> C1099c.c<T, T> m6729b(int i) {
        return new C0458a(i);
    }

    @Override // p003l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super T> z3g0Var) {
        bud0 bud0Var = this.f6234a;
        if ((bud0Var instanceof mjm) || (bud0Var instanceof e7j0)) {
            return z3g0Var;
        }
        C0459b c0459b = new C0459b(bud0Var, z3g0Var, this.f6235b, this.f6236c);
        c0459b.m6733h();
        return c0459b;
    }
}
