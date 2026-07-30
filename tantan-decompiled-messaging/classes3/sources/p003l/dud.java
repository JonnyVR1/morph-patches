package p003l;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class dud {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal<Matrix> f3114a = new ThreadLocal<>();

    /* JADX INFO: renamed from: b */
    public static final ThreadLocal<RectF> f3115b = new ThreadLocal<>();

    /* JADX INFO: renamed from: a */
    public static void m3737a(ViewParent viewParent, @NonNull View view, @NonNull Matrix matrix) {
        Object parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            View view2 = (View) parent;
            m3737a(viewParent, view2, matrix);
            matrix.preTranslate(-view2.getScrollX(), -view2.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (view.getMatrix().isIdentity()) {
            return;
        }
        matrix.preConcat(view.getMatrix());
    }

    /* JADX INFO: renamed from: b */
    public static void m3738b(@NonNull ViewGroup viewGroup, @NonNull View view, @NonNull Rect rect) {
        ThreadLocal<Matrix> threadLocal = f3114a;
        Matrix matrix = threadLocal.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal.set(matrix);
        } else {
            matrix.reset();
        }
        m3737a(viewGroup, view, matrix);
        ThreadLocal<RectF> threadLocal2 = f3115b;
        RectF rectF = threadLocal2.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal2.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }
}
