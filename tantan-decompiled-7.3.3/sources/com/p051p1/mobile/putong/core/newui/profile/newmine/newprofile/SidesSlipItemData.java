package com.p051p1.mobile.putong.core.newui.profile.newmine.newprofile;

import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public class SidesSlipItemData implements Serializable {
    private int index;
    private String type = "native";
    private String title = "";
    private String iconUrl = "";
    private int nativeIcon = 0;
    private Boolean showDot = Boolean.FALSE;
    private String deepLink = "";
    private String omsId = "";

    public String getDeepLink() {
        return this.deepLink;
    }

    public String getIconUrl() {
        return this.iconUrl;
    }

    public int getIndex() {
        return this.index;
    }

    public int getNativeIcon() {
        return this.nativeIcon;
    }

    public String getOmsId() {
        return this.omsId;
    }

    public Boolean getShowDot() {
        return this.showDot;
    }

    public String getTitle() {
        return this.title;
    }

    public String getType() {
        return this.type;
    }

    public void setDeepLink(String str) {
        this.deepLink = str;
    }

    public void setIconUrl(String str) {
        this.iconUrl = str;
    }

    public void setIndex(int i) {
        this.index = i;
    }

    public void setNativeIcon(int i) {
        this.nativeIcon = i;
    }

    public void setOmsId(String str) {
        this.omsId = str;
    }

    public void setShowDot(Boolean bool) {
        this.showDot = bool;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setType(String str) {
        this.type = str;
    }
}
