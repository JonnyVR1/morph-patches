package p149l;

/* JADX INFO: loaded from: classes4.dex */
public class hjc0 {

    /* JADX INFO: renamed from: j */
    public static final Object f108057j = new Object();

    /* JADX INFO: renamed from: k */
    public static int f108058k;

    /* JADX INFO: renamed from: l */
    public static hjc0 f108059l;

    /* JADX INFO: renamed from: a */
    public int f108060a;

    /* JADX INFO: renamed from: b */
    public int f108061b;

    /* JADX INFO: renamed from: c */
    public int f108062c;

    /* JADX INFO: renamed from: d */
    public int f108063d;

    /* JADX INFO: renamed from: g */
    public xr2 f108066g;

    /* JADX INFO: renamed from: i */
    public hjc0 f108068i;

    /* JADX INFO: renamed from: e */
    public boolean f108064e = false;

    /* JADX INFO: renamed from: f */
    public int f108065f = -1;

    /* JADX INFO: renamed from: h */
    public int f108067h = 1;

    /* JADX INFO: renamed from: a */
    public static hjc0 m131366a() {
        synchronized (f108057j) {
            try {
                hjc0 hjc0Var = f108059l;
                if (hjc0Var == null) {
                    return new hjc0();
                }
                f108059l = hjc0Var.f108068i;
                f108058k--;
                hjc0Var.f108068i = null;
                return hjc0Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m131367b() {
        synchronized (f108057j) {
            try {
                int i = f108058k;
                if (i < 40) {
                    this.f108068i = f108059l;
                    f108059l = this;
                    f108058k = i + 1;
                    this.f108066g = null;
                    this.f108067h = 1;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
