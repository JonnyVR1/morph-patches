package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionMsg;

/* JADX INFO: loaded from: classes4.dex */
public class epm0 extends jk2<LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionPledgeChoose, LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionPledgeChoose> {
    public epm0(wbg0<LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionPledgeChoose, LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionPledgeChoose> wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionPledgeChoose voiceLiveAuctionPledgeChoose, String str) {
        return (TextUtils.isEmpty(voiceLiveAuctionPledgeChoose.getPledgeAName()) || TextUtils.isEmpty(voiceLiveAuctionPledgeChoose.getPledgeBName()) || TextUtils.isEmpty(voiceLiveAuctionPledgeChoose.getAuctionId())) ? false : true;
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionPledgeChoose> mo95510b() {
        return LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionPledgeChoose.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "voicelive.auction.pledge.choose";
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionPledgeChoose mo95993z(String str, LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionPledgeChoose voiceLiveAuctionPledgeChoose) {
        return voiceLiveAuctionPledgeChoose;
    }
}
