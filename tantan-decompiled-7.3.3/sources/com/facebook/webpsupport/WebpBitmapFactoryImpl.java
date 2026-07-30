package com.facebook.webpsupport;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.util.TypedValue;
import java.io.BufferedInputStream;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import p153l.h4g0;
import p153l.p13;
import p153l.uup0;
import p153l.w6e;
import p153l.wg3;

/* JADX INFO: loaded from: classes6.dex */
@w6e
public class WebpBitmapFactoryImpl implements uup0 {
    private static final int HEADER_SIZE = 20;
    private static final int IN_TEMP_BUFFER_SIZE = 8192;
    private static p13 mBitmapCreator;
    private static uup0.InterfaceC20680a mWebpErrorLogger;

    /* JADX INFO: renamed from: c */
    public static byte[] m9301c(InputStream inputStream, BitmapFactory.Options options) {
        byte[] bArr;
        inputStream.mark(20);
        if (options == null || (bArr = options.inTempStorage) == null || bArr.length < 20) {
            bArr = new byte[20];
        }
        try {
            inputStream.read(bArr, 0, 20);
            inputStream.reset();
            return bArr;
        } catch (IOException unused) {
            return null;
        }
    }

    @w6e
    private static Bitmap createBitmap(int i, int i2, BitmapFactory.Options options) {
        Bitmap bitmap;
        return (options == null || (bitmap = options.inBitmap) == null || !bitmap.isMutable()) ? mBitmapCreator.mo170193a(i, i2, Bitmap.Config.ARGB_8888) : options.inBitmap;
    }

    /* JADX INFO: renamed from: d */
    public static void m9302d(String str) {
    }

    /* JADX INFO: renamed from: e */
    public static InputStream m9303e(InputStream inputStream) {
        return !inputStream.markSupported() ? new BufferedInputStream(inputStream, 20) : inputStream;
    }

    @w6e
    private static byte[] getInTempStorageFromOptions(BitmapFactory.Options options) {
        byte[] bArr;
        return (options == null || (bArr = options.inTempStorage) == null) ? new byte[8192] : bArr;
    }

    @w6e
    private static float getScaleFromOptions(BitmapFactory.Options options) {
        float f = 1.0f;
        if (options != null) {
            int i = options.inSampleSize;
            f = i > 1 ? 1.0f / i : 1.0f;
            if (options.inScaled) {
                int i2 = options.inDensity;
                int i3 = options.inTargetDensity;
                int i4 = options.inScreenDensity;
                if (i2 != 0 && i3 != 0 && i2 != i4) {
                    return i3 / i2;
                }
            }
        }
        return f;
    }

    @w6e
    public static Bitmap hookDecodeByteArray(byte[] bArr, int i, int i2, BitmapFactory.Options options) {
        h4g0.m133574a();
        Bitmap bitmapOriginalDecodeByteArray = originalDecodeByteArray(bArr, i, i2, options);
        if (bitmapOriginalDecodeByteArray == null) {
            m9302d("webp_direct_decode_array_failed_on_no_webp");
        }
        return bitmapOriginalDecodeByteArray;
    }

    @w6e
    public static Bitmap hookDecodeFile(String str, BitmapFactory.Options options) {
        Bitmap bitmapHookDecodeStream = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(str);
            try {
                bitmapHookDecodeStream = hookDecodeStream(fileInputStream, null, options);
                fileInputStream.close();
                return bitmapHookDecodeStream;
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Exception unused) {
            return bitmapHookDecodeStream;
        }
    }

    @w6e
    public static Bitmap hookDecodeFileDescriptor(FileDescriptor fileDescriptor, Rect rect, BitmapFactory.Options options) {
        h4g0.m133574a();
        long jNativeSeek = nativeSeek(fileDescriptor, 0L, false);
        if (jNativeSeek == -1) {
            Bitmap bitmapHookDecodeStream = hookDecodeStream(new FileInputStream(fileDescriptor), rect, options);
            setPaddingDefaultValues(rect);
            return bitmapHookDecodeStream;
        }
        InputStream inputStreamM9303e = m9303e(new FileInputStream(fileDescriptor));
        try {
            m9301c(inputStreamM9303e, options);
            nativeSeek(fileDescriptor, jNativeSeek, true);
            Bitmap bitmapOriginalDecodeFileDescriptor = originalDecodeFileDescriptor(fileDescriptor, rect, options);
            if (bitmapOriginalDecodeFileDescriptor == null) {
                m9302d("webp_direct_decode_fd_failed_on_no_webp");
            }
            return bitmapOriginalDecodeFileDescriptor;
        } finally {
            try {
                inputStreamM9303e.close();
            } catch (Throwable unused) {
            }
        }
    }

