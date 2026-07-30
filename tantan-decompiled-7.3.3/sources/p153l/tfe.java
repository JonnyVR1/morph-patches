package p153l;

import com.clevertap.android.sdk.Constants;

/* JADX INFO: loaded from: classes11.dex */
public class tfe {

    /* JADX INFO: renamed from: a */
    private float f173948a = 0.0f;

    /* JADX INFO: renamed from: b */
    private float f173949b = 0.0f;

    /* JADX INFO: renamed from: c */
    private float f173950c = 0.0f;

    /* JADX INFO: renamed from: a */
    public float m190927a() {
        return this.f173948a;
    }

    /* JADX INFO: renamed from: b */
    public float m190928b(float f) {
        if (a2j0.m95702e(this.f173950c)) {
            return 0.0f;
        }
        return (f - this.f173948a) / this.f173950c;
    }

    /* JADX INFO: renamed from: c */
    public float m190929c() {
        return this.f173949b;
    }

    /* JADX INFO: renamed from: d */
    public boolean m190930d(float f, boolean z) {
        float f2 = this.f173948a;
        if (z) {
            return f >= f2 && f <= this.f173949b;
        }
        return f >= f2 && f < this.f173949b;
    }

    /* JADX INFO: renamed from: e */
    public void m190931e(float f, float f2) {
        this.f173948a = f;
        this.f173949b = f2;
        this.f173950c = f2 - f;
    }

    public String toString() {
        return this.f173948a + Constants.SEPARATOR_COMMA + this.f173949b;
    }
}
