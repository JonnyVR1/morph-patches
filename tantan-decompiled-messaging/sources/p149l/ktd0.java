package p149l;

import android.graphics.Matrix;
import android.graphics.Rect;
import com.p046p1.mobile.putong.data.OMSImageScaleType;

/* JADX INFO: loaded from: classes.dex */
public class ktd0 extends etd0 {
    public static final ftd0 INSTANCE = new ktd0();

    @Override // p149l.etd0
    /* JADX INFO: renamed from: b */
    public void mo118082b(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
        float fMin = Math.min(f3, f4);
        float fWidth = rect.left + ((rect.width() - (i * fMin)) * 0.5f);
        float fHeight = rect.top + ((rect.height() - (i2 * fMin)) * 0.5f);
        matrix.setScale(fMin, fMin);
        matrix.postTranslate((int) (fWidth + 0.5f), (int) (fHeight + 0.5f));
    }

    public String toString() {
        return OMSImageScaleType.fit_center;
    }
}
