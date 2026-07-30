package p153l;

import com.p051p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage;

/* JADX INFO: loaded from: classes4.dex */
public class y2v extends jk2<LongLinkVoiceAuctionMessage.VoiceLiveAuctionCounter, LongLinkVoiceAuctionMessage.VoiceLiveAuctionCounter> {
    public y2v(wbg0 wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkVoiceAuctionMessage.VoiceLiveAuctionCounter voiceLiveAuctionCounter, String str) {
        return true;
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkVoiceAuctionMessage.VoiceLiveAuctionCounter> mo95510b() {
        return LongLinkVoiceAuctionMessage.VoiceLiveAuctionCounter.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "voicelive.auction.counter";
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkVoiceAuctionMessage.VoiceLiveAuctionCounter mo95993z(String str, LongLinkVoiceAuctionMessage.VoiceLiveAuctionCounter voiceLiveAuctionCounter) {
        return voiceLiveAuctionCounter;
    }
}
