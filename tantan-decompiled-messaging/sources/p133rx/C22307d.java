package p133rx;

import p133rx.internal.producers.SingleDelayedProducer;
import p149l.e30;
import p149l.ejd0;
import p149l.fif0;
import p149l.z3g0;

/* JADX INFO: renamed from: rx.d */
/* JADX INFO: loaded from: classes3.dex */
public class C22307d<T> {

    /* JADX INFO: renamed from: a */
    public final C22306c.a<T> f207114a;

    /* JADX INFO: renamed from: rx.d$a */
    public class a implements C22306c.a<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ b f207115a;

        /* JADX INFO: renamed from: rx.d$a$a, reason: collision with other inner class name */
        public class C22732a extends fif0<T> {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ SingleDelayedProducer f207117b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ z3g0 f207118c;

            public C22732a(SingleDelayedProducer singleDelayedProducer, z3g0 z3g0Var) {
                this.f207117b = singleDelayedProducer;
                this.f207118c = z3g0Var;
            }

            @Override // p149l.fif0
            /* JADX INFO: renamed from: b */
            public void mo121510b(Throwable th) {
                this.f207118c.onError(th);
            }

            @Override // p149l.fif0
            /* JADX INFO: renamed from: c */
            public void mo121511c(T t) {
                this.f207117b.setValue(t);
            }
        }

        public a(b bVar) {
            this.f207115a = bVar;
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(z3g0<? super T> z3g0Var) {
            SingleDelayedProducer singleDelayedProducer = new SingleDelayedProducer(z3g0Var);
            z3g0Var.mo106696f(singleDelayedProducer);
            C22732a c22732a = new C22732a(singleDelayedProducer, z3g0Var);
            z3g0Var.m217046b(c22732a);
            this.f207115a.call(c22732a);
        }
    }

    /* JADX INFO: renamed from: rx.d$b */
    public interface b<T> extends e30<fif0<? super T>> {
    }

    public C22307d(b<T> bVar) {
        this.f207114a = new a(ejd0.m116792i(bVar));
    }
}
