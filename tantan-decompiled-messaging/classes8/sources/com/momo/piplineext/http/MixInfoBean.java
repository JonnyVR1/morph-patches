package com.momo.piplineext.http;

import androidx.annotation.Keep;
import com.alibaba.fastjson.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
@Keep
public class MixInfoBean {
    public int audioBitrate;
    public int audioChannels;
    public int audioCodecProfile;
    public int audioSampleRate;
    public int height;
    public int lowLatency;
    public int videoBitrate;
    public int videoFramerate;
    public int videoGop;
    public int width;
    public String videoCodecProfile = "";
    public String backgroundColor = "";
    public String backgroundImage = "";
    public String pushUrl = "";

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", Integer.valueOf(this.width));
        jSONObject.put("height", Integer.valueOf(this.height));
        jSONObject.put("lowLatency", Integer.valueOf(this.lowLatency));
        jSONObject.put("videoGop", Integer.valueOf(this.videoGop));
        jSONObject.put("videoFramerate", Integer.valueOf(this.videoFramerate));
        jSONObject.put("videoCodecProfile", this.videoCodecProfile);
        jSONObject.put("videoBitrate", Integer.valueOf(this.videoBitrate));
        jSONObject.put("audioSampleRate", Integer.valueOf(this.audioSampleRate));
        jSONObject.put("audioBitrate", Integer.valueOf(this.audioBitrate));
        jSONObject.put("audioCodecProfile", Integer.valueOf(this.audioCodecProfile));
        jSONObject.put("backgroundColor", this.backgroundColor);
        jSONObject.put("backgroundImage", this.backgroundImage);
        jSONObject.put("pushUrl", this.pushUrl);
        return jSONObject.toJSONString();
    }
}