    @w6e
    public static Bitmap hookDecodeResource(Resources resources, int i, BitmapFactory.Options options) {
        Bitmap bitmapHookDecodeResourceStream;
        TypedValue typedValue = new TypedValue();
        try {
            InputStream inputStreamOpenRawResource = resources.openRawResource(i, typedValue);
            try {
                bitmapHookDecodeResourceStream = hookDecodeResourceStream(resources, typedValue, inputStreamOpenRawResource, null, options);
                if (inputStreamOpenRawResource != null) {
                    try {
                        inputStreamOpenRawResource.close();
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th) {
                if (inputStreamOpenRawResource != null) {
                    try {
                        inputStreamOpenRawResource.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Exception unused2) {
            bitmapHookDecodeResourceStream = null;
        }
        if (bitmapHookDecodeResourceStream != null || options == null || options.inBitmap == null) {
            return bitmapHookDecodeResourceStream;
        }
        wg3.m206174a("Problem decoding into existing bitmap");
        return null;
    }

    @w6e
    public static Bitmap hookDecodeResourceStream(Resources resources, TypedValue typedValue, InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        if (options == null) {
            options = new BitmapFactory.Options();
        }
        if (options.inDensity == 0 && typedValue != null) {
            int i = typedValue.density;
            if (i == 0) {
                options.inDensity = 160;
            } else if (i != 65535) {
                options.inDensity = i;
            }
        }
        if (options.inTargetDensity == 0 && resources != null) {
            options.inTargetDensity = resources.getDisplayMetrics().densityDpi;
        }
        return hookDecodeStream(inputStream, rect, options);
    }

    @w6e
    public static Bitmap hookDecodeStream(InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        h4g0.m133574a();
        Bitmap bitmapOriginalDecodeStream = originalDecodeStream(m9303e(inputStream), rect, options);
        if (bitmapOriginalDecodeStream == null) {
            m9302d("webp_direct_decode_stream_failed_on_no_webp");
        }
        return bitmapOriginalDecodeStream;
    }

    @w6e
    private static native Bitmap nativeDecodeByteArray(byte[] bArr, int i, int i2, BitmapFactory.Options options, float f, byte[] bArr2);

    @w6e
    private static native Bitmap nativeDecodeStream(InputStream inputStream, BitmapFactory.Options options, float f, byte[] bArr);

    @w6e
    private static native long nativeSeek(FileDescriptor fileDescriptor, long j, boolean z);

    @w6e
    private static Bitmap originalDecodeByteArray(byte[] bArr, int i, int i2, BitmapFactory.Options options) {
        return BitmapFactory.decodeByteArray(bArr, i, i2, options);
    }

    @w6e
    private static Bitmap originalDecodeFile(String str, BitmapFactory.Options options) {
        return BitmapFactory.decodeFile(str, options);
    }

    @w6e
    private static Bitmap originalDecodeFileDescriptor(FileDescriptor fileDescriptor, Rect rect, BitmapFactory.Options options) {
        return BitmapFactory.decodeFileDescriptor(fileDescriptor, rect, options);
    }

    @w6e
    private static Bitmap originalDecodeResource(Resources resources, int i, BitmapFactory.Options options) {
        return BitmapFactory.decodeResource(resources, i, options);
    }

    @w6e
    private static Bitmap originalDecodeResourceStream(Resources resources, TypedValue typedValue, InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        return BitmapFactory.decodeResourceStream(resources, typedValue, inputStream, rect, options);
    }

    @w6e
    private static Bitmap originalDecodeStream(InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        return BitmapFactory.decodeStream(inputStream, rect, options);
    }

    @w6e
    private static void setBitmapSize(BitmapFactory.Options options, int i, int i2) {
        if (options != null) {
            options.outWidth = i;
            options.outHeight = i2;
        }
    }

    @w6e
    private static boolean setOutDimensions(BitmapFactory.Options options, int i, int i2) {
        if (options == null || !options.inJustDecodeBounds) {
            return false;
        }
        options.outWidth = i;
        options.outHeight = i2;
        return true;
    }

    @w6e
    private static void setPaddingDefaultValues(Rect rect) {
        if (rect != null) {
            rect.top = -1;
            rect.left = -1;
            rect.bottom = -1;
            rect.right = -1;
        }
    }

    @w6e
    @SuppressLint({"NewApi"})
    private static boolean shouldPremultiply(BitmapFactory.Options options) {
        if (options != null) {
            return options.inPremultiplied;
        }
        return true;
    }

    @Override // p153l.uup0
    /* JADX INFO: renamed from: a */
    public void mo9304a(p13 p13Var) {
        mBitmapCreator = p13Var;
    }

    @Override // p153l.uup0
    /* JADX INFO: renamed from: b */
    public Bitmap mo9305b(FileDescriptor fileDescriptor, Rect rect, BitmapFactory.Options options) {
        return hookDecodeFileDescriptor(fileDescriptor, rect, options);
    }

    @w6e
    private static Bitmap originalDecodeByteArray(byte[] bArr, int i, int i2) {
        return BitmapFactory.decodeByteArray(bArr, i, i2);
    }

    @w6e
    private static Bitmap originalDecodeFile(String str) {
        return BitmapFactory.decodeFile(str);
    }

    @w6e
    private static Bitmap originalDecodeFileDescriptor(FileDescriptor fileDescriptor) {
        return BitmapFactory.decodeFileDescriptor(fileDescriptor);
    }

    @w6e
    private static Bitmap originalDecodeResource(Resources resources, int i) {
        return BitmapFactory.decodeResource(resources, i);
    }

    @w6e
    private static Bitmap originalDecodeStream(InputStream inputStream) {
        return BitmapFactory.decodeStream(inputStream);
    }

    @w6e
    public static Bitmap hookDecodeByteArray(byte[] bArr, int i, int i2) {
        return hookDecodeByteArray(bArr, i, i2, null);
    }

    @w6e
    public static Bitmap hookDecodeStream(InputStream inputStream) {
        return hookDecodeStream(inputStream, null, null);
    }

    @w6e
    public static Bitmap hookDecodeFile(String str) {
        return hookDecodeFile(str, null);
    }

    @w6e
    public static Bitmap hookDecodeResource(Resources resources, int i) {
        return hookDecodeResource(resources, i, null);
    }

    @w6e
    public static Bitmap hookDecodeFileDescriptor(FileDescriptor fileDescriptor) {
        return hookDecodeFileDescriptor(fileDescriptor, null, null);
    }
}
