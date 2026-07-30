package p149l;

/* JADX INFO: loaded from: classes7.dex */
public final class ro60 {

    /* JADX INFO: renamed from: a */
    public final float f160356a;

    /* JADX INFO: renamed from: b */
    public final float f160357b;

    /* JADX INFO: renamed from: c */
    public final float f160358c;

    /* JADX INFO: renamed from: d */
    public final float f160359d;

    /* JADX INFO: renamed from: e */
    public final float f160360e;

    /* JADX INFO: renamed from: f */
    public final float f160361f;

    /* JADX INFO: renamed from: g */
    public final float f160362g;

    /* JADX INFO: renamed from: h */
    public final float f160363h;

    /* JADX INFO: renamed from: i */
    public final float f160364i;

    public ro60(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.f160356a = f;
        this.f160357b = f4;
        this.f160358c = f7;
        this.f160359d = f2;
        this.f160360e = f5;
        this.f160361f = f8;
        this.f160362g = f3;
        this.f160363h = f6;
        this.f160364i = f9;
    }

    /* JADX INFO: renamed from: b */
    public static ro60 m180234b(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        return m180236d(f9, f10, f11, f12, f13, f14, f15, f16).m180238e(m180235c(f, f2, f3, f4, f5, f6, f7, f8));
    }

    /* JADX INFO: renamed from: c */
    public static ro60 m180235c(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        return m180236d(f, f2, f3, f4, f5, f6, f7, f8).m180237a();
    }

    /* JADX INFO: renamed from: d */
    public static ro60 m180236d(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        float f9 = ((f - f3) + f5) - f7;
        float f10 = ((f2 - f4) + f6) - f8;
        if (f9 == 0.0f && f10 == 0.0f) {
            return new ro60(f3 - f, f5 - f3, f, f4 - f2, f6 - f4, f2, 0.0f, 0.0f, 1.0f);
        }
        float f11 = f3 - f5;
        float f12 = f7 - f5;
        float f13 = f4 - f6;
        float f14 = f8 - f6;
        float f15 = (f11 * f14) - (f12 * f13);
        float f16 = ((f14 * f9) - (f12 * f10)) / f15;
        float f17 = ((f11 * f10) - (f9 * f13)) / f15;
        return new ro60((f3 - f) + (f16 * f3), (f7 - f) + (f17 * f7), f, (f4 - f2) + (f16 * f4), (f8 - f2) + (f17 * f8), f2, f16, f17, 1.0f);
    }

    /* JADX INFO: renamed from: a */
    public ro60 m180237a() {
        float f = this.f160360e;
        float f2 = this.f160364i;
        float f3 = this.f160361f;
        float f4 = this.f160363h;
        float f5 = (f * f2) - (f3 * f4);
        float f6 = this.f160362g;
        float f7 = this.f160359d;
        float f8 = (f3 * f6) - (f7 * f2);
        float f9 = (f7 * f4) - (f * f6);
        float f10 = this.f160358c;
        float f11 = this.f160357b;
        float f12 = this.f160356a;
        return new ro60(f5, f8, f9, (f10 * f4) - (f11 * f2), (f2 * f12) - (f10 * f6), (f6 * f11) - (f4 * f12), (f11 * f3) - (f10 * f), (f10 * f7) - (f3 * f12), (f12 * f) - (f11 * f7));
    }

    /* JADX INFO: renamed from: e */
    public ro60 m180238e(ro60 ro60Var) {
        float f = this.f160356a;
        float f2 = ro60Var.f160356a;
        float f3 = this.f160359d;
        float f4 = ro60Var.f160357b;
        float f5 = this.f160362g;
        float f6 = ro60Var.f160358c;
        float f7 = (f * f2) + (f3 * f4) + (f5 * f6);
        float f8 = ro60Var.f160359d;
        float f9 = ro60Var.f160360e;
        float f10 = ro60Var.f160361f;
        float f11 = (f * f8) + (f3 * f9) + (f5 * f10);
        float f12 = ro60Var.f160362g;
        float f13 = ro60Var.f160363h;
        float f14 = ro60Var.f160364i;
        float f15 = (f * f12) + (f3 * f13) + (f5 * f14);
        float f16 = this.f160357b;
        float f17 = this.f160360e;
        float f18 = (f16 * f2) + (f17 * f4);
        float f19 = this.f160363h;
        float f20 = f18 + (f19 * f6);
        float f21 = (f16 * f8) + (f17 * f9) + (f19 * f10);
        float f22 = (f16 * f12) + (f17 * f13) + (f19 * f14);
        float f23 = this.f160358c;
        float f24 = f2 * f23;
        float f25 = this.f160361f;
        float f26 = this.f160364i;
        return new ro60(f7, f11, f15, f20, f21, f22, f24 + (f4 * f25) + (f6 * f26), (f23 * f8) + (f9 * f25) + (f10 * f26), (f23 * f12) + (f25 * f13) + (f26 * f14));
    }

    /* JADX INFO: renamed from: f */
    public void m180239f(float[] fArr) {
        int length = fArr.length;
        float f = this.f160356a;
        float f2 = this.f160357b;
        float f3 = this.f160358c;
        float f4 = this.f160359d;
        float f5 = this.f160360e;
        float f6 = this.f160361f;
        float f7 = this.f160362g;
        float f8 = this.f160363h;
        float f9 = this.f160364i;
        for (int i = 0; i < length; i += 2) {
            float f10 = fArr[i];
            int i2 = i + 1;
            float f11 = fArr[i2];
            float f12 = (f3 * f10) + (f6 * f11) + f9;
            fArr[i] = (((f * f10) + (f4 * f11)) + f7) / f12;
            fArr[i2] = (((f10 * f2) + (f11 * f5)) + f8) / f12;
        }
    }
}
