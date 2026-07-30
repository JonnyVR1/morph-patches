package p149l;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public class typ extends bxm {

    /* JADX INFO: renamed from: e */
    public AtomicBoolean f172620e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b */
    public rg3 f172617b = new rg3();

    /* JADX INFO: renamed from: c */
    public sg3 f172618c = new sg3();

    /* JADX INFO: renamed from: d */
    public pgc0 f172619d = new pgc0(2);

    @Override // p149l.bxm
    /* JADX INFO: renamed from: a */
    public void mo75480a(vq4 vq4Var) throws Exception {
        try {
            s460 s460VarM179155a = this.f172617b.m179155a(vq4Var.mo159106b());
            if (s460VarM179155a != null) {
                vq4Var.mo159105a(s460VarM179155a);
            }
        } catch (Exception e) {
            if (this.f172620e.compareAndSet(true, true)) {
                throw e;
            }
        }
        if (this.f172620e.get()) {
            m191067f(vq4Var.mo159106b());
            m191068g(vq4Var);
        }
    }

    @Override // p149l.bxm
    /* JADX INFO: renamed from: b */
    public void mo75481b(vq4 vq4Var) throws Exception {
        try {
            this.f172618c.m184032a(vq4Var.mo159106b(), vq4Var.mo159107c());
        } catch (Exception e) {
            if (!m104316c()) {
                throw e;
            }
            vq4Var.mo159106b().m149499m().mo216486b(e);
        }
        if (this.f172620e.compareAndSet(false, true)) {
            m191067f(vq4Var.mo159106b());
        }
    }

    @Override // p149l.bxm
    /* JADX INFO: renamed from: d */
    public void mo75483d() {
        super.mo75483d();
        this.f172620e.set(false);
    }

    /* JADX INFO: renamed from: f */
    public final void m191067f(lec0 lec0Var) {
        if (m104316c()) {
            lec0Var.m149499m().mo216485a("already release return the receive");
        } else {
            this.f172619d.m206580b().mo75489a(lec0Var);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m191068g(vq4 vq4Var) {
        if (vq4Var.call() instanceof bjc0) {
            bjc0 bjc0Var = (bjc0) vq4Var.call();
            if (m104316c()) {
                bjc0Var.recycle();
            } else {
                this.f172619d.m206581c(bjc0Var);
            }
        }
    }
}
