package com.tencent.open.utils;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.open.log.SLog;

/* JADX INFO: renamed from: com.tencent.open.utils.g */
/* JADX INFO: loaded from: classes2.dex */
public class C14389g {

    /* JADX INFO: renamed from: a */
    private String f60328a;

    /* JADX INFO: renamed from: b */
    private String f60329b;

    /* JADX INFO: renamed from: com.tencent.open.utils.g$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private static C14389g f60330a = new C14389g();
    }

    private C14389g() {
        this.f60328a = "";
        this.f60329b = "";
    }

    /* JADX INFO: renamed from: a */
    public void m84399a(Context context, String str) {
        SLog.m84309i("openSDK_LOG.DeviceInfoUtils", "setBuildModel, model = " + str);
        if (str == null || str.trim().isEmpty()) {
            this.f60329b = "";
            if (context != null) {
                context.getSharedPreferences("device_info_file", 4).edit().remove("build_model").commit();
                return;
            }
            return;
        }
        String str2 = this.f60329b;
        if (str2 != null && str2.equals(str)) {
            SLog.m84309i("openSDK_LOG.DeviceInfoUtils", "setBuildModel, needn't update sp.");
            return;
        }
        this.f60329b = str;
        if (context != null) {
            context.getSharedPreferences("device_info_file", 4).edit().putString("build_model", this.f60329b).commit();
            SLog.m84309i("openSDK_LOG.DeviceInfoUtils", "setBuildModel, update sp.");
        }
    }

    /* JADX INFO: renamed from: b */
    public String m84401b(Context context) {
        return this.f60328a;
    }

    /* JADX INFO: renamed from: c */
    public String m84402c() {
        return C14396n.m84511k(m84400b());
    }

    /* JADX INFO: renamed from: b */
    public String m84400b() {
        return this.f60329b;
    }

    /* JADX INFO: renamed from: a */
    public void m84398a(Context context) {
        if (context == null) {
            return;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("device_info_file", 4);
        String str = this.f60329b;
        if (str == null || str.trim().isEmpty()) {
            this.f60329b = sharedPreferences.getString("build_model", "");
            SLog.m84309i("openSDK_LOG.DeviceInfoUtils", "init, model = " + this.f60329b);
        }
        String str2 = this.f60328a;
        if (str2 == null || str2.trim().isEmpty()) {
            this.f60328a = sharedPreferences.getString("build_device", "");
            SLog.m84309i("openSDK_LOG.DeviceInfoUtils", "init, device = " + this.f60328a);
        }
    }

    /* JADX INFO: renamed from: a */
    public static C14389g m84397a() {
        return a.f60330a;
    }
}
