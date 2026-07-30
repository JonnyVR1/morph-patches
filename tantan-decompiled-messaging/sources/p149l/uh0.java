package p149l;

/* JADX INFO: loaded from: classes3.dex */
public class uh0 extends ydk {

    /* JADX INFO: renamed from: a */
    private m3j f176470a = new m3j();

    /* JADX INFO: renamed from: b */
    private m3j f176471b = new m3j();

    /* JADX INFO: renamed from: c */
    private th0 f176472c;

    public uh0() {
        th0 th0Var = new th0();
        this.f176472c = th0Var;
        this.f176470a.addTarget(th0Var);
        this.f176471b.addTarget(this.f176472c);
        this.f176472c.registerFilterLocation(this.f176470a, 0);
        this.f176472c.registerFilterLocation(this.f176471b, 1);
        this.f176472c.addTarget(this);
        registerInitialFilter(this.f176470a);
        registerInitialFilter(this.f176471b);
        registerTerminalFilter(this.f176472c);
        this.f176472c.m188835Q1(true);
    }
}
