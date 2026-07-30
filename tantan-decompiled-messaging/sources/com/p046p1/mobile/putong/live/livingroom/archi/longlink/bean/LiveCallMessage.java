package com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean;

import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p046p1.mobile.putong.live.base.data.BLiveCall;
import p149l.i54;

/* JADX INFO: loaded from: classes4.dex */
public class LiveCallMessage {
    private String bulletText;
    private final String callId;
    private final i54 callUser;
    private final String inviteId;
    private final BLiveCall liveCall;
    private final int type;

    public LiveCallMessage(LongLinkLiveMessage.Call call, int i) {
        this.type = i;
        this.inviteId = call.getInviteId();
        this.callId = call.getId();
        this.liveCall = convertMessage(call);
        this.callUser = convertUser(call);
    }

    private BLiveCall convertMessage(LongLinkLiveMessage.Call call) {
        if (call == null) {
            return null;
        }
        BLiveCall bLiveCall = new BLiveCall();
        bLiveCall.f44342id = call.getId();
        bLiveCall.liveId = call.getLiveId();
        bLiveCall.state = call.getState();
        bLiveCall.source = call.getSource();
        bLiveCall.userSendRewardPoint = call.getUserSendRewardPoint();
        bLiveCall.userRecvRewardPoint = call.getUserRecvRewardPoint();
        bLiveCall.intendPosition = call.getIntendPosition();
        bLiveCall.position = call.getPosition();
        bLiveCall.mutedByAnchor = call.getMutedByAnchor();
        bLiveCall.mutedByUser = call.getMutedByUser();
        bLiveCall.opState = call.getOpState();
        bLiveCall.user = call.getUserId();
        bLiveCall.anchor = call.getAnchorUserId();
        bLiveCall.inviteId = call.getInviteId();
        bLiveCall.userName = call.getUserName();
        bLiveCall.isAway = call.getIsAway();
        bLiveCall.anchorUserName = call.getAnchorUserName();
        bLiveCall.hangupReason = call.getHangupReason();
        if (call.getUserProfile() != null) {
            bLiveCall.userPicture = call.getUserProfile().getPictureUrl();
        }
        if (call.getAnchorUserProfile() != null) {
            bLiveCall.anchorPicture = call.getAnchorUserProfile().getPictureUrl();
        }
        bLiveCall.hangupReason = call.getHangupReason();
        return bLiveCall;
    }

    private i54 convertUser(LongLinkLiveMessage.Call call) {
        return new i54(call.getUserId(), call.getUserName(), call.getUserProfile().getPictureUrl());
    }

    public String bulletText() {
        return this.bulletText;
    }

    public BLiveCall getCall() {
        return this.liveCall;
    }

    public String getCallId() {
        return this.callId;
    }

    public i54 getCallUser() {
        return this.callUser;
    }

    public String getInviteId() {
        return this.inviteId;
    }

    public int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: is */
    public boolean m71823is(int i) {
        return this.type == i;
    }

    public LiveCallMessage setBullet(String str) {
        this.bulletText = str;
        return this;
    }
}
