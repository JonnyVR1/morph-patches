package p149l;

import com.p046p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionMsg;

/* JADX INFO: loaded from: classes4.dex */
public class z1v extends bk2<LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionUpdate, LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionUpdate> {
    public z1v(p3g0 p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionUpdate voiceLiveAuctionUpdate, String str) {
        return true;
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionUpdate> mo94398b() {
        return LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionUpdate.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "voicelive.auction.update";
    }

    @Override // p149l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionUpdate mo94461z(String str, LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionUpdate voiceLiveAuctionUpdate) {
        return voiceLiveAuctionUpdate;
    }
}
