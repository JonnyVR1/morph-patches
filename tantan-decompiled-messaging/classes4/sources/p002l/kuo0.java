package p002l;

import android.text.TextUtils;
import com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage;
import l.osi0;
import l.p3g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class kuo0 extends bk2<LongLinkVoiceAuctionMessage.VoiceLiveToast, String> {
    public kuo0(p3g0<String, String> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkVoiceAuctionMessage.VoiceLiveToast voiceLiveToast, String str) {
        return true;
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public String mo9251z(String str, LongLinkVoiceAuctionMessage.VoiceLiveToast voiceLiveToast) {
        if (!TextUtils.isEmpty(voiceLiveToast.getToast())) {
            osi0.g(voiceLiveToast.getToast());
        }
        return voiceLiveToast.getToast();
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkVoiceAuctionMessage.VoiceLiveToast> mo9244b() {
        return LongLinkVoiceAuctionMessage.VoiceLiveToast.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "live.voicelive.toast";
    }
}
