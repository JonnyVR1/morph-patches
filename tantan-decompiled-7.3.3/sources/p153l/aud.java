package p153l;

import java.util.concurrent.atomic.AtomicInteger;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
public abstract class aud<T, R> extends gcg0<T> {

    /* JADX INFO: renamed from: e */
    public final gcg0<? super R> f73483e;

    /* JADX INFO: renamed from: f */
    public boolean f73484f;

    /* JADX INFO: renamed from: g */
    public R f73485g;

    /* JADX INFO: renamed from: h */
    public final AtomicInteger f73486h = new AtomicInteger();

    /* JADX INFO: renamed from: l.aud$a */
    public static final class C15841a implements vk90 {

        /* JADX INFO: renamed from: a */
        public final aud<?, ?> f73487a;

        public C15841a(aud<?, ?> audVar) {
            this.f73487a = audVar;
        }

        @Override // p153l.vk90
        public void request(long j) {
            this.f73487a.m100373i(j);
        }
    }

    public aud(gcg0<? super R> gcg0Var) {
        this.f73483e = gcg0Var;
    }

    @Override // p153l.gcg0
    /* JADX INFO: renamed from: f */
    public final void mo95773f(vk90 vk90Var) {
        vk90Var.request(Long.MAX_VALUE);
    }

    /* JADX INFO: renamed from: g */
    public final void m100371g() {
        this.f73483e.onCompleted();
    }

    /* JADX INFO: renamed from: h */
    public final void m100372h(R r) {
        gcg0<? super R> gcg0Var = this.f73483e;
        do {
            int i = this.f73486h.get();
            if (i == 2 || i == 3 || gcg0Var.isUnsubscribed()) {
                return;
            }
            if (i == 1) {
                gcg0Var.onNext(r);
                if (!gcg0Var.isUnsubscribed()) {
                    gcg0Var.onCompleted();
                }
                this.f73486h.lazySet(3);
                return;
            }
            this.f73485g = r;
        } while (!this.f73486h.compareAndSet(0, 2));
    }

    /* JADX INFO: renamed from: i */
    public final void m100373i(long j) {
        AtomicInteger atomicInteger;
        if (j < 0) {
            fcg0.m125008a("n >= 0 required but it was ", j);
            return;
        }
        if (j != 0) {
            gcg0<? super R> gcg0Var = this.f73483e;
            do {
                int i = this.f73486h.get();
                if (i == 1 || i == 3 || gcg0Var.isUnsubscribed()) {
                    return;
                }
                atomicInteger = this.f73486h;
                if (i == 2) {
                    if (atomicInteger.compareAndSet(2, 3)) {
                        gcg0Var.onNext(this.f73485g);
                        if (gcg0Var.isUnsubscribed()) {
                            return;
                        }
                        gcg0Var.onCompleted();
                        return;
                    }
                    return;
                }
            } while (!atomicInteger.compareAndSet(0, 1));
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m100374j() {
        gcg0<? super R> gcg0Var = this.f73483e;
        gcg0Var.m129866b(this);
        gcg0Var.mo95773f(new C15841a(this));
    }

    /* JADX INFO: renamed from: k */
    public final void m100375k(C22421c<? extends T> c22421c) {
        m100374j();
        c22421c.unsafeSubscribe(this);
    }

    @Override // p153l.bb50
    public void onCompleted() {
        if (this.f73484f) {
            m100372h(this.f73485g);
        } else {
            m100371g();
        }
    }

    @Override // p153l.bb50
    public void onError(Throwable th) {
        this.f73485g = null;
        this.f73483e.onError(th);
    }
}
