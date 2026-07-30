package p149l;

import android.graphics.Rect;

/* JADX INFO: loaded from: classes13.dex */
public class gp0 {

    /* JADX INFO: renamed from: a */
    public double f103749a;

    /* JADX INFO: renamed from: b */
    public double f103750b;

    /* JADX INFO: renamed from: c */
    public double f103751c;

    /* JADX INFO: renamed from: d */
    public double f103752d;

    /* JADX INFO: renamed from: a */
    public static gp0 m127322a(Rect rect) {
        gp0 gp0Var = new gp0();
        gp0Var.f103749a = rect.centerX();
        gp0Var.f103750b = rect.centerY();
        gp0Var.f103751c = rect.width();
        gp0Var.f103752d = rect.height();
        return gp0Var;
    }

    /* JADX INFO: renamed from: b */
    public double m127323b() {
        return this.f103752d;
    }

    /* JADX INFO: renamed from: c */
    public double m127324c() {
        return this.f103751c;
    }
}
