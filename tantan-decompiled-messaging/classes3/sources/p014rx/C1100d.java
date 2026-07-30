package p014rx;

import p003l.e30;
import p003l.ejd0;
import p003l.fif0;
import p003l.z3g0;
import p014rx.internal.producers.SingleDelayedProducer;

/* JADX INFO: renamed from: rx.d */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class C1100d<T> {

    /* JADX INFO: renamed from: a */
    public final C1099c.a<T> f10739a;

    /* JADX INFO: renamed from: rx.d$a */
    public class a implements C1099c.a<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ b f10740a;

        /* JADX INFO: renamed from: rx.d$a$a, reason: collision with other inner class name */
        public class C1448a extends fif0<T> {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ SingleDelayedProducer f10742b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ z3g0 f10743c;

            public C1448a(SingleDelayedProducer singleDelayedProducer, z3g0 z3g0Var) {
                this.f10742b = singleDelayedProducer;
                this.f10743c = z3g0Var;
            }

            @Override // p003l.fif0
            /* JADX INFO: renamed from: b */
            public void mo4376b(Throwable th) {
                this.f10743c.onError(th);
            }

            @Override // p003l.fif0
            /* JADX INFO: renamed from: c */
            public void mo4377c(T t) {
                this.f10742b.setValue(t);
            }
        }

        public a(b bVar) {
            this.f10740a = bVar;
        }

        @Override // p003l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(z3g0<? super T> z3g0Var) {
            SingleDelayedProducer singleDelayedProducer = new SingleDelayedProducer(z3g0Var);
            z3g0Var.mo3257f(singleDelayedProducer);
            C1448a c1448a = new C1448a(singleDelayedProducer, z3g0Var);
            z3g0Var.m9240b(c1448a);
            this.f10740a.call(c1448a);
        }
    }

    /* JADX INFO: renamed from: rx.d$b */
    public interface b<T> extends e30<fif0<? super T>> {
    }

    public C1100d(b<T> bVar) {
        this.f10739a = new a(ejd0.m3863i(bVar));
    }
}
