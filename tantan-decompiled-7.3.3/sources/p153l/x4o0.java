package p153l;

import com.p051p1.mobile.longlink.msg.gift.LongLinkGiftMessage;

/* JADX INFO: loaded from: classes4.dex */
public class x4o0 extends jk2<LongLinkGiftMessage.LiveRankings, LongLinkGiftMessage.LiveRankings> {
    public x4o0(wbg0<LongLinkGiftMessage.LiveRankings, LongLinkGiftMessage.LiveRankings> wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkGiftMessage.LiveRankings liveRankings, String str) {
        return this.f137993c.m220733a().f45171id.equals(liveRankings.getLiveId());
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkGiftMessage.LiveRankings> mo95510b() {
        return LongLinkGiftMessage.LiveRankings.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "voicelive.gift.roomLiveLeaderboards";
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkGiftMessage.LiveRankings mo95993z(String str, LongLinkGiftMessage.LiveRankings liveRankings) {
        return liveRankings;
    }
}
