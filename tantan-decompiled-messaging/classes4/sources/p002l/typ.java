package p002l;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class typ extends bxm {

    /* JADX INFO: renamed from: e */
    public AtomicBoolean f20430e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b */
    public rg3 f20427b = new rg3();

    /* JADX INFO: renamed from: c */
    public sg3 f20428c = new sg3();

    /* JADX INFO: renamed from: d */
    public pgc0 f20429d = new pgc0(2);

    @Override // p002l.bxm
    /* JADX INFO: renamed from: a */
    public void mo9115a(vq4 vq4Var) throws Exception {
        try {
            s460 s460VarM21919a = this.f20427b.m21919a(vq4Var.mo18694b());
            if (s460VarM21919a != null) {
                vq4Var.mo18693a(s460VarM21919a);
            }
        } catch (Exception e) {
            if (this.f20430e.compareAndSet(true, true)) {
                throw e;
            }
        }
        if (this.f20430e.get()) {
            m23235f(vq4Var.mo18694b());
            m23236g(vq4Var);
        }
    }

    @Override // p002l.bxm
    /* JADX INFO: renamed from: b */
    public void mo9116b(vq4 vq4Var) throws Exception {
        try {
            this.f20428c.m22451a(vq4Var.mo18694b(), vq4Var.mo18695c());
        } catch (Exception e) {
            if (!m10635c()) {
                throw e;
            }
            vq4Var.mo18694b().m17157m().mo26979b(e);
        }
        if (this.f20430e.compareAndSet(false, true)) {
            m23235f(vq4Var.mo18694b());
        }
    }

    @Override // p002l.bxm
    /* JADX INFO: renamed from: d */
    public void mo9118d() {
        super.mo9118d();
        this.f20430e.set(false);
    }

    /* JADX INFO: renamed from: f */
    public final void m23235f(lec0 lec0Var) {
        if (m10635c()) {
            lec0Var.m17157m().mo26978a("already release return the receive");
        } else {
            this.f20429d.m25575b().mo9124a(lec0Var);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m23236g(vq4 vq4Var) {
        if (vq4Var.call() instanceof bjc0) {
            bjc0 bjc0Var = (bjc0) vq4Var.call();
            if (m10635c()) {
                bjc0Var.recycle();
            } else {
                this.f20429d.m25576c(bjc0Var);
            }
        }
    }
}
