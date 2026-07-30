package com.clevertap.android.sdk;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class ManifestInfo {

    /* JADX INFO: renamed from: A */
    private static String f4830A;

    /* JADX INFO: renamed from: B */
    private static String f4831B;

    /* JADX INFO: renamed from: C */
    private static String f4832C;

    /* JADX INFO: renamed from: D */
    private static String f4833D;

    /* JADX INFO: renamed from: x */
    private static ManifestInfo f4834x;

    /* JADX INFO: renamed from: y */
    private static String f4835y;

    /* JADX INFO: renamed from: z */
    private static String f4836z;

    /* JADX INFO: renamed from: a */
    private final String f4837a;

    /* JADX INFO: renamed from: b */
    private final String f4838b;

    /* JADX INFO: renamed from: c */
    private final String f4839c;

    /* JADX INFO: renamed from: d */
    private final String f4840d;

    /* JADX INFO: renamed from: e */
    private final String f4841e;

    /* JADX INFO: renamed from: f */
    private final String f4842f;

    /* JADX INFO: renamed from: g */
    private final boolean f4843g;

    /* JADX INFO: renamed from: h */
    private final boolean f4844h;

    /* JADX INFO: renamed from: i */
    private final String f4845i;

    /* JADX INFO: renamed from: j */
    private final String f4846j;

    /* JADX INFO: renamed from: k */
    private final boolean f4847k;

    /* JADX INFO: renamed from: l */
    private final boolean f4848l;

    /* JADX INFO: renamed from: m */
    private final boolean f4849m;

    /* JADX INFO: renamed from: n */
    private final String f4850n;

    /* JADX INFO: renamed from: o */
    private final String f4851o;

    /* JADX INFO: renamed from: p */
    private final boolean f4852p;

    /* JADX INFO: renamed from: q */
    private final String f4853q;

    /* JADX INFO: renamed from: r */
    private final String f4854r;

    /* JADX INFO: renamed from: s */
    private final String[] f4855s;

    /* JADX INFO: renamed from: t */
    private final int f4856t;

    /* JADX INFO: renamed from: u */
    private final String f4857u;

    /* JADX INFO: renamed from: v */
    private final String f4858v;

    /* JADX INFO: renamed from: w */
    private final String f4859w;

    private ManifestInfo(Context context) {
        Bundle bundle;
        try {
            bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (Throwable unused) {
            bundle = null;
        }
        bundle = bundle == null ? new Bundle() : bundle;
        String str = f4835y;
        this.f4837a = str == null ? m5931a(bundle, "CLEVERTAP_ACCOUNT_ID") : str;
        String str2 = f4836z;
        this.f4838b = str2 == null ? m5931a(bundle, "CLEVERTAP_TOKEN") : str2;
        String str3 = f4830A;
        this.f4839c = str3 == null ? m5931a(bundle, "CLEVERTAP_REGION") : str3;
        String str4 = f4831B;
        this.f4840d = str4 == null ? m5931a(bundle, "CLEVERTAP_PROXY_DOMAIN") : str4;
        String str5 = f4832C;
        this.f4841e = str5 == null ? m5931a(bundle, "CLEVERTAP_SPIKY_PROXY_DOMAIN") : str5;
        String str6 = f4833D;
        this.f4842f = str6 == null ? m5931a(bundle, "CLEVERTAP_HANDSHAKE_DOMAIN") : str6;
        this.f4845i = m5931a(bundle, "CLEVERTAP_NOTIFICATION_ICON");
        this.f4843g = "1".equals(m5931a(bundle, "CLEVERTAP_USE_GOOGLE_AD_ID"));
        this.f4844h = "1".equals(m5931a(bundle, "CLEVERTAP_DISABLE_APP_LAUNCHED"));
        this.f4846j = m5931a(bundle, "CLEVERTAP_INAPP_EXCLUDE");
        this.f4847k = "1".equals(m5931a(bundle, "CLEVERTAP_SSL_PINNING"));
        this.f4848l = "1".equals(m5931a(bundle, "CLEVERTAP_BACKGROUND_SYNC"));
        this.f4849m = "1".equals(m5931a(bundle, "CLEVERTAP_USE_CUSTOM_ID"));
        String strM5931a = m5931a(bundle, "FCM_SENDER_ID");
        this.f4850n = strM5931a != null ? strM5931a.replace("id:", "") : strM5931a;
        int i = 0;
        try {
            String strM5931a2 = m5931a(bundle, "CLEVERTAP_ENCRYPTION_LEVEL");
            int i2 = strM5931a2 != null ? Integer.parseInt(strM5931a2) : 0;
            if (i2 < 0 || i2 > 2) {
                Logger.m5927v("Invalid encryption level is used, defaulting to no encryption");
            } else {
                i = i2;
            }
        } catch (Throwable th) {
            Logger.m5930v("Unable to parse encryption level from the Manifest, Setting it to 0 by default", th.getCause());
        }
        this.f4856t = i;
        this.f4851o = m5931a(bundle, "CLEVERTAP_APP_PACKAGE");
        this.f4852p = "1".equals(m5931a(bundle, "CLEVERTAP_BETA"));
        this.f4853q = m5931a(bundle, "CLEVERTAP_INTENT_SERVICE");
        this.f4854r = m5931a(bundle, "CLEVERTAP_DEFAULT_CHANNEL_ID");
        this.f4855s = m5932v(bundle);
        this.f4857u = m5931a(bundle, "CLEVERTAP_PROVIDER_1");
        this.f4858v = m5931a(bundle, "CLEVERTAP_PROVIDER_2");
        this.f4859w = m5931a(bundle, "CLEVERTAP_ENCRYPTION_IN_TRANSIT");
    }

    /* JADX INFO: renamed from: a */
    private String m5931a(Bundle bundle, String str) {
        try {
            Object obj = bundle.get(str);
            if (obj != null) {
                return obj.toString();
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static synchronized ManifestInfo getInstance(Context context) {
        try {
            if (f4834x == null) {
                f4834x = new ManifestInfo(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f4834x;
    }

    /* JADX INFO: renamed from: v */
    private String[] m5932v(Bundle bundle) {
        String strM5931a = m5931a(bundle, Constants.CLEVERTAP_IDENTIFIER);
        return !TextUtils.isEmpty(strM5931a) ? strM5931a.split(Constants.SEPARATOR_COMMA) : Constants.NULL_STRING_ARRAY;
    }

    /* JADX INFO: renamed from: b */
    public boolean m5933b() {
        return this.f4852p;
    }

    /* JADX INFO: renamed from: c */
    public String m5934c() {
        return this.f4837a;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* JADX INFO: renamed from: d */
    public String m5935d() {
        Logger.m5927v("ManifestInfo: getAccountRegion called, returning region:" + this.f4839c);
        return this.f4839c;
    }

    /* JADX INFO: renamed from: e */
    public String m5936e() {
        return this.f4838b;
    }

    /* JADX INFO: renamed from: f */
    public String m5937f() {
        return this.f4854r;
    }

    /* JADX INFO: renamed from: g */
    public String m5938g() {
        return this.f4859w;
    }

    public String getIntentServiceName() {
        return this.f4853q;
    }

    /* JADX INFO: renamed from: h */
    public int m5939h() {
        return this.f4856t;
    }

    /* JADX INFO: renamed from: i */
    public String m5940i() {
        return this.f4846j;
    }

    /* JADX INFO: renamed from: j */
    public String m5941j() {
        return this.f4850n;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* JADX INFO: renamed from: k */
    public String m5942k() {
        Logger.m5927v("ManifestInfo: getHandshakeDomain called, returning handshakeDomain:" + this.f4842f);
        return this.f4842f;
    }

    /* JADX INFO: renamed from: l */
    public String m5943l() {
        return this.f4845i;
    }

    /* JADX INFO: renamed from: m */
    public String m5944m() {
        return this.f4851o;
    }

    /* JADX INFO: renamed from: n */
    public String[] m5945n() {
        return this.f4855s;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* JADX INFO: renamed from: o */
    public String m5946o() {
        Logger.m5927v("ManifestInfo: getProxyDomain called, returning proxyDomain:" + this.f4840d);
        return this.f4840d;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* JADX INFO: renamed from: p */
    public String m5947p() {
        Logger.m5927v("ManifestInfo: getSpikeyProxyDomain called, returning spikeyProxyDomain:" + this.f4841e);
        return this.f4841e;
    }

    /* JADX INFO: renamed from: q */
    public String m5948q() {
        return this.f4857u;
    }

    /* JADX INFO: renamed from: r */
    public String m5949r() {
        return this.f4858v;
    }

    /* JADX INFO: renamed from: s */
    public boolean m5950s() {
        return this.f4844h;
    }

    /* JADX INFO: renamed from: t */
    public boolean m5951t() {
        return this.f4848l;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* JADX INFO: renamed from: u */
    public boolean m5952u() {
        return this.f4847k;
    }

    /* JADX INFO: renamed from: w */
    public boolean m5953w() {
        return this.f4849m;
    }

    /* JADX INFO: renamed from: x */
    public boolean m5954x() {
        return this.f4843g;
    }
}
