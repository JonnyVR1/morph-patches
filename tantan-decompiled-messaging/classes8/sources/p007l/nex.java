package p007l;

import android.animation.FloatEvaluator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.view.animation.AccelerateDecelerateInterpolator;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class nex {

    /* JADX INFO: renamed from: a */
    public ValueAnimator f3388a;

    /* JADX INFO: renamed from: l.nex$a */
    public static class C0622a implements TypeEvaluator<Matrix> {

        /* JADX INFO: renamed from: b */
        public Matrix f3390b;

        /* JADX INFO: renamed from: c */
        public Matrix f3391c;

        /* JADX INFO: renamed from: e */
        public float f3393e;

        /* JADX INFO: renamed from: f */
        public float f3394f;

        /* JADX INFO: renamed from: g */
        public float f3395g;

        /* JADX INFO: renamed from: h */
        public float f3396h;

        /* JADX INFO: renamed from: i */
        public float f3397i;

        /* JADX INFO: renamed from: j */
        public float f3398j;

        /* JADX INFO: renamed from: a */
        public Matrix f3389a = new Matrix();

        /* JADX INFO: renamed from: d */
        public FloatEvaluator f3392d = new FloatEvaluator();

        /* JADX INFO: renamed from: a */
        public final void m9983a(Matrix matrix, Matrix matrix2) {
            qex qexVar = new qex();
            this.f3393e = qexVar.m10352d(matrix);
            this.f3394f = qexVar.m10353e(matrix);
            this.f3395g = qexVar.m10351c(matrix);
            this.f3396h = qexVar.m10352d(matrix2);
            this.f3397i = qexVar.m10353e(matrix2);
            this.f3398j = qexVar.m10351c(matrix2);
            this.f3390b = matrix;
            this.f3391c = matrix2;
        }

        @Override // android.animation.TypeEvaluator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            if (m9985c(matrix, matrix2)) {
                m9983a(matrix, matrix2);
            }
            float fFloatValue = this.f3392d.evaluate(f, (Number) Float.valueOf(this.f3393e), (Number) Float.valueOf(this.f3396h)).floatValue();
            float fFloatValue2 = this.f3392d.evaluate(f, (Number) Float.valueOf(this.f3394f), (Number) Float.valueOf(this.f3397i)).floatValue();
            float fFloatValue3 = this.f3392d.evaluate(f, (Number) Float.valueOf(this.f3395g), (Number) Float.valueOf(this.f3398j)).floatValue();
            this.f3389a.reset();
            this.f3389a.postScale(fFloatValue3, fFloatValue3);
            this.f3389a.postTranslate(fFloatValue, fFloatValue2);
            return this.f3389a;
        }

        /* JADX INFO: renamed from: c */
        public final boolean m9985c(Matrix matrix, Matrix matrix2) {
            return (this.f3390b == matrix && this.f3391c == matrix2) ? false : true;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m9980b(Matrix matrix, Matrix matrix2, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        m9981c();
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new C0622a(), matrix, matrix2);
        this.f3388a = valueAnimatorOfObject;
        bt0.m8651f(valueAnimatorOfObject, new Runnable() { // from class: l.mex
            @Override // java.lang.Runnable
            public final void run() {
                this.f3304a.m9982d();
            }
        });
        this.f3388a.addUpdateListener(animatorUpdateListener);
        this.f3388a.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f3388a.setDuration(200L);
        this.f3388a.start();
    }

    /* JADX INFO: renamed from: c */
    public void m9981c() {
        ValueAnimator valueAnimator = this.f3388a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f3388a = null;
        }
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m9982d() {
        this.f3388a = null;
    }
}
