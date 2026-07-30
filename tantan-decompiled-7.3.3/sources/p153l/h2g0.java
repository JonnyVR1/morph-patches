package p153l;

/* JADX INFO: loaded from: classes3.dex */
public class h2g0 extends ogk {

    /* JADX INFO: renamed from: a */
    int f107550a;

    /* JADX INFO: renamed from: b */
    int f107551b;

    /* JADX INFO: renamed from: c */
    qv40 f107552c;

    /* JADX INFO: renamed from: d */
    g2g0 f107553d;

    /* JADX INFO: renamed from: e */
    g2g0 f107554e;

    /* JADX INFO: renamed from: f */
    g2g0 f107555f;

    /* JADX INFO: renamed from: g */
    g2g0 f107556g;

    /* JADX INFO: renamed from: i */
    nc00 f107557i;

    public h2g0(int i, int i2) {
        this.f107550a = i;
        this.f107551b = i2;
        setFloatTexture(true);
        this.f107552c = new qv40();
        this.f107553d = new g2g0(i, i2);
        this.f107554e = new g2g0(i, i2);
        this.f107555f = new g2g0(i, i2);
        this.f107556g = new g2g0(i, i2);
        this.f107557i = new nc00();
        this.f107553d.m128621Q1(-1, -1);
        this.f107554e.m128621Q1(1, -1);
        this.f107555f.m128621Q1(-1, 1);
        this.f107556g.m128621Q1(1, 1);
        this.f107552c.addTarget(this.f107553d);
        this.f107552c.addTarget(this.f107554e);
        this.f107552c.addTarget(this.f107555f);
        this.f107552c.addTarget(this.f107556g);
        this.f107553d.addTarget(this.f107557i);
        this.f107554e.addTarget(this.f107557i);
        this.f107555f.addTarget(this.f107557i);
        this.f107556g.addTarget(this.f107557i);
        this.f107557i.addTarget(this);
        this.f107557i.registerFilterLocation(this.f107553d);
        this.f107557i.registerFilterLocation(this.f107554e);
        this.f107557i.registerFilterLocation(this.f107555f);
        this.f107557i.registerFilterLocation(this.f107556g);
        registerInitialFilter(this.f107552c);
        registerFilter(this.f107553d);
        registerFilter(this.f107554e);
        registerFilter(this.f107555f);
        registerFilter(this.f107556g);
        registerTerminalFilter(this.f107557i);
    }
}
