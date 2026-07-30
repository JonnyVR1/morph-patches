package p002l;

import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.VoiceLiveHeartBeatInfoMessage;
import com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager;
import l.p3g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class tpn0 extends bk2<VoiceLiveManager.VoiceLiveHeartBeatInfo, VoiceLiveHeartBeatInfoMessage> {
    public tpn0(p3g0<VoiceLiveHeartBeatInfoMessage, VoiceLiveHeartBeatInfoMessage> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(VoiceLiveManager.VoiceLiveHeartBeatInfo voiceLiveHeartBeatInfo, String str) {
        return true;
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public VoiceLiveHeartBeatInfoMessage mo9251z(String str, VoiceLiveManager.VoiceLiveHeartBeatInfo voiceLiveHeartBeatInfo) {
        return new VoiceLiveHeartBeatInfoMessage(voiceLiveHeartBeatInfo.getLiveId(), voiceLiveHeartBeatInfo.getRoomId(), voiceLiveHeartBeatInfo.getTimestamp(), voiceLiveHeartBeatInfo.getHeartBeats());
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<VoiceLiveManager.VoiceLiveHeartBeatInfo> mo9244b() {
        return VoiceLiveManager.VoiceLiveHeartBeatInfo.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "voiceLive.heartBeats.update";
    }
}
