package p149l;

/* JADX INFO: loaded from: classes3.dex */
public class j43 extends ydk {

    /* JADX INFO: renamed from: a */
    i43 f116135a;

    /* JADX INFO: renamed from: b */
    i43 f116136b;

    /* JADX INFO: renamed from: c */
    int f116137c;

    /* JADX INFO: renamed from: d */
    int f116138d;

    public j43(int i, int i2) {
        this.f116138d = i2;
        this.f116137c = i;
        setFloatTexture(true);
        this.f116135a = new i43();
        this.f116136b = new i43();
        this.f116135a.m134321Q1(1.0f / this.f116137c, 0.0f);
        this.f116136b.m134321Q1(0.0f, 1.0f / this.f116138d);
        this.f116135a.addTarget(this.f116136b);
        this.f116136b.addTarget(this);
        registerInitialFilter(this.f116135a);
        registerTerminalFilter(this.f116136b);
    }
}
