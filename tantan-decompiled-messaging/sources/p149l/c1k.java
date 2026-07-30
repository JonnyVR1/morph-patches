package p149l;

import com.p046p1.mobile.longlink.msg.gift.LongLinkGiftMessage;

/* JADX INFO: loaded from: classes4.dex */
public class c1k extends bk2<LongLinkGiftMessage.LiveRankings, LongLinkGiftMessage.LiveRanking> {
    public c1k(p3g0<LongLinkGiftMessage.LiveRanking, LongLinkGiftMessage.LiveRanking> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LongLinkGiftMessage.LiveRankings liveRankings, String str) {
        if (vwb.m200296J(liveRankings.getRankingsList())) {
            return false;
        }
        return m199212r(liveRankings.getRankingsList().get(0).getRoomId(), "no_care", "no_care");
    }

    @Override // p149l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkGiftMessage.LiveRanking mo94461z(String str, LongLinkGiftMessage.LiveRankings liveRankings) {
        return liveRankings.getRankingsList().get(0);
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkGiftMessage.LiveRankings> mo94398b() {
        return LongLinkGiftMessage.LiveRankings.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "live.gift.weekLeaderboards";
    }
}
