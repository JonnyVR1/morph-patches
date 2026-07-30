package p002l;

import com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceSwitchLiveMode;
import l.p3g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class abv extends bk2<LongLinkVoiceSwitchLiveMode.VoiceLiveModeMessage, LongLinkVoiceSwitchLiveMode.VoiceLiveModeMessage> {
    public abv(p3g0<LongLinkVoiceSwitchLiveMode.VoiceLiveModeMessage, LongLinkVoiceSwitchLiveMode.VoiceLiveModeMessage> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkVoiceSwitchLiveMode.VoiceLiveModeMessage voiceLiveModeMessage, String str) {
        return true;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkVoiceSwitchLiveMode.VoiceLiveModeMessage> mo9244b() {
        return LongLinkVoiceSwitchLiveMode.VoiceLiveModeMessage.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "voice.live.liveMode";
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkVoiceSwitchLiveMode.VoiceLiveModeMessage mo9251z(String str, LongLinkVoiceSwitchLiveMode.VoiceLiveModeMessage voiceLiveModeMessage) {
        return voiceLiveModeMessage;
    }
}
