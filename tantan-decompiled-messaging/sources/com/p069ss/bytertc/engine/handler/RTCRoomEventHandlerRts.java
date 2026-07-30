package com.p069ss.bytertc.engine.handler;

import com.bytedance.realx.base.CalledByNative;
import com.p069ss.bytertc.engine.InternalRTCStats;
import com.p069ss.bytertc.engine.RTSRoomImpl;
import com.p069ss.bytertc.engine.UserInfo;
import com.p069ss.bytertc.engine.type.RTCRoomStats;
import com.p069ss.bytertc.engine.utils.LogUtil;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public class RTCRoomEventHandlerRts {
    private static final String TAG = "RtcRoomEventHandlerRts";
    private RTSRoomImpl mRtcRoom;

    public RTCRoomEventHandlerRts(RTSRoomImpl rTSRoomImpl) {
        this.mRtcRoom = rTSRoomImpl;
    }

    @CalledByNative
    public static ByteBuffer allocateDirectByteBuffer(int i) {
        return ByteBuffer.allocateDirect(i);
    }

    @CalledByNative
    public void onLeaveRoom(InternalRTCStats internalRTCStats) {
        IRTSRoomEventHandler rtcRoomHandlerRts;
        LogUtil.m80900d(TAG, "onLeaveRoom...");
        try {
            RTSRoomImpl rTSRoomImpl = this.mRtcRoom;
            if (rTSRoomImpl == null || (rtcRoomHandlerRts = rTSRoomImpl.getRtcRoomHandlerRts()) == null) {
                return;
            }
            rtcRoomHandlerRts.onLeaveRoom(new RTCRoomStats(internalRTCStats));
        } catch (Exception e) {
            LogUtil.m80900d(TAG, "onLeaveRoom callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onRoomBinaryMessageReceived(String str, ByteBuffer byteBuffer, long j) {
        IRTSRoomEventHandler rtcRoomHandlerRts;
        LogUtil.m80900d(TAG, "onRoomBinaryMessageReceived, length: " + byteBuffer.capacity());
        try {
            RTSRoomImpl rTSRoomImpl = this.mRtcRoom;
            if (rTSRoomImpl == null || (rtcRoomHandlerRts = rTSRoomImpl.getRtcRoomHandlerRts()) == null) {
                return;
            }
            rtcRoomHandlerRts.onRoomBinaryMessageReceived(str, byteBuffer.duplicate());
            rtcRoomHandlerRts.onRoomBinaryMessageReceived(j, str, byteBuffer);
        } catch (Exception e) {
            LogUtil.m80900d(TAG, "onRoomBinaryMessageReceived callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onRoomMessageReceived(String str, String str2, long j) {
        IRTSRoomEventHandler rtcRoomHandlerRts;
        LogUtil.m80900d(TAG, "onRoomMessageReceived: " + str2);
        try {
            RTSRoomImpl rTSRoomImpl = this.mRtcRoom;
            if (rTSRoomImpl == null || (rtcRoomHandlerRts = rTSRoomImpl.getRtcRoomHandlerRts()) == null) {
                return;
            }
            rtcRoomHandlerRts.onRoomMessageReceived(str, str2);
            rtcRoomHandlerRts.onRoomMessageReceived(j, str, str2);
        } catch (Exception e) {
            LogUtil.m80900d(TAG, "onRoomMessageReceived callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onRoomMessageSendResult(long j, int i) {
        IRTSRoomEventHandler rtcRoomHandlerRts;
        LogUtil.m80900d(TAG, "onRoomMessageSendResult...");
        try {
            RTSRoomImpl rTSRoomImpl = this.mRtcRoom;
            if (rTSRoomImpl == null || (rtcRoomHandlerRts = rTSRoomImpl.getRtcRoomHandlerRts()) == null) {
                return;
            }
            rtcRoomHandlerRts.onRoomMessageSendResult(j, i);
        } catch (Exception e) {
            LogUtil.m80900d(TAG, "onRoomMessageSendResult callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onRoomStateChanged(String str, String str2, int i, String str3) {
        IRTSRoomEventHandler rtcRoomHandlerRts;
        LogUtil.m80900d(TAG, "onRoomStateChanged...");
        try {
            RTSRoomImpl rTSRoomImpl = this.mRtcRoom;
            if (rTSRoomImpl == null || (rtcRoomHandlerRts = rTSRoomImpl.getRtcRoomHandlerRts()) == null) {
                return;
            }
            rtcRoomHandlerRts.onRoomStateChanged(str, str2, i, str3);
        } catch (Exception e) {
            LogUtil.m80900d(TAG, "onRoomStateChanged callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onUserBinaryMessageReceived(String str, ByteBuffer byteBuffer, long j) {
        IRTSRoomEventHandler rtcRoomHandlerRts;
        LogUtil.m80900d(TAG, "onUserBinaryMessageReceived: uid:" + str + "binary message length" + byteBuffer.capacity());
        try {
            RTSRoomImpl rTSRoomImpl = this.mRtcRoom;
            if (rTSRoomImpl == null || (rtcRoomHandlerRts = rTSRoomImpl.getRtcRoomHandlerRts()) == null) {
                return;
            }
            rtcRoomHandlerRts.onUserBinaryMessageReceived(str, byteBuffer.duplicate());
            rtcRoomHandlerRts.onUserBinaryMessageReceived(j, str, byteBuffer);
        } catch (Exception e) {
            LogUtil.m80900d(TAG, "onUserBinaryMessageReceived callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onUserJoined(UserInfo userInfo) {
        IRTSRoomEventHandler rtcRoomHandlerRts;
        LogUtil.m80900d(TAG, "onUserJoined... uid: " + userInfo.getUid() + ", extraInfo: " + userInfo.getExtraInfo());
        try {
            RTSRoomImpl rTSRoomImpl = this.mRtcRoom;
            if (rTSRoomImpl == null || (rtcRoomHandlerRts = rTSRoomImpl.getRtcRoomHandlerRts()) == null) {
                return;
            }
            rtcRoomHandlerRts.onUserJoined(userInfo);
        } catch (Exception e) {
            LogUtil.m80900d(TAG, "onUserJoined callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onUserLeave(String str, int i) {
        IRTSRoomEventHandler rtcRoomHandlerRts;
        LogUtil.m80900d(TAG, "onUserLeave... uid: " + str + ", reason: " + i);
        try {
            RTSRoomImpl rTSRoomImpl = this.mRtcRoom;
            if (rTSRoomImpl == null || (rtcRoomHandlerRts = rTSRoomImpl.getRtcRoomHandlerRts()) == null) {
                return;
            }
            rtcRoomHandlerRts.onUserLeave(str, i);
        } catch (Exception e) {
            LogUtil.m80900d(TAG, "onUserLeave callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onUserMessageReceived(String str, String str2, long j) {
        IRTSRoomEventHandler rtcRoomHandlerRts;
        LogUtil.m80900d(TAG, "onUserMessageReceived: uid:" + str + "message" + str2);
        try {
            RTSRoomImpl rTSRoomImpl = this.mRtcRoom;
            if (rTSRoomImpl == null || (rtcRoomHandlerRts = rTSRoomImpl.getRtcRoomHandlerRts()) == null) {
                return;
            }
            rtcRoomHandlerRts.onUserMessageReceived(str, str2);
            rtcRoomHandlerRts.onUserMessageReceived(j, str, str2);
        } catch (Exception e) {
            LogUtil.m80900d(TAG, "onUserMessageReceived callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onUserMessageSendResult(long j, int i) {
        IRTSRoomEventHandler rtcRoomHandlerRts;
        LogUtil.m80900d(TAG, "onUserMessageSendResult...");
        try {
            RTSRoomImpl rTSRoomImpl = this.mRtcRoom;
            if (rTSRoomImpl == null || (rtcRoomHandlerRts = rTSRoomImpl.getRtcRoomHandlerRts()) == null) {
                return;
            }
            rtcRoomHandlerRts.onUserMessageSendResult(j, i);
        } catch (Exception e) {
            LogUtil.m80900d(TAG, "onUserMessageSendResult callback catch exception.\n" + e.getMessage());
        }
    }
}
