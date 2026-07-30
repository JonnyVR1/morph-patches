package p153l;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes7.dex */
public class bc00 {
    /* JADX INFO: renamed from: a */
    public static byte[] m103469a(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream;
        if (bitmap != null) {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    bitmap.compress(Bitmap.CompressFormat.JPEG, 80, byteArrayOutputStream);
                    byteArrayOutputStream.flush();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    m103470b(byteArrayOutputStream);
                    return byteArray;
                } catch (Throwable unused) {
                    m103470b(byteArrayOutputStream);
                    return null;
                }
            } catch (Throwable unused2) {
                byteArrayOutputStream = null;
            }
        } else {
            m103470b(null);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static void m103470b(OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (Throwable unused) {
            }
        }
    }
}
