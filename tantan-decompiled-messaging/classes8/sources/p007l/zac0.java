package p007l;

import com.ss.bytertc.engine.RTCStream;
import com.ss.bytertc.engine.UserInfo;
import com.ss.bytertc.engine.data.AVSyncState;
import com.ss.bytertc.engine.data.PublishState;
import com.ss.bytertc.engine.data.PublishStateChangeReason;
import com.ss.bytertc.engine.data.SubscribeState;
import com.ss.bytertc.engine.data.SubscribeStateChangeReason;
import com.ss.bytertc.engine.handler.IRTCRoomEventHandler;
import com.ss.bytertc.engine.type.LocalStreamStats;
import com.ss.bytertc.engine.type.MediaStreamType;
import com.ss.bytertc.engine.type.NetworkQualityStats;
import com.ss.bytertc.engine.type.RTCRoomStats;
import com.ss.bytertc.engine.type.RemoteStreamStats;
import com.ss.bytertc.engine.type.StreamRemoveReason;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class zac0 extends IRTCRoomEventHandler {
    public void onNetworkQuality(NetworkQualityStats networkQualityStats, NetworkQualityStats[] networkQualityStatsArr) {
        super.onNetworkQuality(networkQualityStats, networkQualityStatsArr);
    }

    public void onUserPublishStreamAudio(String str, String str2, boolean z) {
        super.onUserPublishStreamAudio(str, str2, z);
    }

    public void onUserPublishStreamVideo(String str, String str2, boolean z) {
        super.onUserPublishStreamVideo(str, str2, z);
    }

    public void onTokenWillExpire() {
    }

    public void onAVSyncStateChange(AVSyncState aVSyncState) {
    }

    public void onLeaveRoom(RTCRoomStats rTCRoomStats) {
    }

    public void onLocalStreamStats(LocalStreamStats localStreamStats) {
    }

    public void onRemoteStreamStats(RemoteStreamStats remoteStreamStats) {
    }

    public void onRoomStats(RTCRoomStats rTCRoomStats) {
    }

    public void onRoomWarning(int i) {
    }

    public void onStreamAdd(RTCStream rTCStream) {
    }

    public void onUserJoined(UserInfo userInfo) {
    }

    public void onAudioStreamBanned(String str, boolean z) {
    }

    public void onRoomBinaryMessageReceived(String str, ByteBuffer byteBuffer) {
    }

    public void onRoomMessageReceived(String str, String str2) {
    }

    public void onRoomMessageSendResult(long j, int i) {
    }

    public void onStreamPublishSuccess(String str, boolean z) {
    }

    public void onStreamRemove(RTCStream rTCStream, StreamRemoveReason streamRemoveReason) {
    }

    public void onUserBinaryMessageReceived(String str, ByteBuffer byteBuffer) {
    }

    public void onUserLeave(String str, int i) {
    }

    public void onUserMessageReceived(String str, String str2) {
    }

    public void onUserMessageSendResult(long j, int i) {
    }

    public void onUserPublishScreen(String str, MediaStreamType mediaStreamType) {
    }

    public void onVideoStreamBanned(String str, boolean z) {
    }

    public void onUserUnpublishScreen(String str, MediaStreamType mediaStreamType, StreamRemoveReason streamRemoveReason) {
    }

    public void onAudioPublishStateChanged(String str, String str2, PublishState publishState, PublishStateChangeReason publishStateChangeReason) {
    }

    public void onAudioSubscribeStateChanged(String str, String str2, SubscribeState subscribeState, SubscribeStateChangeReason subscribeStateChangeReason) {
    }

    public void onRoomStateChanged(String str, String str2, int i, String str3) {
    }

    public void onStreamStateChanged(String str, String str2, int i, String str3) {
    }

    public void onVideoPublishStateChanged(String str, String str2, PublishState publishState, PublishStateChangeReason publishStateChangeReason) {
    }

    public void onVideoSubscribeStateChanged(String str, String str2, SubscribeState subscribeState, SubscribeStateChangeReason subscribeStateChangeReason) {
    }
}
