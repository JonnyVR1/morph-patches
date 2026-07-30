package p003l;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class cki {

    /* JADX INFO: renamed from: a */
    private float f2718a;

    /* JADX INFO: renamed from: b */
    private float f2719b;

    /* JADX INFO: renamed from: c */
    private float f2720c;

    /* JADX INFO: renamed from: d */
    private float f2721d;

    public cki(float f, float f2, float f3) {
        this.f2718a = f;
        this.f2719b = f2;
        this.f2720c = f3;
        this.f2721d = f2 - f;
    }

    /* JADX INFO: renamed from: a */
    public float m3374a(float f) {
        float f2 = f / this.f2720c;
        return (this.f2721d * f2 * f2) + this.f2718a;
    }

    /* JADX INFO: renamed from: b */
    public float m3375b(float f) {
        float f2 = f / (this.f2720c / 2.0f);
        float f3 = this.f2721d;
        if (f2 < 1.0f) {
            return ((f3 / 2.0f) * f2 * f2) + this.f2718a;
        }
        float f4 = f2 - 1.0f;
        return (((-f3) / 2.0f) * ((f4 * (f4 - 2.0f)) - 1.0f)) + this.f2718a;
    }

    /* JADX INFO: renamed from: c */
    public void m3376c(float f) {
        this.f2720c = f;
    }
}
