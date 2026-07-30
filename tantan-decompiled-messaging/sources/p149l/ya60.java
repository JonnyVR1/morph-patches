package p149l;

import android.animation.TimeInterpolator;

/* JADX INFO: loaded from: classes7.dex */
public class ya60 {

    /* JADX INFO: renamed from: a */
    public float f197142a;

    /* JADX INFO: renamed from: b */
    public float f197143b;

    /* JADX INFO: renamed from: c */
    public float f197144c;

    /* JADX INFO: renamed from: d */
    public float f197145d;

    /* JADX INFO: renamed from: e */
    public float f197146e;

    /* JADX INFO: renamed from: f */
    public float f197147f;

    /* JADX INFO: renamed from: g */
    public int f197148g;

    /* JADX INFO: renamed from: h */
    public TimeInterpolator f197149h;

    public ya60(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f197142a = f5;
        this.f197143b = f6;
        this.f197144c = f;
        this.f197145d = f2;
        this.f197146e = f3;
        this.f197147f = f4;
        this.f197148g = 3;
    }

    /* JADX INFO: renamed from: a */
    public void m213805a(TimeInterpolator timeInterpolator) {
        this.f197149h = timeInterpolator;
    }

    public String toString() {
        return "PathPoint{x=" + this.f197142a + ", y=" + this.f197143b + ", c0x=" + this.f197144c + ", c0y=" + this.f197145d + ", c1x=" + this.f197146e + ", c1y=" + this.f197147f + ", operation=" + this.f197148g + '}';
    }

    public ya60(float f, float f2, float f3, float f4) {
        this.f197142a = f3;
        this.f197143b = f4;
        this.f197144c = f;
        this.f197145d = f2;
        this.f197148g = 2;
    }

    public ya60(int i, float f, float f2) {
        this.f197142a = f;
        this.f197143b = f2;
        this.f197148g = i;
    }
}
