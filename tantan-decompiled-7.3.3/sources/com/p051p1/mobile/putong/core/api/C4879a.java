package com.p051p1.mobile.putong.core.api;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface;
import com.p051p1.mobile.putong.data.LinkAction;
import com.p051p1.mobile.putong.data.Moments;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.tantanapp.common.network.RunnerProxy;
import io.agora.base.internal.voiceengine.earmonitor.HardwareEarMonitorUtils;
import java.util.HashMap;
import java.util.Objects;
import p137rx.C22421c;
import p153l.ebe0;
import p153l.gta;
import p153l.jyb;
import p153l.nae0;
import p153l.psd0;
import p153l.q8g0;
import p153l.qcj;
import p153l.qv5;
import p153l.uqb0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.a */
/* JADX INFO: loaded from: classes9.dex */
public class C4879a extends RunnerProxy {

    /* JADX INFO: renamed from: A */
    public static String f20221A;

    /* JADX INFO: renamed from: B */
    public static String f20222B;

    /* JADX INFO: renamed from: C */
    public static String f20223C;

    /* JADX INFO: renamed from: D */
    public static String f20224D;

    /* JADX INFO: renamed from: E */
    public static String f20225E;

    /* JADX INFO: renamed from: F */
    public static String f20226F;

    /* JADX INFO: renamed from: G */
    public static String f20227G;

    /* JADX INFO: renamed from: H */
    public static String f20228H;

    /* JADX INFO: renamed from: I */
    public static String f20229I;

    /* JADX INFO: renamed from: J */
    public static String f20230J;

    /* JADX INFO: renamed from: K */
    public static final String f20231K;

    /* JADX INFO: renamed from: L */
    public static int f20232L;

    /* JADX INFO: renamed from: M */
    public static int f20233M;

    /* JADX INFO: renamed from: N */
    public static int f20234N;

    /* JADX INFO: renamed from: O */
    public static int f20235O;

    /* JADX INFO: renamed from: P */
    public static Network f20236P;

    /* JADX INFO: renamed from: a */
    public static final String f20237a = qv5.f159702f + "/v1";

    /* JADX INFO: renamed from: b */
    public static final String f20238b = qv5.f159718v + "/v2";

    /* JADX INFO: renamed from: c */
    public static final String f20239c;

    /* JADX INFO: renamed from: d */
    public static final String f20240d;

    /* JADX INFO: renamed from: e */
    public static final String f20241e;

    /* JADX INFO: renamed from: f */
    public static final String f20242f;

    /* JADX INFO: renamed from: g */
    public static final String f20243g;

    /* JADX INFO: renamed from: h */
    public static final String f20244h;

    /* JADX INFO: renamed from: i */
    public static final String f20245i;

    /* JADX INFO: renamed from: j */
    public static final String f20246j;

    /* JADX INFO: renamed from: k */
    public static final String f20247k;

    /* JADX INFO: renamed from: l */
    public static final String f20248l;

    /* JADX INFO: renamed from: m */
    public static final String f20249m;

    /* JADX INFO: renamed from: n */
    public static final String f20250n;

    /* JADX INFO: renamed from: o */
    public static final String f20251o;

    /* JADX INFO: renamed from: p */
    public static final String f20252p;

    /* JADX INFO: renamed from: q */
    public static final String f20253q;

    /* JADX INFO: renamed from: r */
    public static final String f20254r;

    /* JADX INFO: renamed from: s */
    public static final String f20255s;

    /* JADX INFO: renamed from: t */
    public static String f20256t;

    /* JADX INFO: renamed from: u */
    public static String f20257u;

    /* JADX INFO: renamed from: v */
    public static String f20258v;

    /* JADX INFO: renamed from: w */
    public static String f20259w;

    /* JADX INFO: renamed from: x */
    public static String f20260x;

    /* JADX INFO: renamed from: y */
    public static String f20261y;

    /* JADX INFO: renamed from: z */
    public static String f20262z;

    static {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = qv5.f159701e;
        sb.append(str2);
        sb.append("/v1");
        f20239c = sb.toString();
        f20240d = str2 + "/v2";
        f20241e = str2 + "/v3";
        f20242f = qv5.f159703g + "/v1";
        f20243g = qv5.f159706j;
        f20244h = qv5.f159707k + "/v1";
        f20245i = qv5.f159708l;
        f20246j = qv5.f159709m;
        f20247k = qv5.f159710n + "/v1";
        f20248l = qv5.f159711o;
        f20249m = qv5.f159712p;
        f20250n = qv5.f159715s;
        if (qv5.f159697a.get().contains("staging")) {
            str = qv5.f159716t.replace("https://", "http://") + "/v1";
        } else {
            str = qv5.f159716t.replace("http://", "https://") + "/v1";
        }
        f20251o = str;
        f20252p = qv5.f159717u + "/v1";
        f20253q = qv5.f159720x;
        f20254r = qv5.f159722z;
        f20255s = qv5.f159721y + "/v1";
        f20256t = "contacts,questions,followships,groupSettings,verifications";
        f20257u = "contacts,questions,followships,user.publicMoments";
        f20258v = "questions,stickers";
        f20259w = "relationships";
        f20260x = "relationships,moments";
        f20261y = "users," + f20256t;
        f20262z = "messages," + f20258v;
        f20221A = Moments.TYPE;
        f20222B = "members";
        f20223C = "relationships";
        f20224D = "chat-groups,members";
        f20225E = "gifts";
        f20226F = "states";
        f20227G = "dynamic_moments";
        f20228H = "limit=100";
        f20229I = "limit=20";
        f20230J = "";
        f20231K = m32369w2("?search=suggested&limit=100&with=" + f20256t);
        f20232L = 1;
        f20233M = 2;
        f20234N = 4;
        f20235O = 8;
        f20236P = uqb0.f180376H;
    }

