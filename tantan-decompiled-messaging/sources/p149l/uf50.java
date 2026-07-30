package p149l;

import java.util.concurrent.TimeUnit;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes3.dex */
public final class uf50<T> implements C22306c.a<T> {

    /* JADX INFO: renamed from: a */
    public final C22306c<? extends T> f176228a;

    /* JADX INFO: renamed from: b */
    public final long f176229b;

    /* JADX INFO: renamed from: c */
    public final TimeUnit f176230c;

    /* JADX INFO: renamed from: d */
    public final bud0 f176231d;

    /* JADX INFO: renamed from: l.uf50$a */
    public class C20418a implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ z3g0 f176232a;

        public C20418a(z3g0 z3g0Var) {
            this.f176232a = z3g0Var;
        }

        @Override // p149l.d30
        public void call() {
            if (this.f176232a.isUnsubscribed()) {
                return;
            }
            uf50.this.f176228a.unsafeSubscribe(a4g0.m94919c(this.f176232a));
        }
    }

    public uf50(C22306c<? extends T> c22306c, long j, TimeUnit timeUnit, bud0 bud0Var) {
        this.f176228a = c22306c;
        this.f176229b = j;
        this.f176230c = timeUnit;
        this.f176231d = bud0Var;
    }

    @Override // p149l.e30
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(z3g0<? super T> z3g0Var) {
        bud0.AbstractC15976a abstractC15976aCreateWorker = this.f176231d.createWorker();
        z3g0Var.m217046b(abstractC15976aCreateWorker);
        abstractC15976aCreateWorker.mo99202c(new C20418a(z3g0Var), this.f176229b, this.f176230c);
    }
}
