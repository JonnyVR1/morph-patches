package com.tencent.open.utils;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.open.log.SLog;
import java.lang.ref.WeakReference;
import java.net.URL;

/* JADX INFO: renamed from: com.tencent.open.utils.k */
/* JADX INFO: loaded from: classes2.dex */
public class C14556k {

    /* JADX INFO: renamed from: a */
    private static C14556k f61191a;

    /* JADX INFO: renamed from: b */
    private volatile WeakReference<SharedPreferences> f61192b = null;

    /* JADX INFO: renamed from: a */
    public String m85610a(Context context, String str) {
        if (this.f61192b == null || this.f61192b.get() == null) {
            this.f61192b = new WeakReference<>(context.getSharedPreferences("ServerPrefs", 0));
        }
        try {
            String host = new URL(str).getHost();
            if (host == null) {
                SLog.m85490e("openSDK_LOG.ServerSetting", "Get host error. url=" + str);
                return str;
            }
            String string = this.f61192b.get().getString(host, null);
            if (string != null && !host.equals(string)) {
                String strReplace = str.replace(host, string);
                SLog.m85496v("openSDK_LOG.ServerSetting", "return environment url : " + strReplace);
                return strReplace;
            }
            SLog.m85496v("openSDK_LOG.ServerSetting", "host=" + host + ", envHost=" + string);
            return str;
        } catch (Exception e) {
            SLog.m85490e("openSDK_LOG.ServerSetting", "getEnvUrl url=" + str + "error.: " + e.getMessage());
            return str;
        }
    }

    /* JADX INFO: renamed from: a */
    public static synchronized C14556k m85609a() {
        try {
            if (f61191a == null) {
                f61191a = new C14556k();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f61191a;
    }
}
