package p003l;

import p014rx.C1099c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class rv50<T> implements C1099c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final w9j<Throwable, ? extends C1099c<? extends T>> f7085a;

    /* JADX INFO: renamed from: l.rv50$a */
    public static class C0515a implements w9j<Throwable, C1099c<? extends T>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ w9j f7086a;

        public C0515a(w9j w9jVar) {
            this.f7086a = w9jVar;
        }

        @Override // p003l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1099c<? extends T> call(Throwable th) {
            return C1099c.just(this.f7086a.call(th));
        }
    }

    /* JADX INFO: renamed from: l.rv50$b */
    public static class C0516b implements w9j<Throwable, C1099c<? extends T>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C1099c f7087a;

        public C0516b(C1099c c1099c) {
            this.f7087a = c1099c;
        }

        @Override // p003l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1099c<? extends T> call(Throwable th) {
            return this.f7087a;
        }
    }

    /* JADX INFO: renamed from: l.rv50$c */
    public static class C0517c implements w9j<Throwable, C1099c<? extends T>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C1099c f7088a;

        public C0517c(C1099c c1099c) {
            this.f7088a = c1099c;
        }

        @Override // p003l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1099c<? extends T> call(Throwable th) {
            return th instanceof Exception ? this.f7088a : C1099c.error(th);
        }
    }

    /* JADX INFO: renamed from: l.rv50$d */
    public class C0518d extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public boolean f7089e;

        /* JADX INFO: renamed from: f */
        public long f7090f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ z3g0 f7091g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ tc90 f7092h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ rie0 f7093i;

        /* JADX INFO: renamed from: l.rv50$d$a */
        public class a extends z3g0<T> {
            public a() {
            }

            @Override // p003l.z3g0
            /* JADX INFO: renamed from: f */
            public void mo3257f(rc90 rc90Var) {
                C0518d.this.f7092h.m7738c(rc90Var);
            }

            @Override // p003l.m250
            public void onCompleted() {
                C0518d.this.f7091g.onCompleted();
            }

            @Override // p003l.m250
            public void onError(Throwable th) {
                C0518d.this.f7091g.onError(th);
            }

            @Override // p003l.m250
            public void onNext(T t) {
                C0518d.this.f7091g.onNext(t);
            }
        }

        public C0518d(z3g0 z3g0Var, tc90 tc90Var, rie0 rie0Var) {
            this.f7091g = z3g0Var;
            this.f7092h = tc90Var;
            this.f7093i = rie0Var;
        }

        @Override // p003l.z3g0
        /* JADX INFO: renamed from: f */
        public void mo3257f(rc90 rc90Var) {
            this.f7092h.m7738c(rc90Var);
        }

        @Override // p003l.m250
        public void onCompleted() {
            if (this.f7089e) {
                return;
            }
            this.f7089e = true;
            this.f7091g.onCompleted();
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            if (this.f7089e) {
                f5f.m3964e(th);
                ejd0.m3864j(th);
                return;
            }
            this.f7089e = true;
            try {
                unsubscribe();
                a aVar = new a();
                this.f7093i.m7260b(aVar);
                long j = this.f7090f;
                if (j != 0) {
                    this.f7092h.m7737b(j);
                }
                rv50.this.f7085a.call(th).unsafeSubscribe(aVar);
            } catch (Throwable th2) {
                f5f.m3965f(th2, this.f7091g);
            }
        }

        @Override // p003l.m250
        public void onNext(T t) {
            if (this.f7089e) {
                return;
            }
            this.f7090f++;
            this.f7091g.onNext(t);
        }
    }

    public rv50(w9j<Throwable, ? extends C1099c<? extends T>> w9jVar) {
        this.f7085a = w9jVar;
    }

    /* JADX INFO: renamed from: b */
    public static <T> rv50<T> m7393b(C1099c<? extends T> c1099c) {
        return new rv50<>(new C0517c(c1099c));
    }

    /* JADX INFO: renamed from: c */
    public static <T> rv50<T> m7394c(C1099c<? extends T> c1099c) {
        return new rv50<>(new C0516b(c1099c));
    }

    /* JADX INFO: renamed from: d */
    public static <T> rv50<T> m7395d(w9j<Throwable, ? extends T> w9jVar) {
        return new rv50<>(new C0515a(w9jVar));
    }

    @Override // p003l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super T> z3g0Var) {
        tc90 tc90Var = new tc90();
        rie0 rie0Var = new rie0();
        C0518d c0518d = new C0518d(z3g0Var, tc90Var, rie0Var);
        rie0Var.m7260b(c0518d);
        z3g0Var.m9240b(rie0Var);
        z3g0Var.mo3257f(tc90Var);
        return c0518d;
    }
}
