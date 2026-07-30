package com.momo.xeengine.p000L;

import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class ConfigResponse {
    private Config data;

    /* JADX INFO: renamed from: ec */
    private int f263ec = -1;

    /* JADX INFO: renamed from: em */
    private String f264em = "操作成功";

    public static class Config {
        private long expireTime;
        private boolean result;

        public static Config fromJson(JSONObject jSONObject) {
            Config config = new Config();
            config.result = jSONObject.optBoolean("result", false);
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
        configResponse.f263ec = jSONObject.optInt("ec", -1);
        configResponse.f264em = jSONObject.optString("em", "");
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
        return this.f263ec;
    }

    public String getEm() {
        return this.f264em;
    }
}