    public C4879a() {
        final CoreProviderInterface coreProviderInterfaceM132214d = gta.m132210e().m132214d();
        Objects.requireNonNull(coreProviderInterfaceM132214d);
        setErrorHandler(new qcj() { // from class: l.qt0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return coreProviderInterfaceM132214d.mo34874kd((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: A */
    public static String m32179A(String str) {
        if (gta.m132210e().m132214d().mo34679E()) {
            return m32214I2("/conversations/" + str + "?with=" + f20260x);
        }
        return m32216J0("/conversations/" + str + "?with=" + f20260x);
    }

    /* JADX INFO: renamed from: A0 */
    public static String m32180A0(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            str2 = "&" + str;
        }
        return m32369w2("?search=whoLikedMe&with=" + f20257u + ",relationships" + str2);
    }

    /* JADX INFO: renamed from: A1 */
    public static String m32181A1(String str) {
        StringBuilder sb = new StringBuilder("/cms/");
        sb.append(str);
        sb.append("/promotionInfo?affiliate=");
        sb.append(IntlCountryCodeController.m29114k() ? HardwareEarMonitorUtils.MANUFACTURER_HUAWEI : "googleplay");
        sb.append("&mcc=");
        sb.append(uqb0.f180400f0);
        return m32203G(sb.toString());
    }

    /* JADX INFO: renamed from: A2 */
    public static final String m32182A2(String str) {
        HashMap<String, String> mapM162085o = nae0.m162085o(Uri.parse(str));
        String str2 = mapM162085o.get(Oauth2AccessToken.KEY_UID);
        mapM162085o.remove(Oauth2AccessToken.KEY_UID);
        if (TextUtils.isEmpty(mapM162085o.get("src"))) {
            mapM162085o.put("src", LinkAction.deeplink);
        }
        return m32369w2("/" + str2 + nae0.m162072b(mapM162085o));
    }

    /* JADX INFO: renamed from: B */
    public static String m32183B(String str) {
        return m32216J0("/conversations?filter=dismissed&with=" + f20261y + Constants.SEPARATOR_COMMA + f20223C + "&" + str);
    }

    /* JADX INFO: renamed from: B0 */
    public static String m32184B0() {
        return m32203G("/same/start");
    }

    /* JADX INFO: renamed from: B1 */
    public static String m32185B1() {
        return m32203G("/monetization-promotions");
    }

    /* JADX INFO: renamed from: B2 */
    public static String m32186B2(String str) {
        return m32203G("/users/" + str + "/user-recommend/recommend?mcc=" + uqb0.f180400f0 + "&region=" + uqb0.f180402h0 + "&language=" + q8g0.m175820y());
    }

    /* JADX INFO: renamed from: C */
    public static String m32187C(String str) {
        return m32378z() + "?search=newMatch&sort=createdTime&conditions=" + str + "&limit=20&with=" + f20259w + Constants.SEPARATOR_COMMA + f20261y + Constants.SEPARATOR_COMMA + f20262z + Constants.SEPARATOR_COMMA + f20221A + Constants.SEPARATOR_COMMA + f20225E;
    }

    /* JADX INFO: renamed from: C0 */
    public static String m32188C0(String str, String str2) {
        return m32369w2("/" + str + "/live-recommend/cancel/" + str2);
    }

    /* JADX INFO: renamed from: C1 */
    public static String m32189C1(String str) {
        return m32332n1("/contracts/" + str + "/orders");
    }

    /* JADX INFO: renamed from: C2 */
    public static final String m32190C2(String str) {
        return m32369w2("/" + str + "?search=superlike-relationship&with=" + f20256t + ",relationships");
    }

    /* JADX INFO: renamed from: D */
    public static String m32191D() {
        return m32203G("/monetization-chat/instantChat");
    }

    /* JADX INFO: renamed from: D0 */
    public static String m32192D0(String str, String str2) {
        return m32369w2("/" + str + "/live-recommend/enter/" + str2);
    }

    /* JADX INFO: renamed from: D1 */
    public static String m32193D1(String str) {
        return m32203G("/users/" + str + "/user-seeEntry/maxPop?mcc=" + uqb0.f180400f0);
    }

    /* JADX INFO: renamed from: D2 */
    public static String m32194D2(String str) {
        return m32369w2("/" + str);
    }

    /* JADX INFO: renamed from: E */
    public static String m32195E() {
        return m32203G("/monetization-chat/instantChat?method=delete");
    }

    /* JADX INFO: renamed from: E0 */
    public static String m32196E0(String str) {
        return m32203G("/memojiBuzz" + str);
    }

    /* JADX INFO: renamed from: E1 */
    public static String m32197E1(String str) {
        return m32203G("/users/" + str + "/tarot/query");
    }

    /* JADX INFO: renamed from: E2 */
    public static String m32198E2(String str) {
        return m32369w2("/" + str + "?with=" + f20256t + ",passby");
    }

    /* JADX INFO: renamed from: F */
    public static String m32199F(String str) {
        return m32378z() + "?search=quickFilter&sort=latestMessageTime&conditions=" + str + "&ids=" + CoreModule.f18264c.f20384f0.f20663a2 + "&limit=20&with=" + f20259w + Constants.SEPARATOR_COMMA + f20261y + Constants.SEPARATOR_COMMA + f20262z + Constants.SEPARATOR_COMMA + f20221A + Constants.SEPARATOR_COMMA + f20225E;
    }

    /* JADX INFO: renamed from: F0 */
    public static String m32200F0(String str) {
        return m32203G("/textBuzz" + str);
    }

    /* JADX INFO: renamed from: F1 */
    public static String m32201F1() {
        return m32203G("/quickchat-voice/me");
    }

    /* JADX INFO: renamed from: F2 */
    public static String m32202F2(String str) {
        return m32369w2("/" + str + "?with=" + f20257u + m32259U2() + m32262V2() + m32274Y2());
    }

    /* JADX INFO: renamed from: G */
    public static String m32203G(String str) {
        return f20240d + str;
    }

    /* JADX INFO: renamed from: G0 */
    public static String m32204G0(String str) {
        return m32203G("/videoBuzz" + str);
    }

    /* JADX INFO: renamed from: G1 */
    public static String m32205G1() {
        return m32203G("/quickchat-party/campaign");
    }

    /* JADX INFO: renamed from: G2 */
    public static String m32206G2(String str) {
        return m32369w2("/" + str + "?with=" + f20256t + ",relationships");
    }

    /* JADX INFO: renamed from: H */
    public static String m32207H(String str) {
        return f20239c + str;
    }

    /* JADX INFO: renamed from: H0 */
    public static String m32208H0(String str) {
        return m32203G("/voiceBuzz" + str);
    }

    /* JADX INFO: renamed from: H1 */
    public static String m32209H1() {
        return m32203G("/quickchat-oneside/me");
    }

    /* JADX INFO: renamed from: H2 */
    public static String m32210H2(String str) {
        return f20241e + str;
    }

    /* JADX INFO: renamed from: I */
    public static String m32211I(String str, String str2) {
        return m32203G("/users/" + str + "/tarot/create?mcc=" + str2);
    }

    /* JADX INFO: renamed from: I0 */
    public static String m32212I0() {
        return m32203G("/intl/activity/general");
    }

    /* JADX INFO: renamed from: I1 */
    public static String m32213I1() {
        return m32203G("/quickchat-party/campaign-page");
    }

    /* JADX INFO: renamed from: I2 */
    public static String m32214I2(String str) {
        return m32218J2("/me" + str);
    }

    /* JADX INFO: renamed from: J */
    public static String m32215J(String str, String str2) {
        StringBuilder sb = new StringBuilder("/users/");
        sb.append(str);
        sb.append("/verifications/");
        sb.append(str);
        sb.append("?verification=picture");
        sb.append(TextUtils.isEmpty(str2) ? "" : "&productId=6");
        return m32203G(sb.toString());
    }

    /* JADX INFO: renamed from: J0 */
    public static String m32216J0(String str) {
        return m32369w2("/me" + str);
    }

    /* JADX INFO: renamed from: J1 */
    public static String m32217J1() {
        return m32203G("/quickchat-party/invitation");
    }

    /* JADX INFO: renamed from: J2 */
    public static String m32218J2(String str) {
        return m32210H2("/users" + str);
    }

    /* JADX INFO: renamed from: K */
    public static String m32219K(String str, String str2, String str3) {
        return m32369w2("/" + str + "/moments/" + str2 + "/messages/" + str3);
    }

    /* JADX INFO: renamed from: K0 */
    public static String m32220K0(String str) {
        return m32216J0("/mymeet/entry/v4" + str);
    }

    /* JADX INFO: renamed from: K1 */
    public static String m32221K1(String str) {
        return m32203G("/quickchat-voice" + str);
    }

    /* JADX INFO: renamed from: K2 */
    public static String m32222K2(String str) {
        return m32218J2("/me/conversations/" + str + "?method=patch");
    }

    /* JADX INFO: renamed from: L */
    public static String m32223L(String str) {
        return m32203G("/users/" + str + "/verifications/" + str + "?process=new");
    }

    /* JADX INFO: renamed from: L0 */
    public static String m32224L0(String str) {
        return m32216J0("/mymeet-gifts/" + str);
    }

    /* JADX INFO: renamed from: L1 */
    public static String m32225L1() {
        return m32203G("/boost-status");
    }

    /* JADX INFO: renamed from: L2 */
    public static String m32226L2(String str) {
        return m32369w2("/" + str + "/visitor/counter");
    }

    /* JADX INFO: renamed from: M */
    public static String m32227M(String str) {
        return ebe0.m120159a(f20253q + "/" + str);
    }

    /* JADX INFO: renamed from: M0 */
    public static String m32228M0() {
        return m32216J0("/mymeet/live/v3");
    }

    /* JADX INFO: renamed from: M1 */
    public static String m32229M1(String str) {
        return m32203G("/quickchat" + str);
    }

    /* JADX INFO: renamed from: M2 */
    public static String m32230M2() {
        return m32203G("/users/me/wallet");
    }

    /* JADX INFO: renamed from: N */
    public static String m32231N() {
        return m32203G("/com-freetrial");
    }

    /* JADX INFO: renamed from: N0 */
    public static String m32232N0(String str) {
        return m32369w2("/" + str + "/odiamond-feed/list");
    }

    /* JADX INFO: renamed from: N1 */
    public static String m32233N1() {
        return m32203G("/quickchat-bell/me");
    }

    /* JADX INFO: renamed from: O */
    public static String m32234O() {
        return m32203G("/gift-infos");
    }

    /* JADX INFO: renamed from: O0 */
    public static String m32235O0(String str, String str2, boolean z) {
        if (!gta.m132210e().m132214d().mo34679E()) {
            StringBuilder sb = new StringBuilder("/conversations/");
            sb.append(str);
            sb.append("/messages/");
            sb.append(str2);
            sb.append("?with=");
            sb.append(f20258v);
            sb.append(Constants.SEPARATOR_COMMA);
            sb.append(f20221A);
            sb.append(Constants.SEPARATOR_COMMA);
            sb.append(f20225E);
            sb.append(Constants.SEPARATOR_COMMA);
            sb.append(f20226F);
            sb.append(m32262V2());
            sb.append(z ? "&anyStatus=true" : "");
            return m32216J0(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder("/conversations/");
        sb2.append(str);
        sb2.append("/messages/");
        sb2.append(str2);
        sb2.append("?with=");
        sb2.append(f20258v);
        sb2.append(Constants.SEPARATOR_COMMA);
        sb2.append(f20221A);
        sb2.append(Constants.SEPARATOR_COMMA);
        sb2.append(f20222B);
        sb2.append(Constants.SEPARATOR_COMMA);
        sb2.append(f20225E);
        sb2.append(Constants.SEPARATOR_COMMA);
        sb2.append(f20226F);
        sb2.append(m32262V2());
        sb2.append(z ? "&anyStatus=true" : "");
        return m32214I2(sb2.toString());
    }

    /* JADX INFO: renamed from: O1 */
    public static String m32236O1() {
        return m32203G("/quickchat/conversations");
    }

    /* JADX INFO: renamed from: P */
    public static String m32237P(String str) {
        return m32203G("/gift-panels" + str);
    }

    /* JADX INFO: renamed from: P0 */
    public static String m32238P0(String str, String str2) {
        String str3;
        if (TextUtils.isEmpty(str2)) {
            str3 = "";
        } else {
            str3 = "&" + str2;
        }
        if (gta.m132210e().m132214d().mo34679E()) {
            return m32214I2("/conversations/" + str + "/messages?with=" + f20258v + Constants.SEPARATOR_COMMA + f20221A + ",members," + f20225E + Constants.SEPARATOR_COMMA + f20226F + m32262V2() + str3);
        }
        return m32216J0("/conversations/" + str + "/messages?with=" + f20258v + Constants.SEPARATOR_COMMA + f20221A + Constants.SEPARATOR_COMMA + f20225E + Constants.SEPARATOR_COMMA + f20226F + m32262V2() + str3);
    }

    /* JADX INFO: renamed from: P1 */
    public static String m32239P1() {
        return m32229M1("/me");
    }

    /* JADX INFO: renamed from: Q */
    public static String m32240Q() {
        return m32203G("/gift-records");
    }

    /* JADX INFO: renamed from: Q0 */
    public static String m32241Q0(String str) {
        if (gta.m132210e().m132214d().mo34679E()) {
            return m32214I2("/conversations/" + str + "/messages?with=" + f20258v + Constants.SEPARATOR_COMMA + f20221A + Constants.SEPARATOR_COMMA + f20225E + Constants.SEPARATOR_COMMA + f20226F + m32262V2());
        }
        return m32216J0("/conversations/" + str + "/messages?with=" + f20258v + Constants.SEPARATOR_COMMA + f20221A + Constants.SEPARATOR_COMMA + f20225E + Constants.SEPARATOR_COMMA + f20226F + m32262V2());
    }

    /* JADX INFO: renamed from: Q1 */
    public static String m32242Q1() {
        return m32203G("/quickchat-speed/me");
    }

    /* JADX INFO: renamed from: Q2 */
    public static String m32243Q2() {
        return m32332n1("/auto-deducts");
    }

    /* JADX INFO: renamed from: R */
    public static String m32244R(String str) {
        return m32216J0("/gift-records/" + str);
    }

    /* JADX INFO: renamed from: R0 */
    public static String m32245R0(String str, String str2) {
        if (!gta.m132210e().m132214d().mo34679E()) {
            return m32216J0("/conversations/" + str + "/messages/" + str2 + "?with=" + f20258v + Constants.SEPARATOR_COMMA + f20221A + Constants.SEPARATOR_COMMA + f20225E + Constants.SEPARATOR_COMMA + f20226F + m32262V2());
        }
        return m32214I2("/conversations/" + str + "/messages/" + str2 + "?with=" + f20258v + Constants.SEPARATOR_COMMA + f20221A + Constants.SEPARATOR_COMMA + f20222B + Constants.SEPARATOR_COMMA + f20225E + Constants.SEPARATOR_COMMA + f20226F + m32262V2());
    }

    /* JADX INFO: renamed from: R1 */
    public static String m32246R1(String str, String str2) {
        return m32203G("/users/" + str + "/advert/tantan-advert/ok?advertId=" + str2);
    }

    /* JADX INFO: renamed from: R2 */
    public static String m32247R2(String str) {
        return m32332n1(String.format("/contracts/%s/orders?filter=latestOrder", str));
    }

    /* JADX INFO: renamed from: S */
    public static String m32248S() {
        return m32203G("/privilege-gift-remaining");
    }

    /* JADX INFO: renamed from: S0 */
    public static String m32249S0(String str, String str2) {
        String str3;
        if (TextUtils.isEmpty(str2)) {
            str3 = "";
        } else {
            str3 = "&" + str2;
        }
        return m32216J0("/contacts?search=mutual&query=" + str + str3);
    }

    /* JADX INFO: renamed from: S1 */
    public static String m32250S1() {
        return m32203G("/monetization/seeExposedUser");
    }

    /* JADX INFO: renamed from: S2 */
    public static String m32251S2() {
        return (CoreModule.m30933P().m143410g().mo36090yc() || CoreModule.m30933P().m143410g().mo36057d9()) ? ",userActivityInfo" : "";
    }

    /* JADX INFO: renamed from: T */
    public static String m32252T(String str) {
        return m32203G("/boost/" + str + "/gift?type=spotLight&mcc=" + uqb0.f180400f0);
    }

    /* JADX INFO: renamed from: T0 */
    public static String m32253T0() {
        return m32216J0("?method=patch");
    }

    /* JADX INFO: renamed from: T1 */
    public static String m32254T1(String str, String str2) {
        return m32203G("/users/" + str + "/tarot/recommend?mcc=" + str2);
    }

    /* JADX INFO: renamed from: T2 */
    public static <T> C22421c.d<T, T> m32255T2() {
        return psd0.m173592C();
    }

    /* JADX INFO: renamed from: U */
    public static String m32256U(String str) {
        return m32216J0("/greet-gifts/" + str);
    }

    /* JADX INFO: renamed from: U0 */
    public static String m32257U0(String str) {
        return m32210H2("/users/me" + str);
    }

    /* JADX INFO: renamed from: U1 */
    public static String m32258U1(String str, String str2) {
        return m32203G("/mkt/" + str + "/suggest?mcc=" + str2);
    }

    /* JADX INFO: renamed from: U2 */
    public static String m32259U2() {
        return gta.m132210e().m132214d().mo34805b() ? ",lives" : "";
    }

    /* JADX INFO: renamed from: V */
    public static String m32260V() {
        return m32210H2("/users/me/group-attributes");
    }

    /* JADX INFO: renamed from: V0 */
    public static String m32261V0(String str, String str2, String str3) {
        return m32369w2("/" + str + "/moments/" + str2 + "/messages?with=" + f20258v + "&page_id=" + str3);
    }

    /* JADX INFO: renamed from: V2 */
    public static String m32262V2() {
        return ",literatures";
    }

    /* JADX INFO: renamed from: W */
    public static String m32263W() {
        return m32210H2("/chat-groups");
    }

    /* JADX INFO: renamed from: W0 */
    public static String m32264W0() {
        return m32203G("/monetization/configuration");
    }

    /* JADX INFO: renamed from: W1 */
    public static String m32265W1(String str) {
        return m32203G(String.format("/users/me/renewable/contractInfos?scenario=%s", str));
    }

    /* JADX INFO: renamed from: W2 */
    public static double m32266W2() {
        return uqb0.f180376H.guessedCurrentServerTime();
    }

    /* JADX INFO: renamed from: X */
    public static String m32267X() {
        return m32210H2("/users/me/group-notifications?limit=20&with=users,group-applies,chat-groups");
    }

    /* JADX INFO: renamed from: X0 */
    public static String m32268X0() {
        return m32203G("/monetization/configuration?query=nearbyBlock");
    }

    /* JADX INFO: renamed from: X1 */
    public static String m32269X1() {
        return m32203G("/rtc");
    }

    /* JADX INFO: renamed from: X2 */
    public static double m32270X2(double d) {
        return d + 1.0d;
    }

    /* JADX INFO: renamed from: Y */
    public static String m32271Y(String str) {
        return qv5.f159710n + "/v2" + str;
    }

    /* JADX INFO: renamed from: Y0 */
    public static String m32272Y0(String str) {
        return m32203G("/monetizationMsg/coin");
    }

    /* JADX INFO: renamed from: Y1 */
    public static String m32273Y1(int i) {
        return m32269X1() + "-users/" + i;
    }

    /* JADX INFO: renamed from: Y2 */
    public static String m32274Y2() {
        String str = gta.m132210e().m132214d().mo34943w() ? ",pictureTags" : "";
        return gta.m132210e().m132214d().mo34950xh() ? str.concat(",idealType") : str;
    }

    /* JADX INFO: renamed from: Z */
    public static String m32275Z(String str) {
        return f20248l + str;
    }

    /* JADX INFO: renamed from: Z0 */
    public static String m32276Z0(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            str2 = "&" + str;
        }
        return m32203G("/users?search=nearby".concat(str2));
    }

    /* JADX INFO: renamed from: Z1 */
    public static String m32277Z1() {
        return m32203G("/see-trial/eligible");
    }

    /* JADX INFO: renamed from: a */
    public static String m32278a(String str) {
        return f20238b + str;
    }

    /* JADX INFO: renamed from: a0 */
    public static String m32279a0(String str) {
        return m32203G("/users/" + str + "/intl-paycools-merchandises?currencyCode=PHP");
    }

    /* JADX INFO: renamed from: a1 */
    public static String m32280a1() {
        return m32203G("/users?search=nearbyCount");
    }

    /* JADX INFO: renamed from: a2 */
    public static String m32281a2() {
        return m32203G("/see-trial/status");
    }

    /* JADX INFO: renamed from: b */
    public static String m32282b(String str) {
        return m32203G("/users/me/verifications/" + str);
    }

    /* JADX INFO: renamed from: b0 */
    public static String m32283b0(String str) {
        return m32203G("/users/" + str + "/intl-settings");
    }

    /* JADX INFO: renamed from: b1 */
    public static String m32284b1(String str) {
        return m32203G("/new-gift-walls?action=" + str);
    }

    /* JADX INFO: renamed from: b2 */
    public static String m32285b2() {
        return m32203G("/see-trial/wait-start");
    }

    /* JADX INFO: renamed from: c */
    public static String m32286c(String str) {
        return m32203G("/chat/ai-advisor" + str);
    }

    /* JADX INFO: renamed from: c0 */
    public static String m32287c0(String str) {
        return m32203G("/users/" + str + "/intl-paycools-orderlist");
    }

    /* JADX INFO: renamed from: c1 */
    public static String m32288c1(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            str2 = "&" + str;
        }
        return m32369w2("?search=whoLikedMe".concat(str2));
    }

    /* JADX INFO: renamed from: c2 */
    public static String m32289c2() {
        return m32203G("/users/me/settings");
    }

    /* JADX INFO: renamed from: d */
    public static String m32290d(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            str2 = "&" + str;
        }
        String strConcat = str2.concat("&filter=missed");
        if (!gta.m132210e().m132214d().mo34679E()) {
            return m32214I2("/conversations?with=" + f20259w + Constants.SEPARATOR_COMMA + f20261y + Constants.SEPARATOR_COMMA + f20262z + Constants.SEPARATOR_COMMA + f20221A + Constants.SEPARATOR_COMMA + f20225E + strConcat);
        }
        return m32214I2("/conversations?with=" + f20259w + Constants.SEPARATOR_COMMA + f20261y + Constants.SEPARATOR_COMMA + f20262z + Constants.SEPARATOR_COMMA + f20221A + Constants.SEPARATOR_COMMA + f20224D + Constants.SEPARATOR_COMMA + f20225E + strConcat);
    }

    /* JADX INFO: renamed from: d0 */
    public static String m32291d0() {
        return m32203G("/getPromotions?affiliate=googleplay&mcc=" + uqb0.f180400f0);
    }

    /* JADX INFO: renamed from: d1 */
    public static String m32292d1(String str) {
        return m32216J0("/mymeet/entry/v3" + str);
    }

    /* JADX INFO: renamed from: d2 */
    public static String m32293d2() {
        return m32203G("/intl/activity/love520");
    }

    /* JADX INFO: renamed from: e */
    public static String m32294e(String str) {
        return m32203G("/users/" + str + "/advert/award-counter/award");
    }

    /* JADX INFO: renamed from: e0 */
    public static String m32295e0(String str) {
        return m32216J0("/instant-chat/" + str);
    }

    /* JADX INFO: renamed from: e1 */
    public static String m32296e1(String str) {
        return m32216J0("/mymeet/list/v3" + str);
    }

    /* JADX INFO: renamed from: e2 */
    public static String m32297e2(String str) {
        return m32369w2("/" + str + "/special-cards");
    }

    /* JADX INFO: renamed from: f */
    public static String m32298f(String str) {
        return m32203G("/users/" + str + "/advert/award-counter/query");
    }

    /* JADX INFO: renamed from: f0 */
    public static String m32299f0() {
        return m32203G("/live-wallet/intl/diamond/change");
    }

    /* JADX INFO: renamed from: f1 */
    public static String m32300f1() {
        return m32216J0("/mymeet/read/v3");
    }

    /* JADX INFO: renamed from: f2 */
    public static String m32301f2() {
        return m32203G("/intl/boost/force-like");
    }

    /* JADX INFO: renamed from: g */
    public static String m32302g(String str, String str2, String str3, int i) {
        return m32203G("/users/" + str + "/user-boot/cancel/" + str2 + "?mcc=" + str3 + "&cardId=" + i);
    }

    /* JADX INFO: renamed from: g0 */
    public static String m32303g0() {
        return m32203G("/live-wallet/intl/diamond/canChange");
    }

    /* JADX INFO: renamed from: g1 */
    public static String m32304g1(String str) {
        return m32203G("/users/" + str + "/advert/tantan-advert/query?mcc=" + uqb0.f180400f0);
    }

    /* JADX INFO: renamed from: g2 */
    public static String m32305g2(String str) {
        return m32203G("/boost/" + str + "/boost-start");
    }

    /* JADX INFO: renamed from: h */
    public static String m32306h(String str, String str2, String str3, int i) {
        return m32203G("/users/" + str + "/user-boot/like/" + str2 + "?mcc=" + str3 + "&cardId=" + i);
    }

    /* JADX INFO: renamed from: h0 */
    public static String m32307h0(String str) {
        return m32203G("/users/" + str + "/diamond?agent=true");
    }

    /* JADX INFO: renamed from: h1 */
    public static String m32308h1() {
        return m32216J0("/quickchat?action=acceptbroadcast&version=10");
    }

    /* JADX INFO: renamed from: h2 */
    public static String m32309h2(String str) {
        StringBuilder sb = new StringBuilder("/com-status-award");
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        sb.append(str);
        return m32203G(sb.toString());
    }

    /* JADX INFO: renamed from: i */
    public static String m32310i(String str) {
        return m32203G("/boost/" + str + "/boost-merge");
    }

    /* JADX INFO: renamed from: i0 */
    public static String m32311i0() {
        return m32203G("/intl-pay/native");
    }

    /* JADX INFO: renamed from: i1 */
    public static String m32312i1(String str, String str2) {
        return m32216J0("/quickchat?action=" + str2 + "&version=" + str);
    }

    /* JADX INFO: renamed from: i2 */
    public static String m32313i2(String str) {
        return m32203G("/boost/" + str + "/boost-status?type=spotLight");
    }

    /* JADX INFO: renamed from: j */
    public static String m32314j(String str) {
        return m32203G("/users/" + str + "/user-boot/query/" + str);
    }

    /* JADX INFO: renamed from: j0 */
    public static String m32315j0(String str) {
        return m32203G("/kol/users/" + str + "/recommend");
    }

    /* JADX INFO: renamed from: j1 */
    public static String m32316j1() {
        return m32203G("/quickchat/adbroadcast");
    }

    /* JADX INFO: renamed from: j2 */
    public static final String m32317j2(int i, String str, String str2) {
        return m32203G("/intl-recommend/tribe/message?mcc=" + i + "&groupCategory=" + str + "&subType=" + str2);
    }

    /* JADX INFO: renamed from: k */
    public static String m32318k(String str, int i, String str2) {
        return m32203G("/users/" + str + "/user-boot/start/" + i + "?mcc=" + str2);
    }

    /* JADX INFO: renamed from: k0 */
    public static String m32319k0(String str, String str2) {
        return m32203G("/users/" + str + "/user-recommend/user-like?" + str2);
    }

    /* JADX INFO: renamed from: k1 */
    public static String m32320k1() {
        return m32216J0("/quickchat?action=rejectbroadcast&version=10");
    }

    /* JADX INFO: renamed from: k2 */
    public static final String m32321k2(String str) {
        return m32369w2("?search=selected&mode=" + str);
    }

    /* JADX INFO: renamed from: l */
    public static String m32322l() {
        return m32203G("/intl/activity/camping?mcc=" + uqb0.f180400f0);
    }

    /* JADX INFO: renamed from: l0 */
    public static final String m32323l0(String str, long j) {
        return m32369w2("/" + str + "/intl-articles?since=" + j);
    }

    /* JADX INFO: renamed from: l1 */
    public static String m32324l1(String str, String str2, String str3, String str4, String str5) {
        return f20251o + "/oauth2/authorize?client_id=" + str + "&response_type=" + str2 + "&scope=" + str3 + "&redirect_uri=" + str4 + "&state=" + str5;
    }

    /* JADX INFO: renamed from: l2 */
    public static final String m32325l2() {
        return m32369w2("?search=suggested&with=" + f20257u + ",relationships" + m32259U2());
    }

    /* JADX INFO: renamed from: m */
    public static String m32326m(String str) {
        return m32369w2("/" + CoreModule.m30929H().userId() + "/chat-locks/" + str);
    }

    /* JADX INFO: renamed from: m0 */
    public static final String m32327m0(String str, long j) {
        return m32369w2("/" + str + "/intl-banner-activities?since=" + j);
    }

    /* JADX INFO: renamed from: m1 */
    public static String m32328m1(String str, String str2) {
        return f20251o + "/applications/" + str + "?package_name=" + str2;
    }

    /* JADX INFO: renamed from: m2 */
    public static final String m32329m2(boolean z) {
        String strM32325l2;
        if (z) {
            strM32325l2 = m32369w2("?search=suggested&is_encourage_user=true&with=" + f20257u + ",relationships" + m32259U2());
        } else {
            strM32325l2 = m32325l2();
        }
        if ((CoreModule.m30933P().m143410g().mo36090yc() || CoreModule.m30933P().m143410g().mo36057d9()) && CoreModule.m30933P().m143405a().mo34617w()) {
            strM32325l2 = strM32325l2 + ",userActivityInfo";
        }
        if (CoreModule.m30933P().m143405a().mo34617w()) {
            strM32325l2 = strM32325l2 + ",liveRoom";
        }
        if (!CoreModule.m30933P().m143405a().mo180468f4()) {
            return strM32325l2;
        }
        return strM32325l2 + ",ideal";
    }

    /* JADX INFO: renamed from: n */
    public static String m32330n(String str) {
        return m32210H2("/chat-groups/" + str);
    }

    /* JADX INFO: renamed from: n0 */
    public static String m32331n0(String str) {
        return m32369w2("/" + str + "/user-recommend/intl-pickslist");
    }

    /* JADX INFO: renamed from: n1 */
    public static String m32332n1(String str) {
        return f20255s + str;
    }

    /* JADX INFO: renamed from: n2 */
    public static String m32333n2(String str) {
        return m32216J0("/friends?search=" + str);
    }

    /* JADX INFO: renamed from: o */
    public static String m32334o(String str) {
        return m32210H2("/chat-groups?keyword=" + str + "&with=members,group-applies");
    }

    /* JADX INFO: renamed from: o0 */
    public static String m32335o0() {
        return m32216J0("/user-recommend/intl-picks-idList");
    }

    /* JADX INFO: renamed from: o1 */
    public static String m32336o1(String str) {
        return m32210H2("/group-applies/" + str + "?method=patch");
    }

    /* JADX INFO: renamed from: o2 */
    public static String m32337o2() {
        return m32216J0("/summarized-privileges");
    }

    /* JADX INFO: renamed from: p */
    public static String m32338p() {
        return m32210H2("/search-keywords");
    }

    /* JADX INFO: renamed from: p0 */
    public static String m32339p0() {
        return m32203G("/tab-me/banner");
    }

    /* JADX INFO: renamed from: p1 */
    public static String m32340p1() {
        return m32203G("/users/me/settings?method=patch");
    }

    /* JADX INFO: renamed from: p2 */
    public static String m32341p2() {
        return m32203G("/supremePartner/privateCustom/result");
    }

    /* JADX INFO: renamed from: q */
    public static String m32342q(@Nullable String str) {
        if (jyb.m147481L(str)) {
            return m32210H2("/chat-groups?search=suggested");
        }
        return m32210H2("/chat-groups?search=suggested&tab_id=" + str);
    }

    /* JADX INFO: renamed from: q0 */
    public static String m32343q0() {
        return f20238b + "/oauth2/code";
    }

    /* JADX INFO: renamed from: q1 */
    public static String m32344q1() {
        return m32216J0("/vip-search-settings");
    }

    /* JADX INFO: renamed from: q2 */
    public static String m32345q2(String str) {
        return m32203G("/supremePartner" + str);
    }

    /* JADX INFO: renamed from: r */
    public static String m32346r() {
        return m32210H2("/users/me/notification-counters");
    }

    /* JADX INFO: renamed from: r0 */
    public static String m32347r0(String str) {
        return m32203G("/users/me/visitor-list?" + str);
    }

    /* JADX INFO: renamed from: r1 */
    public static String m32348r1(String str) {
        return m32332n1("/orders/" + str);
    }

    /* JADX INFO: renamed from: r2 */
    public static String m32349r2(String str) {
        return m32203G("/surveys" + str);
    }

    /* JADX INFO: renamed from: s */
    public static String m32350s() {
        return m32210H2("/group-settings");
    }

    /* JADX INFO: renamed from: s0 */
    public static String m32351s0() {
        return m32203G("/users/me/visitor-access");
    }

    /* JADX INFO: renamed from: s1 */
    public static String m32352s1() {
        return m32332n1("/pending-payment/guidance");
    }

    /* JADX INFO: renamed from: s2 */
    public static String m32353s2(String str, String str2) {
        StringBuilder sb = new StringBuilder("/verifications/");
        sb.append(str);
        sb.append("?method=delete&verification=idCard");
        sb.append(TextUtils.isEmpty(str2) ? "" : "&productId=6");
        return m32216J0(sb.toString());
    }

    /* JADX INFO: renamed from: t */
    public static String m32354t(String str, String str2) {
        return m32210H2("/chat-groups/" + str + "/members/" + str2);
    }

    /* JADX INFO: renamed from: t0 */
    public static String m32355t0() {
        return m32203G("/users/me/visitor-all-count");
    }

    /* JADX INFO: renamed from: t1 */
    public static String m32356t1() {
        return m32216J0("/picks");
    }

    /* JADX INFO: renamed from: t2 */
    public static String m32357t2(String str) {
        return m32203G("/users/" + str + "/verification-tokens");
    }

    /* JADX INFO: renamed from: u */
    public static String m32358u() {
        return m32214I2("/conversations?with=" + f20259w + Constants.SEPARATOR_COMMA + f20261y + Constants.SEPARATOR_COMMA + f20262z + Constants.SEPARATOR_COMMA + f20221A + Constants.SEPARATOR_COMMA + f20224D + Constants.SEPARATOR_COMMA + f20225E + "&limit=20&filter=default&search=unhandled&offset=0");
    }

    /* JADX INFO: renamed from: u0 */
    public static String m32359u0() {
        return m32203G("/users/me/visitor-count");
    }

    /* JADX INFO: renamed from: u1 */
    public static String m32360u1(String str) {
        return m32369w2("/" + str + "/picks/list");
    }

    /* JADX INFO: renamed from: u2 */
    public static String m32361u2() {
        return m32369w2("/me/currency-code");
    }

    /* JADX INFO: renamed from: v */
    public static String m32362v() {
        return m32369w2("/" + CoreModule.m30929H().userId() + "/native/checkoutContract-tab/visibility");
    }

    /* JADX INFO: renamed from: v0 */
    public static String m32363v0() {
        return m32203G("/users/me/withdraw_open");
    }

    /* JADX INFO: renamed from: v1 */
    public static String m32364v1(String str) {
        return m32203G("/users/" + str + "/verifications/" + str);
    }

    /* JADX INFO: renamed from: v2 */
    public static String m32365v2(String str) {
        return m32369w2("/" + str + "?with=" + f20256t + m32259U2() + m32262V2() + m32274Y2() + m32251S2());
    }

    /* JADX INFO: renamed from: w */
    public static String m32366w(String str) {
        return f20242f + str;
    }

    /* JADX INFO: renamed from: w0 */
    public static String m32367w0() {
        return m32203G("/live/accesscontrol/judge?osName=android&campaignType=idGreedy");
    }

    /* JADX INFO: renamed from: w1 */
    public static String m32368w1(String str) {
        return m32203G("/users/" + str + "/verifications/" + str + "?method=patch");
    }

    /* JADX INFO: renamed from: w2 */
    public static String m32369w2(String str) {
        return m32203G("/users" + str);
    }

    /* JADX INFO: renamed from: x */
    public static String m32370x(String str) {
        if (gta.m132210e().m132214d().mo34679E()) {
            return m32214I2("/conversations/" + str + "?with=" + f20259w + Constants.SEPARATOR_COMMA + f20261y + Constants.SEPARATOR_COMMA + f20262z + Constants.SEPARATOR_COMMA + f20221A + Constants.SEPARATOR_COMMA + f20225E);
        }
        return m32216J0("/conversations/" + str + "?with=" + f20259w + Constants.SEPARATOR_COMMA + f20261y + Constants.SEPARATOR_COMMA + f20262z + Constants.SEPARATOR_COMMA + f20221A + Constants.SEPARATOR_COMMA + f20225E);
    }

    /* JADX INFO: renamed from: x0 */
    public static String m32371x0(String str) {
        return m32203G("/monetization" + str);
    }

    /* JADX INFO: renamed from: x1 */
    public static String m32372x1(String str) {
        return m32203G("/surveys" + str + "/answers?with=surveys");
    }

    /* JADX INFO: renamed from: x2 */
    public static String m32373x2(String str) {
        return m32369w2("/me/conversations/" + str + "?method=patch");
    }

    /* JADX INFO: renamed from: y */
    public static String m32374y(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            str2 = "&" + str;
        }
        if (!gta.m132210e().m132214d().mo34679E()) {
            return m32216J0("/conversations?with=" + f20259w + Constants.SEPARATOR_COMMA + f20261y + Constants.SEPARATOR_COMMA + f20262z + Constants.SEPARATOR_COMMA + f20221A + Constants.SEPARATOR_COMMA + f20225E + str2);
        }
        return m32214I2("/conversations?with=" + f20259w + Constants.SEPARATOR_COMMA + f20261y + Constants.SEPARATOR_COMMA + f20262z + Constants.SEPARATOR_COMMA + f20221A + Constants.SEPARATOR_COMMA + f20224D + Constants.SEPARATOR_COMMA + f20225E + str2.concat("&filter=default"));
    }

