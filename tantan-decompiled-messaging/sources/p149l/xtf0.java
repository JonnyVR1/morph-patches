package p149l;

/* JADX INFO: loaded from: classes3.dex */
public class xtf0 extends ydk {

    /* JADX INFO: renamed from: a */
    int f194383a;

    /* JADX INFO: renamed from: b */
    int f194384b;

    /* JADX INFO: renamed from: c */
    gbe f194385c;

    /* JADX INFO: renamed from: d */
    gbe f194386d;

    /* JADX INFO: renamed from: e */
    gbe f194387e;

    public xtf0(int i, int i2) {
        this.f194383a = i;
        this.f194384b = i2;
        setFloatTexture(true);
        this.f194385c = new gbe();
        this.f194386d = new gbe();
        this.f194387e = new gbe();
        this.f194385c.addTarget(this.f194386d);
        this.f194386d.addTarget(this.f194387e);
        this.f194387e.addTarget(this);
        registerInitialFilter(this.f194385c);
        registerFilter(this.f194386d);
        registerTerminalFilter(this.f194387e);
    }

    /* JADX INFO: renamed from: Q1 */
    public void m210970Q1(int i, int i2) {
        float f = i;
        float f2 = i2;
        this.f194385c.m125130U1(f / this.f194383a, f2 / this.f194384b);
        this.f194385c.m125131V1(1.0f);
        this.f194385c.m125126Q1(0.375f, 0.35625f, 0.33749998f, 0.375f);
        this.f194385c.m125127R1(0.27f, 0.18f, 0.162f, 0.225f);
        this.f194385c.m125128S1(0.2733f, 0.246f, 0.2733f, 0.30375f);
        this.f194385c.m125129T1(0.246f, 0.246f, 0.2214f, 0.2733f);
        this.f194386d.m125130U1(f / this.f194383a, f2 / this.f194384b);
        this.f194386d.m125131V1(4.0f);
        this.f194386d.m125126Q1(0.375f, 0.33749998f, 0.3f, 0.375f);
        this.f194386d.m125127R1(0.246f, 0.147f, 0.123f, 0.246f);
        this.f194386d.m125128S1(0.080715f, 0.080715f, 0.048420005f, 0.1614f);
        this.f194386d.m125129T1(0.06354f, 0.025425f, 0.06354f, 0.105915f);
        this.f194387e.m125130U1(f / this.f194383a, f2 / this.f194384b);
        this.f194387e.m125131V1(16.0f);
        this.f194387e.m125126Q1(0.375f, 0.375f, 0.375f, 0.375f);
        this.f194387e.m125127R1(0.069495f, 0.041685f, 0.041685f, 0.069495f);
        this.f194387e.m125128S1(0.0077265f, 0.0077265f, 0.004635f, 0.012876f);
        this.f194387e.m125129T1(0.001431f, 8.595E-4f, 0.001431f, 0.0023865001f);
    }
}
