package com.momo.mcamera.filtermanager;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public class MMPresetFilter extends MMFilter {
    public boolean isFilterFileExist;
    public boolean isIconLocal;
    public String lookupUrl;
    public String mFilterIcon;
    public String mFilterId;
    public float mPercent;
    public String manifestUrl;
    public String postionInList;
    public String tag;
    public String zipUrl;

    public MMPresetFilter(Context context) {
        super(context);
        this.postionInList = "";
        this.manifestUrl = "";
        this.mPercent = 1.0f;
    }

    public String getIconUrl() {
        return this.mFilterIcon;
    }

    public String getName() {
        return this.mFilterName;
    }

    public float getPercent() {
        return this.mPercent;
    }

    public String getPostionInList() {
        return this.postionInList;
    }

    public String getTag() {
        return this.tag;
    }

    public String getmFilterId() {
        return this.mFilterId;
    }

    public boolean isLocal() {
        return this.isIconLocal;
    }

    public void setPercent(float f) {
        this.mPercent = f;
    }

    public void setPostionInList(String str) {
        this.postionInList = str;
    }

    public void setTag(String str) {
        this.tag = str;
    }

    public MMPresetFilter() {
        this.postionInList = "";
        this.manifestUrl = "";
        this.mPercent = 1.0f;
    }
}
