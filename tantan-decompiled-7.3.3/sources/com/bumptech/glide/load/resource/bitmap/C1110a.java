package com.bumptech.glide.load.resource.bitmap;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.DisplayMetrics;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.PreferredColorSpace;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import p153l.e33;
import p153l.hyk;
import p153l.izv;
import p153l.o01;
import p153l.q560;
import p153l.u3d0;
import p153l.u560;
import p153l.ugj0;
import p153l.vn80;
import p153l.w23;
import p153l.wg3;
import p153l.ylk0;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1110a {

    /* JADX INFO: renamed from: f */
    public static final q560<DecodeFormat> f4626f = q560.m175297f("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", DecodeFormat.DEFAULT);

    /* JADX INFO: renamed from: g */
    public static final q560<PreferredColorSpace> f4627g = q560.m175296e("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace");

    /* JADX INFO: renamed from: h */
    @Deprecated
    public static final q560<DownsampleStrategy> f4628h = DownsampleStrategy.f4608h;

    /* JADX INFO: renamed from: i */
    public static final q560<Boolean> f4629i;

    /* JADX INFO: renamed from: j */
    public static final q560<Boolean> f4630j;

    /* JADX INFO: renamed from: k */
    private static final Set<String> f4631k;

    /* JADX INFO: renamed from: l */
    private static final b f4632l;

    /* JADX INFO: renamed from: m */
    private static final Set<ImageHeaderParser.ImageType> f4633m;

    /* JADX INFO: renamed from: n */
    private static final Queue<BitmapFactory.Options> f4634n;

    /* JADX INFO: renamed from: a */
    private final w23 f4635a;

    /* JADX INFO: renamed from: b */
    private final DisplayMetrics f4636b;

    /* JADX INFO: renamed from: c */
    private final o01 f4637c;

    /* JADX INFO: renamed from: d */
    private final List<ImageHeaderParser> f4638d;

    /* JADX INFO: renamed from: e */
    private final hyk f4639e = hyk.m137743b();

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.a$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo5589a();

        /* JADX INFO: renamed from: b */
        void mo5590b(w23 w23Var, Bitmap bitmap) throws IOException;
    }

    static {
        Boolean bool = Boolean.FALSE;
        f4629i = q560.m175297f("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        f4630j = q560.m175297f("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
        f4631k = Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f4632l = new a();
        f4633m = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        f4634n = ylk0.m216582f(0);
    }

    public C1110a(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, w23 w23Var, o01 o01Var) {
        this.f4638d = list;
        this.f4636b = (DisplayMetrics) vn80.m201944d(displayMetrics);
        this.f4635a = (w23) vn80.m201944d(w23Var);
        this.f4637c = (o01) vn80.m201944d(o01Var);
    }

    /* JADX INFO: renamed from: a */
    private static int m5563a(double d) {
        int iM5571l = m5571l(d);
        int iM5580x = m5580x(((double) iM5571l) * d);
        return m5580x((d / ((double) (iM5580x / iM5571l))) * ((double) iM5580x));
    }

    /* JADX INFO: renamed from: b */
    private void m5564b(InterfaceC1111b interfaceC1111b, DecodeFormat decodeFormat, boolean z, boolean z2, BitmapFactory.Options options, int i, int i2) {
        boolean zHasAlpha;
        if (this.f4639e.m137750i(i, i2, options, z, z2)) {
            return;
        }
        if (decodeFormat == DecodeFormat.PREFER_ARGB_8888) {
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            return;
        }
        try {
            zHasAlpha = interfaceC1111b.mo5594d().hasAlpha();
        } catch (IOException unused) {
            if (Log.isLoggable("Downsampler", 3)) {
                Objects.toString(decodeFormat);
            }
            zHasAlpha = false;
        }
        Bitmap.Config config = zHasAlpha ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
        options.inPreferredConfig = config;
        if (config == Bitmap.Config.RGB_565) {
            options.inDither = true;
        }
    }

    /* JADX INFO: renamed from: c */
    private static void m5565c(ImageHeaderParser.ImageType imageType, InterfaceC1111b interfaceC1111b, b bVar, w23 w23Var, DownsampleStrategy downsampleStrategy, int i, int i2, int i3, int i4, int i5, BitmapFactory.Options options) throws IOException {
        int i6;
        int i7;
        int iFloor;
        int iFloor2;
        if (i2 <= 0 || i3 <= 0) {
            if (Log.isLoggable("Downsampler", 3)) {
                Objects.toString(imageType);
                return;
            }
            return;
        }
        if (m5574r(i)) {
            i7 = i2;
            i6 = i3;
        } else {
            i6 = i2;
            i7 = i3;
        }
        float fMo5543b = downsampleStrategy.mo5543b(i6, i7, i4, i5);
        if (fMo5543b <= 0.0f) {
            throw new IllegalArgumentException("Cannot scale with factor: " + fMo5543b + " from: " + downsampleStrategy + ", source: [" + i2 + BaseSei.f14624X + i3 + "], target: [" + i4 + BaseSei.f14624X + i5 + Constants.AES_SUFFIX);
        }
        DownsampleStrategy.SampleSizeRounding sampleSizeRoundingMo5542a = downsampleStrategy.mo5542a(i6, i7, i4, i5);
        if (sampleSizeRoundingMo5542a == null) {
            wg3.m206174a("Cannot round with null rounding");
            return;
        }
        float f = i6;
        float f2 = i7;
        int iM5580x = i6 / m5580x(fMo5543b * f);
        int iM5580x2 = i7 / m5580x(fMo5543b * f2);
        DownsampleStrategy.SampleSizeRounding sampleSizeRounding = DownsampleStrategy.SampleSizeRounding.MEMORY;
        int iMax = Math.max(1, Integer.highestOneBit(sampleSizeRoundingMo5542a == sampleSizeRounding ? Math.max(iM5580x, iM5580x2) : Math.min(iM5580x, iM5580x2)));
        if (sampleSizeRoundingMo5542a == sampleSizeRounding && iMax < 1.0f / fMo5543b) {
            iMax <<= 1;
        }
        options.inSampleSize = iMax;
        if (imageType == ImageHeaderParser.ImageType.JPEG) {
            float fMin = Math.min(iMax, 8);
            iFloor = (int) Math.ceil(f / fMin);
            iFloor2 = (int) Math.ceil(f2 / fMin);
            int i8 = iMax / 8;
            if (i8 > 0) {
                iFloor /= i8;
                iFloor2 /= i8;
            }
        } else if (imageType == ImageHeaderParser.ImageType.PNG || imageType == ImageHeaderParser.ImageType.PNG_A) {
            float f3 = iMax;
            iFloor = (int) Math.floor(f / f3);
            iFloor2 = (int) Math.floor(f2 / f3);
        } else if (imageType.isWebp()) {
            float f4 = iMax;
            iFloor = Math.round(f / f4);
            iFloor2 = Math.round(f2 / f4);
        } else if (i6 % iMax == 0 && i7 % iMax == 0) {
            iFloor = i6 / iMax;
            iFloor2 = i7 / iMax;
        } else {
            int[] iArrM5572m = m5572m(interfaceC1111b, options, bVar, w23Var);
            iFloor = iArrM5572m[0];
            iFloor2 = iArrM5572m[1];
        }
        double dMo5543b = downsampleStrategy.mo5543b(iFloor, iFloor2, i4, i5);
        options.inTargetDensity = m5563a(dMo5543b);
        options.inDensity = m5571l(dMo5543b);
        if (m5575s(options)) {
            options.inScaled = true;
        } else {
            options.inTargetDensity = 0;
            options.inDensity = 0;
        }
        Log.isLoggable("Downsampler", 2);
    }

    /* JADX INFO: renamed from: e */
    private u3d0<Bitmap> m5566e(InterfaceC1111b interfaceC1111b, int i, int i2, u560 u560Var, b bVar) throws IOException {
        byte[] bArr = (byte[]) this.f4637c.mo165411c(65536, byte[].class);
        BitmapFactory.Options optionsM5570k = m5570k();
        optionsM5570k.inTempStorage = bArr;
        DecodeFormat decodeFormat = (DecodeFormat) u560Var.m194542c(f4626f);
        PreferredColorSpace preferredColorSpace = (PreferredColorSpace) u560Var.m194542c(f4627g);
        DownsampleStrategy downsampleStrategy = (DownsampleStrategy) u560Var.m194542c(DownsampleStrategy.f4608h);
        boolean zBooleanValue = ((Boolean) u560Var.m194542c(f4629i)).booleanValue();
        q560<Boolean> q560Var = f4630j;
        try {
            return e33.m119246b(m5567h(interfaceC1111b, optionsM5570k, downsampleStrategy, decodeFormat, preferredColorSpace, u560Var.m194542c(q560Var) != null && ((Boolean) u560Var.m194542c(q560Var)).booleanValue(), i, i2, zBooleanValue, bVar), this.f4635a);
        } finally {
            m5578v(optionsM5570k);
            this.f4637c.put(bArr);
        }
    }

    /* JADX INFO: renamed from: h */
    private Bitmap m5567h(InterfaceC1111b interfaceC1111b, BitmapFactory.Options options, DownsampleStrategy downsampleStrategy, DecodeFormat decodeFormat, PreferredColorSpace preferredColorSpace, boolean z, int i, int i2, boolean z2, b bVar) throws IOException {
        String str;
        Bitmap bitmap;
        long jM142879b = izv.m142879b();
        int[] iArrM5572m = m5572m(interfaceC1111b, options, bVar, this.f4635a);
        int i3 = iArrM5572m[0];
        int i4 = iArrM5572m[1];
        String str2 = options.outMimeType;
        boolean z3 = (i3 == -1 || i4 == -1) ? false : z;
        int iMo5592b = interfaceC1111b.mo5592b();
        int iM195912i = ugj0.m195912i(iMo5592b);
        boolean zM195915l = ugj0.m195915l(iMo5592b);
        int i5 = i;
        if (i5 == Integer.MIN_VALUE) {
            i5 = m5574r(iM195912i) ? i4 : i3;
        }
        if (i2 == -2147483648) {
            i2 = m5574r(iM195912i) ? i3 : i4;
        }
        ImageHeaderParser.ImageType imageTypeMo5594d = interfaceC1111b.mo5594d();
        m5565c(imageTypeMo5594d, interfaceC1111b, bVar, this.f4635a, downsampleStrategy, iM195912i, i3, i4, i5, i2, options);
        int i6 = i5;
        int i7 = i2;
        m5564b(interfaceC1111b, decodeFormat, z3, zM195915l, options, i6, i7);
        if (m5582z(imageTypeMo5594d)) {
            if (i3 < 0 || i4 < 0 || !z2) {
                float f = m5575s(options) ? options.inTargetDensity / options.inDensity : 1.0f;
                float f2 = options.inSampleSize;
                int iCeil = (int) Math.ceil(i3 / f2);
                int iCeil2 = (int) Math.ceil(i4 / f2);
                int iRound = Math.round(iCeil * f);
                int iRound2 = Math.round(iCeil2 * f);
                str = "Downsampler";
                Log.isLoggable(str, 2);
                i7 = iRound2;
                i6 = iRound;
            } else {
                str = "Downsampler";
            }
            if (i6 > 0 && i7 > 0) {
                m5581y(options, this.f4635a, i6, i7);
            }
        } else {
            str = "Downsampler";
        }
        if (preferredColorSpace != null) {
            int i8 = Build.VERSION.SDK_INT;
            if (i8 >= 28) {
                options.inPreferredColorSpace = ColorSpace.get((preferredColorSpace == PreferredColorSpace.DISPLAY_P3 && options.outColorSpace != null && options.outColorSpace.isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
            } else if (i8 >= 26) {
                options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            }
        }
        Bitmap bitmapM5568i = m5568i(interfaceC1111b, options, bVar, this.f4635a);
        bVar.mo5590b(this.f4635a, bitmapM5568i);
        if (Log.isLoggable(str, 2)) {
            bitmap = bitmapM5568i;
            m5576t(i3, i4, str2, options, bitmap, i, i2, jM142879b);
        } else {
            bitmap = bitmapM5568i;
        }
        if (bitmap == null) {
            return null;
        }
        bitmap.setDensity(this.f4636b.densityDpi);
        Bitmap bitmapM195916m = ugj0.m195916m(this.f4635a, bitmap, iMo5592b);
        if (!bitmap.equals(bitmapM195916m)) {
            this.f4635a.mo191126c(bitmap);
        }
        return bitmapM195916m;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
    
        throw r0;
     */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Bitmap m5568i(InterfaceC1111b interfaceC1111b, BitmapFactory.Options options, b bVar, w23 w23Var) throws IOException {
        Bitmap bitmapM5568i;
        if (!options.inJustDecodeBounds) {
            bVar.mo5589a();
            interfaceC1111b.mo5591a();
        }
        int i = options.outWidth;
        int i2 = options.outHeight;
        String str = options.outMimeType;
        ugj0.m195911h().lock();
        try {
            try {
                bitmapM5568i = interfaceC1111b.mo5593c(options);
            } catch (IllegalArgumentException e) {
                IOException iOExceptionM5577u = m5577u(e, i, i2, str, options);
                Log.isLoggable("Downsampler", 3);
                Bitmap bitmap = options.inBitmap;
                if (bitmap == null) {
                    throw iOExceptionM5577u;
                }
                try {
                    w23Var.mo191126c(bitmap);
                    options.inBitmap = null;
                    bitmapM5568i = m5568i(interfaceC1111b, options, bVar, w23Var);
                } catch (IOException unused) {
                    throw iOExceptionM5577u;
                }
            }
            ugj0.m195911h().unlock();
            return bitmapM5568i;
        } catch (Throwable th) {
            ugj0.m195911h().unlock();
            throw th;
        }
    }

    @Nullable
    @TargetApi(19)
    /* JADX INFO: renamed from: j */
    private static String m5569j(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + BaseSei.f14624X + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    /* JADX INFO: renamed from: k */
    private static synchronized BitmapFactory.Options m5570k() {
        BitmapFactory.Options optionsPoll;
        Queue<BitmapFactory.Options> queue = f4634n;
        synchronized (queue) {
            optionsPoll = queue.poll();
        }
        if (optionsPoll == null) {
            optionsPoll = new BitmapFactory.Options();
            m5579w(optionsPoll);
        }
        return optionsPoll;
    }

    /* JADX INFO: renamed from: l */
    private static int m5571l(double d) {
        if (d > 1.0d) {
            d = 1.0d / d;
        }
        return (int) Math.round(d * 2.147483647E9d);
    }

    /* JADX INFO: renamed from: m */
    private static int[] m5572m(InterfaceC1111b interfaceC1111b, BitmapFactory.Options options, b bVar, w23 w23Var) throws IOException {
        options.inJustDecodeBounds = true;
        m5568i(interfaceC1111b, options, bVar, w23Var);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    /* JADX INFO: renamed from: n */
    private static String m5573n(BitmapFactory.Options options) {
        return m5569j(options.inBitmap);
    }

    /* JADX INFO: renamed from: r */
    private static boolean m5574r(int i) {
        return i == 90 || i == 270;
    }

    /* JADX INFO: renamed from: s */
    private static boolean m5575s(BitmapFactory.Options options) {
        int i;
        int i2 = options.inTargetDensity;
        return i2 > 0 && (i = options.inDensity) > 0 && i2 != i;
    }

    /* JADX INFO: renamed from: t */
    private static void m5576t(int i, int i2, String str, BitmapFactory.Options options, Bitmap bitmap, int i3, int i4, long j) {
        m5569j(bitmap);
        m5573n(options);
        int i5 = options.inSampleSize;
        Thread.currentThread().getName();
        izv.m142878a(j);
    }

    /* JADX INFO: renamed from: u */
    private static IOException m5577u(IllegalArgumentException illegalArgumentException, int i, int i2, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i + ", outHeight: " + i2 + ", outMimeType: " + str + ", inBitmap: " + m5573n(options), illegalArgumentException);
    }

    /* JADX INFO: renamed from: v */
    private static void m5578v(BitmapFactory.Options options) {
        m5579w(options);
        Queue<BitmapFactory.Options> queue = f4634n;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    /* JADX INFO: renamed from: w */
    private static void m5579w(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    /* JADX INFO: renamed from: x */
    private static int m5580x(double d) {
        return (int) (d + 0.5d);
    }

    @TargetApi(26)
    /* JADX INFO: renamed from: y */
    private static void m5581y(BitmapFactory.Options options, w23 w23Var, int i, int i2) {
        Bitmap.Config config;
        if (Build.VERSION.SDK_INT < 26) {
            config = null;
        } else if (options.inPreferredConfig == Bitmap.Config.HARDWARE) {
            return;
        } else {
            config = options.outConfig;
        }
        if (config == null) {
            config = options.inPreferredConfig;
        }
        options.inBitmap = w23Var.mo191128e(i, i2, config);
    }

    /* JADX INFO: renamed from: z */
    private boolean m5582z(ImageHeaderParser.ImageType imageType) {
        return true;
    }

    @RequiresApi(21)
    /* JADX INFO: renamed from: d */
    public u3d0<Bitmap> m5583d(ParcelFileDescriptor parcelFileDescriptor, int i, int i2, u560 u560Var) throws IOException {
        return m5566e(new InterfaceC1111b.c(parcelFileDescriptor, this.f4638d, this.f4637c), i, i2, u560Var, f4632l);
    }

    /* JADX INFO: renamed from: f */
    public u3d0<Bitmap> m5584f(InputStream inputStream, int i, int i2, u560 u560Var, b bVar) throws IOException {
        return m5566e(new InterfaceC1111b.b(inputStream, this.f4638d, this.f4637c), i, i2, u560Var, bVar);
    }

    /* JADX INFO: renamed from: g */
    public u3d0<Bitmap> m5585g(ByteBuffer byteBuffer, int i, int i2, u560 u560Var) throws IOException {
        return m5566e(new InterfaceC1111b.a(byteBuffer, this.f4638d, this.f4637c), i, i2, u560Var, f4632l);
    }

    /* JADX INFO: renamed from: o */
    public boolean m5586o(ParcelFileDescriptor parcelFileDescriptor) {
        return ParcelFileDescriptorRewinder.m5368b();
    }

    /* JADX INFO: renamed from: p */
    public boolean m5587p(InputStream inputStream) {
        return true;
    }

    /* JADX INFO: renamed from: q */
    public boolean m5588q(ByteBuffer byteBuffer) {
        return true;
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.a$a */
    public class a implements b {
        @Override // com.bumptech.glide.load.resource.bitmap.C1110a.b
        /* JADX INFO: renamed from: a */
        public void mo5589a() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.C1110a.b
        /* JADX INFO: renamed from: b */
        public void mo5590b(w23 w23Var, Bitmap bitmap) {
        }
    }
}
