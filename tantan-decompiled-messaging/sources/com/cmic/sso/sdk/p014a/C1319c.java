package com.cmic.sso.sdk.p014a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import com.cmic.sso.sdk.C1316a;
import com.cmic.sso.sdk.auth.AuthnHelper;
import com.cmic.sso.sdk.p022e.C1363c;
import com.cmic.sso.sdk.p022e.C1371k;

/* JADX INFO: renamed from: com.cmic.sso.sdk.a.c */
/* JADX INFO: loaded from: classes.dex */
public class C1319c implements C1318b.a {

    /* JADX INFO: renamed from: a */
    @SuppressLint({"StaticFieldLeak"})
    private static C1319c f5498a;

    /* JADX INFO: renamed from: b */
    private C1317a f5499b;

    /* JADX INFO: renamed from: c */
    private C1317a f5500c;

    /* JADX INFO: renamed from: d */
    private C1318b f5501d;

    /* JADX INFO: renamed from: e */
    private Context f5502e;

    private C1319c(Context context) {
        this.f5502e = context;
        m7032b();
    }

    /* JADX INFO: renamed from: a */
    public static C1319c m7031a(Context context) {
        if (f5498a == null) {
            synchronized (C1319c.class) {
                try {
                    if (f5498a == null) {
                        f5498a = new C1319c(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f5498a;
    }

    /* JADX INFO: renamed from: b */
    private void m7032b() {
        String strM7281b = C1371k.m7281b("sdk_config_version", "");
        if (TextUtils.isEmpty(strM7281b) || !AuthnHelper.SDK_VERSION.equals(strM7281b)) {
            C1318b c1318bM7012a = C1318b.m7012a(true);
            this.f5501d = c1318bM7012a;
            this.f5499b = c1318bM7012a.m7023a();
            if (!TextUtils.isEmpty(strM7281b)) {
                m7033c();
            }
        } else {
            C1318b c1318bM7012a2 = C1318b.m7012a(false);
            this.f5501d = c1318bM7012a2;
            this.f5499b = c1318bM7012a2.m7026b();
        }
        this.f5501d.m7024a(this);
        this.f5500c = this.f5501d.m7023a();
    }

    /* JADX INFO: renamed from: c */
    private void m7033c() {
        C1363c.m7234b("UmcConfigManager", "delete localConfig");
        this.f5501d.m7027c();
    }

    /* JADX INFO: renamed from: a */
    public C1317a m7034a() {
        try {
            return this.f5499b.clone();
        } catch (CloneNotSupportedException unused) {
            return this.f5500c;
        }
    }

    @Override // com.cmic.sso.sdk.p014a.C1318b.a
    /* JADX INFO: renamed from: a */
    public void mo7030a(C1317a c1317a) {
        this.f5499b = c1317a;
    }

    /* JADX INFO: renamed from: a */
    public void m7035a(C1316a c1316a) {
        this.f5501d.m7025a(c1316a);
    }
}
