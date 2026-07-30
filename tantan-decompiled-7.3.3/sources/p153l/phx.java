package p153l;

import android.graphics.Matrix;
import android.graphics.RectF;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes8.dex */
public class phx {

    /* JADX INFO: renamed from: b */
    public static C22508b<Float> f152493b = C22508b.m222767b();

    /* JADX INFO: renamed from: a */
    public float[] f152494a = new float[9];

    /* JADX INFO: renamed from: a */
    public static Matrix m172340a(RectF rectF, Matrix matrix, RectF rectF2) {
        RectF rectF3 = new RectF();
        rectF3.set(rectF);
        Matrix matrix2 = new Matrix();
        matrix2.set(matrix);
        RectF rectF4 = new RectF(rectF);
        matrix2.mapRect(rectF4);
        if (rectF4.width() < rectF2.width()) {
            m172341f(rectF3, rectF2.width() / rectF4.width(), matrix2, rectF4);
        }
        if (rectF4.height() < rectF2.height()) {
            m172341f(rectF3, rectF2.height() / rectF4.height(), matrix2, rectF4);
        }
        float f = rectF4.left;
        float f2 = rectF2.left;
        if (f > f2) {
            m172343h(rectF3, f2 - f, 0.0f, matrix2, rectF4);
        }
        float f3 = rectF4.right;
        float f4 = rectF2.right;
        if (f3 < f4) {
            m172343h(rectF3, f4 - f3, 0.0f, matrix2, rectF4);
        }
        float f5 = rectF4.top;
        float f6 = rectF2.top;
        if (f5 > f6) {
            m172343h(rectF3, 0.0f, f6 - f5, matrix2, rectF4);
        }
        float f7 = rectF4.bottom;
        float f8 = rectF2.bottom;
        if (f7 < f8) {
            m172343h(rectF3, 0.0f, f8 - f7, matrix2, rectF4);
        }
        return matrix2;
    }

    /* JADX INFO: renamed from: f */
    public static void m172341f(RectF rectF, float f, Matrix matrix, RectF rectF2) {
        matrix.postScale(f, f, rectF2.centerX(), rectF2.centerY());
        m172342g(rectF, matrix, rectF2);
    }

    /* JADX INFO: renamed from: g */
    public static void m172342g(RectF rectF, Matrix matrix, RectF rectF2) {
        rectF2.set(rectF);
        matrix.mapRect(rectF2);
    }

    /* JADX INFO: renamed from: h */
    public static void m172343h(RectF rectF, float f, float f2, Matrix matrix, RectF rectF2) {
        matrix.postTranslate(f, f2);
        m172342g(rectF, matrix, rectF2);
    }

    /* JADX INFO: renamed from: b */
    public float m172344b(Matrix matrix) {
        matrix.getValues(this.f152494a);
        return this.f152494a[1];
    }

    /* JADX INFO: renamed from: c */
    public float m172345c(Matrix matrix) {
        matrix.getValues(this.f152494a);
        return this.f152494a[0];
    }

    /* JADX INFO: renamed from: d */
    public float m172346d(Matrix matrix) {
        matrix.getValues(this.f152494a);
        return this.f152494a[2];
    }

    /* JADX INFO: renamed from: e */
    public float m172347e(Matrix matrix) {
        matrix.getValues(this.f152494a);
        return this.f152494a[5];
    }
}
