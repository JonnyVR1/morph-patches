package p153l;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import p137rx.C22421c;
import p137rx.exceptions.MissingBackpressureException;
import p137rx.internal.operators.NotificationLite;
import p137rx.internal.util.unsafe.SpscArrayQueue;
import p137rx.internal.util.unsafe.UnsafeAccess;
import p137rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes3.dex */
public final class u360<T> implements C22421c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final f2e0 f177299a;

    /* JADX INFO: renamed from: b */
    public final boolean f177300b;

    /* JADX INFO: renamed from: c */
    public final int f177301c;

    /* JADX INFO: renamed from: l.u360$a */
    public static class C20478a implements C22421c.c<T, T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f177302a;

        public C20478a(int i) {
            this.f177302a = i;
        }

        @Override // p153l.qcj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public gcg0<? super T> call(gcg0<? super T> gcg0Var) {
            C20479b c20479b = new C20479b(Schedulers.immediate(), gcg0Var, false, this.f177302a);
            c20479b.m194333h();
            return c20479b;
        }
    }

    /* JADX INFO: renamed from: l.u360$b */
    public static final class C20479b<T> extends gcg0<T> implements x20 {

        /* JADX INFO: renamed from: e */
        public final gcg0<? super T> f177303e;

        /* JADX INFO: renamed from: f */
        public final f2e0.AbstractC16877a f177304f;

        /* JADX INFO: renamed from: h */
        public final boolean f177306h;

        /* JADX INFO: renamed from: i */
        public final Queue<Object> f177307i;

        /* JADX INFO: renamed from: j */
        public final int f177308j;

        /* JADX INFO: renamed from: k */
        public volatile boolean f177309k;

        /* JADX INFO: renamed from: n */
        public Throwable f177312n;

        /* JADX INFO: renamed from: o */
        public long f177313o;

        /* JADX INFO: renamed from: l */
        public final AtomicLong f177310l = new AtomicLong();

        /* JADX INFO: renamed from: m */
        public final AtomicLong f177311m = new AtomicLong();

        /* JADX INFO: renamed from: g */
        public final NotificationLite<T> f177305g = NotificationLite.m222581f();

        /* JADX INFO: renamed from: l.u360$b$a */
        public class a implements vk90 {
            public a() {
            }

            @Override // p153l.vk90
            public void request(long j) {
                if (j > 0) {
                    rc2.m180770b(C20479b.this.f177310l, j);
                    C20479b.this.m194334i();
                }
            }
        }

        public C20479b(f2e0 f2e0Var, gcg0<? super T> gcg0Var, boolean z, int i) {
            this.f177303e = gcg0Var;
            this.f177304f = f2e0Var.createWorker();
            this.f177306h = z;
            i = i <= 0 ? urd0.f180601g : i;
            this.f177308j = i - (i >> 2);
            if (UnsafeAccess.isUnsafeAvailable()) {
                this.f177307i = new SpscArrayQueue(i);
            } else {
                this.f177307i = new ozf0(i);
            }
            m129868e(i);
        }

        @Override // p153l.x20
        public void call() {
            long j = this.f177313o;
            Queue<Object> queue = this.f177307i;
            gcg0<? super T> gcg0Var = this.f177303e;
            NotificationLite<T> notificationLite = this.f177305g;
            long jAddAndGet = 1;
            do {
                long j2 = this.f177310l.get();
                while (j2 != j) {
                    boolean z = this.f177309k;
                    Object objPoll = queue.poll();
                    boolean z2 = objPoll == null;
                    if (m194332g(z, z2, gcg0Var, queue)) {
                        return;
                    }
                    if (z2) {
                        break;
                    }
                    gcg0Var.onNext(notificationLite.m222586e(objPoll));
                    j++;
                    if (j == this.f177308j) {
                        long jM180777i = rc2.m180777i(this.f177310l, j);
                        m129868e(j);
                        j2 = jM180777i;
                        j = 0;
                    }
                }
                if (j2 == j && m194332g(this.f177309k, queue.isEmpty(), gcg0Var, queue)) {
                    return;
                }
                this.f177313o = j;
                jAddAndGet = this.f177311m.addAndGet(-jAddAndGet);
            } while (jAddAndGet != 0);
        }

        /* JADX INFO: renamed from: g */
        public boolean m194332g(boolean z, boolean z2, gcg0<? super T> gcg0Var, Queue<Object> queue) {
            if (gcg0Var.isUnsubscribed()) {
                queue.clear();
                return true;
            }
            if (!z) {
                return false;
            }
            if (this.f177306h) {
                if (!z2) {
                    return false;
                }
                Throwable th = this.f177312n;
                try {
                    if (th != null) {
                        gcg0Var.onError(th);
                    } else {
                        gcg0Var.onCompleted();
                    }
                    this = (C20479b<T>) this.f177304f;
                    this.unsubscribe();
                    return false;
                } catch (Throwable th2) {
                    this.f177304f.unsubscribe();
                    throw th2;
                }
            }
            Throwable th3 = this.f177312n;
            if (th3 != null) {
                queue.clear();
                try {
                    gcg0Var.onError(th3);
                    return true;
                } finally {
                    this.f177304f.unsubscribe();
                }
            }
            if (!z2) {
                return false;
            }
            try {
                gcg0Var.onCompleted();
                return true;
            } finally {
                this.f177304f.unsubscribe();
            }
        }

        /* JADX INFO: renamed from: h */
        public void m194333h() {
            gcg0<? super T> gcg0Var = this.f177303e;
            gcg0Var.mo95773f(new a());
            gcg0Var.m129866b(this.f177304f);
            gcg0Var.m129866b(this);
        }

        /* JADX INFO: renamed from: i */
        public void m194334i() {
            if (this.f177311m.getAndIncrement() == 0) {
                this.f177304f.mo102836b(this);
            }
        }

        @Override // p153l.bb50
        public void onCompleted() {
            if (isUnsubscribed() || this.f177309k) {
                return;
            }
            this.f177309k = true;
            m194334i();
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            if (isUnsubscribed() || this.f177309k) {
                hrd0.m136792j(th);
                return;
            }
            this.f177312n = th;
            this.f177309k = true;
            m194334i();
        }

        @Override // p153l.bb50
        public void onNext(T t) {
            if (isUnsubscribed() || this.f177309k) {
                return;
            }
            if (this.f177307i.offer(this.f177305g.m222590j(t))) {
                m194334i();
            } else {
                onError(new MissingBackpressureException());
            }
        }
    }

    public u360(f2e0 f2e0Var, boolean z, int i) {
        this.f177299a = f2e0Var;
        this.f177300b = z;
        this.f177301c = i <= 0 ? urd0.f180601g : i;
    }

    /* JADX INFO: renamed from: b */
    public static <T> C22421c.c<T, T> m194329b(int i) {
        return new C20478a(i);
    }

    @Override // p153l.qcj
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public gcg0<? super T> call(gcg0<? super T> gcg0Var) {
        f2e0 f2e0Var = this.f177299a;
        if ((f2e0Var instanceof olm) || (f2e0Var instanceof igj0)) {
            return gcg0Var;
        }
        C20479b c20479b = new C20479b(f2e0Var, gcg0Var, this.f177300b, this.f177301c);
        c20479b.m194333h();
        return c20479b;
    }
}
