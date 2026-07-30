package p153l;

import com.p051p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage;
import com.p051p1.mobile.putong.live.base.data.BLiveAuctionInviteInfo;

/* JADX INFO: loaded from: classes4.dex */
public class b3v {

    /* JADX INFO: renamed from: a */
    public final BLiveAuctionInviteInfo f74823a;

    /* JADX INFO: renamed from: b */
    public final String f74824b;

    public b3v(LongLinkVoiceAuctionMessage.VoiceLiveAuctionInvite voiceLiveAuctionInvite) {
        this.f74823a = m102360a(voiceLiveAuctionInvite);
        this.f74824b = voiceLiveAuctionInvite.getType().toString();
    }

    /* JADX INFO: renamed from: a */
    public final BLiveAuctionInviteInfo m102360a(LongLinkVoiceAuctionMessage.VoiceLiveAuctionInvite voiceLiveAuctionInvite) {
        BLiveAuctionInviteInfo bLiveAuctionInviteInfoNew_ = BLiveAuctionInviteInfo.new_();
        bLiveAuctionInviteInfoNew_.inviteId = voiceLiveAuctionInvite.getInviteId();
        bLiveAuctionInviteInfoNew_.message = voiceLiveAuctionInvite.getMessage();
        bLiveAuctionInviteInfoNew_.userId = voiceLiveAuctionInvite.getUserId();
        bLiveAuctionInviteInfoNew_.type = voiceLiveAuctionInvite.getType().name();
        return bLiveAuctionInviteInfoNew_;
    }

    /* JADX INFO: renamed from: b */
    public BLiveAuctionInviteInfo m102361b() {
        return this.f74823a;
    }

    /* JADX INFO: renamed from: c */
    public String m102362c() {
        return this.f74824b;
    }
}
