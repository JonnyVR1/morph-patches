package p153l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.data.DbLinks;
import com.p051p1.mobile.putong.data.Moments;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.OperationType;
import com.tantanapp.common.network.RunnerProxy;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes13.dex */
public class dog extends RunnerProxy {

    /* JADX INFO: renamed from: A */
    public static String f89923A;

    /* JADX INFO: renamed from: B */
    public static final String f89924B;

    /* JADX INFO: renamed from: C */
    public static int f89925C;

    /* JADX INFO: renamed from: D */
    public static int f89926D;

    /* JADX INFO: renamed from: E */
    public static int f89927E;

    /* JADX INFO: renamed from: F */
    public static int f89928F;

    /* JADX INFO: renamed from: G */
    public static Network f89929G;

    /* JADX INFO: renamed from: a */
    public static final String f89930a = qv5.f159702f + "/v1";

    /* JADX INFO: renamed from: b */
    public static final String f89931b;

    /* JADX INFO: renamed from: c */
    public static final String f89932c;

    /* JADX INFO: renamed from: d */
    public static final String f89933d;

    /* JADX INFO: renamed from: e */
    public static final String f89934e;

    /* JADX INFO: renamed from: f */
    public static final String f89935f;

    /* JADX INFO: renamed from: g */
    public static final String f89936g;

    /* JADX INFO: renamed from: h */
    public static final String f89937h;

    /* JADX INFO: renamed from: i */
    public static final String f89938i;

    /* JADX INFO: renamed from: j */
    public static final String f89939j;

    /* JADX INFO: renamed from: k */
    public static final String f89940k;

    /* JADX INFO: renamed from: l */
    public static final String f89941l;

    /* JADX INFO: renamed from: m */
    public static final String f89942m;

    /* JADX INFO: renamed from: n */
    public static String f89943n;

    /* JADX INFO: renamed from: o */
    public static String f89944o;

    /* JADX INFO: renamed from: p */
    public static String f89945p;

    /* JADX INFO: renamed from: q */
    public static String f89946q;

    /* JADX INFO: renamed from: r */
    public static String f89947r;

    /* JADX INFO: renamed from: s */
    public static String f89948s;

    /* JADX INFO: renamed from: t */
    public static String f89949t;

    /* JADX INFO: renamed from: u */
    public static String f89950u;

    /* JADX INFO: renamed from: v */
    public static String f89951v;

    /* JADX INFO: renamed from: w */
    public static String f89952w;

    /* JADX INFO: renamed from: x */
    public static String f89953x;

    /* JADX INFO: renamed from: y */
    public static String f89954y;

    /* JADX INFO: renamed from: z */
    public static String f89955z;

    static {
        StringBuilder sb = new StringBuilder();
        String str = qv5.f159701e;
        sb.append(str);
        sb.append("/v2");
        f89931b = sb.toString();
        f89932c = str + "/v3";
        f89933d = qv5.f159703g + "/v1";
        f89934e = qv5.f159706j;
        StringBuilder sb2 = new StringBuilder();
        String str2 = qv5.f159707k;
        sb2.append(str2);
        sb2.append("/v1");
        f89935f = sb2.toString();
        f89936g = qv5.f159708l;
        f89937h = qv5.f159709m;
        f89938i = qv5.f159710n + "/v1";
        f89939j = qv5.f159711o;
        f89940k = str2 + "/v1";
        f89941l = qv5.f159712p;
        f89942m = qv5.f159715s;
        f89943n = "contacts,questions,followships,relationships";
        f89944o = "contacts,questions,followships,user.publicMoments";
        f89945p = "questions,stickers";
        f89946q = "relationships";
        f89947r = "questions,users";
        f89948s = "giftRecords";
        f89949t = "users," + f89943n;
        f89950u = "messages," + f89945p;
        f89951v = Moments.TYPE;
        f89952w = "relationships";
        f89953x = "dynamic_moments";
        f89954y = "limit=100";
        f89955z = "limit=20";
        f89923A = "";
        f89924B = m117249l0("?search=suggested&limit=100&with=" + f89943n);
        f89925C = 1;
        f89926D = 2;
        f89927E = 4;
        f89928F = 8;
        f89929G = uqb0.f180376H;
    }

