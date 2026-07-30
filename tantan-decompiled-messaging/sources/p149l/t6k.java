package p149l;

import android.graphics.Bitmap;
import android.graphics.Matrix;

/* JADX INFO: loaded from: classes8.dex */
public class t6k {
    /* JADX INFO: renamed from: a */
    public static Bitmap m187383a(Bitmap bitmap, float f, float f2) {
        if (bitmap.getWidth() == f && bitmap.getHeight() == f2) {
            return bitmap;
        }
        if (Math.round(f) == 0) {
            f = 1.0f;
        }
        if (Math.round(f2) == 0) {
            f2 = 1.0f;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.postScale(f / width, f2 / height);
        return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
    }
}
