package p149l;

import com.p046p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiCallInvite;

/* JADX INFO: loaded from: classes5.dex */
public class b6t {

    /* JADX INFO: renamed from: a */
    public final BLiveMultiCallInvite f73878a;

    /* JADX INFO: renamed from: b */
    public final String f73879b;

    public b6t(LongLinkMultiCallMessage.MultiCallInviteMessage multiCallInviteMessage) {
        this.f73878a = m100473a(multiCallInviteMessage);
        this.f73879b = multiCallInviteMessage.getType().toString();
    }

    /* JADX INFO: renamed from: a */
    public final BLiveMultiCallInvite m100473a(LongLinkMultiCallMessage.MultiCallInviteMessage multiCallInviteMessage) {
        BLiveMultiCallInvite bLiveMultiCallInviteNew_ = BLiveMultiCallInvite.new_();
        bLiveMultiCallInviteNew_.f44404id = multiCallInviteMessage.getMultiCallInvite().getId();
        bLiveMultiCallInviteNew_.ownerLiveId = multiCallInviteMessage.getMultiCallInvite().getOwnerLiveId();
        bLiveMultiCallInviteNew_.ownerUserId = multiCallInviteMessage.getMultiCallInvite().getOwnerUserId();
        bLiveMultiCallInviteNew_.ownerUserAvatar = multiCallInviteMessage.getMultiCallInvite().getOwnerUserAvatar();
        bLiveMultiCallInviteNew_.ownerUserName = multiCallInviteMessage.getMultiCallInvite().getOwnerUserName();
        bLiveMultiCallInviteNew_.toLiveId = multiCallInviteMessage.getMultiCallInvite().getToLiveId();
        bLiveMultiCallInviteNew_.toUserId = multiCallInviteMessage.getMultiCallInvite().getToUserId();
        bLiveMultiCallInviteNew_.toUserAvatar = multiCallInviteMessage.getMultiCallInvite().getToUserAvatar();
        bLiveMultiCallInviteNew_.toUserName = multiCallInviteMessage.getMultiCallInvite().getToUserName();
        bLiveMultiCallInviteNew_.showSeconds = multiCallInviteMessage.getMultiCallInvite().getShowSeconds();
        bLiveMultiCallInviteNew_.ownerMultiCallOrder = multiCallInviteMessage.getMultiCallInvite().getOwnerMultiCallOrder();
        return bLiveMultiCallInviteNew_;
    }

    /* JADX INFO: renamed from: b */
    public BLiveMultiCallInvite m100474b() {
        return this.f73878a;
    }

    /* JADX INFO: renamed from: c */
    public String m100475c() {
        return this.f73879b;
    }
}
