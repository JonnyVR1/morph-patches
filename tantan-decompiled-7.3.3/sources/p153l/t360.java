package p153l;

import java.util.concurrent.atomic.AtomicLong;
import p137rx.C22421c;
import p137rx.Notification;

/* JADX INFO: loaded from: classes3.dex */
public final class t360<T> implements C22421c.c<Notification<T>, T> {

    /* JADX INFO: renamed from: l.t360$a */
    public class C20225a implements vk90 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C20227c f171895a;

        public C20225a(C20227c c20227c) {
            this.f171895a = c20227c;
        }

        @Override // p153l.vk90
        public void request(long j) {
            if (j > 0) {
                this.f171895a.m189081i(j);
            }
        }
    }

    /* JADX INFO: renamed from: l.t360$b */
    public static final class C20226b {
        static final t360<Object> INSTANCE = new t360<>();
    }

    /* JADX INFO: renamed from: l.t360$c */
    public static class C20227c<T> extends gcg0<T> {

        /* JADX INFO: renamed from: e */
        public final gcg0<? super Notification<T>> f171897e;

        /* JADX INFO: renamed from: f */
        public volatile Notification<T> f171898f;

        /* JADX INFO: renamed from: g */
        public boolean f171899g;

        /* JADX INFO: renamed from: h */
        public boolean f171900h;

        /* JADX INFO: renamed from: i */
        public final AtomicLong f171901i = new AtomicLong();

        public C20227c(gcg0<? super Notification<T>> gcg0Var) {
            this.f171897e = gcg0Var;
        }

        /* JADX INFO: renamed from: h */
        private void m189079h() {
            synchronized (this) {
                try {
                    if (this.f171899g) {
                        this.f171900h = true;
                        return;
                    }
                    AtomicLong atomicLong = this.f171901i;
                    while (!this.f171897e.isUnsubscribed()) {
                        Notification<T> notification = this.f171898f;
                        if (notification != null && atomicLong.get() > 0) {
                            this.f171898f = null;
                            this.f171897e.onNext(notification);
                            if (this.f171897e.isUnsubscribed()) {
                                return;
                            }
                            this.f171897e.onCompleted();
                            return;
                        }
                        synchronized (this) {
                            try {
                                if (!this.f171900h) {
                                    this.f171899g = false;
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

        @Override // p153l.gcg0
        /* JADX INFO: renamed from: d */
        public void mo95884d() {
            m129868e(0L);
        }

        /* JADX INFO: renamed from: g */
        public final void m189080g() {
            long j;
            AtomicLong atomicLong = this.f171901i;
            do {
                j = atomicLong.get();
                if (j == Long.MAX_VALUE) {
                    return;
                }
            } while (!atomicLong.compareAndSet(j, j - 1));
        }

        /* JADX INFO: renamed from: i */
        public void m189081i(long j) {
            rc2.m180770b(this.f171901i, j);
            m129868e(j);
            m189079h();
        }

        @Override // p153l.bb50
        public void onCompleted() {
            this.f171898f = Notification.m222536a();
            m189079h();
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            this.f171898f = Notification.m222537b(th);
            hrd0.m136792j(th);
            m189079h();
        }

        @Override // p153l.bb50
        public void onNext(T t) {
            this.f171897e.onNext(Notification.m222538c(t));
            m189080g();
        }
    }

    /* JADX INFO: renamed from: b */
    public static <T> t360<T> m189077b() {
        return (t360<T>) C20226b.INSTANCE;
    }

    @Override // p153l.qcj
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public gcg0<? super T> call(gcg0<? super Notification<T>> gcg0Var) {
        C20227c c20227c = new C20227c(gcg0Var);
        gcg0Var.m129866b(c20227c);
        gcg0Var.mo95773f(new C20225a(c20227c));
        return c20227c;
    }
}
