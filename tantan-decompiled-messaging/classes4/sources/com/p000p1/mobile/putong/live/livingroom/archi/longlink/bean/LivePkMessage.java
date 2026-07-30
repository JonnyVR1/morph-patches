package com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean;

import android.text.TextUtils;
import com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p1.mobile.putong.live.base.data.BLivePKBufferInfo;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LivePkMessage {
    private String bulletMessage;

    /* JADX INFO: renamed from: id */
    public String f3794id;
    public LongLinkLiveMessage.PkInviteNotify inviteMsg;
    public boolean isOnceMore;
    public LongLinkLiveMessage.PkEnd pkEnd;
    public LongLinkLiveMessage.PkExecuteConfig pkExecuteConfig;
    public LongLinkLiveMessage.PkExecuteInfo pkExecuteInfo;
    public LongLinkLiveMessage.PkInfo pkInfo;
    public LongLinkLiveMessage.PkMute pkMuteInfo;
    public LongLinkLiveMessage.PkPunishmentMotion pkPunishMotion;
    public LongLinkLiveMessage.PkPunishmentSelect pkPunishmentSelect;
    public LongLinkLiveMessage.PkResult pkResult;
    public long serverTimeTs;
    public String type;
    public List<LongLinkLiveMessage.PkUserPoints> userPoints;

    public LivePkMessage(LongLinkLiveMessage.PkInfo pkInfo, String str) {
        this(pkInfo.getId(), str);
        this.pkInfo = pkInfo;
        this.isOnceMore = pkInfo.getIsOnceMore();
    }

    private BLivePKBufferInfo transData(LongLinkLiveMessage.PkPlayingBuffInfo pkPlayingBuffInfo) {
        BLivePKBufferInfo bLivePKBufferInfoNew_ = BLivePKBufferInfo.new_();
        bLivePKBufferInfoNew_.type = pkPlayingBuffInfo.getType();
        bLivePKBufferInfoNew_.text = pkPlayingBuffInfo.getText();
        bLivePKBufferInfoNew_.startTs = pkPlayingBuffInfo.getStartTs();
        bLivePKBufferInfoNew_.duration = pkPlayingBuffInfo.getDuration();
        bLivePKBufferInfoNew_.showCountdown = pkPlayingBuffInfo.getShowCountdown();
        return bLivePKBufferInfoNew_;
    }

    public String bulletText() {
        return this.bulletMessage;
    }

    public long getPkMvpGrade() {
        LongLinkLiveMessage.PkPunishmentMotion pkPunishmentMotion = this.pkPunishMotion;
        if (pkPunishmentMotion == null || pkPunishmentMotion.getMvpUser() == null || TextUtils.isEmpty(this.pkPunishMotion.getMvpUser().getGrade())) {
            return 0L;
        }
        return Long.parseLong(this.pkPunishMotion.getMvpUser().getGrade());
    }

    public String getPkMvpUid() {
        LongLinkLiveMessage.PkPunishmentSelect pkPunishmentSelect = this.pkPunishmentSelect;
        return (pkPunishmentSelect == null || pkPunishmentSelect.getMvpUser() == null) ? "null" : this.pkPunishmentSelect.getMvpUser().getId();
    }

    public BLivePKBufferInfo getPlayingBuffInfo() {
        return transData(this.pkInfo.getPlayingBuffInfo());
    }

    public boolean isPkCreateMessage() {
        return TextUtils.equals(this.type, "pk_created");
    }

    public LivePkMessage setBulletText(String str) {
        this.bulletMessage = str;
        return this;
    }

    public LivePkMessage setInviteMsg(LongLinkLiveMessage.PkInviteNotify pkInviteNotify) {
        this.inviteMsg = pkInviteNotify;
        return this;
    }

    public LivePkMessage setOnceMore(boolean z) {
        this.isOnceMore = z;
        return this;
    }

    public LivePkMessage setPkEnd(LongLinkLiveMessage.PkEnd pkEnd) {
        this.pkEnd = pkEnd;
        return this;
    }

    public LivePkMessage setPkMuteInfo(LongLinkLiveMessage.PkMute pkMute) {
        this.pkMuteInfo = pkMute;
        return this;
    }

    public LivePkMessage setPkPunishMotion(LongLinkLiveMessage.PkPunishmentMotion pkPunishmentMotion) {
        this.pkPunishMotion = pkPunishmentMotion;
        return this;
    }

    public LivePkMessage setPkPunishmentSelect(LongLinkLiveMessage.PkPunishmentSelect pkPunishmentSelect) {
        this.pkPunishmentSelect = pkPunishmentSelect;
        return this;
    }

    public LivePkMessage setPkResult(LongLinkLiveMessage.PkResult pkResult) {
        this.pkResult = pkResult;
        return this;
    }

    public LivePkMessage setPoints(List<LongLinkLiveMessage.PkUserPoints> list) {
        this.userPoints = list;
        return this;
    }

    public String toString() {
        return "LivePkMessage{pkInfo=" + this.pkInfo + ", type='" + this.type + "', id='" + this.f3794id + "', pkResult=" + this.pkResult + ", pkEnd=" + this.pkEnd + ", inviteMsg=" + this.inviteMsg + ", isOnceMore=" + this.isOnceMore + '}';
    }

    public LivePkMessage(String str, String str2) {
        this.f3794id = str;
        this.type = str2;
    }

    public LivePkMessage(LongLinkLiveMessage.PkInfo pkInfo, LongLinkLiveMessage.PkExecuteConfig pkExecuteConfig, String str) {
        this(pkInfo, str);
        this.pkExecuteConfig = pkExecuteConfig;
    }
}
