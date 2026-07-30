package com.momo.xengine.media;

import android.graphics.Bitmap;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public interface IVideoFrameExtractor {

    public interface ExtractorFrameCallback {
        void onResult(byte[] bArr);
    }

    public interface ExtractorFramesCallback {
        void onResult(@NotNull List<Bitmap> list);
    }

    void extractorFrames(@NotNull List<Long> list, @NotNull ExtractorFramesCallback extractorFramesCallback);

    void getFrameRGBDataAt(long j, @NotNull ExtractorFrameCallback extractorFrameCallback);

    boolean init(@NotNull String str, float f, double d, int i, int i2);

    void release();
}
