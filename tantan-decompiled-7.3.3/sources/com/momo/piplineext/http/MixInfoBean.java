package com.momo.piplineext.http;

import androidx.annotation.Keep;
import com.alibaba.fastjson.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
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
        jSONObject.put("width", (Object) Integer.valueOf(this.width));
        jSONObject.put("height", (Object) Integer.valueOf(this.height));
        jSONObject.put("lowLatency", (Object) Integer.valueOf(this.lowLatency));
        jSONObject.put("videoGop", (Object) Integer.valueOf(this.videoGop));
        jSONObject.put("videoFramerate", (Object) Integer.valueOf(this.videoFramerate));
        jSONObject.put("videoCodecProfile", (Object) this.videoCodecProfile);
        jSONObject.put("videoBitrate", (Object) Integer.valueOf(this.videoBitrate));
        jSONObject.put("audioSampleRate", (Object) Integer.valueOf(this.audioSampleRate));
        jSONObject.put("audioBitrate", (Object) Integer.valueOf(this.audioBitrate));
        jSONObject.put("audioCodecProfile", (Object) Integer.valueOf(this.audioCodecProfile));
        jSONObject.put("backgroundColor", (Object) this.backgroundColor);
        jSONObject.put("backgroundImage", (Object) this.backgroundImage);
        jSONObject.put("pushUrl", (Object) this.pushUrl);
        return jSONObject.toJSONString();
    }
}
