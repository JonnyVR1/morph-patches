package p149l;

import com.p069ss.bytertc.engine.RTCStream;
import com.p069ss.bytertc.engine.UserInfo;
import com.p069ss.bytertc.engine.data.AVSyncState;
import com.p069ss.bytertc.engine.data.PublishState;
import com.p069ss.bytertc.engine.data.PublishStateChangeReason;
import com.p069ss.bytertc.engine.data.SubscribeState;
import com.p069ss.bytertc.engine.data.SubscribeStateChangeReason;
import com.p069ss.bytertc.engine.handler.IRTCRoomEventHandler;
import com.p069ss.bytertc.engine.type.LocalStreamStats;
import com.p069ss.bytertc.engine.type.MediaStreamType;
import com.p069ss.bytertc.engine.type.NetworkQualityStats;
import com.p069ss.bytertc.engine.type.RTCRoomStats;
import com.p069ss.bytertc.engine.type.RemoteStreamStats;
import com.p069ss.bytertc.engine.type.StreamRemoveReason;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes8.dex */
public class zac0 extends IRTCRoomEventHandler {
    @Override // com.p069ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onNetworkQuality(NetworkQualityStats networkQualityStats, NetworkQualityStats[] networkQualityStatsArr) {
        super.onNetworkQuality(networkQualityStats, networkQualityStatsArr);
    }

    @Override // com.p069ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onUserPublishStreamAudio(String str, String str2, boolean z) {
        super.onUserPublishStreamAudio(str, str2, z);
    }

    @Override // com.p069ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onUserPublishStreamVideo(String str, String str2, boolean z) {
        super.onUserPublishStreamVideo(str, str2, z);
    }

    @Override // com.p069ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onTokenWillExpire() {
    }

    @Override // com.p069ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onAVSyncStateChange(AVSyncState aVSyncState) {
    }

    @Override // com.p069ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onLeaveRoom(RTCRoomStats rTCRoomStats) {
    }

    @Override // com.p069ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onLocalStreamStats(LocalStreamStats localStreamStats) {
    }

    @Override // com.p069ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onRemoteStreamStats(RemoteStreamStats remoteStreamStats) {
    }

    @Override // com.p069ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onRoomStats(RTCRoomStats rTCRoomStats) {
    }

    @Override // com.p069ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onRoomWarning(int i) {
    }

    @Override // com.p069ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onStreamAdd(RTCStream rTCStream) {
    }

    @Override // com.p069ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onUserJoined(UserInfo userInfo) {
    }

    @Override // com.p069ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onAudioStreamBanned(String str, boolean z) {
    }

    @Override // com.p069ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onRoomBinaryMessageReceived(String str, ByteBuffer byteBuffer) {
    }

    @Override // com.p069ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onRoomMessageReceived(String str, String str2) {
    }

    @Override // com.p069ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onRoomMessageSendResult(long j, int i) {
    }

    @Override // com.p069ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onStreamPublishSuccess(String str, boolean z) {
    }

    @Override // com.p069ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onStreamRemove(RTCStream rTCStream, StreamRemoveReason streamRemoveReason) {
    }

    @Override // com.p069ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onUserBinaryMessageReceived(String str, ByteBuffer byteBuffer) {
    }

    @Override // com.p069ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onUserLeave(String str, int i) {
    }

    @Override // com.p069ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onUserMessageReceived(String str, String str2) {
    }

    @Override // com.p069ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onUserMessageSendResult(long j, int i) {
    }

    @Override // com.p069ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onUserPublishScreen(String str, MediaStreamType mediaStreamType) {
    }

    @Override // com.p069ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onVideoStreamBanned(String str, boolean z) {
    }

    @Override // com.p069ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onUserUnpublishScreen(String str, MediaStreamType mediaStreamType, StreamRemoveReason streamRemoveReason) {
    }

    @Override // com.p069ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onAudioPublishStateChanged(String str, String str2, PublishState publishState, PublishStateChangeReason publishStateChangeReason) {
    }

    @Override // com.p069ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onAudioSubscribeStateChanged(String str, String str2, SubscribeState subscribeState, SubscribeStateChangeReason subscribeStateChangeReason) {
    }

    @Override // com.p069ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onRoomStateChanged(String str, String str2, int i, String str3) {
    }

    @Override // com.p069ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onStreamStateChanged(String str, String str2, int i, String str3) {
    }

    @Override // com.p069ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onVideoPublishStateChanged(String str, String str2, PublishState publishState, PublishStateChangeReason publishStateChangeReason) {
    }

    @Override // com.p069ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onVideoSubscribeStateChanged(String str, String str2, SubscribeState subscribeState, SubscribeStateChangeReason subscribeStateChangeReason) {
    }
}
