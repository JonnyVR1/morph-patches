package p002l;

import com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager;
import l.p3g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class l8v extends bk2<VoiceLiveManager.VoiceManagerUpdate, VoiceLiveManager.VoiceManagerUpdate> {
    public l8v(p3g0<VoiceLiveManager.VoiceManagerUpdate, VoiceLiveManager.VoiceManagerUpdate> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(VoiceLiveManager.VoiceManagerUpdate voiceManagerUpdate, String str) {
        return true;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<VoiceLiveManager.VoiceManagerUpdate> mo9244b() {
        return VoiceLiveManager.VoiceManagerUpdate.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "voiceLive.manager.update";
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public VoiceLiveManager.VoiceManagerUpdate mo9251z(String str, VoiceLiveManager.VoiceManagerUpdate voiceManagerUpdate) {
        return voiceManagerUpdate;
    }
}
