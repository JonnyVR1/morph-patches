package p153l;

import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.PaintDrawable;

/* JADX INFO: loaded from: classes8.dex */
public class jde {

    /* JADX INFO: renamed from: a */
    public static h1e0 f120246a = new C17927a();

    /* JADX INFO: renamed from: l.jde$a */
    public class C17927a implements h1e0 {
        @Override // p153l.h1e0
        /* JADX INFO: renamed from: a */
        public Matrix mo128503a(Matrix matrix, Rect rect, int i, int i2, float f, float f2) {
            matrix.setTranslate((int) (((rect.left + rect.width()) - i) + 0.5f), (int) (rect.top + ((rect.height() - i2) * 0.5f) + 0.5f));
            return matrix;
        }
    }

    /* JADX INFO: renamed from: a */
    public static Drawable m144405a(double d, double d2, double d3, GradientDrawable.Orientation orientation) {
        int iFloor = (int) Math.floor(d * 1000.0d);
        int[] iArr = new int[iFloor + 1000];
        for (int i = 0; i < iFloor; i++) {
            iArr[i] = Color.argb((int) (255.0d * d2), 0, 0, 0);
        }
        for (int i2 = 0; i2 < 1000; i2++) {
            iArr[i2 + iFloor] = Color.argb((int) ((((Math.pow(i2, 1.0d) * (d3 - d2)) / Math.pow(999.0d, 1.0d)) + d2) * 255.0d), 0, 0, 0);
        }
        return new GradientDrawable(orientation, iArr);
    }

    /* JADX INFO: renamed from: b */
    public static Drawable m144406b(int i, float f) {
        PaintDrawable paintDrawable = new PaintDrawable();
        paintDrawable.setCornerRadius(f);
        paintDrawable.getPaint().setColor(i);
        return paintDrawable;
    }

    /* JADX INFO: renamed from: c */
    public static Drawable m144407c(int i, float[] fArr) {
        PaintDrawable paintDrawable = new PaintDrawable();
        paintDrawable.setCornerRadii(fArr);
        paintDrawable.getPaint().setColor(i);
        return paintDrawable;
    }
}
