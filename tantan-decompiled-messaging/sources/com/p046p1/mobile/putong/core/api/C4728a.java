package com.p046p1.mobile.putong.core.api;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface;
import com.p046p1.mobile.putong.data.LinkAction;
import com.p046p1.mobile.putong.data.Moments;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.tantanapp.common.network.RunnerProxy;
import io.agora.base.internal.voiceengine.earmonitor.HardwareEarMonitorUtils;
import java.util.HashMap;
import java.util.Objects;
import p133rx.C22306c;
import p149l.a3e0;
import p149l.i0g0;
import p149l.j2e0;
import p149l.mkd0;
import p149l.mu5;
import p149l.qib0;
import p149l.ura;
import p149l.vwb;
import p149l.w9j;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.a */
/* JADX INFO: loaded from: classes9.dex */
public class C4728a extends RunnerProxy {

    /* JADX INFO: renamed from: A */
    public static String f19479A;

    /* JADX INFO: renamed from: B */
    public static String f19480B;

    /* JADX INFO: renamed from: C */
    public static String f19481C;

    /* JADX INFO: renamed from: D */
    public static String f19482D;

    /* JADX INFO: renamed from: E */
    public static String f19483E;

    /* JADX INFO: renamed from: F */
    public static String f19484F;

    /* JADX INFO: renamed from: G */
    public static String f19485G;

    /* JADX INFO: renamed from: H */
    public static String f19486H;

    /* JADX INFO: renamed from: I */
    public static String f19487I;

    /* JADX INFO: renamed from: J */
    public static String f19488J;

    /* JADX INFO: renamed from: K */
    public static final String f19489K;

    /* JADX INFO: renamed from: L */
    public static int f19490L;

    /* JADX INFO: renamed from: M */
    public static int f19491M;

    /* JADX INFO: renamed from: N */
    public static int f19492N;

    /* JADX INFO: renamed from: O */
    public static int f19493O;

    /* JADX INFO: renamed from: P */
    public static Network f19494P;

    /* JADX INFO: renamed from: a */
    public static final String f19495a = mu5.f135738f + "/v1";

    /* JADX INFO: renamed from: b */
    public static final String f19496b = mu5.f135754v + "/v2";

    /* JADX INFO: renamed from: c */
    public static final String f19497c;

    /* JADX INFO: renamed from: d */
    public static final String f19498d;

    /* JADX INFO: renamed from: e */
    public static final String f19499e;

    /* JADX INFO: renamed from: f */
    public static final String f19500f;

    /* JADX INFO: renamed from: g */
    public static final String f19501g;

    /* JADX INFO: renamed from: h */
    public static final String f19502h;

    /* JADX INFO: renamed from: i */
    public static final String f19503i;

    /* JADX INFO: renamed from: j */
    public static final String f19504j;

    /* JADX INFO: renamed from: k */
    public static final String f19505k;

    /* JADX INFO: renamed from: l */
    public static final String f19506l;

    /* JADX INFO: renamed from: m */
    public static final String f19507m;

    /* JADX INFO: renamed from: n */
    public static final String f19508n;

    /* JADX INFO: renamed from: o */
    public static final String f19509o;

    /* JADX INFO: renamed from: p */
    public static final String f19510p;

    /* JADX INFO: renamed from: q */
    public static final String f19511q;

    /* JADX INFO: renamed from: r */
    public static final String f19512r;

    /* JADX INFO: renamed from: s */
    public static final String f19513s;

    /* JADX INFO: renamed from: t */
    public static String f19514t;

    /* JADX INFO: renamed from: u */
    public static String f19515u;

    /* JADX INFO: renamed from: v */
    public static String f19516v;

    /* JADX INFO: renamed from: w */
    public static String f19517w;

    /* JADX INFO: renamed from: x */
    public static String f19518x;

    /* JADX INFO: renamed from: y */
    public static String f19519y;

    /* JADX INFO: renamed from: z */
    public static String f19520z;

    static {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = mu5.f135737e;
        sb.append(str2);
        sb.append("/v1");
        f19497c = sb.toString();
        f19498d = str2 + "/v2";
        f19499e = str2 + "/v3";
        f19500f = mu5.f135739g + "/v1";
        f19501g = mu5.f135742j;
        f19502h = mu5.f135743k + "/v1";
        f19503i = mu5.f135744l;
        f19504j = mu5.f135745m;
        f19505k = mu5.f135746n + "/v1";
        f19506l = mu5.f135747o;
        f19507m = mu5.f135748p;
        f19508n = mu5.f135751s;
        if (mu5.f135733a.get().contains("staging")) {
            str = mu5.f135752t.replace("https://", "http://") + "/v1";
        } else {
            str = mu5.f135752t.replace("http://", "https://") + "/v1";
        }
        f19509o = str;
        f19510p = mu5.f135753u + "/v1";
        f19511q = mu5.f135756x;
        f19512r = mu5.f135758z;
        f19513s = mu5.f135757y + "/v1";
        f19514t = "contacts,questions,followships,groupSettings,verifications";
        f19515u = "contacts,questions,followships,user.publicMoments";
        f19516v = "questions,stickers";
        f19517w = "relationships";
        f19518x = "relationships,moments";
        f19519y = "users," + f19514t;
        f19520z = "messages," + f19516v;
        f19479A = Moments.TYPE;
        f19480B = "members";
        f19481C = "relationships";
        f19482D = "chat-groups,members";
        f19483E = "gifts";
        f19484F = "states";
        f19485G = "dynamic_moments";
        f19486H = "limit=100";
        f19487I = "limit=20";
        f19488J = "";
        f19489K = m31366w2("?search=suggested&limit=100&with=" + f19514t);
        f19490L = 1;
        f19491M = 2;
        f19492N = 4;
        f19493O = 8;
        f19494P = qib0.f154693H;
    }

