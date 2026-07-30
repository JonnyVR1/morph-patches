package p002l;

import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveInfoMessage;
import com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import l.p3g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class vxs extends bk2<LongLinkLiveMessage.LiveInfo, LiveInfoMessage> {
    public vxs(p3g0<LiveInfoMessage, LiveInfoMessage> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkLiveMessage.LiveInfo liveInfo, String str) {
        return m24095r(liveInfo.getRoomId(), "no_care", liveInfo.getLiveId());
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LiveInfoMessage mo9251z(String str, LongLinkLiveMessage.LiveInfo liveInfo) {
        return new LiveInfoMessage("liveinfo", liveInfo.getMemberCount(), liveInfo.getRewardPoint()).setCallRewardPoint(liveInfo.getCallRewardPointsList()).setMultiCallRewardPoint(liveInfo.getMultiCallRewardPointsList()).setUpdateFile(liveInfo.getUpdateField());
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.LiveInfo> mo9244b() {
        return LongLinkLiveMessage.LiveInfo.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "live.live.info";
    }
}
