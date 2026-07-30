package p002l;

import com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage;
import l.p3g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class tvn0 extends bk2<LongLinkGiftMessage.LiveRankings, LongLinkGiftMessage.LiveRankings> {
    public tvn0(p3g0<LongLinkGiftMessage.LiveRankings, LongLinkGiftMessage.LiveRankings> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkGiftMessage.LiveRankings liveRankings, String str) {
        return this.f21259c.m23565a().id.equals(liveRankings.getLiveId());
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkGiftMessage.LiveRankings> mo9244b() {
        return LongLinkGiftMessage.LiveRankings.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "voicelive.gift.roomLiveLeaderboards";
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkGiftMessage.LiveRankings mo9251z(String str, LongLinkGiftMessage.LiveRankings liveRankings) {
        return liveRankings;
    }
}
