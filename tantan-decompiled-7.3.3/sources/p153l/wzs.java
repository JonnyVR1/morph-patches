package p153l;

import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveInfoMessage;

/* JADX INFO: loaded from: classes4.dex */
public class wzs extends jk2<LongLinkLiveMessage.LiveInfo, LiveInfoMessage> {
    public wzs(wbg0<LiveInfoMessage, LiveInfoMessage> wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkLiveMessage.LiveInfo liveInfo, String str) {
        return m159460r(liveInfo.getRoomId(), "no_care", liveInfo.getLiveId());
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LiveInfoMessage mo95993z(String str, LongLinkLiveMessage.LiveInfo liveInfo) {
        return new LiveInfoMessage("liveinfo", liveInfo.getMemberCount(), liveInfo.getRewardPoint()).setCallRewardPoint(liveInfo.getCallRewardPointsList()).setMultiCallRewardPoint(liveInfo.getMultiCallRewardPointsList()).setUpdateFile(liveInfo.getUpdateField());
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.LiveInfo> mo95510b() {
        return LongLinkLiveMessage.LiveInfo.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "live.live.info";
    }
}
