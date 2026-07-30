package p149l;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class v84 extends aek implements qnl {

    /* JADX INFO: renamed from: d */
    private vif0 f180446d;

    /* JADX INFO: renamed from: e */
    private vif0 f180447e;

    /* JADX INFO: renamed from: f */
    wnl f180448f;

    /* JADX INFO: renamed from: g */
    ts2 f180449g;

    /* JADX INFO: renamed from: i */
    private float f180450i = 1.0f;

    public v84(vlw vlwVar, hu00.InterfaceC17392a interfaceC17392a, ts2 ts2Var) {
        if (vlwVar.f177141g0) {
            this.f180448f = new xb4(vlwVar, interfaceC17392a);
        } else {
            this.f180448f = new ja4(vlwVar, interfaceC17392a);
        }
        this.f180449g = ts2Var;
        if (ts2Var == null) {
            this.f180449g = new cn40();
        }
        m96110R1(this.f180449g);
        ((mcj) this.f180448f).addTarget(this);
        this.f180449g.addTarget(this);
        m96111S1(this.f180449g);
        this.f180446d = new vif0(vlwVar.f177171x, vlwVar.f177170w);
    }

    @Override // p149l.pnl
    /* JADX INFO: renamed from: B */
    public void mo140639B(slw slwVar) {
        wnl wnlVar = this.f180448f;
        if (wnlVar != null) {
            wnlVar.mo140639B(slwVar);
        }
    }

    @Override // p149l.pnl
    /* JADX INFO: renamed from: E */
    public void mo140640E(int i, slw slwVar) {
        wnl wnlVar = this.f180448f;
        if (wnlVar != null) {
            wnlVar.mo140640E(i, slwVar);
        }
    }

    @Override // p149l.pnl
    /* JADX INFO: renamed from: E1 */
    public boolean mo140641E1(int i, slw slwVar) {
        wnl wnlVar = this.f180448f;
        if (wnlVar != null) {
            return wnlVar.mo140641E1(i, slwVar);
        }
        return false;
    }

    @Override // p149l.pnl
    /* JADX INFO: renamed from: I */
    public void mo140643I(boolean z) {
        wnl wnlVar = this.f180448f;
        if (wnlVar != null) {
            wnlVar.mo140643I(z);
        }
    }

    @Override // p149l.tnl
    /* JADX INFO: renamed from: I0 */
    public long mo140644I0() {
        wnl wnlVar = this.f180448f;
        if (wnlVar != null) {
            return wnlVar.mo140644I0();
        }
        return 0L;
    }

    @Override // p149l.pnl
    /* JADX INFO: renamed from: J1 */
    public void mo140645J1(w84 w84Var) {
        wnl wnlVar = this.f180448f;
        if (wnlVar != null) {
            wnlVar.mo140645J1(w84Var);
        }
    }

    @Override // p149l.pnl, p149l.i3m
    /* JADX INFO: renamed from: K */
    public void mo100323K(yw00 yw00Var) {
        wnl wnlVar = this.f180448f;
        if (wnlVar != null) {
            wnlVar.mo100323K(yw00Var);
        }
    }

    @Override // p149l.qnl
    /* JADX INFO: renamed from: M */
    public void mo175683M() {
        wnl wnlVar = this.f180448f;
        if (wnlVar != null) {
            wnlVar.mo140646M();
        }
    }

    @Override // p149l.pnl
    /* JADX INFO: renamed from: N */
    public void mo140647N() {
        try {
            wnl wnlVar = this.f180448f;
            if (wnlVar != null) {
                wnlVar.mo140647N();
            }
        } catch (Error | Exception unused) {
        }
    }

    @Override // p149l.qnl
    /* JADX INFO: renamed from: P */
    public void mo175684P(float f) {
        if (this.f180450i == f) {
            return;
        }
        this.f180450i = f;
        vif0 vif0Var = this.f180446d;
        if (f > 0.0f) {
            this.f180447e = new vif0(Math.round(vif0Var.m198562b() * f), Math.round(this.f180446d.m198561a() * f));
        } else {
            this.f180447e = new vif0(vif0Var.m198562b(), this.f180446d.m198562b());
        }
    }

    @Override // p149l.pnl
    /* JADX INFO: renamed from: Q */
    public void mo140648Q(ja4.InterfaceC17734l interfaceC17734l) {
        wnl wnlVar = this.f180448f;
        if (wnlVar != null) {
            wnlVar.mo140648Q(interfaceC17734l);
        }
    }

    @Override // p149l.pnl
    /* JADX INFO: renamed from: R */
    public void mo140649R(ow3 ow3Var) {
        wnl wnlVar = this.f180448f;
        if (wnlVar != null) {
            wnlVar.mo140649R(ow3Var);
        }
    }

    @Override // p149l.pnl
    /* JADX INFO: renamed from: S */
    public void mo140650S(boolean z) {
        wnl wnlVar = this.f180448f;
        if (wnlVar != null) {
            wnlVar.mo140650S(z);
        }
    }

    @Override // p149l.pnl
    /* JADX INFO: renamed from: T */
    public void mo140651T(boolean z) {
        wnl wnlVar = this.f180448f;
        if (wnlVar != null) {
            wnlVar.mo140651T(z);
        }
    }

    @Override // p149l.pnl
    /* JADX INFO: renamed from: Z */
    public void mo140653Z(int i) {
        wnl wnlVar = this.f180448f;
        if (wnlVar != null) {
            wnlVar.mo140653Z(i);
        }
    }

    /* JADX INFO: renamed from: Z0 */
    public void m197391Z0(int i, int i2) {
        this.f180446d = new vif0(i, i2);
        float f = this.f180450i;
        if (f > 0.0f) {
            mo175684P(f);
        }
    }

    @Override // p149l.pnl
    /* JADX INFO: renamed from: a */
    public void mo140654a() {
        wnl wnlVar = this.f180448f;
        if (wnlVar != null) {
            wnlVar.mo140654a();
        }
        ts2 ts2Var = this.f180449g;
        if (ts2Var != null) {
            ts2Var.removeTarget(this);
        }
    }

    @Override // p149l.pnl
    /* JADX INFO: renamed from: a1 */
    public w84 mo140655a1() {
        wnl wnlVar = this.f180448f;
        if (wnlVar != null) {
            return wnlVar.mo140655a1();
        }
        return null;
    }

    @Override // p149l.pnl
    /* JADX INFO: renamed from: b */
    public void mo140656b(int i) {
        wnl wnlVar = this.f180448f;
        if (wnlVar != null) {
            wnlVar.mo140656b(i);
        }
    }

    @Override // p149l.pnl
    /* JADX INFO: renamed from: c */
    public int mo140657c() {
        wnl wnlVar = this.f180448f;
        if (wnlVar != null) {
            return wnlVar.mo140657c();
        }
        return 0;
    }

    @Override // p149l.pnl
    /* JADX INFO: renamed from: d */
    public int mo140658d() {
        wnl wnlVar = this.f180448f;
        if (wnlVar != null) {
            return wnlVar.mo140658d();
        }
        return 0;
    }

    @Override // p149l.aek, p149l.mcj, p149l.ccj
    public synchronized void destroy() {
        try {
            Object obj = this.f180448f;
            if (obj != null && (obj instanceof ccj)) {
                ((mcj) obj).destroy();
            }
            super.destroy();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p149l.pnl
    /* JADX INFO: renamed from: e */
    public boolean mo140659e() {
        wnl wnlVar = this.f180448f;
        if (wnlVar != null) {
            return wnlVar.mo140659e();
        }
        return false;
    }

    @Override // p149l.pnl
    /* JADX INFO: renamed from: g */
    public int mo140660g() {
        wnl wnlVar = this.f180448f;
        if (wnlVar != null) {
            return wnlVar.mo140660g();
        }
        return 0;
    }

    @Override // p149l.pnl
    /* JADX INFO: renamed from: h */
    public int mo140661h() {
        wnl wnlVar = this.f180448f;
        if (wnlVar != null) {
            return wnlVar.mo140661h();
        }
        return 0;
    }

    @Override // p149l.qnl
    /* JADX INFO: renamed from: j */
    public void mo175685j(ts2 ts2Var) {
        synchronized (getLockObject()) {
            m96112T1(this.f180449g);
            this.f180449g.removeTarget(this);
            m96113U1(this.f180449g);
            this.f180449g = ts2Var;
            m96110R1(ts2Var);
            ts2Var.addTarget(this);
            m96111S1(ts2Var);
        }
    }

    @Override // p149l.pnl
    /* JADX INFO: renamed from: k */
    public void mo140662k(boolean z) {
        wnl wnlVar = this.f180448f;
        if (wnlVar != null) {
            wnlVar.mo140662k(z);
        }
    }

    @Override // p149l.pnl
    /* JADX INFO: renamed from: l */
    public void mo140663l(List<String> list) {
        wnl wnlVar = this.f180448f;
        if (wnlVar != null) {
            wnlVar.mo140663l(list);
        }
    }

    @Override // p149l.pnl
    /* JADX INFO: renamed from: m */
    public void mo140664m(int i) {
        wnl wnlVar = this.f180448f;
        if (wnlVar != null) {
            wnlVar.mo140664m(i);
        }
    }

    @Override // p149l.ccj
    public void onDrawFrame() {
        vif0 vif0Var = this.f180447e;
        if (vif0Var != null && vif0Var.m198562b() != 0 && this.f180447e.m198561a() != 0) {
            setRenderSize(this.f180447e.m198562b(), this.f180447e.m198561a());
        }
        ((ccj) this.f180448f).onDrawFrame();
    }

    @Override // p149l.pnl
    /* JADX INFO: renamed from: q */
    public void mo140666q(float f) {
        wnl wnlVar = this.f180448f;
        if (wnlVar != null) {
            wnlVar.mo140666q(f);
        }
    }

    @Override // p149l.pnl
    /* JADX INFO: renamed from: r */
    public void mo140668r() {
        wnl wnlVar = this.f180448f;
        if (wnlVar != null) {
            wnlVar.mo140668r();
        }
    }

    @Override // p149l.aek, p149l.mcj, p149l.ccj
    public void releaseFrameBuffer() {
        super.releaseFrameBuffer();
        Object obj = this.f180448f;
        if (obj == null || !(obj instanceof ccj)) {
            return;
        }
        ((mcj) obj).releaseFrameBuffer();
    }

    @Override // p149l.pnl
    /* JADX INFO: renamed from: s */
    public void mo140669s(int i) {
        wnl wnlVar = this.f180448f;
        if (wnlVar != null) {
            wnlVar.mo140669s(i);
        }
    }

    @Override // p149l.vql
    /* JADX INFO: renamed from: s1 */
    public void mo140670s1(jkg jkgVar, ktf ktfVar) {
        wnl wnlVar = this.f180448f;
        if (wnlVar != null) {
            wnlVar.mo140670s1(jkgVar, ktfVar);
        }
    }

    @Override // p149l.pnl
    public void setExposureCompensation(int i) {
        wnl wnlVar = this.f180448f;
        if (wnlVar != null) {
            wnlVar.setExposureCompensation(i);
        }
    }

    @Override // p149l.pnl
    public void setWarpType(int i) {
        wnl wnlVar = this.f180448f;
        if (wnlVar != null) {
            wnlVar.setWarpType(i);
        }
    }

    @Override // p149l.pnl
    /* JADX INFO: renamed from: u */
    public void mo140671u(int i) {
        wnl wnlVar = this.f180448f;
        if (wnlVar != null) {
            wnlVar.mo140671u(i);
        }
    }

    @Override // p149l.pnl
    /* JADX INFO: renamed from: v */
    public void mo140672v(float f) {
        wnl wnlVar = this.f180448f;
        if (wnlVar != null) {
            wnlVar.mo140672v(f);
        }
    }

    @Override // p149l.tnl
    /* JADX INFO: renamed from: v1 */
    public long mo140673v1() {
        wnl wnlVar = this.f180448f;
        if (wnlVar != null) {
            return wnlVar.mo140673v1();
        }
        return 0L;
    }

    @Override // p149l.pnl
    /* JADX INFO: renamed from: w */
    public void mo140674w(boolean z) {
        wnl wnlVar = this.f180448f;
        if (wnlVar != null) {
            wnlVar.mo140674w(z);
        }
    }

    /* JADX INFO: renamed from: x */
    public vif0 m197392x(int i, int i2) {
        wnl wnlVar = this.f180448f;
        if (wnlVar != null) {
            return wnlVar.mo140675x(i, i2);
        }
        return null;
    }

    @Override // p149l.pnl
    /* JADX INFO: renamed from: z */
    public void mo140676z() {
        try {
            wnl wnlVar = this.f180448f;
            if (wnlVar != null) {
                wnlVar.mo140676z();
            }
        } catch (Error | Exception unused) {
        }
    }

    @Override // p149l.i3m
    public mcj getInput() {
        return this;
    }
}
