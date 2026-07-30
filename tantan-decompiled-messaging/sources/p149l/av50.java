package p149l;

import java.util.concurrent.TimeUnit;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes3.dex */
public final class av50<T> implements C22306c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final long f71895a;

    /* JADX INFO: renamed from: b */
    public final TimeUnit f71896b;

    /* JADX INFO: renamed from: c */
    public final bud0 f71897c;

    /* JADX INFO: renamed from: l.av50$a */
    public class C15733a extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public boolean f71898e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ bud0.AbstractC15976a f71899f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ z3g0 f71900g;

        /* JADX INFO: renamed from: l.av50$a$a */
        public class a implements d30 {
            public a() {
            }

            @Override // p149l.d30
            public void call() {
                C15733a c15733a = C15733a.this;
                if (c15733a.f71898e) {
                    return;
                }
                c15733a.f71898e = true;
                c15733a.f71900g.onCompleted();
            }
        }

        /* JADX INFO: renamed from: l.av50$a$b */
        public class b implements d30 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Throwable f71903a;

            public b(Throwable th) {
                this.f71903a = th;
            }

            @Override // p149l.d30
            public void call() {
                C15733a c15733a = C15733a.this;
                if (c15733a.f71898e) {
                    return;
                }
                c15733a.f71898e = true;
                c15733a.f71900g.onError(this.f71903a);
                C15733a.this.f71899f.unsubscribe();
            }
        }

        /* JADX INFO: renamed from: l.av50$a$c */
        public class c implements d30 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Object f71905a;

            public c(Object obj) {
                this.f71905a = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // p149l.d30
            public void call() {
                C15733a c15733a = C15733a.this;
                if (c15733a.f71898e) {
                    return;
                }
                c15733a.f71900g.onNext(this.f71905a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15733a(z3g0 z3g0Var, bud0.AbstractC15976a abstractC15976a, z3g0 z3g0Var2) {
            super(z3g0Var);
            this.f71899f = abstractC15976a;
            this.f71900g = z3g0Var2;
        }

        @Override // p149l.m250
        public void onCompleted() {
            bud0.AbstractC15976a abstractC15976a = this.f71899f;
            a aVar = new a();
            av50 av50Var = av50.this;
            abstractC15976a.mo99202c(aVar, av50Var.f71895a, av50Var.f71896b);
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            this.f71899f.mo99201b(new b(th));
        }

        @Override // p149l.m250
        public void onNext(T t) {
            bud0.AbstractC15976a abstractC15976a = this.f71899f;
            c cVar = new c(t);
            av50 av50Var = av50.this;
            abstractC15976a.mo99202c(cVar, av50Var.f71895a, av50Var.f71896b);
        }
    }

    public av50(long j, TimeUnit timeUnit, bud0 bud0Var) {
        this.f71895a = j;
        this.f71896b = timeUnit;
        this.f71897c = bud0Var;
    }

    @Override // p149l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super T> z3g0Var) {
        bud0.AbstractC15976a abstractC15976aCreateWorker = this.f71897c.createWorker();
        z3g0Var.m217046b(abstractC15976aCreateWorker);
        return new C15733a(z3g0Var, abstractC15976aCreateWorker, z3g0Var);
    }
}
