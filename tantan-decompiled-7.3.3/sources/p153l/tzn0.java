package p153l;

import com.p051p1.mobile.longlink.msg.liveroom.VoiceLiveManager;
import com.p051p1.mobile.putong.live.base.data.VoiceLiveMode;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.VoiceLiveInfoMessage;

/* JADX INFO: loaded from: classes4.dex */
public class tzn0 extends jk2<VoiceLiveManager.VoiceLiveInfo, VoiceLiveInfoMessage> {
    public tzn0(wbg0<VoiceLiveInfoMessage, VoiceLiveInfoMessage> wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(VoiceLiveManager.VoiceLiveInfo voiceLiveInfo, String str) {
        return true;
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public VoiceLiveInfoMessage mo95993z(String str, VoiceLiveManager.VoiceLiveInfo voiceLiveInfo) {
        return new VoiceLiveInfoMessage(voiceLiveInfo.getRewardPoint(), voiceLiveInfo.getRoomId(), voiceLiveInfo.getLiveId(), VoiceLiveMode.get(voiceLiveInfo.getLiveMode().name()), voiceLiveInfo.getTemplate());
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<VoiceLiveManager.VoiceLiveInfo> mo95510b() {
        return VoiceLiveManager.VoiceLiveInfo.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "live.voicelive.info";
    }
}
