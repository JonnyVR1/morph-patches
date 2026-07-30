package p153l;

import android.animation.TimeInterpolator;

/* JADX INFO: loaded from: classes7.dex */
public class ej60 {
    /* JADX INFO: renamed from: a */
    public static dj60 m120975a(float f, float f2, float f3, float f4, float f5, float f6, TimeInterpolator timeInterpolator) {
        dj60 dj60Var = new dj60(f, f2, f3, f4, f5, f6);
        dj60Var.f88788g = 3;
        dj60Var.m116056a(timeInterpolator);
        return dj60Var;
    }

    /* JADX INFO: renamed from: b */
    public static dj60 m120976b(float f, float f2, TimeInterpolator timeInterpolator) {
        dj60 dj60Var = new dj60(0, f, f2);
        dj60Var.f88788g = 1;
        dj60Var.m116056a(timeInterpolator);
        return dj60Var;
    }

    /* JADX INFO: renamed from: c */
    public static dj60 m120977c(float f, float f2, float f3, float f4, TimeInterpolator timeInterpolator) {
        dj60 dj60Var = new dj60(f, f2, f3, f4);
        dj60Var.f88788g = 2;
        dj60Var.m116056a(timeInterpolator);
        return dj60Var;
    }

    /* JADX INFO: renamed from: d */
    public static dj60 m120978d(float f, float f2) {
        dj60 dj60Var = new dj60(0, f, f2);
        dj60Var.f88788g = 0;
        return dj60Var;
    }

    /* JADX INFO: renamed from: e */
    public static dj60 m120979e(float f, float f2, TimeInterpolator timeInterpolator) {
        dj60 dj60VarM120978d = m120978d(f, f2);
        dj60VarM120978d.m116056a(timeInterpolator);
        return dj60VarM120978d;
    }
}
