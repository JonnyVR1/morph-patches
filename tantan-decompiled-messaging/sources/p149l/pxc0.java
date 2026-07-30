package p149l;

/* JADX INFO: loaded from: classes7.dex */
public class pxc0 {

    /* JADX INFO: renamed from: a */
    public final float f151657a;

    /* JADX INFO: renamed from: b */
    public final float f151658b;

    public pxc0(float f, float f2) {
        this.f151657a = f;
        this.f151658b = f2;
    }

    /* JADX INFO: renamed from: a */
    public static float m171828a(pxc0 pxc0Var, pxc0 pxc0Var2, pxc0 pxc0Var3) {
        float f = pxc0Var2.f151657a;
        float f2 = pxc0Var2.f151658b;
        return ((pxc0Var3.f151657a - f) * (pxc0Var.f151658b - f2)) - ((pxc0Var3.f151658b - f2) * (pxc0Var.f151657a - f));
    }

    /* JADX INFO: renamed from: b */
    public static float m171829b(pxc0 pxc0Var, pxc0 pxc0Var2) {
        return jex.m141162a(pxc0Var.f151657a, pxc0Var.f151658b, pxc0Var2.f151657a, pxc0Var2.f151658b);
    }

    /* JADX INFO: renamed from: e */
    public static void m171830e(pxc0[] pxc0VarArr) {
        pxc0 pxc0Var;
        pxc0 pxc0Var2;
        pxc0 pxc0Var3;
        float fM171829b = m171829b(pxc0VarArr[0], pxc0VarArr[1]);
        float fM171829b2 = m171829b(pxc0VarArr[1], pxc0VarArr[2]);
        float fM171829b3 = m171829b(pxc0VarArr[0], pxc0VarArr[2]);
        if (fM171829b2 >= fM171829b && fM171829b2 >= fM171829b3) {
            pxc0Var = pxc0VarArr[0];
            pxc0Var2 = pxc0VarArr[1];
            pxc0Var3 = pxc0VarArr[2];
        } else if (fM171829b3 < fM171829b2 || fM171829b3 < fM171829b) {
            pxc0Var = pxc0VarArr[2];
            pxc0Var2 = pxc0VarArr[0];
            pxc0Var3 = pxc0VarArr[1];
        } else {
            pxc0Var = pxc0VarArr[1];
            pxc0Var2 = pxc0VarArr[0];
            pxc0Var3 = pxc0VarArr[2];
        }
        if (m171828a(pxc0Var2, pxc0Var, pxc0Var3) < 0.0f) {
            pxc0 pxc0Var4 = pxc0Var3;
            pxc0Var3 = pxc0Var2;
            pxc0Var2 = pxc0Var4;
        }
        pxc0VarArr[0] = pxc0Var2;
        pxc0VarArr[1] = pxc0Var;
        pxc0VarArr[2] = pxc0Var3;
    }

    /* JADX INFO: renamed from: c */
    public final float m171831c() {
        return this.f151657a;
    }

    /* JADX INFO: renamed from: d */
    public final float m171832d() {
        return this.f151658b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pxc0) {
            pxc0 pxc0Var = (pxc0) obj;
            if (this.f151657a == pxc0Var.f151657a && this.f151658b == pxc0Var.f151658b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.f151657a) * 31) + Float.floatToIntBits(this.f151658b);
    }

    public final String toString() {
        return "(" + this.f151657a + ',' + this.f151658b + ')';
    }
}
