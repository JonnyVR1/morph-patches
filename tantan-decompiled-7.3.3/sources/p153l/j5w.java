package p153l;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public abstract class j5w implements Interpolator {

    /* JADX INFO: renamed from: a */
    public final float[] f118503a;

    /* JADX INFO: renamed from: b */
    public final float f118504b;

    public j5w(float[] fArr) {
        this.f118503a = fArr;
        this.f118504b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f118503a;
        int iMin = Math.min((int) ((fArr.length - 1) * f), fArr.length - 2);
        float f2 = this.f118504b;
        float f3 = (f - (iMin * f2)) / f2;
        float[] fArr2 = this.f118503a;
        float f4 = fArr2[iMin];
        return f4 + (f3 * (fArr2[iMin + 1] - f4));
    }
}
