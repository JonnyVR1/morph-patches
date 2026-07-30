package p003l;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class j43 extends ydk {

    /* JADX INFO: renamed from: a */
    i43 f4568a;

    /* JADX INFO: renamed from: b */
    i43 f4569b;

    /* JADX INFO: renamed from: c */
    int f4570c;

    /* JADX INFO: renamed from: d */
    int f4571d;

    public j43(int i, int i2) {
        this.f4571d = i2;
        this.f4570c = i;
        setFloatTexture(true);
        this.f4568a = new i43();
        this.f4569b = new i43();
        this.f4568a.m5031Q1(1.0f / this.f4570c, 0.0f);
        this.f4569b.m5031Q1(0.0f, 1.0f / this.f4571d);
        this.f4568a.addTarget(this.f4569b);
        this.f4569b.addTarget(this);
        registerInitialFilter(this.f4568a);
        registerTerminalFilter(this.f4569b);
    }
}
