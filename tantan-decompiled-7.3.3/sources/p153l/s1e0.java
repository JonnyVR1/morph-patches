package p153l;

import android.graphics.Matrix;
import android.graphics.Rect;
import com.p051p1.mobile.putong.data.OMSImageScaleType;

/* JADX INFO: loaded from: classes.dex */
public class s1e0 extends g1e0 {
    public static final h1e0 INSTANCE = new s1e0();

    @Override // p153l.g1e0
    /* JADX INFO: renamed from: b */
    public void mo128504b(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
        float fMax;
        float f5;
        if (f4 > f3) {
            float f6 = i * f4;
            fMax = rect.left + Math.max(Math.min((rect.width() * 0.5f) - (f * f6), 0.0f), rect.width() - f6);
            f5 = rect.top;
            f3 = f4;
        } else {
            float f7 = rect.left;
            float f8 = i2 * f3;
            float fMax2 = Math.max(Math.min((rect.height() * 0.5f) - (f2 * f8), 0.0f), rect.height() - f8) + rect.top;
            fMax = f7;
            f5 = fMax2;
        }
        matrix.setScale(f3, f3);
        matrix.postTranslate((int) (fMax + 0.5f), (int) (f5 + 0.5f));
    }

    public String toString() {
        return OMSImageScaleType.focus_crop;
    }
}
