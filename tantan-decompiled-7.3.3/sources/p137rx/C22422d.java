package p137rx;

import p137rx.internal.producers.SingleDelayedProducer;
import p153l.gcg0;
import p153l.hrd0;
import p153l.oqf0;
import p153l.y20;

/* JADX INFO: renamed from: rx.d */
/* JADX INFO: loaded from: classes3.dex */
public class C22422d<T> {

    /* JADX INFO: renamed from: a */
    public final C22421c.a<T> f208036a;

    /* JADX INFO: renamed from: rx.d$a */
    public class a implements C22421c.a<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ b f208037a;

        /* JADX INFO: renamed from: rx.d$a$a, reason: collision with other inner class name */
        public class C22848a extends oqf0<T> {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ SingleDelayedProducer f208039b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ gcg0 f208040c;

            public C22848a(SingleDelayedProducer singleDelayedProducer, gcg0 gcg0Var) {
                this.f208039b = singleDelayedProducer;
                this.f208040c = gcg0Var;
            }

            @Override // p153l.oqf0
            /* JADX INFO: renamed from: b */
            public void mo168811b(Throwable th) {
                this.f208040c.onError(th);
            }

            @Override // p153l.oqf0
            /* JADX INFO: renamed from: c */
            public void mo168812c(T t) {
                this.f208039b.setValue(t);
            }
        }

        public a(b bVar) {
            this.f208037a = bVar;
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(gcg0<? super T> gcg0Var) {
            SingleDelayedProducer singleDelayedProducer = new SingleDelayedProducer(gcg0Var);
            gcg0Var.mo95773f(singleDelayedProducer);
            C22848a c22848a = new C22848a(singleDelayedProducer, gcg0Var);
            gcg0Var.m129866b(c22848a);
            this.f208037a.call(c22848a);
        }
    }

    /* JADX INFO: renamed from: rx.d$b */
    public interface b<T> extends y20<oqf0<? super T>> {
    }

    public C22422d(b<T> bVar) {
        this.f208036a = new a(hrd0.m136791i(bVar));
    }
}
