package p153l;

/* JADX INFO: loaded from: classes3.dex */
public class qh0 extends ogk {

    /* JADX INFO: renamed from: a */
    private h6j f157498a = new h6j();

    /* JADX INFO: renamed from: b */
    private h6j f157499b = new h6j();

    /* JADX INFO: renamed from: c */
    private ph0 f157500c;

    public qh0() {
        ph0 ph0Var = new ph0();
        this.f157500c = ph0Var;
        this.f157498a.addTarget(ph0Var);
        this.f157499b.addTarget(this.f157500c);
        this.f157500c.registerFilterLocation(this.f157498a, 0);
        this.f157500c.registerFilterLocation(this.f157499b, 1);
        this.f157500c.addTarget(this);
        registerInitialFilter(this.f157498a);
        registerInitialFilter(this.f157499b);
        registerTerminalFilter(this.f157500c);
        this.f157500c.m172315Q1(true);
    }
}
