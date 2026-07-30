package com.p074ss.bytertc.engine.handler;

import com.bytedance.realx.base.CalledByNative;
import com.p074ss.bytertc.engine.GameRoomImpl;
import com.p074ss.bytertc.engine.InternalLocalStreamStats;
import com.p074ss.bytertc.engine.InternalNetworkQualityInfo;
import com.p074ss.bytertc.engine.InternalRTCStats;
import com.p074ss.bytertc.engine.InternalRemoteStreamStats;
import com.p074ss.bytertc.engine.InternalRoomEventInfo;
import com.p074ss.bytertc.engine.RTCRoomImpl;
import com.p074ss.bytertc.engine.RTCStream;
import com.p074ss.bytertc.engine.UserInfo;
import com.p074ss.bytertc.engine.data.AVSyncEvent;
import com.p074ss.bytertc.engine.data.AVSyncState;
import com.p074ss.bytertc.engine.data.ForwardStreamEventInfo;
import com.p074ss.bytertc.engine.data.ForwardStreamStateInfo;
import com.p074ss.bytertc.engine.data.PublishState;
import com.p074ss.bytertc.engine.data.PublishStateChangeReason;
import com.p074ss.bytertc.engine.data.SubscribeState;
import com.p074ss.bytertc.engine.data.SubscribeStateChangeReason;
import com.p074ss.bytertc.engine.type.LocalStreamStats;
import com.p074ss.bytertc.engine.type.MediaStreamType;
import com.p074ss.bytertc.engine.type.NetworkQualityStats;
import com.p074ss.bytertc.engine.type.RTCRoomStats;
import com.p074ss.bytertc.engine.type.RemoteStreamStats;
import com.p074ss.bytertc.engine.type.RoomEvent;
import com.p074ss.bytertc.engine.type.RoomEventInfo;
import com.p074ss.bytertc.engine.type.RoomState;
import com.p074ss.bytertc.engine.type.RoomStateChangeReason;
import com.p074ss.bytertc.engine.type.SetRoomExtraInfoResult;
import com.p074ss.bytertc.engine.type.StreamRemoveReason;
import com.p074ss.bytertc.engine.type.SubtitleErrorCode;
import com.p074ss.bytertc.engine.type.SubtitleMessage;
import com.p074ss.bytertc.engine.type.SubtitleState;
import com.p074ss.bytertc.engine.type.UserVisibilityChangeError;
import com.p074ss.bytertc.engine.utils.LogUtil;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes11.dex */
public class RTCRoomEventHandler {
    private static final String TAG = "RtcRoomEventHandler";
    private GameRoomImpl mGameRTCRoom;
    private RTCRoomImpl mRtcRoom;

    public RTCRoomEventHandler(RTCRoomImpl rTCRoomImpl, GameRoomImpl gameRoomImpl) {
        this.mRtcRoom = rTCRoomImpl;
        this.mGameRTCRoom = gameRoomImpl;
    }

    @CalledByNative
    public static ByteBuffer allocateDirectByteBuffer(int i) {
        return ByteBuffer.allocateDirect(i);
    }

