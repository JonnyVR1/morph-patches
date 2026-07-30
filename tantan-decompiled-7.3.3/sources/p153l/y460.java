package p153l;

import java.util.concurrent.TimeoutException;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
public class y460<T> implements C22421c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC21510a<T> f197415a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC21511b<T> f197416b;

    /* JADX INFO: renamed from: c */
    public final C22421c<? extends T> f197417c;

    /* JADX INFO: renamed from: d */
    public final f2e0 f197418d;

    /* JADX INFO: renamed from: l.y460$a */
    public interface InterfaceC21510a<T> extends scj<C21512c<T>, Long, f2e0.AbstractC16877a, kcg0> {
    }

    /* JADX INFO: renamed from: l.y460$b */
    public interface InterfaceC21511b<T> extends tcj<C21512c<T>, Long, T, f2e0.AbstractC16877a, kcg0> {
    }

    /* JADX INFO: renamed from: l.y460$c */
    public static final class C21512c<T> extends gcg0<T> {

        /* JADX INFO: renamed from: e */
        public final wqe0 f197419e;

        /* JADX INFO: renamed from: f */
        public final are0<T> f197420f;

        /* JADX INFO: renamed from: g */
        public final InterfaceC21511b<T> f197421g;

        /* JADX INFO: renamed from: h */
        public final C22421c<? extends T> f197422h;

        /* JADX INFO: renamed from: i */
        public final f2e0.AbstractC16877a f197423i;

        /* JADX INFO: renamed from: j */
        public final xk90 f197424j = new xk90();

        /* JADX INFO: renamed from: k */
        public boolean f197425k;

        /* JADX INFO: renamed from: l */
        public long f197426l;

        /* JADX INFO: renamed from: l.y460$c$a */
        public class a extends gcg0<T> {
            public a() {
            }

            @Override // p153l.gcg0
            /* JADX INFO: renamed from: f */
            public void mo95773f(vk90 vk90Var) {
                C21512c.this.f197424j.m211356c(vk90Var);
            }

            @Override // p153l.bb50
            public void onCompleted() {
                C21512c.this.f197420f.onCompleted();
            }

            @Override // p153l.bb50
            public void onError(Throwable th) {
                C21512c.this.f197420f.onError(th);
            }

            @Override // p153l.bb50
            public void onNext(T t) {
                C21512c.this.f197420f.onNext(t);
            }
        }

        public C21512c(are0<T> are0Var, InterfaceC21511b<T> interfaceC21511b, wqe0 wqe0Var, C22421c<? extends T> c22421c, f2e0.AbstractC16877a abstractC16877a) {
            this.f197420f = are0Var;
            this.f197421g = interfaceC21511b;
            this.f197419e = wqe0Var;
            this.f197422h = c22421c;
            this.f197423i = abstractC16877a;
        }

        @Override // p153l.gcg0
        /* JADX INFO: renamed from: f */
        public void mo95773f(vk90 vk90Var) {
            this.f197424j.m211356c(vk90Var);
        }

        /* JADX INFO: renamed from: g */
        public void m214197g(long j) {
            boolean z;
            synchronized (this) {
                try {
                    if (j != this.f197426l || this.f197425k) {
                        z = false;
                    } else {
                        z = true;
                        this.f197425k = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z) {
                if (this.f197422h == null) {
                    this.f197420f.onError(new TimeoutException());
                    return;
                }
                a aVar = new a();
                this.f197422h.unsafeSubscribe(aVar);
                this.f197419e.m207511b(aVar);
            }
        }

        @Override // p153l.bb50
        public void onCompleted() {
            boolean z;
            synchronized (this) {
                try {
                    if (this.f197425k) {
                        z = false;
                    } else {
                        z = true;
                        this.f197425k = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z) {
                this.f197419e.unsubscribe();
                this.f197420f.onCompleted();
            }
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            boolean z;
            synchronized (this) {
                try {
                    if (this.f197425k) {
                        z = false;
                    } else {
                        z = true;
                        this.f197425k = true;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (z) {
                this.f197419e.unsubscribe();
                this.f197420f.onError(th);
            }
        }

        @Override // p153l.bb50
        public void onNext(T t) {
            long j;
            boolean z;
            synchronized (this) {
                try {
                    boolean z2 = this.f197425k;
                    j = this.f197426l;
                    if (z2) {
                        z = false;
                    } else {
                        j++;
                        this.f197426l = j;
                        z = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z) {
                this.f197420f.onNext(t);
                this.f197419e.m207511b(this.f197421g.mo112959b(this, Long.valueOf(j), t, this.f197423i));
            }
        }
    }

    public y460(InterfaceC21510a<T> interfaceC21510a, InterfaceC21511b<T> interfaceC21511b, C22421c<? extends T> c22421c, f2e0 f2e0Var) {
        this.f197415a = interfaceC21510a;
        this.f197416b = interfaceC21511b;
        this.f197417c = c22421c;
        this.f197418d = f2e0Var;
    }

    @Override // p153l.qcj
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public gcg0<? super T> call(gcg0<? super T> gcg0Var) {
        f2e0.AbstractC16877a abstractC16877aCreateWorker = this.f197418d.createWorker();
        gcg0Var.m129866b(abstractC16877aCreateWorker);
        are0 are0Var = new are0(gcg0Var);
        wqe0 wqe0Var = new wqe0();
        are0Var.m129866b(wqe0Var);
        C21512c c21512c = new C21512c(are0Var, this.f197416b, wqe0Var, this.f197417c, abstractC16877aCreateWorker);
        are0Var.m129866b(c21512c);
        are0Var.mo95773f(c21512c.f197424j);
        wqe0Var.m207511b(this.f197415a.mo95332a(c21512c, 0L, abstractC16877aCreateWorker));
        return c21512c;
    }
}
