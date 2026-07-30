package p002l;

import com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.live.base.data.BLiveVoiceAuctionLeaderboard;
import java.util.ArrayList;
import java.util.List;
import l.e30;
import l.mqv;
import l.rxn0;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class c1v {

    /* JADX INFO: renamed from: a */
    public final String f8459a;

    /* JADX INFO: renamed from: b */
    public final long f8460b;

    /* JADX INFO: renamed from: c */
    public final List<BLiveVoiceAuctionLeaderboard> f8461c = new ArrayList();

    public c1v(LongLinkVoiceAuctionMessage.VoiceLiveAuctionChange voiceLiveAuctionChange) {
        m10731c(voiceLiveAuctionChange.getLeaderboardsList());
        this.f8459a = voiceLiveAuctionChange.getType().toString();
        this.f8460b = voiceLiveAuctionChange.getCurrentTime();
    }

    /* JADX INFO: renamed from: b */
    public final BLiveVoiceAuctionLeaderboard m10730b(LongLinkVoiceAuctionMessage.VoiceLiveAuctionLeaderboard voiceLiveAuctionLeaderboard) {
        BLiveVoiceAuctionLeaderboard bLiveVoiceAuctionLeaderboardNew_ = BLiveVoiceAuctionLeaderboard.new_();
        bLiveVoiceAuctionLeaderboardNew_.isFromLongLink = true;
        bLiveVoiceAuctionLeaderboardNew_.auctionId = voiceLiveAuctionLeaderboard.getAuctionId();
        bLiveVoiceAuctionLeaderboardNew_.amount = voiceLiveAuctionLeaderboard.getAmount();
        bLiveVoiceAuctionLeaderboardNew_.voiceLiveId = voiceLiveAuctionLeaderboard.getVoiceLiveId();
        bLiveVoiceAuctionLeaderboardNew_.rank = voiceLiveAuctionLeaderboard.getRank();
        bLiveVoiceAuctionLeaderboardNew_.voiceRoomId = voiceLiveAuctionLeaderboard.getVoiceRoomId();
        bLiveVoiceAuctionLeaderboardNew_.userId = voiceLiveAuctionLeaderboard.getUserId();
        bLiveVoiceAuctionLeaderboardNew_.user = m10732d(voiceLiveAuctionLeaderboard.getUserProfile());
        return bLiveVoiceAuctionLeaderboardNew_;
    }

    /* JADX INFO: renamed from: c */
    public final void m10731c(List<LongLinkVoiceAuctionMessage.VoiceLiveAuctionLeaderboard> list) {
        vwb.z(list, new e30() { // from class: l.b1v
            public final void call(Object obj) {
                this.f7956a.m10733e((LongLinkVoiceAuctionMessage.VoiceLiveAuctionLeaderboard) obj);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public final mqv<User> m10732d(LongLinkLiveMessage.UserProfile userProfile) {
        return mqv.f(User.new_()).c(userProfile.getUserMask().getUserId(), rxn0.a(userProfile.getUserMask()), userProfile.getMaskMode());
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m10733e(LongLinkVoiceAuctionMessage.VoiceLiveAuctionLeaderboard voiceLiveAuctionLeaderboard) {
        this.f8461c.add(m10730b(voiceLiveAuctionLeaderboard));
    }
}
