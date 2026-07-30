package p149l;

import com.p046p1.mobile.longlink.msg.gift.LongLinkGiftMessage;

/* JADX INFO: loaded from: classes4.dex */
public class t9d0 extends bk2<LongLinkGiftMessage.LiveRankings, LongLinkGiftMessage.LiveRankings> {
    public t9d0(p3g0<LongLinkGiftMessage.LiveRankings, LongLinkGiftMessage.LiveRankings> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LongLinkGiftMessage.LiveRankings liveRankings, String str) {
        return this.f182445c.m194414a().f44323id.equals(liveRankings.getLiveId());
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkGiftMessage.LiveRankings> mo94398b() {
        return LongLinkGiftMessage.LiveRankings.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "live.gift.roomLiveLeaderboards";
    }

    @Override // p149l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkGiftMessage.LiveRankings mo94461z(String str, LongLinkGiftMessage.LiveRankings liveRankings) {
        return liveRankings;
    }
}
