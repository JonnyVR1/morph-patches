package p002l;

import com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage;
import l.p3g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ffm0 extends bk2<LongLinkVoiceAuctionMessage.VoiceLiveAuctionInvite, a1v> {
    public ffm0(p3g0<a1v, a1v> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkVoiceAuctionMessage.VoiceLiveAuctionInvite voiceLiveAuctionInvite, String str) {
        return true;
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public a1v mo9251z(String str, LongLinkVoiceAuctionMessage.VoiceLiveAuctionInvite voiceLiveAuctionInvite) {
        return new a1v(voiceLiveAuctionInvite);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkVoiceAuctionMessage.VoiceLiveAuctionInvite> mo9244b() {
        return LongLinkVoiceAuctionMessage.VoiceLiveAuctionInvite.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "voicelive.auction.invite";
    }
}
