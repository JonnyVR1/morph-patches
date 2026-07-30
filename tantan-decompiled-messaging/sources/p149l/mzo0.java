package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice;

/* JADX INFO: loaded from: classes4.dex */
public class mzo0 extends bk2<LongLinkVirtualVoice.VoiceUserGuide, LongLinkVirtualVoice.VoiceUserGuide> {
    public mzo0(p3g0<LongLinkVirtualVoice.VoiceUserGuide, LongLinkVirtualVoice.VoiceUserGuide> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LongLinkVirtualVoice.VoiceUserGuide voiceUserGuide, String str) {
        return !TextUtils.isEmpty(voiceUserGuide.getContent());
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkVirtualVoice.VoiceUserGuide> mo94398b() {
        return LongLinkVirtualVoice.VoiceUserGuide.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "live.voice.guide";
    }

    @Override // p149l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkVirtualVoice.VoiceUserGuide mo94461z(String str, LongLinkVirtualVoice.VoiceUserGuide voiceUserGuide) {
        return voiceUserGuide;
    }
}
