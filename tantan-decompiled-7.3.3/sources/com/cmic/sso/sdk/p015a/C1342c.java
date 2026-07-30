package com.cmic.sso.sdk.p015a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import com.cmic.sso.sdk.C1339a;
import com.cmic.sso.sdk.auth.AuthnHelper;
import com.cmic.sso.sdk.p023e.C1386c;
import com.cmic.sso.sdk.p023e.C1394k;

/* JADX INFO: renamed from: com.cmic.sso.sdk.a.c */
/* JADX INFO: loaded from: classes.dex */
public class C1342c implements C1341b.a {

    /* JADX INFO: renamed from: a */
    @SuppressLint({"StaticFieldLeak"})
    private static C1342c f5535a;

    /* JADX INFO: renamed from: b */
    private C1340a f5536b;

    /* JADX INFO: renamed from: c */
    private C1340a f5537c;

    /* JADX INFO: renamed from: d */
    private C1341b f5538d;

    /* JADX INFO: renamed from: e */
    private Context f5539e;

    private C1342c(Context context) {
        this.f5539e = context;
        m7086b();
    }

    /* JADX INFO: renamed from: a */
    public static C1342c m7085a(Context context) {
        if (f5535a == null) {
            synchronized (C1342c.class) {
                try {
                    if (f5535a == null) {
                        f5535a = new C1342c(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f5535a;
    }

    /* JADX INFO: renamed from: b */
    private void m7086b() {
        String strM7335b = C1394k.m7335b("sdk_config_version", "");
        if (TextUtils.isEmpty(strM7335b) || !AuthnHelper.SDK_VERSION.equals(strM7335b)) {
            C1341b c1341bM7066a = C1341b.m7066a(true);
            this.f5538d = c1341bM7066a;
            this.f5536b = c1341bM7066a.m7077a();
            if (!TextUtils.isEmpty(strM7335b)) {
                m7087c();
            }
        } else {
            C1341b c1341bM7066a2 = C1341b.m7066a(false);
            this.f5538d = c1341bM7066a2;
            this.f5536b = c1341bM7066a2.m7080b();
        }
        this.f5538d.m7078a(this);
        this.f5537c = this.f5538d.m7077a();
    }

    /* JADX INFO: renamed from: c */
    private void m7087c() {
        C1386c.m7288b("UmcConfigManager", "delete localConfig");
        this.f5538d.m7081c();
    }

    /* JADX INFO: renamed from: a */
    public C1340a m7088a() {
        try {
            return this.f5536b.clone();
        } catch (CloneNotSupportedException unused) {
            return this.f5537c;
        }
    }

    @Override // com.cmic.sso.sdk.p015a.C1341b.a
    /* JADX INFO: renamed from: a */
    public void mo7084a(C1340a c1340a) {
        this.f5536b = c1340a;
    }

    /* JADX INFO: renamed from: a */
    public void m7089a(C1339a c1339a) {
        this.f5538d.m7079a(c1339a);
    }
}
