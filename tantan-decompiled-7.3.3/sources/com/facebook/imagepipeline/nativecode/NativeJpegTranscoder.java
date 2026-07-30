package com.facebook.imagepipeline.nativecode;

import android.graphics.ColorSpace;
import androidx.annotation.VisibleForTesting;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import p153l.gae;
import p153l.him;
import p153l.lb5;
import p153l.n0f;
import p153l.pe20;
import p153l.ppd;
import p153l.q3d0;
import p153l.qmd0;
import p153l.vkm;
import p153l.w6e;
import p153l.wkm;
import p153l.wn80;
import p153l.wpq;

/* JADX INFO: loaded from: classes.dex */
@w6e
public class NativeJpegTranscoder implements wkm {
    public static final String TAG = "NativeJpegTranscoder";
    private int mMaxBitmapSize;
    private boolean mResizingEnabled;
    private boolean mUseDownsamplingRatio;

    public NativeJpegTranscoder(boolean z, int i, boolean z2, boolean z3) {
        this.mResizingEnabled = z;
        this.mMaxBitmapSize = i;
        this.mUseDownsamplingRatio = z2;
        if (z3) {
            pe20.m171915a();
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: d */
    public static void m8512d(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3) throws IOException {
        pe20.m171915a();
        wn80.m207177b(Boolean.valueOf(i2 >= 1));
        wn80.m207177b(Boolean.valueOf(i2 <= 16));
        wn80.m207177b(Boolean.valueOf(i3 >= 0));
        wn80.m207177b(Boolean.valueOf(i3 <= 100));
        wn80.m207177b(Boolean.valueOf(wpq.m207485j(i)));
        wn80.m207178c((i2 == 8 && i == 0) ? false : true, "no transformation requested");
        nativeTranscodeJpeg((InputStream) wn80.m207182g(inputStream), (OutputStream) wn80.m207182g(outputStream), i, i2, i3);
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: e */
    public static void m8513e(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3) throws IOException {
        pe20.m171915a();
        wn80.m207177b(Boolean.valueOf(i2 >= 1));
        wn80.m207177b(Boolean.valueOf(i2 <= 16));
        wn80.m207177b(Boolean.valueOf(i3 >= 0));
        wn80.m207177b(Boolean.valueOf(i3 <= 100));
        wn80.m207177b(Boolean.valueOf(wpq.m207484i(i)));
        wn80.m207178c((i2 == 8 && i == 1) ? false : true, "no transformation requested");
        nativeTranscodeJpegWithExifOrientation((InputStream) wn80.m207182g(inputStream), (OutputStream) wn80.m207182g(outputStream), i, i2, i3);
    }

    @w6e
    private static native void nativeTranscodeJpeg(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3) throws IOException;

    @w6e
    private static native void nativeTranscodeJpegWithExifOrientation(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3) throws IOException;

    @Override // p153l.wkm
    /* JADX INFO: renamed from: a */
    public vkm mo8514a(n0f n0fVar, OutputStream outputStream, qmd0 qmd0Var, q3d0 q3d0Var, him himVar, Integer num, ColorSpace colorSpace) throws IOException {
        if (num == null) {
            num = 85;
        }
        if (qmd0Var == null) {
            qmd0Var = qmd0.m177098d();
        }
        int iM129692b = gae.m129692b(qmd0Var, q3d0Var, n0fVar, this.mMaxBitmapSize);
        try {
            int iM207482f = wpq.m207482f(qmd0Var, q3d0Var, n0fVar, this.mResizingEnabled);
            int iM207478a = wpq.m207478a(iM129692b);
            if (this.mUseDownsamplingRatio) {
                iM207482f = iM207478a;
            }
            InputStream inputStreamM160962H = n0fVar.m160962H();
            if (wpq.INVERTED_EXIF_ORIENTATIONS.contains(Integer.valueOf(n0fVar.m160989x()))) {
                m8513e((InputStream) wn80.m207183h(inputStreamM160962H, "Cannot transcode from null input stream!"), outputStream, wpq.m207480d(qmd0Var, n0fVar), iM207482f, num.intValue());
            } else {
                m8512d((InputStream) wn80.m207183h(inputStreamM160962H, "Cannot transcode from null input stream!"), outputStream, wpq.m207481e(qmd0Var, n0fVar), iM207482f, num.intValue());
            }
            lb5.m153575b(inputStreamM160962H);
            return new vkm(iM129692b != 1 ? 0 : 1);
        } catch (Throwable th) {
            lb5.m153575b(null);
            throw th;
        }
    }

    @Override // p153l.wkm
    /* JADX INFO: renamed from: b */
    public boolean mo8515b(n0f n0fVar, qmd0 qmd0Var, q3d0 q3d0Var) {
        if (qmd0Var == null) {
            qmd0Var = qmd0.m177098d();
        }
        return wpq.m207482f(qmd0Var, q3d0Var, n0fVar, this.mResizingEnabled) < 8;
    }

    @Override // p153l.wkm
    /* JADX INFO: renamed from: c */
    public boolean mo8516c(him himVar) {
        return himVar == ppd.JPEG;
    }

    @Override // p153l.wkm
    public String getIdentifier() {
        return TAG;
    }
}
