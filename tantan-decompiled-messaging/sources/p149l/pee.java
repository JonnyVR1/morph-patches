package p149l;

import com.clevertap.android.sdk.Constants;

/* JADX INFO: loaded from: classes13.dex */
public class pee {

    /* JADX INFO: renamed from: a */
    private float f148428a = 0.0f;

    /* JADX INFO: renamed from: b */
    private float f148429b = 0.0f;

    /* JADX INFO: renamed from: c */
    private float f148430c = 0.0f;

    /* JADX INFO: renamed from: a */
    public float m168506a() {
        return this.f148428a;
    }

    /* JADX INFO: renamed from: b */
    public float m168507b(float f) {
        if (xsi0.m210764e(this.f148430c)) {
            return 0.0f;
        }
        return (f - this.f148428a) / this.f148430c;
    }

    /* JADX INFO: renamed from: c */
    public float m168508c() {
        return this.f148429b;
    }

    /* JADX INFO: renamed from: d */
    public boolean m168509d(float f, boolean z) {
        float f2 = this.f148428a;
        if (z) {
            return f >= f2 && f <= this.f148429b;
        }
        return f >= f2 && f < this.f148429b;
    }

    /* JADX INFO: renamed from: e */
    public void m168510e(float f, float f2) {
        this.f148428a = f;
        this.f148429b = f2;
        this.f148430c = f2 - f;
    }

    public String toString() {
        return this.f148428a + Constants.SEPARATOR_COMMA + this.f148429b;
    }
}
