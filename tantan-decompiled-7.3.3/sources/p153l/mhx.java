package p153l;

import android.animation.FloatEvaluator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.view.animation.AccelerateDecelerateInterpolator;

/* JADX INFO: loaded from: classes8.dex */
public class mhx {

    /* JADX INFO: renamed from: a */
    public ValueAnimator f136886a;

    /* JADX INFO: renamed from: l.mhx$a */
    public static class C18616a implements TypeEvaluator<Matrix> {

        /* JADX INFO: renamed from: b */
        public Matrix f136888b;

        /* JADX INFO: renamed from: c */
        public Matrix f136889c;

        /* JADX INFO: renamed from: e */
        public float f136891e;

        /* JADX INFO: renamed from: f */
        public float f136892f;

        /* JADX INFO: renamed from: g */
        public float f136893g;

        /* JADX INFO: renamed from: h */
        public float f136894h;

        /* JADX INFO: renamed from: i */
        public float f136895i;

        /* JADX INFO: renamed from: j */
        public float f136896j;

        /* JADX INFO: renamed from: a */
        public Matrix f136887a = new Matrix();

        /* JADX INFO: renamed from: d */
        public FloatEvaluator f136890d = new FloatEvaluator();

        /* JADX INFO: renamed from: a */
        public final void m158436a(Matrix matrix, Matrix matrix2) {
            phx phxVar = new phx();
            this.f136891e = phxVar.m172346d(matrix);
            this.f136892f = phxVar.m172347e(matrix);
            this.f136893g = phxVar.m172345c(matrix);
            this.f136894h = phxVar.m172346d(matrix2);
            this.f136895i = phxVar.m172347e(matrix2);
            this.f136896j = phxVar.m172345c(matrix2);
            this.f136888b = matrix;
            this.f136889c = matrix2;
        }

        @Override // android.animation.TypeEvaluator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            if (m158438c(matrix, matrix2)) {
                m158436a(matrix, matrix2);
            }
            float fFloatValue = this.f136890d.evaluate(f, (Number) Float.valueOf(this.f136891e), (Number) Float.valueOf(this.f136894h)).floatValue();
            float fFloatValue2 = this.f136890d.evaluate(f, (Number) Float.valueOf(this.f136892f), (Number) Float.valueOf(this.f136895i)).floatValue();
            float fFloatValue3 = this.f136890d.evaluate(f, (Number) Float.valueOf(this.f136893g), (Number) Float.valueOf(this.f136896j)).floatValue();
            this.f136887a.reset();
            this.f136887a.postScale(fFloatValue3, fFloatValue3);
            this.f136887a.postTranslate(fFloatValue, fFloatValue2);
            return this.f136887a;
        }

        /* JADX INFO: renamed from: c */
        public final boolean m158438c(Matrix matrix, Matrix matrix2) {
            return (this.f136888b == matrix && this.f136889c == matrix2) ? false : true;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m158433b(Matrix matrix, Matrix matrix2, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        m158434c();
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new C18616a(), matrix, matrix2);
        this.f136886a = valueAnimatorOfObject;
        gt0.m132160f(valueAnimatorOfObject, new Runnable() { // from class: l.lhx
            @Override // java.lang.Runnable
            public final void run() {
                this.f132159a.m158435d();
            }
        });
        this.f136886a.addUpdateListener(animatorUpdateListener);
        this.f136886a.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f136886a.setDuration(200L);
        this.f136886a.start();
    }

    /* JADX INFO: renamed from: c */
    public void m158434c() {
        ValueAnimator valueAnimator = this.f136886a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f136886a = null;
        }
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m158435d() {
        this.f136886a = null;
    }
}
