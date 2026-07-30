package p153l;

import android.graphics.Matrix;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
public abstract class g1e0 implements h1e0 {
    @Override // p153l.h1e0
    /* JADX INFO: renamed from: a */
    public Matrix mo128503a(Matrix matrix, Rect rect, int i, int i2, float f, float f2) {
        mo128504b(matrix, rect, i, i2, f, f2, rect.width() / i, rect.height() / i2);
        return matrix;
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo128504b(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4);
}
