package com.p069ss.bytertc.engine.live;

import com.bytedance.realx.base.CalledByNative;
import com.p069ss.bytertc.engine.video.IVideoFrame;

/* JADX INFO: loaded from: classes13.dex */
public class PushMixedStreamToCDNObserver {
    private IClientMixedStreamObserver mLiveTransObserver = null;

    @CalledByNative
    public void onCacheSyncVideoFrames(String str, String[] strArr, IVideoFrame[] iVideoFrameArr, byte[][] bArr, int i) {
        IClientMixedStreamObserver iClientMixedStreamObserver = this.mLiveTransObserver;
        if (iClientMixedStreamObserver != null) {
            iClientMixedStreamObserver.onCacheSyncVideoFrames(str, strArr, iVideoFrameArr, bArr, i);
        }
    }

    @CalledByNative
    public void onClientMixedStreamEvent(MixedStreamTaskInfo mixedStreamTaskInfo, MixedStreamType mixedStreamType, MixedStreamTaskEvent mixedStreamTaskEvent, MixedStreamTaskErrorCode mixedStreamTaskErrorCode) {
        IClientMixedStreamObserver iClientMixedStreamObserver = this.mLiveTransObserver;
        if (iClientMixedStreamObserver != null) {
            iClientMixedStreamObserver.onClientMixedStreamEvent(mixedStreamTaskInfo, mixedStreamType, mixedStreamTaskEvent, mixedStreamTaskErrorCode);
        }
    }

    @CalledByNative
    public void onMixedAudioFrame(String str, byte[] bArr, int i, long j) {
        IClientMixedStreamObserver iClientMixedStreamObserver = this.mLiveTransObserver;
        if (iClientMixedStreamObserver != null) {
            iClientMixedStreamObserver.onMixedAudioFrame(str, bArr, i, j);
        }
    }

    @CalledByNative
    public void onMixedDataFrame(String str, byte[] bArr, long j) {
        IClientMixedStreamObserver iClientMixedStreamObserver = this.mLiveTransObserver;
        if (iClientMixedStreamObserver != null) {
            iClientMixedStreamObserver.onMixedDataFrame(str, bArr, j);
        }
    }

    @CalledByNative
    public void onMixedFirstAudioFrame(String str) {
        IClientMixedStreamObserver iClientMixedStreamObserver = this.mLiveTransObserver;
        if (iClientMixedStreamObserver != null) {
            iClientMixedStreamObserver.onMixedFirstAudioFrame(str);
        }
    }

    @CalledByNative
    public void onMixedFirstVideoFrame(String str) {
        IClientMixedStreamObserver iClientMixedStreamObserver = this.mLiveTransObserver;
        if (iClientMixedStreamObserver != null) {
            iClientMixedStreamObserver.onMixedFirstVideoFrame(str);
        }
    }

    @CalledByNative
    public void onMixedVideoFrame(String str, IVideoFrame iVideoFrame) {
        IClientMixedStreamObserver iClientMixedStreamObserver = this.mLiveTransObserver;
        if (iClientMixedStreamObserver != null) {
            iClientMixedStreamObserver.onMixedVideoFrame(str, iVideoFrame);
        }
    }

    public void setUserObserver(IClientMixedStreamObserver iClientMixedStreamObserver) {
        this.mLiveTransObserver = iClientMixedStreamObserver;
    }
}
