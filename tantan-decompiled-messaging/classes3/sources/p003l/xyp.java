package p003l;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class xyp extends ydk {

    /* JADX INFO: renamed from: a */
    suk f8875a;

    /* JADX INFO: renamed from: b */
    suk f8876b;

    /* JADX INFO: renamed from: c */
    suk f8877c;

    /* JADX INFO: renamed from: d */
    suk f8878d;

    /* JADX INFO: renamed from: e */
    tjy f8879e;

    /* JADX INFO: renamed from: f */
    int f8880f;

    /* JADX INFO: renamed from: g */
    int f8881g;

    public xyp(int i, int i2) {
        this.f8881g = i2;
        this.f8880f = i;
        setFloatTexture(true);
        this.f8875a = new suk(this.f8880f, this.f8881g);
        this.f8876b = new suk(this.f8880f / 2, this.f8881g / 2);
        this.f8877c = new suk(this.f8880f / 4, this.f8881g / 4);
        this.f8878d = new suk(this.f8880f / 8, this.f8881g / 8);
        tjy tjyVar = new tjy();
        this.f8879e = tjyVar;
        tjyVar.m7765Q1(0.3f, 0.3f, 0.25f, 0.0f);
        this.f8875a.addTarget(this.f8876b);
        this.f8876b.addTarget(this.f8877c);
        this.f8875a.addTarget(this.f8878d);
        this.f8875a.addTarget(this.f8879e);
        this.f8876b.addTarget(this.f8879e);
        this.f8877c.addTarget(this.f8879e);
        this.f8878d.addTarget(this.f8879e);
        this.f8879e.registerFilterLocation(this.f8875a);
        this.f8879e.registerFilterLocation(this.f8876b);
        this.f8879e.registerFilterLocation(this.f8877c);
        this.f8879e.registerFilterLocation(this.f8878d);
        this.f8879e.addTarget(this);
        registerInitialFilter(this.f8875a);
        registerFilter(this.f8876b);
        registerFilter(this.f8877c);
        registerFilter(this.f8878d);
        registerTerminalFilter(this.f8879e);
    }
}
