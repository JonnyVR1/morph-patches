package com.imomo.momo.mediaencoder;

/* JADX INFO: loaded from: classes7.dex */
public class FFBgChanger extends FFMediaUtils {
    private long mHandler;
    private OnBgChangerListener mListener;
    private final int CALL_BACK_PROGRESS_TAG = 1;
    private final int CALL_BACK_ERROR_TAG = -1;

    public interface OnBgChangerListener {
        void onError(int i);

        void onProgress(int i);
    }

    private native int nativeBgChangerInitAudioSource(long j, String str, long j2, long j3);

    private native int nativeBgChangerInitVideoSource(long j, String str);

    private native void nativeBgChangerRelease(long j);

    private native void nativeBgChangerSetMixModeAndRatio(long j, int i, int i2);

    private native int nativeBgChangerSetOutputFileName(long j, String str);

    private native void nativeBgChangerStartProcess(long j);

    private native long nativeInitBgChanger(Object obj);

    private static void postEventFromNative(FFBgChanger fFBgChanger, int i, int i2, int i3) {
        if (fFBgChanger == null) {
            return;
        }
        fFBgChanger.onObtainMessage(i, i2, Integer.valueOf(i3));
    }

    public boolean initAudioSource(String str, long j, long j2) {
        return nativeBgChangerInitAudioSource(this.mHandler, str, j, j2) >= 0;
    }

    public boolean initBgChanger() {
        long jNativeInitBgChanger = nativeInitBgChanger(this);
        this.mHandler = jNativeInitBgChanger;
        return jNativeInitBgChanger != 0;
    }

    public boolean initVideoSource(String str) {
        return nativeBgChangerInitVideoSource(this.mHandler, str) >= 0;
    }

    public void onObtainMessage(int i, int i2, Object obj) {
        OnBgChangerListener onBgChangerListener;
        OnBgChangerListener onBgChangerListener2;
        if (i == 1 && (onBgChangerListener2 = this.mListener) != null) {
            onBgChangerListener2.onProgress(i2);
        }
        if (i != -1 || (onBgChangerListener = this.mListener) == null) {
            return;
        }
        onBgChangerListener.onError(i2);
    }

    public void release() {
        nativeBgChangerRelease(this.mHandler);
        this.mHandler = 0L;
    }

    public void setBgChangerListener(OnBgChangerListener onBgChangerListener) {
        this.mListener = onBgChangerListener;
    }

    public void setMixModeAndRatio(Boolean bool, float f) {
        boolean zBooleanValue = bool.booleanValue();
        int i = (int) (f * 255.0f);
        if (i > 255) {
            i = 255;
        }
        if (i < 0) {
            i = 0;
        }
        nativeBgChangerSetMixModeAndRatio(this.mHandler, zBooleanValue ? 1 : 0, i);
    }

    public boolean setOutputFileName(String str) {
        return nativeBgChangerSetOutputFileName(this.mHandler, str) >= 0;
    }

    public void startProcess() {
        nativeBgChangerStartProcess(this.mHandler);
    }
}
