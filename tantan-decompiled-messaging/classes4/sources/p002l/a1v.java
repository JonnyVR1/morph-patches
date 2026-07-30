package p002l;

import com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage;
import com.p1.mobile.putong.live.base.data.BLiveAuctionInviteInfo;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class a1v {

    /* JADX INFO: renamed from: a */
    public final BLiveAuctionInviteInfo f7338a;

    /* JADX INFO: renamed from: b */
    public final String f7339b;

    public a1v(LongLinkVoiceAuctionMessage.VoiceLiveAuctionInvite voiceLiveAuctionInvite) {
        this.f7338a = m9272a(voiceLiveAuctionInvite);
        this.f7339b = voiceLiveAuctionInvite.getType().toString();
    }

    /* JADX INFO: renamed from: a */
    public final BLiveAuctionInviteInfo m9272a(LongLinkVoiceAuctionMessage.VoiceLiveAuctionInvite voiceLiveAuctionInvite) {
        BLiveAuctionInviteInfo bLiveAuctionInviteInfoNew_ = BLiveAuctionInviteInfo.new_();
        bLiveAuctionInviteInfoNew_.inviteId = voiceLiveAuctionInvite.getInviteId();
        bLiveAuctionInviteInfoNew_.message = voiceLiveAuctionInvite.getMessage();
        bLiveAuctionInviteInfoNew_.userId = voiceLiveAuctionInvite.getUserId();
        bLiveAuctionInviteInfoNew_.type = voiceLiveAuctionInvite.getType().name();
        return bLiveAuctionInviteInfoNew_;
    }

    /* JADX INFO: renamed from: b */
    public BLiveAuctionInviteInfo m9273b() {
        return this.f7338a;
    }

    /* JADX INFO: renamed from: c */
    public String m9274c() {
        return this.f7339b;
    }
}
