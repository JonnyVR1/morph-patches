package com.effectsar.labcv.effectsdk;

import android.content.Context;
import android.util.Log;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class Skeleton3dDetect {
    private volatile boolean mInited = false;
    private long mNativePtr;
    private BefSkeleton3DInfo mResult;

    public static class InputParam {
        ByteBuffer buffer;
        int image_height;
        int image_stride;
        int image_width;
        int keypoint_num;
        int orientation;
        int pixel_format;
        int target_num;
        float[] points2d = new float[180];
        int[] point_valid = new int[90];

        public ByteBuffer getBuffer() {
            return this.buffer;
        }

        public int getImage_height() {
            return this.image_height;
        }

        public int getImage_stride() {
            return this.image_stride;
        }

        public int getImage_width() {
            return this.image_width;
        }

        public int getKeypoint_num() {
            return this.keypoint_num;
        }

        public int getOrientation() {
            return this.orientation;
        }

        public int getPixel_format() {
            return this.pixel_format;
        }

        public int[] getPoint_valid() {
            return this.point_valid;
        }

        public float[] getPoints2d() {
            return this.points2d;
        }

        public int getTarget_num() {
            return this.target_num;
        }

        public void setBuffer(ByteBuffer byteBuffer) {
            this.buffer = byteBuffer;
        }

        public void setImage_height(int i) {
            this.image_height = i;
        }

        public void setImage_stride(int i) {
            this.image_stride = i;
        }

        public void setImage_width(int i) {
            this.image_width = i;
        }

        public void setKeypoint_num(int i) {
            this.keypoint_num = i;
        }

        public void setOrientation(int i) {
            this.orientation = i;
        }

        public void setPixel_format(int i) {
            this.pixel_format = i;
        }

        public void setPoint_valid(int[] iArr) {
            this.point_valid = iArr;
        }

        public void setPoints2d(float[] fArr) {
            this.points2d = fArr;
        }

        public void setTarget_num(int i) {
            this.target_num = i;
        }

        public String toString() {
            return "InputParam{buffer=" + this.buffer + ", pixel_format=" + this.pixel_format + ", image_width=" + this.image_width + ", image_height=" + this.image_height + ", image_stride=" + this.image_stride + ", orientation=" + this.orientation + ", points2d=" + Arrays.toString(this.points2d) + ", point_valid=" + Arrays.toString(this.point_valid) + ", keypoint_num=" + this.keypoint_num + ", target_num=" + this.target_num + '}';
        }
    }

    static {
        try {
            System.loadLibrary("effect");
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        }
    }

    private native int nativeCreateHandle(Context context, String str, boolean z);

    private native int nativeDetect(InputParam inputParam, BefSkeleton3DInfo befSkeleton3DInfo);

    private native void nativeRelease();

    private native int nativeSetModel(String str);

    private native int nativeSetParam(int i, float f);

    public int detectSkeleton3d(InputParam inputParam) {
        if (!this.mInited) {
            return -1;
        }
        int iNativeDetect = nativeDetect(inputParam, this.mResult);
        if (iNativeDetect == 0) {
            return 0;
        }
        Log.e(EffectsSDKEffectConstants.TAG, "nativeDetect return " + iNativeDetect);
        return -1;
    }

    public BefSkeleton3DInfo getSkeleton3DInfo() {
        return this.mResult;
    }

    public int init(Context context, String str, boolean z, String str2) {
        int iNativeCreateHandle = nativeCreateHandle(context, str, z);
        if (iNativeCreateHandle != 0) {
            return iNativeCreateHandle;
        }
        int iNativeSetModel = nativeSetModel(str2);
        if (iNativeSetModel != 0) {
            return iNativeSetModel;
        }
        this.mInited = true;
        this.mResult = new BefSkeleton3DInfo();
        return iNativeSetModel;
    }

    public boolean isInited() {
        return this.mInited;
    }

    public void release() {
        if (this.mInited) {
            nativeRelease();
            this.mInited = false;
        }
    }

    public int setParam(int i, float f) {
        return nativeSetParam(i, f);
    }
}
