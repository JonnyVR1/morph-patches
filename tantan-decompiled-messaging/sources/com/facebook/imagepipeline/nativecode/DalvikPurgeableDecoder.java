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
import p149l.fa5;
import p149l.h5e;
import p149l.i5e;
import p149l.jze;
import p149l.rf80;
import p149l.spi0;
import p149l.t23;
import p149l.t480;
import p149l.thm;
import p149l.y03;
import p149l.z03;

/* JADX INFO: loaded from: classes.dex */
@i5e
public abstract class DalvikPurgeableDecoder implements t480 {
    protected static final byte[] EOI;
    private final y03 mUnpooledBitmapsCounter = z03.m216715a();

    @h5e
    public static class OreoUtils {
        private OreoUtils() {
        }

        @TargetApi(26)
        /* JADX INFO: renamed from: a */
        public static void m8456a(BitmapFactory.Options options, ColorSpace colorSpace) {
            if (colorSpace == null) {
                colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            }
            options.inPreferredColorSpace = colorSpace;
        }
    }

    static {
        thm.m188923a();
        EOI = new byte[]{-1, -39};
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: e */
    public static boolean m8449e(fa5<PooledByteBuffer> fa5Var, int i) {
        PooledByteBuffer pooledByteBufferM120155B = fa5Var.m120155B();
        return i >= 2 && pooledByteBufferM120155B.mo8157r(i + (-2)) == -1 && pooledByteBufferM120155B.mo8157r(i - 1) == -39;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: f */
    public static BitmapFactory.Options m8450f(int i, Bitmap.Config config) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inSampleSize = i;
        options.inMutable = true;
        return options;
    }

    @i5e
    private static native void nativePinBitmap(Bitmap bitmap);

    @Override // p149l.t480
    /* JADX INFO: renamed from: a */
    public fa5<Bitmap> mo8451a(jze jzeVar, Bitmap.Config config, Rect rect, ColorSpace colorSpace) {
        BitmapFactory.Options optionsM8450f = m8450f(jzeVar.m143901J(), config);
        if (Build.VERSION.SDK_INT >= 26) {
            OreoUtils.m8456a(optionsM8450f, colorSpace);
        }
        fa5<PooledByteBuffer> fa5VarM143923t = jzeVar.m143923t();
        rf80.m179116g(fa5VarM143923t);
        try {
            return m8455g(mo8453c(fa5VarM143923t, optionsM8450f));
        } finally {
            fa5.m120154v(fa5VarM143923t);
        }
    }

    @Override // p149l.t480
    /* JADX INFO: renamed from: b */
    public fa5<Bitmap> mo8452b(jze jzeVar, Bitmap.Config config, Rect rect, int i, ColorSpace colorSpace) {
        BitmapFactory.Options optionsM8450f = m8450f(jzeVar.m143901J(), config);
        if (Build.VERSION.SDK_INT >= 26) {
            OreoUtils.m8456a(optionsM8450f, colorSpace);
        }
        fa5<PooledByteBuffer> fa5VarM143923t = jzeVar.m143923t();
        rf80.m179116g(fa5VarM143923t);
        try {
            return m8455g(mo8454d(fa5VarM143923t, i, optionsM8450f));
        } finally {
            fa5.m120154v(fa5VarM143923t);
        }
    }

    /* JADX INFO: renamed from: c */
    public abstract Bitmap mo8453c(fa5<PooledByteBuffer> fa5Var, BitmapFactory.Options options);

    /* JADX INFO: renamed from: d */
    public abstract Bitmap mo8454d(fa5<PooledByteBuffer> fa5Var, int i, BitmapFactory.Options options);

    /* JADX INFO: renamed from: g */
    public fa5<Bitmap> m8455g(Bitmap bitmap) {
        rf80.m179116g(bitmap);
        try {
            nativePinBitmap(bitmap);
            if (this.mUnpooledBitmapsCounter.m212036g(bitmap)) {
                return fa5.m120147Y(bitmap, this.mUnpooledBitmapsCounter.m212034e());
            }
            int iM186960i = t23.m186960i(bitmap);
            bitmap.recycle();
            throw new TooManyBitmapsException(String.format(Locale.US, "Attempted to pin a bitmap of size %d bytes. The current pool count is %d, the current pool size is %d bytes. The current pool max count is %d, the current pool max size is %d bytes.", Integer.valueOf(iM186960i), Integer.valueOf(this.mUnpooledBitmapsCounter.m212031b()), Long.valueOf(this.mUnpooledBitmapsCounter.m212035f()), Integer.valueOf(this.mUnpooledBitmapsCounter.m212032c()), Integer.valueOf(this.mUnpooledBitmapsCounter.m212033d())));
        } catch (Exception e) {
            bitmap.recycle();
            throw spi0.m185369a(e);
        }
    }
}
