package p003l;

import p014rx.C1099c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class fw50<T> implements C1099c.a<T> {

    /* JADX INFO: renamed from: a */
    public final bud0 f3738a;

    /* JADX INFO: renamed from: b */
    public final C1099c<T> f3739b;

    /* JADX INFO: renamed from: l.fw50$a */
    public class C0296a implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ z3g0 f3740a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ bud0.AbstractC0185a f3741b;

        /* JADX INFO: renamed from: l.fw50$a$a */
        public class a extends z3g0<T> {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ Thread f3743e;

            /* JADX INFO: renamed from: l.fw50$a$a$a, reason: collision with other inner class name */
            public class C1444a implements rc90 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ rc90 f3745a;

                /* JADX INFO: renamed from: l.fw50$a$a$a$a, reason: collision with other inner class name */
                public class C1445a implements d30 {

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ long f3747a;

                    public C1445a(long j) {
                        this.f3747a = j;
                    }

                    @Override // p003l.d30
                    public void call() {
                        C1444a.this.f3745a.request(this.f3747a);
                    }
                }

                public C1444a(rc90 rc90Var) {
                    this.f3745a = rc90Var;
                }

                @Override // p003l.rc90
                public void request(long j) {
                    if (a.this.f3743e == Thread.currentThread()) {
                        this.f3745a.request(j);
                    } else {
                        C0296a.this.f3741b.mo2914b(new C1445a(j));
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(z3g0 z3g0Var, Thread thread) {
                super(z3g0Var);
                this.f3743e = thread;
            }

            @Override // p003l.z3g0
            /* JADX INFO: renamed from: f */
            public void mo3257f(rc90 rc90Var) {
                C0296a.this.f3740a.mo3257f(new C1444a(rc90Var));
            }

            @Override // p003l.m250
            public void onCompleted() {
                try {
                    C0296a.this.f3740a.onCompleted();
                } finally {
                    C0296a.this.f3741b.unsubscribe();
                }
            }

            @Override // p003l.m250
            public void onError(Throwable th) {
                try {
                    C0296a.this.f3740a.onError(th);
                } finally {
                    C0296a.this.f3741b.unsubscribe();
                }
            }

            @Override // p003l.m250
            public void onNext(T t) {
                C0296a.this.f3740a.onNext(t);
            }
        }

        public C0296a(z3g0 z3g0Var, bud0.AbstractC0185a abstractC0185a) {
            this.f3740a = z3g0Var;
            this.f3741b = abstractC0185a;
        }

        @Override // p003l.d30
        public void call() {
            fw50.this.f3739b.unsafeSubscribe(new a(this.f3740a, Thread.currentThread()));
        }
    }

    public fw50(C1099c<T> c1099c, bud0 bud0Var) {
        this.f3738a = bud0Var;
        this.f3739b = c1099c;
    }

    @Override // p003l.e30
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(z3g0<? super T> z3g0Var) {
        bud0.AbstractC0185a abstractC0185aCreateWorker = this.f3738a.createWorker();
        z3g0Var.m9240b(abstractC0185aCreateWorker);
        abstractC0185aCreateWorker.mo2914b(new C0296a(z3g0Var, abstractC0185aCreateWorker));
    }
}
