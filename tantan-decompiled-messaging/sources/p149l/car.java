package p149l;

import com.p046p1.mobile.longlink.msg.live.leaderboard.LongLinkLiveLeadBoardMsg;

/* JADX INFO: loaded from: classes4.dex */
public class car extends bk2<LongLinkLiveLeadBoardMsg.LeaderboardEffectInfo, LongLinkLiveLeadBoardMsg.LeaderboardEffectInfo> {
    public car(p3g0<LongLinkLiveLeadBoardMsg.LeaderboardEffectInfo, LongLinkLiveLeadBoardMsg.LeaderboardEffectInfo> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LongLinkLiveLeadBoardMsg.LeaderboardEffectInfo leaderboardEffectInfo, String str) {
        return true;
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveLeadBoardMsg.LeaderboardEffectInfo> mo94398b() {
        return LongLinkLiveLeadBoardMsg.LeaderboardEffectInfo.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "live.gift.leaderboardEffect";
    }

    @Override // p149l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkLiveLeadBoardMsg.LeaderboardEffectInfo mo94461z(String str, LongLinkLiveLeadBoardMsg.LeaderboardEffectInfo leaderboardEffectInfo) {
        return leaderboardEffectInfo;
    }
}
