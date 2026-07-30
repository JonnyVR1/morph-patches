package p153l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import android.util.Log;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m88121d2 = {"Ll/o33;", "", "<init>", "()V", "", "filePath", "", "maxWidth", "maxHeight", "Landroid/graphics/Bitmap;", "a", "(Ljava/lang/String;II)Landroid/graphics/Bitmap;", "file", "b", "(Ljava/lang/String;)I", "HelloFoundation_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class o33 {
    public static final o33 INSTANCE = new o33();

    private o33() {
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final Bitmap m165841a(@NotNull String filePath, int maxWidth, int maxHeight) {
        float f;
        float f2;
        filePath.getClass();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(filePath, options);
        int i = options.outWidth;
        int i2 = options.outHeight;
        int i3 = i > i2 ? i / maxWidth : i2 / maxHeight;
        int i4 = i3 >= 1 ? i3 : 1;
        int iM165842b = 0;
        options.inJustDecodeBounds = false;
        options.inSampleSize = i4;
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(filePath, options);
        if (bitmapDecodeFile == null) {
            return null;
        }
        int width = bitmapDecodeFile.getWidth();
        int height = bitmapDecodeFile.getHeight();
        if (width < maxWidth && height < maxHeight) {
            return bitmapDecodeFile;
        }
        if (width > height) {
            f = maxWidth;
            f2 = width;
        } else {
            f = maxHeight;
            f2 = height;
        }
        float f3 = f / f2;
        Matrix matrix = new Matrix();
        try {
            iM165842b = m165842b(filePath);
        } catch (Exception e) {
            Log.e("BitmapUtils", "", e);
        }
        matrix.postScale(f3, f3);
        matrix.postRotate(iM165842b);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeFile, 0, 0, width, height, matrix, true);
        bitmapCreateBitmap.getClass();
        if (bitmapCreateBitmap != bitmapDecodeFile) {
            bitmapDecodeFile.recycle();
        }
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: b */
    public final int m165842b(@NotNull String file) throws Exception {
        file.getClass();
        try {
            int attributeInt = new ExifInterface(file).getAttributeInt(p7f.TAG_ORIENTATION, 1);
            if (attributeInt == 1) {
                return 0;
            }
            if (attributeInt == 3) {
                return 180;
            }
            if (attributeInt != 6) {
                return attributeInt != 8 ? 0 : 270;
            }
            return 90;
        } catch (Exception e) {
            Log.e("BitmapUtils", "", e);
            return 0;
        }
    }
}
