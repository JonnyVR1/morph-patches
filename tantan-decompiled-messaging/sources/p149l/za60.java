package p149l;

import android.animation.TimeInterpolator;

/* JADX INFO: loaded from: classes7.dex */
public class za60 {
    /* JADX INFO: renamed from: a */
    public static ya60 m217723a(float f, float f2, float f3, float f4, float f5, float f6, TimeInterpolator timeInterpolator) {
        ya60 ya60Var = new ya60(f, f2, f3, f4, f5, f6);
        ya60Var.f197148g = 3;
        ya60Var.m213805a(timeInterpolator);
        return ya60Var;
    }

    /* JADX INFO: renamed from: b */
    public static ya60 m217724b(float f, float f2, TimeInterpolator timeInterpolator) {
        ya60 ya60Var = new ya60(0, f, f2);
        ya60Var.f197148g = 1;
        ya60Var.m213805a(timeInterpolator);
        return ya60Var;
    }

    /* JADX INFO: renamed from: c */
    public static ya60 m217725c(float f, float f2, float f3, float f4, TimeInterpolator timeInterpolator) {
        ya60 ya60Var = new ya60(f, f2, f3, f4);
        ya60Var.f197148g = 2;
        ya60Var.m213805a(timeInterpolator);
        return ya60Var;
    }

    /* JADX INFO: renamed from: d */
    public static ya60 m217726d(float f, float f2) {
        ya60 ya60Var = new ya60(0, f, f2);
        ya60Var.f197148g = 0;
        return ya60Var;
    }

    /* JADX INFO: renamed from: e */
    public static ya60 m217727e(float f, float f2, TimeInterpolator timeInterpolator) {
        ya60 ya60VarM217726d = m217726d(f, f2);
        ya60VarM217726d.m213805a(timeInterpolator);
        return ya60VarM217726d;
    }
}
