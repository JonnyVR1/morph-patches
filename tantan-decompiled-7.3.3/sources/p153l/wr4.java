package p153l;

/* JADX INFO: loaded from: classes7.dex */
public abstract class wr4 {

    /* JADX INFO: renamed from: a */
    private final String f190467a;

    /* JADX INFO: renamed from: b */
    private xr4 f190468b;

    /* JADX INFO: renamed from: c */
    private InterfaceC21169a f190469c;

    /* JADX INFO: renamed from: d */
    private int f190470d = 1;

    /* JADX INFO: renamed from: l.wr4$a */
    public interface InterfaceC21169a {
        /* JADX INFO: renamed from: a */
        void mo150627a(float f, double d, wr4 wr4Var);
    }

    public wr4(String str) {
        this.f190467a = str;
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC21169a m207543a() {
        return this.f190469c;
    }

    /* JADX INFO: renamed from: b */
    public xr4 m207544b() {
        return this.f190468b;
    }

    /* JADX INFO: renamed from: c */
    public int m207545c() {
        return this.f190470d;
    }

    /* JADX INFO: renamed from: d */
    public String m207546d() {
        return this.f190467a;
    }

    /* JADX INFO: renamed from: e */
    public abstract boolean mo100400e(aje ajeVar);

    /* JADX INFO: renamed from: f */
    public void m207547f(InterfaceC21169a interfaceC21169a) {
        this.f190469c = interfaceC21169a;
    }

    /* JADX INFO: renamed from: g */
    public void m207548g(xr4 xr4Var) {
        this.f190468b = xr4Var;
    }

    /* JADX INFO: renamed from: h */
    public void m207549h(int i, String str) {
        this.f190468b.m212778e(i, str);
    }

    /* JADX INFO: renamed from: i */
    public void m207550i(int i, Exception exc) {
        this.f190468b.m212777d(i, exc);
    }

    /* JADX INFO: renamed from: j */
    public void m207551j(int i) {
        this.f190470d = i;
    }
}
