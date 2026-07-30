package p149l;

/* JADX INFO: loaded from: classes3.dex */
public class o1k extends jr2 {

    /* JADX INFO: renamed from: c */
    int f141447c;

    /* JADX INFO: renamed from: d */
    int f141448d;

    /* JADX INFO: renamed from: e */
    cn40 f141449e;

    /* JADX INFO: renamed from: f */
    suk f141450f;

    /* JADX INFO: renamed from: g */
    ljf f141451g;

    /* JADX INFO: renamed from: i */
    rqf f141452i;

    /* JADX INFO: renamed from: j */
    xyp f141453j;

    /* JADX INFO: renamed from: k */
    ytf0 f141454k;

    /* JADX INFO: renamed from: l */
    j43 f141455l;

    /* JADX INFO: renamed from: m */
    n300 f141456m;

    /* JADX INFO: renamed from: n */
    o300 f141457n;

    /* JADX INFO: renamed from: o */
    private boolean f141458o = false;

    /* JADX INFO: renamed from: Q1 */
    private void m162256Q1(int i, int i2) {
        this.f141447c = i;
        this.f141448d = i2;
        this.f141449e = new cn40();
        this.f141451g = new ljf(this.f141447c / 4, this.f141448d / 4);
        suk sukVar = new suk(this.f141447c / 4, this.f141448d / 4);
        this.f141450f = sukVar;
        sukVar.setRenderSize(this.f141447c / 4, this.f141448d / 4);
        this.f141452i = new rqf();
        xyp xypVar = new xyp(this.f141447c / 4, this.f141448d / 4);
        this.f141453j = xypVar;
        xypVar.setRenderSize(this.f141447c / 4, this.f141448d / 4);
        this.f141454k = new ytf0(this.f141447c / 4, this.f141448d / 4);
        this.f141455l = new j43(this.f141447c / 4, this.f141448d / 4);
        n300 n300Var = new n300();
        this.f141456m = n300Var;
        n300Var.m157685Q1(0.8f, 0.6f, 1.4f);
        o300 o300Var = new o300();
        this.f141457n = o300Var;
        o300Var.m162328Q1(1.0f, 1.0f, 1.0f);
        this.f141457n.m162330S1(1.0f, 1.0f, 1.0f);
        this.f141457n.m162329R1(0.0f, 0.0f, 0.0f);
        this.f141449e.addTarget(this.f141451g);
        this.f141449e.addTarget(this.f141450f);
        this.f141451g.addTarget(this.f141452i);
        this.f141450f.addTarget(this.f141452i);
        this.f141452i.registerFilterLocation(this.f141451g, 0);
        this.f141452i.registerFilterLocation(this.f141450f, 1);
        this.f141452i.addTarget(this.f141453j);
        this.f141452i.addTarget(this.f141454k);
        this.f141454k.addTarget(this.f141455l);
        this.f141453j.addTarget(this.f141456m);
        this.f141454k.addTarget(this.f141456m);
        this.f141455l.addTarget(this.f141456m);
        this.f141456m.registerFilterLocation(this.f141453j);
        this.f141456m.registerFilterLocation(this.f141454k);
        this.f141456m.registerFilterLocation(this.f141455l);
        this.f141449e.addTarget(this.f141457n);
        this.f141456m.addTarget(this.f141457n);
        this.f141457n.registerFilterLocation(this.f141449e);
        this.f141457n.registerFilterLocation(this.f141456m);
        this.f141457n.addTarget(this);
        registerInitialFilter(this.f141449e);
        registerFilter(this.f141451g);
        registerFilter(this.f141450f);
        registerFilter(this.f141452i);
        registerFilter(this.f141453j);
        registerFilter(this.f141454k);
        registerFilter(this.f141455l);
        registerFilter(this.f141456m);
        registerTerminalFilter(this.f141457n);
    }

    @Override // p149l.vs2, p149l.AbstractC17477i4, p149l.ts2, p149l.jcj
    public void newTextureReady(int i, mcj mcjVar, boolean z) {
        if (!this.f141458o && mcjVar != null && mcjVar.getWidth() != 0 && mcjVar.getHeight() != 0) {
            m162256Q1(mcjVar.getWidth(), mcjVar.getHeight());
            this.f141458o = true;
        }
        super.newTextureReady(i, mcjVar, z);
    }
}
