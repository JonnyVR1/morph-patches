package p149l;

import com.p046p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiCall;

/* JADX INFO: loaded from: classes5.dex */
public class u5t {

    /* JADX INFO: renamed from: a */
    public BLiveMultiCall f174754a;

    /* JADX INFO: renamed from: b */
    public String f174755b;

    /* JADX INFO: renamed from: c */
    public String f174756c;

    public u5t(LongLinkMultiCallMessage.MultiCallMessage multiCallMessage) {
        this.f174754a = m191875a(multiCallMessage);
        this.f174755b = multiCallMessage.getToast();
        this.f174756c = multiCallMessage.getType().toString();
    }

    /* JADX INFO: renamed from: a */
    public final BLiveMultiCall m191875a(LongLinkMultiCallMessage.MultiCallMessage multiCallMessage) {
        BLiveMultiCall bLiveMultiCallNew_ = BLiveMultiCall.new_();
        LongLinkMultiCallMessage.MultiCall multiCall = multiCallMessage.getMultiCall();
        bLiveMultiCallNew_.f44400id = multiCall.getId();
        bLiveMultiCallNew_.ownerUserId = multiCall.getOwnerUserId();
        bLiveMultiCallNew_.ownerRoomId = multiCall.getOwnerRoomId();
        bLiveMultiCallNew_.ownerLiveId = multiCall.getOwnerLiveId();
        bLiveMultiCallNew_.userId = multiCall.getUserId();
        bLiveMultiCallNew_.userName = multiCall.getUserName();
        bLiveMultiCallNew_.userAvatar = multiCall.getUserAvatar();
        bLiveMultiCallNew_.role = multiCall.getRole();
        bLiveMultiCallNew_.roomId = multiCall.getRoomId();
        bLiveMultiCallNew_.liveId = multiCall.getLiveId();
        bLiveMultiCallNew_.source = multiCall.getSource();
        bLiveMultiCallNew_.category = multiCall.getCategory();
        bLiveMultiCallNew_.position = multiCall.getPosition();
        bLiveMultiCallNew_.state = multiCall.getState();
        bLiveMultiCallNew_.receivedRewardPoint = multiCall.getReceivedRewardPoint();
        bLiveMultiCallNew_.isAway = multiCall.getIsAway();
        bLiveMultiCallNew_.mutedByUserIds = multiCall.getMutedByUserIdsList();
        bLiveMultiCallNew_.ownerMultiCallOrder = multiCall.getOwnerMultiCallOrder();
        bLiveMultiCallNew_.showSeconds = multiCall.getShowSeconds();
        bLiveMultiCallNew_.pushRemainCount = multiCall.getPushRemainCount();
        bLiveMultiCallNew_.isLeadRole = multiCall.getIsLeadRole();
        bLiveMultiCallNew_.refreshPushStreamUrl = multiCall.getRefreshPushStreamUrl();
        return bLiveMultiCallNew_;
    }

    /* JADX INFO: renamed from: b */
    public BLiveMultiCall m191876b() {
        return this.f174754a;
    }

    /* JADX INFO: renamed from: c */
    public String m191877c() {
        return this.f174755b;
    }

    /* JADX INFO: renamed from: d */
    public String m191878d() {
        return this.f174756c;
    }
}
