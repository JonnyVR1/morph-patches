package p153l;

import com.p051p1.mobile.longlink.msg.gift.LongLinkGiftMessage;

/* JADX INFO: loaded from: classes4.dex */
public class s3k extends jk2<LongLinkGiftMessage.LiveRankings, LongLinkGiftMessage.LiveRanking> {
    public s3k(wbg0<LongLinkGiftMessage.LiveRanking, LongLinkGiftMessage.LiveRanking> wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkGiftMessage.LiveRankings liveRankings, String str) {
        if (jyb.m147479J(liveRankings.getRankingsList())) {
            return false;
        }
        return m159460r(liveRankings.getRankingsList().get(0).getRoomId(), "no_care", "no_care");
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkGiftMessage.LiveRanking mo95993z(String str, LongLinkGiftMessage.LiveRankings liveRankings) {
        return liveRankings.getRankingsList().get(0);
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkGiftMessage.LiveRankings> mo95510b() {
        return LongLinkGiftMessage.LiveRankings.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "live.gift.weekLeaderboards";
    }
}
