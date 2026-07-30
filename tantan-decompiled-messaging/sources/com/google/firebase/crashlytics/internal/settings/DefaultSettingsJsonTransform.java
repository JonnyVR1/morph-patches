package com.google.firebase.crashlytics.internal.settings;

import com.google.firebase.crashlytics.internal.common.CurrentTimeProvider;
import com.tencent.mmkv.MMKV;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
class DefaultSettingsJsonTransform implements SettingsJsonTransform {
    public static Settings defaultSettings(CurrentTimeProvider currentTimeProvider) {
        return new Settings(currentTimeProvider.getCurrentTimeMillis() + 3600000, new Settings.SessionData(8, 4), new Settings.FeatureFlagData(true, false, false), 0, MMKV.ExpireInHour, 10.0d, 1.2d, 60);
    }

    @Override // com.google.firebase.crashlytics.internal.settings.SettingsJsonTransform
    public Settings buildFromJson(CurrentTimeProvider currentTimeProvider, JSONObject jSONObject) {
        return defaultSettings(currentTimeProvider);
    }
}
