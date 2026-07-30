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
import p149l.a13;
import p149l.i5e;
import p149l.ig3;
import p149l.qlp0;
import p149l.yvf0;

/* JADX INFO: loaded from: classes6.dex */
@i5e
public class WebpBitmapFactoryImpl implements qlp0 {
    private static final int HEADER_SIZE = 20;
    private static final int IN_TEMP_BUFFER_SIZE = 8192;
    private static a13 mBitmapCreator;
    private static qlp0.InterfaceC19536a mWebpErrorLogger;

    /* JADX INFO: renamed from: c */
    public static byte[] m9247c(InputStream inputStream, BitmapFactory.Options options) {
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

    @i5e
    private static Bitmap createBitmap(int i, int i2, BitmapFactory.Options options) {
        Bitmap bitmap;
        return (options == null || (bitmap = options.inBitmap) == null || !bitmap.isMutable()) ? mBitmapCreator.mo94506a(i, i2, Bitmap.Config.ARGB_8888) : options.inBitmap;
    }

    /* JADX INFO: renamed from: d */
    public static void m9248d(String str) {
    }

    /* JADX INFO: renamed from: e */
    public static InputStream m9249e(InputStream inputStream) {
        return !inputStream.markSupported() ? new BufferedInputStream(inputStream, 20) : inputStream;
    }

    @i5e
    private static byte[] getInTempStorageFromOptions(BitmapFactory.Options options) {
        byte[] bArr;
        return (options == null || (bArr = options.inTempStorage) == null) ? new byte[8192] : bArr;
    }

    @i5e
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

    @i5e
    public static Bitmap hookDecodeByteArray(byte[] bArr, int i, int i2, BitmapFactory.Options options) {
        yvf0.m216215a();
        Bitmap bitmapOriginalDecodeByteArray = originalDecodeByteArray(bArr, i, i2, options);
        if (bitmapOriginalDecodeByteArray == null) {
            m9248d("webp_direct_decode_array_failed_on_no_webp");
        }
        return bitmapOriginalDecodeByteArray;
    }

    @i5e
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

    @i5e
    public static Bitmap hookDecodeFileDescriptor(FileDescriptor fileDescriptor, Rect rect, BitmapFactory.Options options) {
        yvf0.m216215a();
        long jNativeSeek = nativeSeek(fileDescriptor, 0L, false);
        if (jNativeSeek == -1) {
            Bitmap bitmapHookDecodeStream = hookDecodeStream(new FileInputStream(fileDescriptor), rect, options);
            setPaddingDefaultValues(rect);
            return bitmapHookDecodeStream;
        }
        InputStream inputStreamM9249e = m9249e(new FileInputStream(fileDescriptor));
        try {
            m9247c(inputStreamM9249e, options);
            nativeSeek(fileDescriptor, jNativeSeek, true);
            Bitmap bitmapOriginalDecodeFileDescriptor = originalDecodeFileDescriptor(fileDescriptor, rect, options);
            if (bitmapOriginalDecodeFileDescriptor == null) {
                m9248d("webp_direct_decode_fd_failed_on_no_webp");
            }
            return bitmapOriginalDecodeFileDescriptor;
        } finally {
            try {
                inputStreamM9249e.close();
            } catch (Throwable unused) {
            }
        }
    }

    @i5e
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
        ig3.m135964a("Problem decoding into existing bitmap");
        return null;
    }

    @i5e
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

    @i5e
    public static Bitmap hookDecodeStream(InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        yvf0.m216215a();
        Bitmap bitmapOriginalDecodeStream = originalDecodeStream(m9249e(inputStream), rect, options);
        if (bitmapOriginalDecodeStream == null) {
            m9248d("webp_direct_decode_stream_failed_on_no_webp");
        }
        return bitmapOriginalDecodeStream;
    }

    @i5e
    private static native Bitmap nativeDecodeByteArray(byte[] bArr, int i, int i2, BitmapFactory.Options options, float f, byte[] bArr2);

    @i5e
    private static native Bitmap nativeDecodeStream(InputStream inputStream, BitmapFactory.Options options, float f, byte[] bArr);

