package com.p051p1.mobile.putong.live.base.apibean;

import android.text.TextUtils;
import java.util.HashMap;

/* JADX INFO: loaded from: classes13.dex */
public class LiveCardTrackData extends HashMap<String, Object> {
    String pageId = "";
    String moduleId = "";

    public boolean checkPassed() {
        if (TextUtils.isEmpty(this.pageId)) {
            Object obj = get("pageId");
            if (obj instanceof String) {
                this.pageId = String.valueOf(obj);
            }
        }
        if (TextUtils.isEmpty(this.moduleId)) {
            Object obj2 = get("moduleId");
            if (obj2 instanceof String) {
                this.moduleId = String.valueOf(obj2);
            }
        }
        return (TextUtils.isEmpty(this.pageId) || TextUtils.isEmpty(this.moduleId)) ? false : true;
    }

    public String getModuleId() {
        return this.moduleId;
    }

    public String getPageId() {
        return this.pageId;
    }

    public void setModuleId(String str) {
        this.moduleId = str;
    }

    public void setPageId(String str) {
        this.pageId = str;
    }
}
