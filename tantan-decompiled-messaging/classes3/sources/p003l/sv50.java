package p003l;

import java.util.concurrent.atomic.AtomicInteger;
import p014rx.C1099c;
import p014rx.schedulers.Schedulers;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class sv50<T> implements C1099c.c<T, C1099c<T>> {

    /* JADX INFO: renamed from: a */
    public final x9j<Integer, Throwable, Boolean> f7329a;

    public sv50(x9j<Integer, Throwable, Boolean> x9jVar) {
        this.f7329a = x9jVar;
    }

    @Override // p003l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super C1099c<T>> call(z3g0<? super T> z3g0Var) {
        bud0.AbstractC0185a abstractC0185aCreateWorker = Schedulers.trampoline().createWorker();
        z3g0Var.m9240b(abstractC0185aCreateWorker);
        rie0 rie0Var = new rie0();
        z3g0Var.m9240b(rie0Var);
        tc90 tc90Var = new tc90();
        z3g0Var.mo3257f(tc90Var);
        return new C0538a(z3g0Var, this.f7329a, abstractC0185aCreateWorker, rie0Var, tc90Var);
    }

    /* JADX INFO: renamed from: l.sv50$a */
    public static final class C0538a<T> extends z3g0<C1099c<T>> {

        /* JADX INFO: renamed from: e */
        public final z3g0<? super T> f7330e;

        /* JADX INFO: renamed from: f */
        public final x9j<Integer, Throwable, Boolean> f7331f;

        /* JADX INFO: renamed from: g */
        public final bud0.AbstractC0185a f7332g;

        /* JADX INFO: renamed from: h */
        public final rie0 f7333h;

        /* JADX INFO: renamed from: i */
        public final tc90 f7334i;

        /* JADX INFO: renamed from: j */
        public final AtomicInteger f7335j = new AtomicInteger();

        /* JADX INFO: renamed from: l.sv50$a$a */
        public class a implements d30 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C1099c f7336a;

            /* JADX INFO: renamed from: l.sv50$a$a$a, reason: collision with other inner class name */
            public class C1446a extends z3g0<T> {

                /* JADX INFO: renamed from: e */
                public boolean f7338e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ d30 f7339f;

                public C1446a(d30 d30Var) {
                    this.f7339f = d30Var;
                }

                @Override // p003l.z3g0
                /* JADX INFO: renamed from: f */
                public void mo3257f(rc90 rc90Var) {
                    C0538a.this.f7334i.m7738c(rc90Var);
                }

                @Override // p003l.m250
                public void onCompleted() {
                    if (this.f7338e) {
                        return;
                    }
                    this.f7338e = true;
                    C0538a.this.f7330e.onCompleted();
                }

                @Override // p003l.m250
                public void onError(Throwable th) {
                    if (this.f7338e) {
                        return;
                    }
                    this.f7338e = true;
                    C0538a c0538a = C0538a.this;
                    if (!c0538a.f7331f.call(Integer.valueOf(c0538a.f7335j.get()), th).booleanValue() || C0538a.this.f7332g.isUnsubscribed()) {
                        C0538a.this.f7330e.onError(th);
                    } else {
                        C0538a.this.f7332g.mo2914b(this.f7339f);
                    }
                }

                @Override // p003l.m250
                public void onNext(T t) {
                    if (this.f7338e) {
                        return;
                    }
                    C0538a.this.f7330e.onNext(t);
                    C0538a.this.f7334i.m7737b(1L);
                }
            }

            public a(C1099c c1099c) {
                this.f7336a = c1099c;
            }

            @Override // p003l.d30
            public void call() {
                C0538a.this.f7335j.incrementAndGet();
                C1446a c1446a = new C1446a(this);
                C0538a.this.f7333h.m7260b(c1446a);
                this.f7336a.unsafeSubscribe(c1446a);
            }
        }

        public C0538a(z3g0<? super T> z3g0Var, x9j<Integer, Throwable, Boolean> x9jVar, bud0.AbstractC0185a abstractC0185a, rie0 rie0Var, tc90 tc90Var) {
            this.f7330e = z3g0Var;
            this.f7331f = x9jVar;
            this.f7332g = abstractC0185a;
            this.f7333h = rie0Var;
            this.f7334i = tc90Var;
        }

        @Override // p003l.m250
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void onNext(C1099c<T> c1099c) {
            this.f7332g.mo2914b(new a(c1099c));
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            this.f7330e.onError(th);
        }

        @Override // p003l.m250
        public void onCompleted() {
        }
    }
}
