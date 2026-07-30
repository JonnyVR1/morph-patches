package com.momo.xeengine.gift;

import androidx.annotation.Keep;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
@Keep
public class GiftProgress {
    private double currentTime;
    private double totalTime;

    public GiftProgress() {
        this.currentTime = 0.0d;
        this.totalTime = 0.0d;
    }

    public static GiftProgress fromJson(String str) {
        GiftProgress giftProgress = new GiftProgress();
        if (str != null && !str.trim().isEmpty()) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                giftProgress.currentTime = jSONObject.optDouble("currentTime", 0.0d);
                giftProgress.totalTime = jSONObject.optDouble("totalTime", 0.0d);
                return giftProgress;
            } catch (JSONException unused) {
                giftProgress.currentTime = 0.0d;
                giftProgress.totalTime = 0.0d;
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
