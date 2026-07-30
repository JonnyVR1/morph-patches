package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4732c;

/* JADX INFO: loaded from: classes9.dex */
public class qqb {

    /* JADX INFO: renamed from: a */
    public Runnable f155875a = new RunnableC19558a();

    /* JADX INFO: renamed from: l.qqb$a */
    public class RunnableC19558a implements Runnable {
        public RunnableC19558a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C4732c c4732c = CoreModule.f17545c;
            if (c4732c != null) {
                c4732c.f19639e0.m169397H9();
                e51.m114743H(CoreModule.f17544b, qqb.this.f155875a, CoreModule.f17546d.m200495A());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Boolean m175881a(j760 j760Var) {
        return (Boolean) j760Var.f116564a;
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m175886f(c4g0 c4g0Var) {
        e51.m114745J(this.f155875a);
        c4g0Var.unsubscribe();
    }

    /* JADX INFO: renamed from: g */
    public final void m175887g(boolean z) {
        Runnable runnable = this.f155875a;
        if (!z) {
            e51.m114745J(runnable);
        } else {
            e51.m114745J(runnable);
            e51.m114742G(this.f155875a);
        }
    }

    /* JADX INFO: renamed from: h */
    public c4g0 m175888h() {
        final c4g0 c4g0VarSubscribe = mkd0.m154984r(CoreModule.m29931H().signedIn(), Act.foreground(), new lqb()).filter(new w9j() { // from class: l.mqb
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return qqb.m175881a((j760) obj);
            }
        }).map(new w9j() { // from class: l.nqb
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((j760) obj).f116565b != 0);
            }
        }).distinctUntilChanged().subscribe(new e30() { // from class: l.oqb
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f145117a.m175887g(((Boolean) obj).booleanValue());
            }
        });
        return h4g0.m129240a(new d30() { // from class: l.pqb
            @Override // p149l.d30
            public final void call() {
                this.f150780a.m175886f(c4g0VarSubscribe);
            }
        });
    }
}
