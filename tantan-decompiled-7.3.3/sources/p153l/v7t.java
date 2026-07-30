package p153l;

import com.p051p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiCall;

/* JADX INFO: loaded from: classes5.dex */
public class v7t {

    /* JADX INFO: renamed from: a */
    public BLiveMultiCall f182817a;

    /* JADX INFO: renamed from: b */
    public String f182818b;

    /* JADX INFO: renamed from: c */
    public String f182819c;

    public v7t(LongLinkMultiCallMessage.MultiCallMessage multiCallMessage) {
        this.f182817a = m200273a(multiCallMessage);
        this.f182818b = multiCallMessage.getToast();
        this.f182819c = multiCallMessage.getType().toString();
    }

    /* JADX INFO: renamed from: a */
    public final BLiveMultiCall m200273a(LongLinkMultiCallMessage.MultiCallMessage multiCallMessage) {
        BLiveMultiCall bLiveMultiCallNew_ = BLiveMultiCall.new_();
        LongLinkMultiCallMessage.MultiCall multiCall = multiCallMessage.getMultiCall();
        bLiveMultiCallNew_.f45248id = multiCall.getId();
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
    public BLiveMultiCall m200274b() {
        return this.f182817a;
    }

    /* JADX INFO: renamed from: c */
    public String m200275c() {
        return this.f182818b;
    }

    /* JADX INFO: renamed from: d */
    public String m200276d() {
        return this.f182819c;
    }
}
