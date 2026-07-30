package p153l;

import android.graphics.Matrix;
import android.graphics.Rect;
import com.p051p1.mobile.putong.data.OMSImageScaleType;

/* JADX INFO: loaded from: classes.dex */
public class k1e0 extends g1e0 {
    public static final h1e0 INSTANCE = new k1e0();

    @Override // p153l.g1e0
    /* JADX INFO: renamed from: b */
    public void mo128504b(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
        float fMin = Math.min(Math.min(f3, f4), 1.0f);
        float fWidth = rect.left + ((rect.width() - (i * fMin)) * 0.5f);
        float fHeight = rect.top + ((rect.height() - (i2 * fMin)) * 0.5f);
        matrix.setScale(fMin, fMin);
        matrix.postTranslate((int) (fWidth + 0.5f), (int) (fHeight + 0.5f));
    }

    public String toString() {
        return OMSImageScaleType.center_inside;
    }
}
