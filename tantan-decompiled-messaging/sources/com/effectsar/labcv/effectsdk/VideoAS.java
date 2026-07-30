package com.effectsar.labcv.effectsdk;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class VideoAS {
    private long mNativePtr;
    private boolean mInited = false;
    private boolean mFirstFrame = true;

    public static class VideoASInitConfig {
        public VideoASLevel vasLevel;
        public int vasMaxHeight;
        public int vasMaxWidth;
        public int vasThreadNum;

        public VideoASInitConfig(VideoASLevel videoASLevel, int i, int i2, int i3) {
            this.vasLevel = videoASLevel;
            this.vasMaxWidth = i;
            this.vasMaxHeight = i2;
            this.vasThreadNum = i3;
        }
    }

    public static class VideoASLevel {
        public float vasMaxCropRatio;
        public int vasMotionType;
        public int vasSmoothRadius;

        public VideoASLevel(int i, float f, int i2) {
            this.vasSmoothRadius = i;
            this.vasMaxCropRatio = f;
            this.vasMotionType = i2;
        }
    }

    public static class VideoASMatrix {
        public float M22 = 0.0f;
        public float M21 = 0.0f;
        public float M20 = 0.0f;
        public float M12 = 0.0f;
        public float M11 = 0.0f;
        public float M10 = 0.0f;
        public float M02 = 0.0f;
        public float M01 = 0.0f;
        public float M00 = 0.0f;
    }

    public static class VideoASOutput {
        VideoASMatrix[] matrixList;
        int matrixNum;
        float realCropRatio;
        int realRadius;

        public VideoASMatrix[] getMatrixList() {
            return this.matrixList;
        }

        public int getMatrixNum() {
            return this.matrixNum;
        }

        public float getRealCropRatio() {
            return this.realCropRatio;
        }

        public int getRealRadius() {
            return this.realRadius;
        }
    }

    public static class VideoASProcessParam {
        public int frameIdx;
        public EffectsSDKEffectConstants.VASProcessType frameType;
        public int height;
        public boolean open;
        public float scaleX;
        public float scaleY;
        public int strideW;
        public int width;
    }

    static {
        try {
            System.loadLibrary("effect");
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        }
    }

    private native int nativeCheckLicense(String str, boolean z);

    private native int nativeCreate(VideoASInitConfig videoASInitConfig);

    private native int nativeDestory();

    private native int nativeProcessBuffer(ByteBuffer byteBuffer, VideoASProcessParam videoASProcessParam, VideoASOutput videoASOutput, ByteBuffer byteBuffer2);

    public int cameraTracking(ByteBuffer byteBuffer, VideoASProcessParam videoASProcessParam, VideoASOutput videoASOutput) {
        if (!this.mInited) {
            return -1;
        }
        int iNativeProcessBuffer = nativeProcessBuffer(byteBuffer, videoASProcessParam, videoASOutput, null);
        this.mFirstFrame = false;
        return iNativeProcessBuffer;
    }

    public int create(VideoASInitConfig videoASInitConfig, String str, boolean z) {
        int iNativeCreate = nativeCreate(videoASInitConfig);
        if (iNativeCreate != 0) {
            return iNativeCreate;
        }
        int iNativeCheckLicense = nativeCheckLicense(str, z);
        if (iNativeCheckLicense != 0) {
            return iNativeCheckLicense;
        }
        this.mInited = true;
        return 0;
    }

    public int destroy() {
        if (!this.mInited) {
            return -1;
        }
        nativeDestory();
        this.mInited = false;
        return 0;
    }

    public int frameDeforming(ByteBuffer byteBuffer, VideoASProcessParam videoASProcessParam, VideoASOutput videoASOutput, ByteBuffer byteBuffer2) {
        if (!this.mInited) {
            return -1;
        }
        videoASProcessParam.frameType = EffectsSDKEffectConstants.VASProcessType.BEF_LENS_VAS_PROCESS_WARP;
        return nativeProcessBuffer(byteBuffer, videoASProcessParam, videoASOutput, byteBuffer2);
    }

    public int setSmoothParam(VideoASInitConfig videoASInitConfig) {
        return !this.mInited ? -1 : 0;
    }
}
