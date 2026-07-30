package p149l;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public class flh0 {
    /* JADX INFO: renamed from: a */
    public static Bitmap m122068a(Bitmap bitmap, @Nullable l95 l95Var) {
        if (l95Var == null) {
            return bitmap;
        }
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        return Bitmap.createBitmap(bitmap, Math.round(l95Var.f126918b * width), Math.round(l95Var.f126917a * height), Math.round(width * l95Var.m149001c()), Math.round(height * l95Var.m149000b()));
    }

    /* JADX INFO: renamed from: b */
    public static Bitmap m122069b(Bitmap bitmap, float f) {
        Matrix matrix = new Matrix();
        matrix.postRotate(f);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }
}
