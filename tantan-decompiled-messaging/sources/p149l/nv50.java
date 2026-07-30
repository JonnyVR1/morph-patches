package p149l;

import java.util.concurrent.atomic.AtomicLong;
import p133rx.C22306c;
import p133rx.Notification;

/* JADX INFO: loaded from: classes3.dex */
public final class nv50<T> implements C22306c.c<Notification<T>, T> {

    /* JADX INFO: renamed from: l.nv50$a */
    public class C18778a implements rc90 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C18780c f140679a;

        public C18778a(C18780c c18780c) {
            this.f140679a = c18780c;
        }

        @Override // p149l.rc90
        public void request(long j) {
            if (j > 0) {
                this.f140679a.m161573i(j);
            }
        }
    }

    /* JADX INFO: renamed from: l.nv50$b */
    public static final class C18779b {
        static final nv50<Object> INSTANCE = new nv50<>();
    }

    /* JADX INFO: renamed from: l.nv50$c */
    public static class C18780c<T> extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final z3g0<? super Notification<T>> f140681e;

        /* JADX INFO: renamed from: f */
        public volatile Notification<T> f140682f;

        /* JADX INFO: renamed from: g */
        public boolean f140683g;

        /* JADX INFO: renamed from: h */
        public boolean f140684h;

        /* JADX INFO: renamed from: i */
        public final AtomicLong f140685i = new AtomicLong();

        public C18780c(z3g0<? super Notification<T>> z3g0Var) {
            this.f140681e = z3g0Var;
        }

        /* JADX INFO: renamed from: h */
        private void m161571h() {
            synchronized (this) {
                try {
                    if (this.f140683g) {
                        this.f140684h = true;
                        return;
                    }
                    AtomicLong atomicLong = this.f140685i;
                    while (!this.f140681e.isUnsubscribed()) {
                        Notification<T> notification = this.f140682f;
                        if (notification != null && atomicLong.get() > 0) {
                            this.f140682f = null;
                            this.f140681e.onNext(notification);
                            if (this.f140681e.isUnsubscribed()) {
                                return;
                            }
                            this.f140681e.onCompleted();
                            return;
                        }
                        synchronized (this) {
                            try {
                                if (!this.f140684h) {
                                    this.f140683g = false;
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

        @Override // p149l.z3g0
        /* JADX INFO: renamed from: d */
        public void mo99382d() {
            m217048e(0L);
        }

        /* JADX INFO: renamed from: g */
        public final void m161572g() {
            long j;
            AtomicLong atomicLong = this.f140685i;
            do {
                j = atomicLong.get();
                if (j == Long.MAX_VALUE) {
                    return;
                }
            } while (!atomicLong.compareAndSet(j, j - 1));
        }

        /* JADX INFO: renamed from: i */
        public void m161573i(long j) {
            kc2.m145336b(this.f140685i, j);
            m217048e(j);
            m161571h();
        }

        @Override // p149l.m250
        public void onCompleted() {
            this.f140682f = Notification.m221290a();
            m161571h();
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            this.f140682f = Notification.m221291b(th);
            ejd0.m116793j(th);
            m161571h();
        }

        @Override // p149l.m250
        public void onNext(T t) {
            this.f140681e.onNext(Notification.m221292c(t));
            m161572g();
        }
    }

    /* JADX INFO: renamed from: b */
    public static <T> nv50<T> m161569b() {
        return (nv50<T>) C18779b.INSTANCE;
    }

    @Override // p149l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super Notification<T>> z3g0Var) {
        C18780c c18780c = new C18780c(z3g0Var);
        z3g0Var.m217046b(c18780c);
        z3g0Var.mo106696f(new C18778a(c18780c));
        return c18780c;
    }
}
