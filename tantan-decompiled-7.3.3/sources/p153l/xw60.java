package p153l;

/* JADX INFO: loaded from: classes7.dex */
public final class xw60 {

    /* JADX INFO: renamed from: a */
    public final float f196460a;

    /* JADX INFO: renamed from: b */
    public final float f196461b;

    /* JADX INFO: renamed from: c */
    public final float f196462c;

    /* JADX INFO: renamed from: d */
    public final float f196463d;

    /* JADX INFO: renamed from: e */
    public final float f196464e;

    /* JADX INFO: renamed from: f */
    public final float f196465f;

    /* JADX INFO: renamed from: g */
    public final float f196466g;

    /* JADX INFO: renamed from: h */
    public final float f196467h;

    /* JADX INFO: renamed from: i */
    public final float f196468i;

    public xw60(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.f196460a = f;
        this.f196461b = f4;
        this.f196462c = f7;
        this.f196463d = f2;
        this.f196464e = f5;
        this.f196465f = f8;
        this.f196466g = f3;
        this.f196467h = f6;
        this.f196468i = f9;
    }

    /* JADX INFO: renamed from: b */
    public static xw60 m213293b(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        return m213295d(f9, f10, f11, f12, f13, f14, f15, f16).m213297e(m213294c(f, f2, f3, f4, f5, f6, f7, f8));
    }

    /* JADX INFO: renamed from: c */
    public static xw60 m213294c(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        return m213295d(f, f2, f3, f4, f5, f6, f7, f8).m213296a();
    }

    /* JADX INFO: renamed from: d */
    public static xw60 m213295d(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        float f9 = ((f - f3) + f5) - f7;
        float f10 = ((f2 - f4) + f6) - f8;
        if (f9 == 0.0f && f10 == 0.0f) {
            return new xw60(f3 - f, f5 - f3, f, f4 - f2, f6 - f4, f2, 0.0f, 0.0f, 1.0f);
        }
        float f11 = f3 - f5;
        float f12 = f7 - f5;
        float f13 = f4 - f6;
        float f14 = f8 - f6;
        float f15 = (f11 * f14) - (f12 * f13);
        float f16 = ((f14 * f9) - (f12 * f10)) / f15;
        float f17 = ((f11 * f10) - (f9 * f13)) / f15;
        return new xw60((f3 - f) + (f16 * f3), (f7 - f) + (f17 * f7), f, (f4 - f2) + (f16 * f4), (f8 - f2) + (f17 * f8), f2, f16, f17, 1.0f);
    }

    /* JADX INFO: renamed from: a */
    public xw60 m213296a() {
        float f = this.f196464e;
        float f2 = this.f196468i;
        float f3 = this.f196465f;
        float f4 = this.f196467h;
        float f5 = (f * f2) - (f3 * f4);
        float f6 = this.f196466g;
        float f7 = this.f196463d;
        float f8 = (f3 * f6) - (f7 * f2);
        float f9 = (f7 * f4) - (f * f6);
        float f10 = this.f196462c;
        float f11 = this.f196461b;
        float f12 = this.f196460a;
        return new xw60(f5, f8, f9, (f10 * f4) - (f11 * f2), (f2 * f12) - (f10 * f6), (f6 * f11) - (f4 * f12), (f11 * f3) - (f10 * f), (f10 * f7) - (f3 * f12), (f12 * f) - (f11 * f7));
    }

    /* JADX INFO: renamed from: e */
    public xw60 m213297e(xw60 xw60Var) {
        float f = this.f196460a;
        float f2 = xw60Var.f196460a;
        float f3 = this.f196463d;
        float f4 = xw60Var.f196461b;
        float f5 = this.f196466g;
        float f6 = xw60Var.f196462c;
        float f7 = (f * f2) + (f3 * f4) + (f5 * f6);
        float f8 = xw60Var.f196463d;
        float f9 = xw60Var.f196464e;
        float f10 = xw60Var.f196465f;
        float f11 = (f * f8) + (f3 * f9) + (f5 * f10);
        float f12 = xw60Var.f196466g;
        float f13 = xw60Var.f196467h;
        float f14 = xw60Var.f196468i;
        float f15 = (f * f12) + (f3 * f13) + (f5 * f14);
        float f16 = this.f196461b;
        float f17 = this.f196464e;
        float f18 = (f16 * f2) + (f17 * f4);
        float f19 = this.f196467h;
        float f20 = f18 + (f19 * f6);
        float f21 = (f16 * f8) + (f17 * f9) + (f19 * f10);
        float f22 = (f16 * f12) + (f17 * f13) + (f19 * f14);
        float f23 = this.f196462c;
        float f24 = f2 * f23;
        float f25 = this.f196465f;
        float f26 = this.f196468i;
        return new xw60(f7, f11, f15, f20, f21, f22, f24 + (f4 * f25) + (f6 * f26), (f23 * f8) + (f9 * f25) + (f10 * f26), (f23 * f12) + (f25 * f13) + (f26 * f14));
    }

    /* JADX INFO: renamed from: f */
    public void m213298f(float[] fArr) {
        int length = fArr.length;
        float f = this.f196460a;
        float f2 = this.f196461b;
        float f3 = this.f196462c;
        float f4 = this.f196463d;
        float f5 = this.f196464e;
        float f6 = this.f196465f;
        float f7 = this.f196466g;
        float f8 = this.f196467h;
        float f9 = this.f196468i;
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
