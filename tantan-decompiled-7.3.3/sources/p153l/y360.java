package p153l;

import java.util.concurrent.atomic.AtomicInteger;
import p137rx.C22421c;
import p137rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes3.dex */
public final class y360<T> implements C22421c.c<T, C22421c<T>> {

    /* JADX INFO: renamed from: a */
    public final rcj<Integer, Throwable, Boolean> f197308a;

    public y360(rcj<Integer, Throwable, Boolean> rcjVar) {
        this.f197308a = rcjVar;
    }

    @Override // p153l.qcj
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public gcg0<? super C22421c<T>> call(gcg0<? super T> gcg0Var) {
        f2e0.AbstractC16877a abstractC16877aCreateWorker = Schedulers.trampoline().createWorker();
        gcg0Var.m129866b(abstractC16877aCreateWorker);
        wqe0 wqe0Var = new wqe0();
        gcg0Var.m129866b(wqe0Var);
        xk90 xk90Var = new xk90();
        gcg0Var.mo95773f(xk90Var);
        return new C21503a(gcg0Var, this.f197308a, abstractC16877aCreateWorker, wqe0Var, xk90Var);
    }

    /* JADX INFO: renamed from: l.y360$a */
    public static final class C21503a<T> extends gcg0<C22421c<T>> {

        /* JADX INFO: renamed from: e */
        public final gcg0<? super T> f197309e;

        /* JADX INFO: renamed from: f */
        public final rcj<Integer, Throwable, Boolean> f197310f;

        /* JADX INFO: renamed from: g */
        public final f2e0.AbstractC16877a f197311g;

        /* JADX INFO: renamed from: h */
        public final wqe0 f197312h;

        /* JADX INFO: renamed from: i */
        public final xk90 f197313i;

        /* JADX INFO: renamed from: j */
        public final AtomicInteger f197314j = new AtomicInteger();

        /* JADX INFO: renamed from: l.y360$a$a */
        public class a implements x20 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C22421c f197315a;

            /* JADX INFO: renamed from: l.y360$a$a$a, reason: collision with other inner class name */
            public class C22846a extends gcg0<T> {

                /* JADX INFO: renamed from: e */
                public boolean f197317e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ x20 f197318f;

                public C22846a(x20 x20Var) {
                    this.f197318f = x20Var;
                }

                @Override // p153l.gcg0
                /* JADX INFO: renamed from: f */
                public void mo95773f(vk90 vk90Var) {
                    C21503a.this.f197313i.m211356c(vk90Var);
                }

                @Override // p153l.bb50
                public void onCompleted() {
                    if (this.f197317e) {
                        return;
                    }
                    this.f197317e = true;
                    C21503a.this.f197309e.onCompleted();
                }

                @Override // p153l.bb50
                public void onError(Throwable th) {
                    if (this.f197317e) {
                        return;
                    }
                    this.f197317e = true;
                    C21503a c21503a = C21503a.this;
                    if (!c21503a.f197310f.call(Integer.valueOf(c21503a.f197314j.get()), th).booleanValue() || C21503a.this.f197311g.isUnsubscribed()) {
                        C21503a.this.f197309e.onError(th);
                    } else {
                        C21503a.this.f197311g.mo102836b(this.f197318f);
                    }
                }

                @Override // p153l.bb50
                public void onNext(T t) {
                    if (this.f197317e) {
                        return;
                    }
                    C21503a.this.f197309e.onNext(t);
                    C21503a.this.f197313i.m211355b(1L);
                }
            }

            public a(C22421c c22421c) {
                this.f197315a = c22421c;
            }

            @Override // p153l.x20
            public void call() {
                C21503a.this.f197314j.incrementAndGet();
                C22846a c22846a = new C22846a(this);
                C21503a.this.f197312h.m207511b(c22846a);
                this.f197315a.unsafeSubscribe(c22846a);
            }
        }

        public C21503a(gcg0<? super T> gcg0Var, rcj<Integer, Throwable, Boolean> rcjVar, f2e0.AbstractC16877a abstractC16877a, wqe0 wqe0Var, xk90 xk90Var) {
            this.f197309e = gcg0Var;
            this.f197310f = rcjVar;
            this.f197311g = abstractC16877a;
            this.f197312h = wqe0Var;
            this.f197313i = xk90Var;
        }

        @Override // p153l.bb50
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void onNext(C22421c<T> c22421c) {
            this.f197311g.mo102836b(new a(c22421c));
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            this.f197309e.onError(th);
        }

        @Override // p153l.bb50
        public void onCompleted() {
        }
    }
}
