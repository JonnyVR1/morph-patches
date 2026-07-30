package com.tencent.cloud.p075ai.network.okhttp3;

import com.tencent.cloud.p075ai.network.okhttp3.C13701g;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.g */
/* JADX INFO: loaded from: classes13.dex */
public final class C13701g {

    /* JADX INFO: renamed from: b */
    public static final Comparator<String> f56433b = new Comparator() { // from class: l.ltq0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return C13701g.m81594a((String) obj, (String) obj2);
        }
    };

    /* JADX INFO: renamed from: c */
    public static final Map<String, C13701g> f56434c = new LinkedHashMap();

    /* JADX INFO: renamed from: d */
    public static final C13701g f56435d;

    /* JADX INFO: renamed from: e */
    public static final C13701g f56436e;

    /* JADX INFO: renamed from: f */
    public static final C13701g f56437f;

    /* JADX INFO: renamed from: g */
    public static final C13701g f56438g;

    /* JADX INFO: renamed from: h */
    public static final C13701g f56439h;

    /* JADX INFO: renamed from: i */
    public static final C13701g f56440i;

    /* JADX INFO: renamed from: j */
    public static final C13701g f56441j;

    /* JADX INFO: renamed from: k */
    public static final C13701g f56442k;

    /* JADX INFO: renamed from: l */
    public static final C13701g f56443l;

    /* JADX INFO: renamed from: m */
    public static final C13701g f56444m;

    /* JADX INFO: renamed from: n */
    public static final C13701g f56445n;

    /* JADX INFO: renamed from: o */
    public static final C13701g f56446o;

    /* JADX INFO: renamed from: p */
    public static final C13701g f56447p;

    /* JADX INFO: renamed from: q */
    public static final C13701g f56448q;

    /* JADX INFO: renamed from: r */
    public static final C13701g f56449r;

    /* JADX INFO: renamed from: s */
    public static final C13701g f56450s;

    /* JADX INFO: renamed from: a */
    public final String f56451a;

    static {
        m81596b("SSL_RSA_WITH_NULL_MD5");
        m81596b("SSL_RSA_WITH_NULL_SHA");
        m81596b("SSL_RSA_EXPORT_WITH_RC4_40_MD5");
        m81596b("SSL_RSA_WITH_RC4_128_MD5");
        m81596b("SSL_RSA_WITH_RC4_128_SHA");
        m81596b("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA");
        m81596b("SSL_RSA_WITH_DES_CBC_SHA");
        f56435d = m81596b("SSL_RSA_WITH_3DES_EDE_CBC_SHA");
        m81596b("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA");
        m81596b("SSL_DHE_DSS_WITH_DES_CBC_SHA");
        m81596b("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA");
        m81596b("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA");
        m81596b("SSL_DHE_RSA_WITH_DES_CBC_SHA");
        m81596b("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA");
        m81596b("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5");
        m81596b("SSL_DH_anon_WITH_RC4_128_MD5");
        m81596b("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA");
        m81596b("SSL_DH_anon_WITH_DES_CBC_SHA");
        m81596b("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA");
        m81596b("TLS_KRB5_WITH_DES_CBC_SHA");
        m81596b("TLS_KRB5_WITH_3DES_EDE_CBC_SHA");
        m81596b("TLS_KRB5_WITH_RC4_128_SHA");
        m81596b("TLS_KRB5_WITH_DES_CBC_MD5");
        m81596b("TLS_KRB5_WITH_3DES_EDE_CBC_MD5");
        m81596b("TLS_KRB5_WITH_RC4_128_MD5");
        m81596b("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA");
        m81596b("TLS_KRB5_EXPORT_WITH_RC4_40_SHA");
        m81596b("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5");
        m81596b("TLS_KRB5_EXPORT_WITH_RC4_40_MD5");
        f56436e = m81596b("TLS_RSA_WITH_AES_128_CBC_SHA");
        m81596b("TLS_DHE_DSS_WITH_AES_128_CBC_SHA");
        m81596b("TLS_DHE_RSA_WITH_AES_128_CBC_SHA");
        m81596b("TLS_DH_anon_WITH_AES_128_CBC_SHA");
        f56437f = m81596b("TLS_RSA_WITH_AES_256_CBC_SHA");
        m81596b("TLS_DHE_DSS_WITH_AES_256_CBC_SHA");
        m81596b("TLS_DHE_RSA_WITH_AES_256_CBC_SHA");
        m81596b("TLS_DH_anon_WITH_AES_256_CBC_SHA");
        m81596b("TLS_RSA_WITH_NULL_SHA256");
        m81596b("TLS_RSA_WITH_AES_128_CBC_SHA256");
        m81596b("TLS_RSA_WITH_AES_256_CBC_SHA256");
        m81596b("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256");
        m81596b("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA");
        m81596b("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA");
        m81596b("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA");
        m81596b("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256");
        m81596b("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256");
        m81596b("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256");
        m81596b("TLS_DH_anon_WITH_AES_128_CBC_SHA256");
        m81596b("TLS_DH_anon_WITH_AES_256_CBC_SHA256");
        m81596b("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA");
        m81596b("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA");
        m81596b("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA");
        m81596b("TLS_PSK_WITH_RC4_128_SHA");
        m81596b("TLS_PSK_WITH_3DES_EDE_CBC_SHA");
        m81596b("TLS_PSK_WITH_AES_128_CBC_SHA");
        m81596b("TLS_PSK_WITH_AES_256_CBC_SHA");
        m81596b("TLS_RSA_WITH_SEED_CBC_SHA");
        f56438g = m81596b("TLS_RSA_WITH_AES_128_GCM_SHA256");
        f56439h = m81596b("TLS_RSA_WITH_AES_256_GCM_SHA384");
        m81596b("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256");
        m81596b("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384");
        m81596b("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256");
        m81596b("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384");
        m81596b("TLS_DH_anon_WITH_AES_128_GCM_SHA256");
        m81596b("TLS_DH_anon_WITH_AES_256_GCM_SHA384");
        m81596b("TLS_EMPTY_RENEGOTIATION_INFO_SCSV");
        m81596b("TLS_FALLBACK_SCSV");
        m81596b("TLS_ECDH_ECDSA_WITH_NULL_SHA");
        m81596b("TLS_ECDH_ECDSA_WITH_RC4_128_SHA");
        m81596b("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA");
        m81596b("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA");
        m81596b("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA");
        m81596b("TLS_ECDHE_ECDSA_WITH_NULL_SHA");
        m81596b("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA");
        m81596b("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA");
        m81596b("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA");
        m81596b("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA");
        m81596b("TLS_ECDH_RSA_WITH_NULL_SHA");
        m81596b("TLS_ECDH_RSA_WITH_RC4_128_SHA");
        m81596b("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA");
        m81596b("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA");
        m81596b("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA");
        m81596b("TLS_ECDHE_RSA_WITH_NULL_SHA");
        m81596b("TLS_ECDHE_RSA_WITH_RC4_128_SHA");
        m81596b("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA");
        f56440i = m81596b("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA");
        f56441j = m81596b("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA");
        m81596b("TLS_ECDH_anon_WITH_NULL_SHA");
        m81596b("TLS_ECDH_anon_WITH_RC4_128_SHA");
        m81596b("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA");
        m81596b("TLS_ECDH_anon_WITH_AES_128_CBC_SHA");
        m81596b("TLS_ECDH_anon_WITH_AES_256_CBC_SHA");
        m81596b("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256");
        m81596b("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384");
        m81596b("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256");
        m81596b("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384");
        m81596b("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256");
        m81596b("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384");
        m81596b("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256");
        m81596b("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384");
        f56442k = m81596b("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256");
        f56443l = m81596b("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384");
        m81596b("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256");
        m81596b("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384");
        f56444m = m81596b("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256");
        f56445n = m81596b("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384");
        m81596b("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256");
        m81596b("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384");
        m81596b("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA");
        m81596b("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA");
        f56446o = m81596b("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
        f56447p = m81596b("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256");
        m81596b("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
        m81596b("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256");
        f56448q = m81596b("TLS_AES_128_GCM_SHA256");
        f56449r = m81596b("TLS_AES_256_GCM_SHA384");
        f56450s = m81596b("TLS_CHACHA20_POLY1305_SHA256");
        m81596b("TLS_AES_128_CCM_SHA256");
        m81596b("TLS_AES_128_CCM_8_SHA256");
    }

    public C13701g(String str) {
        str.getClass();
        this.f56451a = str;
    }

    /* JADX INFO: renamed from: a */
    public static synchronized C13701g m81595a(String str) {
        C13701g c13701g;
        String strConcat;
        try {
            Map<String, C13701g> map = f56434c;
            c13701g = map.get(str);
            if (c13701g == null) {
                if (str.startsWith("TLS_")) {
                    strConcat = "SSL_".concat(str.substring(4));
                } else {
                    strConcat = str.startsWith("SSL_") ? "TLS_".concat(str.substring(4)) : str;
                }
                C13701g c13701g2 = map.get(strConcat);
                if (c13701g2 == null) {
                    c13701g2 = new C13701g(str);
                }
                c13701g = c13701g2;
                map.put(str, c13701g);
            }
        } catch (Throwable th) {
            throw th;
        }
        return c13701g;
    }

    /* JADX INFO: renamed from: b */
    public static C13701g m81596b(String str) {
        C13701g c13701g = new C13701g(str);
        f56434c.put(str, c13701g);
        return c13701g;
    }

    public String toString() {
        return this.f56451a;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ int m81594a(String str, String str2) {
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
