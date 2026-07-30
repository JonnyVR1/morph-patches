package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage;

/* JADX INFO: loaded from: classes4.dex */
public class kuo0 extends bk2<LongLinkVoiceAuctionMessage.VoiceLiveToast, String> {
    public kuo0(p3g0<String, String> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LongLinkVoiceAuctionMessage.VoiceLiveToast voiceLiveToast, String str) {
        return true;
    }

    @Override // p149l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public String mo94461z(String str, LongLinkVoiceAuctionMessage.VoiceLiveToast voiceLiveToast) {
        if (!TextUtils.isEmpty(voiceLiveToast.getToast())) {
            osi0.m165783g(voiceLiveToast.getToast());
        }
        return voiceLiveToast.getToast();
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkVoiceAuctionMessage.VoiceLiveToast> mo94398b() {
        return LongLinkVoiceAuctionMessage.VoiceLiveToast.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "live.voicelive.toast";
    }
}
