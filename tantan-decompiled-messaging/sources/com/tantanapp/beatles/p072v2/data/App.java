package com.tantanapp.beatles.p072v2.data;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes13.dex */
@Keep
public class App {

    @SerializedName("app_build")
    private String appBuild;

    @SerializedName("bundle_id")
    private String appIdentifier;

    @SerializedName("app_start_time")
    private String appStartTime;

    @SerializedName("app_version")
    private String appVersion;

    @SerializedName("build_type")
    private String buildType;
    private String channel;

    @SerializedName("is_foreground")
    private Boolean isForeground;

    @SerializedName("app_setup_duration")
    private long setUpDuration;

    public String getAppBuild() {
        return this.appBuild;
    }

    public String getAppIdentifier() {
        return this.appIdentifier;
    }

    public String getAppStartTime() {
        return this.appStartTime;
    }

    public String getAppVersion() {
        return this.appVersion;
    }

    public String getBuildType() {
        return this.buildType;
    }

    public String getChannel() {
        return this.channel;
    }

    public Boolean getForeground() {
        return this.isForeground;
    }

    public long getSetUpDuration() {
        return this.setUpDuration;
    }

    public void setAppBuild(String str) {
        this.appBuild = str;
    }

    public void setAppIdentifier(String str) {
        this.appIdentifier = str;
    }

    public void setAppStartTime(String str) {
        this.appStartTime = str;
    }

    public void setAppVersion(String str) {
        this.appVersion = str;
    }

    public void setBuildType(String str) {
        this.buildType = str;
    }

    public void setChannel(String str) {
        this.channel = str;
    }

    public void setForeground(Boolean bool) {
        this.isForeground = bool;
    }

    public void setUpDuration(long j) {
        this.setUpDuration = j;
    }
}
