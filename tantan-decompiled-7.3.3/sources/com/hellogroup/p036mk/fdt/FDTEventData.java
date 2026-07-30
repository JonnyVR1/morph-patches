package com.hellogroup.p036mk.fdt;

import androidx.annotation.Keep;
import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR \u0010\f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR \u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR \u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\b¨\u0006\u0015"}, m88121d2 = {"Lcom/hellogroup/mk/fdt/FDTEventData;", "Lcom/hellogroup/mk/fdt/BaseData;", "()V", "bid", "", "getBid", "()Ljava/lang/String;", "setBid", "(Ljava/lang/String;)V", NotificationCompat.CATEGORY_EVENT, "getEvent", "setEvent", "source", "getSource", "setSource", NotificationCompat.CATEGORY_STATUS, "getStatus", "setStatus", "url", "getUrl", "setUrl", "MKFDT_release"}, m88122k = 1, m88123mv = {1, 1, 16})
public final class FDTEventData extends BaseData {

    @SerializedName(NotificationCompat.CATEGORY_EVENT)
    @Expose
    @Nullable
    private String event;

    @SerializedName("source")
    @Expose
    @Nullable
    private String source;

    @SerializedName("url")
    @Expose
    @Nullable
    private String url;

    @SerializedName("bid")
    @Expose
    @Nullable
    private String bid = "0";

    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    @Expose
    @Nullable
    private String status = "0";

    @Nullable
    public final String getBid() {
        return this.bid;
    }

    @Nullable
    public final String getEvent() {
        return this.event;
    }

    @Nullable
    public final String getSource() {
        return this.source;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public final void setBid(@Nullable String str) {
        this.bid = str;
    }

    public final void setEvent(@Nullable String str) {
        this.event = str;
    }

    public final void setSource(@Nullable String str) {
        this.source = str;
    }

    public final void setStatus(@Nullable String str) {
        this.status = str;
    }

    public final void setUrl(@Nullable String str) {
        this.url = str;
    }
}
