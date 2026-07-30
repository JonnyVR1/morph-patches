package p149l;

/* JADX INFO: loaded from: classes3.dex */
public class suk extends ydk {

    /* JADX INFO: renamed from: a */
    i43 f166473a;

    /* JADX INFO: renamed from: b */
    i43 f166474b;

    /* JADX INFO: renamed from: c */
    int f166475c;

    /* JADX INFO: renamed from: d */
    int f166476d;

    public suk(int i, int i2) {
        setFloatTexture(true);
        this.f166476d = i2;
        this.f166475c = i;
        this.f166473a = new i43();
        this.f166474b = new i43();
        this.f166473a.m134321Q1(1.0f / this.f166475c, 0.0f);
        this.f166474b.m134321Q1(0.0f, 1.0f / this.f166476d);
        this.f166473a.addTarget(this.f166474b);
        this.f166474b.addTarget(this);
        registerInitialFilter(this.f166473a);
        registerTerminalFilter(this.f166474b);
    }
}
