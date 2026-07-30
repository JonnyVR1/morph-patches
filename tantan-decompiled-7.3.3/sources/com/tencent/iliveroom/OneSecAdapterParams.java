package com.tencent.iliveroom;

/* JADX INFO: loaded from: classes12.dex */
public class OneSecAdapterParams extends TXILiveRoomDefine.TXILiveRoomParams {
    public int appId;
    public int bizId;
    public long sdkAppId;
    public long userId;
    public String userSig;

    public String toString() {
        return "OneSecAdapterParams{appId=" + this.appId + ", sdkAppId=" + this.sdkAppId + ", bizId=" + this.bizId + ", userId=" + this.userId + ", roomName='" + this.roomName + "', privateMap=" + this.privateMap + ", roomScenario=" + this.roomScenario + ", roomRole=" + this.roomRole + '}';
    }
}
