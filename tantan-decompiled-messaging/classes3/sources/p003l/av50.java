package p003l;

import java.util.concurrent.TimeUnit;
import p014rx.C1099c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class av50<T> implements C1099c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final long f2286a;

    /* JADX INFO: renamed from: b */
    public final TimeUnit f2287b;

    /* JADX INFO: renamed from: c */
    public final bud0 f2288c;

    /* JADX INFO: renamed from: l.av50$a */
    public class C0165a extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public boolean f2289e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ bud0.AbstractC0185a f2290f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ z3g0 f2291g;

        /* JADX INFO: renamed from: l.av50$a$a */
        public class a implements d30 {
            public a() {
            }

            @Override // p003l.d30
            public void call() {
                C0165a c0165a = C0165a.this;
                if (c0165a.f2289e) {
                    return;
                }
                c0165a.f2289e = true;
                c0165a.f2291g.onCompleted();
            }
        }

        /* JADX INFO: renamed from: l.av50$a$b */
        public class b implements d30 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Throwable f2294a;

            public b(Throwable th) {
                this.f2294a = th;
            }

            @Override // p003l.d30
            public void call() {
                C0165a c0165a = C0165a.this;
                if (c0165a.f2289e) {
                    return;
                }
                c0165a.f2289e = true;
                c0165a.f2291g.onError(this.f2294a);
                C0165a.this.f2290f.unsubscribe();
            }
        }

        /* JADX INFO: renamed from: l.av50$a$c */
        public class c implements d30 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Object f2296a;

            public c(Object obj) {
                this.f2296a = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // p003l.d30
            public void call() {
                C0165a c0165a = C0165a.this;
                if (c0165a.f2289e) {
                    return;
                }
                c0165a.f2291g.onNext(this.f2296a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0165a(z3g0 z3g0Var, bud0.AbstractC0185a abstractC0185a, z3g0 z3g0Var2) {
            super(z3g0Var);
            this.f2290f = abstractC0185a;
            this.f2291g = z3g0Var2;
        }

        @Override // p003l.m250
        public void onCompleted() {
            bud0.AbstractC0185a abstractC0185a = this.f2290f;
            a aVar = new a();
            av50 av50Var = av50.this;
            abstractC0185a.mo2915c(aVar, av50Var.f2286a, av50Var.f2287b);
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            this.f2290f.mo2914b(new b(th));
        }

        @Override // p003l.m250
        public void onNext(T t) {
            bud0.AbstractC0185a abstractC0185a = this.f2290f;
            c cVar = new c(t);
            av50 av50Var = av50.this;
            abstractC0185a.mo2915c(cVar, av50Var.f2286a, av50Var.f2287b);
        }
    }

    public av50(long j, TimeUnit timeUnit, bud0 bud0Var) {
        this.f2286a = j;
        this.f2287b = timeUnit;
        this.f2288c = bud0Var;
    }

    @Override // p003l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super T> z3g0Var) {
        bud0.AbstractC0185a abstractC0185aCreateWorker = this.f2288c.createWorker();
        z3g0Var.m9240b(abstractC0185aCreateWorker);
        return new C0165a(z3g0Var, abstractC0185aCreateWorker, z3g0Var);
    }
}
