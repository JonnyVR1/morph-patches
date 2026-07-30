package p002l;

import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.VoiceLiveInfoMessage;
import com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager;
import com.p1.mobile.putong.live.base.data.VoiceLiveMode;
import l.p3g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class pqn0 extends bk2<VoiceLiveManager.VoiceLiveInfo, VoiceLiveInfoMessage> {
    public pqn0(p3g0<VoiceLiveInfoMessage, VoiceLiveInfoMessage> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(VoiceLiveManager.VoiceLiveInfo voiceLiveInfo, String str) {
        return true;
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public VoiceLiveInfoMessage mo9251z(String str, VoiceLiveManager.VoiceLiveInfo voiceLiveInfo) {
        return new VoiceLiveInfoMessage(voiceLiveInfo.getRewardPoint(), voiceLiveInfo.getRoomId(), voiceLiveInfo.getLiveId(), VoiceLiveMode.get(voiceLiveInfo.getLiveMode().name()), voiceLiveInfo.getTemplate());
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<VoiceLiveManager.VoiceLiveInfo> mo9244b() {
        return VoiceLiveManager.VoiceLiveInfo.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "live.voicelive.info";
    }
}
