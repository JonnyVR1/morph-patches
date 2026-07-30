package com.hellogroup.p036mk.fdt;

import androidx.annotation.Keep;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0017\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR \u0010\f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR \u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR \u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\b¨\u0006\u0015"}, m88121d2 = {"Lcom/hellogroup/mk/fdt/PageData;", "Lcom/hellogroup/mk/fdt/BaseData;", "()V", "deviceID", "", "getDeviceID", "()Ljava/lang/String;", "setDeviceID", "(Ljava/lang/String;)V", "title", "getTitle", "setTitle", "url", "getUrl", "setUrl", "userAgent", "getUserAgent", "setUserAgent", "uuid", "getUuid", "setUuid", "MKFDT_release"}, m88122k = 1, m88123mv = {1, 1, 16})
public class PageData extends BaseData {

    @SerializedName("deviceID")
    @Expose
    @Nullable
    private String deviceID;

    @SerializedName("title")
    @Expose
    @Nullable
    private String title;

    @SerializedName("url")
    @Expose
    @Nullable
    private String url;

    @SerializedName("userAgent")
    @Expose
    @Nullable
    private String userAgent;

    @SerializedName("uuid")
    @Expose
    @Nullable
    private String uuid;

    @Nullable
    public final String getDeviceID() {
        return this.deviceID;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    public final String getUserAgent() {
        return this.userAgent;
    }

    @Nullable
    public final String getUuid() {
        return this.uuid;
    }

    public final void setDeviceID(@Nullable String str) {
        this.deviceID = str;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public final void setUrl(@Nullable String str) {
        this.url = str;
    }

    public final void setUserAgent(@Nullable String str) {
        this.userAgent = str;
    }

    public final void setUuid(@Nullable String str) {
        this.uuid = str;
    }
}
