package com.p074ss.bytertc.engine.handler;

import com.p074ss.bytertc.engine.RTCStream;
import com.p074ss.bytertc.engine.SubscribeConfig;
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
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes11.dex */
public abstract class IRTCRoomEventHandler {
    public void onAVSyncEvent(String str, String str2, AVSyncEvent aVSyncEvent) {
    }

    public void onAVSyncStateChange(AVSyncState aVSyncState) {
    }

    public void onAudioPublishStateChanged(String str, String str2, PublishState publishState, PublishStateChangeReason publishStateChangeReason) {
    }

    public void onAudioStreamBanned(String str, boolean z) {
    }

    public void onAudioSubscribeStateChanged(String str, String str2, SubscribeState subscribeState, SubscribeStateChangeReason subscribeStateChangeReason) {
    }

    public void onForwardStreamEvent(ForwardStreamEventInfo[] forwardStreamEventInfoArr) {
    }

    public void onForwardStreamStateChanged(ForwardStreamStateInfo[] forwardStreamStateInfoArr) {
    }

    public void onLeaveRoom(RTCRoomStats rTCRoomStats) {
    }

    public void onLocalStreamStats(LocalStreamStats localStreamStats) {
    }

    public void onNetworkQuality(NetworkQualityStats networkQualityStats, NetworkQualityStats[] networkQualityStatsArr) {
    }

    public void onPublishPrivilegeTokenWillExpire() {
    }

    public void onRemoteStreamStats(RemoteStreamStats remoteStreamStats) {
    }

    public void onRoomBinaryMessageReceived(long j, String str, ByteBuffer byteBuffer) {
    }

    public void onRoomEvent(String str, String str2, RoomEvent roomEvent, RoomEventInfo roomEventInfo) {
    }

    public void onRoomExtraInfoUpdate(String str, String str2, String str3, long j) {
    }

    public void onRoomMessageReceived(long j, String str, String str2) {
    }

    public void onRoomMessageSendResult(long j, int i) {
    }

    public void onRoomStateChanged(String str, String str2, int i, String str3) {
    }

    public void onRoomStateChangedWithReason(String str, String str2, RoomState roomState, RoomStateChangeReason roomStateChangeReason) {
    }

    public void onRoomStats(RTCRoomStats rTCRoomStats) {
    }

    @Deprecated
    public void onRoomWarning(int i) {
    }

    public void onScreenAudioPublishStateChanged(String str, String str2, PublishState publishState, PublishStateChangeReason publishStateChangeReason) {
    }

    public void onScreenAudioSubscribeStateChanged(String str, String str2, SubscribeState subscribeState, SubscribeStateChangeReason subscribeStateChangeReason) {
    }

    public void onScreenVideoPublishStateChanged(String str, String str2, PublishState publishState, PublishStateChangeReason publishStateChangeReason) {
    }

    public void onScreenVideoSubscribeStateChanged(String str, String str2, SubscribeState subscribeState, SubscribeStateChangeReason subscribeStateChangeReason) {
    }

    public void onSetRoomExtraInfoResult(long j, SetRoomExtraInfoResult setRoomExtraInfoResult) {
    }

    @Deprecated
    public void onStreamAdd(RTCStream rTCStream) {
    }

    public void onStreamPublishSuccess(String str, boolean z) {
    }

    @Deprecated
    public void onStreamRemove(RTCStream rTCStream, StreamRemoveReason streamRemoveReason) {
    }

    public void onStreamStateChanged(String str, String str2, int i, String str3) {
    }

    public void onStreamSubscribed(int i, String str, SubscribeConfig subscribeConfig) {
    }

    public void onSubscribePrivilegeTokenWillExpire() {
    }

    public void onSubtitleMessageReceived(SubtitleMessage[] subtitleMessageArr) {
    }

    public void onSubtitleStateChanged(SubtitleState subtitleState, SubtitleErrorCode subtitleErrorCode, String str) {
    }

    public void onTokenWillExpire() {
    }

    public void onUserBinaryMessageReceived(long j, String str, ByteBuffer byteBuffer) {
    }

    public void onUserJoined(UserInfo userInfo) {
    }

    public void onUserLeave(String str, int i) {
    }

    public void onUserMessageReceived(long j, String str, String str2) {
    }

    public void onUserMessageSendResult(long j, int i) {
    }

    public void onUserPublishScreen(String str, MediaStreamType mediaStreamType) {
    }

    public void onUserPublishScreenAudio(String str, String str2, boolean z) {
    }

    public void onUserPublishScreenVideo(String str, String str2, boolean z) {
    }

    public void onUserPublishStream(String str, MediaStreamType mediaStreamType) {
    }

    public void onUserPublishStreamAudio(String str, String str2, boolean z) {
    }

    public void onUserPublishStreamVideo(String str, String str2, boolean z) {
    }

    public void onUserUnpublishScreen(String str, MediaStreamType mediaStreamType, StreamRemoveReason streamRemoveReason) {
    }

    public void onUserUnpublishStream(String str, MediaStreamType mediaStreamType, StreamRemoveReason streamRemoveReason) {
    }

    public void onUserVisibilityChanged(boolean z, UserVisibilityChangeError userVisibilityChangeError) {
    }

    public void onVideoPublishStateChanged(String str, String str2, PublishState publishState, PublishStateChangeReason publishStateChangeReason) {
    }

    public void onVideoStreamBanned(String str, boolean z) {
    }

    public void onVideoSubscribeStateChanged(String str, String str2, SubscribeState subscribeState, SubscribeStateChangeReason subscribeStateChangeReason) {
    }

    public void onRoomBinaryMessageReceived(String str, ByteBuffer byteBuffer) {
    }

    public void onRoomMessageReceived(String str, String str2) {
    }

    public void onUserBinaryMessageReceived(String str, ByteBuffer byteBuffer) {
    }

    public void onUserMessageReceived(String str, String str2) {
    }
}
