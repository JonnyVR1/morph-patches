package p153l;

import com.p051p1.mobile.longlink.msg.live.leaderboard.LongLinkLiveLeadBoardMsg;

/* JADX INFO: loaded from: classes4.dex */
public class ecr extends jk2<LongLinkLiveLeadBoardMsg.LeaderboardEffectInfo, LongLinkLiveLeadBoardMsg.LeaderboardEffectInfo> {
    public ecr(wbg0<LongLinkLiveLeadBoardMsg.LeaderboardEffectInfo, LongLinkLiveLeadBoardMsg.LeaderboardEffectInfo> wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkLiveLeadBoardMsg.LeaderboardEffectInfo leaderboardEffectInfo, String str) {
        return true;
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveLeadBoardMsg.LeaderboardEffectInfo> mo95510b() {
        return LongLinkLiveLeadBoardMsg.LeaderboardEffectInfo.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "live.gift.leaderboardEffect";
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkLiveLeadBoardMsg.LeaderboardEffectInfo mo95993z(String str, LongLinkLiveLeadBoardMsg.LeaderboardEffectInfo leaderboardEffectInfo) {
        return leaderboardEffectInfo;
    }
}
