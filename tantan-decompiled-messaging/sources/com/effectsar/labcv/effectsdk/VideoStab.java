package com.effectsar.labcv.effectsdk;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class VideoStab {
    private long mNativePtr;
    private boolean mInited = false;
    private boolean mFirstFrame = true;

    public static class VideoStabInitConfig {
        public float videoStabMaxCropRatio;
        public int videoStabMotionType;
        public int videoStabSmoothRadius;

        public VideoStabInitConfig(int i, float f, int i2) {
            this.videoStabSmoothRadius = i;
            this.videoStabMaxCropRatio = f;
            this.videoStabMotionType = i2;
        }
    }

    public static class VideoStabMatrix {
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

    public static class VideoStabOutput {
        VideoStabMatrix[] matrixList;
        int matrixNum;
        float real_crop_ratio;
        int real_radius;

        public VideoStabMatrix[] getMatrixList() {
            return this.matrixList;
        }

        public int getMatrixNum() {
            return this.matrixNum;
        }

        public float getRealCropRatio() {
            return this.real_crop_ratio;
        }

        public int getRealRadius() {
            return this.real_radius;
        }
    }

    public static class VideoStabProcessParam {
        public EffectsSDKEffectConstants.PixlFormat fmt;
        public EffectsSDKEffectConstants.VideoStabFrameType frameType;
        public int frame_idx;
        public int height;
        public boolean open;
        public int step;
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

    private native int nativeCreate(VideoStabInitConfig videoStabInitConfig);

    private native int nativeDestory();

    private native int nativeProcessBuffer(ByteBuffer byteBuffer, VideoStabProcessParam videoStabProcessParam, VideoStabOutput videoStabOutput, ByteBuffer byteBuffer2);

    private native int nativeSetSmoothParam(VideoStabInitConfig videoStabInitConfig);

    public int cameraTracking(ByteBuffer byteBuffer, VideoStabProcessParam videoStabProcessParam, VideoStabOutput videoStabOutput) {
        if (!this.mInited) {
            return -1;
        }
        videoStabProcessParam.frameType = this.mFirstFrame ? EffectsSDKEffectConstants.VideoStabFrameType.VIDEO_STAB_FRAME_START : EffectsSDKEffectConstants.VideoStabFrameType.VIDEO_STAB_FRAME_EST;
        int iNativeProcessBuffer = nativeProcessBuffer(byteBuffer, videoStabProcessParam, videoStabOutput, null);
        this.mFirstFrame = false;
        return iNativeProcessBuffer;
    }

    public int create(VideoStabInitConfig videoStabInitConfig, String str, boolean z) {
        int iNativeCreate = nativeCreate(videoStabInitConfig);
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

    public int setSmoothParam(VideoStabInitConfig videoStabInitConfig) {
        if (this.mInited) {
            return nativeSetSmoothParam(videoStabInitConfig);
        }
        return -1;
    }

    public int videoStabDeforming(ByteBuffer byteBuffer, VideoStabProcessParam videoStabProcessParam, VideoStabOutput videoStabOutput, ByteBuffer byteBuffer2) {
        if (!this.mInited) {
            return -1;
        }
        videoStabProcessParam.frameType = EffectsSDKEffectConstants.VideoStabFrameType.VIDEO_STAB_FRAME_WARP;
        return nativeProcessBuffer(byteBuffer, videoStabProcessParam, videoStabOutput, byteBuffer2);
    }
}
