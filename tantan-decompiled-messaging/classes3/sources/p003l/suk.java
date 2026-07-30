package p003l;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class suk extends ydk {

    /* JADX INFO: renamed from: a */
    i43 f7325a;

    /* JADX INFO: renamed from: b */
    i43 f7326b;

    /* JADX INFO: renamed from: c */
    int f7327c;

    /* JADX INFO: renamed from: d */
    int f7328d;

    public suk(int i, int i2) {
        setFloatTexture(true);
        this.f7328d = i2;
        this.f7327c = i;
        this.f7325a = new i43();
        this.f7326b = new i43();
        this.f7325a.m5031Q1(1.0f / this.f7327c, 0.0f);
        this.f7326b.m5031Q1(0.0f, 1.0f / this.f7328d);
        this.f7325a.addTarget(this.f7326b);
        this.f7326b.addTarget(this);
        registerInitialFilter(this.f7325a);
        registerTerminalFilter(this.f7326b);
    }
}