    public C4728a() {
        final CoreProviderInterface coreProviderInterfaceM195057d = ura.m195053e().m195057d();
        Objects.requireNonNull(coreProviderInterfaceM195057d);
        setErrorHandler(new w9j() { // from class: l.kt0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return coreProviderInterfaceM195057d.mo33871kd((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: A */
    public static String m31176A(String str) {
        if (ura.m195053e().m195057d().mo33676E()) {
            return m31211I2("/conversations/" + str + "?with=" + f19518x);
        }
        return m31213J0("/conversations/" + str + "?with=" + f19518x);
    }

    /* JADX INFO: renamed from: A0 */
    public static String m31177A0(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            str2 = "&" + str;
        }
        return m31366w2("?search=whoLikedMe&with=" + f19515u + ",relationships" + str2);
    }

    /* JADX INFO: renamed from: A1 */
    public static String m31178A1(String str) {
        StringBuilder sb = new StringBuilder("/cms/");
        sb.append(str);
        sb.append("/promotionInfo?affiliate=");
        sb.append(IntlCountryCodeController.m28115k() ? HardwareEarMonitorUtils.MANUFACTURER_HUAWEI : "googleplay");
        sb.append("&mcc=");
        sb.append(qib0.f154717f0);
        return m31200G(sb.toString());
    }

    /* JADX INFO: renamed from: A2 */
    public static final String m31179A2(String str) {
        HashMap<String, String> mapM139448o = j2e0.m139448o(Uri.parse(str));
        String str2 = mapM139448o.get(Oauth2AccessToken.KEY_UID);
        mapM139448o.remove(Oauth2AccessToken.KEY_UID);
        if (TextUtils.isEmpty(mapM139448o.get("src"))) {
            mapM139448o.put("src", LinkAction.deeplink);
        }
        return m31366w2("/" + str2 + j2e0.m139435b(mapM139448o));
    }

    /* JADX INFO: renamed from: B */
    public static String m31180B(String str) {
        return m31213J0("/conversations?filter=dismissed&with=" + f19519y + Constants.SEPARATOR_COMMA + f19481C + "&" + str);
    }

    /* JADX INFO: renamed from: B0 */
    public static String m31181B0() {
        return m31200G("/same/start");
    }

    /* JADX INFO: renamed from: B1 */
    public static String m31182B1() {
        return m31200G("/monetization-promotions");
    }

    /* JADX INFO: renamed from: B2 */
    public static String m31183B2(String str) {
        return m31200G("/users/" + str + "/user-recommend/recommend?mcc=" + qib0.f154717f0 + "&region=" + qib0.f154719h0 + "&language=" + i0g0.m133885y());
    }

    /* JADX INFO: renamed from: C */
    public static String m31184C(String str) {
        return m31375z() + "?search=newMatch&sort=createdTime&conditions=" + str + "&limit=20&with=" + f19517w + Constants.SEPARATOR_COMMA + f19519y + Constants.SEPARATOR_COMMA + f19520z + Constants.SEPARATOR_COMMA + f19479A + Constants.SEPARATOR_COMMA + f19483E;
    }

    /* JADX INFO: renamed from: C0 */
    public static String m31185C0(String str, String str2) {
        return m31366w2("/" + str + "/live-recommend/cancel/" + str2);
    }

    /* JADX INFO: renamed from: C1 */
    public static String m31186C1(String str) {
        return m31329n1("/contracts/" + str + "/orders");
    }

    /* JADX INFO: renamed from: C2 */
    public static final String m31187C2(String str) {
        return m31366w2("/" + str + "?search=superlike-relationship&with=" + f19514t + ",relationships");
    }

    /* JADX INFO: renamed from: D */
    public static String m31188D() {
        return m31200G("/monetization-chat/instantChat");
    }

    /* JADX INFO: renamed from: D0 */
    public static String m31189D0(String str, String str2) {
        return m31366w2("/" + str + "/live-recommend/enter/" + str2);
    }

    /* JADX INFO: renamed from: D1 */
    public static String m31190D1(String str) {
        return m31200G("/users/" + str + "/user-seeEntry/maxPop?mcc=" + qib0.f154717f0);
    }

    /* JADX INFO: renamed from: D2 */
    public static String m31191D2(String str) {
        return m31366w2("/" + str);
    }

    /* JADX INFO: renamed from: E */
    public static String m31192E() {
        return m31200G("/monetization-chat/instantChat?method=delete");
    }

    /* JADX INFO: renamed from: E0 */
    public static String m31193E0(String str) {
        return m31200G("/memojiBuzz" + str);
    }

    /* JADX INFO: renamed from: E1 */
    public static String m31194E1(String str) {
        return m31200G("/users/" + str + "/tarot/query");
    }

    /* JADX INFO: renamed from: E2 */
    public static String m31195E2(String str) {
        return m31366w2("/" + str + "?with=" + f19514t + ",passby");
    }

    /* JADX INFO: renamed from: F */
    public static String m31196F(String str) {
        return m31375z() + "?search=quickFilter&sort=latestMessageTime&conditions=" + str + "&ids=" + CoreModule.f17545c.f19642f0.f19921a2 + "&limit=20&with=" + f19517w + Constants.SEPARATOR_COMMA + f19519y + Constants.SEPARATOR_COMMA + f19520z + Constants.SEPARATOR_COMMA + f19479A + Constants.SEPARATOR_COMMA + f19483E;
    }

    /* JADX INFO: renamed from: F0 */
    public static String m31197F0(String str) {
        return m31200G("/textBuzz" + str);
    }

    /* JADX INFO: renamed from: F1 */
    public static String m31198F1() {
        return m31200G("/quickchat-voice/me");
    }

    /* JADX INFO: renamed from: F2 */
    public static String m31199F2(String str) {
        return m31366w2("/" + str + "?with=" + f19515u + m31256U2() + m31259V2() + m31271Y2());
    }

    /* JADX INFO: renamed from: G */
    public static String m31200G(String str) {
        return f19498d + str;
    }

    /* JADX INFO: renamed from: G0 */
    public static String m31201G0(String str) {
        return m31200G("/videoBuzz" + str);
    }

    /* JADX INFO: renamed from: G1 */
    public static String m31202G1() {
        return m31200G("/quickchat-party/campaign");
    }

    /* JADX INFO: renamed from: G2 */
    public static String m31203G2(String str) {
        return m31366w2("/" + str + "?with=" + f19514t + ",relationships");
    }

    /* JADX INFO: renamed from: H */
    public static String m31204H(String str) {
        return f19497c + str;
    }

    /* JADX INFO: renamed from: H0 */
    public static String m31205H0(String str) {
        return m31200G("/voiceBuzz" + str);
    }

    /* JADX INFO: renamed from: H1 */
    public static String m31206H1() {
        return m31200G("/quickchat-oneside/me");
    }

    /* JADX INFO: renamed from: H2 */
    public static String m31207H2(String str) {
        return f19499e + str;
    }

    /* JADX INFO: renamed from: I */
    public static String m31208I(String str, String str2) {
        return m31200G("/users/" + str + "/tarot/create?mcc=" + str2);
    }

    /* JADX INFO: renamed from: I0 */
    public static String m31209I0() {
        return m31200G("/intl/activity/general");
    }

    /* JADX INFO: renamed from: I1 */
    public static String m31210I1() {
        return m31200G("/quickchat-party/campaign-page");
    }

    /* JADX INFO: renamed from: I2 */
    public static String m31211I2(String str) {
        return m31215J2("/me" + str);
    }

    /* JADX INFO: renamed from: J */
    public static String m31212J(String str, String str2) {
        StringBuilder sb = new StringBuilder("/users/");
        sb.append(str);
        sb.append("/verifications/");
        sb.append(str);
        sb.append("?verification=picture");
        sb.append(TextUtils.isEmpty(str2) ? "" : "&productId=6");
        return m31200G(sb.toString());
    }

    /* JADX INFO: renamed from: J0 */
    public static String m31213J0(String str) {
        return m31366w2("/me" + str);
    }

    /* JADX INFO: renamed from: J1 */
    public static String m31214J1() {
        return m31200G("/quickchat-party/invitation");
    }

    /* JADX INFO: renamed from: J2 */
    public static String m31215J2(String str) {
        return m31207H2("/users" + str);
    }

    /* JADX INFO: renamed from: K */
    public static String m31216K(String str, String str2, String str3) {
        return m31366w2("/" + str + "/moments/" + str2 + "/messages/" + str3);
    }

    /* JADX INFO: renamed from: K0 */
    public static String m31217K0(String str) {
        return m31213J0("/mymeet/entry/v4" + str);
    }

    /* JADX INFO: renamed from: K1 */
    public static String m31218K1(String str) {
        return m31200G("/quickchat-voice" + str);
    }

    /* JADX INFO: renamed from: K2 */
    public static String m31219K2(String str) {
        return m31215J2("/me/conversations/" + str + "?method=patch");
    }

    /* JADX INFO: renamed from: L */
    public static String m31220L(String str) {
        return m31200G("/users/" + str + "/verifications/" + str + "?process=new");
    }

    /* JADX INFO: renamed from: L0 */
    public static String m31221L0(String str) {
        return m31213J0("/mymeet-gifts/" + str);
    }

    /* JADX INFO: renamed from: L1 */
    public static String m31222L1() {
        return m31200G("/boost-status");
    }

    /* JADX INFO: renamed from: L2 */
    public static String m31223L2(String str) {
        return m31366w2("/" + str + "/visitor/counter");
    }

    /* JADX INFO: renamed from: M */
    public static String m31224M(String str) {
        return a3e0.m94685a(f19511q + "/" + str);
    }

    /* JADX INFO: renamed from: M0 */
    public static String m31225M0() {
        return m31213J0("/mymeet/live/v3");
    }

    /* JADX INFO: renamed from: M1 */
    public static String m31226M1(String str) {
        return m31200G("/quickchat" + str);
    }

    /* JADX INFO: renamed from: M2 */
    public static String m31227M2() {
        return m31200G("/users/me/wallet");
    }

    /* JADX INFO: renamed from: N */
    public static String m31228N() {
        return m31200G("/com-freetrial");
    }

    /* JADX INFO: renamed from: N0 */
    public static String m31229N0(String str) {
        return m31366w2("/" + str + "/odiamond-feed/list");
    }

    /* JADX INFO: renamed from: N1 */
    public static String m31230N1() {
        return m31200G("/quickchat-bell/me");
    }

    /* JADX INFO: renamed from: O */
    public static String m31231O() {
        return m31200G("/gift-infos");
    }

    /* JADX INFO: renamed from: O0 */
    public static String m31232O0(String str, String str2, boolean z) {
        if (!ura.m195053e().m195057d().mo33676E()) {
            StringBuilder sb = new StringBuilder("/conversations/");
            sb.append(str);
            sb.append("/messages/");
            sb.append(str2);
            sb.append("?with=");
            sb.append(f19516v);
            sb.append(Constants.SEPARATOR_COMMA);
            sb.append(f19479A);
            sb.append(Constants.SEPARATOR_COMMA);
            sb.append(f19483E);
            sb.append(Constants.SEPARATOR_COMMA);
            sb.append(f19484F);
            sb.append(m31259V2());
            sb.append(z ? "&anyStatus=true" : "");
            return m31213J0(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder("/conversations/");
        sb2.append(str);
        sb2.append("/messages/");
        sb2.append(str2);
        sb2.append("?with=");
        sb2.append(f19516v);
        sb2.append(Constants.SEPARATOR_COMMA);
        sb2.append(f19479A);
        sb2.append(Constants.SEPARATOR_COMMA);
        sb2.append(f19480B);
        sb2.append(Constants.SEPARATOR_COMMA);
        sb2.append(f19483E);
        sb2.append(Constants.SEPARATOR_COMMA);
        sb2.append(f19484F);
        sb2.append(m31259V2());
        sb2.append(z ? "&anyStatus=true" : "");
        return m31211I2(sb2.toString());
    }

    /* JADX INFO: renamed from: O1 */
    public static String m31233O1() {
        return m31200G("/quickchat/conversations");
    }

    /* JADX INFO: renamed from: P */
    public static String m31234P(String str) {
        return m31200G("/gift-panels" + str);
    }

    /* JADX INFO: renamed from: P0 */
    public static String m31235P0(String str, String str2) {
        String str3;
        if (TextUtils.isEmpty(str2)) {
            str3 = "";
        } else {
            str3 = "&" + str2;
        }
        if (ura.m195053e().m195057d().mo33676E()) {
            return m31211I2("/conversations/" + str + "/messages?with=" + f19516v + Constants.SEPARATOR_COMMA + f19479A + ",members," + f19483E + Constants.SEPARATOR_COMMA + f19484F + m31259V2() + str3);
        }
        return m31213J0("/conversations/" + str + "/messages?with=" + f19516v + Constants.SEPARATOR_COMMA + f19479A + Constants.SEPARATOR_COMMA + f19483E + Constants.SEPARATOR_COMMA + f19484F + m31259V2() + str3);
    }

    /* JADX INFO: renamed from: P1 */
    public static String m31236P1() {
        return m31226M1("/me");
    }

    /* JADX INFO: renamed from: Q */
    public static String m31237Q() {
        return m31200G("/gift-records");
    }

    /* JADX INFO: renamed from: Q0 */
    public static String m31238Q0(String str) {
        if (ura.m195053e().m195057d().mo33676E()) {
            return m31211I2("/conversations/" + str + "/messages?with=" + f19516v + Constants.SEPARATOR_COMMA + f19479A + Constants.SEPARATOR_COMMA + f19483E + Constants.SEPARATOR_COMMA + f19484F + m31259V2());
        }
        return m31213J0("/conversations/" + str + "/messages?with=" + f19516v + Constants.SEPARATOR_COMMA + f19479A + Constants.SEPARATOR_COMMA + f19483E + Constants.SEPARATOR_COMMA + f19484F + m31259V2());
    }

    /* JADX INFO: renamed from: Q1 */
    public static String m31239Q1() {
        return m31200G("/quickchat-speed/me");
    }

    /* JADX INFO: renamed from: Q2 */
    public static String m31240Q2() {
        return m31329n1("/auto-deducts");
    }

    /* JADX INFO: renamed from: R */
    public static String m31241R(String str) {
        return m31213J0("/gift-records/" + str);
    }

    /* JADX INFO: renamed from: R0 */
    public static String m31242R0(String str, String str2) {
        if (!ura.m195053e().m195057d().mo33676E()) {
            return m31213J0("/conversations/" + str + "/messages/" + str2 + "?with=" + f19516v + Constants.SEPARATOR_COMMA + f19479A + Constants.SEPARATOR_COMMA + f19483E + Constants.SEPARATOR_COMMA + f19484F + m31259V2());
        }
        return m31211I2("/conversations/" + str + "/messages/" + str2 + "?with=" + f19516v + Constants.SEPARATOR_COMMA + f19479A + Constants.SEPARATOR_COMMA + f19480B + Constants.SEPARATOR_COMMA + f19483E + Constants.SEPARATOR_COMMA + f19484F + m31259V2());
    }

    /* JADX INFO: renamed from: R1 */
    public static String m31243R1(String str, String str2) {
        return m31200G("/users/" + str + "/advert/tantan-advert/ok?advertId=" + str2);
    }

    /* JADX INFO: renamed from: R2 */
    public static String m31244R2(String str) {
        return m31329n1(String.format("/contracts/%s/orders?filter=latestOrder", str));
    }

    /* JADX INFO: renamed from: S */
    public static String m31245S() {
        return m31200G("/privilege-gift-remaining");
    }

    /* JADX INFO: renamed from: S0 */
    public static String m31246S0(String str, String str2) {
        String str3;
        if (TextUtils.isEmpty(str2)) {
            str3 = "";
        } else {
            str3 = "&" + str2;
        }
        return m31213J0("/contacts?search=mutual&query=" + str + str3);
    }

    /* JADX INFO: renamed from: S1 */
    public static String m31247S1() {
        return m31200G("/monetization/seeExposedUser");
    }

    /* JADX INFO: renamed from: S2 */
    public static String m31248S2() {
        return (CoreModule.m29935P().m94656g().mo35087yc() || CoreModule.m29935P().m94656g().mo35054d9()) ? ",userActivityInfo" : "";
    }

    /* JADX INFO: renamed from: T */
    public static String m31249T(String str) {
        return m31200G("/boost/" + str + "/gift?type=spotLight&mcc=" + qib0.f154717f0);
    }

    /* JADX INFO: renamed from: T0 */
    public static String m31250T0() {
        return m31213J0("?method=patch");
    }

    /* JADX INFO: renamed from: T1 */
    public static String m31251T1(String str, String str2) {
        return m31200G("/users/" + str + "/tarot/recommend?mcc=" + str2);
    }

    /* JADX INFO: renamed from: T2 */
    public static <T> C22306c.d<T, T> m31252T2() {
        return mkd0.m154951C();
    }

    /* JADX INFO: renamed from: U */
    public static String m31253U(String str) {
        return m31213J0("/greet-gifts/" + str);
    }

    /* JADX INFO: renamed from: U0 */
    public static String m31254U0(String str) {
        return m31207H2("/users/me" + str);
    }

    /* JADX INFO: renamed from: U1 */
    public static String m31255U1(String str, String str2) {
        return m31200G("/mkt/" + str + "/suggest?mcc=" + str2);
    }

    /* JADX INFO: renamed from: U2 */
    public static String m31256U2() {
        return ura.m195053e().m195057d().mo33802b() ? ",lives" : "";
    }

    /* JADX INFO: renamed from: V */
    public static String m31257V() {
        return m31207H2("/users/me/group-attributes");
    }

    /* JADX INFO: renamed from: V0 */
    public static String m31258V0(String str, String str2, String str3) {
        return m31366w2("/" + str + "/moments/" + str2 + "/messages?with=" + f19516v + "&page_id=" + str3);
    }

    /* JADX INFO: renamed from: V2 */
    public static String m31259V2() {
        return ",literatures";
    }

    /* JADX INFO: renamed from: W */
    public static String m31260W() {
        return m31207H2("/chat-groups");
    }

    /* JADX INFO: renamed from: W0 */
    public static String m31261W0() {
        return m31200G("/monetization/configuration");
    }

    /* JADX INFO: renamed from: W1 */
    public static String m31262W1(String str) {
        return m31200G(String.format("/users/me/renewable/contractInfos?scenario=%s", str));
    }

    /* JADX INFO: renamed from: W2 */
    public static double m31263W2() {
        return qib0.f154693H.guessedCurrentServerTime();
    }

    /* JADX INFO: renamed from: X */
    public static String m31264X() {
        return m31207H2("/users/me/group-notifications?limit=20&with=users,group-applies,chat-groups");
    }

    /* JADX INFO: renamed from: X0 */
    public static String m31265X0() {
        return m31200G("/monetization/configuration?query=nearbyBlock");
    }

    /* JADX INFO: renamed from: X1 */
    public static String m31266X1() {
        return m31200G("/rtc");
    }

    /* JADX INFO: renamed from: X2 */
    public static double m31267X2(double d) {
        return d + 1.0d;
    }

    /* JADX INFO: renamed from: Y */
    public static String m31268Y(String str) {
        return mu5.f135746n + "/v2" + str;
    }

    /* JADX INFO: renamed from: Y0 */
    public static String m31269Y0(String str) {
        return m31200G("/monetizationMsg/coin");
    }

    /* JADX INFO: renamed from: Y1 */
    public static String m31270Y1(int i) {
        return m31266X1() + "-users/" + i;
    }

    /* JADX INFO: renamed from: Y2 */
    public static String m31271Y2() {
        String str = ura.m195053e().m195057d().mo33940w() ? ",pictureTags" : "";
        return ura.m195053e().m195057d().mo33947xh() ? str.concat(",idealType") : str;
    }

    /* JADX INFO: renamed from: Z */
    public static String m31272Z(String str) {
        return f19506l + str;
    }

    /* JADX INFO: renamed from: Z0 */
    public static String m31273Z0(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            str2 = "&" + str;
        }
        return m31200G("/users?search=nearby".concat(str2));
    }

    /* JADX INFO: renamed from: Z1 */
    public static String m31274Z1() {
        return m31200G("/see-trial/eligible");
    }

    /* JADX INFO: renamed from: a */
    public static String m31275a(String str) {
        return f19496b + str;
    }

    /* JADX INFO: renamed from: a0 */
    public static String m31276a0(String str) {
        return m31200G("/users/" + str + "/intl-paycools-merchandises?currencyCode=PHP");
    }

    /* JADX INFO: renamed from: a1 */
    public static String m31277a1() {
        return m31200G("/users?search=nearbyCount");
    }

    /* JADX INFO: renamed from: a2 */
    public static String m31278a2() {
        return m31200G("/see-trial/status");
    }

    /* JADX INFO: renamed from: b */
    public static String m31279b(String str) {
        return m31200G("/users/me/verifications/" + str);
    }

    /* JADX INFO: renamed from: b0 */
    public static String m31280b0(String str) {
        return m31200G("/users/" + str + "/intl-settings");
    }

    /* JADX INFO: renamed from: b1 */
    public static String m31281b1(String str) {
        return m31200G("/new-gift-walls?action=" + str);
    }

    /* JADX INFO: renamed from: b2 */
    public static String m31282b2() {
        return m31200G("/see-trial/wait-start");
    }

    /* JADX INFO: renamed from: c */
    public static String m31283c(String str) {
        return m31200G("/chat/ai-advisor" + str);
    }

    /* JADX INFO: renamed from: c0 */
    public static String m31284c0(String str) {
        return m31200G("/users/" + str + "/intl-paycools-orderlist");
    }

    /* JADX INFO: renamed from: c1 */
    public static String m31285c1(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            str2 = "&" + str;
        }
        return m31366w2("?search=whoLikedMe".concat(str2));
    }

    /* JADX INFO: renamed from: c2 */
    public static String m31286c2() {
        return m31200G("/users/me/settings");
    }

    /* JADX INFO: renamed from: d */
    public static String m31287d(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            str2 = "&" + str;
        }
        String strConcat = str2.concat("&filter=missed");
        if (!ura.m195053e().m195057d().mo33676E()) {
            return m31211I2("/conversations?with=" + f19517w + Constants.SEPARATOR_COMMA + f19519y + Constants.SEPARATOR_COMMA + f19520z + Constants.SEPARATOR_COMMA + f19479A + Constants.SEPARATOR_COMMA + f19483E + strConcat);
        }
        return m31211I2("/conversations?with=" + f19517w + Constants.SEPARATOR_COMMA + f19519y + Constants.SEPARATOR_COMMA + f19520z + Constants.SEPARATOR_COMMA + f19479A + Constants.SEPARATOR_COMMA + f19482D + Constants.SEPARATOR_COMMA + f19483E + strConcat);
    }

    /* JADX INFO: renamed from: d0 */
    public static String m31288d0() {
        return m31200G("/getPromotions?affiliate=googleplay&mcc=" + qib0.f154717f0);
    }

    /* JADX INFO: renamed from: d1 */
    public static String m31289d1(String str) {
        return m31213J0("/mymeet/entry/v3" + str);
    }

    /* JADX INFO: renamed from: d2 */
    public static String m31290d2() {
        return m31200G("/intl/activity/love520");
    }

    /* JADX INFO: renamed from: e */
    public static String m31291e(String str) {
        return m31200G("/users/" + str + "/advert/award-counter/award");
    }

    /* JADX INFO: renamed from: e0 */
    public static String m31292e0(String str) {
        return m31213J0("/instant-chat/" + str);
    }

    /* JADX INFO: renamed from: e1 */
    public static String m31293e1(String str) {
        return m31213J0("/mymeet/list/v3" + str);
    }

    /* JADX INFO: renamed from: e2 */
    public static String m31294e2(String str) {
        return m31366w2("/" + str + "/special-cards");
    }

    /* JADX INFO: renamed from: f */
    public static String m31295f(String str) {
        return m31200G("/users/" + str + "/advert/award-counter/query");
    }

    /* JADX INFO: renamed from: f0 */
    public static String m31296f0() {
        return m31200G("/live-wallet/intl/diamond/change");
    }

    /* JADX INFO: renamed from: f1 */
    public static String m31297f1() {
        return m31213J0("/mymeet/read/v3");
    }

    /* JADX INFO: renamed from: f2 */
    public static String m31298f2() {
        return m31200G("/intl/boost/force-like");
    }

    /* JADX INFO: renamed from: g */
    public static String m31299g(String str, String str2, String str3, int i) {
        return m31200G("/users/" + str + "/user-boot/cancel/" + str2 + "?mcc=" + str3 + "&cardId=" + i);
    }

    /* JADX INFO: renamed from: g0 */
    public static String m31300g0() {
        return m31200G("/live-wallet/intl/diamond/canChange");
    }

    /* JADX INFO: renamed from: g1 */
    public static String m31301g1(String str) {
        return m31200G("/users/" + str + "/advert/tantan-advert/query?mcc=" + qib0.f154717f0);
    }

    /* JADX INFO: renamed from: g2 */
    public static String m31302g2(String str) {
        return m31200G("/boost/" + str + "/boost-start");
    }

    /* JADX INFO: renamed from: h */
    public static String m31303h(String str, String str2, String str3, int i) {
        return m31200G("/users/" + str + "/user-boot/like/" + str2 + "?mcc=" + str3 + "&cardId=" + i);
    }

    /* JADX INFO: renamed from: h0 */
    public static String m31304h0(String str) {
        return m31200G("/users/" + str + "/diamond?agent=true");
    }

    /* JADX INFO: renamed from: h1 */
    public static String m31305h1() {
        return m31213J0("/quickchat?action=acceptbroadcast&version=10");
    }

    /* JADX INFO: renamed from: h2 */
    public static String m31306h2(String str) {
        StringBuilder sb = new StringBuilder("/com-status-award");
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        sb.append(str);
        return m31200G(sb.toString());
    }

    /* JADX INFO: renamed from: i */
    public static String m31307i(String str) {
        return m31200G("/boost/" + str + "/boost-merge");
    }

    /* JADX INFO: renamed from: i0 */
    public static String m31308i0() {
        return m31200G("/intl-pay/native");
    }

    /* JADX INFO: renamed from: i1 */
    public static String m31309i1(String str, String str2) {
        return m31213J0("/quickchat?action=" + str2 + "&version=" + str);
    }

    /* JADX INFO: renamed from: i2 */
    public static String m31310i2(String str) {
        return m31200G("/boost/" + str + "/boost-status?type=spotLight");
    }

    /* JADX INFO: renamed from: j */
    public static String m31311j(String str) {
        return m31200G("/users/" + str + "/user-boot/query/" + str);
    }

    /* JADX INFO: renamed from: j0 */
    public static String m31312j0(String str) {
        return m31200G("/kol/users/" + str + "/recommend");
    }

    /* JADX INFO: renamed from: j1 */
    public static String m31313j1() {
        return m31200G("/quickchat/adbroadcast");
    }

    /* JADX INFO: renamed from: j2 */
    public static final String m31314j2(int i, String str, String str2) {
        return m31200G("/intl-recommend/tribe/message?mcc=" + i + "&groupCategory=" + str + "&subType=" + str2);
    }

    /* JADX INFO: renamed from: k */
    public static String m31315k(String str, int i, String str2) {
        return m31200G("/users/" + str + "/user-boot/start/" + i + "?mcc=" + str2);
    }

    /* JADX INFO: renamed from: k0 */
    public static String m31316k0(String str, String str2) {
        return m31200G("/users/" + str + "/user-recommend/user-like?" + str2);
    }

    /* JADX INFO: renamed from: k1 */
    public static String m31317k1() {
        return m31213J0("/quickchat?action=rejectbroadcast&version=10");
    }

    /* JADX INFO: renamed from: k2 */
    public static final String m31318k2(String str) {
        return m31366w2("?search=selected&mode=" + str);
    }

    /* JADX INFO: renamed from: l */
    public static String m31319l() {
        return m31200G("/intl/activity/camping?mcc=" + qib0.f154717f0);
    }

    /* JADX INFO: renamed from: l0 */
    public static final String m31320l0(String str, long j) {
        return m31366w2("/" + str + "/intl-articles?since=" + j);
    }

    /* JADX INFO: renamed from: l1 */
    public static String m31321l1(String str, String str2, String str3, String str4, String str5) {
        return f19509o + "/oauth2/authorize?client_id=" + str + "&response_type=" + str2 + "&scope=" + str3 + "&redirect_uri=" + str4 + "&state=" + str5;
    }

    /* JADX INFO: renamed from: l2 */
    public static final String m31322l2() {
        return m31366w2("?search=suggested&with=" + f19515u + ",relationships" + m31256U2());
    }

    /* JADX INFO: renamed from: m */
    public static String m31323m(String str) {
        return m31366w2("/" + CoreModule.m29931H().userId() + "/chat-locks/" + str);
    }

    /* JADX INFO: renamed from: m0 */
    public static final String m31324m0(String str, long j) {
        return m31366w2("/" + str + "/intl-banner-activities?since=" + j);
    }

    /* JADX INFO: renamed from: m1 */
    public static String m31325m1(String str, String str2) {
        return f19509o + "/applications/" + str + "?package_name=" + str2;
    }

    /* JADX INFO: renamed from: m2 */
    public static final String m31326m2(boolean z) {
        String strM31322l2;
        if (z) {
            strM31322l2 = m31366w2("?search=suggested&is_encourage_user=true&with=" + f19515u + ",relationships" + m31256U2());
        } else {
            strM31322l2 = m31322l2();
        }
        if ((CoreModule.m29935P().m94656g().mo35087yc() || CoreModule.m29935P().m94656g().mo35054d9()) && CoreModule.m29935P().m94651a().mo33614w()) {
            strM31322l2 = strM31322l2 + ",userActivityInfo";
        }
        if (CoreModule.m29935P().m94651a().mo33614w()) {
            strM31322l2 = strM31322l2 + ",liveRoom";
        }
        if (!CoreModule.m29935P().m94651a().mo158376f4()) {
            return strM31322l2;
        }
        return strM31322l2 + ",ideal";
    }

    /* JADX INFO: renamed from: n */
    public static String m31327n(String str) {
        return m31207H2("/chat-groups/" + str);
    }

    /* JADX INFO: renamed from: n0 */
    public static String m31328n0(String str) {
        return m31366w2("/" + str + "/user-recommend/intl-pickslist");
    }

    /* JADX INFO: renamed from: n1 */
    public static String m31329n1(String str) {
        return f19513s + str;
    }

    /* JADX INFO: renamed from: n2 */
    public static String m31330n2(String str) {
        return m31213J0("/friends?search=" + str);
    }

    /* JADX INFO: renamed from: o */
    public static String m31331o(String str) {
        return m31207H2("/chat-groups?keyword=" + str + "&with=members,group-applies");
    }

    /* JADX INFO: renamed from: o0 */
    public static String m31332o0() {
        return m31213J0("/user-recommend/intl-picks-idList");
    }

    /* JADX INFO: renamed from: o1 */
    public static String m31333o1(String str) {
        return m31207H2("/group-applies/" + str + "?method=patch");
    }

    /* JADX INFO: renamed from: o2 */
    public static String m31334o2() {
        return m31213J0("/summarized-privileges");
    }

    /* JADX INFO: renamed from: p */
    public static String m31335p() {
        return m31207H2("/search-keywords");
    }

    /* JADX INFO: renamed from: p0 */
    public static String m31336p0() {
        return m31200G("/tab-me/banner");
    }

    /* JADX INFO: renamed from: p1 */
    public static String m31337p1() {
        return m31200G("/users/me/settings?method=patch");
    }

    /* JADX INFO: renamed from: p2 */
    public static String m31338p2() {
        return m31200G("/supremePartner/privateCustom/result");
    }

    /* JADX INFO: renamed from: q */
    public static String m31339q(@Nullable String str) {
        if (vwb.m200298L(str)) {
            return m31207H2("/chat-groups?search=suggested");
        }
        return m31207H2("/chat-groups?search=suggested&tab_id=" + str);
    }

    /* JADX INFO: renamed from: q0 */
    public static String m31340q0() {
        return f19496b + "/oauth2/code";
    }

    /* JADX INFO: renamed from: q1 */
    public static String m31341q1() {
        return m31213J0("/vip-search-settings");
    }

    /* JADX INFO: renamed from: q2 */
    public static String m31342q2(String str) {
        return m31200G("/supremePartner" + str);
    }

    /* JADX INFO: renamed from: r */
    public static String m31343r() {
        return m31207H2("/users/me/notification-counters");
    }

    /* JADX INFO: renamed from: r0 */
    public static String m31344r0(String str) {
        return m31200G("/users/me/visitor-list?" + str);
    }

    /* JADX INFO: renamed from: r1 */
    public static String m31345r1(String str) {
        return m31329n1("/orders/" + str);
    }

    /* JADX INFO: renamed from: r2 */
    public static String m31346r2(String str) {
        return m31200G("/surveys" + str);
    }

    /* JADX INFO: renamed from: s */
    public static String m31347s() {
        return m31207H2("/group-settings");
    }

    /* JADX INFO: renamed from: s0 */
    public static String m31348s0() {
        return m31200G("/users/me/visitor-access");
    }

    /* JADX INFO: renamed from: s1 */
    public static String m31349s1() {
        return m31329n1("/pending-payment/guidance");
    }

    /* JADX INFO: renamed from: s2 */
    public static String m31350s2(String str, String str2) {
        StringBuilder sb = new StringBuilder("/verifications/");
        sb.append(str);
        sb.append("?method=delete&verification=idCard");
        sb.append(TextUtils.isEmpty(str2) ? "" : "&productId=6");
        return m31213J0(sb.toString());
    }

    /* JADX INFO: renamed from: t */
    public static String m31351t(String str, String str2) {
        return m31207H2("/chat-groups/" + str + "/members/" + str2);
    }

    /* JADX INFO: renamed from: t0 */
    public static String m31352t0() {
        return m31200G("/users/me/visitor-all-count");
    }

    /* JADX INFO: renamed from: t1 */
    public static String m31353t1() {
        return m31213J0("/picks");
    }

    /* JADX INFO: renamed from: t2 */
    public static String m31354t2(String str) {
        return m31200G("/users/" + str + "/verification-tokens");
    }

    /* JADX INFO: renamed from: u */
    public static String m31355u() {
        return m31211I2("/conversations?with=" + f19517w + Constants.SEPARATOR_COMMA + f19519y + Constants.SEPARATOR_COMMA + f19520z + Constants.SEPARATOR_COMMA + f19479A + Constants.SEPARATOR_COMMA + f19482D + Constants.SEPARATOR_COMMA + f19483E + "&limit=20&filter=default&search=unhandled&offset=0");
    }

    /* JADX INFO: renamed from: u0 */
    public static String m31356u0() {
        return m31200G("/users/me/visitor-count");
    }

    /* JADX INFO: renamed from: u1 */
    public static String m31357u1(String str) {
        return m31366w2("/" + str + "/picks/list");
    }

    /* JADX INFO: renamed from: u2 */
    public static String m31358u2() {
        return m31366w2("/me/currency-code");
    }

    /* JADX INFO: renamed from: v */
    public static String m31359v() {
        return m31366w2("/" + CoreModule.m29931H().userId() + "/native/checkoutContract-tab/visibility");
    }

    /* JADX INFO: renamed from: v0 */
    public static String m31360v0() {
        return m31200G("/users/me/withdraw_open");
    }

    /* JADX INFO: renamed from: v1 */
    public static String m31361v1(String str) {
        return m31200G("/users/" + str + "/verifications/" + str);
    }

    /* JADX INFO: renamed from: v2 */
    public static String m31362v2(String str) {
        return m31366w2("/" + str + "?with=" + f19514t + m31256U2() + m31259V2() + m31271Y2() + m31248S2());
    }

    /* JADX INFO: renamed from: w */
    public static String m31363w(String str) {
        return f19500f + str;
    }

    /* JADX INFO: renamed from: w0 */
    public static String m31364w0() {
        return m31200G("/live/accesscontrol/judge?osName=android&campaignType=idGreedy");
    }

    /* JADX INFO: renamed from: w1 */
    public static String m31365w1(String str) {
        return m31200G("/users/" + str + "/verifications/" + str + "?method=patch");
    }

    /* JADX INFO: renamed from: w2 */
    public static String m31366w2(String str) {
        return m31200G("/users" + str);
    }

    /* JADX INFO: renamed from: x */
    public static String m31367x(String str) {
        if (ura.m195053e().m195057d().mo33676E()) {
            return m31211I2("/conversations/" + str + "?with=" + f19517w + Constants.SEPARATOR_COMMA + f19519y + Constants.SEPARATOR_COMMA + f19520z + Constants.SEPARATOR_COMMA + f19479A + Constants.SEPARATOR_COMMA + f19483E);
        }
        return m31213J0("/conversations/" + str + "?with=" + f19517w + Constants.SEPARATOR_COMMA + f19519y + Constants.SEPARATOR_COMMA + f19520z + Constants.SEPARATOR_COMMA + f19479A + Constants.SEPARATOR_COMMA + f19483E);
    }

    /* JADX INFO: renamed from: x0 */
    public static String m31368x0(String str) {
        return m31200G("/monetization" + str);
    }

    /* JADX INFO: renamed from: x1 */
    public static String m31369x1(String str) {
        return m31200G("/surveys" + str + "/answers?with=surveys");
    }

    /* JADX INFO: renamed from: x2 */
    public static String m31370x2(String str) {
        return m31366w2("/me/conversations/" + str + "?method=patch");
    }

    /* JADX INFO: renamed from: y */
    public static String m31371y(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            str2 = "&" + str;
        }
        if (!ura.m195053e().m195057d().mo33676E()) {
            return m31213J0("/conversations?with=" + f19517w + Constants.SEPARATOR_COMMA + f19519y + Constants.SEPARATOR_COMMA + f19520z + Constants.SEPARATOR_COMMA + f19479A + Constants.SEPARATOR_COMMA + f19483E + str2);
        }
        return m31211I2("/conversations?with=" + f19517w + Constants.SEPARATOR_COMMA + f19519y + Constants.SEPARATOR_COMMA + f19520z + Constants.SEPARATOR_COMMA + f19479A + Constants.SEPARATOR_COMMA + f19482D + Constants.SEPARATOR_COMMA + f19483E + str2.concat("&filter=default"));
    }

