package p153l;

import com.p051p1.mobile.longlink.msg.liveroom.VoiceLiveManager;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.VoiceLiveHeartBeatInfoMessage;

/* JADX INFO: loaded from: classes4.dex */
public class xyn0 extends jk2<VoiceLiveManager.VoiceLiveHeartBeatInfo, VoiceLiveHeartBeatInfoMessage> {
    public xyn0(wbg0<VoiceLiveHeartBeatInfoMessage, VoiceLiveHeartBeatInfoMessage> wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(VoiceLiveManager.VoiceLiveHeartBeatInfo voiceLiveHeartBeatInfo, String str) {
        return true;
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public VoiceLiveHeartBeatInfoMessage mo95993z(String str, VoiceLiveManager.VoiceLiveHeartBeatInfo voiceLiveHeartBeatInfo) {
        return new VoiceLiveHeartBeatInfoMessage(voiceLiveHeartBeatInfo.getLiveId(), voiceLiveHeartBeatInfo.getRoomId(), voiceLiveHeartBeatInfo.getTimestamp(), voiceLiveHeartBeatInfo.getHeartBeats());
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<VoiceLiveManager.VoiceLiveHeartBeatInfo> mo95510b() {
        return VoiceLiveManager.VoiceLiveHeartBeatInfo.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "voiceLive.heartBeats.update";
    }
}
