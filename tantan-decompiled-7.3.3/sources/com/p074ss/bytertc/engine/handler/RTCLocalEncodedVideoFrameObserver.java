package com.p074ss.bytertc.engine.handler;

import com.bytedance.realx.base.CalledByNative;
import com.p074ss.bytertc.engine.data.StreamIndex;
import com.p074ss.bytertc.engine.data.VideoCodecType;
import com.p074ss.bytertc.engine.data.VideoPictureType;
import com.p074ss.bytertc.engine.data.VideoRotation;
import com.p074ss.bytertc.engine.engineimpl.RTCEngineImpl;
import com.p074ss.bytertc.engine.mediaio.ILocalEncodedVideoFrameObserver;
import com.p074ss.bytertc.engine.mediaio.RTCEncodedVideoFrame;
import com.p074ss.bytertc.engine.video.VideoStream;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes11.dex */
public class RTCLocalEncodedVideoFrameObserver {
    private static final String TAG = "RTCLocalEncodedVideoFrameObserver";
    private WeakReference<RTCEngineImpl> mRtcVideoImpl;

    public RTCLocalEncodedVideoFrameObserver(RTCEngineImpl rTCEngineImpl) {
        this.mRtcVideoImpl = new WeakReference<>(rTCEngineImpl);
    }

    @CalledByNative
    public void onLocalEncodedVideoFrame(int i, VideoStream videoStream, long j, long j2, int i2, int i3, int i4) {
        RTCEngineImpl rTCEngineImpl;
        ILocalEncodedVideoFrameObserver encodedVideoFrameObserver;
        if (videoStream == null) {
            return;
        }
        WeakReference<RTCEngineImpl> weakReference = this.mRtcVideoImpl;
        if (weakReference != null && (rTCEngineImpl = weakReference.get()) != null && (encodedVideoFrameObserver = rTCEngineImpl.getEncodedVideoFrameObserver()) != null) {
            encodedVideoFrameObserver.onLocalEncodedVideoFrame(StreamIndex.fromId(i), new RTCEncodedVideoFrame(videoStream.getBuffer().getData(), j, j2, videoStream.getWidth(), videoStream.getHeight(), VideoCodecType.fromId(i2), VideoPictureType.fromId(i3), VideoRotation.fromId(i4)));
        }
        videoStream.release();
    }
}
