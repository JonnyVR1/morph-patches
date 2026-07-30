package com.effectsar.labcv.effectsdk;

/* JADX INFO: loaded from: classes.dex */
public class OnekeyEnhance {
    private boolean mInited = false;
    private long mNativePtr;

    public static class AlgParamStream {
        float amount_float;
        int asf_scene_mode_int;
        float contrast_factor_float;
        float current_pixel_weight_float;
        int hdr_version_int;
        float luma_trigger_float;
        int luminance_target_int0;
        int luminance_target_int1;
        float noise_factor_float;
        float over_trigger_float;
        float ratio_float;
        float saturation_factor_float;
        float under_trigger_float;

        public AlgParamStream(int i, int i2, float f, float f2, float f3, float f4, float f5, float f6, int i3, float f7, float f8, float f9, int i4) {
            this.luminance_target_int0 = i;
            this.luminance_target_int1 = i2;
            this.contrast_factor_float = f;
            this.saturation_factor_float = f2;
            this.amount_float = f3;
            this.ratio_float = f4;
            this.noise_factor_float = f5;
            this.current_pixel_weight_float = f6;
            this.hdr_version_int = i3;
            this.luma_trigger_float = f7;
            this.over_trigger_float = f8;
            this.under_trigger_float = f9;
            this.asf_scene_mode_int = i4;
        }
    }

    public static class FaceRect {
        int bottom;
        int left;
        int right;
        int top;

        public FaceRect(int i, int i2, int i3, int i4) {
            this.top = i;
            this.left = i2;
            this.right = i3;
            this.bottom = i4;
        }
    }

    public static class InitConfig {
        boolean asnycProcess;
        boolean disableAsf;
        boolean disableDayScene;
        boolean disableDenoise;
        boolean disableHdr;
        boolean disableNightScene;
        int height;
        String kernelBinPath;
        boolean oneKeyRecordHdrV2;
        int powerLevel;
        int sceneMode;
        int width;

        public InitConfig(int i, int i2, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i3, int i4) {
            this.width = i;
            this.height = i2;
            this.kernelBinPath = str;
            this.disableDenoise = z;
            this.disableHdr = z2;
            this.oneKeyRecordHdrV2 = z3;
            this.asnycProcess = z4;
            this.disableNightScene = z5;
            this.disableDayScene = z6;
            this.disableAsf = z7;
            this.powerLevel = i3;
            this.sceneMode = i4;
        }
    }

    public static class ProcessConfig {
        int cvDetectFrames;
        FaceRect[] faceList;
        int faceNum;
        int height;
        int initDecayFrames;
        boolean isFirstFrame;
        boolean isProtectFace;
        int iso;
        int iso_max;
        int iso_min;
        int width;

        public ProcessConfig(int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2, int i7, int i8, FaceRect[] faceRectArr) {
            this.iso = i;
            this.iso_max = i2;
            this.iso_min = i3;
            this.cvDetectFrames = i4;
            this.width = i5;
            this.height = i6;
            this.isFirstFrame = z;
            this.isProtectFace = z2;
            this.initDecayFrames = i7;
            this.faceNum = i8;
            this.faceList = faceRectArr;
        }

        public int getCvDetectFrames() {
            return this.cvDetectFrames;
        }

        public FaceRect[] getFaceList() {
            return this.faceList;
        }

        public int getFaceNum() {
            return this.faceNum;
        }

        public int getHeight() {
            return this.height;
        }

        public int getInitDecayFrames() {
            return this.initDecayFrames;
        }

        public int getIso() {
            return this.iso;
        }

        public int getIso_max() {
            return this.iso_max;
        }

        public int getIso_min() {
            return this.iso_min;
        }

        public int getWidth() {
            return this.width;
        }

        public boolean isFirstFrame() {
            return this.isFirstFrame;
        }

        public boolean isProtectFace() {
            return this.isProtectFace;
        }

        public void setCvDetectFrames(int i) {
            this.cvDetectFrames = i;
        }

        public void setFaceList(FaceRect[] faceRectArr) {
            this.faceList = faceRectArr;
        }

        public void setFaceNum(int i) {
            this.faceNum = i;
        }

        public void setFirstFrame(boolean z) {
            this.isFirstFrame = z;
        }

        public void setHeight(int i) {
            this.height = i;
        }

        public void setInitDecayFrames(int i) {
            this.initDecayFrames = i;
        }

        public void setIso(int i) {
            this.iso = i;
        }

        public void setIso_max(int i) {
            this.iso_max = i;
        }

        public void setIso_min(int i) {
            this.iso_min = i;
        }

        public void setProtectFace(boolean z) {
            this.isProtectFace = z;
        }

        public void setWidth(int i) {
            this.width = i;
        }
    }

    public static class Result {
        int textureId;
    }

    static {
        try {
            System.loadLibrary("effect");
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        }
    }

    private native int nativeCreate(String str, boolean z, AlgParamStream algParamStream, InitConfig initConfig);

    private native int nativeProcess(int i, AlgParamStream algParamStream, ProcessConfig processConfig, Result result);

    private native void nativeRelease();

    public int create(String str, boolean z, AlgParamStream algParamStream, InitConfig initConfig) {
        int iNativeCreate = nativeCreate(str, z, algParamStream, initConfig);
        if (iNativeCreate != 0) {
            this.mInited = false;
            return iNativeCreate;
        }
        this.mInited = true;
        return iNativeCreate;
    }

    public int process(int i, AlgParamStream algParamStream, ProcessConfig processConfig) {
        if (!this.mInited) {
            return 0;
        }
        Result result = new Result();
        int iNativeProcess = nativeProcess(i, algParamStream, processConfig, result);
        return iNativeProcess < 0 ? iNativeProcess : result.textureId;
    }

    public void release() {
        if (this.mInited) {
            nativeRelease();
        }
        this.mInited = false;
    }
}
