package p153l;

import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceAuctionLeaderboard;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class d3v {

    /* JADX INFO: renamed from: a */
    public final String f84947a;

    /* JADX INFO: renamed from: b */
    public final long f84948b;

    /* JADX INFO: renamed from: c */
    public final List<BLiveVoiceAuctionLeaderboard> f84949c = new ArrayList();

    public d3v(LongLinkVoiceAuctionMessage.VoiceLiveAuctionChange voiceLiveAuctionChange) {
        m113906c(voiceLiveAuctionChange.getLeaderboardsList());
        this.f84947a = voiceLiveAuctionChange.getType().toString();
        this.f84948b = voiceLiveAuctionChange.getCurrentTime();
    }

    /* JADX INFO: renamed from: b */
    public final BLiveVoiceAuctionLeaderboard m113905b(LongLinkVoiceAuctionMessage.VoiceLiveAuctionLeaderboard voiceLiveAuctionLeaderboard) {
        BLiveVoiceAuctionLeaderboard bLiveVoiceAuctionLeaderboardNew_ = BLiveVoiceAuctionLeaderboard.new_();
        bLiveVoiceAuctionLeaderboardNew_.isFromLongLink = true;
        bLiveVoiceAuctionLeaderboardNew_.auctionId = voiceLiveAuctionLeaderboard.getAuctionId();
        bLiveVoiceAuctionLeaderboardNew_.amount = voiceLiveAuctionLeaderboard.getAmount();
        bLiveVoiceAuctionLeaderboardNew_.voiceLiveId = voiceLiveAuctionLeaderboard.getVoiceLiveId();
        bLiveVoiceAuctionLeaderboardNew_.rank = voiceLiveAuctionLeaderboard.getRank();
        bLiveVoiceAuctionLeaderboardNew_.voiceRoomId = voiceLiveAuctionLeaderboard.getVoiceRoomId();
        bLiveVoiceAuctionLeaderboardNew_.userId = voiceLiveAuctionLeaderboard.getUserId();
        bLiveVoiceAuctionLeaderboardNew_.user = m113907d(voiceLiveAuctionLeaderboard.getUserProfile());
        return bLiveVoiceAuctionLeaderboardNew_;
    }

    /* JADX INFO: renamed from: c */
    public final void m113906c(List<LongLinkVoiceAuctionMessage.VoiceLiveAuctionLeaderboard> list) {
        jyb.m147537z(list, new y20() { // from class: l.c3v
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f79649a.m113908e((LongLinkVoiceAuctionMessage.VoiceLiveAuctionLeaderboard) obj);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public final nsv<User> m113907d(LongLinkLiveMessage.UserProfile userProfile) {
        return nsv.m164636f(User.new_()).m164639c(userProfile.getUserMask().getUserId(), v6o0.m200134a(userProfile.getUserMask()), userProfile.getMaskMode());
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m113908e(LongLinkVoiceAuctionMessage.VoiceLiveAuctionLeaderboard voiceLiveAuctionLeaderboard) {
        this.f84949c.add(m113905b(voiceLiveAuctionLeaderboard));
    }
}
