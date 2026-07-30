package p149l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.FaceDetector;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes11.dex */
public class gtf {
    /* JADX INFO: renamed from: a */
    public static boolean m127927a(Bitmap bitmap) {
        FaceDetector faceDetector = new FaceDetector(bitmap.getWidth(), bitmap.getHeight(), 3);
        boolean z = faceDetector.findFaces(bitmap, new FaceDetector.Face[3]) > 0;
        if (z) {
            return z;
        }
        RectF rectF = new RectF(bitmap.getWidth() / 4, bitmap.getHeight() / 4, bitmap.getWidth() - (bitmap.getWidth() / 4), bitmap.getHeight() - (bitmap.getHeight() / 4));
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(-1);
        canvas.drawBitmap(bitmap, (Rect) null, rectF, (Paint) null);
        return faceDetector.findFaces(bitmapCreateBitmap, new FaceDetector.Face[3]) > 0;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m127928b(String str) {
        Bitmap bitmapDecodeFile;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        try {
            bitmapDecodeFile = BitmapFactory.decodeFile(str, options);
        } catch (OutOfMemoryError e) {
            CrashHelper.m81296c(e);
            options.inSampleSize = 2;
            bitmapDecodeFile = BitmapFactory.decodeFile(str, options);
        }
        return bitmapDecodeFile == null || m127927a(bitmapDecodeFile);
    }
}
