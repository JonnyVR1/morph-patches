package p149l;

import android.graphics.Matrix;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
public class ntd0 extends etd0 {
    public static final ftd0 INSTANCE = new ntd0();

    @Override // p149l.etd0
    /* JADX INFO: renamed from: b */
    public void mo118082b(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
        float f5 = rect.left;
        float fHeight = rect.top + ((rect.height() - (i2 * f3)) * 0.5f);
        matrix.setScale(f3, f3);
        matrix.postTranslate((int) (f5 + 0.5f), (int) (fHeight + 0.5f));
    }

    public String toString() {
        return "fit_x";
    }
}
