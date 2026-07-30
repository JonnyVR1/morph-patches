package com.momocv.imgloader;

import com.momocv.OsUtils;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class ImageLoader {
    static {
        if (OsUtils.isWindows()) {
            System.loadLibrary("mmcv_base");
            System.loadLibrary("mmcv_api_base");
            System.loadLibrary("mmcv_api_imgloader");
            return;
        }
        System.loadLibrary("c++_shared");
        System.loadLibrary("MNN");
        System.loadLibrary("MNN_CL");
        System.loadLibrary("MNN_Express");
        System.loadLibrary("mmcv_base");
        System.loadLibrary("mmcv_api_base");
        System.loadLibrary("mmcv_api_imgloader");
    }

    public static boolean Load(String str, ImageLoaderParams imageLoaderParams, ImageLoaderInfo imageLoaderInfo) {
        return nativeImageLoader(str, imageLoaderParams, imageLoaderInfo);
    }

    private static native boolean nativeImageLoader(String str, ImageLoaderParams imageLoaderParams, ImageLoaderInfo imageLoaderInfo);
}
