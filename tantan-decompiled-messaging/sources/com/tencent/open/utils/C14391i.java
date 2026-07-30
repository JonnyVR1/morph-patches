package com.tencent.open.utils;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.tencent.connect.common.Constants;
import com.tencent.open.log.SLog;
import io.agora.utils2.internal.CommonUtility;

/* JADX INFO: renamed from: com.tencent.open.utils.i */
/* JADX INFO: loaded from: classes2.dex */
public class C14391i {

    /* JADX INFO: renamed from: a */
    private static boolean f60332a = false;

    /* JADX INFO: renamed from: a */
    private static boolean m84411a(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        String[] strArrSplit = str.split("\\.");
        if (strArrSplit.length < 3) {
            return false;
        }
        for (String str2 : strArrSplit) {
            try {
                Integer.parseInt(str2);
            } catch (NumberFormatException unused) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    private static String m84412b(Context context, String str, String str2) {
        if (!f60332a) {
            return null;
        }
        try {
            Cursor cursorM84413c = m84413c(context, str, str2);
            if (cursorM84413c == null) {
                SLog.m84307e("openSDK_LOG.OpenApiProviderUtils", "queryTargetAppVersion null");
                return null;
            }
            if (cursorM84413c.getCount() <= 0) {
                SLog.m84307e("openSDK_LOG.OpenApiProviderUtils", "queryTargetAppVersion empty");
                return null;
            }
            cursorM84413c.moveToFirst();
            String string = cursorM84413c.getString(0);
            cursorM84413c.close();
            SLog.m84309i("openSDK_LOG.OpenApiProviderUtils", "AppVersion: " + string);
            return m84411a(string) ? string : "UNKNOWN";
        } catch (Exception e) {
            SLog.m84308e("openSDK_LOG.OpenApiProviderUtils", "queryTargetAppVersion exception: ", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    private static Cursor m84413c(Context context, String str, String str2) {
        if (context == null) {
            return null;
        }
        try {
            return context.getContentResolver().query(Uri.parse(CommonUtility.PREFIX_URI + str2 + ".openapi.provider/query_app_version"), new String[0], "appid=? and pkgName=?", new String[]{str, context.getPackageName()}, null);
        } catch (Exception e) {
            SLog.m84308e("openSDK_LOG.OpenApiProviderUtils", "query exception: ", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m84410a(Context context, String str, String str2) {
        if (context != null && str2 != null && str != null) {
            if ("com.tencent.mobileqq".equals(str2)) {
                return m84412b(context, str, "com.tencent.mobileqq");
            }
            if (Constants.PACKAGE_TIM.equals(str2)) {
                return m84412b(context, str, Constants.PACKAGE_TIM);
            }
        }
        return null;
    }
}
