package com.core.glcore.util;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class PngImageDecoder {
    public static final int COLORSPACE_AG = 33;
    public static final int COLORSPACE_ARGB = 35;
    public static final int COLORSPACE_BGR = 18;
    public static final int COLORSPACE_BGRA = 19;
    public static final int COLORSPACE_GA = 1;
    public static final int COLORSPACE_GRAY = 0;
    public static final int COLORSPACE_RGB = 2;
    public static final int COLORSPACE_RGBA = 3;

    static {
        System.loadLibrary("pngdecoder");
    }

    public static ImageFrame imageLoad(String str, ImageFrame imageFrame) {
        ImageFrame imageFrameNativeImageLoader = nativeImageLoader(str, imageFrame);
        if (imageFrameNativeImageLoader != null && imageFrameNativeImageLoader.imageByteBuffer == null) {
            imageFrameNativeImageLoader.imageByteBuffer = ByteBuffer.wrap(imageFrameNativeImageLoader.imageByteData);
        }
        return imageFrameNativeImageLoader;
    }

    private static native ImageFrame nativeImageLoader(String str, ImageFrame imageFrame);
}
