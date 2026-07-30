package p153l;

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
public abstract class wnd implements zc80 {

    /* JADX INFO: renamed from: f */
    public static final Class<?> f189885f = wnd.class;

    /* JADX INFO: renamed from: g */
    public static final byte[] f189886g = {-1, -39};

    /* JADX INFO: renamed from: a */
    public final v23 f189887a;

    /* JADX INFO: renamed from: b */
    public boolean f189888b;

    /* JADX INFO: renamed from: c */
    public boolean f189889c;

    /* JADX INFO: renamed from: d */
    public final PreverificationHelper f189890d;

    /* JADX INFO: renamed from: e */
    @VisibleForTesting
    public final nj80<ByteBuffer> f189891e;

    public wnd(v23 v23Var, nj80<ByteBuffer> nj80Var, bd80 bd80Var) {
        this.f189890d = Build.VERSION.SDK_INT >= 26 ? new PreverificationHelper() : null;
        this.f189887a = v23Var;
        if (v23Var instanceof pfe) {
            this.f189888b = bd80Var.getAvoidPoolGet();
            this.f189889c = bd80Var.getAvoidPoolRelease();
        }
        this.f189891e = nj80Var;
    }

    /* JADX INFO: renamed from: e */
    public static BitmapFactory.Options m207188e(n0f n0fVar, Bitmap.Config config, boolean z) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = n0fVar.m160964J();
        options.inJustDecodeBounds = true;
        options.inDither = true;
        boolean z2 = Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE;
        if (!z2) {
            options.inPreferredConfig = config;
        }
        options.inMutable = true;
        if (!z) {
            BitmapFactory.decodeStream(n0fVar.m160962H(), null, options);
            if (options.outWidth == -1 || options.outHeight == -1) {
                fig0.m125680a();
                return null;
            }
        }
        if (z2) {
            options.inPreferredConfig = config;
        }
        options.inJustDecodeBounds = false;
        return options;
    }

    @Override // p153l.zc80
    /* JADX INFO: renamed from: a */
    public fb5<Bitmap> mo8505a(n0f n0fVar, Bitmap.Config config, Rect rect, ColorSpace colorSpace) {
        BitmapFactory.Options optionsM207188e = m207188e(n0fVar, config, this.f189888b);
        boolean z = optionsM207188e.inPreferredConfig != Bitmap.Config.ARGB_8888;
        try {
            return m207189c((InputStream) wn80.m207182g(n0fVar.m160962H()), optionsM207188e, rect, colorSpace);
        } catch (RuntimeException e) {
            if (z) {
                return mo8505a(n0fVar, Bitmap.Config.ARGB_8888, rect, colorSpace);
            }
            throw e;
        }
    }

    @Override // p153l.zc80
    /* JADX INFO: renamed from: b */
    public fb5<Bitmap> mo8506b(n0f n0fVar, Bitmap.Config config, Rect rect, int i, ColorSpace colorSpace) {
        boolean zM160969U = n0fVar.m160969U(i);
        BitmapFactory.Options optionsM207188e = m207188e(n0fVar, config, this.f189888b);
        InputStream inputStreamM160962H = n0fVar.m160962H();
        wn80.m207182g(inputStreamM160962H);
        if (n0fVar.m160965M() > i) {
            inputStreamM160962H = new eor(inputStreamM160962H, i);
        }
        if (!zM160969U) {
            inputStreamM160962H = new y2i0(inputStreamM160962H, f189886g);
        }
        boolean z = optionsM207188e.inPreferredConfig != Bitmap.Config.ARGB_8888;
        try {
            try {
                fb5<Bitmap> fb5VarM207189c = m207189c(inputStreamM160962H, optionsM207188e, rect, colorSpace);
                try {
                    inputStreamM160962H.close();
                    return fb5VarM207189c;
                } catch (IOException e) {
                    e.printStackTrace();
                    return fb5VarM207189c;
                }
            } catch (Throwable th) {
                try {
                    inputStreamM160962H.close();
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
            fb5<Bitmap> fb5VarMo8506b = mo8506b(n0fVar, Bitmap.Config.ARGB_8888, rect, i, colorSpace);
            try {
                inputStreamM160962H.close();
            } catch (IOException e4) {
                e4.printStackTrace();
            }
            return fb5VarMo8506b;
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
    public final fb5<Bitmap> m207189c(InputStream inputStream, BitmapFactory.Options options, Rect rect, ColorSpace colorSpace) {
        Bitmap bitmap;
        Bitmap bitmap2;
        ByteBuffer byteBufferAcquire;
        Bitmap bitmapDecodeStream;
        BitmapRegionDecoder bitmapRegionDecoderNewInstance;
        PreverificationHelper preverificationHelper;
        wn80.m207182g(inputStream);
        int i = options.outWidth;
        int iHeight = options.outHeight;
        ?? r0 = i;
        if (rect != null) {
            int iWidth = rect.width() / options.inSampleSize;
            iHeight = rect.height() / options.inSampleSize;
            r0 = iWidth;
        }
        int i2 = Build.VERSION.SDK_INT;
        boolean z = i2 >= 26 && (preverificationHelper = this.f189890d) != null && preverificationHelper.shouldUseHardwareBitmapConfig(options.inPreferredConfig);
        BitmapRegionDecoder bitmapRegionDecoder = 0;
        try {
            try {
                try {
                    if (rect != null || !z) {
                        if (rect != null && z) {
                            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                        }
                        if (!this.f189888b) {
                            bitmap = this.f189887a.get(mo193753d(r0, iHeight, options));
                            if (bitmap == null) {
                                bitmap2 = bitmap;
                                mnd0.m159157a("BitmapPool.get returned null");
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
                        byteBufferAcquire = this.f189891e.acquire();
                        if (byteBufferAcquire == null) {
                            byteBufferAcquire = ByteBuffer.allocate(rhd.m181515c());
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
                                                huf.m137178f(f189885f, "Could not decode region %s, decoding full bitmap instead.", rect);
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
                        this.f189891e.release(byteBufferAcquire);
                        if (bitmap2 != 0 || bitmap2 == bitmapDecodeStream) {
                            return this.f189889c ? fb5.m124867Z(bitmapDecodeStream, C21144a.INSTANCE) : fb5.m124867Z(bitmapDecodeStream, this.f189887a);
                        }
                        this.f189887a.release(bitmap2);
                        if (bitmapDecodeStream != null) {
                            bitmapDecodeStream.recycle();
                        }
                        wpg0.m207458a();
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
                    this.f189891e.release(byteBufferAcquire);
                    if (bitmap2 != 0) {
                    }
                    if (this.f189889c) {
                    }
                } catch (RuntimeException e) {
                    if (bitmap2 != 0) {
                        this.f189887a.release(bitmap2);
                    }
                    throw e;
                }
            } catch (IllegalArgumentException e2) {
                if (bitmap2 != 0) {
                    this.f189887a.release(bitmap2);
                }
                try {
                    inputStream.reset();
                    Bitmap bitmapDecodeStream2 = BitmapFactory.decodeStream(inputStream);
                    if (bitmapDecodeStream2 == null) {
                        throw e2;
                    }
                    fb5<Bitmap> fb5VarM124867Z = fb5.m124867Z(bitmapDecodeStream2, qof0.m177300a());
                    this.f189891e.release(byteBufferAcquire);
                    return fb5VarM124867Z;
                } catch (IOException unused3) {
                    throw e2;
                }
            }
        } catch (Throwable th3) {
            this.f189891e.release(byteBufferAcquire);
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
        byteBufferAcquire = this.f189891e.acquire();
        if (byteBufferAcquire == null) {
            byteBufferAcquire = ByteBuffer.allocate(rhd.m181515c());
        }
    }

    /* JADX INFO: renamed from: d */
    public abstract int mo193753d(int i, int i2, BitmapFactory.Options options);

    /* JADX INFO: renamed from: l.wnd$a */
    public static final class C21144a implements w4d0<Bitmap> {
        private static final C21144a INSTANCE = new C21144a();

        @Override // p153l.w4d0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void release(Bitmap bitmap) {
        }
    }
}
