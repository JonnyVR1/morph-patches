package p149l;

import com.p046p1.mobile.longlink.msg.liveroom.VoiceLiveManager;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.VoiceLiveHeartBeatInfoMessage;

/* JADX INFO: loaded from: classes4.dex */
public class tpn0 extends bk2<VoiceLiveManager.VoiceLiveHeartBeatInfo, VoiceLiveHeartBeatInfoMessage> {
    public tpn0(p3g0<VoiceLiveHeartBeatInfoMessage, VoiceLiveHeartBeatInfoMessage> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(VoiceLiveManager.VoiceLiveHeartBeatInfo voiceLiveHeartBeatInfo, String str) {
        return true;
    }

    @Override // p149l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public VoiceLiveHeartBeatInfoMessage mo94461z(String str, VoiceLiveManager.VoiceLiveHeartBeatInfo voiceLiveHeartBeatInfo) {
        return new VoiceLiveHeartBeatInfoMessage(voiceLiveHeartBeatInfo.getLiveId(), voiceLiveHeartBeatInfo.getRoomId(), voiceLiveHeartBeatInfo.getTimestamp(), voiceLiveHeartBeatInfo.getHeartBeats());
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<VoiceLiveManager.VoiceLiveHeartBeatInfo> mo94398b() {
        return VoiceLiveManager.VoiceLiveHeartBeatInfo.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "voiceLive.heartBeats.update";
    }
}
