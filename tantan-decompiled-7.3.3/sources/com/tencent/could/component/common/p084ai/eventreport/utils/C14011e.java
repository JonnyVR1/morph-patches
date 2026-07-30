package com.tencent.could.component.common.p084ai.eventreport.utils;

import android.text.TextUtils;

/* JADX INFO: renamed from: com.tencent.could.component.common.ai.eventreport.utils.e */
/* JADX INFO: loaded from: classes12.dex */
public class C14011e {
    /* JADX INFO: renamed from: a */
    public static String m83381a(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        return str + "?FaceIdToken=" + str2;
    }
}
