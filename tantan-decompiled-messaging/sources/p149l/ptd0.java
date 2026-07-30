package p149l;

import android.graphics.Matrix;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
public class ptd0 extends etd0 {
    public static final ftd0 INSTANCE = new ptd0();

    @Override // p149l.etd0
    /* JADX INFO: renamed from: b */
    public void mo118082b(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
        float fWidth = rect.left + ((rect.width() - (i * f4)) * 0.5f);
        float f5 = rect.top;
        matrix.setScale(f4, f4);
        matrix.postTranslate((int) (fWidth + 0.5f), (int) (f5 + 0.5f));
    }

    public String toString() {
        return "fit_y";
    }
}
