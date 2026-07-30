package p149l;

import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceAuctionLeaderboard;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class c1v {

    /* JADX INFO: renamed from: a */
    public final String f78305a;

    /* JADX INFO: renamed from: b */
    public final long f78306b;

    /* JADX INFO: renamed from: c */
    public final List<BLiveVoiceAuctionLeaderboard> f78307c = new ArrayList();

    public c1v(LongLinkVoiceAuctionMessage.VoiceLiveAuctionChange voiceLiveAuctionChange) {
        m104883c(voiceLiveAuctionChange.getLeaderboardsList());
        this.f78305a = voiceLiveAuctionChange.getType().toString();
        this.f78306b = voiceLiveAuctionChange.getCurrentTime();
    }

    /* JADX INFO: renamed from: b */
    public final BLiveVoiceAuctionLeaderboard m104882b(LongLinkVoiceAuctionMessage.VoiceLiveAuctionLeaderboard voiceLiveAuctionLeaderboard) {
        BLiveVoiceAuctionLeaderboard bLiveVoiceAuctionLeaderboardNew_ = BLiveVoiceAuctionLeaderboard.new_();
        bLiveVoiceAuctionLeaderboardNew_.isFromLongLink = true;
        bLiveVoiceAuctionLeaderboardNew_.auctionId = voiceLiveAuctionLeaderboard.getAuctionId();
        bLiveVoiceAuctionLeaderboardNew_.amount = voiceLiveAuctionLeaderboard.getAmount();
        bLiveVoiceAuctionLeaderboardNew_.voiceLiveId = voiceLiveAuctionLeaderboard.getVoiceLiveId();
        bLiveVoiceAuctionLeaderboardNew_.rank = voiceLiveAuctionLeaderboard.getRank();
        bLiveVoiceAuctionLeaderboardNew_.voiceRoomId = voiceLiveAuctionLeaderboard.getVoiceRoomId();
        bLiveVoiceAuctionLeaderboardNew_.userId = voiceLiveAuctionLeaderboard.getUserId();
        bLiveVoiceAuctionLeaderboardNew_.user = m104884d(voiceLiveAuctionLeaderboard.getUserProfile());
        return bLiveVoiceAuctionLeaderboardNew_;
    }

    /* JADX INFO: renamed from: c */
    public final void m104883c(List<LongLinkVoiceAuctionMessage.VoiceLiveAuctionLeaderboard> list) {
        vwb.m200354z(list, new e30() { // from class: l.b1v
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f72628a.m104885e((LongLinkVoiceAuctionMessage.VoiceLiveAuctionLeaderboard) obj);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public final mqv<User> m104884d(LongLinkLiveMessage.UserProfile userProfile) {
        return mqv.m155998f(User.new_()).m156001c(userProfile.getUserMask().getUserId(), rxn0.m181617a(userProfile.getUserMask()), userProfile.getMaskMode());
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m104885e(LongLinkVoiceAuctionMessage.VoiceLiveAuctionLeaderboard voiceLiveAuctionLeaderboard) {
        this.f78307c.add(m104882b(voiceLiveAuctionLeaderboard));
    }
}