    /* JADX INFO: renamed from: y0 */
    public static String m31372y0(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            str2 = "&" + str;
        }
        if (!ura.m195053e().m195057d().mo33676E()) {
            return m31213J0("/latest-conversations?with=" + f19517w + Constants.SEPARATOR_COMMA + f19519y + Constants.SEPARATOR_COMMA + f19520z + Constants.SEPARATOR_COMMA + f19479A + Constants.SEPARATOR_COMMA + f19483E + str2);
        }
        return m31211I2("/conversations?with=" + f19517w + Constants.SEPARATOR_COMMA + f19519y + Constants.SEPARATOR_COMMA + f19520z + Constants.SEPARATOR_COMMA + f19479A + Constants.SEPARATOR_COMMA + f19482D + Constants.SEPARATOR_COMMA + f19483E + str2).replace("filter=default", "");
    }

    /* JADX INFO: renamed from: y1 */
    public static String m31373y1() {
        return m31200G("/profile-like");
    }

    /* JADX INFO: renamed from: y2 */
    public static String m31374y2(String str) {
        return m31200G("/user-counters/" + str);
    }

    /* JADX INFO: renamed from: z */
    public static String m31375z() {
        return ura.m195053e().m195057d().mo33676E() ? m31211I2("/conversations") : m31213J0("/conversations");
    }

    /* JADX INFO: renamed from: z0 */
    public static String m31376z0(String str) {
        return m31200G("/liked-users?" + str);
    }

    /* JADX INFO: renamed from: z1 */
    public static String m31377z1() {
        return m31200G("/profile-like-chat");
    }

    /* JADX INFO: renamed from: z2 */
    public static String m31378z2(String str) {
        return m31366w2("/" + str + "/live-hierarchy");
    }

    /* JADX INFO: renamed from: N2 */
    public String m31379N2() {
        return m31200G("/wallet_accounts?business_type=monetization");
    }

    /* JADX INFO: renamed from: O2 */
    public String m31380O2(String str, String str2) {
        return m31200G("/wallet_accounts/" + str + "/account_records?record_type=" + str2);
    }

    /* JADX INFO: renamed from: P2 */
    public String m31381P2(String str) {
        return m31200G("/wallet_accounts/" + str + "/account_records");
    }

    /* JADX INFO: renamed from: V1 */
    public String m31382V1() {
        return m31200G("/refund-details/svip");
    }

    public C4728a(RunnerProxy runnerProxy) {
        super(runnerProxy);
        final CoreProviderInterface coreProviderInterfaceM195057d = ura.m195053e().m195057d();
        Objects.requireNonNull(coreProviderInterfaceM195057d);
        setErrorHandler(new w9j() { // from class: l.kt0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return coreProviderInterfaceM195057d.mo33871kd((Throwable) obj);
            }
        });
    }
}
