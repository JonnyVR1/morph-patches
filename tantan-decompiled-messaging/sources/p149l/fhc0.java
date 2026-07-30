package p149l;

/* JADX INFO: loaded from: classes.dex */
public class fhc0 {

    /* JADX INFO: renamed from: e */
    private static volatile fhc0 f97493e;

    /* JADX INFO: renamed from: a */
    private float f97494a = 0.0f;

    /* JADX INFO: renamed from: b */
    private float f97495b = 0.0f;

    /* JADX INFO: renamed from: c */
    private float f97496c = 0.0f;

    /* JADX INFO: renamed from: d */
    private boolean f97497d = false;

    /* JADX INFO: renamed from: a */
    public static fhc0 m121349a() {
        if (f97493e == null) {
            synchronized (fhc0.class) {
                try {
                    if (f97493e == null) {
                        f97493e = new fhc0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f97493e;
    }

    /* JADX INFO: renamed from: b */
    public void m121350b(float f) {
        this.f97495b = f;
    }

    /* JADX INFO: renamed from: c */
    public void m121351c(boolean z) {
        this.f97497d = z;
    }

    /* JADX INFO: renamed from: d */
    public void m121352d(float f) {
        this.f97496c = f;
    }
}
