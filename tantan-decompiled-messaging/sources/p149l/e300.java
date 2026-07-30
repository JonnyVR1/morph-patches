package p149l;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes7.dex */
public class e300 {
    /* JADX INFO: renamed from: a */
    public static byte[] m114576a(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream;
        if (bitmap != null) {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    bitmap.compress(Bitmap.CompressFormat.JPEG, 80, byteArrayOutputStream);
                    byteArrayOutputStream.flush();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    m114577b(byteArrayOutputStream);
                    return byteArray;
                } catch (Throwable unused) {
                    m114577b(byteArrayOutputStream);
                    return null;
                }
            } catch (Throwable unused2) {
                byteArrayOutputStream = null;
            }
        } else {
            m114577b(null);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static void m114577b(OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (Throwable unused) {
            }
        }
    }
}
