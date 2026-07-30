package p002l;

import com.p1.mobile.longlink.msg.live.leaderboard.LongLinkLiveLeadBoardMsg;
import l.p3g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class car extends bk2<LongLinkLiveLeadBoardMsg.LeaderboardEffectInfo, LongLinkLiveLeadBoardMsg.LeaderboardEffectInfo> {
    public car(p3g0<LongLinkLiveLeadBoardMsg.LeaderboardEffectInfo, LongLinkLiveLeadBoardMsg.LeaderboardEffectInfo> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkLiveLeadBoardMsg.LeaderboardEffectInfo leaderboardEffectInfo, String str) {
        return true;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveLeadBoardMsg.LeaderboardEffectInfo> mo9244b() {
        return LongLinkLiveLeadBoardMsg.LeaderboardEffectInfo.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "live.gift.leaderboardEffect";
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkLiveLeadBoardMsg.LeaderboardEffectInfo mo9251z(String str, LongLinkLiveLeadBoardMsg.LeaderboardEffectInfo leaderboardEffectInfo) {
        return leaderboardEffectInfo;
    }
}
