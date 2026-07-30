package p149l;

/* JADX INFO: loaded from: classes4.dex */
public class eqq {

    /* JADX INFO: renamed from: i */
    public static final Object f92822i = new Object();

    /* JADX INFO: renamed from: j */
    public static int f92823j;

    /* JADX INFO: renamed from: k */
    public static eqq f92824k;

    /* JADX INFO: renamed from: b */
    public int f92826b;

    /* JADX INFO: renamed from: e */
    public long f92829e;

    /* JADX INFO: renamed from: f */
    public int f92830f;

    /* JADX INFO: renamed from: h */
    public eqq f92832h;

    /* JADX INFO: renamed from: a */
    public int f92825a = -1;

    /* JADX INFO: renamed from: c */
    public boolean f92827c = false;

    /* JADX INFO: renamed from: d */
    public boolean f92828d = false;

    /* JADX INFO: renamed from: g */
    public boolean f92831g = false;

    /* JADX INFO: renamed from: a */
    public static eqq m117753a() {
        synchronized (f92822i) {
            try {
                eqq eqqVar = f92824k;
                if (eqqVar == null) {
                    return new eqq();
                }
                f92824k = eqqVar.f92832h;
                f92823j--;
                eqqVar.f92832h = null;
                return eqqVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public eqq m117754b(boolean z) {
        this.f92827c = z;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public eqq m117755c(boolean z) {
        this.f92828d = z;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public eqq m117756d(long j) {
        this.f92829e = j;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public eqq m117757e(boolean z) {
        this.f92831g = z;
        return this;
    }

    /* JADX INFO: renamed from: f */
    public eqq m117758f(int i) {
        this.f92825a = i;
        return this;
    }

    /* JADX INFO: renamed from: g */
    public eqq m117759g(int i) {
        this.f92830f = i;
        return this;
    }

    /* JADX INFO: renamed from: h */
    public eqq m117760h(int i) {
        this.f92826b = i;
        return this;
    }

    public String toString() {
        return "jumpInfo" + this.f92825a + "." + this.f92826b + "." + this.f92827c + "." + this.f92828d + "." + this.f92829e + "." + this.f92830f + "." + this.f92831g;
    }
}
