package com.p069ss.bytertc.engine.handler;

import com.bytedance.realx.base.CalledByNative;
import com.p069ss.bytertc.engine.IMetadataObserver;
import com.p069ss.bytertc.engine.engineimpl.RTCEngineImpl;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes13.dex */
public class RTCMetadataObserver {
    private static final String TAG = "RtcMetadataObserver";
    private WeakReference<RTCEngineImpl> mRtcVideoImpl;

    public RTCMetadataObserver(RTCEngineImpl rTCEngineImpl) {
        this.mRtcVideoImpl = new WeakReference<>(rTCEngineImpl);
    }

    @CalledByNative
    public void onMetadataReceived(byte[] bArr, String str, long j) {
        RTCEngineImpl rTCEngineImpl;
        IMetadataObserver metadataObserver;
        WeakReference<RTCEngineImpl> weakReference = this.mRtcVideoImpl;
        if (weakReference == null || (rTCEngineImpl = weakReference.get()) == null || (metadataObserver = rTCEngineImpl.getMetadataObserver()) == null) {
            return;
        }
        metadataObserver.onMetadataReceived(bArr, str, j);
    }

    @CalledByNative
    public byte[] onReadyToSendMetadata(long j) {
        RTCEngineImpl rTCEngineImpl;
        WeakReference<RTCEngineImpl> weakReference = this.mRtcVideoImpl;
        IMetadataObserver metadataObserver = (weakReference == null || (rTCEngineImpl = weakReference.get()) == null) ? null : rTCEngineImpl.getMetadataObserver();
        if (metadataObserver != null) {
            return metadataObserver.onReadyToSendMetadata(j);
        }
        return null;
    }
}
