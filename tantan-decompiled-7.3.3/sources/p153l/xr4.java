package p153l;

/* JADX INFO: loaded from: classes7.dex */
public class xr4 {

    /* JADX INFO: renamed from: a */
    private boolean f195883a;

    /* JADX INFO: renamed from: b */
    private String f195884b;

    /* JADX INFO: renamed from: c */
    private Throwable f195885c;

    /* JADX INFO: renamed from: d */
    private int f195886d;

    /* JADX INFO: renamed from: e */
    private int f195887e;

    /* JADX INFO: renamed from: a */
    public String m212774a() {
        return this.f195884b;
    }

    /* JADX INFO: renamed from: b */
    public int m212775b() {
        return this.f195886d;
    }

    /* JADX INFO: renamed from: c */
    public boolean m212776c() {
        return this.f195883a;
    }

    /* JADX INFO: renamed from: d */
    public void m212777d(int i, Throwable th) {
        this.f195885c = th;
    }

    /* JADX INFO: renamed from: e */
    public void m212778e(int i, String str) {
        this.f195886d = i;
        this.f195884b = str;
    }

    /* JADX INFO: renamed from: f */
    public void m212779f(boolean z) {
        this.f195883a = z;
    }

    /* JADX INFO: renamed from: g */
    public void m212780g(int i) {
        this.f195887e = i;
    }

    public String toString() {
        return "ChainModel{isFailed=" + this.f195883a + ", errorMsg='" + this.f195884b + "', e=" + this.f195885c + ", errorType=" + this.f195886d + ", income=" + this.f195887e + '}';
    }
}
