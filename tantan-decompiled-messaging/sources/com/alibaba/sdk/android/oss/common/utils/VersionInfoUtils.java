package com.alibaba.sdk.android.oss.common.utils;

import android.os.Build;
import com.alibaba.sdk.android.oss.common.OSSLog;
import com.meituan.robust.Constants;

/* JADX INFO: loaded from: classes.dex */
public class VersionInfoUtils {
    private static String userAgent;

    private static String getSystemInfo() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(System.getProperty("os.name"));
        sb.append("/Android " + Build.VERSION.RELEASE);
        sb.append("/");
        sb.append(HttpUtil.urlEncode(Build.MODEL, "utf-8") + Constants.PACKNAME_END + HttpUtil.urlEncode(Build.ID, "utf-8"));
        sb.append(")");
        String string = sb.toString();
        OSSLog.logDebug("user agent : ".concat(string));
        return OSSUtils.isEmptyString(string) ? System.getProperty("http.agent").replaceAll("[^\\p{ASCII}]", "?") : string;
    }

    public static String getUserAgent(String str) {
        if (OSSUtils.isEmptyString(userAgent)) {
            userAgent = "aliyun-sdk-android/" + getVersion() + getSystemInfo();
        }
        if (OSSUtils.isEmptyString(str)) {
            return userAgent;
        }
        return userAgent + "/" + str;
    }

    public static String getVersion() {
        return "2.9.21";
    }
}
