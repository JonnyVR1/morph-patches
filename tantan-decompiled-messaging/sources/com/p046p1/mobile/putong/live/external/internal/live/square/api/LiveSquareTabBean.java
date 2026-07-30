package com.p046p1.mobile.putong.live.external.internal.live.square.api;

import com.facebook.AuthenticationTokenClaims;
import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.SerializedName;
import com.p046p1.mobile.putong.live.base.apibean.BaseListItemBean;
import java.io.Serializable;

/* JADX INFO: loaded from: classes13.dex */
public class LiveSquareTabBean extends BaseListItemBean implements Serializable {
    public boolean disableFilterRepeat;
    public boolean disableReplaceStopped;

    @SerializedName(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION)
    private boolean display;

    @SerializedName("infinitePull")
    public boolean infinitePull;

    @SerializedName("isDefault")
    private boolean isDefault;

    @SerializedName(AuthenticationTokenClaims.JSON_KEY_NAME)
    private String name;

    @SerializedName("pageId")
    private String pageId;

    @SerializedName("reqSource")
    public String requestName;

    @SerializedName("tabId")
    private String tabId;

    public String getName() {
        return this.name;
    }

    public String getPageId() {
        return this.pageId;
    }

    public String getRequestName() {
        return this.requestName;
    }

    public String getTabId() {
        return this.tabId;
    }

    public boolean isDefault() {
        return this.isDefault;
    }

    public boolean isDisplay() {
        return this.display;
    }

    public boolean isInfinitePull() {
        return this.infinitePull;
    }

    public void setDefault(boolean z) {
        this.isDefault = z;
    }

    public void setDisplay(boolean z) {
        this.display = z;
    }

    public void setInfinitePull(boolean z) {
        this.infinitePull = z;
        this.disableReplaceStopped = z;
        this.disableFilterRepeat = z;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPageId(String str) {
        this.pageId = str;
    }

    public void setRequestName(String str) {
        this.requestName = str;
    }

    public void setTabId(String str) {
        this.tabId = str;
    }
}
