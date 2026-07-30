package p153l;

import android.graphics.Matrix;
import android.graphics.Rect;
import com.p051p1.mobile.putong.data.OMSImageScaleType;

/* JADX INFO: loaded from: classes.dex */
public class l1e0 extends g1e0 {
    public static final h1e0 INSTANCE = new l1e0();

    @Override // p153l.g1e0
    /* JADX INFO: renamed from: b */
    public void mo128504b(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
        float fMin = Math.min(f3, f4);
        float f5 = rect.left;
        float fHeight = rect.top + (rect.height() - (i2 * fMin));
        matrix.setScale(fMin, fMin);
        matrix.postTranslate((int) (f5 + 0.5f), (int) (fHeight + 0.5f));
    }

    public String toString() {
        return OMSImageScaleType.fit_bottom_start;
    }
}
