package com.momo.xeengine.xnative;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import androidx.annotation.Keep;
import com.momo.xeengine.XEnginePreferences;
import java.io.InputStream;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
@Keep
public final class XETextureLoader {
    private XETextureLoader() {
    }

    private static Bitmap getBitmap(String str, boolean z) {
        InputStream inputStreamOpen;
        int i;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        if (z) {
            try {
                inputStreamOpen = XEnginePreferences.getContext().getAssets().open(str);
                if (inputStreamOpen == null) {
                    return null;
                }
                BitmapFactory.decodeStream(inputStreamOpen, null, options);
            } catch (Exception unused) {
                return null;
            }
        } else {
            BitmapFactory.decodeFile(str, options);
            inputStreamOpen = null;
        }
        int i2 = options.outWidth;
        if (i2 <= 0 || (i = options.outHeight) <= 0) {
            return null;
        }
        BitmapFactory.Options bitmapDecodeOptions = getBitmapDecodeOptions(i2, i);
        if (!z) {
            return BitmapFactory.decodeFile(str, bitmapDecodeOptions);
        }
        try {
            inputStreamOpen.reset();
            return BitmapFactory.decodeStream(inputStreamOpen, null, bitmapDecodeOptions);
        } catch (Exception unused2) {
            return null;
        }
    }

    private static BitmapFactory.Options getBitmapDecodeOptions(int i, int i2) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        options.inPremultiplied = false;
        options.inPreferredConfig = config;
        if (i <= 2048 && i2 <= 2048) {
            return options;
        }
        options.inSampleSize = Math.max(i / 2048, i2 / 2048);
        return options;
    }

    public static long loadTexture(byte[] bArr, String str, long j, int i) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPremultiplied = false;
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        options.inPreferredConfig = config;
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        if (bitmapDecodeByteArray == null || bitmapDecodeByteArray.getConfig() != config) {
            return 0L;
        }
        int width = bitmapDecodeByteArray.getWidth();
        int height = bitmapDecodeByteArray.getHeight();
        if (width == 0 || height == 0) {
            return 0L;
        }
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, iArr[0]);
        GLES20.glTexImage2D(3553, 0, 6408, width, height, 0, 6408, 5121, null);
        GLES20.glTexParameterf(3553, 10241, 9728.0f);
        GLES20.glTexParameterf(3553, 10240, 9729.0f);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLUtils.texSubImage2D(3553, 0, 0, 0, bitmapDecodeByteArray);
        bitmapDecodeByteArray.recycle();
        return nativeCreateTexture2D(j, str, iArr[0], width, height, i);
    }

    private static native long nativeCreateTexture2D(long j, String str, int i, int i2, int i3, int i4);

    public static long loadTexture(String str, String str2, boolean z, long j, int i) {
        Bitmap bitmap = getBitmap(str, z);
        if (bitmap == null || bitmap.getConfig() != Bitmap.Config.ARGB_8888) {
            return 0L;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width == 0 || height == 0) {
            return 0L;
        }
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, iArr[0]);
        GLES20.glTexImage2D(3553, 0, 6408, width, height, 0, 6408, 5121, null);
        GLES20.glTexParameterf(3553, 10241, 9728.0f);
        GLES20.glTexParameterf(3553, 10240, 9729.0f);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLUtils.texSubImage2D(3553, 0, 0, 0, bitmap);
        bitmap.recycle();
        return nativeCreateTexture2D(j, str2, iArr[0], width, height, i);
    }
}
