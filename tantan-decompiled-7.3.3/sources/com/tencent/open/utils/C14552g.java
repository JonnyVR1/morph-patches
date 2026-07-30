package com.tencent.open.utils;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.open.log.SLog;

/* JADX INFO: renamed from: com.tencent.open.utils.g */
/* JADX INFO: loaded from: classes2.dex */
public class C14552g {

    /* JADX INFO: renamed from: a */
    private String f61176a;

    /* JADX INFO: renamed from: b */
    private String f61177b;

    /* JADX INFO: renamed from: com.tencent.open.utils.g$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private static C14552g f61178a = new C14552g();
    }

    private C14552g() {
        this.f61176a = "";
        this.f61177b = "";
    }

    /* JADX INFO: renamed from: a */
    public void m85582a(Context context, String str) {
        SLog.m85492i("openSDK_LOG.DeviceInfoUtils", "setBuildModel, model = " + str);
        if (str == null || str.trim().isEmpty()) {
            this.f61177b = "";
            if (context != null) {
                context.getSharedPreferences("device_info_file", 4).edit().remove("build_model").commit();
                return;
            }
            return;
        }
        String str2 = this.f61177b;
        if (str2 != null && str2.equals(str)) {
            SLog.m85492i("openSDK_LOG.DeviceInfoUtils", "setBuildModel, needn't update sp.");
            return;
        }
        this.f61177b = str;
        if (context != null) {
            context.getSharedPreferences("device_info_file", 4).edit().putString("build_model", this.f61177b).commit();
            SLog.m85492i("openSDK_LOG.DeviceInfoUtils", "setBuildModel, update sp.");
        }
    }

    /* JADX INFO: renamed from: b */
    public String m85584b(Context context) {
        return this.f61176a;
    }

    /* JADX INFO: renamed from: c */
    public String m85585c() {
        return C14559n.m85694k(m85583b());
    }

    /* JADX INFO: renamed from: b */
    public String m85583b() {
        return this.f61177b;
    }

    /* JADX INFO: renamed from: a */
    public void m85581a(Context context) {
        if (context == null) {
            return;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("device_info_file", 4);
        String str = this.f61177b;
        if (str == null || str.trim().isEmpty()) {
            this.f61177b = sharedPreferences.getString("build_model", "");
            SLog.m85492i("openSDK_LOG.DeviceInfoUtils", "init, model = " + this.f61177b);
        }
        String str2 = this.f61176a;
        if (str2 == null || str2.trim().isEmpty()) {
            this.f61176a = sharedPreferences.getString("build_device", "");
            SLog.m85492i("openSDK_LOG.DeviceInfoUtils", "init, device = " + this.f61176a);
        }
    }

    /* JADX INFO: renamed from: a */
    public static C14552g m85580a() {
        return a.f61178a;
    }
}
