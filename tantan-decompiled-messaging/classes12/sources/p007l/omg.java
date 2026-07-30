package p007l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.data.DbLinks;
import com.p000p1.mobile.putong.data.Moments;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.OperationType;
import com.p1.mobile.putong.api.api.Network;
import com.tantanapp.common.network.RunnerProxy;
import java.util.List;
import l.i2i0;
import l.mkd0;
import l.mu5;
import l.q860;
import l.qib0;
import l.wc40;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class omg extends RunnerProxy {

    /* JADX INFO: renamed from: A */
    public static String f11503A;

    /* JADX INFO: renamed from: B */
    public static final String f11504B;

    /* JADX INFO: renamed from: C */
    public static int f11505C;

    /* JADX INFO: renamed from: D */
    public static int f11506D;

    /* JADX INFO: renamed from: E */
    public static int f11507E;

    /* JADX INFO: renamed from: F */
    public static int f11508F;

    /* JADX INFO: renamed from: G */
    public static Network f11509G;

    /* JADX INFO: renamed from: a */
    public static final String f11510a = mu5.f + "/v1";

    /* JADX INFO: renamed from: b */
    public static final String f11511b;

    /* JADX INFO: renamed from: c */
    public static final String f11512c;

    /* JADX INFO: renamed from: d */
    public static final String f11513d;

    /* JADX INFO: renamed from: e */
    public static final String f11514e;

    /* JADX INFO: renamed from: f */
    public static final String f11515f;

    /* JADX INFO: renamed from: g */
    public static final String f11516g;

    /* JADX INFO: renamed from: h */
    public static final String f11517h;

    /* JADX INFO: renamed from: i */
    public static final String f11518i;

    /* JADX INFO: renamed from: j */
    public static final String f11519j;

    /* JADX INFO: renamed from: k */
    public static final String f11520k;

    /* JADX INFO: renamed from: l */
    public static final String f11521l;

    /* JADX INFO: renamed from: m */
    public static final String f11522m;

    /* JADX INFO: renamed from: n */
    public static String f11523n;

    /* JADX INFO: renamed from: o */
    public static String f11524o;

    /* JADX INFO: renamed from: p */
    public static String f11525p;

    /* JADX INFO: renamed from: q */
    public static String f11526q;

    /* JADX INFO: renamed from: r */
    public static String f11527r;

    /* JADX INFO: renamed from: s */
    public static String f11528s;

    /* JADX INFO: renamed from: t */
    public static String f11529t;

    /* JADX INFO: renamed from: u */
    public static String f11530u;

    /* JADX INFO: renamed from: v */
    public static String f11531v;

    /* JADX INFO: renamed from: w */
    public static String f11532w;

    /* JADX INFO: renamed from: x */
    public static String f11533x;

    /* JADX INFO: renamed from: y */
    public static String f11534y;

    /* JADX INFO: renamed from: z */
    public static String f11535z;

    static {
        StringBuilder sb = new StringBuilder();
        String str = mu5.e;
        sb.append(str);
        sb.append("/v2");
        f11511b = sb.toString();
        f11512c = str + "/v3";
        f11513d = mu5.g + "/v1";
        f11514e = mu5.j;
        StringBuilder sb2 = new StringBuilder();
        String str2 = mu5.k;
        sb2.append(str2);
        sb2.append("/v1");
        f11515f = sb2.toString();
        f11516g = mu5.l;
        f11517h = mu5.m;
        f11518i = mu5.n + "/v1";
        f11519j = mu5.o;
        f11520k = str2 + "/v1";
        f11521l = mu5.p;
        f11522m = mu5.s;
        f11523n = "contacts,questions,followships,relationships";
        f11524o = "contacts,questions,followships,user.publicMoments";
        f11525p = "questions,stickers";
        f11526q = "relationships";
        f11527r = "questions,users";
        f11528s = "giftRecords";
        f11529t = "users," + f11523n;
        f11530u = "messages," + f11525p;
        f11531v = Moments.TYPE;
        f11532w = "relationships";
        f11533x = "dynamic_moments";
        f11534y = "limit=100";
        f11535z = "limit=20";
        f11503A = "";
        f11504B = m12706l0("?search=suggested&limit=100&with=" + f11523n);
        f11505C = 1;
        f11506D = 2;
        f11507E = 4;
        f11508F = 8;
        f11509G = qib0.H;
    }

    public omg() {
        setErrorHandler(new i2i0());
    }

    /* JADX INFO: renamed from: A */
    public static String m12657A(boolean z, boolean z2) {
        String str;
        if (z) {
            str = "voteMoment";
        } else {
            str = z2 ? OperationType.newUserAIMoment : "";
        }
        return m12726z(str);
    }

    /* JADX INFO: renamed from: B */
    public static String m12658B(String str, String str2, String str3) {
        String str4;
        if (TextUtils.isEmpty(str3)) {
            str4 = "";
        } else {
            str4 = "&" + str3;
        }
        return m12706l0("/" + str + "/moments/" + str2 + "/messages?with=" + f11525p + "," + f11529t + str4);
    }

    /* JADX INFO: renamed from: C */
    public static String m12659C(String str, String str2, String str3) {
        String str4;
        if (TextUtils.isEmpty(str3)) {
            str4 = "";
        } else {
            str4 = "&" + str3;
        }
        return m12706l0("/" + str + "/moments/" + str2 + "/likes?with=" + f11529t + str4);
    }

    /* JADX INFO: renamed from: D */
    public static String m12660D(String str, String str2) {
        return m12706l0("/" + str + "/moments/" + str2 + "/likes/me");
    }

    /* JADX INFO: renamed from: E */
    public static String m12661E(String str, String str2, String str3) {
        return m12706l0("/" + str + "/moments/" + str2 + "/messages/" + str3 + "/likes/me");
    }

    /* JADX INFO: renamed from: F */
    public static String m12662F(String str, String str2, String str3, boolean z) {
        if (!z) {
            return m12660D(str, str2);
        }
        return m12660D(str, str2) + "?source=" + str3;
    }

    /* JADX INFO: renamed from: G */
    public static String m12663G(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            str2 = "&" + str;
        }
        return m12720t("/muted?with=" + f11523n + str2);
    }

    /* JADX INFO: renamed from: H */
    public static String m12664H(String str) {
        return m12720t("/muted/" + str);
    }

    /* JADX INFO: renamed from: I */
    public static String m12665I(String str, boolean z) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            str2 = "&" + str;
        }
        return m12703k("/moments?search=recommend" + (z ? "&filter=video" : "") + "&with=" + f11529t + ",relationships," + f11530u + str2);
    }

    /* JADX INFO: renamed from: J */
    public static String m12666J(String str) {
        String str2;
        StringBuilder sb = new StringBuilder("/topicCategories");
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            str2 = "?search=" + str;
        }
        sb.append(str2);
        sb.append("&with=topic");
        return m12703k(sb.toString());
    }

    /* JADX INFO: renamed from: K */
    public static String m12667K(String str, String str2) {
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
        return m12703k(sb.toString());
    }

    /* JADX INFO: renamed from: L */
    public static String m12668L(String str, String str2, String str3) {
        return m12706l0("/" + str + "/moments/" + str2 + "/messages/" + str3);
    }

    /* JADX INFO: renamed from: M */
    public static String m12669M(String str, String str2, boolean z, String str3) {
        String str4;
        String str5;
        String str6 = wc40.f() ? "musics," : ",";
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
        sb.append(f11529t);
        if (z) {
            str5 = "," + f11530u;
        } else {
            str5 = "";
        }
        sb.append(str5);
        sb.append(",relationships");
        return m12706l0(sb.toString());
    }

    /* JADX INFO: renamed from: N */
    public static String m12670N() {
        return m12706l0("/" + FeedModule.m1139F().userId() + "/states");
    }

    /* JADX INFO: renamed from: O */
    public static String m12671O(String str, String str2) {
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
        return m12703k(sb.toString());
    }

    /* JADX INFO: renamed from: P */
    public static String m12672P(String str, String str2, boolean z) {
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
        sb.append(f11529t);
        sb.append(",relationships,");
        sb.append(f11530u);
        sb.append(str3);
        return m12706l0(sb.toString());
    }

    /* JADX INFO: renamed from: Q */
    public static String m12673Q(String str, String str2, String str3) {
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
        sb.append(f11529t);
        sb.append(",relationships,");
        sb.append(f11530u);
        sb.append(str4);
        return m12706l0(sb.toString());
    }

    /* JADX INFO: renamed from: R */
    public static String m12674R(String str, String str2, boolean z, String str3) {
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
        sb.append(f11529t);
        sb.append(",relationships,");
        sb.append(f11530u);
        sb.append(str4);
        return m12706l0(sb.toString());
    }

    /* JADX INFO: renamed from: S */
    public static String m12675S(String str, String str2, boolean z, String str3) {
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
        sb.append(f11529t);
        sb.append(",relationships,");
        sb.append(f11530u);
        sb.append(str4);
        return m12706l0(sb.toString());
    }

    /* JADX INFO: renamed from: T */
    public static String m12676T(String str, String str2) {
        return m12703k("/moments?search=" + str2 + "&with=" + m12714p0(str));
    }

    /* JADX INFO: renamed from: U */
    public static String m12677U(String str, int i) {
        String str2;
        if (i > 0) {
            str2 = "&limit=" + i;
        } else {
            str2 = "";
        }
        return m12703k("/groups?search=" + str + str2);
    }

    /* JADX INFO: renamed from: V */
    public static String m12678V(String str) {
        return m12703k("/moments?search=discussion&with=" + m12714p0(str));
    }

    /* JADX INFO: renamed from: W */
    public static String m12679W(String str, String str2, @Nullable String str3) {
        String strM12706l0 = m12706l0("/" + str + "/followships/" + str2);
        if (TextUtils.isEmpty(str3)) {
            return strM12706l0;
        }
        return strM12706l0 + "?" + str3;
    }

    /* JADX INFO: renamed from: X */
    public static String m12680X(String str) {
        return m12703k("/moments?search=feed&with=" + m12714p0(str));
    }

    /* JADX INFO: renamed from: Y */
    public static String m12681Y(String str, String str2, String str3, String str4, @Nullable String str5) {
        String strM12706l0 = m12706l0("/" + str + "/followships/" + str2 + "?source=" + str3 + "&filter=" + str4);
        if (TextUtils.isEmpty(str5)) {
            return strM12706l0;
        }
        return strM12706l0 + "&" + str5;
    }

    /* JADX INFO: renamed from: Z */
    public static String m12682Z(String str, String str2) {
        return m12706l0("/" + str + "/followships/" + str2 + "?query=conversation");
    }

    /* JADX INFO: renamed from: a */
    public static String m12683a(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            str2 = "&" + str;
        }
        return m12703k("/activities?limit=20&with=" + f11531v + "," + f11529t + "," + f11530u + str2);
    }

    /* JADX INFO: renamed from: a0 */
    public static String m12684a0(String str) {
        return m12703k("/moments?search=dating&with=" + m12714p0(str));
    }

    /* JADX INFO: renamed from: b */
    public static String m12685b(String str, String str2) {
        String str3;
        if (TextUtils.isEmpty(str)) {
            str3 = "";
        } else {
            str3 = "&" + str;
        }
        return m12703k("/activities?limit=20&filter=" + str2 + "&sort=unread&with=" + f11531v + "," + f11529t + "," + f11530u + str3);
    }

    /* JADX INFO: renamed from: b0 */
    public static String m12686b0(String str, String str2) {
        return m12703k("/moments?search=like&sort=" + str2 + "&with=" + m12714p0(str));
    }

    /* JADX INFO: renamed from: c */
    public static String m12687c() {
        return m12703k("/activities?&with=relationships");
    }

    /* JADX INFO: renamed from: c0 */
    public static String m12688c0(String str) {
        return m12703k("/moments?search=nearbyOnline&with=" + m12714p0(str));
    }

    /* JADX INFO: renamed from: d */
    public static String m12689d(String str) {
        return m12703k("/activities?until=" + str + "&with=relationships");
    }

    /* JADX INFO: renamed from: d0 */
    public static String m12690d0(String str) {
        return m12703k("/moments?search=nearby&with=" + m12714p0(str));
    }

    /* JADX INFO: renamed from: e */
    public static String m12691e(String str, String str2) {
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
        return m12703k(sb.toString());
    }

    /* JADX INFO: renamed from: e0 */
    public static String m12692e0(String str, String str2) {
        return m12703k("/moments?search=location&query=" + str + "&with=" + m12714p0(str2));
    }

    /* JADX INFO: renamed from: f */
    public static String m12693f(String str) {
        String str2;
        StringBuilder sb = new StringBuilder("/activities?");
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            str2 = "&filter=" + str;
        }
        sb.append(str2);
        sb.append("&with=relationships");
        return m12703k(sb.toString());
    }

    /* JADX INFO: renamed from: f0 */
    public static String m12694f0(String str, String str2) {
        return m12703k("/moments?search=location&filter=newUser&query=" + str + "&with=" + m12714p0(str2));
    }

    /* JADX INFO: renamed from: g */
    public static String m12695g(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            str2 = "&" + str;
        }
        return m12703k("/activity-users?&with=" + f11531v + "," + f11529t + str2);
    }

    /* JADX INFO: renamed from: g0 */
    public static String m12696g0(String str, String str2, String str3) {
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
        sb.append(f11523n);
        sb.append("&query=");
        sb.append(str);
        sb.append(str4);
        return m12703k(sb.toString());
    }

    /* JADX INFO: renamed from: h */
    public static String m12697h(String str) {
        return m12703k("/activities/" + str);
    }

    /* JADX INFO: renamed from: h0 */
    public static String m12698h0(String str, String str2, String str3) {
        return m12706l0("/" + str + "/topics/" + str2 + "/votes/" + str3);
    }

    /* JADX INFO: renamed from: i */
    public static String m12699i() {
        return m12703k("/activities?query=followers");
    }

    /* JADX INFO: renamed from: i0 */
    public static String m12700i0(String str, String str2, String str3) {
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
        return m12706l0(sb.toString());
    }

    /* JADX INFO: renamed from: j */
    public static String m12701j() {
        return m12703k("/antispam/content/detect");
    }

    /* JADX INFO: renamed from: j0 */
    public static String m12702j0(String str, String str2, String str3) {
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
        return m12706l0(sb.toString());
    }

    /* JADX INFO: renamed from: k */
    public static String m12703k(String str) {
        return f11511b + str;
    }

    /* JADX INFO: renamed from: k0 */
    public static String m12704k0(String str) {
        return m12706l0("/" + str + "?with=" + f11523n + m12712o0());
    }

    /* JADX INFO: renamed from: l */
    public static String m12705l(String str, String str2, String str3) {
        return m12706l0("/" + str + "/moments/" + str2 + "/messages/" + str3);
    }

    /* JADX INFO: renamed from: l0 */
    public static String m12706l0(String str) {
        return m12703k("/users" + str);
    }

    /* JADX INFO: renamed from: m */
    public static String m12707m(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            str2 = "&" + str;
        }
        return m12703k("/moments?search=feed&with=" + f11529t + "," + f11530u + "," + f11533x + str2);
    }

    /* JADX INFO: renamed from: m0 */
    public static String m12708m0(String str, String str2, String str3) {
        return m12706l0("/" + str + "/topics/" + str2 + "/comments/" + str3 + "/likes/me");
    }

    /* JADX INFO: renamed from: n */
    public static String m12709n(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            str2 = "&" + str;
        }
        return m12720t("/followers?with=" + f11529t + "&limit=20" + str2);
    }

    /* JADX INFO: renamed from: n0 */
    public static <T> c.d<T, T> m12710n0() {
        return mkd0.C();
    }

    /* JADX INFO: renamed from: o */
    public static String m12711o(String str) {
        return m12703k("/live-group" + str);
    }

    /* JADX INFO: renamed from: o0 */
    private static String m12712o0() {
        return u2h.m14719d() ? ",lives" : "";
    }

    /* JADX INFO: renamed from: p */
    public static String m12713p() {
        return m12711o("/live-circle-moments?with=users,relationships,banners&limit=20");
    }

    /* JADX INFO: renamed from: p0 */
    public static String m12714p0(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            str2 = "&" + str;
        }
        return f11529t + ",relationships," + f11530u + (u2h.m14719d() ? ",lives,rooms" : "") + str2;
    }

    /* JADX INFO: renamed from: q */
    public static String m12715q(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            str2 = "&" + str;
        }
        return m12711o("/live-circle-moments?with=users,relationships,banners".concat(str2));
    }

    /* JADX INFO: renamed from: r */
    public static String m12716r(String str, String str2, String str3, String str4) {
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
        return m12706l0(sb.toString());
    }

    /* JADX INFO: renamed from: r0 */
    public static double m12717r0() {
        return qib0.H.guessedCurrentServerTime();
    }

    /* JADX INFO: renamed from: s */
    public static String m12718s(String str, String str2, String str3, String str4) {
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
        return m12706l0(sb.toString());
    }

    /* JADX INFO: renamed from: s0 */
    public static double m12719s0(double d) {
        double dM12717r0 = m12717r0();
        return dM12717r0 > d ? dM12717r0 : d + 1.0d;
    }

    /* JADX INFO: renamed from: t */
    public static String m12720t(String str) {
        return m12706l0("/me" + str);
    }

    /* JADX INFO: renamed from: u */
    public static String m12721u(String str, String str2) {
        return m12720t("/conversations/" + str + "/messages/" + str2 + "?with=" + f11525p + "," + f11531v);
    }

    /* JADX INFO: renamed from: v */
    public static String m12722v(String str) {
        return m12720t("/moments/" + str);
    }

    /* JADX INFO: renamed from: w */
    public static String m12723w(String str, String str2) {
        return m12706l0("/" + str + "/moments/" + str2 + "?with=," + f11529t + "," + f11530u);
    }

    /* JADX INFO: renamed from: x */
    public static String m12724x(String str, String str2) {
        String str3;
        if (TextUtils.isEmpty(str2)) {
            str3 = "";
        } else {
            str3 = "&" + str2;
        }
        return m12706l0("/" + str + "/moments?search=profile&with=" + f11529t + "," + f11530u + str3);
    }

    /* JADX INFO: renamed from: y */
    public static String m12725y() {
        return m12720t("/moments");
    }

    /* JADX INFO: renamed from: z */
    public static String m12726z(String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(m12725y());
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            str2 = "?scene=" + str;
        }
        sb.append(str2);
        return sb.toString();
    }

    /* JADX INFO: renamed from: q0 */
    public <T> q860<T> m12727q0(List<T> list, DbLinks dbLinks) {
        return new q860<>(list, dbLinks);
    }
}
