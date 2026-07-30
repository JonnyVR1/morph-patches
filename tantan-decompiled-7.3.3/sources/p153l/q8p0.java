package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice;

/* JADX INFO: loaded from: classes4.dex */
public class q8p0 extends jk2<LongLinkVirtualVoice.VoiceUserGuide, LongLinkVirtualVoice.VoiceUserGuide> {
    public q8p0(wbg0<LongLinkVirtualVoice.VoiceUserGuide, LongLinkVirtualVoice.VoiceUserGuide> wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkVirtualVoice.VoiceUserGuide voiceUserGuide, String str) {
        return !TextUtils.isEmpty(voiceUserGuide.getContent());
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkVirtualVoice.VoiceUserGuide> mo95510b() {
        return LongLinkVirtualVoice.VoiceUserGuide.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "live.voice.guide";
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkVirtualVoice.VoiceUserGuide mo95993z(String str, LongLinkVirtualVoice.VoiceUserGuide voiceUserGuide) {
        return voiceUserGuide;
    }
}
