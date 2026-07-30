package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionMsg;

/* JADX INFO: loaded from: classes4.dex */
public class agm0 extends bk2<LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionPledgeChoose, LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionPledgeChoose> {
    public agm0(p3g0<LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionPledgeChoose, LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionPledgeChoose> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionPledgeChoose voiceLiveAuctionPledgeChoose, String str) {
        return (TextUtils.isEmpty(voiceLiveAuctionPledgeChoose.getPledgeAName()) || TextUtils.isEmpty(voiceLiveAuctionPledgeChoose.getPledgeBName()) || TextUtils.isEmpty(voiceLiveAuctionPledgeChoose.getAuctionId())) ? false : true;
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionPledgeChoose> mo94398b() {
        return LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionPledgeChoose.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "voicelive.auction.pledge.choose";
    }

    @Override // p149l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionPledgeChoose mo94461z(String str, LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionPledgeChoose voiceLiveAuctionPledgeChoose) {
        return voiceLiveAuctionPledgeChoose;
    }
}
