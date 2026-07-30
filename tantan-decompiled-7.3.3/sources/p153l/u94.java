package p153l;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class u94 extends qgk implements bql {

    /* JADX INFO: renamed from: d */
    private erf0 f178093d;

    /* JADX INFO: renamed from: e */
    private erf0 f178094e;

    /* JADX INFO: renamed from: f */
    hql f178095f;

    /* JADX INFO: renamed from: g */
    jt2 f178096g;

    /* JADX INFO: renamed from: i */
    private float f178097i = 1.0f;

    public u94(uow uowVar, q210.InterfaceC19500a interfaceC19500a, jt2 jt2Var) {
        if (uowVar.f175483g0) {
            this.f178095f = new wc4(uowVar, interfaceC19500a);
        } else {
            this.f178095f = new ib4(uowVar, interfaceC19500a);
        }
        this.f178096g = jt2Var;
        if (jt2Var == null) {
            this.f178096g = new qv40();
        }
        m176492R1(this.f178096g);
        ((gfj) this.f178095f).addTarget(this);
        this.f178096g.addTarget(this);
        m176493S1(this.f178096g);
        this.f178093d = new erf0(uowVar.f175513x, uowVar.f175512w);
    }

    @Override // p153l.aql
    /* JADX INFO: renamed from: B */
    public void mo99490B(row rowVar) {
        hql hqlVar = this.f178095f;
        if (hqlVar != null) {
            hqlVar.mo99490B(rowVar);
        }
    }

    @Override // p153l.aql
    /* JADX INFO: renamed from: E */
    public void mo99491E(int i, row rowVar) {
        hql hqlVar = this.f178095f;
        if (hqlVar != null) {
            hqlVar.mo99491E(i, rowVar);
        }
    }

    @Override // p153l.aql
    /* JADX INFO: renamed from: E1 */
    public boolean mo99492E1(int i, row rowVar) {
        hql hqlVar = this.f178095f;
        if (hqlVar != null) {
            return hqlVar.mo99492E1(i, rowVar);
        }
        return false;
    }

    @Override // p153l.aql
    /* JADX INFO: renamed from: I */
    public void mo99493I(boolean z) {
        hql hqlVar = this.f178095f;
        if (hqlVar != null) {
            hqlVar.mo99493I(z);
        }
    }

    @Override // p153l.eql
    /* JADX INFO: renamed from: I0 */
    public long mo121925I0() {
        hql hqlVar = this.f178095f;
        if (hqlVar != null) {
            return hqlVar.mo121925I0();
        }
        return 0L;
    }

    @Override // p153l.aql
    /* JADX INFO: renamed from: J1 */
    public void mo99494J1(v94 v94Var) {
        hql hqlVar = this.f178095f;
        if (hqlVar != null) {
            hqlVar.mo99494J1(v94Var);
        }
    }

    @Override // p153l.aql, p153l.z5m
    /* JADX INFO: renamed from: K */
    public void mo99495K(g510 g510Var) {
        hql hqlVar = this.f178095f;
        if (hqlVar != null) {
            hqlVar.mo99495K(g510Var);
        }
    }

    @Override // p153l.bql
    /* JADX INFO: renamed from: M */
    public void mo105947M() {
        hql hqlVar = this.f178095f;
        if (hqlVar != null) {
            hqlVar.mo136683M();
        }
    }

    @Override // p153l.aql
    /* JADX INFO: renamed from: N */
    public void mo99496N() {
        try {
            hql hqlVar = this.f178095f;
            if (hqlVar != null) {
                hqlVar.mo99496N();
            }
        } catch (Error | Exception unused) {
        }
    }

    @Override // p153l.bql
    /* JADX INFO: renamed from: P */
    public void mo105948P(float f) {
        if (this.f178097i == f) {
            return;
        }
        this.f178097i = f;
        erf0 erf0Var = this.f178093d;
        if (f > 0.0f) {
            this.f178094e = new erf0(Math.round(erf0Var.m122180b() * f), Math.round(this.f178093d.m122179a() * f));
        } else {
            this.f178094e = new erf0(erf0Var.m122180b(), this.f178093d.m122180b());
        }
    }

    @Override // p153l.aql
    /* JADX INFO: renamed from: Q */
    public void mo99497Q(ib4.InterfaceC17689l interfaceC17689l) {
        hql hqlVar = this.f178095f;
        if (hqlVar != null) {
            hqlVar.mo99497Q(interfaceC17689l);
        }
    }

    @Override // p153l.aql
    /* JADX INFO: renamed from: R */
    public void mo99498R(nx3 nx3Var) {
        hql hqlVar = this.f178095f;
        if (hqlVar != null) {
            hqlVar.mo99498R(nx3Var);
        }
    }

    @Override // p153l.aql
    /* JADX INFO: renamed from: S */
    public void mo99499S(boolean z) {
        hql hqlVar = this.f178095f;
        if (hqlVar != null) {
            hqlVar.mo99499S(z);
        }
    }

    @Override // p153l.aql
    /* JADX INFO: renamed from: T */
    public void mo99500T(boolean z) {
        hql hqlVar = this.f178095f;
        if (hqlVar != null) {
            hqlVar.mo99500T(z);
        }
    }

    @Override // p153l.aql
    /* JADX INFO: renamed from: Z */
    public void mo99501Z(int i) {
        hql hqlVar = this.f178095f;
        if (hqlVar != null) {
            hqlVar.mo99501Z(i);
        }
    }

    /* JADX INFO: renamed from: Z0 */
    public void m195083Z0(int i, int i2) {
        this.f178093d = new erf0(i, i2);
        float f = this.f178097i;
        if (f > 0.0f) {
            mo105948P(f);
        }
    }

    @Override // p153l.aql
    /* JADX INFO: renamed from: a */
    public void mo99502a() {
        hql hqlVar = this.f178095f;
        if (hqlVar != null) {
            hqlVar.mo99502a();
        }
        jt2 jt2Var = this.f178096g;
        if (jt2Var != null) {
            jt2Var.removeTarget(this);
        }
    }

    @Override // p153l.aql
    /* JADX INFO: renamed from: a1 */
    public v94 mo99503a1() {
        hql hqlVar = this.f178095f;
        if (hqlVar != null) {
            return hqlVar.mo99503a1();
        }
        return null;
    }

    @Override // p153l.aql
    /* JADX INFO: renamed from: b */
    public void mo99504b(int i) {
        hql hqlVar = this.f178095f;
        if (hqlVar != null) {
            hqlVar.mo99504b(i);
        }
    }

    @Override // p153l.aql
    /* JADX INFO: renamed from: c */
    public int mo99505c() {
        hql hqlVar = this.f178095f;
        if (hqlVar != null) {
            return hqlVar.mo99505c();
        }
        return 0;
    }

    @Override // p153l.aql
    /* JADX INFO: renamed from: d */
    public int mo99506d() {
        hql hqlVar = this.f178095f;
        if (hqlVar != null) {
            return hqlVar.mo99506d();
        }
        return 0;
    }

    @Override // p153l.qgk, p153l.gfj, p153l.wej
    public synchronized void destroy() {
        try {
            Object obj = this.f178095f;
            if (obj != null && (obj instanceof wej)) {
                ((gfj) obj).destroy();
            }
            super.destroy();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p153l.aql
    /* JADX INFO: renamed from: e */
    public boolean mo99507e() {
        hql hqlVar = this.f178095f;
        if (hqlVar != null) {
            return hqlVar.mo99507e();
        }
        return false;
    }

    @Override // p153l.aql
    /* JADX INFO: renamed from: g */
    public int mo99508g() {
        hql hqlVar = this.f178095f;
        if (hqlVar != null) {
            return hqlVar.mo99508g();
        }
        return 0;
    }

    @Override // p153l.aql
    /* JADX INFO: renamed from: h */
    public int mo99509h() {
        hql hqlVar = this.f178095f;
        if (hqlVar != null) {
            return hqlVar.mo99509h();
        }
        return 0;
    }

    @Override // p153l.bql
    /* JADX INFO: renamed from: j */
    public void mo105949j(jt2 jt2Var) {
        synchronized (getLockObject()) {
            m176494T1(this.f178096g);
            this.f178096g.removeTarget(this);
            m176495U1(this.f178096g);
            this.f178096g = jt2Var;
            m176492R1(jt2Var);
            jt2Var.addTarget(this);
            m176493S1(jt2Var);
        }
    }

    @Override // p153l.aql
    /* JADX INFO: renamed from: k */
    public void mo99510k(boolean z) {
        hql hqlVar = this.f178095f;
        if (hqlVar != null) {
            hqlVar.mo99510k(z);
        }
    }

    @Override // p153l.aql
    /* JADX INFO: renamed from: l */
    public void mo99511l(List<String> list) {
        hql hqlVar = this.f178095f;
        if (hqlVar != null) {
            hqlVar.mo99511l(list);
        }
    }

    @Override // p153l.aql
    /* JADX INFO: renamed from: m */
    public void mo99512m(int i) {
        hql hqlVar = this.f178095f;
        if (hqlVar != null) {
            hqlVar.mo99512m(i);
        }
    }

    @Override // p153l.wej
    public void onDrawFrame() {
        erf0 erf0Var = this.f178094e;
        if (erf0Var != null && erf0Var.m122180b() != 0 && this.f178094e.m122179a() != 0) {
            setRenderSize(this.f178094e.m122180b(), this.f178094e.m122179a());
        }
        ((wej) this.f178095f).onDrawFrame();
    }

    @Override // p153l.aql
    /* JADX INFO: renamed from: q */
    public void mo99513q(float f) {
        hql hqlVar = this.f178095f;
        if (hqlVar != null) {
            hqlVar.mo99513q(f);
        }
    }

    @Override // p153l.aql
    /* JADX INFO: renamed from: r */
    public void mo99514r() {
        hql hqlVar = this.f178095f;
        if (hqlVar != null) {
            hqlVar.mo99514r();
        }
    }

    @Override // p153l.qgk, p153l.gfj, p153l.wej
    public void releaseFrameBuffer() {
        super.releaseFrameBuffer();
        Object obj = this.f178095f;
        if (obj == null || !(obj instanceof wej)) {
            return;
        }
        ((gfj) obj).releaseFrameBuffer();
    }

    @Override // p153l.aql
    /* JADX INFO: renamed from: s */
    public void mo99515s(int i) {
        hql hqlVar = this.f178095f;
        if (hqlVar != null) {
            hqlVar.mo99515s(i);
        }
    }

    @Override // p153l.itl
    /* JADX INFO: renamed from: s1 */
    public void mo139270s1(ylg ylgVar, yuf yufVar) {
        hql hqlVar = this.f178095f;
        if (hqlVar != null) {
            hqlVar.mo139270s1(ylgVar, yufVar);
        }
    }

    @Override // p153l.aql
    public void setExposureCompensation(int i) {
        hql hqlVar = this.f178095f;
        if (hqlVar != null) {
            hqlVar.setExposureCompensation(i);
        }
    }

    @Override // p153l.aql
    public void setWarpType(int i) {
        hql hqlVar = this.f178095f;
        if (hqlVar != null) {
            hqlVar.setWarpType(i);
        }
    }

    @Override // p153l.aql
    /* JADX INFO: renamed from: u */
    public void mo99516u(int i) {
        hql hqlVar = this.f178095f;
        if (hqlVar != null) {
            hqlVar.mo99516u(i);
        }
    }

    @Override // p153l.aql
    /* JADX INFO: renamed from: v */
    public void mo99517v(float f) {
        hql hqlVar = this.f178095f;
        if (hqlVar != null) {
            hqlVar.mo99517v(f);
        }
    }

    @Override // p153l.eql
    /* JADX INFO: renamed from: v1 */
    public long mo121926v1() {
        hql hqlVar = this.f178095f;
        if (hqlVar != null) {
            return hqlVar.mo121926v1();
        }
        return 0L;
    }

    @Override // p153l.aql
    /* JADX INFO: renamed from: w */
    public void mo99518w(boolean z) {
        hql hqlVar = this.f178095f;
        if (hqlVar != null) {
            hqlVar.mo99518w(z);
        }
    }

    /* JADX INFO: renamed from: x */
    public erf0 m195084x(int i, int i2) {
        hql hqlVar = this.f178095f;
        if (hqlVar != null) {
            return hqlVar.mo136684x(i, i2);
        }
        return null;
    }

    @Override // p153l.aql
    /* JADX INFO: renamed from: z */
    public void mo99519z() {
        try {
            hql hqlVar = this.f178095f;
            if (hqlVar != null) {
                hqlVar.mo99519z();
            }
        } catch (Error | Exception unused) {
        }
    }

    @Override // p153l.z5m
    public gfj getInput() {
        return this;
    }
}
