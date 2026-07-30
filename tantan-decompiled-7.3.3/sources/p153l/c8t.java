package p153l;

import com.p051p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiCallInvite;

/* JADX INFO: loaded from: classes5.dex */
public class c8t {

    /* JADX INFO: renamed from: a */
    public final BLiveMultiCallInvite f80242a;

    /* JADX INFO: renamed from: b */
    public final String f80243b;

    public c8t(LongLinkMultiCallMessage.MultiCallInviteMessage multiCallInviteMessage) {
        this.f80242a = m108380a(multiCallInviteMessage);
        this.f80243b = multiCallInviteMessage.getType().toString();
    }

    /* JADX INFO: renamed from: a */
    public final BLiveMultiCallInvite m108380a(LongLinkMultiCallMessage.MultiCallInviteMessage multiCallInviteMessage) {
        BLiveMultiCallInvite bLiveMultiCallInviteNew_ = BLiveMultiCallInvite.new_();
        bLiveMultiCallInviteNew_.f45252id = multiCallInviteMessage.getMultiCallInvite().getId();
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
    public BLiveMultiCallInvite m108381b() {
        return this.f80242a;
    }

    /* JADX INFO: renamed from: c */
    public String m108382c() {
        return this.f80243b;
    }
}
