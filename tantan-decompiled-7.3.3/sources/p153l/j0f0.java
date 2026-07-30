package p153l;

import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;

/* JADX INFO: loaded from: classes3.dex */
public class j0f0 {

    /* JADX INFO: renamed from: c */
    public ShapeDrawable f117818c;

    /* JADX INFO: renamed from: d */
    public Paint f117819d;

    /* JADX INFO: renamed from: a */
    public float f117816a = 0.0f;

    /* JADX INFO: renamed from: b */
    public float f117817b = 0.0f;

    /* JADX INFO: renamed from: e */
    public float f117820e = 1.0f;

    public j0f0(ShapeDrawable shapeDrawable) {
        this.f117818c = shapeDrawable;
    }

    /* JADX INFO: renamed from: a */
    public ShapeDrawable m142970a() {
        return this.f117818c;
    }

    /* JADX INFO: renamed from: b */
    public float m142971b() {
        return this.f117816a;
    }

    /* JADX INFO: renamed from: c */
    public float m142972c() {
        return this.f117817b;
    }

    /* JADX INFO: renamed from: d */
    public void m142973d(float f, float f2) {
        this.f117818c.getShape().resize(f, f2);
    }

    /* JADX INFO: renamed from: e */
    public void m142974e(Paint paint) {
        this.f117819d = paint;
    }

    /* JADX INFO: renamed from: f */
    public void m142975f(float f) {
        this.f117816a = f;
    }

    /* JADX INFO: renamed from: g */
    public void m142976g(float f) {
        this.f117817b = f;
    }
}
