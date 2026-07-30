package p149l;

/* JADX INFO: loaded from: classes3.dex */
public class xyp extends ydk {

    /* JADX INFO: renamed from: a */
    suk f195104a;

    /* JADX INFO: renamed from: b */
    suk f195105b;

    /* JADX INFO: renamed from: c */
    suk f195106c;

    /* JADX INFO: renamed from: d */
    suk f195107d;

    /* JADX INFO: renamed from: e */
    tjy f195108e;

    /* JADX INFO: renamed from: f */
    int f195109f;

    /* JADX INFO: renamed from: g */
    int f195110g;

    public xyp(int i, int i2) {
        this.f195110g = i2;
        this.f195109f = i;
        setFloatTexture(true);
        this.f195104a = new suk(this.f195109f, this.f195110g);
        this.f195105b = new suk(this.f195109f / 2, this.f195110g / 2);
        this.f195106c = new suk(this.f195109f / 4, this.f195110g / 4);
        this.f195107d = new suk(this.f195109f / 8, this.f195110g / 8);
        tjy tjyVar = new tjy();
        this.f195108e = tjyVar;
        tjyVar.m189420Q1(0.3f, 0.3f, 0.25f, 0.0f);
        this.f195104a.addTarget(this.f195105b);
        this.f195105b.addTarget(this.f195106c);
        this.f195104a.addTarget(this.f195107d);
        this.f195104a.addTarget(this.f195108e);
        this.f195105b.addTarget(this.f195108e);
        this.f195106c.addTarget(this.f195108e);
        this.f195107d.addTarget(this.f195108e);
        this.f195108e.registerFilterLocation(this.f195104a);
        this.f195108e.registerFilterLocation(this.f195105b);
        this.f195108e.registerFilterLocation(this.f195106c);
        this.f195108e.registerFilterLocation(this.f195107d);
        this.f195108e.addTarget(this);
        registerInitialFilter(this.f195104a);
        registerFilter(this.f195105b);
        registerFilter(this.f195106c);
        registerFilter(this.f195107d);
        registerTerminalFilter(this.f195108e);
    }
}
