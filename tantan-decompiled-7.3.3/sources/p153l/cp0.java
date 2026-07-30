package p153l;

import android.graphics.Rect;

/* JADX INFO: loaded from: classes13.dex */
public class cp0 {

    /* JADX INFO: renamed from: a */
    public double f82948a;

    /* JADX INFO: renamed from: b */
    public double f82949b;

    /* JADX INFO: renamed from: c */
    public double f82950c;

    /* JADX INFO: renamed from: d */
    public double f82951d;

    /* JADX INFO: renamed from: a */
    public static cp0 m111726a(Rect rect) {
        cp0 cp0Var = new cp0();
        cp0Var.f82948a = rect.centerX();
        cp0Var.f82949b = rect.centerY();
        cp0Var.f82950c = rect.width();
        cp0Var.f82951d = rect.height();
        return cp0Var;
    }

    /* JADX INFO: renamed from: b */
    public double m111727b() {
        return this.f82951d;
    }

    /* JADX INFO: renamed from: c */
    public double m111728c() {
        return this.f82950c;
    }
}
