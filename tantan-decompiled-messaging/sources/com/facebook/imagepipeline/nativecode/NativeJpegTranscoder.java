package com.facebook.imagepipeline.nativecode;

import android.graphics.ColorSpace;
import androidx.annotation.VisibleForTesting;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import p149l.c9e;
import p149l.egm;
import p149l.h620;
import p149l.i5e;
import p149l.jze;
import p149l.kod;
import p149l.la5;
import p149l.nvc0;
import p149l.oed0;
import p149l.rf80;
import p149l.sim;
import p149l.tim;
import p149l.xnq;

/* JADX INFO: loaded from: classes.dex */
@i5e
public class NativeJpegTranscoder implements tim {
    public static final String TAG = "NativeJpegTranscoder";
    private int mMaxBitmapSize;
    private boolean mResizingEnabled;
    private boolean mUseDownsamplingRatio;

    public NativeJpegTranscoder(boolean z, int i, boolean z2, boolean z3) {
        this.mResizingEnabled = z;
        this.mMaxBitmapSize = i;
        this.mUseDownsamplingRatio = z2;
        if (z3) {
            h620.m129468a();
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: d */
    public static void m8458d(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3) throws IOException {
        h620.m129468a();
        rf80.m179111b(Boolean.valueOf(i2 >= 1));
        rf80.m179111b(Boolean.valueOf(i2 <= 16));
        rf80.m179111b(Boolean.valueOf(i3 >= 0));
        rf80.m179111b(Boolean.valueOf(i3 <= 100));
        rf80.m179111b(Boolean.valueOf(xnq.m210196j(i)));
        rf80.m179112c((i2 == 8 && i == 0) ? false : true, "no transformation requested");
        nativeTranscodeJpeg((InputStream) rf80.m179116g(inputStream), (OutputStream) rf80.m179116g(outputStream), i, i2, i3);
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: e */
    public static void m8459e(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3) throws IOException {
        h620.m129468a();
        rf80.m179111b(Boolean.valueOf(i2 >= 1));
        rf80.m179111b(Boolean.valueOf(i2 <= 16));
        rf80.m179111b(Boolean.valueOf(i3 >= 0));
        rf80.m179111b(Boolean.valueOf(i3 <= 100));
        rf80.m179111b(Boolean.valueOf(xnq.m210195i(i)));
        rf80.m179112c((i2 == 8 && i == 1) ? false : true, "no transformation requested");
        nativeTranscodeJpegWithExifOrientation((InputStream) rf80.m179116g(inputStream), (OutputStream) rf80.m179116g(outputStream), i, i2, i3);
    }

    @i5e
    private static native void nativeTranscodeJpeg(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3) throws IOException;

    @i5e
    private static native void nativeTranscodeJpegWithExifOrientation(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3) throws IOException;

    @Override // p149l.tim
    /* JADX INFO: renamed from: a */
    public sim mo8460a(jze jzeVar, OutputStream outputStream, oed0 oed0Var, nvc0 nvc0Var, egm egmVar, Integer num, ColorSpace colorSpace) throws IOException {
        if (num == null) {
            num = 85;
        }
        if (oed0Var == null) {
            oed0Var = oed0.m163940d();
        }
        int iM105845b = c9e.m105845b(oed0Var, nvc0Var, jzeVar, this.mMaxBitmapSize);
        try {
            int iM210193f = xnq.m210193f(oed0Var, nvc0Var, jzeVar, this.mResizingEnabled);
            int iM210189a = xnq.m210189a(iM105845b);
            if (this.mUseDownsamplingRatio) {
                iM210193f = iM210189a;
            }
            InputStream inputStreamM143899H = jzeVar.m143899H();
            if (xnq.INVERTED_EXIF_ORIENTATIONS.contains(Integer.valueOf(jzeVar.m143926x()))) {
                m8459e((InputStream) rf80.m179117h(inputStreamM143899H, "Cannot transcode from null input stream!"), outputStream, xnq.m210191d(oed0Var, jzeVar), iM210193f, num.intValue());
            } else {
                m8458d((InputStream) rf80.m179117h(inputStreamM143899H, "Cannot transcode from null input stream!"), outputStream, xnq.m210192e(oed0Var, jzeVar), iM210193f, num.intValue());
            }
            la5.m149128b(inputStreamM143899H);
            return new sim(iM105845b != 1 ? 0 : 1);
        } catch (Throwable th) {
            la5.m149128b(null);
            throw th;
        }
    }

    @Override // p149l.tim
    /* JADX INFO: renamed from: b */
    public boolean mo8461b(jze jzeVar, oed0 oed0Var, nvc0 nvc0Var) {
        if (oed0Var == null) {
            oed0Var = oed0.m163940d();
        }
        return xnq.m210193f(oed0Var, nvc0Var, jzeVar, this.mResizingEnabled) < 8;
    }

    @Override // p149l.tim
    /* JADX INFO: renamed from: c */
    public boolean mo8462c(egm egmVar) {
        return egmVar == kod.JPEG;
    }

    @Override // p149l.tim
    public String getIdentifier() {
        return TAG;
    }
}
