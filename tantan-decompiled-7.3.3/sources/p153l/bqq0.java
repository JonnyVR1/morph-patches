package p153l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* JADX INFO: loaded from: classes7.dex */
public class bqq0 {
    /* JADX INFO: renamed from: a */
    public static Bitmap m105952a(ByteBuffer byteBuffer, int i, int i2, int i3) {
        if (byteBuffer == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new YuvImage(byteBuffer.array(), 17, i, i2, null).compressToJpeg(new Rect(0, 0, i, i2), 60, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
            options.inSampleSize = cd4.m109118b(options, options.outWidth / 2, options.outHeight / 2);
            options.inJustDecodeBounds = false;
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            options.inPurgeable = true;
            options.inInputShareable = true;
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
            if (bitmapDecodeByteArray != null) {
                Matrix matrix = new Matrix();
                matrix.setRotate(i3);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), matrix, false);
                if (bitmapDecodeByteArray != bitmapCreateBitmap && !bitmapDecodeByteArray.isRecycled()) {
                    bitmapDecodeByteArray.recycle();
                }
                return bitmapCreateBitmap;
            }
        } catch (Exception unused) {
        } finally {
            bc00.m103470b(byteArrayOutputStream);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    private static void m105953b(String str, Bitmap bitmap, ZipOutputStream zipOutputStream) throws Exception {
        byte[] bArrM103469a = bc00.m103469a(bitmap);
        if (bArrM103469a == null || bArrM103469a.length <= 0) {
            return;
        }
        zipOutputStream.putNextEntry(new ZipEntry(str));
        zipOutputStream.write(bArrM103469a, 0, bArrM103469a.length);
        zipOutputStream.flush();
        zipOutputStream.closeEntry();
    }

    /* JADX INFO: renamed from: c */
    public static void m105954c(ArrayList<ByteBuffer> arrayList, File file, int i, int i2, int i3) throws Exception {
        Bitmap bitmapM105952a;
        ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            String str = "face_frame_" + i4 + ".jpeg";
            ByteBuffer byteBuffer = arrayList.get(i4);
            if (byteBuffer != null && (bitmapM105952a = m105952a(byteBuffer, i, i2, i3)) != null && !bitmapM105952a.isRecycled()) {
                m105953b(str, bitmapM105952a, zipOutputStream);
            }
        }
        zipOutputStream.close();
    }
}
