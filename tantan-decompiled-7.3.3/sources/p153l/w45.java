package p153l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes2.dex */
public final class w45 {

    /* JADX INFO: renamed from: a */
    public final String f187348a;

    /* JADX INFO: renamed from: b */
    public static final Comparator<String> f187281b = new Comparator() { // from class: l.v45
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return w45.m204818a((String) obj, (String) obj2);
        }
    };

    /* JADX INFO: renamed from: c */
    public static final Map<String, w45> f187284c = new LinkedHashMap();

    /* JADX INFO: renamed from: d */
    public static final w45 f187287d = m204821d("SSL_RSA_WITH_NULL_MD5", 1);

    /* JADX INFO: renamed from: e */
    public static final w45 f187290e = m204821d("SSL_RSA_WITH_NULL_SHA", 2);

    /* JADX INFO: renamed from: f */
    public static final w45 f187293f = m204821d("SSL_RSA_EXPORT_WITH_RC4_40_MD5", 3);

    /* JADX INFO: renamed from: g */
    public static final w45 f187296g = m204821d("SSL_RSA_WITH_RC4_128_MD5", 4);

    /* JADX INFO: renamed from: h */
    public static final w45 f187299h = m204821d("SSL_RSA_WITH_RC4_128_SHA", 5);

    /* JADX INFO: renamed from: i */
    public static final w45 f187302i = m204821d("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", 8);

    /* JADX INFO: renamed from: j */
    public static final w45 f187305j = m204821d("SSL_RSA_WITH_DES_CBC_SHA", 9);

    /* JADX INFO: renamed from: k */
    public static final w45 f187308k = m204821d("SSL_RSA_WITH_3DES_EDE_CBC_SHA", 10);

    /* JADX INFO: renamed from: l */
    public static final w45 f187311l = m204821d("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", 17);

    /* JADX INFO: renamed from: m */
    public static final w45 f187314m = m204821d("SSL_DHE_DSS_WITH_DES_CBC_SHA", 18);

    /* JADX INFO: renamed from: n */
    public static final w45 f187317n = m204821d("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", 19);

    /* JADX INFO: renamed from: o */
    public static final w45 f187320o = m204821d("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", 20);

    /* JADX INFO: renamed from: p */
    public static final w45 f187323p = m204821d("SSL_DHE_RSA_WITH_DES_CBC_SHA", 21);

    /* JADX INFO: renamed from: q */
    public static final w45 f187326q = m204821d("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", 22);

    /* JADX INFO: renamed from: r */
    public static final w45 f187329r = m204821d("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", 23);

    /* JADX INFO: renamed from: s */
    public static final w45 f187332s = m204821d("SSL_DH_anon_WITH_RC4_128_MD5", 24);

    /* JADX INFO: renamed from: t */
    public static final w45 f187334t = m204821d("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", 25);

    /* JADX INFO: renamed from: u */
    public static final w45 f187336u = m204821d("SSL_DH_anon_WITH_DES_CBC_SHA", 26);

    /* JADX INFO: renamed from: v */
    public static final w45 f187338v = m204821d("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", 27);

    /* JADX INFO: renamed from: w */
    public static final w45 f187340w = m204821d("TLS_KRB5_WITH_DES_CBC_SHA", 30);

    /* JADX INFO: renamed from: x */
    public static final w45 f187342x = m204821d("TLS_KRB5_WITH_3DES_EDE_CBC_SHA", 31);

    /* JADX INFO: renamed from: y */
    public static final w45 f187344y = m204821d("TLS_KRB5_WITH_RC4_128_SHA", 32);

    /* JADX INFO: renamed from: z */
    public static final w45 f187346z = m204821d("TLS_KRB5_WITH_DES_CBC_MD5", 34);

    /* JADX INFO: renamed from: A */
    public static final w45 f187227A = m204821d("TLS_KRB5_WITH_3DES_EDE_CBC_MD5", 35);

    /* JADX INFO: renamed from: B */
    public static final w45 f187229B = m204821d("TLS_KRB5_WITH_RC4_128_MD5", 36);

    /* JADX INFO: renamed from: C */
    public static final w45 f187231C = m204821d("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", 38);

    /* JADX INFO: renamed from: D */
    public static final w45 f187233D = m204821d("TLS_KRB5_EXPORT_WITH_RC4_40_SHA", 40);

    /* JADX INFO: renamed from: E */
    public static final w45 f187235E = m204821d("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", 41);

    /* JADX INFO: renamed from: F */
    public static final w45 f187237F = m204821d("TLS_KRB5_EXPORT_WITH_RC4_40_MD5", 43);

    /* JADX INFO: renamed from: G */
    public static final w45 f187239G = m204821d("TLS_RSA_WITH_AES_128_CBC_SHA", 47);

    /* JADX INFO: renamed from: H */
    public static final w45 f187241H = m204821d("TLS_DHE_DSS_WITH_AES_128_CBC_SHA", 50);

    /* JADX INFO: renamed from: I */
    public static final w45 f187243I = m204821d("TLS_DHE_RSA_WITH_AES_128_CBC_SHA", 51);

    /* JADX INFO: renamed from: J */
    public static final w45 f187245J = m204821d("TLS_DH_anon_WITH_AES_128_CBC_SHA", 52);

    /* JADX INFO: renamed from: K */
    public static final w45 f187247K = m204821d("TLS_RSA_WITH_AES_256_CBC_SHA", 53);

    /* JADX INFO: renamed from: L */
    public static final w45 f187249L = m204821d("TLS_DHE_DSS_WITH_AES_256_CBC_SHA", 56);

    /* JADX INFO: renamed from: M */
    public static final w45 f187251M = m204821d("TLS_DHE_RSA_WITH_AES_256_CBC_SHA", 57);

    /* JADX INFO: renamed from: N */
    public static final w45 f187253N = m204821d("TLS_DH_anon_WITH_AES_256_CBC_SHA", 58);

    /* JADX INFO: renamed from: O */
    public static final w45 f187255O = m204821d("TLS_RSA_WITH_NULL_SHA256", 59);

    /* JADX INFO: renamed from: P */
    public static final w45 f187257P = m204821d("TLS_RSA_WITH_AES_128_CBC_SHA256", 60);

    /* JADX INFO: renamed from: Q */
    public static final w45 f187259Q = m204821d("TLS_RSA_WITH_AES_256_CBC_SHA256", 61);

    /* JADX INFO: renamed from: R */
    public static final w45 f187261R = m204821d("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", 64);

    /* JADX INFO: renamed from: S */
    public static final w45 f187263S = m204821d("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", 65);

    /* JADX INFO: renamed from: T */
    public static final w45 f187265T = m204821d("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", 68);

    /* JADX INFO: renamed from: U */
    public static final w45 f187267U = m204821d("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", 69);

    /* JADX INFO: renamed from: V */
    public static final w45 f187269V = m204821d("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", 103);

    /* JADX INFO: renamed from: W */
    public static final w45 f187271W = m204821d("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", 106);

    /* JADX INFO: renamed from: X */
    public static final w45 f187273X = m204821d("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", 107);

    /* JADX INFO: renamed from: Y */
    public static final w45 f187275Y = m204821d("TLS_DH_anon_WITH_AES_128_CBC_SHA256", 108);

    /* JADX INFO: renamed from: Z */
    public static final w45 f187277Z = m204821d("TLS_DH_anon_WITH_AES_256_CBC_SHA256", 109);

    /* JADX INFO: renamed from: a0 */
    public static final w45 f187279a0 = m204821d("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", CipherSuite.TLS_RSA_WITH_CAMELLIA_256_CBC_SHA);

    /* JADX INFO: renamed from: b0 */
    public static final w45 f187282b0 = m204821d("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA);

    /* JADX INFO: renamed from: c0 */
    public static final w45 f187285c0 = m204821d("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA);

    /* JADX INFO: renamed from: d0 */
    public static final w45 f187288d0 = m204821d("TLS_PSK_WITH_RC4_128_SHA", CipherSuite.TLS_PSK_WITH_RC4_128_SHA);

    /* JADX INFO: renamed from: e0 */
    public static final w45 f187291e0 = m204821d("TLS_PSK_WITH_3DES_EDE_CBC_SHA", CipherSuite.TLS_PSK_WITH_3DES_EDE_CBC_SHA);

    /* JADX INFO: renamed from: f0 */
    public static final w45 f187294f0 = m204821d("TLS_PSK_WITH_AES_128_CBC_SHA", 140);

    /* JADX INFO: renamed from: g0 */
    public static final w45 f187297g0 = m204821d("TLS_PSK_WITH_AES_256_CBC_SHA", CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA);

    /* JADX INFO: renamed from: h0 */
    public static final w45 f187300h0 = m204821d("TLS_RSA_WITH_SEED_CBC_SHA", 150);

    /* JADX INFO: renamed from: i0 */
    public static final w45 f187303i0 = m204821d("TLS_RSA_WITH_AES_128_GCM_SHA256", CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256);

    /* JADX INFO: renamed from: j0 */
    public static final w45 f187306j0 = m204821d("TLS_RSA_WITH_AES_256_GCM_SHA384", 157);

    /* JADX INFO: renamed from: k0 */
    public static final w45 f187309k0 = m204821d("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", 158);

    /* JADX INFO: renamed from: l0 */
    public static final w45 f187312l0 = m204821d("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", 159);

    /* JADX INFO: renamed from: m0 */
    public static final w45 f187315m0 = m204821d("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", 162);

    /* JADX INFO: renamed from: n0 */
    public static final w45 f187318n0 = m204821d("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", 163);

    /* JADX INFO: renamed from: o0 */
    public static final w45 f187321o0 = m204821d("TLS_DH_anon_WITH_AES_128_GCM_SHA256", 166);

    /* JADX INFO: renamed from: p0 */
    public static final w45 f187324p0 = m204821d("TLS_DH_anon_WITH_AES_256_GCM_SHA384", 167);

    /* JADX INFO: renamed from: q0 */
    public static final w45 f187327q0 = m204821d("TLS_EMPTY_RENEGOTIATION_INFO_SCSV", 255);

    /* JADX INFO: renamed from: r0 */
    public static final w45 f187330r0 = m204821d("TLS_FALLBACK_SCSV", CipherSuite.TLS_FALLBACK_SCSV);

    /* JADX INFO: renamed from: s0 */
    public static final w45 f187333s0 = m204821d("TLS_ECDH_ECDSA_WITH_NULL_SHA", CipherSuite.TLS_ECDH_ECDSA_WITH_NULL_SHA);

    /* JADX INFO: renamed from: t0 */
    public static final w45 f187335t0 = m204821d("TLS_ECDH_ECDSA_WITH_RC4_128_SHA", CipherSuite.TLS_ECDH_ECDSA_WITH_RC4_128_SHA);

    /* JADX INFO: renamed from: u0 */
    public static final w45 f187337u0 = m204821d("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", CipherSuite.TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA);

    /* JADX INFO: renamed from: v0 */
    public static final w45 f187339v0 = m204821d("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", CipherSuite.TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA);

    /* JADX INFO: renamed from: w0 */
    public static final w45 f187341w0 = m204821d("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", CipherSuite.TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA);

    /* JADX INFO: renamed from: x0 */
    public static final w45 f187343x0 = m204821d("TLS_ECDHE_ECDSA_WITH_NULL_SHA", CipherSuite.TLS_ECDHE_ECDSA_WITH_NULL_SHA);

    /* JADX INFO: renamed from: y0 */
    public static final w45 f187345y0 = m204821d("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", CipherSuite.TLS_ECDHE_ECDSA_WITH_RC4_128_SHA);

    /* JADX INFO: renamed from: z0 */
    public static final w45 f187347z0 = m204821d("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", CipherSuite.TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA);

    /* JADX INFO: renamed from: A0 */
    public static final w45 f187228A0 = m204821d("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA);

    /* JADX INFO: renamed from: B0 */
    public static final w45 f187230B0 = m204821d("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA);

    /* JADX INFO: renamed from: C0 */
    public static final w45 f187232C0 = m204821d("TLS_ECDH_RSA_WITH_NULL_SHA", CipherSuite.TLS_ECDH_RSA_WITH_NULL_SHA);

    /* JADX INFO: renamed from: D0 */
    public static final w45 f187234D0 = m204821d("TLS_ECDH_RSA_WITH_RC4_128_SHA", CipherSuite.TLS_ECDH_RSA_WITH_RC4_128_SHA);

    /* JADX INFO: renamed from: E0 */
    public static final w45 f187236E0 = m204821d("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", CipherSuite.TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA);

    /* JADX INFO: renamed from: F0 */
    public static final w45 f187238F0 = m204821d("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", CipherSuite.TLS_ECDH_RSA_WITH_AES_128_CBC_SHA);

    /* JADX INFO: renamed from: G0 */
    public static final w45 f187240G0 = m204821d("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", CipherSuite.TLS_ECDH_RSA_WITH_AES_256_CBC_SHA);

    /* JADX INFO: renamed from: H0 */
    public static final w45 f187242H0 = m204821d("TLS_ECDHE_RSA_WITH_NULL_SHA", CipherSuite.TLS_ECDHE_RSA_WITH_NULL_SHA);

    /* JADX INFO: renamed from: I0 */
    public static final w45 f187244I0 = m204821d("TLS_ECDHE_RSA_WITH_RC4_128_SHA", CipherSuite.TLS_ECDHE_RSA_WITH_RC4_128_SHA);

    /* JADX INFO: renamed from: J0 */
    public static final w45 f187246J0 = m204821d("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", CipherSuite.TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA);

    /* JADX INFO: renamed from: K0 */
    public static final w45 f187248K0 = m204821d("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA);

    /* JADX INFO: renamed from: L0 */
    public static final w45 f187250L0 = m204821d("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA);

    /* JADX INFO: renamed from: M0 */
    public static final w45 f187252M0 = m204821d("TLS_ECDH_anon_WITH_NULL_SHA", CipherSuite.TLS_ECDH_anon_WITH_NULL_SHA);

    /* JADX INFO: renamed from: N0 */
    public static final w45 f187254N0 = m204821d("TLS_ECDH_anon_WITH_RC4_128_SHA", CipherSuite.TLS_ECDH_anon_WITH_RC4_128_SHA);

    /* JADX INFO: renamed from: O0 */
    public static final w45 f187256O0 = m204821d("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", CipherSuite.TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA);

    /* JADX INFO: renamed from: P0 */
    public static final w45 f187258P0 = m204821d("TLS_ECDH_anon_WITH_AES_128_CBC_SHA", CipherSuite.TLS_ECDH_anon_WITH_AES_128_CBC_SHA);

    /* JADX INFO: renamed from: Q0 */
    public static final w45 f187260Q0 = m204821d("TLS_ECDH_anon_WITH_AES_256_CBC_SHA", CipherSuite.TLS_ECDH_anon_WITH_AES_256_CBC_SHA);

    /* JADX INFO: renamed from: R0 */
    public static final w45 f187262R0 = m204821d("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256);

    /* JADX INFO: renamed from: S0 */
    public static final w45 f187264S0 = m204821d("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384);

    /* JADX INFO: renamed from: T0 */
    public static final w45 f187266T0 = m204821d("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", CipherSuite.TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256);

    /* JADX INFO: renamed from: U0 */
    public static final w45 f187268U0 = m204821d("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", CipherSuite.TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384);

    /* JADX INFO: renamed from: V0 */
    public static final w45 f187270V0 = m204821d("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256);

    /* JADX INFO: renamed from: W0 */
    public static final w45 f187272W0 = m204821d("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384);

    /* JADX INFO: renamed from: X0 */
    public static final w45 f187274X0 = m204821d("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", CipherSuite.TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256);

    /* JADX INFO: renamed from: Y0 */
    public static final w45 f187276Y0 = m204821d("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", CipherSuite.TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384);

    /* JADX INFO: renamed from: Z0 */
    public static final w45 f187278Z0 = m204821d("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256);

    /* JADX INFO: renamed from: a1 */
    public static final w45 f187280a1 = m204821d("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384);

    /* JADX INFO: renamed from: b1 */
    public static final w45 f187283b1 = m204821d("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", CipherSuite.TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256);

    /* JADX INFO: renamed from: c1 */
    public static final w45 f187286c1 = m204821d("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", CipherSuite.TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384);

    /* JADX INFO: renamed from: d1 */
    public static final w45 f187289d1 = m204821d("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256);

    /* JADX INFO: renamed from: e1 */
    public static final w45 f187292e1 = m204821d("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384);

    /* JADX INFO: renamed from: f1 */
    public static final w45 f187295f1 = m204821d("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", CipherSuite.TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256);

    /* JADX INFO: renamed from: g1 */
    public static final w45 f187298g1 = m204821d("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", CipherSuite.TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384);

    /* JADX INFO: renamed from: h1 */
    public static final w45 f187301h1 = m204821d("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", CipherSuite.TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA);

    /* JADX INFO: renamed from: i1 */
    public static final w45 f187304i1 = m204821d("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", CipherSuite.TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA);

    /* JADX INFO: renamed from: j1 */
    public static final w45 f187307j1 = m204821d("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52392);

    /* JADX INFO: renamed from: k1 */
    public static final w45 f187310k1 = m204821d("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", 52393);

    /* JADX INFO: renamed from: l1 */
    public static final w45 f187313l1 = m204821d("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52394);

    /* JADX INFO: renamed from: m1 */
    public static final w45 f187316m1 = m204821d("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", 52396);

    /* JADX INFO: renamed from: n1 */
    public static final w45 f187319n1 = m204821d("TLS_AES_128_GCM_SHA256", 4865);

    /* JADX INFO: renamed from: o1 */
    public static final w45 f187322o1 = m204821d("TLS_AES_256_GCM_SHA384", 4866);

    /* JADX INFO: renamed from: p1 */
    public static final w45 f187325p1 = m204821d("TLS_CHACHA20_POLY1305_SHA256", 4867);

    /* JADX INFO: renamed from: q1 */
    public static final w45 f187328q1 = m204821d("TLS_AES_128_CCM_SHA256", 4868);

    /* JADX INFO: renamed from: r1 */
    public static final w45 f187331r1 = m204821d("TLS_AES_128_CCM_8_SHA256", 4869);

    public w45(String str) {
        str.getClass();
        this.f187348a = str;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ int m204818a(String str, String str2) {
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
    public static synchronized w45 m204819b(String str) {
        w45 w45Var;
        try {
            Map<String, w45> map = f187284c;
            w45Var = map.get(str);
            if (w45Var == null) {
                w45Var = map.get(m204822f(str));
                if (w45Var == null) {
                    w45Var = new w45(str);
                }
                map.put(str, w45Var);
            }
        } catch (Throwable th) {
            throw th;
        }
        return w45Var;
    }

    /* JADX INFO: renamed from: c */
    public static List<w45> m204820c(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(m204819b(str));
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: d */
    public static w45 m204821d(String str, int i) {
        w45 w45Var = new w45(str);
        f187284c.put(str, w45Var);
        return w45Var;
    }

    /* JADX INFO: renamed from: f */
    public static String m204822f(String str) {
        if (str.startsWith("TLS_")) {
            return "SSL_".concat(str.substring(4));
        }
        return str.startsWith("SSL_") ? "TLS_".concat(str.substring(4)) : str;
    }

    /* JADX INFO: renamed from: e */
    public String m204823e() {
        return this.f187348a;
    }

    public String toString() {
        return this.f187348a;
    }
}
