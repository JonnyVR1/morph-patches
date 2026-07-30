package com.xiaomi.push.service;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.provider.Settings;
import io.agora.base.internal.voiceengine.earmonitor.HardwareEarMonitorUtils;
import p149l.gxq0;

/* JADX INFO: renamed from: com.xiaomi.push.service.ap */
/* JADX INFO: loaded from: classes2.dex */
public class C14845ap {

    /* JADX INFO: renamed from: a */
    private static C14845ap f62964a;

    /* JADX INFO: renamed from: a */
    private int f62965a = 0;

    /* JADX INFO: renamed from: a */
    private Context f62966a;

    private C14845ap(Context context) {
        this.f62966a = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: a */
    public boolean m86545a() {
        String str = gxq0.f104915a;
        return str.contains("xmsf") || str.contains(HardwareEarMonitorUtils.MANUFACTURER_XIAOMI) || str.contains("miui");
    }

    /* JADX INFO: renamed from: a */
    public static C14845ap m86542a(Context context) {
        if (f62964a == null) {
            f62964a = new C14845ap(context);
        }
        return f62964a;
    }

    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: a */
    public int m86543a() {
        int i = this.f62965a;
        if (i != 0) {
            return i;
        }
        try {
            this.f62965a = Settings.Global.getInt(this.f62966a.getContentResolver(), "device_provisioned", 0);
        } catch (Exception unused) {
        }
        return this.f62965a;
    }

    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: a */
    public Uri m86544a() {
        return Settings.Global.getUriFor("device_provisioned");
    }
}
