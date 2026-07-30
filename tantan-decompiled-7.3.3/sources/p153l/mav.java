package p153l;

import com.p051p1.mobile.longlink.msg.liveroom.VoiceLiveManager;

/* JADX INFO: loaded from: classes4.dex */
public class mav extends jk2<VoiceLiveManager.VoiceManagerUpdate, VoiceLiveManager.VoiceManagerUpdate> {
    public mav(wbg0<VoiceLiveManager.VoiceManagerUpdate, VoiceLiveManager.VoiceManagerUpdate> wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(VoiceLiveManager.VoiceManagerUpdate voiceManagerUpdate, String str) {
        return true;
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<VoiceLiveManager.VoiceManagerUpdate> mo95510b() {
        return VoiceLiveManager.VoiceManagerUpdate.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "voiceLive.manager.update";
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public VoiceLiveManager.VoiceManagerUpdate mo95993z(String str, VoiceLiveManager.VoiceManagerUpdate voiceManagerUpdate) {
        return voiceManagerUpdate;
    }
}
