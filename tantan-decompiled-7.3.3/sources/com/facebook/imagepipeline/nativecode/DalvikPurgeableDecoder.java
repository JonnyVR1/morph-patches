package com.facebook.imagepipeline.nativecode;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import android.os.Build;
import androidx.annotation.VisibleForTesting;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.common.TooManyBitmapsException;
import java.util.Locale;
import p153l.fb5;
import p153l.j33;
import p153l.n0f;
import p153l.n13;
import p153l.o13;
import p153l.v6e;
import p153l.vyi0;
import p153l.w6e;
import p153l.wjm;
import p153l.wn80;
import p153l.zc80;

/* JADX INFO: loaded from: classes.dex */
@w6e
public abstract class DalvikPurgeableDecoder implements zc80 {
    protected static final byte[] EOI;
    private final n13 mUnpooledBitmapsCounter = o13.m165579a();

    @v6e
    public static class OreoUtils {
        private OreoUtils() {
        }

        @TargetApi(26)
        /* JADX INFO: renamed from: a */
        public static void m8510a(BitmapFactory.Options options, ColorSpace colorSpace) {
            if (colorSpace == null) {
                colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            }
            options.inPreferredColorSpace = colorSpace;
        }
    }

    static {
        wjm.m206712a();
        EOI = new byte[]{-1, -39};
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: e */
    public static boolean m8503e(fb5<PooledByteBuffer> fb5Var, int i) {
        PooledByteBuffer pooledByteBufferM124875B = fb5Var.m124875B();
        return i >= 2 && pooledByteBufferM124875B.mo8211r(i + (-2)) == -1 && pooledByteBufferM124875B.mo8211r(i - 1) == -39;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: f */
    public static BitmapFactory.Options m8504f(int i, Bitmap.Config config) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inSampleSize = i;
        options.inMutable = true;
        return options;
    }

    @w6e
    private static native void nativePinBitmap(Bitmap bitmap);

    @Override // p153l.zc80
    /* JADX INFO: renamed from: a */
    public fb5<Bitmap> mo8505a(n0f n0fVar, Bitmap.Config config, Rect rect, ColorSpace colorSpace) {
        BitmapFactory.Options optionsM8504f = m8504f(n0fVar.m160964J(), config);
        if (Build.VERSION.SDK_INT >= 26) {
            OreoUtils.m8510a(optionsM8504f, colorSpace);
        }
        fb5<PooledByteBuffer> fb5VarM160986t = n0fVar.m160986t();
        wn80.m207182g(fb5VarM160986t);
        try {
            return m8509g(mo8507c(fb5VarM160986t, optionsM8504f));
        } finally {
            fb5.m124874v(fb5VarM160986t);
        }
    }

    @Override // p153l.zc80
    /* JADX INFO: renamed from: b */
    public fb5<Bitmap> mo8506b(n0f n0fVar, Bitmap.Config config, Rect rect, int i, ColorSpace colorSpace) {
        BitmapFactory.Options optionsM8504f = m8504f(n0fVar.m160964J(), config);
        if (Build.VERSION.SDK_INT >= 26) {
            OreoUtils.m8510a(optionsM8504f, colorSpace);
        }
        fb5<PooledByteBuffer> fb5VarM160986t = n0fVar.m160986t();
        wn80.m207182g(fb5VarM160986t);
        try {
            return m8509g(mo8508d(fb5VarM160986t, i, optionsM8504f));
        } finally {
            fb5.m124874v(fb5VarM160986t);
        }
    }

    /* JADX INFO: renamed from: c */
    public abstract Bitmap mo8507c(fb5<PooledByteBuffer> fb5Var, BitmapFactory.Options options);

    /* JADX INFO: renamed from: d */
    public abstract Bitmap mo8508d(fb5<PooledByteBuffer> fb5Var, int i, BitmapFactory.Options options);

    /* JADX INFO: renamed from: g */
    public fb5<Bitmap> m8509g(Bitmap bitmap) {
        wn80.m207182g(bitmap);
        try {
            nativePinBitmap(bitmap);
            if (this.mUnpooledBitmapsCounter.m161082g(bitmap)) {
                return fb5.m124867Z(bitmap, this.mUnpooledBitmapsCounter.m161080e());
            }
            int iM143310i = j33.m143310i(bitmap);
            bitmap.recycle();
            throw new TooManyBitmapsException(String.format(Locale.US, "Attempted to pin a bitmap of size %d bytes. The current pool count is %d, the current pool size is %d bytes. The current pool max count is %d, the current pool max size is %d bytes.", Integer.valueOf(iM143310i), Integer.valueOf(this.mUnpooledBitmapsCounter.m161077b()), Long.valueOf(this.mUnpooledBitmapsCounter.m161081f()), Integer.valueOf(this.mUnpooledBitmapsCounter.m161078c()), Integer.valueOf(this.mUnpooledBitmapsCounter.m161079d())));
        } catch (Exception e) {
            bitmap.recycle();
            throw vyi0.m203997a(e);
        }
    }
}
