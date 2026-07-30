package com.momo.xeengine.p043L;

import com.p046p1.mobile.putong.live.base.data.LovePlanetStage;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class ConfigResponse {
    private Config data;

    /* JADX INFO: renamed from: ec */
    private int f14564ec = -1;

    /* JADX INFO: renamed from: em */
    private String f14565em = "操作成功";

    public static class Config {
        private long expireTime;
        private boolean result;

        public static Config fromJson(JSONObject jSONObject) {
            Config config = new Config();
            config.result = jSONObject.optBoolean(LovePlanetStage.result, false);
            config.expireTime = jSONObject.optLong("expireTime", 0L);
            return config;
        }

        public long getExpireTime() {
            return this.expireTime;
        }

        public boolean isResult() {
            return this.result;
        }
    }

    public static ConfigResponse fromJson(JSONObject jSONObject) {
        ConfigResponse configResponse = new ConfigResponse();
        configResponse.f14564ec = jSONObject.optInt("ec", -1);
        configResponse.f14565em = jSONObject.optString("em", "");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
        if (jSONObjectOptJSONObject != null) {
            configResponse.data = Config.fromJson(jSONObjectOptJSONObject);
        }
        return configResponse;
    }

    public Config getData() {
        return this.data;
    }

    public int getEc() {
        return this.f14564ec;
    }

    public String getEm() {
        return this.f14565em;
    }
}
