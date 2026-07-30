package p149l;

import com.p046p1.mobile.longlink.msg.liveroom.VoiceLiveManager;
import com.p046p1.mobile.putong.live.base.data.VoiceLiveMode;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.VoiceLiveInfoMessage;

/* JADX INFO: loaded from: classes4.dex */
public class pqn0 extends bk2<VoiceLiveManager.VoiceLiveInfo, VoiceLiveInfoMessage> {
    public pqn0(p3g0<VoiceLiveInfoMessage, VoiceLiveInfoMessage> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(VoiceLiveManager.VoiceLiveInfo voiceLiveInfo, String str) {
        return true;
    }

    @Override // p149l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public VoiceLiveInfoMessage mo94461z(String str, VoiceLiveManager.VoiceLiveInfo voiceLiveInfo) {
        return new VoiceLiveInfoMessage(voiceLiveInfo.getRewardPoint(), voiceLiveInfo.getRoomId(), voiceLiveInfo.getLiveId(), VoiceLiveMode.get(voiceLiveInfo.getLiveMode().name()), voiceLiveInfo.getTemplate());
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<VoiceLiveManager.VoiceLiveInfo> mo94398b() {
        return VoiceLiveManager.VoiceLiveInfo.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "live.voicelive.info";
    }
}
