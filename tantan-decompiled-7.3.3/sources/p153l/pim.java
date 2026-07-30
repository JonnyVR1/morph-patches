package p153l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.opengl.GLES20;
import android.opengl.GLUtils;

/* JADX INFO: loaded from: classes7.dex */
public class pim {
    /* JADX INFO: renamed from: a */
    public static int m172385a(Bitmap bitmap) {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(3553, iArr[0]);
        GLES20.glTexParameterf(3553, 10240, 9729.0f);
        GLES20.glTexParameterf(3553, 10241, 9729.0f);
        GLES20.glTexParameterf(3553, 10242, 33071.0f);
        GLES20.glTexParameterf(3553, 10243, 33071.0f);
        if (bitmap != null) {
            try {
                GLUtils.texImage2D(3553, 0, bitmap, 0);
            } catch (Exception unused) {
            }
        }
        return iArr[0];
    }

    /* JADX INFO: renamed from: b */
    private static Bitmap m172386b(String str, Boolean bool) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inPremultiplied = bool.booleanValue();
            return BitmapFactory.decodeFile(str, options);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static Bitmap m172387c(String str) {
        return m172386b(str, Boolean.TRUE);
    }
}
