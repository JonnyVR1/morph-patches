package com.p046p1.mobile.putong.live.external.internal.virtualVoice.square.api;

import com.facebook.AuthenticationTokenClaims;
import com.google.gson.annotations.SerializedName;
import com.p046p1.mobile.putong.live.base.apibean.BaseLiveBean;
import java.util.List;
import p149l.q4s;

/* JADX INFO: loaded from: classes13.dex */
public class LiveVoiceInternalSquareBean extends BaseLiveBean {

    @SerializedName("buttonList")
    private List<LiveVoiceInternalSquareMenuBean> buttonList;

    @SerializedName("cardList")
    private List<q4s> cardList;

    @SerializedName(AuthenticationTokenClaims.JSON_KEY_NAME)
    private String name;

    @SerializedName("noMoreDataTip")
    private boolean noMoreDataTip;

    @SerializedName("refreshWhenVisible")
    private boolean refreshWhenVisible;

    @SerializedName("tabId")
    private String tabId;

    public List<LiveVoiceInternalSquareMenuBean> getButtonList() {
        return this.buttonList;
    }

    public List<q4s> getCardList() {
        return this.cardList;
    }

    public String getName() {
        return this.name;
    }

    public String getTabId() {
        return this.tabId;
    }

    public boolean isNoMoreDataTip() {
        return this.noMoreDataTip;
    }

    public boolean isRefreshWhenVisible() {
        return this.refreshWhenVisible;
    }

    public void setButtonList(List<LiveVoiceInternalSquareMenuBean> list) {
        this.buttonList = list;
    }

    public void setCardList(List<q4s> list) {
        this.cardList = list;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setNoMoreDataTip(boolean z) {
        this.noMoreDataTip = z;
    }

    public void setRefreshWhenVisible(boolean z) {
        this.refreshWhenVisible = z;
    }

    public void setTabId(String str) {
        this.tabId = str;
    }
}
