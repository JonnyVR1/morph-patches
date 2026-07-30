package p003l;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ytf0 extends ydk {

    /* JADX INFO: renamed from: a */
    int f9133a;

    /* JADX INFO: renamed from: b */
    int f9134b;

    /* JADX INFO: renamed from: c */
    cn40 f9135c;

    /* JADX INFO: renamed from: d */
    xtf0 f9136d;

    /* JADX INFO: renamed from: e */
    xtf0 f9137e;

    /* JADX INFO: renamed from: f */
    xtf0 f9138f;

    /* JADX INFO: renamed from: g */
    xtf0 f9139g;

    /* JADX INFO: renamed from: i */
    q300 f9140i;

    public ytf0(int i, int i2) {
        this.f9133a = i;
        this.f9134b = i2;
        setFloatTexture(true);
        this.f9135c = new cn40();
        this.f9136d = new xtf0(i, i2);
        this.f9137e = new xtf0(i, i2);
        this.f9138f = new xtf0(i, i2);
        this.f9139g = new xtf0(i, i2);
        this.f9140i = new q300();
        this.f9136d.m8864Q1(-1, -1);
        this.f9137e.m8864Q1(1, -1);
        this.f9138f.m8864Q1(-1, 1);
        this.f9139g.m8864Q1(1, 1);
        this.f9135c.addTarget(this.f9136d);
        this.f9135c.addTarget(this.f9137e);
        this.f9135c.addTarget(this.f9138f);
        this.f9135c.addTarget(this.f9139g);
        this.f9136d.addTarget(this.f9140i);
        this.f9137e.addTarget(this.f9140i);
        this.f9138f.addTarget(this.f9140i);
        this.f9139g.addTarget(this.f9140i);
        this.f9140i.addTarget(this);
        this.f9140i.registerFilterLocation(this.f9136d);
        this.f9140i.registerFilterLocation(this.f9137e);
        this.f9140i.registerFilterLocation(this.f9138f);
        this.f9140i.registerFilterLocation(this.f9139g);
        registerInitialFilter(this.f9135c);
        registerFilter(this.f9136d);
        registerFilter(this.f9137e);
        registerFilter(this.f9138f);
        registerFilter(this.f9139g);
        registerTerminalFilter(this.f9140i);
    }
}
