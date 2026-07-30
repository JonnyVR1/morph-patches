package p149l;

import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;

/* JADX INFO: loaded from: classes3.dex */
public class cse0 {

    /* JADX INFO: renamed from: c */
    public ShapeDrawable f82351c;

    /* JADX INFO: renamed from: d */
    public Paint f82352d;

    /* JADX INFO: renamed from: a */
    public float f82349a = 0.0f;

    /* JADX INFO: renamed from: b */
    public float f82350b = 0.0f;

    /* JADX INFO: renamed from: e */
    public float f82353e = 1.0f;

    public cse0(ShapeDrawable shapeDrawable) {
        this.f82351c = shapeDrawable;
    }

    /* JADX INFO: renamed from: a */
    public ShapeDrawable m108498a() {
        return this.f82351c;
    }

    /* JADX INFO: renamed from: b */
    public float m108499b() {
        return this.f82349a;
    }

    /* JADX INFO: renamed from: c */
    public float m108500c() {
        return this.f82350b;
    }

    /* JADX INFO: renamed from: d */
    public void m108501d(float f, float f2) {
        this.f82351c.getShape().resize(f, f2);
    }

    /* JADX INFO: renamed from: e */
    public void m108502e(Paint paint) {
        this.f82352d = paint;
    }

    /* JADX INFO: renamed from: f */
    public void m108503f(float f) {
        this.f82349a = f;
    }

    /* JADX INFO: renamed from: g */
    public void m108504g(float f) {
        this.f82350b = f;
    }
}
