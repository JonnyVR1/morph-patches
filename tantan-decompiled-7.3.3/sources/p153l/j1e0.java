package p153l;

import android.graphics.Matrix;
import android.graphics.Rect;
import com.p051p1.mobile.putong.data.OMSImageScaleType;

/* JADX INFO: loaded from: classes.dex */
public class j1e0 extends g1e0 {
    public static final h1e0 INSTANCE = new j1e0();

    @Override // p153l.g1e0
    /* JADX INFO: renamed from: b */
    public void mo128504b(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
        float fWidth;
        float fHeight;
        if (f4 > f3) {
            fWidth = rect.left + ((rect.width() - (i * f4)) * 0.5f);
            fHeight = rect.top;
            f3 = f4;
        } else {
            fWidth = rect.left;
            fHeight = ((rect.height() - (i2 * f3)) * 0.5f) + rect.top;
        }
        matrix.setScale(f3, f3);
        matrix.postTranslate((int) (fWidth + 0.5f), (int) (fHeight + 0.5f));
    }

    public String toString() {
        return OMSImageScaleType.center_crop;
    }
}
