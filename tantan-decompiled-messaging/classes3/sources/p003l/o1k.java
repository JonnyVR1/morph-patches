package p003l;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class o1k extends jr2 {

    /* JADX INFO: renamed from: c */
    int f6011c;

    /* JADX INFO: renamed from: d */
    int f6012d;

    /* JADX INFO: renamed from: e */
    cn40 f6013e;

    /* JADX INFO: renamed from: f */
    suk f6014f;

    /* JADX INFO: renamed from: g */
    ljf f6015g;

    /* JADX INFO: renamed from: i */
    rqf f6016i;

    /* JADX INFO: renamed from: j */
    xyp f6017j;

    /* JADX INFO: renamed from: k */
    ytf0 f6018k;

    /* JADX INFO: renamed from: l */
    j43 f6019l;

    /* JADX INFO: renamed from: m */
    n300 f6020m;

    /* JADX INFO: renamed from: n */
    o300 f6021n;

    /* JADX INFO: renamed from: o */
    private boolean f6022o = false;

    /* JADX INFO: renamed from: Q1 */
    private void m6576Q1(int i, int i2) {
        this.f6011c = i;
        this.f6012d = i2;
        this.f6013e = new cn40();
        this.f6015g = new ljf(this.f6011c / 4, this.f6012d / 4);
        suk sukVar = new suk(this.f6011c / 4, this.f6012d / 4);
        this.f6014f = sukVar;
        sukVar.setRenderSize(this.f6011c / 4, this.f6012d / 4);
        this.f6016i = new rqf();
        xyp xypVar = new xyp(this.f6011c / 4, this.f6012d / 4);
        this.f6017j = xypVar;
        xypVar.setRenderSize(this.f6011c / 4, this.f6012d / 4);
        this.f6018k = new ytf0(this.f6011c / 4, this.f6012d / 4);
        this.f6019l = new j43(this.f6011c / 4, this.f6012d / 4);
        n300 n300Var = new n300();
        this.f6020m = n300Var;
        n300Var.m6525Q1(0.8f, 0.6f, 1.4f);
        o300 o300Var = new o300();
        this.f6021n = o300Var;
        o300Var.m6577Q1(1.0f, 1.0f, 1.0f);
        this.f6021n.m6579S1(1.0f, 1.0f, 1.0f);
        this.f6021n.m6578R1(0.0f, 0.0f, 0.0f);
        this.f6013e.addTarget(this.f6015g);
        this.f6013e.addTarget(this.f6014f);
        this.f6015g.addTarget(this.f6016i);
        this.f6014f.addTarget(this.f6016i);
        this.f6016i.registerFilterLocation(this.f6015g, 0);
        this.f6016i.registerFilterLocation(this.f6014f, 1);
        this.f6016i.addTarget(this.f6017j);
        this.f6016i.addTarget(this.f6018k);
        this.f6018k.addTarget(this.f6019l);
        this.f6017j.addTarget(this.f6020m);
        this.f6018k.addTarget(this.f6020m);
        this.f6019l.addTarget(this.f6020m);
        this.f6020m.registerFilterLocation(this.f6017j);
        this.f6020m.registerFilterLocation(this.f6018k);
        this.f6020m.registerFilterLocation(this.f6019l);
        this.f6013e.addTarget(this.f6021n);
        this.f6020m.addTarget(this.f6021n);
        this.f6021n.registerFilterLocation(this.f6013e);
        this.f6021n.registerFilterLocation(this.f6020m);
        this.f6021n.addTarget(this);
        registerInitialFilter(this.f6013e);
        registerFilter(this.f6015g);
        registerFilter(this.f6014f);
        registerFilter(this.f6016i);
        registerFilter(this.f6017j);
        registerFilter(this.f6018k);
        registerFilter(this.f6019l);
        registerFilter(this.f6020m);
        registerTerminalFilter(this.f6021n);
    }

    @Override // p003l.vs2, p003l.AbstractC0341i4, p003l.ts2, p003l.jcj
    public void newTextureReady(int i, mcj mcjVar, boolean z) {
        if (!this.f6022o && mcjVar != null && mcjVar.getWidth() != 0 && mcjVar.getHeight() != 0) {
            m6576Q1(mcjVar.getWidth(), mcjVar.getHeight());
            this.f6022o = true;
        }
        super.newTextureReady(i, mcjVar, z);
    }
}
