package com.xiaomi.push.service;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.provider.Settings;
import io.agora.base.internal.voiceengine.earmonitor.HardwareEarMonitorUtils;
import p153l.m6r0;

/* JADX INFO: renamed from: com.xiaomi.push.service.ap */
/* JADX INFO: loaded from: classes2.dex */
public class C14993ap {

    /* JADX INFO: renamed from: a */
    private static C14993ap f63811a;

    /* JADX INFO: renamed from: a */
    private int f63812a = 0;

    /* JADX INFO: renamed from: a */
    private Context f63813a;

    private C14993ap(Context context) {
        this.f63813a = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: a */
    public boolean m87716a() {
        String str = m6r0.f135024a;
        return str.contains("xmsf") || str.contains(HardwareEarMonitorUtils.MANUFACTURER_XIAOMI) || str.contains("miui");
    }

    /* JADX INFO: renamed from: a */
    public static C14993ap m87713a(Context context) {
        if (f63811a == null) {
            f63811a = new C14993ap(context);
        }
        return f63811a;
    }

    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: a */
    public int m87714a() {
        int i = this.f63812a;
        if (i != 0) {
            return i;
        }
        try {
            this.f63812a = Settings.Global.getInt(this.f63813a.getContentResolver(), "device_provisioned", 0);
        } catch (Exception unused) {
        }
        return this.f63812a;
    }

    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: a */
    public Uri m87715a() {
        return Settings.Global.getUriFor("device_provisioned");
    }
}
