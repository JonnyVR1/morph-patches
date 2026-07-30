package com.immomo.momomediaext.utils;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes7.dex */
public class MMLiveUserConfig {
    private String appVersion;
    private String appid;
    private boolean isAudioOnly;
    private String momoid;
    private String roomid;
    private String secret;
    public String verCode;

    public MMLiveUserConfig(@NonNull String str, @NonNull String str2, @NonNull String str3, String str4, String str5, String str6, boolean z) {
        this.appid = str;
        this.secret = str2;
        this.momoid = str3;
        this.roomid = str4;
        this.appVersion = str5;
        this.isAudioOnly = z;
        this.verCode = str6;
    }

    public String getAppPatch() {
        return this.verCode;
    }

    public String getAppVersion() {
        return this.appVersion;
    }

    public String getAppid() {
        return this.appid;
    }

    public String getMomoid() {
        return this.momoid;
    }

    public String getRoomid() {
        return this.roomid;
    }

    public String getSecret() {
        return this.secret;
    }

    public boolean isAudioOnly() {
        return this.isAudioOnly;
    }

    public String toString() {
        return "<appid:" + this.appid + ",userid:" + this.momoid + ",roomid:" + this.roomid + "appVerison" + this.appVersion + "versonCode" + this.verCode + ",isAudioOnly" + this.isAudioOnly + '>';
    }
}
