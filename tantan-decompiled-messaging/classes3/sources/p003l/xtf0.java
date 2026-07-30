package p003l;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class xtf0 extends ydk {

    /* JADX INFO: renamed from: a */
    int f8850a;

    /* JADX INFO: renamed from: b */
    int f8851b;

    /* JADX INFO: renamed from: c */
    gbe f8852c;

    /* JADX INFO: renamed from: d */
    gbe f8853d;

    /* JADX INFO: renamed from: e */
    gbe f8854e;

    public xtf0(int i, int i2) {
        this.f8850a = i;
        this.f8851b = i2;
        setFloatTexture(true);
        this.f8852c = new gbe();
        this.f8853d = new gbe();
        this.f8854e = new gbe();
        this.f8852c.addTarget(this.f8853d);
        this.f8853d.addTarget(this.f8854e);
        this.f8854e.addTarget(this);
        registerInitialFilter(this.f8852c);
        registerFilter(this.f8853d);
        registerTerminalFilter(this.f8854e);
    }

    /* JADX INFO: renamed from: Q1 */
    public void m8864Q1(int i, int i2) {
        float f = i;
        float f2 = i2;
        this.f8852c.m4524U1(f / this.f8850a, f2 / this.f8851b);
        this.f8852c.m4525V1(1.0f);
        this.f8852c.m4520Q1(0.375f, 0.35625f, 0.33749998f, 0.375f);
        this.f8852c.m4521R1(0.27f, 0.18f, 0.162f, 0.225f);
        this.f8852c.m4522S1(0.2733f, 0.246f, 0.2733f, 0.30375f);
        this.f8852c.m4523T1(0.246f, 0.246f, 0.2214f, 0.2733f);
        this.f8853d.m4524U1(f / this.f8850a, f2 / this.f8851b);
        this.f8853d.m4525V1(4.0f);
        this.f8853d.m4520Q1(0.375f, 0.33749998f, 0.3f, 0.375f);
        this.f8853d.m4521R1(0.246f, 0.147f, 0.123f, 0.246f);
        this.f8853d.m4522S1(0.080715f, 0.080715f, 0.048420005f, 0.1614f);
        this.f8853d.m4523T1(0.06354f, 0.025425f, 0.06354f, 0.105915f);
        this.f8854e.m4524U1(f / this.f8850a, f2 / this.f8851b);
        this.f8854e.m4525V1(16.0f);
        this.f8854e.m4520Q1(0.375f, 0.375f, 0.375f, 0.375f);
        this.f8854e.m4521R1(0.069495f, 0.041685f, 0.041685f, 0.069495f);
        this.f8854e.m4522S1(0.0077265f, 0.0077265f, 0.004635f, 0.012876f);
        this.f8854e.m4523T1(0.001431f, 8.595E-4f, 0.001431f, 0.0023865001f);
    }
}
