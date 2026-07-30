package p149l;

import java.util.concurrent.atomic.AtomicInteger;
import p133rx.C22306c;
import p133rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes3.dex */
public final class sv50<T> implements C22306c.c<T, C22306c<T>> {

    /* JADX INFO: renamed from: a */
    public final x9j<Integer, Throwable, Boolean> f166529a;

    public sv50(x9j<Integer, Throwable, Boolean> x9jVar) {
        this.f166529a = x9jVar;
    }

    @Override // p149l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super C22306c<T>> call(z3g0<? super T> z3g0Var) {
        bud0.AbstractC15976a abstractC15976aCreateWorker = Schedulers.trampoline().createWorker();
        z3g0Var.m217046b(abstractC15976aCreateWorker);
        rie0 rie0Var = new rie0();
        z3g0Var.m217046b(rie0Var);
        tc90 tc90Var = new tc90();
        z3g0Var.mo106696f(tc90Var);
        return new C20037a(z3g0Var, this.f166529a, abstractC15976aCreateWorker, rie0Var, tc90Var);
    }

    /* JADX INFO: renamed from: l.sv50$a */
    public static final class C20037a<T> extends z3g0<C22306c<T>> {

        /* JADX INFO: renamed from: e */
        public final z3g0<? super T> f166530e;

        /* JADX INFO: renamed from: f */
        public final x9j<Integer, Throwable, Boolean> f166531f;

        /* JADX INFO: renamed from: g */
        public final bud0.AbstractC15976a f166532g;

        /* JADX INFO: renamed from: h */
        public final rie0 f166533h;

        /* JADX INFO: renamed from: i */
        public final tc90 f166534i;

        /* JADX INFO: renamed from: j */
        public final AtomicInteger f166535j = new AtomicInteger();

        /* JADX INFO: renamed from: l.sv50$a$a */
        public class a implements d30 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C22306c f166536a;

            /* JADX INFO: renamed from: l.sv50$a$a$a, reason: collision with other inner class name */
            public class C22729a extends z3g0<T> {

                /* JADX INFO: renamed from: e */
                public boolean f166538e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ d30 f166539f;

                public C22729a(d30 d30Var) {
                    this.f166539f = d30Var;
                }

                @Override // p149l.z3g0
                /* JADX INFO: renamed from: f */
                public void mo106696f(rc90 rc90Var) {
                    C20037a.this.f166534i.m187981c(rc90Var);
                }

                @Override // p149l.m250
                public void onCompleted() {
                    if (this.f166538e) {
                        return;
                    }
                    this.f166538e = true;
                    C20037a.this.f166530e.onCompleted();
                }

                @Override // p149l.m250
                public void onError(Throwable th) {
                    if (this.f166538e) {
                        return;
                    }
                    this.f166538e = true;
                    C20037a c20037a = C20037a.this;
                    if (!c20037a.f166531f.call(Integer.valueOf(c20037a.f166535j.get()), th).booleanValue() || C20037a.this.f166532g.isUnsubscribed()) {
                        C20037a.this.f166530e.onError(th);
                    } else {
                        C20037a.this.f166532g.mo99201b(this.f166539f);
                    }
                }

                @Override // p149l.m250
                public void onNext(T t) {
                    if (this.f166538e) {
                        return;
                    }
                    C20037a.this.f166530e.onNext(t);
                    C20037a.this.f166534i.m187980b(1L);
                }
            }

            public a(C22306c c22306c) {
                this.f166536a = c22306c;
            }

            @Override // p149l.d30
            public void call() {
                C20037a.this.f166535j.incrementAndGet();
                C22729a c22729a = new C22729a(this);
                C20037a.this.f166533h.m179504b(c22729a);
                this.f166536a.unsafeSubscribe(c22729a);
            }
        }

        public C20037a(z3g0<? super T> z3g0Var, x9j<Integer, Throwable, Boolean> x9jVar, bud0.AbstractC15976a abstractC15976a, rie0 rie0Var, tc90 tc90Var) {
            this.f166530e = z3g0Var;
            this.f166531f = x9jVar;
            this.f166532g = abstractC15976a;
            this.f166533h = rie0Var;
            this.f166534i = tc90Var;
        }

        @Override // p149l.m250
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void onNext(C22306c<T> c22306c) {
            this.f166532g.mo99201b(new a(c22306c));
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            this.f166530e.onError(th);
        }

        @Override // p149l.m250
        public void onCompleted() {
        }
    }
}
