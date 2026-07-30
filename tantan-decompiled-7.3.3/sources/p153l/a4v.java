package p153l;

import com.p051p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionMsg;

/* JADX INFO: loaded from: classes4.dex */
public class a4v extends jk2<LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionUpdate, LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionUpdate> {
    public a4v(wbg0 wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionUpdate voiceLiveAuctionUpdate, String str) {
        return true;
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionUpdate> mo95510b() {
        return LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionUpdate.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "voicelive.auction.update";
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionUpdate mo95993z(String str, LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionUpdate voiceLiveAuctionUpdate) {
        return voiceLiveAuctionUpdate;
    }
}
