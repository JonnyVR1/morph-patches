package com.bef.effectsdk.algorithm;

import android.graphics.Bitmap;
import com.amazing.annotation.EffectKeep;
import com.bef.effectsdk.ResourceFinder;

/* JADX INFO: loaded from: classes.dex */
@EffectKeep
public class GeneralObjDetector {
    public final int ModelType_kPureDetect = 1;
    public final int ParamType_kDetectShortSideLen = 1;
    private ResourceFinder mFinder;
    private long mFinderHandle;
    private long mNativeHandle;

    private boolean isFinderHandleValid() {
        return 0 != this.mFinderHandle;
    }

    private boolean isNativeHandleValid() {
        return 0 != this.mNativeHandle;
    }

    @EffectKeep
    private native long nativeCreate();

    @EffectKeep
    private native int nativeDestroy(long j);

    @EffectKeep
    private native int nativeInit(long j, long j2, int i);

    @EffectKeep
    private native int nativeInitWithPath(long j, String str, int i);

    @EffectKeep
    private native GeneralObjDetectResult nativeProcess(long j, Bitmap bitmap, int i);

    @EffectKeep
    private native int nativeSetParamF(long j, int i, float f);

    @EffectKeep
    private native int nativeSetParamS(long j, int i, String str);

    public boolean create() {
        this.mNativeHandle = nativeCreate();
        return isNativeHandleValid();
    }

    public void destroy() {
        if (isNativeHandleValid()) {
            nativeDestroy(this.mNativeHandle);
            this.mNativeHandle = 0L;
        }
        if (this.mFinder == null || !isFinderHandleValid()) {
            return;
        }
        this.mFinder.release(this.mFinderHandle);
        this.mFinderHandle = 0L;
    }

    public boolean init(ResourceFinder resourceFinder, int i) {
        if (resourceFinder != null && isNativeHandleValid()) {
            this.mFinder = resourceFinder;
            this.mFinderHandle = resourceFinder.createNativeResourceFinder(this.mNativeHandle);
            if (!isFinderHandleValid()) {
                destroy();
                return false;
            }
            if (nativeInit(this.mNativeHandle, this.mFinderHandle, i) == 0) {
                return true;
            }
        }
        return false;
    }

    public boolean initWithPath(String str, int i) {
        return str != null && str.length() != 0 && isNativeHandleValid() && nativeInitWithPath(this.mNativeHandle, str, i) == 0;
    }

    public GeneralObjDetectResult process(Bitmap bitmap, int i) {
        if (!isNativeHandleValid() || bitmap == null) {
            return new GeneralObjDetectResult();
        }
        GeneralObjDetectResult generalObjDetectResultNativeProcess = nativeProcess(this.mNativeHandle, bitmap, i);
        generalObjDetectResultNativeProcess.logData();
        return generalObjDetectResultNativeProcess;
    }

    public boolean setParamF(int i, float f) {
        return isNativeHandleValid() && nativeSetParamF(this.mNativeHandle, i, f) == 0;
    }

    public boolean setParamS(int i, String str) {
        return isNativeHandleValid() && nativeSetParamS(this.mNativeHandle, i, str) == 0;
    }
}
