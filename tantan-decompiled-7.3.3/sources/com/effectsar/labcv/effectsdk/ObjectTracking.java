package com.effectsar.labcv.effectsdk;

import android.content.Context;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class ObjectTracking {
    private boolean mInited = false;
    private long mNativePtr;

    public static class ObjectTrackingBoundBox {
        public float centerX;
        public float centerY;
        public float height;
        public float rotateAngle;
        public int status;
        public float timestamp;
        public float width;

        public String toString() {
            return "ObjectTrackingBoundBox{centerX=" + this.centerX + ", centerY=" + this.centerY + ", width=" + this.width + ", height=" + this.height + ", rotateAngle=" + this.rotateAngle + ", timestamp=" + this.timestamp + ", status=" + this.status + '}';
        }
    }

    public static class ObjectTrackingInitParam {
        float detectAngleStep;
        float detectConfirmCandidateThresh;
        int detectHorizontalGridNum;
        int detectNumAngle;
        int detectNumScale;
        float detectProposeCandidateThresh;
        float detectScaleStep;
        int detectVerticalGridNum;
        boolean needInitialBboxEvaluation;
        boolean needRedetection;
        boolean needReset;
        float padding;
        int speed;
        float trackAngleStep;
        int trackNumAngle;
        int trackNumScale;
        float trackScaleStep;
        float trackThresh;
    }

    static {
        try {
            System.loadLibrary("effect");
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        }
    }

    private native int nativeCheckLicense(Context context, String str, boolean z);

    private native int nativeCreate();

    private native int nativeDestroy();

    private native void nativeGetDefaultParam(ObjectTrackingInitParam objectTrackingInitParam);

    private native int nativeInit(String str, ObjectTrackingInitParam objectTrackingInitParam);

    private native int nativeSetInitBox(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, int i5, ObjectTrackingBoundBox objectTrackingBoundBox);

    private native int nativeTrackFrame(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, int i5, float f, ObjectTrackingBoundBox objectTrackingBoundBox);

    public int destroy() {
        if (this.mInited) {
            return nativeDestroy();
        }
        return 0;
    }

    public int init(Context context, String str, String str2, boolean z) {
        int iNativeCreate = nativeCreate();
        if (iNativeCreate != 0) {
            return iNativeCreate;
        }
        int iNativeCheckLicense = nativeCheckLicense(context, str2, z);
        if (iNativeCheckLicense != 0) {
            return iNativeCheckLicense;
        }
        ObjectTrackingInitParam objectTrackingInitParam = new ObjectTrackingInitParam();
        nativeGetDefaultParam(objectTrackingInitParam);
        int iNativeInit = nativeInit(str, objectTrackingInitParam);
        this.mInited = iNativeInit == 0;
        return iNativeInit;
    }

    public int setInitBox(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, int i5, ObjectTrackingBoundBox objectTrackingBoundBox) {
        if (!this.mInited || objectTrackingBoundBox == null) {
            return -1;
        }
        return nativeSetInitBox(byteBuffer, i, i2, i3, i4, i5, objectTrackingBoundBox);
    }

    public int trackFrame(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, int i5, double d, ObjectTrackingBoundBox objectTrackingBoundBox) {
        if (!this.mInited || objectTrackingBoundBox == null) {
            return -1;
        }
        return nativeTrackFrame(byteBuffer, i, i2, i3, i4, i5, (float) d, objectTrackingBoundBox);
    }
}
