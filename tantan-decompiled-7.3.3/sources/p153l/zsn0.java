package p153l;

import com.p051p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice;

/* JADX INFO: loaded from: classes4.dex */
public class zsn0 extends jk2<LongLinkVirtualVoice.VoiceAdminPanelCounterMessage, LongLinkVirtualVoice.VoiceAdminPanelCounterMessage> {
    public zsn0(wbg0<LongLinkVirtualVoice.VoiceAdminPanelCounterMessage, LongLinkVirtualVoice.VoiceAdminPanelCounterMessage> wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkVirtualVoice.VoiceAdminPanelCounterMessage voiceAdminPanelCounterMessage, String str) {
        return true;
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkVirtualVoice.VoiceAdminPanelCounterMessage> mo95510b() {
        return LongLinkVirtualVoice.VoiceAdminPanelCounterMessage.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "voice.trick:admin.panel.counter";
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkVirtualVoice.VoiceAdminPanelCounterMessage mo95993z(String str, LongLinkVirtualVoice.VoiceAdminPanelCounterMessage voiceAdminPanelCounterMessage) {
        return voiceAdminPanelCounterMessage;
    }
}
