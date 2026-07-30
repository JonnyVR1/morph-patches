package com.effectsar.labcv.effectsdk;

import android.content.Context;
import android.util.Log;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class CineMove {
    static String TAG;
    private boolean mInited;
    private boolean mIsFirstFrame;
    private long mNativePtr;
    private ByteBuffer mResultBuffer = null;

    public enum CINE_MOVE_FEATURE_TYPE {
        CINE_MOVE_FEATURE_FACE_RECT(0),
        CINE_MOVE_FEATURE_BODY_RECT(1),
        CINE_MOVE_FEATURE_FACE_POINT(2),
        CINE_MOVE_FEATURE_BODY_POINT(3),
        CINE_MOVE_FEATURE_MOTION_POINT(4),
        CINE_MOVE_FEATURE_OBJECT_POINT(5);

        private final int type;

        CINE_MOVE_FEATURE_TYPE(int i) {
            this.type = i;
        }

        public int getType() {
            return this.type;
        }
    }

    public enum CINE_MOVE_TYPE {
        CINE_MOVE_ALG_START(0),
        CINE_MOVE_ALG_V1(1),
        CINE_MOVE_ALG_V2(2),
        CINE_MOVE_ALG_V3(3),
        CINE_MOVE_ALG_RHYTHMIC_V4(4),
        CINE_MOVE_ALG_CENTER_FOCUS(5),
        CINE_MOVE_ALG_Y_COOR_V6(6),
        CINE_MOVE_ALG_ROT_V7(7),
        CINE_MOVE_ALG_SNAKE_V8(8),
        CINE_MOVE_ALG_HEART_BEAT_V9(9),
        CINE_MOVE_ALG_BREATH_V10(10),
        CINE_MOVE_ALG_ROT360_V11(11),
        CINE_MOVE_ALG_END(12);

        private final int type;

        CINE_MOVE_TYPE(int i) {
            this.type = i;
        }

        public int getType() {
            return this.type;
        }
    }

    static {
        try {
            System.loadLibrary("effect");
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        }
        TAG = "CineMove";
    }

    private native int nativeCreate(int i, String str, boolean z);

    private native int nativeProcess(int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, BefTextureResultInfo befTextureResultInfo);

    private native int nativeRelease();

    public int init(Context context, int i, String str, boolean z) {
        int iNativeCreate = nativeCreate(i, str, z);
        this.mInited = iNativeCreate == 0;
        this.mIsFirstFrame = true;
        return iNativeCreate;
    }

    public boolean isInited() {
        return this.mInited;
    }

    public int process(int i, EffectsSDKEffectConstants.PixlFormat pixlFormat, int i2, int i3, int i4, boolean z, BefTextureResultInfo befTextureResultInfo) {
        if (!this.mInited) {
            return -1;
        }
        int iNativeProcess = nativeProcess(i, pixlFormat.getValue(), i2, i3, i4, this.mIsFirstFrame, z, befTextureResultInfo);
        if (iNativeProcess != 0) {
            Log.e(EffectsSDKEffectConstants.TAG, "native detect return " + iNativeProcess);
        }
        if (this.mIsFirstFrame) {
            this.mIsFirstFrame = false;
        }
        return iNativeProcess;
    }

    public void release() {
        if (this.mInited) {
            nativeRelease();
        }
        this.mInited = false;
        this.mIsFirstFrame = true;
    }
}
