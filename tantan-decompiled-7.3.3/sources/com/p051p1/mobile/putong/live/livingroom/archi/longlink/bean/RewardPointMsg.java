package com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean;

import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class RewardPointMsg {
    public List<LongLinkLiveMessage.LiveRewardPointInfo.CallRewardPoint> callRewardPoint;
    public double rewardPoint;

    public RewardPointMsg(double d) {
        this.rewardPoint = d;
    }

    public RewardPointMsg setCallRewardPoint(List<LongLinkLiveMessage.LiveRewardPointInfo.CallRewardPoint> list) {
        this.callRewardPoint = list;
        return this;
    }
}
