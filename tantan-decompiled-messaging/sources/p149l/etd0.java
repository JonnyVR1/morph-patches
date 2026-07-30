package p149l;

import android.graphics.Matrix;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
public abstract class etd0 implements ftd0 {
    @Override // p149l.ftd0
    /* JADX INFO: renamed from: a */
    public Matrix mo118081a(Matrix matrix, Rect rect, int i, int i2, float f, float f2) {
        mo118082b(matrix, rect, i, i2, f, f2, rect.width() / i, rect.height() / i2);
        return matrix;
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo118082b(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4);
}
