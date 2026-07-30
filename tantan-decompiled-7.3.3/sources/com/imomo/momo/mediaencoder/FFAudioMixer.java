package com.imomo.momo.mediaencoder;

import android.util.Log;

/* JADX INFO: loaded from: classes7.dex */
public class FFAudioMixer extends FFMediaUtils {
    private long mHandler;
    private OnAudioMixerListener mListener;
    private final int CALL_BACK_PROGRESS_TAG = -1;
    private final int CALL_BACK_ERROR_TAG = -2;

    public interface OnAudioMixerListener {
        void onError(int i);

        void onProgress(int i);
    }

    private native int nativeAddMainSource(long j, String str, int i);

    private native int nativeAddMusicSource(long j, String str, int i, int i2);

    private native int nativeAddSource(long j, String str, int i, int i2);

    private native long nativeCreateAudioMixer(Object obj);

    private native void nativeInit(long j, int i, int i2, int i3, String str);

    private native void nativeRelease(long j);

    private native int nativeStart(long j);

    private static void postEventFromNative(FFAudioMixer fFAudioMixer, int i, int i2, int i3) {
        if (fFAudioMixer == null) {
            Log.e("FFAudioMixer", "audioMixer_ref is null");
        } else {
            fFAudioMixer.onObtainMessage(i, i2, Integer.valueOf(i3));
        }
    }

    public void addMainSource(String str, int i) {
        nativeAddMainSource(this.mHandler, str, i);
    }

    public void addMusicSource(String str, int i, int i2) {
        nativeAddMusicSource(this.mHandler, str, i, i2);
    }

    public void addSource(String str, int i, int i2) {
        nativeAddSource(this.mHandler, str, i, i2);
    }

    public boolean initAudioMixer(int i, int i2, int i3, String str) {
        long jNativeCreateAudioMixer = nativeCreateAudioMixer(this);
        this.mHandler = jNativeCreateAudioMixer;
        if (jNativeCreateAudioMixer == 0) {
            return false;
        }
        nativeInit(jNativeCreateAudioMixer, i, i2, i3, str);
        return true;
    }

    public void onObtainMessage(int i, int i2, Object obj) {
        OnAudioMixerListener onAudioMixerListener;
        OnAudioMixerListener onAudioMixerListener2;
        if (i == -1 && (onAudioMixerListener2 = this.mListener) != null) {
            onAudioMixerListener2.onProgress(i2);
        }
        if (i != -2 || (onAudioMixerListener = this.mListener) == null) {
            return;
        }
        onAudioMixerListener.onError(i2);
    }

    public void release() {
        nativeRelease(this.mHandler);
    }

    public void setOnAudioMixerListener(OnAudioMixerListener onAudioMixerListener) {
        this.mListener = onAudioMixerListener;
    }

    public void start() {
        nativeStart(this.mHandler);
    }
}
