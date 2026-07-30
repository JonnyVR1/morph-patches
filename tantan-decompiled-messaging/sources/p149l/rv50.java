package p149l;

import p133rx.C22306c;

/* JADX INFO: loaded from: classes3.dex */
public final class rv50<T> implements C22306c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final w9j<Throwable, ? extends C22306c<? extends T>> f161163a;

    /* JADX INFO: renamed from: l.rv50$a */
    public static class C19794a implements w9j<Throwable, C22306c<? extends T>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ w9j f161164a;

        public C19794a(w9j w9jVar) {
            this.f161164a = w9jVar;
        }

        @Override // p149l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C22306c<? extends T> call(Throwable th) {
            return C22306c.just(this.f161164a.call(th));
        }
    }

    /* JADX INFO: renamed from: l.rv50$b */
    public static class C19795b implements w9j<Throwable, C22306c<? extends T>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C22306c f161165a;

        public C19795b(C22306c c22306c) {
            this.f161165a = c22306c;
        }

        @Override // p149l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C22306c<? extends T> call(Throwable th) {
            return this.f161165a;
        }
    }

    /* JADX INFO: renamed from: l.rv50$c */
    public static class C19796c implements w9j<Throwable, C22306c<? extends T>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C22306c f161166a;

        public C19796c(C22306c c22306c) {
            this.f161166a = c22306c;
        }

        @Override // p149l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C22306c<? extends T> call(Throwable th) {
            return th instanceof Exception ? this.f161166a : C22306c.error(th);
        }
    }

    /* JADX INFO: renamed from: l.rv50$d */
    public class C19797d extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public boolean f161167e;

        /* JADX INFO: renamed from: f */
        public long f161168f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ z3g0 f161169g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ tc90 f161170h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ rie0 f161171i;

        /* JADX INFO: renamed from: l.rv50$d$a */
        public class a extends z3g0<T> {
            public a() {
            }

            @Override // p149l.z3g0
            /* JADX INFO: renamed from: f */
            public void mo106696f(rc90 rc90Var) {
                C19797d.this.f161170h.m187981c(rc90Var);
            }

            @Override // p149l.m250
            public void onCompleted() {
                C19797d.this.f161169g.onCompleted();
            }

            @Override // p149l.m250
            public void onError(Throwable th) {
                C19797d.this.f161169g.onError(th);
            }

            @Override // p149l.m250
            public void onNext(T t) {
                C19797d.this.f161169g.onNext(t);
            }
        }

        public C19797d(z3g0 z3g0Var, tc90 tc90Var, rie0 rie0Var) {
            this.f161169g = z3g0Var;
            this.f161170h = tc90Var;
            this.f161171i = rie0Var;
        }

        @Override // p149l.z3g0
        /* JADX INFO: renamed from: f */
        public void mo106696f(rc90 rc90Var) {
            this.f161170h.m187981c(rc90Var);
        }

        @Override // p149l.m250
        public void onCompleted() {
            if (this.f161167e) {
                return;
            }
            this.f161167e = true;
            this.f161169g.onCompleted();
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            if (this.f161167e) {
                f5f.m119491e(th);
                ejd0.m116793j(th);
                return;
            }
            this.f161167e = true;
            try {
                unsubscribe();
                a aVar = new a();
                this.f161171i.m179504b(aVar);
                long j = this.f161168f;
                if (j != 0) {
                    this.f161170h.m187980b(j);
                }
                rv50.this.f161163a.call(th).unsafeSubscribe(aVar);
            } catch (Throwable th2) {
                f5f.m119492f(th2, this.f161169g);
            }
        }

        @Override // p149l.m250
        public void onNext(T t) {
            if (this.f161167e) {
                return;
            }
            this.f161168f++;
            this.f161169g.onNext(t);
        }
    }

    public rv50(w9j<Throwable, ? extends C22306c<? extends T>> w9jVar) {
        this.f161163a = w9jVar;
    }

    /* JADX INFO: renamed from: b */
    public static <T> rv50<T> m181232b(C22306c<? extends T> c22306c) {
        return new rv50<>(new C19796c(c22306c));
    }

    /* JADX INFO: renamed from: c */
    public static <T> rv50<T> m181233c(C22306c<? extends T> c22306c) {
        return new rv50<>(new C19795b(c22306c));
    }

    /* JADX INFO: renamed from: d */
    public static <T> rv50<T> m181234d(w9j<Throwable, ? extends T> w9jVar) {
        return new rv50<>(new C19794a(w9jVar));
    }

    @Override // p149l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super T> z3g0Var) {
        tc90 tc90Var = new tc90();
        rie0 rie0Var = new rie0();
        C19797d c19797d = new C19797d(z3g0Var, tc90Var, rie0Var);
        rie0Var.m179504b(c19797d);
        z3g0Var.m217046b(rie0Var);
        z3g0Var.mo106696f(tc90Var);
        return c19797d;
    }
}
