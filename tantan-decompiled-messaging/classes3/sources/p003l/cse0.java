package p003l;

import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class cse0 {

    /* JADX INFO: renamed from: c */
    public ShapeDrawable f2770c;

    /* JADX INFO: renamed from: d */
    public Paint f2771d;

    /* JADX INFO: renamed from: a */
    public float f2768a = 0.0f;

    /* JADX INFO: renamed from: b */
    public float f2769b = 0.0f;

    /* JADX INFO: renamed from: e */
    public float f2772e = 1.0f;

    public cse0(ShapeDrawable shapeDrawable) {
        this.f2770c = shapeDrawable;
    }

    /* JADX INFO: renamed from: a */
    public ShapeDrawable m3417a() {
        return this.f2770c;
    }

    /* JADX INFO: renamed from: b */
    public float m3418b() {
        return this.f2768a;
    }

    /* JADX INFO: renamed from: c */
    public float m3419c() {
        return this.f2769b;
    }

    /* JADX INFO: renamed from: d */
    public void m3420d(float f, float f2) {
        this.f2770c.getShape().resize(f, f2);
    }

    /* JADX INFO: renamed from: e */
    public void m3421e(Paint paint) {
        this.f2771d = paint;
    }

    /* JADX INFO: renamed from: f */
    public void m3422f(float f) {
        this.f2768a = f;
    }

    /* JADX INFO: renamed from: g */
    public void m3423g(float f) {
        this.f2769b = f;
    }
}
