package com.tencent.open.utils;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.open.log.SLog;
import java.lang.ref.WeakReference;
import java.net.URL;

/* JADX INFO: renamed from: com.tencent.open.utils.k */
/* JADX INFO: loaded from: classes2.dex */
public class C14393k {

    /* JADX INFO: renamed from: a */
    private static C14393k f60343a;

    /* JADX INFO: renamed from: b */
    private volatile WeakReference<SharedPreferences> f60344b = null;

    /* JADX INFO: renamed from: a */
    public String m84427a(Context context, String str) {
        if (this.f60344b == null || this.f60344b.get() == null) {
            this.f60344b = new WeakReference<>(context.getSharedPreferences("ServerPrefs", 0));
        }
        try {
            String host = new URL(str).getHost();
            if (host == null) {
                SLog.m84307e("openSDK_LOG.ServerSetting", "Get host error. url=" + str);
                return str;
            }
            String string = this.f60344b.get().getString(host, null);
            if (string != null && !host.equals(string)) {
                String strReplace = str.replace(host, string);
                SLog.m84313v("openSDK_LOG.ServerSetting", "return environment url : " + strReplace);
                return strReplace;
            }
            SLog.m84313v("openSDK_LOG.ServerSetting", "host=" + host + ", envHost=" + string);
            return str;
        } catch (Exception e) {
            SLog.m84307e("openSDK_LOG.ServerSetting", "getEnvUrl url=" + str + "error.: " + e.getMessage());
            return str;
        }
    }

    /* JADX INFO: renamed from: a */
    public static synchronized C14393k m84426a() {
        try {
            if (f60343a == null) {
                f60343a = new C14393k();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f60343a;
    }
}
