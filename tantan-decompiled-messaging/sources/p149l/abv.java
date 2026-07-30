package p149l;

import com.p046p1.mobile.longlink.msg.liveroom.LongLinkVoiceSwitchLiveMode;

/* JADX INFO: loaded from: classes4.dex */
public class abv extends bk2<LongLinkVoiceSwitchLiveMode.VoiceLiveModeMessage, LongLinkVoiceSwitchLiveMode.VoiceLiveModeMessage> {
    public abv(p3g0<LongLinkVoiceSwitchLiveMode.VoiceLiveModeMessage, LongLinkVoiceSwitchLiveMode.VoiceLiveModeMessage> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LongLinkVoiceSwitchLiveMode.VoiceLiveModeMessage voiceLiveModeMessage, String str) {
        return true;
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkVoiceSwitchLiveMode.VoiceLiveModeMessage> mo94398b() {
        return LongLinkVoiceSwitchLiveMode.VoiceLiveModeMessage.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "voice.live.liveMode";
    }

    @Override // p149l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkVoiceSwitchLiveMode.VoiceLiveModeMessage mo94461z(String str, LongLinkVoiceSwitchLiveMode.VoiceLiveModeMessage voiceLiveModeMessage) {
        return voiceLiveModeMessage;
    }
}
