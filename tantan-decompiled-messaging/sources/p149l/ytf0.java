package p149l;

/* JADX INFO: loaded from: classes3.dex */
public class ytf0 extends ydk {

    /* JADX INFO: renamed from: a */
    int f199916a;

    /* JADX INFO: renamed from: b */
    int f199917b;

    /* JADX INFO: renamed from: c */
    cn40 f199918c;

    /* JADX INFO: renamed from: d */
    xtf0 f199919d;

    /* JADX INFO: renamed from: e */
    xtf0 f199920e;

    /* JADX INFO: renamed from: f */
    xtf0 f199921f;

    /* JADX INFO: renamed from: g */
    xtf0 f199922g;

    /* JADX INFO: renamed from: i */
    q300 f199923i;

    public ytf0(int i, int i2) {
        this.f199916a = i;
        this.f199917b = i2;
        setFloatTexture(true);
        this.f199918c = new cn40();
        this.f199919d = new xtf0(i, i2);
        this.f199920e = new xtf0(i, i2);
        this.f199921f = new xtf0(i, i2);
        this.f199922g = new xtf0(i, i2);
        this.f199923i = new q300();
        this.f199919d.m210970Q1(-1, -1);
        this.f199920e.m210970Q1(1, -1);
        this.f199921f.m210970Q1(-1, 1);
        this.f199922g.m210970Q1(1, 1);
        this.f199918c.addTarget(this.f199919d);
        this.f199918c.addTarget(this.f199920e);
        this.f199918c.addTarget(this.f199921f);
        this.f199918c.addTarget(this.f199922g);
        this.f199919d.addTarget(this.f199923i);
        this.f199920e.addTarget(this.f199923i);
        this.f199921f.addTarget(this.f199923i);
        this.f199922g.addTarget(this.f199923i);
        this.f199923i.addTarget(this);
        this.f199923i.registerFilterLocation(this.f199919d);
        this.f199923i.registerFilterLocation(this.f199920e);
        this.f199923i.registerFilterLocation(this.f199921f);
        this.f199923i.registerFilterLocation(this.f199922g);
        registerInitialFilter(this.f199918c);
        registerFilter(this.f199919d);
        registerFilter(this.f199920e);
        registerFilter(this.f199921f);
        registerFilter(this.f199922g);
        registerTerminalFilter(this.f199923i);
    }
}
