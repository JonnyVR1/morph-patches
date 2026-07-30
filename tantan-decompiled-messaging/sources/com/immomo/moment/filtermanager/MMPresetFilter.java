package com.immomo.moment.filtermanager;

import android.content.Context;

/* JADX INFO: loaded from: classes7.dex */
public class MMPresetFilter extends MMFilter {
    public boolean isFilterFileExist;
    public String lookupUrl;
    public String mFilterId;
    public float mPercent;
    public String manifestUrl;
    public String postionInList;
    public String tag;

    public MMPresetFilter(Context context) {
        super(context);
        this.postionInList = "";
        this.manifestUrl = "";
        this.mPercent = 1.0f;
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
