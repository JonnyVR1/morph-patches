package p153l;

/* JADX INFO: loaded from: classes3.dex */
public class ixk extends ogk {

    /* JADX INFO: renamed from: a */
    y43 f117423a;

    /* JADX INFO: renamed from: b */
    y43 f117424b;

    /* JADX INFO: renamed from: c */
    int f117425c;

    /* JADX INFO: renamed from: d */
    int f117426d;

    public ixk(int i, int i2) {
        setFloatTexture(true);
        this.f117426d = i2;
        this.f117425c = i;
        this.f117423a = new y43();
        this.f117424b = new y43();
        this.f117423a.m214196Q1(1.0f / this.f117425c, 0.0f);
        this.f117424b.m214196Q1(0.0f, 1.0f / this.f117426d);
        this.f117423a.addTarget(this.f117424b);
        this.f117424b.addTarget(this);
        registerInitialFilter(this.f117423a);
        registerTerminalFilter(this.f117424b);
    }
}
