package com.tencent.could.component.common.p079ai.eventreport.utils;

import android.text.TextUtils;

/* JADX INFO: renamed from: com.tencent.could.component.common.ai.eventreport.utils.e */
/* JADX INFO: loaded from: classes2.dex */
public class C13848e {
    /* JADX INFO: renamed from: a */
    public static String m82198a(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        return str + "?FaceIdToken=" + str2;
    }
}
