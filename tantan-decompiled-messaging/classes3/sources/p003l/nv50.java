package p003l;

import java.util.concurrent.atomic.AtomicLong;
import p014rx.C1099c;
import p014rx.Notification;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class nv50<T> implements C1099c.c<Notification<T>, T> {

    /* JADX INFO: renamed from: l.nv50$a */
    public class C0439a implements rc90 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C0441c f5977a;

        public C0439a(C0441c c0441c) {
            this.f5977a = c0441c;
        }

        @Override // p003l.rc90
        public void request(long j) {
            if (j > 0) {
                this.f5977a.m6573i(j);
            }
        }
    }

    /* JADX INFO: renamed from: l.nv50$b */
    public static final class C0440b {
        static final nv50<Object> INSTANCE = new nv50<>();
    }

    /* JADX INFO: renamed from: l.nv50$c */
    public static class C0441c<T> extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final z3g0<? super Notification<T>> f5979e;

        /* JADX INFO: renamed from: f */
        public volatile Notification<T> f5980f;

        /* JADX INFO: renamed from: g */
        public boolean f5981g;

        /* JADX INFO: renamed from: h */
        public boolean f5982h;

        /* JADX INFO: renamed from: i */
        public final AtomicLong f5983i = new AtomicLong();

        public C0441c(z3g0<? super Notification<T>> z3g0Var) {
            this.f5979e = z3g0Var;
        }

        /* JADX INFO: renamed from: h */
        private void m6571h() {
            synchronized (this) {
                try {
                    if (this.f5981g) {
                        this.f5982h = true;
                        return;
                    }
                    AtomicLong atomicLong = this.f5983i;
                    while (!this.f5979e.isUnsubscribed()) {
                        Notification<T> notification = this.f5980f;
                        if (notification != null && atomicLong.get() > 0) {
                            this.f5980f = null;
                            this.f5979e.onNext(notification);
                            if (this.f5979e.isUnsubscribed()) {
                                return;
                            }
                            this.f5979e.onCompleted();
                            return;
                        }
                        synchronized (this) {
                            try {
                                if (!this.f5982h) {
                                    this.f5981g = false;
                                    return;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // p003l.z3g0
        /* JADX INFO: renamed from: d */
        public void mo2918d() {
            m9242e(0L);
        }

        /* JADX INFO: renamed from: g */
        public final void m6572g() {
            long j;
            AtomicLong atomicLong = this.f5983i;
            do {
                j = atomicLong.get();
                if (j == Long.MAX_VALUE) {
                    return;
                }
            } while (!atomicLong.compareAndSet(j, j - 1));
        }

        /* JADX INFO: renamed from: i */
        public void m6573i(long j) {
            kc2.m5640b(this.f5983i, j);
            m9242e(j);
            m6571h();
        }

        @Override // p003l.m250
        public void onCompleted() {
            this.f5980f = Notification.m9747a();
            m6571h();
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            this.f5980f = Notification.m9748b(th);
            ejd0.m3864j(th);
            m6571h();
        }

        @Override // p003l.m250
        public void onNext(T t) {
            this.f5979e.onNext(Notification.m9749c(t));
            m6572g();
        }
    }

    /* JADX INFO: renamed from: b */
    public static <T> nv50<T> m6569b() {
        return (nv50<T>) C0440b.INSTANCE;
    }

    @Override // p003l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super Notification<T>> z3g0Var) {
        C0441c c0441c = new C0441c(z3g0Var);
        z3g0Var.m9240b(c0441c);
        z3g0Var.mo3257f(new C0439a(c0441c));
        return c0441c;
    }
}
