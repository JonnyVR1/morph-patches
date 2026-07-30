package com.p051p1.mobile.putong.live.base.apibean;

import com.google.gson.annotations.SerializedName;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class LiveGoAction extends BaseLiveBean {
    public static final int TYPE_CUSTOM = 9;
    public static final int TYPE_INTL_VOICE_ID = 5;
    public static final int TYPE_LIVE_ID = 3;
    public static final int TYPE_SCHEMA = 1;
    public static final int TYPE_VIDEO_CHAT_ID = 4;
    public static final int TYPE_VIRTUAL_VOICE_ID = 2;

    @SerializedName("goData")
    private String goData;

    @SerializedName("goExtra")
    private Map<String, String> goExtra;

    @SerializedName("type")
    private int type;

    public String getGoData() {
        return this.goData;
    }

    public Map<String, String> getGoExtra() {
        return this.goExtra;
    }

    public int getType() {
        return this.type;
    }

    public void setGoData(String str) {
        this.goData = str;
    }

    public void setGoExtra(Map<String, String> map) {
        this.goExtra = map;
    }

    public void setType(int i) {
        this.type = i;
    }
}
