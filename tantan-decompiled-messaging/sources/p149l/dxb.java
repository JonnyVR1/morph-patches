package p149l;

import com.p046p1.mobile.longlink.msg.gift.LongLinkGiftMessage;
import com.p046p1.mobile.putong.live.base.data.BLiveHourLeaderBoardItem;

/* JADX INFO: loaded from: classes4.dex */
public class dxb extends bk2<LongLinkGiftMessage.LiveRankings, BLiveHourLeaderBoardItem> {
    public dxb(p3g0<BLiveHourLeaderBoardItem, BLiveHourLeaderBoardItem> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    /* JADX INFO: renamed from: B */
    public static BLiveHourLeaderBoardItem m113999B(LongLinkGiftMessage.LiveRankings liveRankings) {
        return jqj.m142810C(liveRankings.getRankings(0), liveRankings);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LongLinkGiftMessage.LiveRankings liveRankings, String str) {
        return liveRankings.getRankingsCount() > 0 && m199212r(liveRankings.getRankings(0).getRoomId(), "no_care", "no_care");
    }

    @Override // p149l.bk2
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public BLiveHourLeaderBoardItem mo94461z(String str, LongLinkGiftMessage.LiveRankings liveRankings) {
        return m113999B(liveRankings);
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkGiftMessage.LiveRankings> mo94398b() {
        return LongLinkGiftMessage.LiveRankings.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "live.gift.currentHourLeaderboards";
    }
}
