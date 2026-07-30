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
import p149l.g23;
import p149l.h01;
import p149l.ig3;
import p149l.kx50;
import p149l.kxv;
import p149l.o23;
import p149l.px50;
import p149l.q7j0;
import p149l.qf80;
import p149l.rvc0;
import p149l.rvk;
import p149l.sck0;
import p149l.w760;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1093a {

    /* JADX INFO: renamed from: f */
    public static final kx50<DecodeFormat> f4604f = kx50.m147678f("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", DecodeFormat.DEFAULT);

    /* JADX INFO: renamed from: g */
    public static final kx50<PreferredColorSpace> f4605g = kx50.m147678f("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", PreferredColorSpace.SRGB);

    /* JADX INFO: renamed from: h */
    @Deprecated
    public static final kx50<DownsampleStrategy> f4606h = DownsampleStrategy.f4596h;

    /* JADX INFO: renamed from: i */
    public static final kx50<Boolean> f4607i;

    /* JADX INFO: renamed from: j */
    public static final kx50<Boolean> f4608j;

    /* JADX INFO: renamed from: k */
    private static final Set<String> f4609k;

    /* JADX INFO: renamed from: l */
    private static final b f4610l;

    /* JADX INFO: renamed from: m */
    private static final Set<ImageHeaderParser.ImageType> f4611m;

    /* JADX INFO: renamed from: n */
    private static final Queue<BitmapFactory.Options> f4612n;

    /* JADX INFO: renamed from: a */
    private final g23 f4613a;

    /* JADX INFO: renamed from: b */
    private final DisplayMetrics f4614b;

    /* JADX INFO: renamed from: c */
    private final h01 f4615c;

    /* JADX INFO: renamed from: d */
    private final List<ImageHeaderParser> f4616d;

    /* JADX INFO: renamed from: e */
    private final rvk f4617e = rvk.m181299a();

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.a$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo5546a();

        /* JADX INFO: renamed from: b */
        void mo5547b(g23 g23Var, Bitmap bitmap) throws IOException;
    }

    static {
        Boolean bool = Boolean.FALSE;
        f4607i = kx50.m147678f("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        f4608j = kx50.m147678f("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
        f4609k = Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f4610l = new a();
        f4611m = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        f4612n = sck0.m183406f(0);
    }

    public C1093a(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, g23 g23Var, h01 h01Var) {
        this.f4616d = list;
        this.f4614b = (DisplayMetrics) qf80.m174276d(displayMetrics);
        this.f4613a = (g23) qf80.m174276d(g23Var);
        this.f4615c = (h01) qf80.m174276d(h01Var);
    }

    /* JADX INFO: renamed from: a */
    private static int m5520a(double d) {
        int iM5528l = m5528l(d);
        int iM5537x = m5537x(((double) iM5528l) * d);
        return m5537x((d / ((double) (iM5537x / iM5528l))) * ((double) iM5537x));
    }

    /* JADX INFO: renamed from: b */
    private void m5521b(InterfaceC1094b interfaceC1094b, DecodeFormat decodeFormat, boolean z, boolean z2, BitmapFactory.Options options, int i, int i2) {
        boolean zHasAlpha;
        if (this.f4617e.m181303e(i, i2, options, z, z2)) {
            return;
        }
        if (decodeFormat == DecodeFormat.PREFER_ARGB_8888) {
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            return;
        }
        try {
            zHasAlpha = interfaceC1094b.mo5551d().hasAlpha();
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
    private static void m5522c(ImageHeaderParser.ImageType imageType, InterfaceC1094b interfaceC1094b, b bVar, g23 g23Var, DownsampleStrategy downsampleStrategy, int i, int i2, int i3, int i4, int i5, BitmapFactory.Options options) throws IOException {
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
        if (m5531r(i)) {
            i7 = i2;
            i6 = i3;
        } else {
            i6 = i2;
            i7 = i3;
        }
        float fMo5516b = downsampleStrategy.mo5516b(i6, i7, i4, i5);
        if (fMo5516b <= 0.0f) {
            throw new IllegalArgumentException("Cannot scale with factor: " + fMo5516b + " from: " + downsampleStrategy + ", source: [" + i2 + BaseSei.f13930X + i3 + "], target: [" + i4 + BaseSei.f13930X + i5 + Constants.AES_SUFFIX);
        }
        DownsampleStrategy.SampleSizeRounding sampleSizeRoundingMo5515a = downsampleStrategy.mo5515a(i6, i7, i4, i5);
        if (sampleSizeRoundingMo5515a == null) {
            ig3.m135964a("Cannot round with null rounding");
            return;
        }
        float f = i6;
        float f2 = i7;
        int iM5537x = i6 / m5537x(fMo5516b * f);
        int iM5537x2 = i7 / m5537x(fMo5516b * f2);
        DownsampleStrategy.SampleSizeRounding sampleSizeRounding = DownsampleStrategy.SampleSizeRounding.MEMORY;
        int iMax = Math.max(1, Integer.highestOneBit(sampleSizeRoundingMo5515a == sampleSizeRounding ? Math.max(iM5537x, iM5537x2) : Math.min(iM5537x, iM5537x2)));
        if (sampleSizeRoundingMo5515a == sampleSizeRounding && iMax < 1.0f / fMo5516b) {
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
        } else if (imageType == ImageHeaderParser.ImageType.WEBP || imageType == ImageHeaderParser.ImageType.WEBP_A) {
            float f4 = iMax;
            iFloor = Math.round(f / f4);
            iFloor2 = Math.round(f2 / f4);
        } else if (i6 % iMax == 0 && i7 % iMax == 0) {
            iFloor = i6 / iMax;
            iFloor2 = i7 / iMax;
        } else {
            int[] iArrM5529m = m5529m(interfaceC1094b, options, bVar, g23Var);
            iFloor = iArrM5529m[0];
            iFloor2 = iArrM5529m[1];
        }
        double dMo5516b = downsampleStrategy.mo5516b(iFloor, iFloor2, i4, i5);
        options.inTargetDensity = m5520a(dMo5516b);
        options.inDensity = m5528l(dMo5516b);
        if (m5532s(options)) {
            options.inScaled = true;
        } else {
            options.inTargetDensity = 0;
            options.inDensity = 0;
        }
        Log.isLoggable("Downsampler", 2);
    }

    /* JADX INFO: renamed from: e */
    private rvc0<Bitmap> m5523e(InterfaceC1094b interfaceC1094b, int i, int i2, px50 px50Var, b bVar) throws IOException {
        byte[] bArr = (byte[]) this.f4615c.mo128942c(65536, byte[].class);
        BitmapFactory.Options optionsM5527k = m5527k();
        optionsM5527k.inTempStorage = bArr;
        DecodeFormat decodeFormat = (DecodeFormat) px50Var.m171822c(f4604f);
        PreferredColorSpace preferredColorSpace = (PreferredColorSpace) px50Var.m171822c(f4605g);
        DownsampleStrategy downsampleStrategy = (DownsampleStrategy) px50Var.m171822c(DownsampleStrategy.f4596h);
        boolean zBooleanValue = ((Boolean) px50Var.m171822c(f4607i)).booleanValue();
        kx50<Boolean> kx50Var = f4608j;
        try {
            return o23.m162285b(m5524h(interfaceC1094b, optionsM5527k, downsampleStrategy, decodeFormat, preferredColorSpace, px50Var.m171822c(kx50Var) != null && ((Boolean) px50Var.m171822c(kx50Var)).booleanValue(), i, i2, zBooleanValue, bVar), this.f4613a);
        } finally {
            m5535v(optionsM5527k);
            this.f4615c.put(bArr);
        }
    }

    /* JADX INFO: renamed from: h */
    private Bitmap m5524h(InterfaceC1094b interfaceC1094b, BitmapFactory.Options options, DownsampleStrategy downsampleStrategy, DecodeFormat decodeFormat, PreferredColorSpace preferredColorSpace, boolean z, int i, int i2, boolean z2, b bVar) throws IOException {
        String str;
        Bitmap bitmap;
        long jM147808b = kxv.m147808b();
        int[] iArrM5529m = m5529m(interfaceC1094b, options, bVar, this.f4613a);
        int i3 = iArrM5529m[0];
        int i4 = iArrM5529m[1];
        String str2 = options.outMimeType;
        boolean z3 = (i3 == -1 || i4 == -1) ? false : z;
        int iMo5549b = interfaceC1094b.mo5549b();
        int iM173284g = q7j0.m173284g(iMo5549b);
        boolean zM173287j = q7j0.m173287j(iMo5549b);
        int i5 = i;
        if (i5 == Integer.MIN_VALUE) {
            i5 = m5531r(iM173284g) ? i4 : i3;
        }
        if (i2 == -2147483648) {
            i2 = m5531r(iM173284g) ? i3 : i4;
        }
        ImageHeaderParser.ImageType imageTypeMo5551d = interfaceC1094b.mo5551d();
        m5522c(imageTypeMo5551d, interfaceC1094b, bVar, this.f4613a, downsampleStrategy, iM173284g, i3, i4, i5, i2, options);
        int i6 = i5;
        int i7 = i2;
        m5521b(interfaceC1094b, decodeFormat, z3, zM173287j, options, i6, i7);
        if (m5539z(imageTypeMo5551d)) {
            if (i3 < 0 || i4 < 0 || !z2) {
                float f = m5532s(options) ? options.inTargetDensity / options.inDensity : 1.0f;
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
                m5538y(options, this.f4613a, i6, i7);
            }
        } else {
            str = "Downsampler";
        }
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 28) {
            options.inPreferredColorSpace = ColorSpace.get((preferredColorSpace == PreferredColorSpace.DISPLAY_P3 && options.outColorSpace != null && options.outColorSpace.isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
        } else if (i8 >= 26) {
            options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        }
        Bitmap bitmapM5525i = m5525i(interfaceC1094b, options, bVar, this.f4613a);
        bVar.mo5547b(this.f4613a, bitmapM5525i);
        if (Log.isLoggable(str, 2)) {
            bitmap = bitmapM5525i;
            m5533t(i3, i4, str2, options, bitmap, i, i2, jM147808b);
        } else {
            bitmap = bitmapM5525i;
        }
        if (bitmap == null) {
            return null;
        }
        bitmap.setDensity(this.f4614b.densityDpi);
        Bitmap bitmapM173288k = q7j0.m173288k(this.f4613a, bitmap, iMo5549b);
        if (!bitmap.equals(bitmapM173288k)) {
            this.f4613a.mo124142c(bitmap);
        }
        return bitmapM173288k;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
    
        throw r0;
     */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.graphics.Bitmap m5525i(com.bumptech.glide.load.resource.bitmap.InterfaceC1094b r4, android.graphics.BitmapFactory.Options r5, com.bumptech.glide.load.resource.bitmap.C1093a.b r6, p149l.g23 r7) throws java.io.IOException {
        /*
            boolean r0 = r5.inJustDecodeBounds
            if (r0 != 0) goto La
            r6.mo5546a()
            r4.mo5548a()
        La:
            int r0 = r5.outWidth
            int r1 = r5.outHeight
            java.lang.String r2 = r5.outMimeType
            java.util.concurrent.locks.Lock r3 = p149l.q7j0.m173283f()
            r3.lock()
            android.graphics.Bitmap r4 = r4.mo5550c(r5)     // Catch: java.lang.IllegalArgumentException -> L23 java.lang.Throwable -> L3f
        L1b:
            java.util.concurrent.locks.Lock r5 = p149l.q7j0.m173283f()
            r5.unlock()
            return r4
        L23:
            r3 = move-exception
            java.io.IOException r0 = m5534u(r3, r0, r1, r2, r5)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r1 = "Downsampler"
            r2 = 3
            android.util.Log.isLoggable(r1, r2)     // Catch: java.lang.Throwable -> L3f
            android.graphics.Bitmap r1 = r5.inBitmap     // Catch: java.lang.Throwable -> L3f
            if (r1 == 0) goto L3e
            r7.mo124142c(r1)     // Catch: java.io.IOException -> L3d java.lang.Throwable -> L3f
            r1 = 0
            r5.inBitmap = r1     // Catch: java.io.IOException -> L3d java.lang.Throwable -> L3f
            android.graphics.Bitmap r4 = m5525i(r4, r5, r6, r7)     // Catch: java.io.IOException -> L3d java.lang.Throwable -> L3f
            goto L1b
        L3d:
            throw r0     // Catch: java.lang.Throwable -> L3f
        L3e:
            throw r0     // Catch: java.lang.Throwable -> L3f
        L3f:
            r4 = move-exception
            java.util.concurrent.locks.Lock r5 = p149l.q7j0.m173283f()
            r5.unlock()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.C1093a.m5525i(com.bumptech.glide.load.resource.bitmap.b, android.graphics.BitmapFactory$Options, com.bumptech.glide.load.resource.bitmap.a$b, l.g23):android.graphics.Bitmap");
    }

    @Nullable
    @TargetApi(19)
    /* JADX INFO: renamed from: j */
    private static String m5526j(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + BaseSei.f13930X + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    /* JADX INFO: renamed from: k */
    private static synchronized BitmapFactory.Options m5527k() {
        BitmapFactory.Options optionsPoll;
        Queue<BitmapFactory.Options> queue = f4612n;
        synchronized (queue) {
            optionsPoll = queue.poll();
        }
        if (optionsPoll == null) {
            optionsPoll = new BitmapFactory.Options();
            m5536w(optionsPoll);
        }
        return optionsPoll;
    }

    /* JADX INFO: renamed from: l */
    private static int m5528l(double d) {
        if (d > 1.0d) {
            d = 1.0d / d;
        }
        return (int) Math.round(d * 2.147483647E9d);
    }

    /* JADX INFO: renamed from: m */
    private static int[] m5529m(InterfaceC1094b interfaceC1094b, BitmapFactory.Options options, b bVar, g23 g23Var) throws IOException {
        options.inJustDecodeBounds = true;
        m5525i(interfaceC1094b, options, bVar, g23Var);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    /* JADX INFO: renamed from: n */
    private static String m5530n(BitmapFactory.Options options) {
        return m5526j(options.inBitmap);
    }

    /* JADX INFO: renamed from: r */
    private static boolean m5531r(int i) {
        return i == 90 || i == 270;
    }

    /* JADX INFO: renamed from: s */
    private static boolean m5532s(BitmapFactory.Options options) {
        int i;
        int i2 = options.inTargetDensity;
        return i2 > 0 && (i = options.inDensity) > 0 && i2 != i;
    }

    /* JADX INFO: renamed from: t */
    private static void m5533t(int i, int i2, String str, BitmapFactory.Options options, Bitmap bitmap, int i3, int i4, long j) {
        m5526j(bitmap);
        m5530n(options);
        int i5 = options.inSampleSize;
        Thread.currentThread().getName();
        kxv.m147807a(j);
    }

    /* JADX INFO: renamed from: u */
    private static IOException m5534u(IllegalArgumentException illegalArgumentException, int i, int i2, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i + ", outHeight: " + i2 + ", outMimeType: " + str + ", inBitmap: " + m5530n(options), illegalArgumentException);
    }

    /* JADX INFO: renamed from: v */
    private static void m5535v(BitmapFactory.Options options) {
        m5536w(options);
        Queue<BitmapFactory.Options> queue = f4612n;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    /* JADX INFO: renamed from: w */
    private static void m5536w(BitmapFactory.Options options) {
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
    private static int m5537x(double d) {
        return (int) (d + 0.5d);
    }

    @TargetApi(26)
    /* JADX INFO: renamed from: y */
    private static void m5538y(BitmapFactory.Options options, g23 g23Var, int i, int i2) {
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
        options.inBitmap = g23Var.mo124144e(i, i2, config);
    }

    /* JADX INFO: renamed from: z */
    private boolean m5539z(ImageHeaderParser.ImageType imageType) {
        return true;
    }

    @RequiresApi(21)
    /* JADX INFO: renamed from: d */
    public rvc0<Bitmap> m5540d(ParcelFileDescriptor parcelFileDescriptor, int i, int i2, px50 px50Var) throws IOException {
        return m5523e(new InterfaceC1094b.b(parcelFileDescriptor, this.f4616d, this.f4615c), i, i2, px50Var, f4610l);
    }

    /* JADX INFO: renamed from: f */
    public rvc0<Bitmap> m5541f(InputStream inputStream, int i, int i2, px50 px50Var) throws IOException {
        return m5542g(inputStream, i, i2, px50Var, f4610l);
    }

    /* JADX INFO: renamed from: g */
    public rvc0<Bitmap> m5542g(InputStream inputStream, int i, int i2, px50 px50Var, b bVar) throws IOException {
        return m5523e(new InterfaceC1094b.a(inputStream, this.f4616d, this.f4615c), i, i2, px50Var, bVar);
    }

    /* JADX INFO: renamed from: o */
    public boolean m5543o(ParcelFileDescriptor parcelFileDescriptor) {
        return w760.m202008b();
    }

    /* JADX INFO: renamed from: p */
    public boolean m5544p(InputStream inputStream) {
        return true;
    }

    /* JADX INFO: renamed from: q */
    public boolean m5545q(ByteBuffer byteBuffer) {
        return true;
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.a$a */
    public class a implements b {
        @Override // com.bumptech.glide.load.resource.bitmap.C1093a.b
        /* JADX INFO: renamed from: a */
        public void mo5546a() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.C1093a.b
        /* JADX INFO: renamed from: b */
        public void mo5547b(g23 g23Var, Bitmap bitmap) {
        }
    }
}
