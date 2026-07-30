package p153l;

import android.animation.TypeEvaluator;

/* JADX INFO: loaded from: classes7.dex */
public class yi60 implements TypeEvaluator<dj60> {

    /* JADX INFO: renamed from: a */
    dj60 f200019a;

    @Override // android.animation.TypeEvaluator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public dj60 evaluate(float f, dj60 dj60Var, dj60 dj60Var2) {
        float f2;
        float f3;
        dj60 dj60Var3 = this.f200019a;
        if (dj60Var3 == null || !dj60Var3.equals(dj60Var)) {
            this.f200019a = dj60Var;
        }
        float f4 = 1.0f - f;
        int i = dj60Var2.f88788g;
        if (i == 3) {
            f2 = (dj60Var.f88782a * f4 * f4 * f4) + (dj60Var2.f88784c * 3.0f * f * f4 * f4) + (dj60Var2.f88786e * 3.0f * f * f * f4) + (dj60Var2.f88782a * f * f * f);
            f3 = (dj60Var.f88783b * f4 * f4 * f4) + (dj60Var2.f88785d * 3.0f * f * f4 * f4) + (dj60Var2.f88787f * 3.0f * f * f * f4) + (dj60Var2.f88783b * f * f * f);
        } else if (i == 2) {
            float f5 = f4 * f4;
            float f6 = 2.0f * f * f4;
            float f7 = f * f;
            float f8 = (dj60Var2.f88782a * f7) + (dj60Var.f88782a * f5) + (dj60Var2.f88784c * f6);
            f3 = (f5 * dj60Var.f88783b) + (f6 * dj60Var2.f88785d) + (f7 * dj60Var2.f88783b);
            f2 = f8;
        } else if (i == 1) {
            float f9 = dj60Var.f88782a;
            f2 = ((dj60Var2.f88782a - f9) * f) + f9;
            float f10 = dj60Var.f88783b;
            f3 = f10 + (f * (dj60Var2.f88783b - f10));
        } else {
            f2 = dj60Var2.f88782a;
            f3 = dj60Var2.f88783b;
        }
        return ej60.m120978d(f2, f3);
    }
}
