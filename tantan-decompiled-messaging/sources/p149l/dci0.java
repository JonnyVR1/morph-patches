package p149l;

import androidx.annotation.FloatRange;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* JADX INFO: loaded from: classes.dex */
public final class dci0 {

    /* JADX INFO: renamed from: e */
    public static final dci0 f85405e;

    /* JADX INFO: renamed from: f */
    public static final dci0 f85406f;

    /* JADX INFO: renamed from: g */
    public static final dci0 f85407g;

    /* JADX INFO: renamed from: h */
    public static final dci0 f85408h;

    /* JADX INFO: renamed from: i */
    public static final dci0 f85409i;

    /* JADX INFO: renamed from: j */
    public static final dci0 f85410j;

    /* JADX INFO: renamed from: a */
    public final float[] f85411a;

    /* JADX INFO: renamed from: b */
    public final float[] f85412b;

    /* JADX INFO: renamed from: c */
    public final float[] f85413c = new float[3];

    /* JADX INFO: renamed from: d */
    public boolean f85414d = true;

    static {
        dci0 dci0Var = new dci0();
        f85405e = dci0Var;
        m110675m(dci0Var);
        m110678p(dci0Var);
        dci0 dci0Var2 = new dci0();
        f85406f = dci0Var2;
        m110677o(dci0Var2);
        m110678p(dci0Var2);
        dci0 dci0Var3 = new dci0();
        f85407g = dci0Var3;
        m110674l(dci0Var3);
        m110678p(dci0Var3);
        dci0 dci0Var4 = new dci0();
        f85408h = dci0Var4;
        m110675m(dci0Var4);
        m110676n(dci0Var4);
        dci0 dci0Var5 = new dci0();
        f85409i = dci0Var5;
        m110677o(dci0Var5);
        m110676n(dci0Var5);
        dci0 dci0Var6 = new dci0();
        f85410j = dci0Var6;
        m110674l(dci0Var6);
        m110676n(dci0Var6);
    }

    public dci0() {
        float[] fArr = new float[3];
        this.f85411a = fArr;
        float[] fArr2 = new float[3];
        this.f85412b = fArr2;
        m110679r(fArr);
        m110679r(fArr2);
        m110691q();
    }

    /* JADX INFO: renamed from: l */
    public static void m110674l(dci0 dci0Var) {
        float[] fArr = dci0Var.f85412b;
        fArr[1] = 0.26f;
        fArr[2] = 0.45f;
    }

    /* JADX INFO: renamed from: m */
    public static void m110675m(dci0 dci0Var) {
        float[] fArr = dci0Var.f85412b;
        fArr[0] = 0.55f;
        fArr[1] = 0.74f;
    }

    /* JADX INFO: renamed from: n */
    public static void m110676n(dci0 dci0Var) {
        float[] fArr = dci0Var.f85411a;
        fArr[1] = 0.3f;
        fArr[2] = 0.4f;
    }

    /* JADX INFO: renamed from: o */
    public static void m110677o(dci0 dci0Var) {
        float[] fArr = dci0Var.f85412b;
        fArr[0] = 0.3f;
        fArr[1] = 0.5f;
        fArr[2] = 0.7f;
    }

    /* JADX INFO: renamed from: p */
    public static void m110678p(dci0 dci0Var) {
        float[] fArr = dci0Var.f85411a;
        fArr[0] = 0.35f;
        fArr[1] = 1.0f;
    }

    /* JADX INFO: renamed from: r */
    public static void m110679r(float[] fArr) {
        fArr[0] = 0.0f;
        fArr[1] = 0.5f;
        fArr[2] = 1.0f;
    }

    /* JADX INFO: renamed from: a */
    public float m110680a() {
        return this.f85413c[1];
    }

    @FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, to = 1.0d)
    /* JADX INFO: renamed from: b */
    public float m110681b() {
        return this.f85412b[2];
    }

    @FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, to = 1.0d)
    /* JADX INFO: renamed from: c */
    public float m110682c() {
        return this.f85411a[2];
    }

    @FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, to = 1.0d)
    /* JADX INFO: renamed from: d */
    public float m110683d() {
        return this.f85412b[0];
    }

    @FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, to = 1.0d)
    /* JADX INFO: renamed from: e */
    public float m110684e() {
        return this.f85411a[0];
    }

    /* JADX INFO: renamed from: f */
    public float m110685f() {
        return this.f85413c[2];
    }

    /* JADX INFO: renamed from: g */
    public float m110686g() {
        return this.f85413c[0];
    }

    @FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, to = 1.0d)
    /* JADX INFO: renamed from: h */
    public float m110687h() {
        return this.f85412b[1];
    }

    @FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, to = 1.0d)
    /* JADX INFO: renamed from: i */
    public float m110688i() {
        return this.f85411a[1];
    }

    /* JADX INFO: renamed from: j */
    public boolean m110689j() {
        return this.f85414d;
    }

    /* JADX INFO: renamed from: k */
    public void m110690k() {
        int length = this.f85413c.length;
        float f = 0.0f;
        for (int i = 0; i < length; i++) {
            float f2 = this.f85413c[i];
            if (f2 > 0.0f) {
                f += f2;
            }
        }
        if (f != 0.0f) {
            int length2 = this.f85413c.length;
            for (int i2 = 0; i2 < length2; i2++) {
                float[] fArr = this.f85413c;
                float f3 = fArr[i2];
                if (f3 > 0.0f) {
                    fArr[i2] = f3 / f;
                }
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m110691q() {
        float[] fArr = this.f85413c;
        fArr[0] = 0.24f;
        fArr[1] = 0.52f;
        fArr[2] = 0.24f;
    }
}
