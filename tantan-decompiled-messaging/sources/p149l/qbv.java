package p149l;

import com.p046p1.mobile.longlink.msg.liveroom.VoiceLiveManager;

/* JADX INFO: loaded from: classes4.dex */
public class qbv extends bk2<VoiceLiveManager.VoiceFreeCallUpdate, VoiceLiveManager.VoiceFreeCallUpdate> {
    public qbv(p3g0<VoiceLiveManager.VoiceFreeCallUpdate, VoiceLiveManager.VoiceFreeCallUpdate> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(VoiceLiveManager.VoiceFreeCallUpdate voiceFreeCallUpdate, String str) {
        return true;
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<VoiceLiveManager.VoiceFreeCallUpdate> mo94398b() {
        return VoiceLiveManager.VoiceFreeCallUpdate.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "live.voiceRoom.UpdateFreeCall";
    }

    @Override // p149l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public VoiceLiveManager.VoiceFreeCallUpdate mo94461z(String str, VoiceLiveManager.VoiceFreeCallUpdate voiceFreeCallUpdate) {
        return voiceFreeCallUpdate;
    }
}
