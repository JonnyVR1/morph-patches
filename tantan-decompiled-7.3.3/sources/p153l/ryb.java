package p153l;

import com.p051p1.mobile.longlink.msg.gift.LongLinkGiftMessage;
import com.p051p1.mobile.putong.live.base.data.BLiveHourLeaderBoardItem;

/* JADX INFO: loaded from: classes4.dex */
public class ryb extends jk2<LongLinkGiftMessage.LiveRankings, BLiveHourLeaderBoardItem> {
    public ryb(wbg0<BLiveHourLeaderBoardItem, BLiveHourLeaderBoardItem> wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    /* JADX INFO: renamed from: B */
    public static BLiveHourLeaderBoardItem m183600B(LongLinkGiftMessage.LiveRankings liveRankings) {
        return zsj.m221347C(liveRankings.getRankings(0), liveRankings);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkGiftMessage.LiveRankings liveRankings, String str) {
        return liveRankings.getRankingsCount() > 0 && m159460r(liveRankings.getRankings(0).getRoomId(), "no_care", "no_care");
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public BLiveHourLeaderBoardItem mo95993z(String str, LongLinkGiftMessage.LiveRankings liveRankings) {
        return m183600B(liveRankings);
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkGiftMessage.LiveRankings> mo95510b() {
        return LongLinkGiftMessage.LiveRankings.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "live.gift.currentHourLeaderboards";
    }
}
