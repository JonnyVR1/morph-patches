package p149l;

import java.util.concurrent.TimeUnit;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes3.dex */
public final class kg50 implements C22306c.a<Long> {

    /* JADX INFO: renamed from: a */
    public final long f123002a;

    /* JADX INFO: renamed from: b */
    public final TimeUnit f123003b;

    /* JADX INFO: renamed from: c */
    public final bud0 f123004c;

    /* JADX INFO: renamed from: l.kg50$a */
    public class C18007a implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ z3g0 f123005a;

        public C18007a(z3g0 z3g0Var) {
            this.f123005a = z3g0Var;
        }

        @Override // p149l.d30
        public void call() {
            try {
                this.f123005a.onNext(0L);
                this.f123005a.onCompleted();
            } catch (Throwable th) {
                f5f.m119492f(th, this.f123005a);
            }
        }
    }

    public kg50(long j, TimeUnit timeUnit, bud0 bud0Var) {
        this.f123002a = j;
        this.f123003b = timeUnit;
        this.f123004c = bud0Var;
    }

    @Override // p149l.e30
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(z3g0<? super Long> z3g0Var) {
        bud0.AbstractC15976a abstractC15976aCreateWorker = this.f123004c.createWorker();
        z3g0Var.m217046b(abstractC15976aCreateWorker);
        abstractC15976aCreateWorker.mo99202c(new C18007a(z3g0Var), this.f123002a, this.f123003b);
    }
}
