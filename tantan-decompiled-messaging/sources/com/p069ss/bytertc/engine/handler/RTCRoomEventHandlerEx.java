package com.p069ss.bytertc.engine.handler;

import com.bytedance.realx.base.CalledByNative;
import com.p069ss.bytertc.engine.RTCRoomImpl;
import com.p069ss.bytertc.engine.SubscribeConfig;
import com.p069ss.bytertc.engine.data.AVSyncEvent;
import com.p069ss.bytertc.engine.data.RemoteStreamKey;
import com.p069ss.bytertc.engine.data.StreamIndex;
import com.p069ss.bytertc.engine.data.StreamKey;
import com.p069ss.bytertc.engine.type.MediaStreamType;
import com.p069ss.bytertc.engine.type.StreamRemoveReason;
import com.p069ss.bytertc.engine.utils.LogUtil;

/* JADX INFO: loaded from: classes13.dex */
public class RTCRoomEventHandlerEx {
    private static final String TAG = "RtcRoomEventHandlerEx";
    private RTCRoomImpl mRtcRoom;

    public RTCRoomEventHandlerEx(RTCRoomImpl rTCRoomImpl) {
        this.mRtcRoom = rTCRoomImpl;
    }

    @CalledByNative
    public void onAVSyncEvent(StreamKey streamKey, AVSyncEvent aVSyncEvent) {
        LogUtil.m80900d(TAG, "onAVSyncEvent...");
        try {
            IRTCRoomEventHandlerEx rtcRoomHandlerEx = this.mRtcRoom.getRtcRoomHandlerEx();
            if (rtcRoomHandlerEx != null) {
                rtcRoomHandlerEx.onAVSyncEvent(streamKey, aVSyncEvent);
            }
        } catch (Exception e) {
            LogUtil.m80900d(TAG, "onAVSyncEvent callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onStreamPublishSuccess(String str, StreamIndex streamIndex, boolean z) {
        LogUtil.m80900d(TAG, "onStreamPublishSuccess...");
        try {
            IRTCRoomEventHandlerEx rtcRoomHandlerEx = this.mRtcRoom.getRtcRoomHandlerEx();
            if (rtcRoomHandlerEx != null) {
                rtcRoomHandlerEx.onStreamPublishSuccess(str, streamIndex, z);
            }
        } catch (Exception e) {
            LogUtil.m80900d(TAG, "onStreamPublishSuccess callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onStreamStateChanged(StreamKey streamKey, int i, String str) {
        LogUtil.m80900d(TAG, "onStreamStateChanged streamIndex: " + streamKey.getStreamIndex());
        try {
            IRTCRoomEventHandlerEx rtcRoomHandlerEx = this.mRtcRoom.getRtcRoomHandlerEx();
            if (rtcRoomHandlerEx != null) {
                rtcRoomHandlerEx.onStreamStateChanged(streamKey, i, str);
            }
        } catch (Exception e) {
            LogUtil.m80900d(TAG, "onStreamStateChanged callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onStreamSubscribed(int i, String str, StreamIndex streamIndex, SubscribeConfig subscribeConfig) {
        LogUtil.m80900d(TAG, "onStreamSubscribed...");
        try {
            IRTCRoomEventHandlerEx rtcRoomHandlerEx = this.mRtcRoom.getRtcRoomHandlerEx();
            if (rtcRoomHandlerEx != null) {
                rtcRoomHandlerEx.onStreamSubscribed(i, str, streamIndex, subscribeConfig);
            }
        } catch (Exception e) {
            LogUtil.m80900d(TAG, "onStreamSubscribed callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onUserPublishStream(RemoteStreamKey remoteStreamKey, boolean z, int i) {
        LogUtil.m80900d(TAG, "onUserPublishStream streamIndex: " + remoteStreamKey.getStreamIndex());
        try {
            IRTCRoomEventHandlerEx rtcRoomHandlerEx = this.mRtcRoom.getRtcRoomHandlerEx();
            if (rtcRoomHandlerEx != null) {
                rtcRoomHandlerEx.onUserPublishStream(remoteStreamKey, z, MediaStreamType.valueOf(i));
            }
        } catch (Exception e) {
            LogUtil.m80900d(TAG, "onUserPublishStream callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onUserUnpublishStream(RemoteStreamKey remoteStreamKey, int i, int i2) {
        LogUtil.m80900d(TAG, "onUserUnpublishStream streamIndex: " + remoteStreamKey.getStreamIndex());
        if (i2 >= 0) {
            try {
                if (i2 > StreamRemoveReason.STREAM_REMOVE_REASON_PUBLISH_PRIVILEGE_TOKEN_EXPIRED.value()) {
                    LogUtil.m80900d(TAG, "onUserUnpublishStream callback reason invalid.\n");
                    i2 = 0;
                }
            } catch (Exception e) {
                LogUtil.m80900d(TAG, "onUserUnpublishStream callback catch exception.\n" + e.getMessage());
                return;
            }
        } else {
            LogUtil.m80900d(TAG, "onUserUnpublishStream callback reason invalid.\n");
            i2 = 0;
        }
        IRTCRoomEventHandlerEx rtcRoomHandlerEx = this.mRtcRoom.getRtcRoomHandlerEx();
        if (rtcRoomHandlerEx != null) {
            rtcRoomHandlerEx.onUserUnpublishStream(remoteStreamKey, MediaStreamType.valueOf(i), StreamRemoveReason.values()[i2]);
        }
    }
}
