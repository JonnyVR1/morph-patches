package p149l;

import android.graphics.Matrix;
import android.graphics.Rect;
import com.p046p1.mobile.putong.data.OMSImageScaleType;

/* JADX INFO: loaded from: classes.dex */
public class mtd0 extends etd0 {
    public static final ftd0 INSTANCE = new mtd0();

    @Override // p149l.etd0
    /* JADX INFO: renamed from: b */
    public void mo118082b(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
        float fMin = Math.min(f3, f4);
        float f5 = rect.left;
        float f6 = rect.top;
        matrix.setScale(fMin, fMin);
        matrix.postTranslate((int) (f5 + 0.5f), (int) (f6 + 0.5f));
    }

    public String toString() {
        return OMSImageScaleType.fit_start;
    }
}
