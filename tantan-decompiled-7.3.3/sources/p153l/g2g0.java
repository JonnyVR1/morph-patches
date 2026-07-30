package p153l;

/* JADX INFO: loaded from: classes3.dex */
public class g2g0 extends ogk {

    /* JADX INFO: renamed from: a */
    int f101840a;

    /* JADX INFO: renamed from: b */
    int f101841b;

    /* JADX INFO: renamed from: c */
    kce f101842c;

    /* JADX INFO: renamed from: d */
    kce f101843d;

    /* JADX INFO: renamed from: e */
    kce f101844e;

    public g2g0(int i, int i2) {
        this.f101840a = i;
        this.f101841b = i2;
        setFloatTexture(true);
        this.f101842c = new kce();
        this.f101843d = new kce();
        this.f101844e = new kce();
        this.f101842c.addTarget(this.f101843d);
        this.f101843d.addTarget(this.f101844e);
        this.f101844e.addTarget(this);
        registerInitialFilter(this.f101842c);
        registerFilter(this.f101843d);
        registerTerminalFilter(this.f101844e);
    }

    /* JADX INFO: renamed from: Q1 */
    public void m128621Q1(int i, int i2) {
        float f = i;
        float f2 = i2;
        this.f101842c.m149110U1(f / this.f101840a, f2 / this.f101841b);
        this.f101842c.m149111V1(1.0f);
        this.f101842c.m149106Q1(0.375f, 0.35625f, 0.33749998f, 0.375f);
        this.f101842c.m149107R1(0.27f, 0.18f, 0.162f, 0.225f);
        this.f101842c.m149108S1(0.2733f, 0.246f, 0.2733f, 0.30375f);
        this.f101842c.m149109T1(0.246f, 0.246f, 0.2214f, 0.2733f);
        this.f101843d.m149110U1(f / this.f101840a, f2 / this.f101841b);
        this.f101843d.m149111V1(4.0f);
        this.f101843d.m149106Q1(0.375f, 0.33749998f, 0.3f, 0.375f);
        this.f101843d.m149107R1(0.246f, 0.147f, 0.123f, 0.246f);
        this.f101843d.m149108S1(0.080715f, 0.080715f, 0.048420005f, 0.1614f);
        this.f101843d.m149109T1(0.06354f, 0.025425f, 0.06354f, 0.105915f);
        this.f101844e.m149110U1(f / this.f101840a, f2 / this.f101841b);
        this.f101844e.m149111V1(16.0f);
        this.f101844e.m149106Q1(0.375f, 0.375f, 0.375f, 0.375f);
        this.f101844e.m149107R1(0.069495f, 0.041685f, 0.041685f, 0.069495f);
        this.f101844e.m149108S1(0.0077265f, 0.0077265f, 0.004635f, 0.012876f);
        this.f101844e.m149109T1(0.001431f, 8.595E-4f, 0.001431f, 0.0023865001f);
    }
}
