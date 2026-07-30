package p002l;

import android.text.TextUtils;
import com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice;
import l.p3g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class mzo0 extends bk2<LongLinkVirtualVoice.VoiceUserGuide, LongLinkVirtualVoice.VoiceUserGuide> {
    public mzo0(p3g0<LongLinkVirtualVoice.VoiceUserGuide, LongLinkVirtualVoice.VoiceUserGuide> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkVirtualVoice.VoiceUserGuide voiceUserGuide, String str) {
        return !TextUtils.isEmpty(voiceUserGuide.getContent());
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkVirtualVoice.VoiceUserGuide> mo9244b() {
        return LongLinkVirtualVoice.VoiceUserGuide.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "live.voice.guide";
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkVirtualVoice.VoiceUserGuide mo9251z(String str, LongLinkVirtualVoice.VoiceUserGuide voiceUserGuide) {
        return voiceUserGuide;
    }
}
