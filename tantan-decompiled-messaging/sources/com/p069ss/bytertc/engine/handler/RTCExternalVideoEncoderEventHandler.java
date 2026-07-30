package com.p069ss.bytertc.engine.handler;

import com.bytedance.realx.base.CalledByNative;
import com.p069ss.bytertc.engine.data.StreamIndex;
import com.p069ss.bytertc.engine.engineimpl.RTCEngineImpl;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes13.dex */
public class RTCExternalVideoEncoderEventHandler {
    private static final String TAG = "RTCExternalVideoEncoderEventHandler";
    private WeakReference<RTCEngineImpl> mRtcVideoImpl;

    public RTCExternalVideoEncoderEventHandler(RTCEngineImpl rTCEngineImpl) {
        this.mRtcVideoImpl = new WeakReference<>(rTCEngineImpl);
    }

    @CalledByNative
    public void OnActiveVideoLayer(int i, int i2, boolean z) {
        RTCEngineImpl rTCEngineImpl;
        IExternalVideoEncoderEventHandler externalVideoEncoderEventHandler;
        RTCEngineImpl rTCEngineImpl2;
        IExternalVideoEncoderEventHandler externalVideoEncoderEventHandler2;
        WeakReference<RTCEngineImpl> weakReference = this.mRtcVideoImpl;
        if (weakReference != null && (rTCEngineImpl2 = weakReference.get()) != null && (externalVideoEncoderEventHandler2 = rTCEngineImpl2.getExternalVideoEncoderEventHandler()) != null) {
            externalVideoEncoderEventHandler2.onActiveVideoLayer(StreamIndex.fromId(i), i2, z);
        }
        WeakReference<RTCEngineImpl> weakReference2 = this.mRtcVideoImpl;
        if (weakReference2 == null || (rTCEngineImpl = weakReference2.get()) == null || (externalVideoEncoderEventHandler = rTCEngineImpl.getExternalVideoEncoderEventHandler()) == null) {
            return;
        }
        externalVideoEncoderEventHandler.onActiveVideoLayer(StreamIndex.fromId(i), i2, z);
    }

    @CalledByNative
    public void OnRateUpdate(int i, int i2, int i3, int i4) {
        RTCEngineImpl rTCEngineImpl;
        IExternalVideoEncoderEventHandler externalVideoEncoderEventHandler;
        WeakReference<RTCEngineImpl> weakReference = this.mRtcVideoImpl;
        if (weakReference == null || (rTCEngineImpl = weakReference.get()) == null || (externalVideoEncoderEventHandler = rTCEngineImpl.getExternalVideoEncoderEventHandler()) == null) {
            return;
        }
        externalVideoEncoderEventHandler.onRateUpdate(StreamIndex.fromId(i), i2, i3, i4);
    }

    @CalledByNative
    public void OnRequestKeyFrame(int i, int i2) {
        RTCEngineImpl rTCEngineImpl;
        IExternalVideoEncoderEventHandler externalVideoEncoderEventHandler;
        WeakReference<RTCEngineImpl> weakReference = this.mRtcVideoImpl;
        if (weakReference == null || (rTCEngineImpl = weakReference.get()) == null || (externalVideoEncoderEventHandler = rTCEngineImpl.getExternalVideoEncoderEventHandler()) == null) {
            return;
        }
        externalVideoEncoderEventHandler.onRequestKeyFrame(StreamIndex.fromId(i), i2);
    }

    @CalledByNative
    public void OnStart(int i) {
        RTCEngineImpl rTCEngineImpl;
        IExternalVideoEncoderEventHandler externalVideoEncoderEventHandler;
        WeakReference<RTCEngineImpl> weakReference = this.mRtcVideoImpl;
        if (weakReference == null || (rTCEngineImpl = weakReference.get()) == null || (externalVideoEncoderEventHandler = rTCEngineImpl.getExternalVideoEncoderEventHandler()) == null) {
            return;
        }
        externalVideoEncoderEventHandler.onStart(StreamIndex.fromId(i));
    }

    @CalledByNative
    public void OnStop(int i) {
        RTCEngineImpl rTCEngineImpl;
        IExternalVideoEncoderEventHandler externalVideoEncoderEventHandler;
        WeakReference<RTCEngineImpl> weakReference = this.mRtcVideoImpl;
        if (weakReference == null || (rTCEngineImpl = weakReference.get()) == null || (externalVideoEncoderEventHandler = rTCEngineImpl.getExternalVideoEncoderEventHandler()) == null) {
            return;
        }
        externalVideoEncoderEventHandler.onStop(StreamIndex.fromId(i));
    }
}
