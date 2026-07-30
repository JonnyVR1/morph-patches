package p149l;

/* JADX INFO: loaded from: classes3.dex */
public class cki {

    /* JADX INFO: renamed from: a */
    private float f81335a;

    /* JADX INFO: renamed from: b */
    private float f81336b;

    /* JADX INFO: renamed from: c */
    private float f81337c;

    /* JADX INFO: renamed from: d */
    private float f81338d;

    public cki(float f, float f2, float f3) {
        this.f81335a = f;
        this.f81336b = f2;
        this.f81337c = f3;
        this.f81338d = f2 - f;
    }

    /* JADX INFO: renamed from: a */
    public float m107413a(float f) {
        float f2 = f / this.f81337c;
        return (this.f81338d * f2 * f2) + this.f81335a;
    }

    /* JADX INFO: renamed from: b */
    public float m107414b(float f) {
        float f2 = f / (this.f81337c / 2.0f);
        float f3 = this.f81338d;
        if (f2 < 1.0f) {
            return ((f3 / 2.0f) * f2 * f2) + this.f81335a;
        }
        float f4 = f2 - 1.0f;
        return (((-f3) / 2.0f) * ((f4 * (f4 - 2.0f)) - 1.0f)) + this.f81335a;
    }

    /* JADX INFO: renamed from: c */
    public void m107415c(float f) {
        this.f81337c = f;
    }
}
