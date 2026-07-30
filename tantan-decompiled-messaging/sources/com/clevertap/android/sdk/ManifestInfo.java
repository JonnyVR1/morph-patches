package com.clevertap.android.sdk;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class ManifestInfo {

    /* JADX INFO: renamed from: A */
    private static String f4793A;

    /* JADX INFO: renamed from: B */
    private static String f4794B;

    /* JADX INFO: renamed from: C */
    private static String f4795C;

    /* JADX INFO: renamed from: D */
    private static String f4796D;

    /* JADX INFO: renamed from: x */
    private static ManifestInfo f4797x;

    /* JADX INFO: renamed from: y */
    private static String f4798y;

    /* JADX INFO: renamed from: z */
    private static String f4799z;

    /* JADX INFO: renamed from: a */
    private final String f4800a;

    /* JADX INFO: renamed from: b */
    private final String f4801b;

    /* JADX INFO: renamed from: c */
    private final String f4802c;

    /* JADX INFO: renamed from: d */
    private final String f4803d;

    /* JADX INFO: renamed from: e */
    private final String f4804e;

    /* JADX INFO: renamed from: f */
    private final String f4805f;

    /* JADX INFO: renamed from: g */
    private final boolean f4806g;

    /* JADX INFO: renamed from: h */
    private final boolean f4807h;

    /* JADX INFO: renamed from: i */
    private final String f4808i;

    /* JADX INFO: renamed from: j */
    private final String f4809j;

    /* JADX INFO: renamed from: k */
    private final boolean f4810k;

    /* JADX INFO: renamed from: l */
    private final boolean f4811l;

    /* JADX INFO: renamed from: m */
    private final boolean f4812m;

    /* JADX INFO: renamed from: n */
    private final String f4813n;

    /* JADX INFO: renamed from: o */
    private final String f4814o;

    /* JADX INFO: renamed from: p */
    private final boolean f4815p;

    /* JADX INFO: renamed from: q */
    private final String f4816q;

    /* JADX INFO: renamed from: r */
    private final String f4817r;

    /* JADX INFO: renamed from: s */
    private final String[] f4818s;

    /* JADX INFO: renamed from: t */
    private final int f4819t;

    /* JADX INFO: renamed from: u */
    private final String f4820u;

    /* JADX INFO: renamed from: v */
    private final String f4821v;

    /* JADX INFO: renamed from: w */
    private final String f4822w;

    private ManifestInfo(Context context) {
        Bundle bundle;
        try {
            bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (Throwable unused) {
            bundle = null;
        }
        bundle = bundle == null ? new Bundle() : bundle;
        String str = f4798y;
        this.f4800a = str == null ? m5877a(bundle, "CLEVERTAP_ACCOUNT_ID") : str;
        String str2 = f4799z;
        this.f4801b = str2 == null ? m5877a(bundle, "CLEVERTAP_TOKEN") : str2;
        String str3 = f4793A;
        this.f4802c = str3 == null ? m5877a(bundle, "CLEVERTAP_REGION") : str3;
        String str4 = f4794B;
        this.f4803d = str4 == null ? m5877a(bundle, "CLEVERTAP_PROXY_DOMAIN") : str4;
        String str5 = f4795C;
        this.f4804e = str5 == null ? m5877a(bundle, "CLEVERTAP_SPIKY_PROXY_DOMAIN") : str5;
        String str6 = f4796D;
        this.f4805f = str6 == null ? m5877a(bundle, "CLEVERTAP_HANDSHAKE_DOMAIN") : str6;
        this.f4808i = m5877a(bundle, "CLEVERTAP_NOTIFICATION_ICON");
        this.f4806g = "1".equals(m5877a(bundle, "CLEVERTAP_USE_GOOGLE_AD_ID"));
        this.f4807h = "1".equals(m5877a(bundle, "CLEVERTAP_DISABLE_APP_LAUNCHED"));
        this.f4809j = m5877a(bundle, "CLEVERTAP_INAPP_EXCLUDE");
        this.f4810k = "1".equals(m5877a(bundle, "CLEVERTAP_SSL_PINNING"));
        this.f4811l = "1".equals(m5877a(bundle, "CLEVERTAP_BACKGROUND_SYNC"));
        this.f4812m = "1".equals(m5877a(bundle, "CLEVERTAP_USE_CUSTOM_ID"));
        String strM5877a = m5877a(bundle, "FCM_SENDER_ID");
        this.f4813n = strM5877a != null ? strM5877a.replace("id:", "") : strM5877a;
        int i = 0;
        try {
            String strM5877a2 = m5877a(bundle, "CLEVERTAP_ENCRYPTION_LEVEL");
            int i2 = strM5877a2 != null ? Integer.parseInt(strM5877a2) : 0;
            if (i2 < 0 || i2 > 2) {
                Logger.m5873v("Invalid encryption level is used, defaulting to no encryption");
            } else {
                i = i2;
            }
        } catch (Throwable th) {
            Logger.m5876v("Unable to parse encryption level from the Manifest, Setting it to 0 by default", th.getCause());
        }
        this.f4819t = i;
        this.f4814o = m5877a(bundle, "CLEVERTAP_APP_PACKAGE");
        this.f4815p = "1".equals(m5877a(bundle, "CLEVERTAP_BETA"));
        this.f4816q = m5877a(bundle, "CLEVERTAP_INTENT_SERVICE");
        this.f4817r = m5877a(bundle, "CLEVERTAP_DEFAULT_CHANNEL_ID");
        this.f4818s = m5878v(bundle);
        this.f4820u = m5877a(bundle, "CLEVERTAP_PROVIDER_1");
        this.f4821v = m5877a(bundle, "CLEVERTAP_PROVIDER_2");
        this.f4822w = m5877a(bundle, "CLEVERTAP_ENCRYPTION_IN_TRANSIT");
    }

    /* JADX INFO: renamed from: a */
    private String m5877a(Bundle bundle, String str) {
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
            if (f4797x == null) {
                f4797x = new ManifestInfo(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f4797x;
    }

    /* JADX INFO: renamed from: v */
    private String[] m5878v(Bundle bundle) {
        String strM5877a = m5877a(bundle, Constants.CLEVERTAP_IDENTIFIER);
        return !TextUtils.isEmpty(strM5877a) ? strM5877a.split(Constants.SEPARATOR_COMMA) : Constants.NULL_STRING_ARRAY;
    }

    /* JADX INFO: renamed from: b */
    public boolean m5879b() {
        return this.f4815p;
    }

    /* JADX INFO: renamed from: c */
    public String m5880c() {
        return this.f4800a;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* JADX INFO: renamed from: d */
    public String m5881d() {
        Logger.m5873v("ManifestInfo: getAccountRegion called, returning region:" + this.f4802c);
        return this.f4802c;
    }

    /* JADX INFO: renamed from: e */
    public String m5882e() {
        return this.f4801b;
    }

    /* JADX INFO: renamed from: f */
    public String m5883f() {
        return this.f4817r;
    }

    /* JADX INFO: renamed from: g */
    public String m5884g() {
        return this.f4822w;
    }

    public String getIntentServiceName() {
        return this.f4816q;
    }

    /* JADX INFO: renamed from: h */
    public int m5885h() {
        return this.f4819t;
    }

    /* JADX INFO: renamed from: i */
    public String m5886i() {
        return this.f4809j;
    }

    /* JADX INFO: renamed from: j */
    public String m5887j() {
        return this.f4813n;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* JADX INFO: renamed from: k */
    public String m5888k() {
        Logger.m5873v("ManifestInfo: getHandshakeDomain called, returning handshakeDomain:" + this.f4805f);
        return this.f4805f;
    }

    /* JADX INFO: renamed from: l */
    public String m5889l() {
        return this.f4808i;
    }

    /* JADX INFO: renamed from: m */
    public String m5890m() {
        return this.f4814o;
    }

    /* JADX INFO: renamed from: n */
    public String[] m5891n() {
        return this.f4818s;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* JADX INFO: renamed from: o */
    public String m5892o() {
        Logger.m5873v("ManifestInfo: getProxyDomain called, returning proxyDomain:" + this.f4803d);
        return this.f4803d;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* JADX INFO: renamed from: p */
    public String m5893p() {
        Logger.m5873v("ManifestInfo: getSpikeyProxyDomain called, returning spikeyProxyDomain:" + this.f4804e);
        return this.f4804e;
    }

    /* JADX INFO: renamed from: q */
    public String m5894q() {
        return this.f4820u;
    }

    /* JADX INFO: renamed from: r */
    public String m5895r() {
        return this.f4821v;
    }

    /* JADX INFO: renamed from: s */
    public boolean m5896s() {
        return this.f4807h;
    }

    /* JADX INFO: renamed from: t */
    public boolean m5897t() {
        return this.f4811l;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* JADX INFO: renamed from: u */
    public boolean m5898u() {
        return this.f4810k;
    }

    /* JADX INFO: renamed from: w */
    public boolean m5899w() {
        return this.f4812m;
    }

    /* JADX INFO: renamed from: x */
    public boolean m5900x() {
        return this.f4806g;
    }
}
