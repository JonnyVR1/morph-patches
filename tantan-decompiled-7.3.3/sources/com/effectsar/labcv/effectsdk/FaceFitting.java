package com.effectsar.labcv.effectsdk;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public class FaceFitting {
    static final int FaceFittingMaxFaceCount = 6;
    private long mNativePtr;
    private long mNativeCResultPtr = 0;
    private volatile boolean mInited = false;
    FaceFittingResult faceFittingResult = null;

    public static class FaceFittingMeshConfig {
        short[] flist;
        int flist_count;
        short[] landmark_triangle;
        int landmark_triangle_count;
        int mum_landmark;
        int num_flist;
        int num_landmark_triangle;
        int num_param;
        int num_vertex;

        /* JADX INFO: renamed from: uv */
        float[] f5891uv;
        int uv_count;
        int version_code;

        public short[] getFlist() {
            return this.flist;
        }

        public int getFlist_count() {
            return this.flist_count;
        }

        public short[] getLandmark_triangle() {
            return this.landmark_triangle;
        }

        public int getLandmark_triangle_count() {
            return this.landmark_triangle_count;
        }

        public int getMum_landmark() {
            return this.mum_landmark;
        }

        public int getNum_flist() {
            return this.num_flist;
        }

        public int getNum_landmark_triangle() {
            return this.num_landmark_triangle;
        }

        public int getNum_param() {
            return this.num_param;
        }

        public int getNum_vertex() {
            return this.num_vertex;
        }

        public float[] getUv() {
            return this.f5891uv;
        }

        public int getUv_count() {
            return this.uv_count;
        }

        public int getVersion_code() {
            return this.version_code;
        }
    }

    public static class FaceFittingMeshInfo {
        float[] bitangent;

        /* JADX INFO: renamed from: id */
        int f5892id;
        float[] landmark;
        int landmark_count;
        float[] model;
        float[] mvp;
        float[] normal;
        float[] param;
        int param_count;
        float[] rvec;
        float[] tangent;
        float[] tvec;
        float[] vertex;
        int vertex_count;

        public float[] getBitangent() {
            return this.bitangent;
        }

        public int getId() {
            return this.f5892id;
        }

        public float[] getLandmark() {
            return this.landmark;
        }

        public int getLandmark_count() {
            return this.landmark_count;
        }

        public float[] getModel() {
            return this.model;
        }

        public float[] getMvp() {
            return this.mvp;
        }

        public float[] getNormal() {
            return this.normal;
        }

        public float[] getParam() {
            return this.param;
        }

        public int getParam_count() {
            return this.param_count;
        }

        public float[] getRvec() {
            return this.rvec;
        }

        public float[] getTangent() {
            return this.tangent;
        }

        public float[] getTvec() {
            return this.tvec;
        }

        public float[] getVertex() {
            return this.vertex;
        }

        public int getVertex_count() {
            return this.vertex_count;
        }
    }

    public static class FaceFittingResult {
        int faceCount;
        FaceFittingMeshConfig config = null;
        FaceFittingMeshInfo[] faceFittingMeshInfo = new FaceFittingMeshInfo[6];

        public FaceFittingMeshConfig getConfig() {
            return this.config;
        }

        public int getFaceCount() {
            return this.faceCount;
        }

        public FaceFittingMeshInfo[] getFaceFittingMeshInfo() {
            return this.faceFittingMeshInfo;
        }
    }

    static {
        try {
            System.loadLibrary("effect");
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        }
    }

    private native void nativeAllocCResult();

    private native int nativeDestroy();

    private native int nativeDetect(BefFaceInfo befFaceInfo, int i, int i2, float[] fArr, FaceFittingResult faceFittingResult);

    private native void nativeFreeCResult();

    private native int nativeInit(Context context, String str, String str2, boolean z);

    private native int nativeSetParam(int i, int i2);

    public int destroy() {
        if (!this.mInited) {
            return -1;
        }
        nativeFreeCResult();
        return nativeDestroy();
    }

    public int detect(BefFaceInfo befFaceInfo, int i, int i2, float[] fArr) {
        if (this.mInited) {
            return nativeDetect(befFaceInfo, i, i2, fArr, this.faceFittingResult);
        }
        return -1;
    }

    public FaceFittingResult getFaceFittingResult() {
        if (this.mInited) {
            return this.faceFittingResult;
        }
        return null;
    }

    public int init(Context context, String str, String str2, boolean z) {
        int iNativeInit = nativeInit(context, str, str2, z);
        this.mInited = iNativeInit == 0;
        if (this.mInited) {
            nativeAllocCResult();
            this.faceFittingResult = new FaceFittingResult();
        }
        return iNativeInit;
    }

    public int setParam(EffectsSDKEffectConstants.FaceFittingParam faceFittingParam, int i) {
        if (this.mInited) {
            return nativeSetParam(faceFittingParam.getValue(), i);
        }
        return -1;
    }
}
