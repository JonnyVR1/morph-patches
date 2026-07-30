package p153l;

import android.animation.TimeInterpolator;

/* JADX INFO: loaded from: classes7.dex */
public class dj60 {

    /* JADX INFO: renamed from: a */
    public float f88782a;

    /* JADX INFO: renamed from: b */
    public float f88783b;

    /* JADX INFO: renamed from: c */
    public float f88784c;

    /* JADX INFO: renamed from: d */
    public float f88785d;

    /* JADX INFO: renamed from: e */
    public float f88786e;

    /* JADX INFO: renamed from: f */
    public float f88787f;

    /* JADX INFO: renamed from: g */
    public int f88788g;

    /* JADX INFO: renamed from: h */
    public TimeInterpolator f88789h;

    public dj60(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f88782a = f5;
        this.f88783b = f6;
        this.f88784c = f;
        this.f88785d = f2;
        this.f88786e = f3;
        this.f88787f = f4;
        this.f88788g = 3;
    }

    /* JADX INFO: renamed from: a */
    public void m116056a(TimeInterpolator timeInterpolator) {
        this.f88789h = timeInterpolator;
    }

    public String toString() {
        return "PathPoint{x=" + this.f88782a + ", y=" + this.f88783b + ", c0x=" + this.f88784c + ", c0y=" + this.f88785d + ", c1x=" + this.f88786e + ", c1y=" + this.f88787f + ", operation=" + this.f88788g + '}';
    }

    public dj60(float f, float f2, float f3, float f4) {
        this.f88782a = f3;
        this.f88783b = f4;
        this.f88784c = f;
        this.f88785d = f2;
        this.f88788g = 2;
    }

    public dj60(int i, float f, float f2) {
        this.f88782a = f;
        this.f88783b = f2;
        this.f88788g = i;
    }
}