    /* JADX INFO: renamed from: y0 */
    public static String m32375y0(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            str2 = "&" + str;
        }
        if (!gta.m132210e().m132214d().mo34679E()) {
            return m32216J0("/latest-conversations?with=" + f20259w + Constants.SEPARATOR_COMMA + f20261y + Constants.SEPARATOR_COMMA + f20262z + Constants.SEPARATOR_COMMA + f20221A + Constants.SEPARATOR_COMMA + f20225E + str2);
        }
        return m32214I2("/conversations?with=" + f20259w + Constants.SEPARATOR_COMMA + f20261y + Constants.SEPARATOR_COMMA + f20262z + Constants.SEPARATOR_COMMA + f20221A + Constants.SEPARATOR_COMMA + f20224D + Constants.SEPARATOR_COMMA + f20225E + str2).replace("filter=default", "");
    }

    /* JADX INFO: renamed from: y1 */
    public static String m32376y1() {
        return m32203G("/profile-like");
    }

    /* JADX INFO: renamed from: y2 */
    public static String m32377y2(String str) {
        return m32203G("/user-counters/" + str);
    }

    /* JADX INFO: renamed from: z */
    public static String m32378z() {
        return gta.m132210e().m132214d().mo34679E() ? m32214I2("/conversations") : m32216J0("/conversations");
    }

    /* JADX INFO: renamed from: z0 */
    public static String m32379z0(String str) {
        return m32203G("/liked-users?" + str);
    }

    /* JADX INFO: renamed from: z1 */
    public static String m32380z1() {
        return m32203G("/profile-like-chat");
    }

    /* JADX INFO: renamed from: z2 */
    public static String m32381z2(String str) {
        return m32369w2("/" + str + "/live-hierarchy");
    }

    /* JADX INFO: renamed from: N2 */
    public String m32382N2() {
        return m32203G("/wallet_accounts?business_type=monetization");
    }

    /* JADX INFO: renamed from: O2 */
    public String m32383O2(String str, String str2) {
        return m32203G("/wallet_accounts/" + str + "/account_records?record_type=" + str2);
    }

    /* JADX INFO: renamed from: P2 */
    public String m32384P2(String str) {
        return m32203G("/wallet_accounts/" + str + "/account_records");
    }

    /* JADX INFO: renamed from: V1 */
    public String m32385V1() {
        return m32203G("/refund-details/svip");
    }

    public C4879a(RunnerProxy runnerProxy) {
        super(runnerProxy);
        final CoreProviderInterface coreProviderInterfaceM132214d = gta.m132210e().m132214d();
        Objects.requireNonNull(coreProviderInterfaceM132214d);
        setErrorHandler(new qcj() { // from class: l.qt0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return coreProviderInterfaceM132214d.mo34874kd((Throwable) obj);
            }
        });
    }
}
