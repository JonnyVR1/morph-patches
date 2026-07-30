package com.p051p1.mobile.putong.live.base.apibean;

import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class FanBaseGroupSummaryBean extends BaseLiveBean {
    private String anchorId;
    private List<String> avatars;
    private String liveId;
    private int maxGroupCount;
    private int memberCount;
    private String roomId;
    private String source;

    public String getAnchorId() {
        return this.anchorId;
    }

    public List<String> getAvatars() {
        return this.avatars;
    }

    public String getLiveId() {
        return this.liveId;
    }

    public int getMaxGroupCount() {
        return this.maxGroupCount;
    }

    public int getMemberCount() {
        return this.memberCount;
    }

    public String getRoomId() {
        return this.roomId;
    }

    public String getSource() {
        return this.source;
    }

    public void setAnchorId(String str) {
        this.anchorId = str;
    }

    public void setAvatars(List<String> list) {
        this.avatars = list;
    }

    public void setLiveId(String str) {
        this.liveId = str;
    }

    public void setMaxGroupCount(int i) {
        this.maxGroupCount = i;
    }

    public void setMemberCount(int i) {
        this.memberCount = i;
    }

    public void setRoomId(String str) {
        this.roomId = str;
    }

    public void setSource(String str) {
        this.source = str;
    }

    public String toString() {
        return "FanBaseGroupSummaryBean{maxGroupCount=" + this.maxGroupCount + ", liveId='" + this.liveId + "', source='" + this.source + "', anchorId='" + this.anchorId + "', roomId='" + this.roomId + "', avatars=" + this.avatars + ", memberCount=" + this.memberCount + '}';
    }
}
