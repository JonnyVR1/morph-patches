package p149l;

import android.animation.FloatEvaluator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.view.animation.AccelerateDecelerateInterpolator;

/* JADX INFO: loaded from: classes8.dex */
public class nex {

    /* JADX INFO: renamed from: a */
    public ValueAnimator f138658a;

    /* JADX INFO: renamed from: l.nex$a */
    public static class C18683a implements TypeEvaluator<Matrix> {

        /* JADX INFO: renamed from: b */
        public Matrix f138660b;

        /* JADX INFO: renamed from: c */
        public Matrix f138661c;

        /* JADX INFO: renamed from: e */
        public float f138663e;

        /* JADX INFO: renamed from: f */
        public float f138664f;

        /* JADX INFO: renamed from: g */
        public float f138665g;

        /* JADX INFO: renamed from: h */
        public float f138666h;

        /* JADX INFO: renamed from: i */
        public float f138667i;

        /* JADX INFO: renamed from: j */
        public float f138668j;

        /* JADX INFO: renamed from: a */
        public Matrix f138659a = new Matrix();

        /* JADX INFO: renamed from: d */
        public FloatEvaluator f138662d = new FloatEvaluator();

        /* JADX INFO: renamed from: a */
        public final void m159129a(Matrix matrix, Matrix matrix2) {
            qex qexVar = new qex();
            this.f138663e = qexVar.m174269d(matrix);
            this.f138664f = qexVar.m174270e(matrix);
            this.f138665g = qexVar.m174268c(matrix);
            this.f138666h = qexVar.m174269d(matrix2);
            this.f138667i = qexVar.m174270e(matrix2);
            this.f138668j = qexVar.m174268c(matrix2);
            this.f138660b = matrix;
            this.f138661c = matrix2;
        }

        @Override // android.animation.TypeEvaluator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            if (m159131c(matrix, matrix2)) {
                m159129a(matrix, matrix2);
            }
            float fFloatValue = this.f138662d.evaluate(f, (Number) Float.valueOf(this.f138663e), (Number) Float.valueOf(this.f138666h)).floatValue();
            float fFloatValue2 = this.f138662d.evaluate(f, (Number) Float.valueOf(this.f138664f), (Number) Float.valueOf(this.f138667i)).floatValue();
            float fFloatValue3 = this.f138662d.evaluate(f, (Number) Float.valueOf(this.f138665g), (Number) Float.valueOf(this.f138668j)).floatValue();
            this.f138659a.reset();
            this.f138659a.postScale(fFloatValue3, fFloatValue3);
            this.f138659a.postTranslate(fFloatValue, fFloatValue2);
            return this.f138659a;
        }

        /* JADX INFO: renamed from: c */
        public final boolean m159131c(Matrix matrix, Matrix matrix2) {
            return (this.f138660b == matrix && this.f138661c == matrix2) ? false : true;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m159126b(Matrix matrix, Matrix matrix2, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        m159127c();
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new C18683a(), matrix, matrix2);
        this.f138658a = valueAnimatorOfObject;
        bt0.m103733f(valueAnimatorOfObject, new Runnable() { // from class: l.mex
            @Override // java.lang.Runnable
            public final void run() {
                this.f133518a.m159128d();
            }
        });
        this.f138658a.addUpdateListener(animatorUpdateListener);
        this.f138658a.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f138658a.setDuration(200L);
        this.f138658a.start();
    }

    /* JADX INFO: renamed from: c */
    public void m159127c() {
        ValueAnimator valueAnimator = this.f138658a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f138658a = null;
        }
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m159128d() {
        this.f138658a = null;
    }
}
