package p153l;

import p137rx.C22421c;
import p137rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes3.dex */
public class z460<T, U, V> extends y460<T> {

    /* JADX INFO: renamed from: l.z460$a */
    public class C21760a implements y460.InterfaceC21510a<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ pcj f202904a;

        /* JADX INFO: renamed from: l.z460$a$a */
        public class a extends gcg0<U> {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ y460.C21512c f202905e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ Long f202906f;

            public a(y460.C21512c c21512c, Long l2) {
                this.f202905e = c21512c;
                this.f202906f = l2;
            }

            @Override // p153l.bb50
            public void onCompleted() {
                this.f202905e.m214197g(this.f202906f.longValue());
            }

            @Override // p153l.bb50
            public void onError(Throwable th) {
                this.f202905e.onError(th);
            }

            @Override // p153l.bb50
            public void onNext(U u) {
                this.f202905e.m214197g(this.f202906f.longValue());
            }
        }

        public C21760a(pcj pcjVar) {
            this.f202904a = pcjVar;
        }

        @Override // p153l.scj
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public kcg0 mo95332a(y460.C21512c<T> c21512c, Long l2, f2e0.AbstractC16877a abstractC16877a) {
            pcj pcjVar = this.f202904a;
            if (pcjVar == null) {
                return pcg0.m171651d();
            }
            try {
                return ((C22421c) pcjVar.call()).unsafeSubscribe(new a(c21512c, l2));
            } catch (Throwable th) {
                j6f.m143664f(th, c21512c);
                return pcg0.m171651d();
            }
        }
    }

    /* JADX INFO: renamed from: l.z460$b */
    public class C21761b implements y460.InterfaceC21511b<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qcj f202908a;

        /* JADX INFO: renamed from: l.z460$b$a */
        public class a extends gcg0<V> {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ y460.C21512c f202909e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ Long f202910f;

            public a(y460.C21512c c21512c, Long l2) {
                this.f202909e = c21512c;
                this.f202910f = l2;
            }

            @Override // p153l.bb50
            public void onCompleted() {
                this.f202909e.m214197g(this.f202910f.longValue());
            }

            @Override // p153l.bb50
            public void onError(Throwable th) {
                this.f202909e.onError(th);
            }

            @Override // p153l.bb50
            public void onNext(V v2) {
                this.f202909e.m214197g(this.f202910f.longValue());
            }
        }

        public C21761b(qcj qcjVar) {
            this.f202908a = qcjVar;
        }

        @Override // p153l.tcj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public kcg0 mo112959b(y460.C21512c<T> c21512c, Long l2, T t, f2e0.AbstractC16877a abstractC16877a) {
            try {
                return ((C22421c) this.f202908a.call(t)).unsafeSubscribe(new a(c21512c, l2));
            } catch (Throwable th) {
                j6f.m143664f(th, c21512c);
                return pcg0.m171651d();
            }
        }
    }

    public z460(pcj<? extends C22421c<U>> pcjVar, qcj<? super T, ? extends C22421c<V>> qcjVar, C22421c<? extends T> c22421c) {
        super(new C21760a(pcjVar), new C21761b(qcjVar), c22421c, Schedulers.immediate());
    }

    @Override // p153l.y460
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ gcg0 call(gcg0 gcg0Var) {
        return super.call(gcg0Var);
    }
}
