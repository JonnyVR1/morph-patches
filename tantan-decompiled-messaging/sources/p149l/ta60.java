package p149l;

import android.animation.TypeEvaluator;

/* JADX INFO: loaded from: classes7.dex */
public class ta60 implements TypeEvaluator<ya60> {

    /* JADX INFO: renamed from: a */
    ya60 f169098a;

    @Override // android.animation.TypeEvaluator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ya60 evaluate(float f, ya60 ya60Var, ya60 ya60Var2) {
        float f2;
        float f3;
        ya60 ya60Var3 = this.f169098a;
        if (ya60Var3 == null || !ya60Var3.equals(ya60Var)) {
            this.f169098a = ya60Var;
        }
        float f4 = 1.0f - f;
        int i = ya60Var2.f197148g;
        if (i == 3) {
            f2 = (ya60Var.f197142a * f4 * f4 * f4) + (ya60Var2.f197144c * 3.0f * f * f4 * f4) + (ya60Var2.f197146e * 3.0f * f * f * f4) + (ya60Var2.f197142a * f * f * f);
            f3 = (ya60Var.f197143b * f4 * f4 * f4) + (ya60Var2.f197145d * 3.0f * f * f4 * f4) + (ya60Var2.f197147f * 3.0f * f * f * f4) + (ya60Var2.f197143b * f * f * f);
        } else if (i == 2) {
            float f5 = f4 * f4;
            float f6 = 2.0f * f * f4;
            float f7 = f * f;
            float f8 = (ya60Var2.f197142a * f7) + (ya60Var.f197142a * f5) + (ya60Var2.f197144c * f6);
            f3 = (f5 * ya60Var.f197143b) + (f6 * ya60Var2.f197145d) + (f7 * ya60Var2.f197143b);
            f2 = f8;
        } else if (i == 1) {
            float f9 = ya60Var.f197142a;
            f2 = ((ya60Var2.f197142a - f9) * f) + f9;
            float f10 = ya60Var.f197143b;
            f3 = f10 + (f * (ya60Var2.f197143b - f10));
        } else {
            f2 = ya60Var2.f197142a;
            f3 = ya60Var2.f197143b;
        }
        return za60.m217726d(f2, f3);
    }
}
