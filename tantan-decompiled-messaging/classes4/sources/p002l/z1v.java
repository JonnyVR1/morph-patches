package p002l;

import com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionMsg;
import l.p3g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class z1v extends bk2<LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionUpdate, LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionUpdate> {
    public z1v(p3g0 p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionUpdate voiceLiveAuctionUpdate, String str) {
        return true;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionUpdate> mo9244b() {
        return LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionUpdate.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "voicelive.auction.update";
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionUpdate mo9251z(String str, LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionUpdate voiceLiveAuctionUpdate) {
        return voiceLiveAuctionUpdate;
    }
}
