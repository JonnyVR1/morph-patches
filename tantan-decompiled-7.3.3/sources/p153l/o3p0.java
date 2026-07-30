package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage;

/* JADX INFO: loaded from: classes4.dex */
public class o3p0 extends jk2<LongLinkVoiceAuctionMessage.VoiceLiveToast, String> {
    public o3p0(wbg0<String, String> wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkVoiceAuctionMessage.VoiceLiveToast voiceLiveToast, String str) {
        return true;
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public String mo95993z(String str, LongLinkVoiceAuctionMessage.VoiceLiveToast voiceLiveToast) {
        if (!TextUtils.isEmpty(voiceLiveToast.getToast())) {
            r1j0.m179420g(voiceLiveToast.getToast());
        }
        return voiceLiveToast.getToast();
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkVoiceAuctionMessage.VoiceLiveToast> mo95510b() {
        return LongLinkVoiceAuctionMessage.VoiceLiveToast.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "live.voicelive.toast";
    }
}
