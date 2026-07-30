package p153l;

/* JADX INFO: loaded from: classes3.dex */
public class f4k extends zr2 {

    /* JADX INFO: renamed from: c */
    int f97101c;

    /* JADX INFO: renamed from: d */
    int f97102d;

    /* JADX INFO: renamed from: e */
    qv40 f97103e;

    /* JADX INFO: renamed from: f */
    ixk f97104f;

    /* JADX INFO: renamed from: g */
    rkf f97105g;

    /* JADX INFO: renamed from: i */
    yrf f97106i;

    /* JADX INFO: renamed from: j */
    x0q f97107j;

    /* JADX INFO: renamed from: k */
    h2g0 f97108k;

    /* JADX INFO: renamed from: l */
    z43 f97109l;

    /* JADX INFO: renamed from: m */
    kc00 f97110m;

    /* JADX INFO: renamed from: n */
    lc00 f97111n;

    /* JADX INFO: renamed from: o */
    private boolean f97112o = false;

    /* JADX INFO: renamed from: Q1 */
    private void m123990Q1(int i, int i2) {
        this.f97101c = i;
        this.f97102d = i2;
        this.f97103e = new qv40();
        this.f97105g = new rkf(this.f97101c / 4, this.f97102d / 4);
        ixk ixkVar = new ixk(this.f97101c / 4, this.f97102d / 4);
        this.f97104f = ixkVar;
        ixkVar.setRenderSize(this.f97101c / 4, this.f97102d / 4);
        this.f97106i = new yrf();
        x0q x0qVar = new x0q(this.f97101c / 4, this.f97102d / 4);
        this.f97107j = x0qVar;
        x0qVar.setRenderSize(this.f97101c / 4, this.f97102d / 4);
        this.f97108k = new h2g0(this.f97101c / 4, this.f97102d / 4);
        this.f97109l = new z43(this.f97101c / 4, this.f97102d / 4);
        kc00 kc00Var = new kc00();
        this.f97110m = kc00Var;
        kc00Var.m149094Q1(0.8f, 0.6f, 1.4f);
        lc00 lc00Var = new lc00();
        this.f97111n = lc00Var;
        lc00Var.m153598Q1(1.0f, 1.0f, 1.0f);
        this.f97111n.m153600S1(1.0f, 1.0f, 1.0f);
        this.f97111n.m153599R1(0.0f, 0.0f, 0.0f);
        this.f97103e.addTarget(this.f97105g);
        this.f97103e.addTarget(this.f97104f);
        this.f97105g.addTarget(this.f97106i);
        this.f97104f.addTarget(this.f97106i);
        this.f97106i.registerFilterLocation(this.f97105g, 0);
        this.f97106i.registerFilterLocation(this.f97104f, 1);
        this.f97106i.addTarget(this.f97107j);
        this.f97106i.addTarget(this.f97108k);
        this.f97108k.addTarget(this.f97109l);
        this.f97107j.addTarget(this.f97110m);
        this.f97108k.addTarget(this.f97110m);
        this.f97109l.addTarget(this.f97110m);
        this.f97110m.registerFilterLocation(this.f97107j);
        this.f97110m.registerFilterLocation(this.f97108k);
        this.f97110m.registerFilterLocation(this.f97109l);
        this.f97103e.addTarget(this.f97111n);
        this.f97110m.addTarget(this.f97111n);
        this.f97111n.registerFilterLocation(this.f97103e);
        this.f97111n.registerFilterLocation(this.f97110m);
        this.f97111n.addTarget(this);
        registerInitialFilter(this.f97103e);
        registerFilter(this.f97105g);
        registerFilter(this.f97104f);
        registerFilter(this.f97106i);
        registerFilter(this.f97107j);
        registerFilter(this.f97108k);
        registerFilter(this.f97109l);
        registerFilter(this.f97110m);
        registerTerminalFilter(this.f97111n);
    }

    @Override // p153l.lt2, p153l.AbstractC17634i4, p153l.jt2, p153l.dfj
    public void newTextureReady(int i, gfj gfjVar, boolean z) {
        if (!this.f97112o && gfjVar != null && gfjVar.getWidth() != 0 && gfjVar.getHeight() != 0) {
            m123990Q1(gfjVar.getWidth(), gfjVar.getHeight());
            this.f97112o = true;
        }
        super.newTextureReady(i, gfjVar, z);
    }
}
