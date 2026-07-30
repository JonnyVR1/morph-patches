package p149l;

import p133rx.C22306c;

/* JADX INFO: loaded from: classes3.dex */
public final class hw50<T> implements C22306c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final C22306c<? extends T> f109726a;

    /* JADX INFO: renamed from: l.hw50$a */
    public static final class C17414a<T> extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final tc90 f109727e;

        /* JADX INFO: renamed from: f */
        public final z3g0<? super T> f109728f;

        public C17414a(z3g0<? super T> z3g0Var, tc90 tc90Var) {
            this.f109728f = z3g0Var;
            this.f109727e = tc90Var;
        }

        @Override // p149l.z3g0
        /* JADX INFO: renamed from: f */
        public void mo106696f(rc90 rc90Var) {
            this.f109727e.m187981c(rc90Var);
        }

        @Override // p149l.m250
        public void onCompleted() {
            this.f109728f.onCompleted();
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            this.f109728f.onError(th);
        }

        @Override // p149l.m250
        public void onNext(T t) {
            this.f109728f.onNext(t);
            this.f109727e.m187980b(1L);
        }
    }

    /* JADX INFO: renamed from: l.hw50$b */
    public static final class C17415b<T> extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public boolean f109729e = true;

        /* JADX INFO: renamed from: f */
        public final z3g0<? super T> f109730f;

        /* JADX INFO: renamed from: g */
        public final rie0 f109731g;

        /* JADX INFO: renamed from: h */
        public final tc90 f109732h;

        /* JADX INFO: renamed from: i */
        public final C22306c<? extends T> f109733i;

        public C17415b(z3g0<? super T> z3g0Var, rie0 rie0Var, tc90 tc90Var, C22306c<? extends T> c22306c) {
            this.f109730f = z3g0Var;
            this.f109731g = rie0Var;
            this.f109732h = tc90Var;
            this.f109733i = c22306c;
        }

        @Override // p149l.z3g0
        /* JADX INFO: renamed from: f */
        public void mo106696f(rc90 rc90Var) {
            this.f109732h.m187981c(rc90Var);
        }

        /* JADX INFO: renamed from: g */
        public final void m133238g() {
            C17414a c17414a = new C17414a(this.f109730f, this.f109732h);
            this.f109731g.m179504b(c17414a);
            this.f109733i.unsafeSubscribe(c17414a);
        }

        @Override // p149l.m250
        public void onCompleted() {
            boolean z = this.f109729e;
            z3g0<? super T> z3g0Var = this.f109730f;
            if (!z) {
                z3g0Var.onCompleted();
            } else {
                if (z3g0Var.isUnsubscribed()) {
                    return;
                }
                m133238g();
            }
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            this.f109730f.onError(th);
        }

        @Override // p149l.m250
        public void onNext(T t) {
            this.f109729e = false;
            this.f109730f.onNext(t);
            this.f109732h.m187980b(1L);
        }
    }

    public hw50(C22306c<? extends T> c22306c) {
        this.f109726a = c22306c;
    }

    @Override // p149l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super T> z3g0Var) {
        rie0 rie0Var = new rie0();
        tc90 tc90Var = new tc90();
        C17415b c17415b = new C17415b(z3g0Var, rie0Var, tc90Var, this.f109726a);
        rie0Var.m179504b(c17415b);
        z3g0Var.m217046b(rie0Var);
        z3g0Var.mo106696f(tc90Var);
        return c17415b;
    }
}
