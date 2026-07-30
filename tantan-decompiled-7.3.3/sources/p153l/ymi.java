package p153l;

/* JADX INFO: loaded from: classes3.dex */
public class ymi {

    /* JADX INFO: renamed from: a */
    private float f200667a;

    /* JADX INFO: renamed from: b */
    private float f200668b;

    /* JADX INFO: renamed from: c */
    private float f200669c;

    /* JADX INFO: renamed from: d */
    private float f200670d;

    public ymi(float f, float f2, float f3) {
        this.f200667a = f;
        this.f200668b = f2;
        this.f200669c = f3;
        this.f200670d = f2 - f;
    }

    /* JADX INFO: renamed from: a */
    public float m216693a(float f) {
        float f2 = f / this.f200669c;
        return (this.f200670d * f2 * f2) + this.f200667a;
    }

    /* JADX INFO: renamed from: b */
    public float m216694b(float f) {
        float f2 = f / (this.f200669c / 2.0f);
        float f3 = this.f200670d;
        if (f2 < 1.0f) {
            return ((f3 / 2.0f) * f2 * f2) + this.f200667a;
        }
        float f4 = f2 - 1.0f;
        return (((-f3) / 2.0f) * ((f4 * (f4 - 2.0f)) - 1.0f)) + this.f200667a;
    }

    /* JADX INFO: renamed from: c */
    public void m216695c(float f) {
        this.f200669c = f;
    }
}
