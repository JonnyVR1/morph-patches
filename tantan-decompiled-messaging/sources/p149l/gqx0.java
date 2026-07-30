package p149l;

/* JADX INFO: loaded from: classes6.dex */
public abstract class gqx0 extends spx0 {

    /* JADX INFO: renamed from: b */
    public boolean f103999b;

    public gqx0(ujx0 ujx0Var) {
        super(ujx0Var);
        this.f165891a.m194116i();
    }

    /* JADX INFO: renamed from: j */
    public final void m127632j() {
        if (m127635m()) {
            return;
        }
        qkq0.m175383a("Not initialized");
    }

    /* JADX INFO: renamed from: k */
    public final void m127633k() {
        if (this.f103999b) {
            qkq0.m175383a("Can't initialize twice");
        } else {
            if (mo101492n()) {
                return;
            }
            this.f165891a.m194112M();
            this.f103999b = true;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m127634l() {
        if (this.f103999b) {
            qkq0.m175383a("Can't initialize twice");
            return;
        }
        mo101487i();
        this.f165891a.m194112M();
        this.f103999b = true;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m127635m() {
        return this.f103999b;
    }

    /* JADX INFO: renamed from: n */
    public abstract boolean mo101492n();

    /* JADX INFO: renamed from: i */
    public void mo101487i() {
    }
}
