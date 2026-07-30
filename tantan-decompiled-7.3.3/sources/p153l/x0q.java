package p153l;

/* JADX INFO: loaded from: classes3.dex */
public class x0q extends ogk {

    /* JADX INFO: renamed from: a */
    ixk f191927a;

    /* JADX INFO: renamed from: b */
    ixk f191928b;

    /* JADX INFO: renamed from: c */
    ixk f191929c;

    /* JADX INFO: renamed from: d */
    ixk f191930d;

    /* JADX INFO: renamed from: e */
    qsy f191931e;

    /* JADX INFO: renamed from: f */
    int f191932f;

    /* JADX INFO: renamed from: g */
    int f191933g;

    public x0q(int i, int i2) {
        this.f191933g = i2;
        this.f191932f = i;
        setFloatTexture(true);
        this.f191927a = new ixk(this.f191932f, this.f191933g);
        this.f191928b = new ixk(this.f191932f / 2, this.f191933g / 2);
        this.f191929c = new ixk(this.f191932f / 4, this.f191933g / 4);
        this.f191930d = new ixk(this.f191932f / 8, this.f191933g / 8);
        qsy qsyVar = new qsy();
        this.f191931e = qsyVar;
        qsyVar.m177842Q1(0.3f, 0.3f, 0.25f, 0.0f);
        this.f191927a.addTarget(this.f191928b);
        this.f191928b.addTarget(this.f191929c);
        this.f191927a.addTarget(this.f191930d);
        this.f191927a.addTarget(this.f191931e);
        this.f191928b.addTarget(this.f191931e);
        this.f191929c.addTarget(this.f191931e);
        this.f191930d.addTarget(this.f191931e);
        this.f191931e.registerFilterLocation(this.f191927a);
        this.f191931e.registerFilterLocation(this.f191928b);
        this.f191931e.registerFilterLocation(this.f191929c);
        this.f191931e.registerFilterLocation(this.f191930d);
        this.f191931e.addTarget(this);
        registerInitialFilter(this.f191927a);
        registerFilter(this.f191928b);
        registerFilter(this.f191929c);
        registerFilter(this.f191930d);
        registerTerminalFilter(this.f191931e);
    }
}
