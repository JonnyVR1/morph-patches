package com.momocv.beauty;

import android.util.Log;
import com.momocv.OsUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class BeautyProcessor {
    private static boolean initok = true;
    private long mOBJPtr = 0;
    private boolean inited = false;

    static {
        init();
    }

    public BeautyProcessor() {
        Create();
    }

    public static void drawChangeFace(float[] fArr, float[] fArr2, int i, int i2, int i3, int i4) {
        nativeDrawChangeFace(fArr, fArr2, i, i2, i3, i4);
    }

    public static boolean init() {
        if (OsUtils.isWindows()) {
            System.loadLibrary("mmcv_base");
            System.loadLibrary("mmcv_api_base");
            System.loadLibrary("mmcv_api_facerecognition");
            System.loadLibrary("mmcv_api_faceattributes");
            System.loadLibrary("mmcv_api_beauty");
            return true;
        }
        try {
            System.loadLibrary("c++_shared");
            System.loadLibrary("MNN");
            System.loadLibrary("MNN_CL");
            System.loadLibrary("MNN_Express");
            System.loadLibrary("mmcv_base");
            System.loadLibrary("mmcv_api_base");
            System.loadLibrary("mmcv_api_facerecognition");
            System.loadLibrary("mmcv_api_faceattributes");
            System.loadLibrary("mmcv_api_beauty");
            return true;
        } catch (UnsatisfiedLinkError e) {
            Log.e("mmcv", "failed to load native library" + e.getMessage());
            initok = false;
            return false;
        }
    }

    private static native long nativeCreate();

    private static native void nativeDrawChangeFace(float[] fArr, float[] fArr2, int i, int i2, int i3, int i4);

    private static native boolean nativeGetWarpKeyPoints(long j, BeautyWarpParams beautyWarpParams, BeautyWarpInfo beautyWarpInfo);

    private static native boolean nativeGetWarpedBodyPoints(long j, BodyWarpParams bodyWarpParams, BodyWarpInfo bodyWarpInfo);

    private static native boolean nativeLoadWarpConfig(long j, String str);

    private static native void nativeRelease(long j);

    public synchronized void Create() {
        if (initok) {
            Release();
            long jNativeCreate = nativeCreate();
            this.mOBJPtr = jNativeCreate;
            if (jNativeCreate != 0) {
                this.inited = true;
            }
        }
    }

    public synchronized boolean GetWarpKeyPoints(BeautyWarpParams beautyWarpParams, BeautyWarpInfo beautyWarpInfo) {
        try {
            if (!initok) {
                return false;
            }
            if (this.mOBJPtr == 0 || !this.inited) {
                return false;
            }
            XCameraWarpLevelParams[] xCameraWarpLevelParamsArr = beautyWarpParams.warp_level_group_;
            if (xCameraWarpLevelParamsArr != null) {
                for (XCameraWarpLevelParams xCameraWarpLevelParams : xCameraWarpLevelParamsArr) {
                    HashMap<String, Float> map = new HashMap<>();
                    try {
                        HashMap<String, Float> map2 = xCameraWarpLevelParams.params;
                        if (map2 != null) {
                            for (Map.Entry<String, Float> entry : map2.entrySet()) {
                                map.put(entry.getKey(), entry.getValue());
                            }
                        }
                    } catch (Throwable th) {
                        Log.e("beautyProcessor", "warp params map clone error");
                        th.printStackTrace();
                    }
                    xCameraWarpLevelParams.params = map;
                }
            }
            return nativeGetWarpKeyPoints(this.mOBJPtr, beautyWarpParams, beautyWarpInfo);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public boolean GetWarpedBodyPoints(BodyWarpParams bodyWarpParams, BodyWarpInfo bodyWarpInfo) {
        if (!initok) {
            return false;
        }
        long j = this.mOBJPtr;
        return j != 0 && this.inited && nativeGetWarpedBodyPoints(j, bodyWarpParams, bodyWarpInfo);
    }

    public boolean LoadWarpConfig(String str) {
        if (!initok) {
            return false;
        }
        long j = this.mOBJPtr;
        return j != 0 && this.inited && nativeLoadWarpConfig(j, str);
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
}
