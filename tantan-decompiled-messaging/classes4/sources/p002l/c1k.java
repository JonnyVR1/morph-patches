package p002l;

import com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage;
import l.p3g0;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class c1k extends bk2<LongLinkGiftMessage.LiveRankings, LongLinkGiftMessage.LiveRanking> {
    public c1k(p3g0<LongLinkGiftMessage.LiveRanking, LongLinkGiftMessage.LiveRanking> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkGiftMessage.LiveRankings liveRankings, String str) {
        if (vwb.J(liveRankings.getRankingsList())) {
            return false;
        }
        return m24095r(((LongLinkGiftMessage.LiveRanking) liveRankings.getRankingsList().get(0)).getRoomId(), "no_care", "no_care");
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkGiftMessage.LiveRanking mo9251z(String str, LongLinkGiftMessage.LiveRankings liveRankings) {
        return (LongLinkGiftMessage.LiveRanking) liveRankings.getRankingsList().get(0);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkGiftMessage.LiveRankings> mo9244b() {
        return LongLinkGiftMessage.LiveRankings.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "live.gift.weekLeaderboards";
    }
}