    public dog() {
        setErrorHandler(new rai0());
    }

    /* JADX INFO: renamed from: A */
    public static String m117200A(boolean z, boolean z2) {
        String str;
        if (z) {
            str = "voteMoment";
        } else {
            str = z2 ? OperationType.newUserAIMoment : "";
        }
        return m117269z(str);
    }

    /* JADX INFO: renamed from: B */
    public static String m117201B(String str, String str2, String str3) {
        String str4;
        if (TextUtils.isEmpty(str3)) {
            str4 = "";
        } else {
            str4 = "&" + str3;
        }
        return m117249l0("/" + str + "/moments/" + str2 + "/messages?with=" + f89945p + Constants.SEPARATOR_COMMA + f89949t + str4);
    }

    /* JADX INFO: renamed from: C */
    public static String m117202C(String str, String str2, String str3) {
        String str4;
        if (TextUtils.isEmpty(str3)) {
            str4 = "";
        } else {
            str4 = "&" + str3;
        }
        return m117249l0("/" + str + "/moments/" + str2 + "/likes?with=" + f89949t + str4);
    }

    /* JADX INFO: renamed from: D */
    public static String m117203D(String str, String str2) {
        return m117249l0("/" + str + "/moments/" + str2 + "/likes/me");
    }

    /* JADX INFO: renamed from: E */
    public static String m117204E(String str, String str2, String str3) {
        return m117249l0("/" + str + "/moments/" + str2 + "/messages/" + str3 + "/likes/me");
    }

    /* JADX INFO: renamed from: F */
    public static String m117205F(String str, String str2, String str3, boolean z) {
        if (!z) {
            return m117203D(str, str2);
        }
        return m117203D(str, str2) + "?source=" + str3;
    }

