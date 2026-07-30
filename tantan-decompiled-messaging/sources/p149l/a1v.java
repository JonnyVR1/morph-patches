package p149l;

import com.p046p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage;
import com.p046p1.mobile.putong.live.base.data.BLiveAuctionInviteInfo;

/* JADX INFO: loaded from: classes4.dex */
public class a1v {

    /* JADX INFO: renamed from: a */
    public final BLiveAuctionInviteInfo f67202a;

    /* JADX INFO: renamed from: b */
    public final String f67203b;

    public a1v(LongLinkVoiceAuctionMessage.VoiceLiveAuctionInvite voiceLiveAuctionInvite) {
        this.f67202a = m94575a(voiceLiveAuctionInvite);
        this.f67203b = voiceLiveAuctionInvite.getType().toString();
    }

    /* JADX INFO: renamed from: a */
    public final BLiveAuctionInviteInfo m94575a(LongLinkVoiceAuctionMessage.VoiceLiveAuctionInvite voiceLiveAuctionInvite) {
        BLiveAuctionInviteInfo bLiveAuctionInviteInfoNew_ = BLiveAuctionInviteInfo.new_();
        bLiveAuctionInviteInfoNew_.inviteId = voiceLiveAuctionInvite.getInviteId();
        bLiveAuctionInviteInfoNew_.message = voiceLiveAuctionInvite.getMessage();
        bLiveAuctionInviteInfoNew_.userId = voiceLiveAuctionInvite.getUserId();
        bLiveAuctionInviteInfoNew_.type = voiceLiveAuctionInvite.getType().name();
        return bLiveAuctionInviteInfoNew_;
    }

    /* JADX INFO: renamed from: b */
    public BLiveAuctionInviteInfo m94576b() {
        return this.f67202a;
    }

    /* JADX INFO: renamed from: c */
    public String m94577c() {
        return this.f67203b;
    }
}
