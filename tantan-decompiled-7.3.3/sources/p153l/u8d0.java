package p153l;

import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.RewardPointMsg;

/* JADX INFO: loaded from: classes4.dex */
public class u8d0 extends jk2<LongLinkLiveMessage.LiveRewardPointInfo, RewardPointMsg> {
    public u8d0(wbg0<RewardPointMsg, RewardPointMsg> wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkLiveMessage.LiveRewardPointInfo liveRewardPointInfo, String str) {
        return m159460r(liveRewardPointInfo.getRoomId(), "no_care", liveRewardPointInfo.getLiveId());
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public RewardPointMsg mo95993z(String str, LongLinkLiveMessage.LiveRewardPointInfo liveRewardPointInfo) {
        return new RewardPointMsg(liveRewardPointInfo.getRewardPoint()).setCallRewardPoint(liveRewardPointInfo.getCallRewardPointsList());
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.LiveRewardPointInfo> mo95510b() {
        return LongLinkLiveMessage.LiveRewardPointInfo.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "voicelive.reward.point.info";
    }
}
