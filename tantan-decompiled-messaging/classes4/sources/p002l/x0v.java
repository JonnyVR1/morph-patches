package p002l;

import com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage;
import l.p3g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class x0v extends bk2<LongLinkVoiceAuctionMessage.VoiceLiveAuctionCounter, LongLinkVoiceAuctionMessage.VoiceLiveAuctionCounter> {
    public x0v(p3g0 p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkVoiceAuctionMessage.VoiceLiveAuctionCounter voiceLiveAuctionCounter, String str) {
        return true;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkVoiceAuctionMessage.VoiceLiveAuctionCounter> mo9244b() {
        return LongLinkVoiceAuctionMessage.VoiceLiveAuctionCounter.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "voicelive.auction.counter";
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkVoiceAuctionMessage.VoiceLiveAuctionCounter mo9251z(String str, LongLinkVoiceAuctionMessage.VoiceLiveAuctionCounter voiceLiveAuctionCounter) {
        return voiceLiveAuctionCounter;
    }
}
