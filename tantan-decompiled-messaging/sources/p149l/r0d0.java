package p149l;

import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.RewardPointMsg;

/* JADX INFO: loaded from: classes4.dex */
public class r0d0 extends bk2<LongLinkLiveMessage.LiveRewardPointInfo, RewardPointMsg> {
    public r0d0(p3g0<RewardPointMsg, RewardPointMsg> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LongLinkLiveMessage.LiveRewardPointInfo liveRewardPointInfo, String str) {
        return m199212r(liveRewardPointInfo.getRoomId(), "no_care", liveRewardPointInfo.getLiveId());
    }

    @Override // p149l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public RewardPointMsg mo94461z(String str, LongLinkLiveMessage.LiveRewardPointInfo liveRewardPointInfo) {
        return new RewardPointMsg(liveRewardPointInfo.getRewardPoint()).setCallRewardPoint(liveRewardPointInfo.getCallRewardPointsList());
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.LiveRewardPointInfo> mo94398b() {
        return LongLinkLiveMessage.LiveRewardPointInfo.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "voicelive.reward.point.info";
    }
}
