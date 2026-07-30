package p002l;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class hjc0 {

    /* JADX INFO: renamed from: j */
    public static final Object f12067j = new Object();

    /* JADX INFO: renamed from: k */
    public static int f12068k;

    /* JADX INFO: renamed from: l */
    public static hjc0 f12069l;

    /* JADX INFO: renamed from: a */
    public int f12070a;

    /* JADX INFO: renamed from: b */
    public int f12071b;

    /* JADX INFO: renamed from: c */
    public int f12072c;

    /* JADX INFO: renamed from: d */
    public int f12073d;

    /* JADX INFO: renamed from: g */
    public xr2 f12076g;

    /* JADX INFO: renamed from: i */
    public hjc0 f12078i;

    /* JADX INFO: renamed from: e */
    public boolean f12074e = false;

    /* JADX INFO: renamed from: f */
    public int f12075f = -1;

    /* JADX INFO: renamed from: h */
    public int f12077h = 1;

    /* JADX INFO: renamed from: a */
    public static hjc0 m14414a() {
        synchronized (f12067j) {
            try {
                hjc0 hjc0Var = f12069l;
                if (hjc0Var == null) {
                    return new hjc0();
                }
                f12069l = hjc0Var.f12078i;
                f12068k--;
                hjc0Var.f12078i = null;
                return hjc0Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m14415b() {
        synchronized (f12067j) {
            try {
                int i = f12068k;
                if (i < 40) {
                    this.f12078i = f12069l;
                    f12069l = this;
                    f12068k = i + 1;
                    this.f12076g = null;
                    this.f12077h = 1;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
