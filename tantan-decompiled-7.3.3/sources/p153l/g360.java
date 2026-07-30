package p153l;

import java.util.concurrent.TimeUnit;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
public final class g360<T> implements C22421c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final long f101948a;

    /* JADX INFO: renamed from: b */
    public final TimeUnit f101949b;

    /* JADX INFO: renamed from: c */
    public final f2e0 f101950c;

    /* JADX INFO: renamed from: l.g360$a */
    public class C17125a extends gcg0<T> {

        /* JADX INFO: renamed from: e */
        public boolean f101951e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ f2e0.AbstractC16877a f101952f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ gcg0 f101953g;

        /* JADX INFO: renamed from: l.g360$a$a */
        public class a implements x20 {
            public a() {
            }

            @Override // p153l.x20
            public void call() {
                C17125a c17125a = C17125a.this;
                if (c17125a.f101951e) {
                    return;
                }
                c17125a.f101951e = true;
                c17125a.f101953g.onCompleted();
            }
        }

        /* JADX INFO: renamed from: l.g360$a$b */
        public class b implements x20 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Throwable f101956a;

            public b(Throwable th) {
                this.f101956a = th;
            }

            @Override // p153l.x20
            public void call() {
                C17125a c17125a = C17125a.this;
                if (c17125a.f101951e) {
                    return;
                }
                c17125a.f101951e = true;
                c17125a.f101953g.onError(this.f101956a);
                C17125a.this.f101952f.unsubscribe();
            }
        }

        /* JADX INFO: renamed from: l.g360$a$c */
        public class c implements x20 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Object f101958a;

            public c(Object obj) {
                this.f101958a = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // p153l.x20
            public void call() {
                C17125a c17125a = C17125a.this;
                if (c17125a.f101951e) {
                    return;
                }
                c17125a.f101953g.onNext(this.f101958a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17125a(gcg0 gcg0Var, f2e0.AbstractC16877a abstractC16877a, gcg0 gcg0Var2) {
            super(gcg0Var);
            this.f101952f = abstractC16877a;
            this.f101953g = gcg0Var2;
        }

        @Override // p153l.bb50
        public void onCompleted() {
            f2e0.AbstractC16877a abstractC16877a = this.f101952f;
            a aVar = new a();
            g360 g360Var = g360.this;
            abstractC16877a.mo102837c(aVar, g360Var.f101948a, g360Var.f101949b);
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            this.f101952f.mo102836b(new b(th));
        }

        @Override // p153l.bb50
        public void onNext(T t) {
            f2e0.AbstractC16877a abstractC16877a = this.f101952f;
            c cVar = new c(t);
            g360 g360Var = g360.this;
            abstractC16877a.mo102837c(cVar, g360Var.f101948a, g360Var.f101949b);
        }
    }

    public g360(long j, TimeUnit timeUnit, f2e0 f2e0Var) {
        this.f101948a = j;
        this.f101949b = timeUnit;
        this.f101950c = f2e0Var;
    }

    @Override // p153l.qcj
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public gcg0<? super T> call(gcg0<? super T> gcg0Var) {
        f2e0.AbstractC16877a abstractC16877aCreateWorker = this.f101950c.createWorker();
        gcg0Var.m129866b(abstractC16877aCreateWorker);
        return new C17125a(gcg0Var, abstractC16877aCreateWorker, gcg0Var);
    }
}
