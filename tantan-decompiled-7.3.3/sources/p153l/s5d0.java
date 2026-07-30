package p153l;

/* JADX INFO: loaded from: classes7.dex */
public class s5d0 {

    /* JADX INFO: renamed from: a */
    public final float f166353a;

    /* JADX INFO: renamed from: b */
    public final float f166354b;

    public s5d0(float f, float f2) {
        this.f166353a = f;
        this.f166354b = f2;
    }

    /* JADX INFO: renamed from: a */
    public static float m184654a(s5d0 s5d0Var, s5d0 s5d0Var2, s5d0 s5d0Var3) {
        float f = s5d0Var2.f166353a;
        float f2 = s5d0Var2.f166354b;
        return ((s5d0Var3.f166353a - f) * (s5d0Var.f166354b - f2)) - ((s5d0Var3.f166354b - f2) * (s5d0Var.f166353a - f));
    }

    /* JADX INFO: renamed from: b */
    public static float m184655b(s5d0 s5d0Var, s5d0 s5d0Var2) {
        return ihx.m140043a(s5d0Var.f166353a, s5d0Var.f166354b, s5d0Var2.f166353a, s5d0Var2.f166354b);
    }

    /* JADX INFO: renamed from: e */
    public static void m184656e(s5d0[] s5d0VarArr) {
        s5d0 s5d0Var;
        s5d0 s5d0Var2;
        s5d0 s5d0Var3;
        float fM184655b = m184655b(s5d0VarArr[0], s5d0VarArr[1]);
        float fM184655b2 = m184655b(s5d0VarArr[1], s5d0VarArr[2]);
        float fM184655b3 = m184655b(s5d0VarArr[0], s5d0VarArr[2]);
        if (fM184655b2 >= fM184655b && fM184655b2 >= fM184655b3) {
            s5d0Var = s5d0VarArr[0];
            s5d0Var2 = s5d0VarArr[1];
            s5d0Var3 = s5d0VarArr[2];
        } else if (fM184655b3 < fM184655b2 || fM184655b3 < fM184655b) {
            s5d0Var = s5d0VarArr[2];
            s5d0Var2 = s5d0VarArr[0];
            s5d0Var3 = s5d0VarArr[1];
        } else {
            s5d0Var = s5d0VarArr[1];
            s5d0Var2 = s5d0VarArr[0];
            s5d0Var3 = s5d0VarArr[2];
        }
        if (m184654a(s5d0Var2, s5d0Var, s5d0Var3) < 0.0f) {
            s5d0 s5d0Var4 = s5d0Var3;
            s5d0Var3 = s5d0Var2;
            s5d0Var2 = s5d0Var4;
        }
        s5d0VarArr[0] = s5d0Var2;
        s5d0VarArr[1] = s5d0Var;
        s5d0VarArr[2] = s5d0Var3;
    }

    /* JADX INFO: renamed from: c */
    public final float m184657c() {
        return this.f166353a;
    }

    /* JADX INFO: renamed from: d */
    public final float m184658d() {
        return this.f166354b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s5d0) {
            s5d0 s5d0Var = (s5d0) obj;
            if (this.f166353a == s5d0Var.f166353a && this.f166354b == s5d0Var.f166354b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.f166353a) * 31) + Float.floatToIntBits(this.f166354b);
    }

    public final String toString() {
        return "(" + this.f166353a + ',' + this.f166354b + ')';
    }
}
