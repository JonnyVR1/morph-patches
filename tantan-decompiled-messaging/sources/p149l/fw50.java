package p149l;

import p133rx.C22306c;

/* JADX INFO: loaded from: classes3.dex */
public final class fw50<T> implements C22306c.a<T> {

    /* JADX INFO: renamed from: a */
    public final bud0 f99609a;

    /* JADX INFO: renamed from: b */
    public final C22306c<T> f99610b;

    /* JADX INFO: renamed from: l.fw50$a */
    public class C16950a implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ z3g0 f99611a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ bud0.AbstractC15976a f99612b;

        /* JADX INFO: renamed from: l.fw50$a$a */
        public class a extends z3g0<T> {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ Thread f99614e;

            /* JADX INFO: renamed from: l.fw50$a$a$a, reason: collision with other inner class name */
            public class C22724a implements rc90 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ rc90 f99616a;

                /* JADX INFO: renamed from: l.fw50$a$a$a$a, reason: collision with other inner class name */
                public class C22725a implements d30 {

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ long f99618a;

                    public C22725a(long j) {
                        this.f99618a = j;
                    }

                    @Override // p149l.d30
                    public void call() {
                        C22724a.this.f99616a.request(this.f99618a);
                    }
                }

                public C22724a(rc90 rc90Var) {
                    this.f99616a = rc90Var;
                }

                @Override // p149l.rc90
                public void request(long j) {
                    if (a.this.f99614e == Thread.currentThread()) {
                        this.f99616a.request(j);
                    } else {
                        C16950a.this.f99612b.mo99201b(new C22725a(j));
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(z3g0 z3g0Var, Thread thread) {
                super(z3g0Var);
                this.f99614e = thread;
            }

            @Override // p149l.z3g0
            /* JADX INFO: renamed from: f */
            public void mo106696f(rc90 rc90Var) {
                C16950a.this.f99611a.mo106696f(new C22724a(rc90Var));
            }

            @Override // p149l.m250
            public void onCompleted() {
                try {
                    C16950a.this.f99611a.onCompleted();
                } finally {
                    C16950a.this.f99612b.unsubscribe();
                }
            }

            @Override // p149l.m250
            public void onError(Throwable th) {
                try {
                    C16950a.this.f99611a.onError(th);
                } finally {
                    C16950a.this.f99612b.unsubscribe();
                }
            }

            @Override // p149l.m250
            public void onNext(T t) {
                C16950a.this.f99611a.onNext(t);
            }
        }

        public C16950a(z3g0 z3g0Var, bud0.AbstractC15976a abstractC15976a) {
            this.f99611a = z3g0Var;
            this.f99612b = abstractC15976a;
        }

        @Override // p149l.d30
        public void call() {
            fw50.this.f99610b.unsafeSubscribe(new a(this.f99611a, Thread.currentThread()));
        }
    }

    public fw50(C22306c<T> c22306c, bud0 bud0Var) {
        this.f99609a = bud0Var;
        this.f99610b = c22306c;
    }

    @Override // p149l.e30
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(z3g0<? super T> z3g0Var) {
        bud0.AbstractC15976a abstractC15976aCreateWorker = this.f99609a.createWorker();
        z3g0Var.m217046b(abstractC15976aCreateWorker);
        abstractC15976aCreateWorker.mo99201b(new C16950a(z3g0Var, abstractC15976aCreateWorker));
    }
}
