package p149l;

/* JADX INFO: loaded from: classes7.dex */
public class yq4 {

    /* JADX INFO: renamed from: a */
    private boolean f199519a;

    /* JADX INFO: renamed from: b */
    private String f199520b;

    /* JADX INFO: renamed from: c */
    private Throwable f199521c;

    /* JADX INFO: renamed from: d */
    private int f199522d;

    /* JADX INFO: renamed from: e */
    private int f199523e;

    /* JADX INFO: renamed from: a */
    public String m215699a() {
        return this.f199520b;
    }

    /* JADX INFO: renamed from: b */
    public int m215700b() {
        return this.f199522d;
    }

    /* JADX INFO: renamed from: c */
    public boolean m215701c() {
        return this.f199519a;
    }

    /* JADX INFO: renamed from: d */
    public void m215702d(int i, Throwable th) {
        this.f199521c = th;
    }

    /* JADX INFO: renamed from: e */
    public void m215703e(int i, String str) {
        this.f199522d = i;
        this.f199520b = str;
    }

    /* JADX INFO: renamed from: f */
    public void m215704f(boolean z) {
        this.f199519a = z;
    }

    /* JADX INFO: renamed from: g */
    public void m215705g(int i) {
        this.f199523e = i;
    }

    public String toString() {
        return "ChainModel{isFailed=" + this.f199519a + ", errorMsg='" + this.f199520b + "', e=" + this.f199521c + ", errorType=" + this.f199522d + ", income=" + this.f199523e + '}';
    }
}
