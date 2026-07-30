package com.p046p1.mobile.putong.core.p053ui.profile.exploop.inputitem;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
public class ExpProfileLoopTextTypeData extends ExpInputContentBaseData {
    public String text1;
    public String text2;
    public String text3 = "";
    public int maxCount = 50;
    public int needCount = 0;
    public String errorTips = "";

    public ExpProfileLoopTextTypeData(String str, String str2) {
        this.text1 = str;
        this.text2 = str2;
    }

    public ExpProfileLoopTextTypeData setErrorTips(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.errorTips = str;
        }
        return this;
    }

    public ExpProfileLoopTextTypeData setMaxCount(int i) {
        if (i > 0) {
            this.maxCount = i;
        }
        return this;
    }

    public ExpProfileLoopTextTypeData setNeedCount(int i) {
        if (i > 0) {
            this.needCount = i;
        }
        return this;
    }
}
