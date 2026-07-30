package com.momocv.mangaface;

import com.momocv.OsUtils;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class MangaFace {
    private long mOBJPtr = 0;
    private boolean inited = false;

    static {
        if (OsUtils.isWindows()) {
            System.loadLibrary("mmcv_base");
            System.loadLibrary("mmcv_api_base");
            System.loadLibrary("mmcv_api_mangaface");
            return;
        }
        System.loadLibrary("c++_shared");
        System.loadLibrary("MNN");
        System.loadLibrary("MNN_CL");
        System.loadLibrary("MNN_Express");
        System.loadLibrary("mmcv_base");
        System.loadLibrary("mmcv_api_base");
        System.loadLibrary("mmcv_api_mangaface");
    }

    public MangaFace() {
        Create();
    }

    private static native long nativeCreate();

    private static native boolean nativeMangaFace(long j, MangaFaceParams mangaFaceParams, MangaFaceInfo mangaFaceInfo);

    private static native void nativeRelease(long j);

    public synchronized void Create() {
        Release();
        long jNativeCreate = nativeCreate();
        this.mOBJPtr = jNativeCreate;
        if (jNativeCreate != 0) {
            this.inited = true;
        }
    }

    public synchronized void Release() {
        long j = this.mOBJPtr;
        if (j != 0) {
            nativeRelease(j);
            this.mOBJPtr = 0L;
            this.inited = false;
        }
    }

    public void finalize() throws Throwable {
        super.finalize();
        Release();
    }

    public boolean manga_face(MangaFaceParams mangaFaceParams, MangaFaceInfo mangaFaceInfo) {
        long j = this.mOBJPtr;
        return j != 0 && this.inited && nativeMangaFace(j, mangaFaceParams, mangaFaceInfo);
    }
}
