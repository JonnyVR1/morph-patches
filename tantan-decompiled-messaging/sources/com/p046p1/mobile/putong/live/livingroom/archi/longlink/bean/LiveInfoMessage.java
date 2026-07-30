package com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean;

import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class LiveInfoMessage {
    public List<LongLinkLiveMessage.CallRewardPoint> callRewardPoint;
    public double memberCount;
    public List<LongLinkLiveMessage.CallRewardPoint> multiCallRewardPoint;
    public double rewardPoint;
    public String type;
    public LongLinkLiveMessage.UpdateField updateField;

    public LiveInfoMessage(String str, double d, double d2) {
        this.type = str;
        this.memberCount = d;
        this.rewardPoint = d2;
    }

    public boolean isAllChange() {
        return this.updateField.ordinal() == 0;
    }

    public boolean isRewardChange() {
        return this.updateField.ordinal() == 2;
    }

    public LiveInfoMessage setCallRewardPoint(List<LongLinkLiveMessage.CallRewardPoint> list) {
        this.callRewardPoint = list;
        return this;
    }

    public LiveInfoMessage setMultiCallRewardPoint(List<LongLinkLiveMessage.CallRewardPoint> list) {
        this.multiCallRewardPoint = list;
        return this;
    }

    public LiveInfoMessage setUpdateFile(LongLinkLiveMessage.UpdateField updateField) {
        this.updateField = updateField;
        return this;
    }
}
