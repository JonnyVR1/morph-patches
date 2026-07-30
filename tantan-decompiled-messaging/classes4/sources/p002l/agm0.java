package p002l;

import android.text.TextUtils;
import com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionMsg;
import l.p3g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class agm0 extends bk2<LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionPledgeChoose, LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionPledgeChoose> {
    public agm0(p3g0<LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionPledgeChoose, LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionPledgeChoose> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionPledgeChoose voiceLiveAuctionPledgeChoose, String str) {
        return (TextUtils.isEmpty(voiceLiveAuctionPledgeChoose.getPledgeAName()) || TextUtils.isEmpty(voiceLiveAuctionPledgeChoose.getPledgeBName()) || TextUtils.isEmpty(voiceLiveAuctionPledgeChoose.getAuctionId())) ? false : true;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionPledgeChoose> mo9244b() {
        return LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionPledgeChoose.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "voicelive.auction.pledge.choose";
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionPledgeChoose mo9251z(String str, LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionPledgeChoose voiceLiveAuctionPledgeChoose) {
        return voiceLiveAuctionPledgeChoose;
    }
}
