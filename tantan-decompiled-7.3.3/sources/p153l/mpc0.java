package p153l;

/* JADX INFO: loaded from: classes.dex */
public class mpc0 {

    /* JADX INFO: renamed from: e */
    private static volatile mpc0 f137900e;

    /* JADX INFO: renamed from: a */
    private float f137901a = 0.0f;

    /* JADX INFO: renamed from: b */
    private float f137902b = 0.0f;

    /* JADX INFO: renamed from: c */
    private float f137903c = 0.0f;

    /* JADX INFO: renamed from: d */
    private boolean f137904d = false;

    /* JADX INFO: renamed from: a */
    public static mpc0 m159352a() {
        if (f137900e == null) {
            synchronized (mpc0.class) {
                try {
                    if (f137900e == null) {
                        f137900e = new mpc0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f137900e;
    }

    /* JADX INFO: renamed from: b */
    public void m159353b(float f) {
        this.f137902b = f;
    }

    /* JADX INFO: renamed from: c */
    public void m159354c(boolean z) {
        this.f137904d = z;
    }

    /* JADX INFO: renamed from: d */
    public void m159355d(float f) {
        this.f137903c = f;
    }
}
