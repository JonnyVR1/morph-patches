package io.agora.utils2.internal;

import io.agora.base.internal.CalledByNative;

/* JADX INFO: loaded from: classes2.dex */
public class RtcSystemEventListener implements CommonUtility.SystemEventListener {
    private static final String TAG = "RtcSystemEventListener";
    private long mNativeHandle;

    @CalledByNative
    public RtcSystemEventListener(long j) {
        this.mNativeHandle = j;
    }

    private native void nativeAudioRoutingPhoneChanged(boolean z, int i, int i2);

    private native void nativeNotifyAddressBound(String str);

    private native void nativeNotifyForegroundChanged(boolean z);

    private native void nativeNotifyGravityOriChange(int i);

    private native void nativeNotifyNetworkChange(CommonUtility.MediaNetworkInfo mediaNetworkInfo);

    @CalledByNative
    public long getNativeHandle() {
        return this.mNativeHandle;
    }

    @Override // io.agora.utils2.internal.CommonUtility.SystemEventListener
    public void onAddressBound(String str) {
        nativeNotifyAddressBound(str);
    }

    @Override // io.agora.utils2.internal.CommonUtility.SystemEventListener
    public void onAudioRoutingPhoneChanged(boolean z, int i, int i2) {
        nativeAudioRoutingPhoneChanged(z, i, i2);
    }

    @Override // io.agora.utils2.internal.CommonUtility.SystemEventListener
    public void onForegroundChanged(boolean z) {
        nativeNotifyForegroundChanged(z);
    }

    @Override // io.agora.utils2.internal.CommonUtility.SystemEventListener
    public void onGravityOriChange(int i) {
        nativeNotifyGravityOriChange(i);
    }

    @Override // io.agora.utils2.internal.CommonUtility.SystemEventListener
    public void onNetworkChange(CommonUtility.MediaNetworkInfo mediaNetworkInfo) {
        nativeNotifyNetworkChange(mediaNetworkInfo);
    }
}
