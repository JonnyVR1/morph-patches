package p002l;

import com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager;
import l.p3g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class qbv extends bk2<VoiceLiveManager.VoiceFreeCallUpdate, VoiceLiveManager.VoiceFreeCallUpdate> {
    public qbv(p3g0<VoiceLiveManager.VoiceFreeCallUpdate, VoiceLiveManager.VoiceFreeCallUpdate> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(VoiceLiveManager.VoiceFreeCallUpdate voiceFreeCallUpdate, String str) {
        return true;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<VoiceLiveManager.VoiceFreeCallUpdate> mo9244b() {
        return VoiceLiveManager.VoiceFreeCallUpdate.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "live.voiceRoom.UpdateFreeCall";
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public VoiceLiveManager.VoiceFreeCallUpdate mo9251z(String str, VoiceLiveManager.VoiceFreeCallUpdate voiceFreeCallUpdate) {
        return voiceFreeCallUpdate;
    }
}
