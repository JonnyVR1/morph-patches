package p153l;

import androidx.annotation.FloatRange;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* JADX INFO: loaded from: classes.dex */
public final class dli0 {

    /* JADX INFO: renamed from: e */
    public static final dli0 f89536e;

    /* JADX INFO: renamed from: f */
    public static final dli0 f89537f;

    /* JADX INFO: renamed from: g */
    public static final dli0 f89538g;

    /* JADX INFO: renamed from: h */
    public static final dli0 f89539h;

    /* JADX INFO: renamed from: i */
    public static final dli0 f89540i;

    /* JADX INFO: renamed from: j */
    public static final dli0 f89541j;

    /* JADX INFO: renamed from: a */
    public final float[] f89542a;

    /* JADX INFO: renamed from: b */
    public final float[] f89543b;

    /* JADX INFO: renamed from: c */
    public final float[] f89544c = new float[3];

    /* JADX INFO: renamed from: d */
    public boolean f89545d = true;

    static {
        dli0 dli0Var = new dli0();
        f89536e = dli0Var;
        m116749m(dli0Var);
        m116752p(dli0Var);
        dli0 dli0Var2 = new dli0();
        f89537f = dli0Var2;
        m116751o(dli0Var2);
        m116752p(dli0Var2);
        dli0 dli0Var3 = new dli0();
        f89538g = dli0Var3;
        m116748l(dli0Var3);
        m116752p(dli0Var3);
        dli0 dli0Var4 = new dli0();
        f89539h = dli0Var4;
        m116749m(dli0Var4);
        m116750n(dli0Var4);
        dli0 dli0Var5 = new dli0();
        f89540i = dli0Var5;
        m116751o(dli0Var5);
        m116750n(dli0Var5);
        dli0 dli0Var6 = new dli0();
        f89541j = dli0Var6;
        m116748l(dli0Var6);
        m116750n(dli0Var6);
    }

    public dli0() {
        float[] fArr = new float[3];
        this.f89542a = fArr;
        float[] fArr2 = new float[3];
        this.f89543b = fArr2;
        m116753r(fArr);
        m116753r(fArr2);
        m116765q();
    }

    /* JADX INFO: renamed from: l */
    public static void m116748l(dli0 dli0Var) {
        float[] fArr = dli0Var.f89543b;
        fArr[1] = 0.26f;
        fArr[2] = 0.45f;
    }

    /* JADX INFO: renamed from: m */
    public static void m116749m(dli0 dli0Var) {
        float[] fArr = dli0Var.f89543b;
        fArr[0] = 0.55f;
        fArr[1] = 0.74f;
    }

    /* JADX INFO: renamed from: n */
    public static void m116750n(dli0 dli0Var) {
        float[] fArr = dli0Var.f89542a;
        fArr[1] = 0.3f;
        fArr[2] = 0.4f;
    }

    /* JADX INFO: renamed from: o */
    public static void m116751o(dli0 dli0Var) {
        float[] fArr = dli0Var.f89543b;
        fArr[0] = 0.3f;
        fArr[1] = 0.5f;
        fArr[2] = 0.7f;
    }

    /* JADX INFO: renamed from: p */
    public static void m116752p(dli0 dli0Var) {
        float[] fArr = dli0Var.f89542a;
        fArr[0] = 0.35f;
        fArr[1] = 1.0f;
    }

    /* JADX INFO: renamed from: r */
    public static void m116753r(float[] fArr) {
        fArr[0] = 0.0f;
        fArr[1] = 0.5f;
        fArr[2] = 1.0f;
    }

    /* JADX INFO: renamed from: a */
    public float m116754a() {
        return this.f89544c[1];
    }

    @FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, to = 1.0d)
    /* JADX INFO: renamed from: b */
    public float m116755b() {
        return this.f89543b[2];
    }

    @FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, to = 1.0d)
    /* JADX INFO: renamed from: c */
    public float m116756c() {
        return this.f89542a[2];
    }

    @FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, to = 1.0d)
    /* JADX INFO: renamed from: d */
    public float m116757d() {
        return this.f89543b[0];
    }

    @FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, to = 1.0d)
    /* JADX INFO: renamed from: e */
    public float m116758e() {
        return this.f89542a[0];
    }

    /* JADX INFO: renamed from: f */
    public float m116759f() {
        return this.f89544c[2];
    }

    /* JADX INFO: renamed from: g */
    public float m116760g() {
        return this.f89544c[0];
    }

    @FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, to = 1.0d)
    /* JADX INFO: renamed from: h */
    public float m116761h() {
        return this.f89543b[1];
    }

    @FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, to = 1.0d)
    /* JADX INFO: renamed from: i */
    public float m116762i() {
        return this.f89542a[1];
    }

    /* JADX INFO: renamed from: j */
    public boolean m116763j() {
        return this.f89545d;
    }

    /* JADX INFO: renamed from: k */
    public void m116764k() {
        int length = this.f89544c.length;
        float f = 0.0f;
        for (int i = 0; i < length; i++) {
            float f2 = this.f89544c[i];
            if (f2 > 0.0f) {
                f += f2;
            }
        }
        if (f != 0.0f) {
            int length2 = this.f89544c.length;
            for (int i2 = 0; i2 < length2; i2++) {
                float[] fArr = this.f89544c;
                float f3 = fArr[i2];
                if (f3 > 0.0f) {
                    fArr[i2] = f3 / f;
                }
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m116765q() {
        float[] fArr = this.f89544c;
        fArr[0] = 0.24f;
        fArr[1] = 0.52f;
        fArr[2] = 0.24f;
    }
}
