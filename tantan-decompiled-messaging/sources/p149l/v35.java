package p149l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes2.dex */
public final class v35 {

    /* JADX INFO: renamed from: a */
    public final String f179746a;

    /* JADX INFO: renamed from: b */
    public static final Comparator<String> f179679b = new Comparator() { // from class: l.u35
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return v35.m196825a((String) obj, (String) obj2);
        }
    };

    /* JADX INFO: renamed from: c */
    public static final Map<String, v35> f179682c = new LinkedHashMap();

    /* JADX INFO: renamed from: d */
    public static final v35 f179685d = m196828d("SSL_RSA_WITH_NULL_MD5", 1);

    /* JADX INFO: renamed from: e */
    public static final v35 f179688e = m196828d("SSL_RSA_WITH_NULL_SHA", 2);

    /* JADX INFO: renamed from: f */
    public static final v35 f179691f = m196828d("SSL_RSA_EXPORT_WITH_RC4_40_MD5", 3);

    /* JADX INFO: renamed from: g */
    public static final v35 f179694g = m196828d("SSL_RSA_WITH_RC4_128_MD5", 4);

    /* JADX INFO: renamed from: h */
    public static final v35 f179697h = m196828d("SSL_RSA_WITH_RC4_128_SHA", 5);

    /* JADX INFO: renamed from: i */
    public static final v35 f179700i = m196828d("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", 8);

    /* JADX INFO: renamed from: j */
    public static final v35 f179703j = m196828d("SSL_RSA_WITH_DES_CBC_SHA", 9);

    /* JADX INFO: renamed from: k */
    public static final v35 f179706k = m196828d("SSL_RSA_WITH_3DES_EDE_CBC_SHA", 10);

    /* JADX INFO: renamed from: l */
    public static final v35 f179709l = m196828d("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", 17);

    /* JADX INFO: renamed from: m */
    public static final v35 f179712m = m196828d("SSL_DHE_DSS_WITH_DES_CBC_SHA", 18);

    /* JADX INFO: renamed from: n */
    public static final v35 f179715n = m196828d("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", 19);

    /* JADX INFO: renamed from: o */
    public static final v35 f179718o = m196828d("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", 20);

    /* JADX INFO: renamed from: p */
    public static final v35 f179721p = m196828d("SSL_DHE_RSA_WITH_DES_CBC_SHA", 21);

    /* JADX INFO: renamed from: q */
    public static final v35 f179724q = m196828d("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", 22);

    /* JADX INFO: renamed from: r */
    public static final v35 f179727r = m196828d("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", 23);

    /* JADX INFO: renamed from: s */
    public static final v35 f179730s = m196828d("SSL_DH_anon_WITH_RC4_128_MD5", 24);

    /* JADX INFO: renamed from: t */
    public static final v35 f179732t = m196828d("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", 25);

    /* JADX INFO: renamed from: u */
    public static final v35 f179734u = m196828d("SSL_DH_anon_WITH_DES_CBC_SHA", 26);

    /* JADX INFO: renamed from: v */
    public static final v35 f179736v = m196828d("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", 27);

    /* JADX INFO: renamed from: w */
    public static final v35 f179738w = m196828d("TLS_KRB5_WITH_DES_CBC_SHA", 30);

    /* JADX INFO: renamed from: x */
    public static final v35 f179740x = m196828d("TLS_KRB5_WITH_3DES_EDE_CBC_SHA", 31);

    /* JADX INFO: renamed from: y */
    public static final v35 f179742y = m196828d("TLS_KRB5_WITH_RC4_128_SHA", 32);

    /* JADX INFO: renamed from: z */
    public static final v35 f179744z = m196828d("TLS_KRB5_WITH_DES_CBC_MD5", 34);

    /* JADX INFO: renamed from: A */
    public static final v35 f179625A = m196828d("TLS_KRB5_WITH_3DES_EDE_CBC_MD5", 35);

    /* JADX INFO: renamed from: B */
    public static final v35 f179627B = m196828d("TLS_KRB5_WITH_RC4_128_MD5", 36);

    /* JADX INFO: renamed from: C */
    public static final v35 f179629C = m196828d("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", 38);

    /* JADX INFO: renamed from: D */
    public static final v35 f179631D = m196828d("TLS_KRB5_EXPORT_WITH_RC4_40_SHA", 40);

    /* JADX INFO: renamed from: E */
    public static final v35 f179633E = m196828d("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", 41);

    /* JADX INFO: renamed from: F */
    public static final v35 f179635F = m196828d("TLS_KRB5_EXPORT_WITH_RC4_40_MD5", 43);

    /* JADX INFO: renamed from: G */
    public static final v35 f179637G = m196828d("TLS_RSA_WITH_AES_128_CBC_SHA", 47);

    /* JADX INFO: renamed from: H */
    public static final v35 f179639H = m196828d("TLS_DHE_DSS_WITH_AES_128_CBC_SHA", 50);

    /* JADX INFO: renamed from: I */
    public static final v35 f179641I = m196828d("TLS_DHE_RSA_WITH_AES_128_CBC_SHA", 51);

    /* JADX INFO: renamed from: J */
    public static final v35 f179643J = m196828d("TLS_DH_anon_WITH_AES_128_CBC_SHA", 52);

    /* JADX INFO: renamed from: K */
    public static final v35 f179645K = m196828d("TLS_RSA_WITH_AES_256_CBC_SHA", 53);

    /* JADX INFO: renamed from: L */
    public static final v35 f179647L = m196828d("TLS_DHE_DSS_WITH_AES_256_CBC_SHA", 56);

    /* JADX INFO: renamed from: M */
    public static final v35 f179649M = m196828d("TLS_DHE_RSA_WITH_AES_256_CBC_SHA", 57);

    /* JADX INFO: renamed from: N */
    public static final v35 f179651N = m196828d("TLS_DH_anon_WITH_AES_256_CBC_SHA", 58);

    /* JADX INFO: renamed from: O */
    public static final v35 f179653O = m196828d("TLS_RSA_WITH_NULL_SHA256", 59);

    /* JADX INFO: renamed from: P */
    public static final v35 f179655P = m196828d("TLS_RSA_WITH_AES_128_CBC_SHA256", 60);

    /* JADX INFO: renamed from: Q */
    public static final v35 f179657Q = m196828d("TLS_RSA_WITH_AES_256_CBC_SHA256", 61);

    /* JADX INFO: renamed from: R */
    public static final v35 f179659R = m196828d("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", 64);

    /* JADX INFO: renamed from: S */
    public static final v35 f179661S = m196828d("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", 65);

    /* JADX INFO: renamed from: T */
    public static final v35 f179663T = m196828d("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", 68);

    /* JADX INFO: renamed from: U */
    public static final v35 f179665U = m196828d("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", 69);

    /* JADX INFO: renamed from: V */
    public static final v35 f179667V = m196828d("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", 103);

    /* JADX INFO: renamed from: W */
    public static final v35 f179669W = m196828d("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", 106);

    /* JADX INFO: renamed from: X */
    public static final v35 f179671X = m196828d("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", 107);

    /* JADX INFO: renamed from: Y */
    public static final v35 f179673Y = m196828d("TLS_DH_anon_WITH_AES_128_CBC_SHA256", 108);

    /* JADX INFO: renamed from: Z */
    public static final v35 f179675Z = m196828d("TLS_DH_anon_WITH_AES_256_CBC_SHA256", 109);

    /* JADX INFO: renamed from: a0 */
    public static final v35 f179677a0 = m196828d("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", CipherSuite.TLS_RSA_WITH_CAMELLIA_256_CBC_SHA);

    /* JADX INFO: renamed from: b0 */
    public static final v35 f179680b0 = m196828d("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA);

    /* JADX INFO: renamed from: c0 */
    public static final v35 f179683c0 = m196828d("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA);

    /* JADX INFO: renamed from: d0 */
    public static final v35 f179686d0 = m196828d("TLS_PSK_WITH_RC4_128_SHA", CipherSuite.TLS_PSK_WITH_RC4_128_SHA);

    /* JADX INFO: renamed from: e0 */
    public static final v35 f179689e0 = m196828d("TLS_PSK_WITH_3DES_EDE_CBC_SHA", CipherSuite.TLS_PSK_WITH_3DES_EDE_CBC_SHA);

    /* JADX INFO: renamed from: f0 */
    public static final v35 f179692f0 = m196828d("TLS_PSK_WITH_AES_128_CBC_SHA", 140);

    /* JADX INFO: renamed from: g0 */
    public static final v35 f179695g0 = m196828d("TLS_PSK_WITH_AES_256_CBC_SHA", CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA);

    /* JADX INFO: renamed from: h0 */
    public static final v35 f179698h0 = m196828d("TLS_RSA_WITH_SEED_CBC_SHA", 150);

    /* JADX INFO: renamed from: i0 */
    public static final v35 f179701i0 = m196828d("TLS_RSA_WITH_AES_128_GCM_SHA256", CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256);

    /* JADX INFO: renamed from: j0 */
    public static final v35 f179704j0 = m196828d("TLS_RSA_WITH_AES_256_GCM_SHA384", 157);

    /* JADX INFO: renamed from: k0 */
    public static final v35 f179707k0 = m196828d("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", 158);

    /* JADX INFO: renamed from: l0 */
    public static final v35 f179710l0 = m196828d("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", 159);

    /* JADX INFO: renamed from: m0 */
    public static final v35 f179713m0 = m196828d("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", 162);

    /* JADX INFO: renamed from: n0 */
    public static final v35 f179716n0 = m196828d("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", 163);

    /* JADX INFO: renamed from: o0 */
    public static final v35 f179719o0 = m196828d("TLS_DH_anon_WITH_AES_128_GCM_SHA256", 166);

    /* JADX INFO: renamed from: p0 */
    public static final v35 f179722p0 = m196828d("TLS_DH_anon_WITH_AES_256_GCM_SHA384", 167);

    /* JADX INFO: renamed from: q0 */
    public static final v35 f179725q0 = m196828d("TLS_EMPTY_RENEGOTIATION_INFO_SCSV", 255);

    /* JADX INFO: renamed from: r0 */
    public static final v35 f179728r0 = m196828d("TLS_FALLBACK_SCSV", CipherSuite.TLS_FALLBACK_SCSV);

    /* JADX INFO: renamed from: s0 */
    public static final v35 f179731s0 = m196828d("TLS_ECDH_ECDSA_WITH_NULL_SHA", CipherSuite.TLS_ECDH_ECDSA_WITH_NULL_SHA);

    /* JADX INFO: renamed from: t0 */
    public static final v35 f179733t0 = m196828d("TLS_ECDH_ECDSA_WITH_RC4_128_SHA", CipherSuite.TLS_ECDH_ECDSA_WITH_RC4_128_SHA);

    /* JADX INFO: renamed from: u0 */
    public static final v35 f179735u0 = m196828d("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", CipherSuite.TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA);

    /* JADX INFO: renamed from: v0 */
    public static final v35 f179737v0 = m196828d("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", CipherSuite.TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA);

    /* JADX INFO: renamed from: w0 */
    public static final v35 f179739w0 = m196828d("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", CipherSuite.TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA);

    /* JADX INFO: renamed from: x0 */
    public static final v35 f179741x0 = m196828d("TLS_ECDHE_ECDSA_WITH_NULL_SHA", CipherSuite.TLS_ECDHE_ECDSA_WITH_NULL_SHA);

    /* JADX INFO: renamed from: y0 */
    public static final v35 f179743y0 = m196828d("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", CipherSuite.TLS_ECDHE_ECDSA_WITH_RC4_128_SHA);

    /* JADX INFO: renamed from: z0 */
    public static final v35 f179745z0 = m196828d("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", CipherSuite.TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA);

    /* JADX INFO: renamed from: A0 */
    public static final v35 f179626A0 = m196828d("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA);

    /* JADX INFO: renamed from: B0 */
    public static final v35 f179628B0 = m196828d("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA);

    /* JADX INFO: renamed from: C0 */
    public static final v35 f179630C0 = m196828d("TLS_ECDH_RSA_WITH_NULL_SHA", CipherSuite.TLS_ECDH_RSA_WITH_NULL_SHA);

    /* JADX INFO: renamed from: D0 */
    public static final v35 f179632D0 = m196828d("TLS_ECDH_RSA_WITH_RC4_128_SHA", CipherSuite.TLS_ECDH_RSA_WITH_RC4_128_SHA);

    /* JADX INFO: renamed from: E0 */
    public static final v35 f179634E0 = m196828d("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", CipherSuite.TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA);

    /* JADX INFO: renamed from: F0 */
    public static final v35 f179636F0 = m196828d("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", CipherSuite.TLS_ECDH_RSA_WITH_AES_128_CBC_SHA);

    /* JADX INFO: renamed from: G0 */
    public static final v35 f179638G0 = m196828d("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", CipherSuite.TLS_ECDH_RSA_WITH_AES_256_CBC_SHA);

    /* JADX INFO: renamed from: H0 */
    public static final v35 f179640H0 = m196828d("TLS_ECDHE_RSA_WITH_NULL_SHA", CipherSuite.TLS_ECDHE_RSA_WITH_NULL_SHA);

    /* JADX INFO: renamed from: I0 */
    public static final v35 f179642I0 = m196828d("TLS_ECDHE_RSA_WITH_RC4_128_SHA", CipherSuite.TLS_ECDHE_RSA_WITH_RC4_128_SHA);

    /* JADX INFO: renamed from: J0 */
    public static final v35 f179644J0 = m196828d("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", CipherSuite.TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA);

    /* JADX INFO: renamed from: K0 */
    public static final v35 f179646K0 = m196828d("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA);

    /* JADX INFO: renamed from: L0 */
    public static final v35 f179648L0 = m196828d("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA);

    /* JADX INFO: renamed from: M0 */
    public static final v35 f179650M0 = m196828d("TLS_ECDH_anon_WITH_NULL_SHA", CipherSuite.TLS_ECDH_anon_WITH_NULL_SHA);

    /* JADX INFO: renamed from: N0 */
    public static final v35 f179652N0 = m196828d("TLS_ECDH_anon_WITH_RC4_128_SHA", CipherSuite.TLS_ECDH_anon_WITH_RC4_128_SHA);

    /* JADX INFO: renamed from: O0 */
    public static final v35 f179654O0 = m196828d("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", CipherSuite.TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA);

    /* JADX INFO: renamed from: P0 */
    public static final v35 f179656P0 = m196828d("TLS_ECDH_anon_WITH_AES_128_CBC_SHA", CipherSuite.TLS_ECDH_anon_WITH_AES_128_CBC_SHA);

    /* JADX INFO: renamed from: Q0 */
    public static final v35 f179658Q0 = m196828d("TLS_ECDH_anon_WITH_AES_256_CBC_SHA", CipherSuite.TLS_ECDH_anon_WITH_AES_256_CBC_SHA);

    /* JADX INFO: renamed from: R0 */
    public static final v35 f179660R0 = m196828d("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256);

    /* JADX INFO: renamed from: S0 */
    public static final v35 f179662S0 = m196828d("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384);

    /* JADX INFO: renamed from: T0 */
    public static final v35 f179664T0 = m196828d("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", CipherSuite.TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256);

    /* JADX INFO: renamed from: U0 */
    public static final v35 f179666U0 = m196828d("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", CipherSuite.TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384);

    /* JADX INFO: renamed from: V0 */
    public static final v35 f179668V0 = m196828d("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256);

    /* JADX INFO: renamed from: W0 */
    public static final v35 f179670W0 = m196828d("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384);

    /* JADX INFO: renamed from: X0 */
    public static final v35 f179672X0 = m196828d("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", CipherSuite.TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256);

    /* JADX INFO: renamed from: Y0 */
    public static final v35 f179674Y0 = m196828d("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", CipherSuite.TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384);

    /* JADX INFO: renamed from: Z0 */
    public static final v35 f179676Z0 = m196828d("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256);

    /* JADX INFO: renamed from: a1 */
    public static final v35 f179678a1 = m196828d("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384);

    /* JADX INFO: renamed from: b1 */
    public static final v35 f179681b1 = m196828d("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", CipherSuite.TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256);

    /* JADX INFO: renamed from: c1 */
    public static final v35 f179684c1 = m196828d("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", CipherSuite.TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384);

    /* JADX INFO: renamed from: d1 */
    public static final v35 f179687d1 = m196828d("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256);

    /* JADX INFO: renamed from: e1 */
    public static final v35 f179690e1 = m196828d("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384);

    /* JADX INFO: renamed from: f1 */
    public static final v35 f179693f1 = m196828d("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", CipherSuite.TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256);

    /* JADX INFO: renamed from: g1 */
    public static final v35 f179696g1 = m196828d("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", CipherSuite.TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384);

    /* JADX INFO: renamed from: h1 */
    public static final v35 f179699h1 = m196828d("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", CipherSuite.TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA);

    /* JADX INFO: renamed from: i1 */
    public static final v35 f179702i1 = m196828d("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", CipherSuite.TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA);

    /* JADX INFO: renamed from: j1 */
    public static final v35 f179705j1 = m196828d("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52392);

    /* JADX INFO: renamed from: k1 */
    public static final v35 f179708k1 = m196828d("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", 52393);

    /* JADX INFO: renamed from: l1 */
    public static final v35 f179711l1 = m196828d("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52394);

    /* JADX INFO: renamed from: m1 */
    public static final v35 f179714m1 = m196828d("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", 52396);

    /* JADX INFO: renamed from: n1 */
    public static final v35 f179717n1 = m196828d("TLS_AES_128_GCM_SHA256", 4865);

    /* JADX INFO: renamed from: o1 */
    public static final v35 f179720o1 = m196828d("TLS_AES_256_GCM_SHA384", 4866);

    /* JADX INFO: renamed from: p1 */
    public static final v35 f179723p1 = m196828d("TLS_CHACHA20_POLY1305_SHA256", 4867);

    /* JADX INFO: renamed from: q1 */
    public static final v35 f179726q1 = m196828d("TLS_AES_128_CCM_SHA256", 4868);

    /* JADX INFO: renamed from: r1 */
    public static final v35 f179729r1 = m196828d("TLS_AES_128_CCM_8_SHA256", 4869);

    public v35(String str) {
        str.getClass();
        this.f179746a = str;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ int m196825a(String str, String str2) {
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

    /* JADX INFO: renamed from: b */
    public static synchronized v35 m196826b(String str) {
        v35 v35Var;
        try {
            Map<String, v35> map = f179682c;
            v35Var = map.get(str);
            if (v35Var == null) {
                v35Var = map.get(m196829f(str));
                if (v35Var == null) {
                    v35Var = new v35(str);
                }
                map.put(str, v35Var);
            }
        } catch (Throwable th) {
            throw th;
        }
        return v35Var;
    }

    /* JADX INFO: renamed from: c */
    public static List<v35> m196827c(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(m196826b(str));
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: d */
    public static v35 m196828d(String str, int i) {
        v35 v35Var = new v35(str);
        f179682c.put(str, v35Var);
        return v35Var;
    }

    /* JADX INFO: renamed from: f */
    public static String m196829f(String str) {
        if (str.startsWith("TLS_")) {
            return "SSL_".concat(str.substring(4));
        }
        return str.startsWith("SSL_") ? "TLS_".concat(str.substring(4)) : str;
    }

    /* JADX INFO: renamed from: e */
    public String m196830e() {
        return this.f179746a;
    }

    public String toString() {
        return this.f179746a;
    }
}
