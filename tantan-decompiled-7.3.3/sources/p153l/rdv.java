package p153l;

import com.p051p1.mobile.longlink.msg.liveroom.VoiceLiveManager;

/* JADX INFO: loaded from: classes4.dex */
public class rdv extends jk2<VoiceLiveManager.VoiceFreeCallUpdate, VoiceLiveManager.VoiceFreeCallUpdate> {
    public rdv(wbg0<VoiceLiveManager.VoiceFreeCallUpdate, VoiceLiveManager.VoiceFreeCallUpdate> wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(VoiceLiveManager.VoiceFreeCallUpdate voiceFreeCallUpdate, String str) {
        return true;
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<VoiceLiveManager.VoiceFreeCallUpdate> mo95510b() {
        return VoiceLiveManager.VoiceFreeCallUpdate.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "live.voiceRoom.UpdateFreeCall";
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public VoiceLiveManager.VoiceFreeCallUpdate mo95993z(String str, VoiceLiveManager.VoiceFreeCallUpdate voiceFreeCallUpdate) {
        return voiceFreeCallUpdate;
    }
}
