package p153l;

import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import androidx.annotation.Nullable;
import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes10.dex */
public class gmk0 {
    /* JADX INFO: renamed from: a */
    public static byte[] m130799a(@Nullable Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        if (bitmap.getWidth() > 500 || bitmap.getHeight() > 500) {
            bitmap = ThumbnailUtils.extractThumbnail(bitmap, 500, 500, 2);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bitmap.getWidth() * bitmap.getHeight());
        int i = 100;
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        while (byteArrayOutputStream.size() > 32768 && i > 6) {
            byteArrayOutputStream.reset();
            i -= 6;
            bitmap.compress(Bitmap.CompressFormat.JPEG, i, byteArrayOutputStream);
        }
        bitmap.recycle();
        return byteArrayOutputStream.toByteArray();
    }
}
