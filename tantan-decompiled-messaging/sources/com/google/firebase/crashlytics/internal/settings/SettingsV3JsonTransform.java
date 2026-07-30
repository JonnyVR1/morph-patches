package com.google.firebase.crashlytics.internal.settings;

import com.google.firebase.crashlytics.internal.common.CurrentTimeProvider;
import com.tencent.mmkv.MMKV;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
class SettingsV3JsonTransform implements SettingsJsonTransform {
    private static Settings.FeatureFlagData buildFeatureFlagDataFrom(JSONObject jSONObject) {
        return new Settings.FeatureFlagData(jSONObject.optBoolean("collect_reports", true), jSONObject.optBoolean("collect_anrs", false), jSONObject.optBoolean("collect_build_ids", false));
    }

    private static Settings.SessionData buildSessionDataFrom(JSONObject jSONObject) {
        return new Settings.SessionData(jSONObject.optInt("max_custom_exception_events", 8), 4);
    }

    private static long getExpiresAtFrom(CurrentTimeProvider currentTimeProvider, long j, JSONObject jSONObject) {
        return jSONObject.has("expires_at") ? jSONObject.optLong("expires_at") : currentTimeProvider.getCurrentTimeMillis() + (j * 1000);
    }

    @Override // com.google.firebase.crashlytics.internal.settings.SettingsJsonTransform
    public Settings buildFromJson(CurrentTimeProvider currentTimeProvider, JSONObject jSONObject) throws JSONException {
        int iOptInt = jSONObject.optInt("settings_version", 0);
        int iOptInt2 = jSONObject.optInt("cache_duration", MMKV.ExpireInHour);
        return new Settings(getExpiresAtFrom(currentTimeProvider, iOptInt2, jSONObject), jSONObject.has("session") ? buildSessionDataFrom(jSONObject.getJSONObject("session")) : buildSessionDataFrom(new JSONObject()), buildFeatureFlagDataFrom(jSONObject.getJSONObject("features")), iOptInt, iOptInt2, jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d), jSONObject.optDouble("on_demand_backoff_base", 1.2d), jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60));
    }
}
