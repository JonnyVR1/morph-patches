package p153l;

/* JADX INFO: loaded from: classes6.dex */
public abstract class mzx0 extends yyx0 {

    /* JADX INFO: renamed from: b */
    public boolean f139574b;

    public mzx0(atx0 atx0Var) {
        super(atx0Var);
        this.f202159a.m100296i();
    }

    /* JADX INFO: renamed from: j */
    public final void m160930j() {
        if (m160933m()) {
            return;
        }
        wtq0.m207906a("Not initialized");
    }

    /* JADX INFO: renamed from: k */
    public final void m160931k() {
        if (this.f139574b) {
            wtq0.m207906a("Can't initialize twice");
        } else {
            if (mo98519n()) {
                return;
            }
            this.f202159a.m100292M();
            this.f139574b = true;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m160932l() {
        if (this.f139574b) {
            wtq0.m207906a("Can't initialize twice");
            return;
        }
        mo98518i();
        this.f202159a.m100292M();
        this.f139574b = true;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m160933m() {
        return this.f139574b;
    }

    /* JADX INFO: renamed from: n */
    public abstract boolean mo98519n();

    /* JADX INFO: renamed from: i */
    public void mo98518i() {
    }
}
