package p149l;

import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveInfoMessage;

/* JADX INFO: loaded from: classes4.dex */
public class vxs extends bk2<LongLinkLiveMessage.LiveInfo, LiveInfoMessage> {
    public vxs(p3g0<LiveInfoMessage, LiveInfoMessage> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LongLinkLiveMessage.LiveInfo liveInfo, String str) {
        return m199212r(liveInfo.getRoomId(), "no_care", liveInfo.getLiveId());
    }

    @Override // p149l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LiveInfoMessage mo94461z(String str, LongLinkLiveMessage.LiveInfo liveInfo) {
        return new LiveInfoMessage("liveinfo", liveInfo.getMemberCount(), liveInfo.getRewardPoint()).setCallRewardPoint(liveInfo.getCallRewardPointsList()).setMultiCallRewardPoint(liveInfo.getMultiCallRewardPointsList()).setUpdateFile(liveInfo.getUpdateField());
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.LiveInfo> mo94398b() {
        return LongLinkLiveMessage.LiveInfo.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "live.live.info";
    }
}
