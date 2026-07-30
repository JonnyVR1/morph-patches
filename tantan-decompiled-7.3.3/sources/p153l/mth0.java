package p153l;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public class mth0 {
    /* JADX INFO: renamed from: a */
    public static Bitmap m160017a(Bitmap bitmap, @Nullable ma5 ma5Var) {
        if (ma5Var == null) {
            return bitmap;
        }
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        return Bitmap.createBitmap(bitmap, Math.round(ma5Var.f135472b * width), Math.round(ma5Var.f135471a * height), Math.round(width * ma5Var.m157636c()), Math.round(height * ma5Var.m157635b()));
    }

    /* JADX INFO: renamed from: b */
    public static Bitmap m160018b(Bitmap bitmap, float f) {
        Matrix matrix = new Matrix();
        matrix.postRotate(f);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }
}
