package com.momo.xeengine.gift;

import androidx.annotation.Keep;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
@Keep
public class GiftProgress {
    private double currentTime;
    private double totalTime;

    public GiftProgress() {
        this.currentTime = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        this.totalTime = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    public static GiftProgress fromJson(String str) {
        GiftProgress giftProgress = new GiftProgress();
        if (str != null && !str.trim().isEmpty()) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                giftProgress.currentTime = jSONObject.optDouble("currentTime", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                giftProgress.totalTime = jSONObject.optDouble("totalTime", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                return giftProgress;
            } catch (JSONException unused) {
                giftProgress.currentTime = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
                giftProgress.totalTime = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            }
        }
        return giftProgress;
    }

    public double getCurrentTime() {
        return this.currentTime;
    }

    public double getTotalTime() {
        return this.totalTime;
    }

    public void setCurrentTime(double d) {
        this.currentTime = d;
    }

    public void setTotalTime(double d) {
        this.totalTime = d;
    }

    public String toString() {
        return "GiftProgress{currentTime=" + this.currentTime + ", totalTime=" + this.totalTime + '}';
    }

    public GiftProgress(double d, double d2) {
        this.currentTime = d;
        this.totalTime = d2;
    }
}
