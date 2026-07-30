package p003l;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class uh0 extends ydk {

    /* JADX INFO: renamed from: a */
    private m3j f7983a = new m3j();

    /* JADX INFO: renamed from: b */
    private m3j f7984b = new m3j();

    /* JADX INFO: renamed from: c */
    private th0 f7985c;

    public uh0() {
        th0 th0Var = new th0();
        this.f7985c = th0Var;
        this.f7983a.addTarget(th0Var);
        this.f7984b.addTarget(this.f7985c);
        this.f7985c.registerFilterLocation(this.f7983a, 0);
        this.f7985c.registerFilterLocation(this.f7984b, 1);
        this.f7985c.addTarget(this);
        registerInitialFilter(this.f7983a);
        registerInitialFilter(this.f7984b);
        registerTerminalFilter(this.f7985c);
        this.f7985c.m7748Q1(true);
    }
}
