package p153l;

/* JADX INFO: loaded from: classes3.dex */
public class z43 extends ogk {

    /* JADX INFO: renamed from: a */
    y43 f202894a;

    /* JADX INFO: renamed from: b */
    y43 f202895b;

    /* JADX INFO: renamed from: c */
    int f202896c;

    /* JADX INFO: renamed from: d */
    int f202897d;

    public z43(int i, int i2) {
        this.f202897d = i2;
        this.f202896c = i;
        setFloatTexture(true);
        this.f202894a = new y43();
        this.f202895b = new y43();
        this.f202894a.m214196Q1(1.0f / this.f202896c, 0.0f);
        this.f202895b.m214196Q1(0.0f, 1.0f / this.f202897d);
        this.f202894a.addTarget(this.f202895b);
        this.f202895b.addTarget(this);
        registerInitialFilter(this.f202894a);
        registerTerminalFilter(this.f202895b);
    }
}
