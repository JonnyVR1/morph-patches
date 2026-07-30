package p153l;

import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
public final class l460<T> implements C22421c.a<T> {

    /* JADX INFO: renamed from: a */
    public final f2e0 f129931a;

    /* JADX INFO: renamed from: b */
    public final C22421c<T> f129932b;

    /* JADX INFO: renamed from: l.l460$a */
    public class C18341a implements x20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ gcg0 f129933a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ f2e0.AbstractC16877a f129934b;

        /* JADX INFO: renamed from: l.l460$a$a */
        public class a extends gcg0<T> {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ Thread f129936e;

            /* JADX INFO: renamed from: l.l460$a$a$a, reason: collision with other inner class name */
            public class C22839a implements vk90 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ vk90 f129938a;

                /* JADX INFO: renamed from: l.l460$a$a$a$a, reason: collision with other inner class name */
                public class C22840a implements x20 {

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ long f129940a;

                    public C22840a(long j) {
                        this.f129940a = j;
                    }

                    @Override // p153l.x20
                    public void call() {
                        C22839a.this.f129938a.request(this.f129940a);
                    }
                }

                public C22839a(vk90 vk90Var) {
                    this.f129938a = vk90Var;
                }

                @Override // p153l.vk90
                public void request(long j) {
                    if (a.this.f129936e == Thread.currentThread()) {
                        this.f129938a.request(j);
                    } else {
                        C18341a.this.f129934b.mo102836b(new C22840a(j));
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(gcg0 gcg0Var, Thread thread) {
                super(gcg0Var);
                this.f129936e = thread;
            }

            @Override // p153l.gcg0
            /* JADX INFO: renamed from: f */
            public void mo95773f(vk90 vk90Var) {
                C18341a.this.f129933a.mo95773f(new C22839a(vk90Var));
            }

            @Override // p153l.bb50
            public void onCompleted() {
                try {
                    C18341a.this.f129933a.onCompleted();
                } finally {
                    C18341a.this.f129934b.unsubscribe();
                }
            }

            @Override // p153l.bb50
            public void onError(Throwable th) {
                try {
                    C18341a.this.f129933a.onError(th);
                } finally {
                    C18341a.this.f129934b.unsubscribe();
                }
            }

            @Override // p153l.bb50
            public void onNext(T t) {
                C18341a.this.f129933a.onNext(t);
            }
        }

        public C18341a(gcg0 gcg0Var, f2e0.AbstractC16877a abstractC16877a) {
            this.f129933a = gcg0Var;
            this.f129934b = abstractC16877a;
        }

        @Override // p153l.x20
        public void call() {
            l460.this.f129932b.unsafeSubscribe(new a(this.f129933a, Thread.currentThread()));
        }
    }

    public l460(C22421c<T> c22421c, f2e0 f2e0Var) {
        this.f129931a = f2e0Var;
        this.f129932b = c22421c;
    }

    @Override // p153l.y20
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(gcg0<? super T> gcg0Var) {
        f2e0.AbstractC16877a abstractC16877aCreateWorker = this.f129931a.createWorker();
        gcg0Var.m129866b(abstractC16877aCreateWorker);
        abstractC16877aCreateWorker.mo102836b(new C18341a(gcg0Var, abstractC16877aCreateWorker));
    }
}
