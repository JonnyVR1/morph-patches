package com.p000p1.mobile.putong.core.api;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.inject.provider.CoreProviderInterface;
import com.p000p1.mobile.putong.p001ab.IntlCountryCodeController;
import com.tantanapp.common.network.RunnerProxy;
import java.util.HashMap;
import java.util.Objects;
import l.a3e0;
import l.i0g0;
import l.mkd0;
import l.vwb;
import l.w9j;
import p006l.j2e0;
import p006l.mu5;
import p006l.qib0;
import p006l.ura;
import rx.c;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C0154a extends RunnerProxy {

    /* JADX INFO: renamed from: A */
    public static String f3468A;

    /* JADX INFO: renamed from: B */
    public static String f3469B;

    /* JADX INFO: renamed from: C */
    public static String f3470C;

    /* JADX INFO: renamed from: D */
    public static String f3471D;

    /* JADX INFO: renamed from: E */
    public static String f3472E;

    /* JADX INFO: renamed from: F */
    public static String f3473F;

    /* JADX INFO: renamed from: G */
    public static String f3474G;

    /* JADX INFO: renamed from: H */
    public static String f3475H;

    /* JADX INFO: renamed from: I */
    public static String f3476I;

    /* JADX INFO: renamed from: J */
    public static String f3477J;

    /* JADX INFO: renamed from: K */
    public static final String f3478K;

    /* JADX INFO: renamed from: L */
    public static int f3479L;

    /* JADX INFO: renamed from: M */
    public static int f3480M;

    /* JADX INFO: renamed from: N */
    public static int f3481N;

    /* JADX INFO: renamed from: O */
    public static int f3482O;

    /* JADX INFO: renamed from: P */
    public static Network f3483P;

    /* JADX INFO: renamed from: a */
    public static final String f3484a = mu5.f17257f + "/v1";

    /* JADX INFO: renamed from: b */
    public static final String f3485b = mu5.f17273v + "/v2";

    /* JADX INFO: renamed from: c */
    public static final String f3486c;

    /* JADX INFO: renamed from: d */
    public static final String f3487d;

    /* JADX INFO: renamed from: e */
    public static final String f3488e;

    /* JADX INFO: renamed from: f */
    public static final String f3489f;

    /* JADX INFO: renamed from: g */
    public static final String f3490g;

    /* JADX INFO: renamed from: h */
    public static final String f3491h;

    /* JADX INFO: renamed from: i */
    public static final String f3492i;

    /* JADX INFO: renamed from: j */
    public static final String f3493j;

    /* JADX INFO: renamed from: k */
    public static final String f3494k;

    /* JADX INFO: renamed from: l */
    public static final String f3495l;

    /* JADX INFO: renamed from: m */
    public static final String f3496m;

    /* JADX INFO: renamed from: n */
    public static final String f3497n;

    /* JADX INFO: renamed from: o */
    public static final String f3498o;

    /* JADX INFO: renamed from: p */
    public static final String f3499p;

    /* JADX INFO: renamed from: q */
    public static final String f3500q;

    /* JADX INFO: renamed from: r */
    public static final String f3501r;

    /* JADX INFO: renamed from: s */
    public static final String f3502s;

    /* JADX INFO: renamed from: t */
    public static String f3503t;

    /* JADX INFO: renamed from: u */
    public static String f3504u;

    /* JADX INFO: renamed from: v */
    public static String f3505v;

    /* JADX INFO: renamed from: w */
    public static String f3506w;

    /* JADX INFO: renamed from: x */
    public static String f3507x;

    /* JADX INFO: renamed from: y */
    public static String f3508y;

    /* JADX INFO: renamed from: z */
    public static String f3509z;

    static {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = mu5.f17256e;
        sb.append(str2);
        sb.append("/v1");
        f3486c = sb.toString();
        f3487d = str2 + "/v2";
        f3488e = str2 + "/v3";
        f3489f = mu5.f17258g + "/v1";
        f3490g = mu5.f17261j;
        f3491h = mu5.f17262k + "/v1";
        f3492i = mu5.f17263l;
        f3493j = mu5.f17264m;
        f3494k = mu5.f17265n + "/v1";
        f3495l = mu5.f17266o;
        f3496m = mu5.f17267p;
        f3497n = mu5.f17270s;
        if (((String) mu5.f17252a.get()).contains("staging")) {
            str = mu5.f17271t.replace("https://", "http://") + "/v1";
        } else {
            str = mu5.f17271t.replace("http://", "https://") + "/v1";
        }
        f3498o = str;
        f3499p = mu5.f17272u + "/v1";
        f3500q = mu5.f17275x;
        f3501r = mu5.f17277z;
        f3502s = mu5.f17276y + "/v1";
        f3503t = "contacts,questions,followships,groupSettings,verifications";
        f3504u = "contacts,questions,followships,user.publicMoments";
        f3505v = "questions,stickers";
        f3506w = "relationships";
        f3507x = "relationships,moments";
        f3508y = "users," + f3503t;
        f3509z = "messages," + f3505v;
        f3468A = "moments";
        f3469B = "members";
        f3470C = "relationships";
        f3471D = "chat-groups,members";
        f3472E = "gifts";
        f3473F = "states";
        f3474G = "dynamic_moments";
        f3475H = "limit=100";
        f3476I = "limit=20";
        f3477J = "";
        f3478K = m3296w2("?search=suggested&limit=100&with=" + f3503t);
        f3479L = 1;
        f3480M = 2;
        f3481N = 4;
        f3482O = 8;
        f3483P = qib0.f19784H;
    }

    public C0154a() {
        final CoreProviderInterface coreProviderInterfaceM25559d = ura.m25555e().m25559d();
        Objects.requireNonNull(coreProviderInterfaceM25559d);
        setErrorHandler(new w9j() { // from class: l.kt0
            public final Object call(Object obj) {
                return coreProviderInterfaceM25559d.m5808kd((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: A */
    public static String m3106A(String str) {
        if (ura.m25555e().m25559d().m5613E()) {
            return m3141I2("/conversations/" + str + "?with=" + f3507x);
        }
        return m3143J0("/conversations/" + str + "?with=" + f3507x);
    }

    /* JADX INFO: renamed from: A0 */
    public static String m3107A0(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            str2 = "&" + str;
        }
        return m3296w2("?search=whoLikedMe&with=" + f3504u + ",relationships" + str2);
    }

    /* JADX INFO: renamed from: A1 */
    public static String m3108A1(String str) {
        StringBuilder sb = new StringBuilder("/cms/");
        sb.append(str);
        sb.append("/promotionInfo?affiliate=");
        sb.append(IntlCountryCodeController.m10k() ? "huawei" : "googleplay");
        sb.append("&mcc=");
        sb.append(qib0.f19808f0);
        return m3130G(sb.toString());
    }

    /* JADX INFO: renamed from: A2 */
    public static final String m3109A2(String str) {
        HashMap<String, String> mapM17250o = j2e0.m17250o(Uri.parse(str));
        String str2 = mapM17250o.get("uid");
        mapM17250o.remove("uid");
        if (TextUtils.isEmpty(mapM17250o.get("src"))) {
            mapM17250o.put("src", "deeplink");
        }
        return m3296w2("/" + str2 + j2e0.m17237b(mapM17250o));
    }

    /* JADX INFO: renamed from: B */
    public static String m3110B(String str) {
        return m3143J0("/conversations?filter=dismissed&with=" + f3508y + "," + f3470C + "&" + str);
    }

    /* JADX INFO: renamed from: B0 */
    public static String m3111B0() {
        return m3130G("/same/start");
    }

    /* JADX INFO: renamed from: B1 */
    public static String m3112B1() {
        return m3130G("/monetization-promotions");
    }

    /* JADX INFO: renamed from: B2 */
    public static String m3113B2(String str) {
        return m3130G("/users/" + str + "/user-recommend/recommend?mcc=" + qib0.f19808f0 + "&region=" + qib0.f19810h0 + "&language=" + i0g0.y());
    }

    /* JADX INFO: renamed from: C */
    public static String m3114C(String str) {
        return m3305z() + "?search=newMatch&sort=createdTime&conditions=" + str + "&limit=20&with=" + f3506w + "," + f3508y + "," + f3509z + "," + f3468A + "," + f3472E;
    }

    /* JADX INFO: renamed from: C0 */
    public static String m3115C0(String str, String str2) {
        return m3296w2("/" + str + "/live-recommend/cancel/" + str2);
    }

    /* JADX INFO: renamed from: C1 */
    public static String m3116C1(String str) {
        return m3259n1("/contracts/" + str + "/orders");
    }

    /* JADX INFO: renamed from: C2 */
    public static final String m3117C2(String str) {
        return m3296w2("/" + str + "?search=superlike-relationship&with=" + f3503t + ",relationships");
    }

    /* JADX INFO: renamed from: D */
    public static String m3118D() {
        return m3130G("/monetization-chat/instantChat");
    }

    /* JADX INFO: renamed from: D0 */
    public static String m3119D0(String str, String str2) {
        return m3296w2("/" + str + "/live-recommend/enter/" + str2);
    }

    /* JADX INFO: renamed from: D1 */
    public static String m3120D1(String str) {
        return m3130G("/users/" + str + "/user-seeEntry/maxPop?mcc=" + qib0.f19808f0);
    }

    /* JADX INFO: renamed from: D2 */
    public static String m3121D2(String str) {
        return m3296w2("/" + str);
    }

    /* JADX INFO: renamed from: E */
    public static String m3122E() {
        return m3130G("/monetization-chat/instantChat?method=delete");
    }

    /* JADX INFO: renamed from: E0 */
    public static String m3123E0(String str) {
        return m3130G("/memojiBuzz" + str);
    }

    /* JADX INFO: renamed from: E1 */
    public static String m3124E1(String str) {
        return m3130G("/users/" + str + "/tarot/query");
    }

    /* JADX INFO: renamed from: E2 */
    public static String m3125E2(String str) {
        return m3296w2("/" + str + "?with=" + f3503t + ",passby");
    }

    /* JADX INFO: renamed from: F */
    public static String m3126F(String str) {
        return m3305z() + "?search=quickFilter&sort=latestMessageTime&conditions=" + str + "&ids=" + CoreModule.f1534c.f3631f0.f3910a2 + "&limit=20&with=" + f3506w + "," + f3508y + "," + f3509z + "," + f3468A + "," + f3472E;
    }

    /* JADX INFO: renamed from: F0 */
    public static String m3127F0(String str) {
        return m3130G("/textBuzz" + str);
    }

    /* JADX INFO: renamed from: F1 */
    public static String m3128F1() {
        return m3130G("/quickchat-voice/me");
    }

    /* JADX INFO: renamed from: F2 */
    public static String m3129F2(String str) {
        return m3296w2("/" + str + "?with=" + f3504u + m3186U2() + m3189V2() + m3201Y2());
    }

    /* JADX INFO: renamed from: G */
    public static String m3130G(String str) {
        return f3487d + str;
    }

    /* JADX INFO: renamed from: G0 */
    public static String m3131G0(String str) {
        return m3130G("/videoBuzz" + str);
    }

    /* JADX INFO: renamed from: G1 */
    public static String m3132G1() {
        return m3130G("/quickchat-party/campaign");
    }

    /* JADX INFO: renamed from: G2 */
    public static String m3133G2(String str) {
        return m3296w2("/" + str + "?with=" + f3503t + ",relationships");
    }

    /* JADX INFO: renamed from: H */
    public static String m3134H(String str) {
        return f3486c + str;
    }

    /* JADX INFO: renamed from: H0 */
    public static String m3135H0(String str) {
        return m3130G("/voiceBuzz" + str);
    }

    /* JADX INFO: renamed from: H1 */
    public static String m3136H1() {
        return m3130G("/quickchat-oneside/me");
    }

    /* JADX INFO: renamed from: H2 */
    public static String m3137H2(String str) {
        return f3488e + str;
    }

    /* JADX INFO: renamed from: I */
    public static String m3138I(String str, String str2) {
        return m3130G("/users/" + str + "/tarot/create?mcc=" + str2);
    }

    /* JADX INFO: renamed from: I0 */
    public static String m3139I0() {
        return m3130G("/intl/activity/general");
    }

    /* JADX INFO: renamed from: I1 */
    public static String m3140I1() {
        return m3130G("/quickchat-party/campaign-page");
    }

    /* JADX INFO: renamed from: I2 */
    public static String m3141I2(String str) {
        return m3145J2("/me" + str);
    }

    /* JADX INFO: renamed from: J */
    public static String m3142J(String str, String str2) {
        StringBuilder sb = new StringBuilder("/users/");
        sb.append(str);
        sb.append("/verifications/");
        sb.append(str);
        sb.append("?verification=picture");
        sb.append(TextUtils.isEmpty(str2) ? "" : "&productId=6");
        return m3130G(sb.toString());
    }

    /* JADX INFO: renamed from: J0 */
    public static String m3143J0(String str) {
        return m3296w2("/me" + str);
    }

    /* JADX INFO: renamed from: J1 */
    public static String m3144J1() {
        return m3130G("/quickchat-party/invitation");
    }

    /* JADX INFO: renamed from: J2 */
    public static String m3145J2(String str) {
        return m3137H2("/users" + str);
    }

    /* JADX INFO: renamed from: K */
    public static String m3146K(String str, String str2, String str3) {
        return m3296w2("/" + str + "/moments/" + str2 + "/messages/" + str3);
    }

    /* JADX INFO: renamed from: K0 */
    public static String m3147K0(String str) {
        return m3143J0("/mymeet/entry/v4" + str);
    }

    /* JADX INFO: renamed from: K1 */
    public static String m3148K1(String str) {
        return m3130G("/quickchat-voice" + str);
    }

    /* JADX INFO: renamed from: K2 */
    public static String m3149K2(String str) {
        return m3145J2("/me/conversations/" + str + "?method=patch");
    }

    /* JADX INFO: renamed from: L */
    public static String m3150L(String str) {
        return m3130G("/users/" + str + "/verifications/" + str + "?process=new");
    }

    /* JADX INFO: renamed from: L0 */
    public static String m3151L0(String str) {
        return m3143J0("/mymeet-gifts/" + str);
    }

    /* JADX INFO: renamed from: L1 */
    public static String m3152L1() {
        return m3130G("/boost-status");
    }

    /* JADX INFO: renamed from: L2 */
    public static String m3153L2(String str) {
        return m3296w2("/" + str + "/visitor/counter");
    }

    /* JADX INFO: renamed from: M */
    public static String m3154M(String str) {
        return a3e0.a(f3500q + "/" + str);
    }

    /* JADX INFO: renamed from: M0 */
    public static String m3155M0() {
        return m3143J0("/mymeet/live/v3");
    }

    /* JADX INFO: renamed from: M1 */
    public static String m3156M1(String str) {
        return m3130G("/quickchat" + str);
    }

    /* JADX INFO: renamed from: M2 */
    public static String m3157M2() {
        return m3130G("/users/me/wallet");
    }

    /* JADX INFO: renamed from: N */
    public static String m3158N() {
        return m3130G("/com-freetrial");
    }

    /* JADX INFO: renamed from: N0 */
    public static String m3159N0(String str) {
        return m3296w2("/" + str + "/odiamond-feed/list");
    }

    /* JADX INFO: renamed from: N1 */
    public static String m3160N1() {
        return m3130G("/quickchat-bell/me");
    }

    /* JADX INFO: renamed from: O */
    public static String m3161O() {
        return m3130G("/gift-infos");
    }

    /* JADX INFO: renamed from: O0 */
    public static String m3162O0(String str, String str2, boolean z) {
        if (!ura.m25555e().m25559d().m5613E()) {
            StringBuilder sb = new StringBuilder("/conversations/");
            sb.append(str);
            sb.append("/messages/");
            sb.append(str2);
            sb.append("?with=");
            sb.append(f3505v);
            sb.append(",");
            sb.append(f3468A);
            sb.append(",");
            sb.append(f3472E);
            sb.append(",");
            sb.append(f3473F);
            sb.append(m3189V2());
            sb.append(z ? "&anyStatus=true" : "");
            return m3143J0(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder("/conversations/");
        sb2.append(str);
        sb2.append("/messages/");
        sb2.append(str2);
        sb2.append("?with=");
        sb2.append(f3505v);
        sb2.append(",");
        sb2.append(f3468A);
        sb2.append(",");
        sb2.append(f3469B);
        sb2.append(",");
        sb2.append(f3472E);
        sb2.append(",");
        sb2.append(f3473F);
        sb2.append(m3189V2());
        sb2.append(z ? "&anyStatus=true" : "");
        return m3141I2(sb2.toString());
    }

    /* JADX INFO: renamed from: O1 */
    public static String m3163O1() {
        return m3130G("/quickchat/conversations");
    }

    /* JADX INFO: renamed from: P */
    public static String m3164P(String str) {
        return m3130G("/gift-panels" + str);
    }

    /* JADX INFO: renamed from: P0 */
    public static String m3165P0(String str, String str2) {
        String str3;
        if (TextUtils.isEmpty(str2)) {
            str3 = "";
        } else {
            str3 = "&" + str2;
        }
        if (ura.m25555e().m25559d().m5613E()) {
            return m3141I2("/conversations/" + str + "/messages?with=" + f3505v + "," + f3468A + ",members," + f3472E + "," + f3473F + m3189V2() + str3);
        }
        return m3143J0("/conversations/" + str + "/messages?with=" + f3505v + "," + f3468A + "," + f3472E + "," + f3473F + m3189V2() + str3);
    }

    /* JADX INFO: renamed from: P1 */
    public static String m3166P1() {
        return m3156M1("/me");
    }

    /* JADX INFO: renamed from: Q */
    public static String m3167Q() {
        return m3130G("/gift-records");
    }

    /* JADX INFO: renamed from: Q0 */
    public static String m3168Q0(String str) {
        if (ura.m25555e().m25559d().m5613E()) {
            return m3141I2("/conversations/" + str + "/messages?with=" + f3505v + "," + f3468A + "," + f3472E + "," + f3473F + m3189V2());
        }
        return m3143J0("/conversations/" + str + "/messages?with=" + f3505v + "," + f3468A + "," + f3472E + "," + f3473F + m3189V2());
    }

    /* JADX INFO: renamed from: Q1 */
    public static String m3169Q1() {
        return m3130G("/quickchat-speed/me");
    }

    /* JADX INFO: renamed from: Q2 */
    public static String m3170Q2() {
        return m3259n1("/auto-deducts");
    }

    /* JADX INFO: renamed from: R */
    public static String m3171R(String str) {
        return m3143J0("/gift-records/" + str);
    }

    /* JADX INFO: renamed from: R0 */
    public static String m3172R0(String str, String str2) {
        if (!ura.m25555e().m25559d().m5613E()) {
            return m3143J0("/conversations/" + str + "/messages/" + str2 + "?with=" + f3505v + "," + f3468A + "," + f3472E + "," + f3473F + m3189V2());
        }
        return m3141I2("/conversations/" + str + "/messages/" + str2 + "?with=" + f3505v + "," + f3468A + "," + f3469B + "," + f3472E + "," + f3473F + m3189V2());
    }

    /* JADX INFO: renamed from: R1 */
    public static String m3173R1(String str, String str2) {
        return m3130G("/users/" + str + "/advert/tantan-advert/ok?advertId=" + str2);
    }

    /* JADX INFO: renamed from: R2 */
    public static String m3174R2(String str) {
        return m3259n1(String.format("/contracts/%s/orders?filter=latestOrder", str));
    }

    /* JADX INFO: renamed from: S */
    public static String m3175S() {
        return m3130G("/privilege-gift-remaining");
    }

    /* JADX INFO: renamed from: S0 */
    public static String m3176S0(String str, String str2) {
        String str3;
        if (TextUtils.isEmpty(str2)) {
            str3 = "";
        } else {
            str3 = "&" + str2;
        }
        return m3143J0("/contacts?search=mutual&query=" + str + str3);
    }

    /* JADX INFO: renamed from: S1 */
    public static String m3177S1() {
        return m3130G("/monetization/seeExposedUser");
    }

    /* JADX INFO: renamed from: S2 */
    public static String m3178S2() {
        return (CoreModule.m1854P().m11711g().m7024yc() || CoreModule.m1854P().m11711g().m6991d9()) ? ",userActivityInfo" : "";
    }

    /* JADX INFO: renamed from: T */
    public static String m3179T(String str) {
        return m3130G("/boost/" + str + "/gift?type=spotLight&mcc=" + qib0.f19808f0);
    }

    /* JADX INFO: renamed from: T0 */
    public static String m3180T0() {
        return m3143J0("?method=patch");
    }

    /* JADX INFO: renamed from: T1 */
    public static String m3181T1(String str, String str2) {
        return m3130G("/users/" + str + "/tarot/recommend?mcc=" + str2);
    }

    /* JADX INFO: renamed from: T2 */
    public static <T> c.d<T, T> m3182T2() {
        return mkd0.C();
    }

    /* JADX INFO: renamed from: U */
    public static String m3183U(String str) {
        return m3143J0("/greet-gifts/" + str);
    }

    /* JADX INFO: renamed from: U0 */
    public static String m3184U0(String str) {
        return m3137H2("/users/me" + str);
    }

    /* JADX INFO: renamed from: U1 */
    public static String m3185U1(String str, String str2) {
        return m3130G("/mkt/" + str + "/suggest?mcc=" + str2);
    }

    /* JADX INFO: renamed from: U2 */
    public static String m3186U2() {
        return ura.m25555e().m25559d().m5739b() ? ",lives" : "";
    }

    /* JADX INFO: renamed from: V */
    public static String m3187V() {
        return m3137H2("/users/me/group-attributes");
    }

    /* JADX INFO: renamed from: V0 */
    public static String m3188V0(String str, String str2, String str3) {
        return m3296w2("/" + str + "/moments/" + str2 + "/messages?with=" + f3505v + "&page_id=" + str3);
    }

    /* JADX INFO: renamed from: V2 */
    public static String m3189V2() {
        return ",literatures";
    }

    /* JADX INFO: renamed from: W */
    public static String m3190W() {
        return m3137H2("/chat-groups");
    }

    /* JADX INFO: renamed from: W0 */
    public static String m3191W0() {
        return m3130G("/monetization/configuration");
    }

    /* JADX INFO: renamed from: W1 */
    public static String m3192W1(String str) {
        return m3130G(String.format("/users/me/renewable/contractInfos?scenario=%s", str));
    }

    /* JADX INFO: renamed from: W2 */
    public static double m3193W2() {
        return qib0.f19784H.guessedCurrentServerTime();
    }

    /* JADX INFO: renamed from: X */
    public static String m3194X() {
        return m3137H2("/users/me/group-notifications?limit=20&with=users,group-applies,chat-groups");
    }

    /* JADX INFO: renamed from: X0 */
    public static String m3195X0() {
        return m3130G("/monetization/configuration?query=nearbyBlock");
    }

    /* JADX INFO: renamed from: X1 */
    public static String m3196X1() {
        return m3130G("/rtc");
    }

    /* JADX INFO: renamed from: X2 */
    public static double m3197X2(double d) {
        return d + 1.0d;
    }

    /* JADX INFO: renamed from: Y */
    public static String m3198Y(String str) {
        return mu5.f17265n + "/v2" + str;
    }

    /* JADX INFO: renamed from: Y0 */
    public static String m3199Y0(String str) {
        return m3130G("/monetizationMsg/coin");
    }

    /* JADX INFO: renamed from: Y1 */
    public static String m3200Y1(int i) {
        return m3196X1() + "-users/" + i;
    }

    /* JADX INFO: renamed from: Y2 */
    public static String m3201Y2() {
        String str = ura.m25555e().m25559d().m5877w() ? ",pictureTags" : "";
        return ura.m25555e().m25559d().m5884xh() ? str.concat(",idealType") : str;
    }

    /* JADX INFO: renamed from: Z */
    public static String m3202Z(String str) {
        return f3495l + str;
    }

    /* JADX INFO: renamed from: Z0 */
    public static String m3203Z0(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            str2 = "&" + str;
        }
        return m3130G("/users?search=nearby".concat(str2));
    }

    /* JADX INFO: renamed from: Z1 */
    public static String m3204Z1() {
        return m3130G("/see-trial/eligible");
    }

    /* JADX INFO: renamed from: a */
    public static String m3205a(String str) {
        return f3485b + str;
    }

    /* JADX INFO: renamed from: a0 */
    public static String m3206a0(String str) {
        return m3130G("/users/" + str + "/intl-paycools-merchandises?currencyCode=PHP");
    }

    /* JADX INFO: renamed from: a1 */
    public static String m3207a1() {
        return m3130G("/users?search=nearbyCount");
    }

    /* JADX INFO: renamed from: a2 */
    public static String m3208a2() {
        return m3130G("/see-trial/status");
    }

    /* JADX INFO: renamed from: b */
    public static String m3209b(String str) {
        return m3130G("/users/me/verifications/" + str);
    }

    /* JADX INFO: renamed from: b0 */
    public static String m3210b0(String str) {
        return m3130G("/users/" + str + "/intl-settings");
    }

    /* JADX INFO: renamed from: b1 */
    public static String m3211b1(String str) {
        return m3130G("/new-gift-walls?action=" + str);
    }

    /* JADX INFO: renamed from: b2 */
    public static String m3212b2() {
        return m3130G("/see-trial/wait-start");
    }

    /* JADX INFO: renamed from: c */
    public static String m3213c(String str) {
        return m3130G("/chat/ai-advisor" + str);
    }

    /* JADX INFO: renamed from: c0 */
    public static String m3214c0(String str) {
        return m3130G("/users/" + str + "/intl-paycools-orderlist");
    }

    /* JADX INFO: renamed from: c1 */
    public static String m3215c1(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            str2 = "&" + str;
        }
        return m3296w2("?search=whoLikedMe".concat(str2));
    }

    /* JADX INFO: renamed from: c2 */
    public static String m3216c2() {
        return m3130G("/users/me/settings");
    }

    /* JADX INFO: renamed from: d */
    public static String m3217d(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            str2 = "&" + str;
        }
        String strConcat = str2.concat("&filter=missed");
        if (!ura.m25555e().m25559d().m5613E()) {
            return m3141I2("/conversations?with=" + f3506w + "," + f3508y + "," + f3509z + "," + f3468A + "," + f3472E + strConcat);
        }
        return m3141I2("/conversations?with=" + f3506w + "," + f3508y + "," + f3509z + "," + f3468A + "," + f3471D + "," + f3472E + strConcat);
    }

    /* JADX INFO: renamed from: d0 */
    public static String m3218d0() {
        return m3130G("/getPromotions?affiliate=googleplay&mcc=" + qib0.f19808f0);
    }

    /* JADX INFO: renamed from: d1 */
    public static String m3219d1(String str) {
        return m3143J0("/mymeet/entry/v3" + str);
    }

    /* JADX INFO: renamed from: d2 */
    public static String m3220d2() {
        return m3130G("/intl/activity/love520");
    }

    /* JADX INFO: renamed from: e */
    public static String m3221e(String str) {
        return m3130G("/users/" + str + "/advert/award-counter/award");
    }

    /* JADX INFO: renamed from: e0 */
    public static String m3222e0(String str) {
        return m3143J0("/instant-chat/" + str);
    }

    /* JADX INFO: renamed from: e1 */
    public static String m3223e1(String str) {
        return m3143J0("/mymeet/list/v3" + str);
    }

    /* JADX INFO: renamed from: e2 */
    public static String m3224e2(String str) {
        return m3296w2("/" + str + "/special-cards");
    }

    /* JADX INFO: renamed from: f */
    public static String m3225f(String str) {
        return m3130G("/users/" + str + "/advert/award-counter/query");
    }

    /* JADX INFO: renamed from: f0 */
    public static String m3226f0() {
        return m3130G("/live-wallet/intl/diamond/change");
    }

    /* JADX INFO: renamed from: f1 */
    public static String m3227f1() {
        return m3143J0("/mymeet/read/v3");
    }

    /* JADX INFO: renamed from: f2 */
    public static String m3228f2() {
        return m3130G("/intl/boost/force-like");
    }

    /* JADX INFO: renamed from: g */
    public static String m3229g(String str, String str2, String str3, int i) {
        return m3130G("/users/" + str + "/user-boot/cancel/" + str2 + "?mcc=" + str3 + "&cardId=" + i);
    }

    /* JADX INFO: renamed from: g0 */
    public static String m3230g0() {
        return m3130G("/live-wallet/intl/diamond/canChange");
    }

    /* JADX INFO: renamed from: g1 */
    public static String m3231g1(String str) {
        return m3130G("/users/" + str + "/advert/tantan-advert/query?mcc=" + qib0.f19808f0);
    }

    /* JADX INFO: renamed from: g2 */
    public static String m3232g2(String str) {
        return m3130G("/boost/" + str + "/boost-start");
    }

    /* JADX INFO: renamed from: h */
    public static String m3233h(String str, String str2, String str3, int i) {
        return m3130G("/users/" + str + "/user-boot/like/" + str2 + "?mcc=" + str3 + "&cardId=" + i);
    }

    /* JADX INFO: renamed from: h0 */
    public static String m3234h0(String str) {
        return m3130G("/users/" + str + "/diamond?agent=true");
    }

    /* JADX INFO: renamed from: h1 */
    public static String m3235h1() {
        return m3143J0("/quickchat?action=acceptbroadcast&version=10");
    }

    /* JADX INFO: renamed from: h2 */
    public static String m3236h2(String str) {
        StringBuilder sb = new StringBuilder("/com-status-award");
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        sb.append(str);
        return m3130G(sb.toString());
    }

    /* JADX INFO: renamed from: i */
    public static String m3237i(String str) {
        return m3130G("/boost/" + str + "/boost-merge");
    }

    /* JADX INFO: renamed from: i0 */
    public static String m3238i0() {
        return m3130G("/intl-pay/native");
    }

    /* JADX INFO: renamed from: i1 */
    public static String m3239i1(String str, String str2) {
        return m3143J0("/quickchat?action=" + str2 + "&version=" + str);
    }

    /* JADX INFO: renamed from: i2 */
    public static String m3240i2(String str) {
        return m3130G("/boost/" + str + "/boost-status?type=spotLight");
    }

    /* JADX INFO: renamed from: j */
    public static String m3241j(String str) {
        return m3130G("/users/" + str + "/user-boot/query/" + str);
    }

    /* JADX INFO: renamed from: j0 */
    public static String m3242j0(String str) {
        return m3130G("/kol/users/" + str + "/recommend");
    }

    /* JADX INFO: renamed from: j1 */
    public static String m3243j1() {
        return m3130G("/quickchat/adbroadcast");
    }

    /* JADX INFO: renamed from: j2 */
    public static final String m3244j2(int i, String str, String str2) {
        return m3130G("/intl-recommend/tribe/message?mcc=" + i + "&groupCategory=" + str + "&subType=" + str2);
    }

    /* JADX INFO: renamed from: k */
    public static String m3245k(String str, int i, String str2) {
        return m3130G("/users/" + str + "/user-boot/start/" + i + "?mcc=" + str2);
    }

    /* JADX INFO: renamed from: k0 */
    public static String m3246k0(String str, String str2) {
        return m3130G("/users/" + str + "/user-recommend/user-like?" + str2);
    }

    /* JADX INFO: renamed from: k1 */
    public static String m3247k1() {
        return m3143J0("/quickchat?action=rejectbroadcast&version=10");
    }

    /* JADX INFO: renamed from: k2 */
    public static final String m3248k2(String str) {
        return m3296w2("?search=selected&mode=" + str);
    }

    /* JADX INFO: renamed from: l */
    public static String m3249l() {
        return m3130G("/intl/activity/camping?mcc=" + qib0.f19808f0);
    }

    /* JADX INFO: renamed from: l0 */
    public static final String m3250l0(String str, long j) {
        return m3296w2("/" + str + "/intl-articles?since=" + j);
    }

    /* JADX INFO: renamed from: l1 */
    public static String m3251l1(String str, String str2, String str3, String str4, String str5) {
        return f3498o + "/oauth2/authorize?client_id=" + str + "&response_type=" + str2 + "&scope=" + str3 + "&redirect_uri=" + str4 + "&state=" + str5;
    }

    /* JADX INFO: renamed from: l2 */
    public static final String m3252l2() {
        return m3296w2("?search=suggested&with=" + f3504u + ",relationships" + m3186U2());
    }

    /* JADX INFO: renamed from: m */
    public static String m3253m(String str) {
        return m3296w2("/" + CoreModule.m1850H().userId() + "/chat-locks/" + str);
    }

    /* JADX INFO: renamed from: m0 */
    public static final String m3254m0(String str, long j) {
        return m3296w2("/" + str + "/intl-banner-activities?since=" + j);
    }

    /* JADX INFO: renamed from: m1 */
    public static String m3255m1(String str, String str2) {
        return f3498o + "/applications/" + str + "?package_name=" + str2;
    }

    /* JADX INFO: renamed from: m2 */
    public static final String m3256m2(boolean z) {
        String strM3252l2;
        if (z) {
            strM3252l2 = m3296w2("?search=suggested&is_encourage_user=true&with=" + f3504u + ",relationships" + m3186U2());
        } else {
            strM3252l2 = m3252l2();
        }
        if ((CoreModule.m1854P().m11711g().m7024yc() || CoreModule.m1854P().m11711g().m6991d9()) && CoreModule.m1854P().m11706a().m5551w()) {
            strM3252l2 = strM3252l2 + ",userActivityInfo";
        }
        if (CoreModule.m1854P().m11706a().m5551w()) {
            strM3252l2 = strM3252l2 + ",liveRoom";
        }
        if (!CoreModule.m1854P().m11706a().m19884f4()) {
            return strM3252l2;
        }
        return strM3252l2 + ",ideal";
    }

    /* JADX INFO: renamed from: n */
    public static String m3257n(String str) {
        return m3137H2("/chat-groups/" + str);
    }

    /* JADX INFO: renamed from: n0 */
    public static String m3258n0(String str) {
        return m3296w2("/" + str + "/user-recommend/intl-pickslist");
    }

    /* JADX INFO: renamed from: n1 */
    public static String m3259n1(String str) {
        return f3502s + str;
    }

    /* JADX INFO: renamed from: n2 */
    public static String m3260n2(String str) {
        return m3143J0("/friends?search=" + str);
    }

    /* JADX INFO: renamed from: o */
    public static String m3261o(String str) {
        return m3137H2("/chat-groups?keyword=" + str + "&with=members,group-applies");
    }

    /* JADX INFO: renamed from: o0 */
    public static String m3262o0() {
        return m3143J0("/user-recommend/intl-picks-idList");
    }

    /* JADX INFO: renamed from: o1 */
    public static String m3263o1(String str) {
        return m3137H2("/group-applies/" + str + "?method=patch");
    }

    /* JADX INFO: renamed from: o2 */
    public static String m3264o2() {
        return m3143J0("/summarized-privileges");
    }

    /* JADX INFO: renamed from: p */
    public static String m3265p() {
        return m3137H2("/search-keywords");
    }

    /* JADX INFO: renamed from: p0 */
    public static String m3266p0() {
        return m3130G("/tab-me/banner");
    }

    /* JADX INFO: renamed from: p1 */
    public static String m3267p1() {
        return m3130G("/users/me/settings?method=patch");
    }

    /* JADX INFO: renamed from: p2 */
    public static String m3268p2() {
        return m3130G("/supremePartner/privateCustom/result");
    }

    /* JADX INFO: renamed from: q */
    public static String m3269q(@Nullable String str) {
        if (vwb.L(str)) {
            return m3137H2("/chat-groups?search=suggested");
        }
        return m3137H2("/chat-groups?search=suggested&tab_id=" + str);
    }

    /* JADX INFO: renamed from: q0 */
    public static String m3270q0() {
        return f3485b + "/oauth2/code";
    }

    /* JADX INFO: renamed from: q1 */
    public static String m3271q1() {
        return m3143J0("/vip-search-settings");
    }

    /* JADX INFO: renamed from: q2 */
    public static String m3272q2(String str) {
        return m3130G("/supremePartner" + str);
    }

    /* JADX INFO: renamed from: r */
    public static String m3273r() {
        return m3137H2("/users/me/notification-counters");
    }

    /* JADX INFO: renamed from: r0 */
    public static String m3274r0(String str) {
        return m3130G("/users/me/visitor-list?" + str);
    }

    /* JADX INFO: renamed from: r1 */
    public static String m3275r1(String str) {
        return m3259n1("/orders/" + str);
    }

    /* JADX INFO: renamed from: r2 */
    public static String m3276r2(String str) {
        return m3130G("/surveys" + str);
    }

    /* JADX INFO: renamed from: s */
    public static String m3277s() {
        return m3137H2("/group-settings");
    }

    /* JADX INFO: renamed from: s0 */
    public static String m3278s0() {
        return m3130G("/users/me/visitor-access");
    }

    /* JADX INFO: renamed from: s1 */
    public static String m3279s1() {
        return m3259n1("/pending-payment/guidance");
    }

    /* JADX INFO: renamed from: s2 */
    public static String m3280s2(String str, String str2) {
        StringBuilder sb = new StringBuilder("/verifications/");
        sb.append(str);
        sb.append("?method=delete&verification=idCard");
        sb.append(TextUtils.isEmpty(str2) ? "" : "&productId=6");
        return m3143J0(sb.toString());
    }

    /* JADX INFO: renamed from: t */
    public static String m3281t(String str, String str2) {
        return m3137H2("/chat-groups/" + str + "/members/" + str2);
    }

    /* JADX INFO: renamed from: t0 */
    public static String m3282t0() {
        return m3130G("/users/me/visitor-all-count");
    }

    /* JADX INFO: renamed from: t1 */
    public static String m3283t1() {
        return m3143J0("/picks");
    }

    /* JADX INFO: renamed from: t2 */
    public static String m3284t2(String str) {
        return m3130G("/users/" + str + "/verification-tokens");
    }

    /* JADX INFO: renamed from: u */
    public static String m3285u() {
        return m3141I2("/conversations?with=" + f3506w + "," + f3508y + "," + f3509z + "," + f3468A + "," + f3471D + "," + f3472E + "&limit=20&filter=default&search=unhandled&offset=0");
    }

    /* JADX INFO: renamed from: u0 */
    public static String m3286u0() {
        return m3130G("/users/me/visitor-count");
    }

    /* JADX INFO: renamed from: u1 */
    public static String m3287u1(String str) {
        return m3296w2("/" + str + "/picks/list");
    }

    /* JADX INFO: renamed from: u2 */
    public static String m3288u2() {
        return m3296w2("/me/currency-code");
    }

    /* JADX INFO: renamed from: v */
    public static String m3289v() {
        return m3296w2("/" + CoreModule.m1850H().userId() + "/native/checkoutContract-tab/visibility");
    }

    /* JADX INFO: renamed from: v0 */
    public static String m3290v0() {
        return m3130G("/users/me/withdraw_open");
    }

    /* JADX INFO: renamed from: v1 */
    public static String m3291v1(String str) {
        return m3130G("/users/" + str + "/verifications/" + str);
    }

    /* JADX INFO: renamed from: v2 */
    public static String m3292v2(String str) {
        return m3296w2("/" + str + "?with=" + f3503t + m3186U2() + m3189V2() + m3201Y2() + m3178S2());
    }

    /* JADX INFO: renamed from: w */
    public static String m3293w(String str) {
        return f3489f + str;
    }

    /* JADX INFO: renamed from: w0 */
    public static String m3294w0() {
        return m3130G("/live/accesscontrol/judge?osName=android&campaignType=idGreedy");
    }

    /* JADX INFO: renamed from: w1 */
    public static String m3295w1(String str) {
        return m3130G("/users/" + str + "/verifications/" + str + "?method=patch");
    }

    /* JADX INFO: renamed from: w2 */
    public static String m3296w2(String str) {
        return m3130G("/users" + str);
    }

    /* JADX INFO: renamed from: x */
    public static String m3297x(String str) {
        if (ura.m25555e().m25559d().m5613E()) {
            return m3141I2("/conversations/" + str + "?with=" + f3506w + "," + f3508y + "," + f3509z + "," + f3468A + "," + f3472E);
        }
        return m3143J0("/conversations/" + str + "?with=" + f3506w + "," + f3508y + "," + f3509z + "," + f3468A + "," + f3472E);
    }

    /* JADX INFO: renamed from: x0 */
    public static String m3298x0(String str) {
        return m3130G("/monetization" + str);
    }

    /* JADX INFO: renamed from: x1 */
    public static String m3299x1(String str) {
        return m3130G("/surveys" + str + "/answers?with=surveys");
    }

    /* JADX INFO: renamed from: x2 */
    public static String m3300x2(String str) {
        return m3296w2("/me/conversations/" + str + "?method=patch");
    }

    /* JADX INFO: renamed from: y */
    public static String m3301y(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            str2 = "&" + str;
        }
        if (!ura.m25555e().m25559d().m5613E()) {
            return m3143J0("/conversations?with=" + f3506w + "," + f3508y + "," + f3509z + "," + f3468A + "," + f3472E + str2);
        }
        return m3141I2("/conversations?with=" + f3506w + "," + f3508y + "," + f3509z + "," + f3468A + "," + f3471D + "," + f3472E + str2.concat("&filter=default"));
    }

    /* JADX INFO: renamed from: y0 */
    public static String m3302y0(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            str2 = "&" + str;
        }
        if (!ura.m25555e().m25559d().m5613E()) {
            return m3143J0("/latest-conversations?with=" + f3506w + "," + f3508y + "," + f3509z + "," + f3468A + "," + f3472E + str2);
        }
        return m3141I2("/conversations?with=" + f3506w + "," + f3508y + "," + f3509z + "," + f3468A + "," + f3471D + "," + f3472E + str2).replace("filter=default", "");
    }

    /* JADX INFO: renamed from: y1 */
    public static String m3303y1() {
        return m3130G("/profile-like");
    }

    /* JADX INFO: renamed from: y2 */
    public static String m3304y2(String str) {
        return m3130G("/user-counters/" + str);
    }

    /* JADX INFO: renamed from: z */
    public static String m3305z() {
        return ura.m25555e().m25559d().m5613E() ? m3141I2("/conversations") : m3143J0("/conversations");
    }

    /* JADX INFO: renamed from: z0 */
    public static String m3306z0(String str) {
        return m3130G("/liked-users?" + str);
    }

    /* JADX INFO: renamed from: z1 */
    public static String m3307z1() {
        return m3130G("/profile-like-chat");
    }

    /* JADX INFO: renamed from: z2 */
    public static String m3308z2(String str) {
        return m3296w2("/" + str + "/live-hierarchy");
    }

    /* JADX INFO: renamed from: N2 */
    public String m3309N2() {
        return m3130G("/wallet_accounts?business_type=monetization");
    }

    /* JADX INFO: renamed from: O2 */
    public String m3310O2(String str, String str2) {
        return m3130G("/wallet_accounts/" + str + "/account_records?record_type=" + str2);
    }

    /* JADX INFO: renamed from: P2 */
    public String m3311P2(String str) {
        return m3130G("/wallet_accounts/" + str + "/account_records");
    }

    /* JADX INFO: renamed from: V1 */
    public String m3312V1() {
        return m3130G("/refund-details/svip");
    }

    public C0154a(RunnerProxy runnerProxy) {
        super(runnerProxy);
        final CoreProviderInterface coreProviderInterfaceM25559d = ura.m25555e().m25559d();
        Objects.requireNonNull(coreProviderInterfaceM25559d);
        setErrorHandler(new w9j() { // from class: l.kt0
            public final Object call(Object obj) {
                return coreProviderInterfaceM25559d.m5808kd((Throwable) obj);
            }
        });
    }
}
