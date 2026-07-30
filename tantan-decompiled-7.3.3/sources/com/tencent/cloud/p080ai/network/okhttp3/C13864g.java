package com.tencent.cloud.p080ai.network.okhttp3;

import com.tencent.cloud.p080ai.network.okhttp3.C13864g;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.g */
/* JADX INFO: loaded from: classes12.dex */
public final class C13864g {

    /* JADX INFO: renamed from: b */
    public static final Comparator<String> f57281b = new Comparator() { // from class: l.r2r0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return C13864g.m82777a((String) obj, (String) obj2);
        }
    };

    /* JADX INFO: renamed from: c */
    public static final Map<String, C13864g> f57282c = new LinkedHashMap();

    /* JADX INFO: renamed from: d */
    public static final C13864g f57283d;

    /* JADX INFO: renamed from: e */
    public static final C13864g f57284e;

    /* JADX INFO: renamed from: f */
    public static final C13864g f57285f;

    /* JADX INFO: renamed from: g */
    public static final C13864g f57286g;

    /* JADX INFO: renamed from: h */
    public static final C13864g f57287h;

    /* JADX INFO: renamed from: i */
    public static final C13864g f57288i;

    /* JADX INFO: renamed from: j */
    public static final C13864g f57289j;

    /* JADX INFO: renamed from: k */
    public static final C13864g f57290k;

    /* JADX INFO: renamed from: l */
    public static final C13864g f57291l;

    /* JADX INFO: renamed from: m */
    public static final C13864g f57292m;

    /* JADX INFO: renamed from: n */
    public static final C13864g f57293n;

    /* JADX INFO: renamed from: o */
    public static final C13864g f57294o;

    /* JADX INFO: renamed from: p */
    public static final C13864g f57295p;

    /* JADX INFO: renamed from: q */
    public static final C13864g f57296q;

    /* JADX INFO: renamed from: r */
    public static final C13864g f57297r;

    /* JADX INFO: renamed from: s */
    public static final C13864g f57298s;

    /* JADX INFO: renamed from: a */
    public final String f57299a;

    static {
        m82779b("SSL_RSA_WITH_NULL_MD5");
        m82779b("SSL_RSA_WITH_NULL_SHA");
        m82779b("SSL_RSA_EXPORT_WITH_RC4_40_MD5");
        m82779b("SSL_RSA_WITH_RC4_128_MD5");
        m82779b("SSL_RSA_WITH_RC4_128_SHA");
        m82779b("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA");
        m82779b("SSL_RSA_WITH_DES_CBC_SHA");
        f57283d = m82779b("SSL_RSA_WITH_3DES_EDE_CBC_SHA");
        m82779b("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA");
        m82779b("SSL_DHE_DSS_WITH_DES_CBC_SHA");
        m82779b("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA");
        m82779b("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA");
        m82779b("SSL_DHE_RSA_WITH_DES_CBC_SHA");
        m82779b("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA");
        m82779b("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5");
        m82779b("SSL_DH_anon_WITH_RC4_128_MD5");
        m82779b("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA");
        m82779b("SSL_DH_anon_WITH_DES_CBC_SHA");
        m82779b("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA");
        m82779b("TLS_KRB5_WITH_DES_CBC_SHA");
        m82779b("TLS_KRB5_WITH_3DES_EDE_CBC_SHA");
        m82779b("TLS_KRB5_WITH_RC4_128_SHA");
        m82779b("TLS_KRB5_WITH_DES_CBC_MD5");
        m82779b("TLS_KRB5_WITH_3DES_EDE_CBC_MD5");
        m82779b("TLS_KRB5_WITH_RC4_128_MD5");
        m82779b("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA");
        m82779b("TLS_KRB5_EXPORT_WITH_RC4_40_SHA");
        m82779b("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5");
        m82779b("TLS_KRB5_EXPORT_WITH_RC4_40_MD5");
        f57284e = m82779b("TLS_RSA_WITH_AES_128_CBC_SHA");
        m82779b("TLS_DHE_DSS_WITH_AES_128_CBC_SHA");
        m82779b("TLS_DHE_RSA_WITH_AES_128_CBC_SHA");
        m82779b("TLS_DH_anon_WITH_AES_128_CBC_SHA");
        f57285f = m82779b("TLS_RSA_WITH_AES_256_CBC_SHA");
        m82779b("TLS_DHE_DSS_WITH_AES_256_CBC_SHA");
        m82779b("TLS_DHE_RSA_WITH_AES_256_CBC_SHA");
        m82779b("TLS_DH_anon_WITH_AES_256_CBC_SHA");
        m82779b("TLS_RSA_WITH_NULL_SHA256");
        m82779b("TLS_RSA_WITH_AES_128_CBC_SHA256");
        m82779b("TLS_RSA_WITH_AES_256_CBC_SHA256");
        m82779b("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256");
        m82779b("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA");
        m82779b("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA");
        m82779b("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA");
        m82779b("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256");
        m82779b("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256");
        m82779b("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256");
        m82779b("TLS_DH_anon_WITH_AES_128_CBC_SHA256");
        m82779b("TLS_DH_anon_WITH_AES_256_CBC_SHA256");
        m82779b("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA");
        m82779b("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA");
        m82779b("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA");
        m82779b("TLS_PSK_WITH_RC4_128_SHA");
        m82779b("TLS_PSK_WITH_3DES_EDE_CBC_SHA");
        m82779b("TLS_PSK_WITH_AES_128_CBC_SHA");
        m82779b("TLS_PSK_WITH_AES_256_CBC_SHA");
        m82779b("TLS_RSA_WITH_SEED_CBC_SHA");
        f57286g = m82779b("TLS_RSA_WITH_AES_128_GCM_SHA256");
        f57287h = m82779b("TLS_RSA_WITH_AES_256_GCM_SHA384");
        m82779b("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256");
        m82779b("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384");
        m82779b("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256");
        m82779b("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384");
        m82779b("TLS_DH_anon_WITH_AES_128_GCM_SHA256");
        m82779b("TLS_DH_anon_WITH_AES_256_GCM_SHA384");
        m82779b("TLS_EMPTY_RENEGOTIATION_INFO_SCSV");
        m82779b("TLS_FALLBACK_SCSV");
        m82779b("TLS_ECDH_ECDSA_WITH_NULL_SHA");
        m82779b("TLS_ECDH_ECDSA_WITH_RC4_128_SHA");
        m82779b("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA");
        m82779b("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA");
        m82779b("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA");
        m82779b("TLS_ECDHE_ECDSA_WITH_NULL_SHA");
        m82779b("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA");
        m82779b("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA");
        m82779b("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA");
        m82779b("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA");
        m82779b("TLS_ECDH_RSA_WITH_NULL_SHA");
        m82779b("TLS_ECDH_RSA_WITH_RC4_128_SHA");
        m82779b("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA");
        m82779b("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA");
        m82779b("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA");
        m82779b("TLS_ECDHE_RSA_WITH_NULL_SHA");
        m82779b("TLS_ECDHE_RSA_WITH_RC4_128_SHA");
        m82779b("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA");
        f57288i = m82779b("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA");
        f57289j = m82779b("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA");
        m82779b("TLS_ECDH_anon_WITH_NULL_SHA");
        m82779b("TLS_ECDH_anon_WITH_RC4_128_SHA");
        m82779b("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA");
        m82779b("TLS_ECDH_anon_WITH_AES_128_CBC_SHA");
        m82779b("TLS_ECDH_anon_WITH_AES_256_CBC_SHA");
        m82779b("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256");
        m82779b("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384");
        m82779b("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256");
        m82779b("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384");
        m82779b("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256");
        m82779b("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384");
        m82779b("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256");
        m82779b("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384");
        f57290k = m82779b("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256");
        f57291l = m82779b("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384");
        m82779b("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256");
        m82779b("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384");
        f57292m = m82779b("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256");
        f57293n = m82779b("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384");
        m82779b("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256");
        m82779b("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384");
        m82779b("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA");
        m82779b("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA");
        f57294o = m82779b("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
        f57295p = m82779b("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256");
        m82779b("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
        m82779b("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256");
        f57296q = m82779b("TLS_AES_128_GCM_SHA256");
        f57297r = m82779b("TLS_AES_256_GCM_SHA384");
        f57298s = m82779b("TLS_CHACHA20_POLY1305_SHA256");
        m82779b("TLS_AES_128_CCM_SHA256");
        m82779b("TLS_AES_128_CCM_8_SHA256");
    }

    public C13864g(String str) {
        str.getClass();
        this.f57299a = str;
    }

    /* JADX INFO: renamed from: a */
    public static synchronized C13864g m82778a(String str) {
        C13864g c13864g;
        String strConcat;
        try {
            Map<String, C13864g> map = f57282c;
            c13864g = map.get(str);
            if (c13864g == null) {
                if (str.startsWith("TLS_")) {
                    strConcat = "SSL_".concat(str.substring(4));
                } else {
                    strConcat = str.startsWith("SSL_") ? "TLS_".concat(str.substring(4)) : str;
                }
                C13864g c13864g2 = map.get(strConcat);
                if (c13864g2 == null) {
                    c13864g2 = new C13864g(str);
                }
                c13864g = c13864g2;
                map.put(str, c13864g);
            }
        } catch (Throwable th) {
            throw th;
        }
        return c13864g;
    }

    /* JADX INFO: renamed from: b */
    public static C13864g m82779b(String str) {
        C13864g c13864g = new C13864g(str);
        f57282c.put(str, c13864g);
        return c13864g;
    }

    public String toString() {
        return this.f57299a;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ int m82777a(String str, String str2) {
        int iMin = Math.min(str.length(), str2.length());
        for (int i = 4; i < iMin; i++) {
            char cCharAt = str.charAt(i);
            char cCharAt2 = str2.charAt(i);
            if (cCharAt != cCharAt2) {
                return cCharAt < cCharAt2 ? -1 : 1;
            }
        }
        int length = str.length();
        int length2 = str2.length();
        if (length != length2) {
            return length < length2 ? -1 : 1;
        }
        return 0;
    }
}