    @i5e
    private static native long nativeSeek(FileDescriptor fileDescriptor, long j, boolean z);

    @i5e
    private static Bitmap originalDecodeByteArray(byte[] bArr, int i, int i2, BitmapFactory.Options options) {
        return BitmapFactory.decodeByteArray(bArr, i, i2, options);
    }

    @i5e
    private static Bitmap originalDecodeFile(String str, BitmapFactory.Options options) {
        return BitmapFactory.decodeFile(str, options);
    }

    @i5e
    private static Bitmap originalDecodeFileDescriptor(FileDescriptor fileDescriptor, Rect rect, BitmapFactory.Options options) {
        return BitmapFactory.decodeFileDescriptor(fileDescriptor, rect, options);
    }

    @i5e
    private static Bitmap originalDecodeResource(Resources resources, int i, BitmapFactory.Options options) {
        return BitmapFactory.decodeResource(resources, i, options);
    }

    @i5e
    private static Bitmap originalDecodeResourceStream(Resources resources, TypedValue typedValue, InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        return BitmapFactory.decodeResourceStream(resources, typedValue, inputStream, rect, options);
    }

    @i5e
    private static Bitmap originalDecodeStream(InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        return BitmapFactory.decodeStream(inputStream, rect, options);
    }

    @i5e
    private static void setBitmapSize(BitmapFactory.Options options, int i, int i2) {
        if (options != null) {
            options.outWidth = i;
            options.outHeight = i2;
        }
    }

    @i5e
    private static boolean setOutDimensions(BitmapFactory.Options options, int i, int i2) {
        if (options == null || !options.inJustDecodeBounds) {
            return false;
        }
        options.outWidth = i;
        options.outHeight = i2;
        return true;
    }

    @i5e
    private static void setPaddingDefaultValues(Rect rect) {
        if (rect != null) {
            rect.top = -1;
            rect.left = -1;
            rect.bottom = -1;
            rect.right = -1;
        }
    }

    @i5e
    @SuppressLint({"NewApi"})
    private static boolean shouldPremultiply(BitmapFactory.Options options) {
        if (options != null) {
            return options.inPremultiplied;
        }
        return true;
    }

    @Override // p149l.qlp0
    /* JADX INFO: renamed from: a */
    public void mo9250a(a13 a13Var) {
        mBitmapCreator = a13Var;
    }

    @Override // p149l.qlp0
    /* JADX INFO: renamed from: b */
    public Bitmap mo9251b(FileDescriptor fileDescriptor, Rect rect, BitmapFactory.Options options) {
        return hookDecodeFileDescriptor(fileDescriptor, rect, options);
    }

    @i5e
    private static Bitmap originalDecodeByteArray(byte[] bArr, int i, int i2) {
        return BitmapFactory.decodeByteArray(bArr, i, i2);
    }

    @i5e
    private static Bitmap originalDecodeFile(String str) {
        return BitmapFactory.decodeFile(str);
    }

    @i5e
    private static Bitmap originalDecodeFileDescriptor(FileDescriptor fileDescriptor) {
        return BitmapFactory.decodeFileDescriptor(fileDescriptor);
    }

    @i5e
    private static Bitmap originalDecodeResource(Resources resources, int i) {
        return BitmapFactory.decodeResource(resources, i);
    }

    @i5e
    private static Bitmap originalDecodeStream(InputStream inputStream) {
        return BitmapFactory.decodeStream(inputStream);
    }

    @i5e
    public static Bitmap hookDecodeByteArray(byte[] bArr, int i, int i2) {
        return hookDecodeByteArray(bArr, i, i2, null);
    }

    @i5e
    public static Bitmap hookDecodeStream(InputStream inputStream) {
        return hookDecodeStream(inputStream, null, null);
    }

    @i5e
    public static Bitmap hookDecodeFile(String str) {
        return hookDecodeFile(str, null);
    }

    @i5e
    public static Bitmap hookDecodeResource(Resources resources, int i) {
        return hookDecodeResource(resources, i, null);
    }

    @i5e
    public static Bitmap hookDecodeFileDescriptor(FileDescriptor fileDescriptor) {
        return hookDecodeFileDescriptor(fileDescriptor, null, null);
    }
}
