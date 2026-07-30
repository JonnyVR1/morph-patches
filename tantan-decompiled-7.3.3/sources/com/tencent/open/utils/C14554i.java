package com.tencent.open.utils;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.tencent.connect.common.Constants;
import com.tencent.open.log.SLog;
import io.agora.utils2.internal.CommonUtility;

/* JADX INFO: renamed from: com.tencent.open.utils.i */
/* JADX INFO: loaded from: classes2.dex */
public class C14554i {

    /* JADX INFO: renamed from: a */
    private static boolean f61180a = false;

    /* JADX INFO: renamed from: a */
    private static boolean m85594a(String str) {
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
    private static String m85595b(Context context, String str, String str2) {
        if (!f61180a) {
            return null;
        }
        try {
            Cursor cursorM85596c = m85596c(context, str, str2);
            if (cursorM85596c == null) {
                SLog.m85490e("openSDK_LOG.OpenApiProviderUtils", "queryTargetAppVersion null");
                return null;
            }
            if (cursorM85596c.getCount() <= 0) {
                SLog.m85490e("openSDK_LOG.OpenApiProviderUtils", "queryTargetAppVersion empty");
                return null;
            }
            cursorM85596c.moveToFirst();
            String string = cursorM85596c.getString(0);
            cursorM85596c.close();
            SLog.m85492i("openSDK_LOG.OpenApiProviderUtils", "AppVersion: " + string);
            return m85594a(string) ? string : "UNKNOWN";
        } catch (Exception e) {
            SLog.m85491e("openSDK_LOG.OpenApiProviderUtils", "queryTargetAppVersion exception: ", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    private static Cursor m85596c(Context context, String str, String str2) {
        if (context == null) {
            return null;
        }
        try {
            return context.getContentResolver().query(Uri.parse(CommonUtility.PREFIX_URI + str2 + ".openapi.provider/query_app_version"), new String[0], "appid=? and pkgName=?", new String[]{str, context.getPackageName()}, null);
        } catch (Exception e) {
            SLog.m85491e("openSDK_LOG.OpenApiProviderUtils", "query exception: ", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m85593a(Context context, String str, String str2) {
        if (context != null && str2 != null && str != null) {
            if ("com.tencent.mobileqq".equals(str2)) {
                return m85595b(context, str, "com.tencent.mobileqq");
            }
            if (Constants.PACKAGE_TIM.equals(str2)) {
                return m85595b(context, str, Constants.PACKAGE_TIM);
            }
        }
        return null;
    }
}
