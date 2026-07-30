package p002l;

import com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage;
import com.p1.mobile.putong.live.base.data.BLiveHourLeaderBoardItem;
import l.p3g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class dxb extends bk2<LongLinkGiftMessage.LiveRankings, BLiveHourLeaderBoardItem> {
    public dxb(p3g0<BLiveHourLeaderBoardItem, BLiveHourLeaderBoardItem> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    /* JADX INFO: renamed from: B */
    public static BLiveHourLeaderBoardItem m12083B(LongLinkGiftMessage.LiveRankings liveRankings) {
        return jqj.m16172C(liveRankings.getRankings(0), liveRankings);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkGiftMessage.LiveRankings liveRankings, String str) {
        return liveRankings.getRankingsCount() > 0 && m24095r(liveRankings.getRankings(0).getRoomId(), "no_care", "no_care");
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public BLiveHourLeaderBoardItem mo9251z(String str, LongLinkGiftMessage.LiveRankings liveRankings) {
        return m12083B(liveRankings);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkGiftMessage.LiveRankings> mo9244b() {
        return LongLinkGiftMessage.LiveRankings.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "live.gift.currentHourLeaderboards";
    }
}
