package com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean;

import android.text.TextUtils;
import java.util.HashMap;
import p149l.wml;

/* JADX INFO: loaded from: classes4.dex */
public class LiveControlMessage implements wml<String> {
    public static final String FROM_LIVE_ROOM_BLOCK = "live.room.block";
    public static final String FROM_VOICE_ROOM_BLOCK = "live.voiceRoom.blockUser";
    private static HashMap<String, String> backgroundTapTypeMap;
    public String content;
    public String from;
    public boolean isAnchor;
    public String liveId;
    public String streamId;
    public int templateId;
    public String type;

    static {
        HashMap<String, String> map = new HashMap<>();
        backgroundTapTypeMap = map;
        map.put("start", "TYPE_GROUP_LIVE_1");
        backgroundTapTypeMap.put("stop", "TYPE_GROUP_LIVE_1");
        backgroundTapTypeMap.put("pause", "TYPE_GROUP_LIVE_2");
        backgroundTapTypeMap.put("recover", "TYPE_GROUP_LIVE_2");
        backgroundTapTypeMap.put("boot", "TYPE_GROUP_LIVE_3");
        backgroundTapTypeMap.put("block", "TYPE_GROUP_LIVE_3");
        backgroundTapTypeMap.put("force_stop", "TYPE_GROUP_LIVE_3");
        backgroundTapTypeMap.put("forbidden_multidevice", "TYPE_GROUP_LIVE_3");
    }

    public LiveControlMessage(String str, String str2, String str3) {
        this.type = str2;
        this.streamId = str3;
    }

    @Override // p149l.wml
    public String getTapType() {
        String str = backgroundTapTypeMap.get(this.type);
        return str == null ? this.type : str;
    }

    public boolean isFromLiveRoomBlock() {
        return TextUtils.equals(FROM_LIVE_ROOM_BLOCK, this.from);
    }

    public LiveControlMessage setContent(String str) {
        this.content = str;
        return this;
    }

    public LiveControlMessage setFrom(String str) {
        this.from = str;
        return this;
    }

    public LiveControlMessage setLiveId(String str) {
        this.liveId = str;
        return this;
    }

    public LiveControlMessage setNewDeviceRole(boolean z) {
        this.isAnchor = z;
        return this;
    }

    public LiveControlMessage setTemplateId(int i) {
        this.templateId = i;
        return this;
    }

    public String toString() {
        return "LiveControlMessage{type='" + this.type + "', streamId='" + this.streamId + "', content='" + this.content + "', isAnchor=" + this.isAnchor + ", liveId='" + this.liveId + "', from='" + this.from + "'}";
    }

    public LiveControlMessage(String str, String str2) {
        this.type = str2;
    }
}
