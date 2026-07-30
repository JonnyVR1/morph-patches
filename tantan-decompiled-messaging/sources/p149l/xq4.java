package p149l;

/* JADX INFO: loaded from: classes7.dex */
public abstract class xq4 {

    /* JADX INFO: renamed from: a */
    private final String f193980a;

    /* JADX INFO: renamed from: b */
    private yq4 f193981b;

    /* JADX INFO: renamed from: c */
    private InterfaceC21198a f193982c;

    /* JADX INFO: renamed from: d */
    private int f193983d = 1;

    /* JADX INFO: renamed from: l.xq4$a */
    public interface InterfaceC21198a {
        /* JADX INFO: renamed from: a */
        void mo111648a(float f, double d, xq4 xq4Var);
    }

    public xq4(String str) {
        this.f193980a = str;
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC21198a m210544a() {
        return this.f193982c;
    }

    /* JADX INFO: renamed from: b */
    public yq4 m210545b() {
        return this.f193981b;
    }

    /* JADX INFO: renamed from: c */
    public int m210546c() {
        return this.f193983d;
    }

    /* JADX INFO: renamed from: d */
    public String m210547d() {
        return this.f193980a;
    }

    /* JADX INFO: renamed from: e */
    public abstract boolean mo98595e(whe wheVar);

    /* JADX INFO: renamed from: f */
    public void m210548f(InterfaceC21198a interfaceC21198a) {
        this.f193982c = interfaceC21198a;
    }

    /* JADX INFO: renamed from: g */
    public void m210549g(yq4 yq4Var) {
        this.f193981b = yq4Var;
    }

    /* JADX INFO: renamed from: h */
    public void m210550h(int i, String str) {
        this.f193981b.m215703e(i, str);
    }

    /* JADX INFO: renamed from: i */
    public void m210551i(int i, Exception exc) {
        this.f193981b.m215702d(i, exc);
    }

    /* JADX INFO: renamed from: j */
    public void m210552j(int i) {
        this.f193983d = i;
    }
}
