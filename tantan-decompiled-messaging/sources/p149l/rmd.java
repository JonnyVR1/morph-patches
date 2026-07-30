package p149l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import android.os.Build;
import androidx.annotation.VisibleForTesting;
import com.facebook.imagepipeline.platform.PreverificationHelper;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public abstract class rmd implements t480 {

    /* JADX INFO: renamed from: f */
    public static final Class<?> f160080f = rmd.class;

    /* JADX INFO: renamed from: g */
    public static final byte[] f160081g = {-1, -39};

    /* JADX INFO: renamed from: a */
    public final f23 f160082a;

    /* JADX INFO: renamed from: b */
    public boolean f160083b;

    /* JADX INFO: renamed from: c */
    public boolean f160084c;

    /* JADX INFO: renamed from: d */
    public final PreverificationHelper f160085d;

    /* JADX INFO: renamed from: e */
    @VisibleForTesting
    public final hb80<ByteBuffer> f160086e;

    public rmd(f23 f23Var, hb80<ByteBuffer> hb80Var, v480 v480Var) {
        this.f160085d = Build.VERSION.SDK_INT >= 26 ? new PreverificationHelper() : null;
        this.f160082a = f23Var;
        if (f23Var instanceof lee) {
            this.f160083b = v480Var.getAvoidPoolGet();
            this.f160084c = v480Var.getAvoidPoolRelease();
        }
        this.f160086e = hb80Var;
    }

    /* JADX INFO: renamed from: e */
    public static BitmapFactory.Options m179976e(jze jzeVar, Bitmap.Config config, boolean z) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = jzeVar.m143901J();
        options.inJustDecodeBounds = true;
        options.inDither = true;
        boolean z2 = Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE;
        if (!z2) {
            options.inPreferredConfig = config;
        }
        options.inMutable = true;
        if (!z) {
            BitmapFactory.decodeStream(jzeVar.m143899H(), null, options);
            if (options.outWidth == -1 || options.outHeight == -1) {
                x9g0.m207497a();
                return null;
            }
        }
        if (z2) {
            options.inPreferredConfig = config;
        }
        options.inJustDecodeBounds = false;
        return options;
    }

    @Override // p149l.t480
    /* JADX INFO: renamed from: a */
    public fa5<Bitmap> mo8451a(jze jzeVar, Bitmap.Config config, Rect rect, ColorSpace colorSpace) {
        BitmapFactory.Options optionsM179976e = m179976e(jzeVar, config, this.f160083b);
        boolean z = optionsM179976e.inPreferredConfig != Bitmap.Config.ARGB_8888;
        try {
            return m179977c((InputStream) rf80.m179116g(jzeVar.m143899H()), optionsM179976e, rect, colorSpace);
        } catch (RuntimeException e) {
            if (z) {
                return mo8451a(jzeVar, Bitmap.Config.ARGB_8888, rect, colorSpace);
            }
            throw e;
        }
    }

    @Override // p149l.t480
    /* JADX INFO: renamed from: b */
    public fa5<Bitmap> mo8452b(jze jzeVar, Bitmap.Config config, Rect rect, int i, ColorSpace colorSpace) {
        boolean zM143906T = jzeVar.m143906T(i);
        BitmapFactory.Options optionsM179976e = m179976e(jzeVar, config, this.f160083b);
        InputStream inputStreamM143899H = jzeVar.m143899H();
        rf80.m179116g(inputStreamM143899H);
        if (jzeVar.m143902M() > i) {
            inputStreamM143899H = new dmr(inputStreamM143899H, i);
        }
        if (!zM143906T) {
            inputStreamM143899H = new quh0(inputStreamM143899H, f160081g);
        }
        boolean z = optionsM179976e.inPreferredConfig != Bitmap.Config.ARGB_8888;
        try {
            try {
                fa5<Bitmap> fa5VarM179977c = m179977c(inputStreamM143899H, optionsM179976e, rect, colorSpace);
                try {
                    inputStreamM143899H.close();
                    return fa5VarM179977c;
                } catch (IOException e) {
                    e.printStackTrace();
                    return fa5VarM179977c;
                }
            } catch (Throwable th) {
                try {
                    inputStreamM143899H.close();
                    throw th;
                } catch (IOException e2) {
                    e2.printStackTrace();
                    throw th;
                }
            }
        } catch (RuntimeException e3) {
            if (!z) {
                throw e3;
            }
            fa5<Bitmap> fa5VarMo8452b = mo8452b(jzeVar, Bitmap.Config.ARGB_8888, rect, i, colorSpace);
            try {
                inputStreamM143899H.close();
            } catch (IOException e4) {
                e4.printStackTrace();
            }
            return fa5VarMo8452b;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x005c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x005e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0073  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c5 A[Catch: all -> 0x00a1, RuntimeException -> 0x00a4, IllegalArgumentException -> 0x00a6, TRY_LEAVE, TryCatch #2 {RuntimeException -> 0x00a4, blocks: (B:36:0x007b, B:39:0x0085, B:49:0x009d, B:68:0x00c5, B:64:0x00be, B:65:0x00c1, B:62:0x00b8), top: B:98:0x007b, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ed  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX INFO: renamed from: c */
    public final fa5<Bitmap> m179977c(InputStream inputStream, BitmapFactory.Options options, Rect rect, ColorSpace colorSpace) {
        Bitmap bitmap;
        Bitmap bitmap2;
        ByteBuffer byteBufferAcquire;
        Bitmap bitmapDecodeStream;
        BitmapRegionDecoder bitmapRegionDecoderNewInstance;
        PreverificationHelper preverificationHelper;
        rf80.m179116g(inputStream);
        int i = options.outWidth;
        int iHeight = options.outHeight;
        ?? r0 = i;
        if (rect != null) {
            int iWidth = rect.width() / options.inSampleSize;
            iHeight = rect.height() / options.inSampleSize;
            r0 = iWidth;
        }
        int i2 = Build.VERSION.SDK_INT;
        boolean z = i2 >= 26 && (preverificationHelper = this.f160085d) != null && preverificationHelper.shouldUseHardwareBitmapConfig(options.inPreferredConfig);
        BitmapRegionDecoder bitmapRegionDecoder = 0;
        try {
            try {
                try {
                    if (rect != null || !z) {
                        if (rect != null && z) {
                            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                        }
                        if (!this.f160083b) {
                            bitmap = this.f160082a.get(mo157191d(r0, iHeight, options));
                            if (bitmap == null) {
                                bitmap2 = bitmap;
                                jfd0.m141176a("BitmapPool.get returned null");
                                return null;
                            }
                        }
                        bitmap2 = bitmap;
                        options.inBitmap = bitmap2;
                        if (i2 >= 26) {
                            if (colorSpace == null) {
                                colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
                            }
                            options.inPreferredColorSpace = colorSpace;
                        }
                        byteBufferAcquire = this.f160086e.acquire();
                        if (byteBufferAcquire == null) {
                            byteBufferAcquire = ByteBuffer.allocate(lgd.m149774c());
                        }
                        options.inTempStorage = byteBufferAcquire.array();
                        if (rect != null || bitmap2 == 0) {
                            bitmapDecodeStream = null;
                        } else {
                            Bitmap.Config config = options.inPreferredConfig;
                            try {
                                if (config != null) {
                                    try {
                                        bitmap2.reconfigure(r0, iHeight, config);
                                        bitmapRegionDecoderNewInstance = BitmapRegionDecoder.newInstance(inputStream, true);
                                        if (bitmapRegionDecoderNewInstance != null) {
                                            try {
                                                bitmapDecodeStream = bitmapRegionDecoderNewInstance.decodeRegion(rect, options);
                                            } catch (IOException unused) {
                                                tsf.m190540f(f160080f, "Could not decode region %s, decoding full bitmap instead.", rect);
                                                if (bitmapRegionDecoderNewInstance != null) {
                                                    bitmapRegionDecoderNewInstance.recycle();
                                                }
                                                bitmapDecodeStream = null;
                                            }
                                        } else {
                                            bitmapDecodeStream = null;
                                        }
                                        if (bitmapRegionDecoderNewInstance != null) {
                                            bitmapRegionDecoderNewInstance.recycle();
                                        }
                                    } catch (IOException unused2) {
                                        bitmapRegionDecoderNewInstance = null;
                                    } catch (Throwable th) {
                                        th = th;
                                        if (bitmapRegionDecoder != 0) {
                                            bitmapRegionDecoder.recycle();
                                        }
                                        throw th;
                                    }
                                } else {
                                    bitmapDecodeStream = null;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                bitmapRegionDecoder = r0;
                            }
                        }
                        if (bitmapDecodeStream == null) {
                            bitmapDecodeStream = BitmapFactory.decodeStream(inputStream, null, options);
                        }
                        this.f160086e.release(byteBufferAcquire);
                        if (bitmap2 != 0 || bitmap2 == bitmapDecodeStream) {
                            return this.f160084c ? fa5.m120147Y(bitmapDecodeStream, C19735a.INSTANCE) : fa5.m120147Y(bitmapDecodeStream, this.f160082a);
                        }
                        this.f160082a.release(bitmap2);
                        if (bitmapDecodeStream != null) {
                            bitmapDecodeStream.recycle();
                        }
                        ohg0.m164364a();
                        return null;
                    }
                    options.inMutable = false;
                    options.inTempStorage = byteBufferAcquire.array();
                    if (rect != null) {
                        bitmapDecodeStream = null;
                    } else {
                        bitmapDecodeStream = null;
                    }
                    if (bitmapDecodeStream == null) {
                        bitmapDecodeStream = BitmapFactory.decodeStream(inputStream, null, options);
                    }
                    this.f160086e.release(byteBufferAcquire);
                    if (bitmap2 != 0) {
                    }
                    if (this.f160084c) {
                    }
                } catch (RuntimeException e) {
                    if (bitmap2 != 0) {
                        this.f160082a.release(bitmap2);
                    }
                    throw e;
                }
            } catch (IllegalArgumentException e2) {
                if (bitmap2 != 0) {
                    this.f160082a.release(bitmap2);
                }
                try {
                    inputStream.reset();
                    Bitmap bitmapDecodeStream2 = BitmapFactory.decodeStream(inputStream);
                    if (bitmapDecodeStream2 == null) {
                        throw e2;
                    }
                    fa5<Bitmap> fa5VarM120147Y = fa5.m120147Y(bitmapDecodeStream2, jgf0.m141281a());
                    this.f160086e.release(byteBufferAcquire);
                    return fa5VarM120147Y;
                } catch (IOException unused3) {
                    throw e2;
                }
            }
        } catch (Throwable th3) {
            this.f160086e.release(byteBufferAcquire);
            throw th3;
        }
        bitmap2 = 0;
        bitmap2 = bitmap;
        options.inBitmap = bitmap2;
        if (i2 >= 26) {
            if (colorSpace == null) {
                colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            }
            options.inPreferredColorSpace = colorSpace;
        }
        byteBufferAcquire = this.f160086e.acquire();
        if (byteBufferAcquire == null) {
            byteBufferAcquire = ByteBuffer.allocate(lgd.m149774c());
        }
    }

    /* JADX INFO: renamed from: d */
    public abstract int mo157191d(int i, int i2, BitmapFactory.Options options);

    /* JADX INFO: renamed from: l.rmd$a */
    public static final class C19735a implements twc0<Bitmap> {
        private static final C19735a INSTANCE = new C19735a();

        @Override // p149l.twc0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void release(Bitmap bitmap) {
        }
    }
}