    /* JADX INFO: renamed from: G */
    public static String m117206G(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            str2 = "&" + str;
        }
        return m117263t("/muted?with=" + f89943n + str2);
    }

    /* JADX INFO: renamed from: H */
    public static String m117207H(String str) {
        return m117263t("/muted/" + str);
    }

    /* JADX INFO: renamed from: I */
    public static String m117208I(String str, boolean z) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            str2 = "&" + str;
        }
        return m117246k("/moments?search=recommend" + (z ? "&filter=video" : "") + "&with=" + f89949t + ",relationships," + f89950u + str2);
    }

    /* JADX INFO: renamed from: J */
    public static String m117209J(String str) {
        String str2;
        StringBuilder sb = new StringBuilder("/topicCategories");
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            str2 = "?search=" + str;
        }
        sb.append(str2);
        sb.append("&with=topic");
        return m117246k(sb.toString());
    }

    /* JADX INFO: renamed from: K */
    public static String m117210K(String str, String str2) {
        String str3;
        StringBuilder sb = new StringBuilder("/topics");
        String string = "";
        if (TextUtils.isEmpty(str)) {
            str3 = "";
        } else {
            str3 = "?search=" + str;
        }
        sb.append(str3);
        if (!TextUtils.isEmpty(str2)) {
            StringBuilder sb2 = TextUtils.isEmpty(str) ? new StringBuilder("?") : new StringBuilder("&");
            sb2.append(str2);
            string = sb2.toString();
        }
        sb.append(string);
        return m117246k(sb.toString());
    }

    /* JADX INFO: renamed from: L */
    public static String m117211L(String str, String str2, String str3) {
        return m117249l0("/" + str + "/moments/" + str2 + "/messages/" + str3);
    }

    /* JADX INFO: renamed from: M */
    public static String m117212M(String str, String str2, boolean z, String str3) {
        String str4;
        String str5;
        String str6 = kl40.m150348f() ? "musics," : Constants.SEPARATOR_COMMA;
        StringBuilder sb = new StringBuilder("/");
        sb.append(str);
        sb.append("/moments/");
        sb.append(str2);
        if (TextUtils.isEmpty(str3)) {
            str4 = "?";
        } else {
            str4 = "?scene=" + str3 + "&";
        }
        sb.append(str4);
        sb.append("with=");
        sb.append(str6);
        sb.append(f89949t);
        if (z) {
            str5 = Constants.SEPARATOR_COMMA + f89950u;
        } else {
            str5 = "";
        }
        sb.append(str5);
        sb.append(",relationships");
        return m117249l0(sb.toString());
    }

    /* JADX INFO: renamed from: N */
    public static String m117213N() {
        return m117249l0("/" + FeedModule.m61405F().userId() + "/states");
    }

    /* JADX INFO: renamed from: O */
    public static String m117214O(String str, String str2) {
        String str3;
        StringBuilder sb = new StringBuilder("/operationGuides");
        String str4 = "";
        if (TextUtils.isEmpty(str)) {
            str3 = "";
        } else {
            str3 = "?search=" + str;
        }
        sb.append(str3);
        sb.append("&with=momentTopics");
        if (!TextUtils.isEmpty(str2)) {
            str4 = "&query=" + str2;
        }
        sb.append(str4);
        return m117246k(sb.toString());
    }

    /* JADX INFO: renamed from: P */
    public static String m117215P(String str, String str2, boolean z) {
        String str3;
        if (TextUtils.isEmpty(str2)) {
            str3 = "";
        } else {
            str3 = "&" + str2;
        }
        StringBuilder sb = new StringBuilder("/");
        sb.append(str);
        sb.append("/moments?search=profile");
        sb.append(z ? "&filter=user" : "");
        sb.append("&with=");
        sb.append(f89949t);
        sb.append(",relationships,");
        sb.append(f89950u);
        sb.append(str3);
        return m117249l0(sb.toString());
    }

    /* JADX INFO: renamed from: Q */
    public static String m117216Q(String str, String str2, String str3) {
        String str4;
        String str5 = "";
        if (TextUtils.isEmpty(str2)) {
            str4 = "";
        } else {
            str4 = "&" + str2;
        }
        StringBuilder sb = new StringBuilder("/");
        sb.append(str);
        sb.append("/moments?search=profile");
        if (!TextUtils.isEmpty(str3)) {
            str5 = "&filter=topic&id=" + str3;
        }
        sb.append(str5);
        sb.append("&with=");
        sb.append(f89949t);
        sb.append(",relationships,");
        sb.append(f89950u);
        sb.append(str4);
        return m117249l0(sb.toString());
    }

    /* JADX INFO: renamed from: R */
    public static String m117217R(String str, String str2, boolean z, String str3) {
        String str4;
        String str5;
        if (TextUtils.isEmpty(str2)) {
            str4 = "";
        } else {
            str4 = "&" + str2;
        }
        StringBuilder sb = new StringBuilder("/");
        sb.append(str);
        sb.append("/moments?search=profileMoment");
        if (TextUtils.isEmpty(str3)) {
            str5 = "";
        } else {
            str5 = "&scene=" + str3;
        }
        sb.append(str5);
        sb.append(z ? "&filter=user" : "");
        sb.append("&with=");
        sb.append(f89949t);
        sb.append(",relationships,");
        sb.append(f89950u);
        sb.append(str4);
        return m117249l0(sb.toString());
    }

    /* JADX INFO: renamed from: S */
    public static String m117218S(String str, String str2, boolean z, String str3) {
        String str4;
        String str5;
        if (TextUtils.isEmpty(str2)) {
            str4 = "";
        } else {
            str4 = "&" + str2;
        }
        StringBuilder sb = new StringBuilder("/");
        sb.append(str);
        sb.append("/moments?search=profile");
        if (TextUtils.isEmpty(str3)) {
            str5 = "";
        } else {
            str5 = "&scene=" + str3;
        }
        sb.append(str5);
        sb.append(z ? "&filter=user" : "");
        sb.append("&with=");
        sb.append(f89949t);
        sb.append(",relationships,");
        sb.append(f89950u);
        sb.append(str4);
        return m117249l0(sb.toString());
    }

    /* JADX INFO: renamed from: T */
    public static String m117219T(String str, String str2) {
        return m117246k("/moments?search=" + str2 + "&with=" + m117257p0(str));
    }

    /* JADX INFO: renamed from: U */
    public static String m117220U(String str, int i) {
        String str2;
        if (i > 0) {
            str2 = "&limit=" + i;
        } else {
            str2 = "";
        }
        return m117246k("/groups?search=" + str + str2);
    }

    /* JADX INFO: renamed from: V */
    public static String m117221V(String str) {
        return m117246k("/moments?search=discussion&with=" + m117257p0(str));
    }

    /* JADX INFO: renamed from: W */
    public static String m117222W(String str, String str2, @Nullable String str3) {
        String strM117249l0 = m117249l0("/" + str + "/followships/" + str2);
        if (TextUtils.isEmpty(str3)) {
            return strM117249l0;
        }
        return strM117249l0 + "?" + str3;
    }

    /* JADX INFO: renamed from: X */
    public static String m117223X(String str) {
        return m117246k("/moments?search=feed&with=" + m117257p0(str));
    }

    /* JADX INFO: renamed from: Y */
    public static String m117224Y(String str, String str2, String str3, String str4, @Nullable String str5) {
        String strM117249l0 = m117249l0("/" + str + "/followships/" + str2 + "?source=" + str3 + "&filter=" + str4);
        if (TextUtils.isEmpty(str5)) {
            return strM117249l0;
        }
        return strM117249l0 + "&" + str5;
    }

    /* JADX INFO: renamed from: Z */
    public static String m117225Z(String str, String str2) {
        return m117249l0("/" + str + "/followships/" + str2 + "?query=conversation");
    }

    /* JADX INFO: renamed from: a */
    public static String m117226a(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            str2 = "&" + str;
        }
        return m117246k("/activities?limit=20&with=" + f89951v + Constants.SEPARATOR_COMMA + f89949t + Constants.SEPARATOR_COMMA + f89950u + str2);
    }

    /* JADX INFO: renamed from: a0 */
    public static String m117227a0(String str) {
        return m117246k("/moments?search=dating&with=" + m117257p0(str));
    }

    /* JADX INFO: renamed from: b */
    public static String m117228b(String str, String str2) {
        String str3;
        if (TextUtils.isEmpty(str)) {
            str3 = "";
        } else {
            str3 = "&" + str;
        }
        return m117246k("/activities?limit=20&filter=" + str2 + "&sort=unread&with=" + f89951v + Constants.SEPARATOR_COMMA + f89949t + Constants.SEPARATOR_COMMA + f89950u + str3);
    }

    /* JADX INFO: renamed from: b0 */
    public static String m117229b0(String str, String str2) {
        return m117246k("/moments?search=like&sort=" + str2 + "&with=" + m117257p0(str));
    }

    /* JADX INFO: renamed from: c */
    public static String m117230c() {
        return m117246k("/activities?&with=relationships");
    }

    /* JADX INFO: renamed from: c0 */
    public static String m117231c0(String str) {
        return m117246k("/moments?search=nearbyOnline&with=" + m117257p0(str));
    }

    /* JADX INFO: renamed from: d */
    public static String m117232d(String str) {
        return m117246k("/activities?until=" + str + "&with=relationships");
    }

    /* JADX INFO: renamed from: d0 */
    public static String m117233d0(String str) {
        return m117246k("/moments?search=nearby&with=" + m117257p0(str));
    }

    /* JADX INFO: renamed from: e */
    public static String m117234e(String str, String str2) {
        String str3;
        StringBuilder sb = new StringBuilder("/activities?until=");
        sb.append(str);
        if (TextUtils.isEmpty(str2)) {
            str3 = "";
        } else {
            str3 = "&filter=" + str2;
        }
        sb.append(str3);
        sb.append("&with=relationships");
        return m117246k(sb.toString());
    }

    /* JADX INFO: renamed from: e0 */
    public static String m117235e0(String str, String str2) {
        return m117246k("/moments?search=location&query=" + str + "&with=" + m117257p0(str2));
    }

    /* JADX INFO: renamed from: f */
    public static String m117236f(String str) {
        String str2;
        StringBuilder sb = new StringBuilder("/activities?");
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            str2 = "&filter=" + str;
        }
        sb.append(str2);
        sb.append("&with=relationships");
        return m117246k(sb.toString());
    }

    /* JADX INFO: renamed from: f0 */
    public static String m117237f0(String str, String str2) {
        return m117246k("/moments?search=location&filter=newUser&query=" + str + "&with=" + m117257p0(str2));
    }

    /* JADX INFO: renamed from: g */
    public static String m117238g(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            str2 = "&" + str;
        }
        return m117246k("/activity-users?&with=" + f89951v + Constants.SEPARATOR_COMMA + f89949t + str2);
    }

    /* JADX INFO: renamed from: g0 */
    public static String m117239g0(String str, String str2, String str3) {
        String str4;
        String str5 = "";
        if (TextUtils.isEmpty(str2)) {
            str4 = "";
        } else {
            str4 = "&" + str2;
        }
        StringBuilder sb = new StringBuilder("/moments?search=topic");
        if (!TextUtils.isEmpty(str3)) {
            str5 = "&sort=" + str3;
        }
        sb.append(str5);
        sb.append("&with=topics,");
        sb.append(f89943n);
        sb.append("&query=");
        sb.append(str);
        sb.append(str4);
        return m117246k(sb.toString());
    }

    /* JADX INFO: renamed from: h */
    public static String m117240h(String str) {
        return m117246k("/activities/" + str);
    }

    /* JADX INFO: renamed from: h0 */
    public static String m117241h0(String str, String str2, String str3) {
        return m117249l0("/" + str + "/topics/" + str2 + "/votes/" + str3);
    }

    /* JADX INFO: renamed from: i */
    public static String m117242i() {
        return m117246k("/activities?query=followers");
    }

    /* JADX INFO: renamed from: i0 */
    public static String m117243i0(String str, String str2, String str3) {
        String str4;
        StringBuilder sb = new StringBuilder("/");
        sb.append(str);
        sb.append("/topics/");
        sb.append(str2);
        sb.append("/comments");
        if (TextUtils.isEmpty(str3)) {
            str4 = "";
        } else {
            str4 = "/" + str3;
        }
        sb.append(str4);
        return m117249l0(sb.toString());
    }

    /* JADX INFO: renamed from: j */
    public static String m117244j() {
        return m117246k("/antispam/content/detect");
    }

    /* JADX INFO: renamed from: j0 */
    public static String m117245j0(String str, String str2, String str3) {
        String str4;
        StringBuilder sb = new StringBuilder("/");
        sb.append(str);
        sb.append("/topics/");
        sb.append(str2);
        sb.append("/comments");
        if (TextUtils.isEmpty(str3)) {
            str4 = "";
        } else {
            str4 = "?" + str3;
        }
        sb.append(str4);
        return m117249l0(sb.toString());
    }

    /* JADX INFO: renamed from: k */
    public static String m117246k(String str) {
        return f89931b + str;
    }

    /* JADX INFO: renamed from: k0 */
    public static String m117247k0(String str) {
        return m117249l0("/" + str + "?with=" + f89943n + m117255o0());
    }

    /* JADX INFO: renamed from: l */
    public static String m117248l(String str, String str2, String str3) {
        return m117249l0("/" + str + "/moments/" + str2 + "/messages/" + str3);
    }

    /* JADX INFO: renamed from: l0 */
    public static String m117249l0(String str) {
        return m117246k("/users" + str);
    }

    /* JADX INFO: renamed from: m */
    public static String m117250m(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            str2 = "&" + str;
        }
        return m117246k("/moments?search=feed&with=" + f89949t + Constants.SEPARATOR_COMMA + f89950u + Constants.SEPARATOR_COMMA + f89953x + str2);
    }

    /* JADX INFO: renamed from: m0 */
    public static String m117251m0(String str, String str2, String str3) {
        return m117249l0("/" + str + "/topics/" + str2 + "/comments/" + str3 + "/likes/me");
    }

    /* JADX INFO: renamed from: n */
    public static String m117252n(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            str2 = "&" + str;
        }
        return m117263t("/followers?with=" + f89949t + "&limit=20" + str2);
    }

    /* JADX INFO: renamed from: n0 */
    public static <T> C22421c.d<T, T> m117253n0() {
        return psd0.m173592C();
    }

    /* JADX INFO: renamed from: o */
    public static String m117254o(String str) {
        return m117246k("/live-group" + str);
    }

    /* JADX INFO: renamed from: o0 */
    private static String m117255o0() {
        return j4h.m143420d() ? ",lives" : "";
    }

    /* JADX INFO: renamed from: p */
    public static String m117256p() {
        return m117254o("/live-circle-moments?with=users,relationships,banners&limit=20");
    }

    /* JADX INFO: renamed from: p0 */
    public static String m117257p0(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            str2 = "&" + str;
        }
        return f89949t + ",relationships," + f89950u + (j4h.m143420d() ? ",lives,rooms" : "") + str2;
    }

    /* JADX INFO: renamed from: q */
    public static String m117258q(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            str2 = "&" + str;
        }
        return m117254o("/live-circle-moments?with=users,relationships,banners".concat(str2));
    }

    /* JADX INFO: renamed from: r */
    public static String m117259r(String str, String str2, String str3, String str4) {
        String str5;
        StringBuilder sb = new StringBuilder("/");
        sb.append(str);
        sb.append("/moments/");
        sb.append(str2);
        sb.append("/messages/");
        sb.append(str3);
        sb.append("/subMessages");
        if (TextUtils.isEmpty(str4)) {
            str5 = "";
        } else {
            str5 = "?" + str4;
        }
        sb.append(str5);
        return m117249l0(sb.toString());
    }

    /* JADX INFO: renamed from: r0 */
    public static double m117260r0() {
        return uqb0.f180376H.guessedCurrentServerTime();
    }

    /* JADX INFO: renamed from: s */
    public static String m117261s(String str, String str2, String str3, String str4) {
        String str5;
        StringBuilder sb = new StringBuilder("/");
        sb.append(str);
        sb.append("/topics/");
        sb.append(str2);
        sb.append("/comments/");
        sb.append(str3);
        sb.append("/subComments");
        if (TextUtils.isEmpty(str4)) {
            str5 = "";
        } else {
            str5 = "?" + str4;
        }
        sb.append(str5);
        return m117249l0(sb.toString());
    }

    /* JADX INFO: renamed from: s0 */
    public static double m117262s0(double d) {
        double dM117260r0 = m117260r0();
        return dM117260r0 > d ? dM117260r0 : d + 1.0d;
    }

    /* JADX INFO: renamed from: t */
    public static String m117263t(String str) {
        return m117249l0("/me" + str);
    }

    /* JADX INFO: renamed from: u */
    public static String m117264u(String str, String str2) {
        return m117263t("/conversations/" + str + "/messages/" + str2 + "?with=" + f89945p + Constants.SEPARATOR_COMMA + f89951v);
    }

    /* JADX INFO: renamed from: v */
    public static String m117265v(String str) {
        return m117263t("/moments/" + str);
    }

    /* JADX INFO: renamed from: w */
    public static String m117266w(String str, String str2) {
        return m117249l0("/" + str + "/moments/" + str2 + "?with=," + f89949t + Constants.SEPARATOR_COMMA + f89950u);
    }

    /* JADX INFO: renamed from: x */
    public static String m117267x(String str, String str2) {
        String str3;
        if (TextUtils.isEmpty(str2)) {
            str3 = "";
        } else {
            str3 = "&" + str2;
        }
        return m117249l0("/" + str + "/moments?search=profile&with=" + f89949t + Constants.SEPARATOR_COMMA + f89950u + str3);
    }

    /* JADX INFO: renamed from: y */
    public static String m117268y() {
        return m117263t("/moments");
    }

    /* JADX INFO: renamed from: z */
    public static String m117269z(String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(m117268y());
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            str2 = "?scene=" + str;
        }
        sb.append(str2);
        return sb.toString();
    }

    /* JADX INFO: renamed from: q0 */
    public <T> vg60<T> m117270q0(List<T> list, DbLinks dbLinks) {
        return new vg60<>(list, dbLinks);
    }
}