    @CalledByNative
    public void onAVSyncEvent(String str, String str2, AVSyncEvent aVSyncEvent) {
        LogUtil.m82083d(TAG, "onAVSyncEvent...");
        try {
            RTCRoomImpl rTCRoomImpl = this.mRtcRoom;
            if (rTCRoomImpl != null) {
                rTCRoomImpl.getRtcRoomHandler().onAVSyncEvent(str, str2, aVSyncEvent);
                return;
            }
            GameRoomImpl gameRoomImpl = this.mGameRTCRoom;
            if (gameRoomImpl != null) {
                gameRoomImpl.getRtcRoomHandler().onAVSyncEvent(str, str2, aVSyncEvent);
            }
        } catch (Exception e) {
            LogUtil.m82083d(TAG, "onAVSyncEvent callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onAVSyncStateChange(AVSyncState aVSyncState) {
        LogUtil.m82083d(TAG, "onAVSyncStateChange: " + aVSyncState);
        try {
            RTCRoomImpl rTCRoomImpl = this.mRtcRoom;
            if (rTCRoomImpl != null) {
                rTCRoomImpl.getRtcRoomHandler().onAVSyncStateChange(aVSyncState);
                return;
            }
            GameRoomImpl gameRoomImpl = this.mGameRTCRoom;
            if (gameRoomImpl != null) {
                gameRoomImpl.getRtcRoomHandler().onAVSyncStateChange(aVSyncState);
            }
        } catch (Exception e) {
            LogUtil.m82083d(TAG, "onAVSyncStateChange callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onAudioPublishStateChanged(String str, String str2, PublishState publishState, PublishStateChangeReason publishStateChangeReason) {
        LogUtil.m82083d(TAG, "onAudioPublishStateChanged");
        try {
            RTCRoomImpl rTCRoomImpl = this.mRtcRoom;
            if (rTCRoomImpl != null) {
                rTCRoomImpl.getRtcRoomHandler().onAudioPublishStateChanged(str, str2, publishState, publishStateChangeReason);
                return;
            }
            GameRoomImpl gameRoomImpl = this.mGameRTCRoom;
            if (gameRoomImpl != null) {
                gameRoomImpl.getRtcRoomHandler().onAudioPublishStateChanged(str, str2, publishState, publishStateChangeReason);
            }
        } catch (Exception e) {
            LogUtil.m82083d(TAG, "onAudioPublishStateChanged callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onAudioStreamBanned(String str, boolean z) {
        StringBuilder sb = new StringBuilder("onAudioStreamBanned, user: ");
        sb.append(str);
        sb.append(", banned: ");
        sb.append(z ? "true" : "false");
        LogUtil.m82083d(TAG, sb.toString());
        try {
            RTCRoomImpl rTCRoomImpl = this.mRtcRoom;
            if (rTCRoomImpl != null) {
                rTCRoomImpl.getRtcRoomHandler().onAudioStreamBanned(str, z);
                return;
            }
            GameRoomImpl gameRoomImpl = this.mGameRTCRoom;
            if (gameRoomImpl != null) {
                gameRoomImpl.getRtcRoomHandler().onAudioStreamBanned(str, z);
            }
        } catch (Exception e) {
            LogUtil.m82083d(TAG, "onAudioStreamBanned callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onAudioSubscribeStateChanged(String str, String str2, SubscribeState subscribeState, SubscribeStateChangeReason subscribeStateChangeReason) {
        LogUtil.m82083d(TAG, "onAudioSubscribeStateChanged");
        try {
            RTCRoomImpl rTCRoomImpl = this.mRtcRoom;
            if (rTCRoomImpl != null) {
                rTCRoomImpl.getRtcRoomHandler().onAudioSubscribeStateChanged(str, str2, subscribeState, subscribeStateChangeReason);
                return;
            }
            GameRoomImpl gameRoomImpl = this.mGameRTCRoom;
            if (gameRoomImpl != null) {
                gameRoomImpl.getRtcRoomHandler().onAudioSubscribeStateChanged(str, str2, subscribeState, subscribeStateChangeReason);
            }
        } catch (Exception e) {
            LogUtil.m82083d(TAG, "onAudioSubscribeStateChanged callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onForwardStreamEvent(ForwardStreamEventInfo[] forwardStreamEventInfoArr) {
        LogUtil.m82083d(TAG, "onForwardStreamEvent");
        try {
            RTCRoomImpl rTCRoomImpl = this.mRtcRoom;
            if (rTCRoomImpl != null) {
                rTCRoomImpl.getRtcRoomHandler().onForwardStreamEvent(forwardStreamEventInfoArr);
                return;
            }
            GameRoomImpl gameRoomImpl = this.mGameRTCRoom;
            if (gameRoomImpl != null) {
                gameRoomImpl.getRtcRoomHandler().onForwardStreamEvent(forwardStreamEventInfoArr);
            }
        } catch (Exception e) {
            LogUtil.m82083d(TAG, "onForwardStreamEvent callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onForwardStreamStateChanged(ForwardStreamStateInfo[] forwardStreamStateInfoArr) {
        LogUtil.m82083d(TAG, "OnForwardStreamStateChanged");
        try {
            RTCRoomImpl rTCRoomImpl = this.mRtcRoom;
            if (rTCRoomImpl != null) {
                rTCRoomImpl.getRtcRoomHandler().onForwardStreamStateChanged(forwardStreamStateInfoArr);
                return;
            }
            GameRoomImpl gameRoomImpl = this.mGameRTCRoom;
            if (gameRoomImpl != null) {
                gameRoomImpl.getRtcRoomHandler().onForwardStreamStateChanged(forwardStreamStateInfoArr);
            }
        } catch (Exception e) {
            LogUtil.m82083d(TAG, "onForwardStreamStateChanged callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onLeaveRoom(InternalRTCStats internalRTCStats) {
        LogUtil.m82083d(TAG, "onLeaveRoom...");
        try {
            RTCRoomImpl rTCRoomImpl = this.mRtcRoom;
            if (rTCRoomImpl != null) {
                rTCRoomImpl.getRtcRoomHandler().onLeaveRoom(new RTCRoomStats(internalRTCStats));
                return;
            }
            GameRoomImpl gameRoomImpl = this.mGameRTCRoom;
            if (gameRoomImpl != null) {
                gameRoomImpl.getRtcRoomHandler().onLeaveRoom(new RTCRoomStats(internalRTCStats));
            }
        } catch (Exception e) {
            LogUtil.m82083d(TAG, "onLeaveRoom callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onLocalStreamStats(InternalLocalStreamStats internalLocalStreamStats) {
        LogUtil.m82083d(TAG, "onLocalStreamStats...");
        try {
            RTCRoomImpl rTCRoomImpl = this.mRtcRoom;
            if (rTCRoomImpl != null) {
                rTCRoomImpl.getRtcRoomHandler().onLocalStreamStats(new LocalStreamStats(internalLocalStreamStats));
                return;
            }
            GameRoomImpl gameRoomImpl = this.mGameRTCRoom;
            if (gameRoomImpl != null) {
                gameRoomImpl.getRtcRoomHandler().onLocalStreamStats(new LocalStreamStats(internalLocalStreamStats));
            }
        } catch (Exception e) {
            LogUtil.m82083d(TAG, "onLocalStreamStats callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onNetworkQuality(InternalNetworkQualityInfo internalNetworkQualityInfo, InternalNetworkQualityInfo[] internalNetworkQualityInfoArr) {
        IRTCRoomEventHandler rtcRoomHandler;
        LogUtil.m82083d(TAG, "Local onNetworkQuality, uid: " + internalNetworkQualityInfo.uid + ", info: " + internalNetworkQualityInfo.toString());
        try {
            RTCRoomImpl rTCRoomImpl = this.mRtcRoom;
            if (rTCRoomImpl != null) {
                rtcRoomHandler = rTCRoomImpl.getRtcRoomHandler();
            } else {
                GameRoomImpl gameRoomImpl = this.mGameRTCRoom;
                rtcRoomHandler = gameRoomImpl != null ? gameRoomImpl.getRtcRoomHandler() : null;
            }
            if (rtcRoomHandler != null) {
                NetworkQualityStats[] networkQualityStatsArr = new NetworkQualityStats[internalNetworkQualityInfoArr.length];
                for (int i = 0; i < internalNetworkQualityInfoArr.length; i++) {
                    LogUtil.m82083d(TAG, "Remote onNetworkQuality, uid: " + internalNetworkQualityInfoArr[i].uid + ", info: " + internalNetworkQualityInfoArr[i].toString());
                    networkQualityStatsArr[i] = new NetworkQualityStats(internalNetworkQualityInfoArr[i]);
                }
                rtcRoomHandler.onNetworkQuality(new NetworkQualityStats(internalNetworkQualityInfo), networkQualityStatsArr);
            }
        } catch (Exception e) {
            LogUtil.m82083d(TAG, "onNetworkQuality callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onPublishPrivilegeTokenWillExpire() {
        LogUtil.m82083d(TAG, "onPublishPrivilegeTokenWillExpire");
        try {
            RTCRoomImpl rTCRoomImpl = this.mRtcRoom;
            if (rTCRoomImpl != null) {
                rTCRoomImpl.getRtcRoomHandler().onPublishPrivilegeTokenWillExpire();
                return;
            }
            GameRoomImpl gameRoomImpl = this.mGameRTCRoom;
            if (gameRoomImpl != null) {
                gameRoomImpl.getRtcRoomHandler().onPublishPrivilegeTokenWillExpire();
            }
        } catch (Exception e) {
            LogUtil.m82083d(TAG, "onPublishPrivilegeTokenWillExpire callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onRemoteStreamStats(InternalRemoteStreamStats internalRemoteStreamStats) {
        LogUtil.m82083d(TAG, "onRemoteStreamStats...");
        try {
            RTCRoomImpl rTCRoomImpl = this.mRtcRoom;
            if (rTCRoomImpl != null) {
                rTCRoomImpl.getRtcRoomHandler().onRemoteStreamStats(new RemoteStreamStats(internalRemoteStreamStats));
                return;
            }
            GameRoomImpl gameRoomImpl = this.mGameRTCRoom;
            if (gameRoomImpl != null) {
                gameRoomImpl.getRtcRoomHandler().onRemoteStreamStats(new RemoteStreamStats(internalRemoteStreamStats));
            }
        } catch (Exception e) {
            LogUtil.m82083d(TAG, "onRemoteStreamStats callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onRoomBinaryMessageReceived(String str, ByteBuffer byteBuffer, long j) {
        LogUtil.m82083d(TAG, "onRoomBinaryMessageReceived, length: " + byteBuffer.capacity());
        try {
            RTCRoomImpl rTCRoomImpl = this.mRtcRoom;
            if (rTCRoomImpl != null) {
                rTCRoomImpl.getRtcRoomHandler().onRoomBinaryMessageReceived(str, byteBuffer.duplicate());
                this.mRtcRoom.getRtcRoomHandler().onRoomBinaryMessageReceived(j, str, byteBuffer);
                return;
            }
            GameRoomImpl gameRoomImpl = this.mGameRTCRoom;
            if (gameRoomImpl != null) {
                gameRoomImpl.getRtcRoomHandler().onRoomBinaryMessageReceived(str, byteBuffer.duplicate());
                this.mGameRTCRoom.getRtcRoomHandler().onRoomBinaryMessageReceived(j, str, byteBuffer);
            }
        } catch (Exception e) {
            LogUtil.m82083d(TAG, "onRoomBinaryMessageReceived callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onRoomEvent(String str, String str2, int i, InternalRoomEventInfo internalRoomEventInfo) {
        LogUtil.m82083d(TAG, "onRoomEvent...");
        try {
            RTCRoomImpl rTCRoomImpl = this.mRtcRoom;
            if (rTCRoomImpl != null) {
                rTCRoomImpl.getRtcRoomHandler().onRoomEvent(str, str2, RoomEvent.valueOf(i), new RoomEventInfo(internalRoomEventInfo));
                return;
            }
            GameRoomImpl gameRoomImpl = this.mGameRTCRoom;
            if (gameRoomImpl != null) {
                gameRoomImpl.getRtcRoomHandler().onRoomEvent(str, str2, RoomEvent.valueOf(i), new RoomEventInfo(internalRoomEventInfo));
            }
        } catch (Exception e) {
            LogUtil.m82083d(TAG, "onRtcStats callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onRoomExtraInfoUpdate(String str, String str2, String str3, long j) {
        LogUtil.m82083d(TAG, "onRoomExtraInfoUpdate , key:" + str + ",value:" + str2);
        try {
            RTCRoomImpl rTCRoomImpl = this.mRtcRoom;
            if (rTCRoomImpl != null) {
                rTCRoomImpl.getRtcRoomHandler().onRoomExtraInfoUpdate(str, str2, str3, j);
                return;
            }
            GameRoomImpl gameRoomImpl = this.mGameRTCRoom;
            if (gameRoomImpl != null) {
                gameRoomImpl.getRtcRoomHandler().onRoomExtraInfoUpdate(str, str2, str3, j);
            }
        } catch (Exception e) {
            LogUtil.m82084e(TAG, "onRoomExtraInfoUpdate callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onRoomMessageReceived(String str, String str2, long j) {
        LogUtil.m82083d(TAG, "onRoomMessageReceived: " + str2);
        try {
            RTCRoomImpl rTCRoomImpl = this.mRtcRoom;
            if (rTCRoomImpl != null) {
                rTCRoomImpl.getRtcRoomHandler().onRoomMessageReceived(str, str2);
                this.mRtcRoom.getRtcRoomHandler().onRoomMessageReceived(j, str, str2);
                return;
            }
            GameRoomImpl gameRoomImpl = this.mGameRTCRoom;
            if (gameRoomImpl != null) {
                gameRoomImpl.getRtcRoomHandler().onRoomMessageReceived(str, str2);
                this.mGameRTCRoom.getRtcRoomHandler().onRoomMessageReceived(j, str, str2);
            }
        } catch (Exception e) {
            LogUtil.m82083d(TAG, "onRoomMessageReceived callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onRoomMessageSendResult(long j, int i) {
        LogUtil.m82083d(TAG, "onRoomMessageSendResult...");
        try {
            RTCRoomImpl rTCRoomImpl = this.mRtcRoom;
            if (rTCRoomImpl != null) {
                rTCRoomImpl.getRtcRoomHandler().onRoomMessageSendResult(j, i);
                return;
            }
            GameRoomImpl gameRoomImpl = this.mGameRTCRoom;
            if (gameRoomImpl != null) {
                gameRoomImpl.getRtcRoomHandler().onRoomMessageSendResult(j, i);
            }
        } catch (Exception e) {
            LogUtil.m82083d(TAG, "onRoomMessageSendResult callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onRoomStateChanged(String str, String str2, int i, String str3) {
        LogUtil.m82083d(TAG, "onRoomStateChanged...");
        try {
            RTCRoomImpl rTCRoomImpl = this.mRtcRoom;
            if (rTCRoomImpl != null) {
                rTCRoomImpl.getRtcRoomHandler().onRoomStateChanged(str, str2, i, str3);
                return;
            }
            GameRoomImpl gameRoomImpl = this.mGameRTCRoom;
            if (gameRoomImpl != null) {
                gameRoomImpl.getRtcRoomHandler().onRoomStateChanged(str, str2, i, str3);
            }
        } catch (Exception e) {
            LogUtil.m82083d(TAG, "onRoomStateChanged callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onRoomStateChangedWithReason(String str, String str2, int i, int i2) {
        LogUtil.m82083d(TAG, "onRoomStateChangedWithReason...");
        try {
            RTCRoomImpl rTCRoomImpl = this.mRtcRoom;
            if (rTCRoomImpl != null) {
                rTCRoomImpl.getRtcRoomHandler().onRoomStateChangedWithReason(str, str2, RoomState.valueOf(i), RoomStateChangeReason.valueOf(i2));
                return;
            }
            GameRoomImpl gameRoomImpl = this.mGameRTCRoom;
            if (gameRoomImpl != null) {
                gameRoomImpl.getRtcRoomHandler().onRoomStateChangedWithReason(str, str2, RoomState.valueOf(i), RoomStateChangeReason.valueOf(i2));
            }
        } catch (Exception e) {
            LogUtil.m82083d(TAG, "onRoomStateChanged callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onRoomStats(InternalRTCStats internalRTCStats) {
        LogUtil.m82083d(TAG, "onRtcStats...");
        try {
            RTCRoomImpl rTCRoomImpl = this.mRtcRoom;
            if (rTCRoomImpl != null) {
                rTCRoomImpl.getRtcRoomHandler().onRoomStats(new RTCRoomStats(internalRTCStats));
                return;
            }
            GameRoomImpl gameRoomImpl = this.mGameRTCRoom;
            if (gameRoomImpl != null) {
                gameRoomImpl.getRtcRoomHandler().onRoomStats(new RTCRoomStats(internalRTCStats));
            }
        } catch (Exception e) {
            LogUtil.m82083d(TAG, "onRtcStats callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onRoomWarning(int i) {
        LogUtil.m82083d(TAG, "onRoomWarning, warnNum: " + i);
        try {
            RTCRoomImpl rTCRoomImpl = this.mRtcRoom;
            if (rTCRoomImpl != null) {
                rTCRoomImpl.getRtcRoomHandler().onRoomWarning(i);
                return;
            }
            GameRoomImpl gameRoomImpl = this.mGameRTCRoom;
            if (gameRoomImpl != null) {
                gameRoomImpl.getRtcRoomHandler().onRoomWarning(i);
            }
        } catch (Exception e) {
            LogUtil.m82083d(TAG, "onRoomWarning callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onScreenAudioPublishStateChanged(String str, String str2, PublishState publishState, PublishStateChangeReason publishStateChangeReason) {
        LogUtil.m82083d(TAG, "onScreenAudioPublishStateChanged");
        try {
            RTCRoomImpl rTCRoomImpl = this.mRtcRoom;
            if (rTCRoomImpl != null) {
                rTCRoomImpl.getRtcRoomHandler().onScreenAudioPublishStateChanged(str, str2, publishState, publishStateChangeReason);
                return;
            }
            GameRoomImpl gameRoomImpl = this.mGameRTCRoom;
            if (gameRoomImpl != null) {
                gameRoomImpl.getRtcRoomHandler().onScreenAudioPublishStateChanged(str, str2, publishState, publishStateChangeReason);
            }
        } catch (Exception e) {
            LogUtil.m82083d(TAG, "onScreenAudioPublishStateChanged callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onScreenAudioSubscribeStateChanged(String str, String str2, SubscribeState subscribeState, SubscribeStateChangeReason subscribeStateChangeReason) {
        LogUtil.m82083d(TAG, "onScreenAudioSubscribeStateChanged");
        try {
            RTCRoomImpl rTCRoomImpl = this.mRtcRoom;
            if (rTCRoomImpl != null) {
                rTCRoomImpl.getRtcRoomHandler().onScreenAudioSubscribeStateChanged(str, str2, subscribeState, subscribeStateChangeReason);
                return;
            }
            GameRoomImpl gameRoomImpl = this.mGameRTCRoom;
            if (gameRoomImpl != null) {
                gameRoomImpl.getRtcRoomHandler().onScreenAudioSubscribeStateChanged(str, str2, subscribeState, subscribeStateChangeReason);
            }
        } catch (Exception e) {
            LogUtil.m82083d(TAG, "onScreenAudioSubscribeStateChanged callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onScreenVideoPublishStateChanged(String str, String str2, PublishState publishState, PublishStateChangeReason publishStateChangeReason) {
        LogUtil.m82083d(TAG, "onScreenVideoPublishStateChanged");
        try {
            RTCRoomImpl rTCRoomImpl = this.mRtcRoom;
            if (rTCRoomImpl != null) {
                rTCRoomImpl.getRtcRoomHandler().onScreenVideoPublishStateChanged(str, str2, publishState, publishStateChangeReason);
                return;
            }
            GameRoomImpl gameRoomImpl = this.mGameRTCRoom;
            if (gameRoomImpl != null) {
                gameRoomImpl.getRtcRoomHandler().onScreenVideoPublishStateChanged(str, str2, publishState, publishStateChangeReason);
            }
        } catch (Exception e) {
            LogUtil.m82083d(TAG, "onScreenVideoPublishStateChanged callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onScreenVideoSubscribeStateChanged(String str, String str2, SubscribeState subscribeState, SubscribeStateChangeReason subscribeStateChangeReason) {
        LogUtil.m82083d(TAG, "onScreenVideoSubscribeStateChanged");
        try {
            RTCRoomImpl rTCRoomImpl = this.mRtcRoom;
            if (rTCRoomImpl != null) {
                rTCRoomImpl.getRtcRoomHandler().onScreenVideoSubscribeStateChanged(str, str2, subscribeState, subscribeStateChangeReason);
                return;
            }
            GameRoomImpl gameRoomImpl = this.mGameRTCRoom;
            if (gameRoomImpl != null) {
                gameRoomImpl.getRtcRoomHandler().onScreenVideoSubscribeStateChanged(str, str2, subscribeState, subscribeStateChangeReason);
            }
        } catch (Exception e) {
            LogUtil.m82083d(TAG, "onScreenVideoSubscribeStateChanged callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onSetRoomExtraInfoResult(long j, int i) {
        LogUtil.m82083d(TAG, "onSetRoomExtraInfoResult,result:" + i);
        try {
            RTCRoomImpl rTCRoomImpl = this.mRtcRoom;
            if (rTCRoomImpl != null) {
                rTCRoomImpl.getRtcRoomHandler().onSetRoomExtraInfoResult(j, SetRoomExtraInfoResult.fromId(i));
                return;
            }
            GameRoomImpl gameRoomImpl = this.mGameRTCRoom;
            if (gameRoomImpl != null) {
                gameRoomImpl.getRtcRoomHandler().onSetRoomExtraInfoResult(j, SetRoomExtraInfoResult.fromId(i));
            }
        } catch (Exception e) {
            LogUtil.m82083d(TAG, "onSetRoomExtraInfoResult callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onStreamAdd(RTCStream rTCStream) {
        LogUtil.m82083d(TAG, "onStreamAdd...");
        try {
            RTCRoomImpl rTCRoomImpl = this.mRtcRoom;
            if (rTCRoomImpl != null) {
                rTCRoomImpl.getRtcRoomHandler().onStreamAdd(rTCStream);
                return;
            }
            GameRoomImpl gameRoomImpl = this.mGameRTCRoom;
            if (gameRoomImpl != null) {
                gameRoomImpl.getRtcRoomHandler().onStreamAdd(rTCStream);
            }
        } catch (Exception e) {
            LogUtil.m82083d(TAG, "onStreamAdd callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onStreamPublishSuccess(String str, boolean z) {
        LogUtil.m82083d(TAG, "onStreamPublishSuccess...");
        try {
            RTCRoomImpl rTCRoomImpl = this.mRtcRoom;
            if (rTCRoomImpl != null) {
                rTCRoomImpl.getRtcRoomHandler().onStreamPublishSuccess(str, z);
                return;
            }
            GameRoomImpl gameRoomImpl = this.mGameRTCRoom;
            if (gameRoomImpl != null) {
                gameRoomImpl.getRtcRoomHandler().onStreamPublishSuccess(str, z);
            }
        } catch (Exception e) {
            LogUtil.m82083d(TAG, "onStreamPublishSuccess callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onStreamRemove(RTCStream rTCStream, int i) {
        LogUtil.m82083d(TAG, "onStreamRemove...uid: " + rTCStream.userId);
        try {
            RTCRoomImpl rTCRoomImpl = this.mRtcRoom;
            if (rTCRoomImpl != null) {
                rTCRoomImpl.getRtcRoomHandler().onStreamRemove(rTCStream, StreamRemoveReason.values()[i]);
                return;
            }
            GameRoomImpl gameRoomImpl = this.mGameRTCRoom;
            if (gameRoomImpl != null) {
                gameRoomImpl.getRtcRoomHandler().onStreamRemove(rTCStream, StreamRemoveReason.values()[i]);
            }
        } catch (Exception e) {
            LogUtil.m82083d(TAG, "onStreamRemove callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onStreamStateChanged(String str, String str2, int i, String str3) {
        LogUtil.m82083d(TAG, "onStreamStateChanged...");
        try {
            RTCRoomImpl rTCRoomImpl = this.mRtcRoom;
            if (rTCRoomImpl != null) {
                rTCRoomImpl.getRtcRoomHandler().onStreamStateChanged(str, str2, i, str3);
                return;
            }
            GameRoomImpl gameRoomImpl = this.mGameRTCRoom;
            if (gameRoomImpl != null) {
                gameRoomImpl.getRtcRoomHandler().onStreamStateChanged(str, str2, i, str3);
            }
        } catch (Exception e) {
            LogUtil.m82083d(TAG, "onStreamStateChanged callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onSubscribePrivilegeTokenWillExpire() {
        LogUtil.m82083d(TAG, "onSubscribePrivilegeTokenWillExpire");
        try {
            RTCRoomImpl rTCRoomImpl = this.mRtcRoom;
            if (rTCRoomImpl != null) {
                rTCRoomImpl.getRtcRoomHandler().onSubscribePrivilegeTokenWillExpire();
                return;
            }
            GameRoomImpl gameRoomImpl = this.mGameRTCRoom;
            if (gameRoomImpl != null) {
                gameRoomImpl.getRtcRoomHandler().onSubscribePrivilegeTokenWillExpire();
            }
        } catch (Exception e) {
            LogUtil.m82083d(TAG, "onSubscribePrivilegeTokenWillExpire callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onSubtitleMessageReceived(SubtitleMessage[] subtitleMessageArr) {
        LogUtil.m82083d(TAG, "onSubtitleMessageReceived, subtitles length: " + subtitleMessageArr.length);
        try {
            RTCRoomImpl rTCRoomImpl = this.mRtcRoom;
            if (rTCRoomImpl != null) {
                rTCRoomImpl.getRtcRoomHandler().onSubtitleMessageReceived(subtitleMessageArr);
                return;
            }
            GameRoomImpl gameRoomImpl = this.mGameRTCRoom;
            if (gameRoomImpl != null) {
                gameRoomImpl.getRtcRoomHandler().onSubtitleMessageReceived(subtitleMessageArr);
            }
        } catch (Exception e) {
            LogUtil.m82083d(TAG, "onSubtitleMessageReceived callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onSubtitleStateChanged(int i, int i2, String str) {
        LogUtil.m82083d(TAG, "onSubtitleStateChanged, state: " + i + ", errorCode: " + i2 + ", errorMessage: " + str);
        try {
            RTCRoomImpl rTCRoomImpl = this.mRtcRoom;
            if (rTCRoomImpl != null) {
                rTCRoomImpl.getRtcRoomHandler().onSubtitleStateChanged(SubtitleState.fromId(i), SubtitleErrorCode.fromId(i2), str);
                return;
            }
            GameRoomImpl gameRoomImpl = this.mGameRTCRoom;
            if (gameRoomImpl != null) {
                gameRoomImpl.getRtcRoomHandler().onSubtitleStateChanged(SubtitleState.fromId(i), SubtitleErrorCode.fromId(i2), str);
            }
        } catch (Exception e) {
            LogUtil.m82083d(TAG, "onSubtitleStateChanged callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onTokenWillExpire() {
        LogUtil.m82083d(TAG, "onTokenWillExpire");
        try {
            RTCRoomImpl rTCRoomImpl = this.mRtcRoom;
            if (rTCRoomImpl != null) {
                rTCRoomImpl.getRtcRoomHandler().onTokenWillExpire();
                return;
            }
            GameRoomImpl gameRoomImpl = this.mGameRTCRoom;
            if (gameRoomImpl != null) {
                gameRoomImpl.getRtcRoomHandler().onTokenWillExpire();
            }
        } catch (Exception e) {
            LogUtil.m82083d(TAG, "onTokenWillExpire callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onUserBinaryMessageReceived(String str, ByteBuffer byteBuffer, long j) {
        LogUtil.m82083d(TAG, "onUserBinaryMessageReceived: uid:" + str + "binary message length" + byteBuffer.capacity());
        try {
            RTCRoomImpl rTCRoomImpl = this.mRtcRoom;
            if (rTCRoomImpl != null) {
                rTCRoomImpl.getRtcRoomHandler().onUserBinaryMessageReceived(str, byteBuffer.duplicate());
                this.mRtcRoom.getRtcRoomHandler().onUserBinaryMessageReceived(j, str, byteBuffer);
                return;
            }
            GameRoomImpl gameRoomImpl = this.mGameRTCRoom;
            if (gameRoomImpl != null) {
                gameRoomImpl.getRtcRoomHandler().onUserBinaryMessageReceived(str, byteBuffer.duplicate());
                this.mGameRTCRoom.getRtcRoomHandler().onUserBinaryMessageReceived(j, str, byteBuffer);
            }
        } catch (Exception e) {
            LogUtil.m82083d(TAG, "onUserBinaryMessageReceived callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onUserJoined(UserInfo userInfo) {
        LogUtil.m82083d(TAG, "onUserJoined... uid: " + userInfo.getUid() + ", extraInfo: " + userInfo.getExtraInfo());
        try {
            RTCRoomImpl rTCRoomImpl = this.mRtcRoom;
            if (rTCRoomImpl != null) {
                rTCRoomImpl.getRtcRoomHandler().onUserJoined(userInfo);
                return;
            }
            GameRoomImpl gameRoomImpl = this.mGameRTCRoom;
            if (gameRoomImpl != null) {
                gameRoomImpl.getRtcRoomHandler().onUserJoined(userInfo);
            }
        } catch (Exception e) {
            LogUtil.m82083d(TAG, "onUserJoined callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onUserLeave(String str, int i) {
        LogUtil.m82083d(TAG, "onUserLeave... uid: " + str + ", reason: " + i);
        try {
            RTCRoomImpl rTCRoomImpl = this.mRtcRoom;
            if (rTCRoomImpl != null) {
                rTCRoomImpl.getRtcRoomHandler().onUserLeave(str, i);
                return;
            }
            GameRoomImpl gameRoomImpl = this.mGameRTCRoom;
            if (gameRoomImpl != null) {
                gameRoomImpl.getRtcRoomHandler().onUserLeave(str, i);
            }
        } catch (Exception e) {
            LogUtil.m82083d(TAG, "onUserLeave callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onUserMessageReceived(String str, String str2, long j) {
        LogUtil.m82083d(TAG, "onUserMessageReceived: uid:" + str + "message" + str2);
        try {
            RTCRoomImpl rTCRoomImpl = this.mRtcRoom;
            if (rTCRoomImpl != null) {
                rTCRoomImpl.getRtcRoomHandler().onUserMessageReceived(str, str2);
                this.mRtcRoom.getRtcRoomHandler().onUserMessageReceived(j, str, str2);
                return;
            }
            GameRoomImpl gameRoomImpl = this.mGameRTCRoom;
            if (gameRoomImpl != null) {
                gameRoomImpl.getRtcRoomHandler().onUserMessageReceived(str, str2);
                this.mGameRTCRoom.getRtcRoomHandler().onUserMessageReceived(j, str, str2);
            }
        } catch (Exception e) {
            LogUtil.m82083d(TAG, "onUserMessageReceived callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onUserMessageSendResult(long j, int i) {
        LogUtil.m82083d(TAG, "onUserMessageSendResult...");
        try {
            RTCRoomImpl rTCRoomImpl = this.mRtcRoom;
            if (rTCRoomImpl != null) {
                rTCRoomImpl.getRtcRoomHandler().onUserMessageSendResult(j, i);
                return;
            }
            GameRoomImpl gameRoomImpl = this.mGameRTCRoom;
            if (gameRoomImpl != null) {
                gameRoomImpl.getRtcRoomHandler().onUserMessageSendResult(j, i);
            }
        } catch (Exception e) {
            LogUtil.m82083d(TAG, "onUserMessageSendResult callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onUserPublishScreen(String str, int i) {
        LogUtil.m82083d(TAG, "onUserPublishScreen... uid: " + str + ", type: " + i);
        try {
            RTCRoomImpl rTCRoomImpl = this.mRtcRoom;
            if (rTCRoomImpl != null) {
                rTCRoomImpl.getRtcRoomHandler().onUserPublishScreen(str, MediaStreamType.valueOf(i));
                return;
            }
            GameRoomImpl gameRoomImpl = this.mGameRTCRoom;
            if (gameRoomImpl != null) {
                gameRoomImpl.getRtcRoomHandler().onUserPublishScreen(str, MediaStreamType.valueOf(i));
            }
        } catch (Exception e) {
            LogUtil.m82083d(TAG, "onUserPublishScreen callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onUserPublishScreenAudio(String str, String str2, boolean z) {
        LogUtil.m82083d(TAG, "onUserPublishScreenAudio");
        try {
            RTCRoomImpl rTCRoomImpl = this.mRtcRoom;
            if (rTCRoomImpl != null) {
                rTCRoomImpl.getRtcRoomHandler().onUserPublishScreenAudio(str, str2, z);
                return;
            }
            GameRoomImpl gameRoomImpl = this.mGameRTCRoom;
            if (gameRoomImpl != null) {
                gameRoomImpl.getRtcRoomHandler().onUserPublishScreenAudio(str, str2, z);
            }
        } catch (Exception e) {
            LogUtil.m82083d(TAG, "onUserPublishScreenAudio callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onUserPublishScreenVideo(String str, String str2, boolean z) {
        LogUtil.m82083d(TAG, "onUserPublishScreenVideo");
        try {
            RTCRoomImpl rTCRoomImpl = this.mRtcRoom;
            if (rTCRoomImpl != null) {
                rTCRoomImpl.getRtcRoomHandler().onUserPublishScreenVideo(str, str2, z);
                return;
            }
            GameRoomImpl gameRoomImpl = this.mGameRTCRoom;
            if (gameRoomImpl != null) {
                gameRoomImpl.getRtcRoomHandler().onUserPublishScreenVideo(str, str2, z);
            }
        } catch (Exception e) {
            LogUtil.m82083d(TAG, "onUserPublishScreenVideo callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onUserPublishStream(String str, int i) {
        LogUtil.m82083d(TAG, "onUserPublishStream... uid: " + str + ", type: " + i);
        try {
            RTCRoomImpl rTCRoomImpl = this.mRtcRoom;
            if (rTCRoomImpl != null) {
                rTCRoomImpl.getRtcRoomHandler().onUserPublishStream(str, MediaStreamType.valueOf(i));
                return;
            }
            GameRoomImpl gameRoomImpl = this.mGameRTCRoom;
            if (gameRoomImpl != null) {
                gameRoomImpl.getRtcRoomHandler().onUserPublishStream(str, MediaStreamType.valueOf(i));
            }
        } catch (Exception e) {
            LogUtil.m82083d(TAG, "onUserPublishStream callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onUserPublishStreamAudio(String str, String str2, boolean z) {
        LogUtil.m82083d(TAG, "onUserPublishStreamAudio");
        try {
            RTCRoomImpl rTCRoomImpl = this.mRtcRoom;
            if (rTCRoomImpl != null) {
                rTCRoomImpl.getRtcRoomHandler().onUserPublishStreamAudio(str, str2, z);
                return;
            }
            GameRoomImpl gameRoomImpl = this.mGameRTCRoom;
            if (gameRoomImpl != null) {
                gameRoomImpl.getRtcRoomHandler().onUserPublishStreamAudio(str, str2, z);
            }
        } catch (Exception e) {
            LogUtil.m82083d(TAG, "onUserPublishStreamAudio callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onUserPublishStreamVideo(String str, String str2, boolean z) {
        LogUtil.m82083d(TAG, "onUserPublishStreamVideo");
        try {
            RTCRoomImpl rTCRoomImpl = this.mRtcRoom;
            if (rTCRoomImpl != null) {
                rTCRoomImpl.getRtcRoomHandler().onUserPublishStreamVideo(str, str2, z);
                return;
            }
            GameRoomImpl gameRoomImpl = this.mGameRTCRoom;
            if (gameRoomImpl != null) {
                gameRoomImpl.getRtcRoomHandler().onUserPublishStreamVideo(str, str2, z);
            }
        } catch (Exception e) {
            LogUtil.m82083d(TAG, "onUserPublishStreamVideo callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onUserUnpublishScreen(String str, int i, int i2) {
        LogUtil.m82083d(TAG, "onUserUnPublishScreen... uid: " + str + ", type: " + i + ", reasen:" + i2);
        try {
            RTCRoomImpl rTCRoomImpl = this.mRtcRoom;
            if (rTCRoomImpl != null) {
                rTCRoomImpl.getRtcRoomHandler().onUserUnpublishScreen(str, MediaStreamType.valueOf(i), StreamRemoveReason.values()[i2]);
                return;
            }
            GameRoomImpl gameRoomImpl = this.mGameRTCRoom;
            if (gameRoomImpl != null) {
                gameRoomImpl.getRtcRoomHandler().onUserUnpublishScreen(str, MediaStreamType.valueOf(i), StreamRemoveReason.values()[i2]);
            }
        } catch (Exception e) {
            LogUtil.m82083d(TAG, "onUserUnPublishScreen callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onUserUnpublishStream(String str, int i, int i2) {
        LogUtil.m82083d(TAG, "onUserUnPublishStream... uid: " + str + ", type: " + i + ", reasen:" + i2);
        try {
            RTCRoomImpl rTCRoomImpl = this.mRtcRoom;
            if (rTCRoomImpl != null) {
                rTCRoomImpl.getRtcRoomHandler().onUserUnpublishStream(str, MediaStreamType.valueOf(i), StreamRemoveReason.values()[i2]);
                return;
            }
            GameRoomImpl gameRoomImpl = this.mGameRTCRoom;
            if (gameRoomImpl != null) {
                gameRoomImpl.getRtcRoomHandler().onUserUnpublishStream(str, MediaStreamType.valueOf(i), StreamRemoveReason.values()[i2]);
            }
        } catch (Exception e) {
            LogUtil.m82083d(TAG, "onUserUnPublishStream callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onUserVisibilityChanged(boolean z, UserVisibilityChangeError userVisibilityChangeError) {
        LogUtil.m82083d(TAG, "onUserVisibilityChanged, currentUserVisibility:" + z + ", errorCode:" + userVisibilityChangeError);
        try {
            RTCRoomImpl rTCRoomImpl = this.mRtcRoom;
            if (rTCRoomImpl != null) {
                rTCRoomImpl.getRtcRoomHandler().onUserVisibilityChanged(z, userVisibilityChangeError);
                return;
            }
            GameRoomImpl gameRoomImpl = this.mGameRTCRoom;
            if (gameRoomImpl != null) {
                gameRoomImpl.getRtcRoomHandler().onUserVisibilityChanged(z, userVisibilityChangeError);
            }
        } catch (Exception e) {
            LogUtil.m82084e(TAG, "onUserVisibilityChanged callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onVideoPublishStateChanged(String str, String str2, PublishState publishState, PublishStateChangeReason publishStateChangeReason) {
        LogUtil.m82083d(TAG, "onVideoPublishStateChanged");
        try {
            RTCRoomImpl rTCRoomImpl = this.mRtcRoom;
            if (rTCRoomImpl != null) {
                rTCRoomImpl.getRtcRoomHandler().onVideoPublishStateChanged(str, str2, publishState, publishStateChangeReason);
                return;
            }
            GameRoomImpl gameRoomImpl = this.mGameRTCRoom;
            if (gameRoomImpl != null) {
                gameRoomImpl.getRtcRoomHandler().onVideoPublishStateChanged(str, str2, publishState, publishStateChangeReason);
            }
        } catch (Exception e) {
            LogUtil.m82083d(TAG, "onVideoPublishStateChanged callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onVideoStreamBanned(String str, boolean z) {
        StringBuilder sb = new StringBuilder("onVideoStreamBanned, user: ");
        sb.append(str);
        sb.append(", banned: ");
        sb.append(z ? "true" : "false");
        LogUtil.m82083d(TAG, sb.toString());
        try {
            RTCRoomImpl rTCRoomImpl = this.mRtcRoom;
            if (rTCRoomImpl != null) {
                rTCRoomImpl.getRtcRoomHandler().onVideoStreamBanned(str, z);
                return;
            }
            GameRoomImpl gameRoomImpl = this.mGameRTCRoom;
            if (gameRoomImpl != null) {
                gameRoomImpl.getRtcRoomHandler().onVideoStreamBanned(str, z);
            }
        } catch (Exception e) {
            LogUtil.m82083d(TAG, "onVideoStreamBanned callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onVideoSubscribeStateChanged(String str, String str2, SubscribeState subscribeState, SubscribeStateChangeReason subscribeStateChangeReason) {
        LogUtil.m82083d(TAG, "onVideoSubscribeStateChanged");
        try {
            RTCRoomImpl rTCRoomImpl = this.mRtcRoom;
            if (rTCRoomImpl != null) {
                rTCRoomImpl.getRtcRoomHandler().onVideoSubscribeStateChanged(str, str2, subscribeState, subscribeStateChangeReason);
                return;
            }
            GameRoomImpl gameRoomImpl = this.mGameRTCRoom;
            if (gameRoomImpl != null) {
                gameRoomImpl.getRtcRoomHandler().onVideoSubscribeStateChanged(str, str2, subscribeState, subscribeStateChangeReason);
            }
        } catch (Exception e) {
            LogUtil.m82083d(TAG, "onVideoSubscribeStateChanged callback catch exception.\n" + e.getMessage());
        }
    }
}
