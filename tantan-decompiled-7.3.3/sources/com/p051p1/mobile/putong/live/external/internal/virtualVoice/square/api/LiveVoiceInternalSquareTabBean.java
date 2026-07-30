package com.p051p1.mobile.putong.live.external.internal.virtualVoice.square.api;

import com.facebook.AuthenticationTokenClaims;
import com.google.gson.annotations.SerializedName;
import com.p051p1.mobile.putong.live.base.apibean.BaseListItemBean;

/* JADX INFO: loaded from: classes9.dex */
public class LiveVoiceInternalSquareTabBean extends BaseListItemBean {

    @SerializedName("bubble")
    private String bubble;

    @SerializedName("isDefault")
    private boolean isDefault;

    @SerializedName(AuthenticationTokenClaims.JSON_KEY_NAME)
    private String name;

    @SerializedName("tabId")
    private String tabId;

    public String getBubble() {
        return this.bubble;
    }

    public String getName() {
        return this.name;
    }

    public String getTabId() {
        return this.tabId;
    }

    public boolean isDefault() {
        return this.isDefault;
    }

    public void setBubble(String str) {
        this.bubble = str;
    }

    public void setDefault(boolean z) {
        this.isDefault = z;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setTabId(String str) {
        this.tabId = str;
    }
}
