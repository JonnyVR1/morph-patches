package p149l;

import com.p046p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage;

/* JADX INFO: loaded from: classes4.dex */
public class x0v extends bk2<LongLinkVoiceAuctionMessage.VoiceLiveAuctionCounter, LongLinkVoiceAuctionMessage.VoiceLiveAuctionCounter> {
    public x0v(p3g0 p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LongLinkVoiceAuctionMessage.VoiceLiveAuctionCounter voiceLiveAuctionCounter, String str) {
        return true;
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkVoiceAuctionMessage.VoiceLiveAuctionCounter> mo94398b() {
        return LongLinkVoiceAuctionMessage.VoiceLiveAuctionCounter.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "voicelive.auction.counter";
    }

    @Override // p149l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkVoiceAuctionMessage.VoiceLiveAuctionCounter mo94461z(String str, LongLinkVoiceAuctionMessage.VoiceLiveAuctionCounter voiceLiveAuctionCounter) {
        return voiceLiveAuctionCounter;
    }
}
