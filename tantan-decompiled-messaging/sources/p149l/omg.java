package p149l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.data.DbLinks;
import com.p046p1.mobile.putong.data.Moments;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.OperationType;
import com.tantanapp.common.network.RunnerProxy;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes12.dex */
public class omg extends RunnerProxy {

    /* JADX INFO: renamed from: A */
    public static String f144616A;

    /* JADX INFO: renamed from: B */
    public static final String f144617B;

    /* JADX INFO: renamed from: C */
    public static int f144618C;

    /* JADX INFO: renamed from: D */
    public static int f144619D;

    /* JADX INFO: renamed from: E */
    public static int f144620E;

    /* JADX INFO: renamed from: F */
    public static int f144621F;

    /* JADX INFO: renamed from: G */
    public static Network f144622G;

    /* JADX INFO: renamed from: a */
    public static final String f144623a = mu5.f135738f + "/v1";

    /* JADX INFO: renamed from: b */
    public static final String f144624b;

    /* JADX INFO: renamed from: c */
    public static final String f144625c;

    /* JADX INFO: renamed from: d */
    public static final String f144626d;

    /* JADX INFO: renamed from: e */
    public static final String f144627e;

    /* JADX INFO: renamed from: f */
    public static final String f144628f;

    /* JADX INFO: renamed from: g */
    public static final String f144629g;

    /* JADX INFO: renamed from: h */
    public static final String f144630h;

    /* JADX INFO: renamed from: i */
    public static final String f144631i;

    /* JADX INFO: renamed from: j */
    public static final String f144632j;

    /* JADX INFO: renamed from: k */
    public static final String f144633k;

    /* JADX INFO: renamed from: l */
    public static final String f144634l;

    /* JADX INFO: renamed from: m */
    public static final String f144635m;

    /* JADX INFO: renamed from: n */
    public static String f144636n;

    /* JADX INFO: renamed from: o */
    public static String f144637o;

    /* JADX INFO: renamed from: p */
    public static String f144638p;

    /* JADX INFO: renamed from: q */
    public static String f144639q;

    /* JADX INFO: renamed from: r */
    public static String f144640r;

    /* JADX INFO: renamed from: s */
    public static String f144641s;

    /* JADX INFO: renamed from: t */
    public static String f144642t;

    /* JADX INFO: renamed from: u */
    public static String f144643u;

    /* JADX INFO: renamed from: v */
    public static String f144644v;

    /* JADX INFO: renamed from: w */
    public static String f144645w;

    /* JADX INFO: renamed from: x */
    public static String f144646x;

    /* JADX INFO: renamed from: y */
    public static String f144647y;

    /* JADX INFO: renamed from: z */
    public static String f144648z;

    static {
        StringBuilder sb = new StringBuilder();
        String str = mu5.f135737e;
        sb.append(str);
        sb.append("/v2");
        f144624b = sb.toString();
        f144625c = str + "/v3";
        f144626d = mu5.f135739g + "/v1";
        f144627e = mu5.f135742j;
        StringBuilder sb2 = new StringBuilder();
        String str2 = mu5.f135743k;
        sb2.append(str2);
        sb2.append("/v1");
        f144628f = sb2.toString();
        f144629g = mu5.f135744l;
        f144630h = mu5.f135745m;
        f144631i = mu5.f135746n + "/v1";
        f144632j = mu5.f135747o;
        f144633k = str2 + "/v1";
        f144634l = mu5.f135748p;
        f144635m = mu5.f135751s;
        f144636n = "contacts,questions,followships,relationships";
        f144637o = "contacts,questions,followships,user.publicMoments";
        f144638p = "questions,stickers";
        f144639q = "relationships";
        f144640r = "questions,users";
        f144641s = "giftRecords";
        f144642t = "users," + f144636n;
        f144643u = "messages," + f144638p;
        f144644v = Moments.TYPE;
        f144645w = "relationships";
        f144646x = "dynamic_moments";
        f144647y = "limit=100";
        f144648z = "limit=20";
        f144616A = "";
        f144617B = m165088l0("?search=suggested&limit=100&with=" + f144636n);
        f144618C = 1;
        f144619D = 2;
        f144620E = 4;
        f144621F = 8;
        f144622G = qib0.f154693H;
    }

    public omg() {
        setErrorHandler(new i2i0());
    }

    /* JADX INFO: renamed from: A */
    public static String m165039A(boolean z, boolean z2) {
        String str;
        if (z) {
            str = "voteMoment";
        } else {
            str = z2 ? OperationType.newUserAIMoment : "";
        }
        return m165108z(str);
    }

    /* JADX INFO: renamed from: B */
    public static String m165040B(String str, String str2, String str3) {
        String str4;
        if (TextUtils.isEmpty(str3)) {
            str4 = "";
        } else {
            str4 = "&" + str3;
        }
        return m165088l0("/" + str + "/moments/" + str2 + "/messages?with=" + f144638p + Constants.SEPARATOR_COMMA + f144642t + str4);
    }

    /* JADX INFO: renamed from: C */
    public static String m165041C(String str, String str2, String str3) {
        String str4;
        if (TextUtils.isEmpty(str3)) {
            str4 = "";
        } else {
            str4 = "&" + str3;
        }
        return m165088l0("/" + str + "/moments/" + str2 + "/likes?with=" + f144642t + str4);
    }

    /* JADX INFO: renamed from: D */
    public static String m165042D(String str, String str2) {
        return m165088l0("/" + str + "/moments/" + str2 + "/likes/me");
    }

    /* JADX INFO: renamed from: E */
    public static String m165043E(String str, String str2, String str3) {
        return m165088l0("/" + str + "/moments/" + str2 + "/messages/" + str3 + "/likes/me");
    }

    /* JADX INFO: renamed from: F */
    public static String m165044F(String str, String str2, String str3, boolean z) {
        if (!z) {
            return m165042D(str, str2);
        }
        return m165042D(str, str2) + "?source=" + str3;
    }

    /* JADX INFO: renamed from: G */
    public static String m165045G(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            str2 = "&" + str;
        }
        return m165102t("/muted?with=" + f144636n + str2);
    }

    /* JADX INFO: renamed from: H */
    public static String m165046H(String str) {
        return m165102t("/muted/" + str);
    }

    /* JADX INFO: renamed from: I */
    public static String m165047I(String str, boolean z) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            str2 = "&" + str;
        }
        return m165085k("/moments?search=recommend" + (z ? "&filter=video" : "") + "&with=" + f144642t + ",relationships," + f144643u + str2);
    }

    /* JADX INFO: renamed from: J */
    public static String m165048J(String str) {
        String str2;
        StringBuilder sb = new StringBuilder("/topicCategories");
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            str2 = "?search=" + str;
        }
        sb.append(str2);
        sb.append("&with=topic");
        return m165085k(sb.toString());
    }

    /* JADX INFO: renamed from: K */
    public static String m165049K(String str, String str2) {
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
        return m165085k(sb.toString());
    }

    /* JADX INFO: renamed from: L */
    public static String m165050L(String str, String str2, String str3) {
        return m165088l0("/" + str + "/moments/" + str2 + "/messages/" + str3);
    }

    /* JADX INFO: renamed from: M */
    public static String m165051M(String str, String str2, boolean z, String str3) {
        String str4;
        String str5;
        String str6 = wc40.m202629f() ? "musics," : Constants.SEPARATOR_COMMA;
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
        sb.append(f144642t);
        if (z) {
            str5 = Constants.SEPARATOR_COMMA + f144643u;
        } else {
            str5 = "";
        }
        sb.append(str5);
        sb.append(",relationships");
        return m165088l0(sb.toString());
    }

    /* JADX INFO: renamed from: N */
    public static String m165052N() {
        return m165088l0("/" + FeedModule.m60221F().userId() + "/states");
    }

    /* JADX INFO: renamed from: O */
    public static String m165053O(String str, String str2) {
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
        return m165085k(sb.toString());
    }

    /* JADX INFO: renamed from: P */
    public static String m165054P(String str, String str2, boolean z) {
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
        sb.append(f144642t);
        sb.append(",relationships,");
        sb.append(f144643u);
        sb.append(str3);
        return m165088l0(sb.toString());
    }

    /* JADX INFO: renamed from: Q */
    public static String m165055Q(String str, String str2, String str3) {
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
        sb.append(f144642t);
        sb.append(",relationships,");
        sb.append(f144643u);
        sb.append(str4);
        return m165088l0(sb.toString());
    }

    /* JADX INFO: renamed from: R */
    public static String m165056R(String str, String str2, boolean z, String str3) {
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
        sb.append(f144642t);
        sb.append(",relationships,");
        sb.append(f144643u);
        sb.append(str4);
        return m165088l0(sb.toString());
    }

    /* JADX INFO: renamed from: S */
    public static String m165057S(String str, String str2, boolean z, String str3) {
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
        sb.append(f144642t);
        sb.append(",relationships,");
        sb.append(f144643u);
        sb.append(str4);
        return m165088l0(sb.toString());
    }

    /* JADX INFO: renamed from: T */
    public static String m165058T(String str, String str2) {
        return m165085k("/moments?search=" + str2 + "&with=" + m165096p0(str));
    }

    /* JADX INFO: renamed from: U */
    public static String m165059U(String str, int i) {
        String str2;
        if (i > 0) {
            str2 = "&limit=" + i;
        } else {
            str2 = "";
        }
        return m165085k("/groups?search=" + str + str2);
    }

    /* JADX INFO: renamed from: V */
    public static String m165060V(String str) {
        return m165085k("/moments?search=discussion&with=" + m165096p0(str));
    }

    /* JADX INFO: renamed from: W */
    public static String m165061W(String str, String str2, @Nullable String str3) {
        String strM165088l0 = m165088l0("/" + str + "/followships/" + str2);
        if (TextUtils.isEmpty(str3)) {
            return strM165088l0;
        }
        return strM165088l0 + "?" + str3;
    }

    /* JADX INFO: renamed from: X */
    public static String m165062X(String str) {
        return m165085k("/moments?search=feed&with=" + m165096p0(str));
    }

    /* JADX INFO: renamed from: Y */
    public static String m165063Y(String str, String str2, String str3, String str4, @Nullable String str5) {
        String strM165088l0 = m165088l0("/" + str + "/followships/" + str2 + "?source=" + str3 + "&filter=" + str4);
        if (TextUtils.isEmpty(str5)) {
            return strM165088l0;
        }
        return strM165088l0 + "&" + str5;
    }

    /* JADX INFO: renamed from: Z */
    public static String m165064Z(String str, String str2) {
        return m165088l0("/" + str + "/followships/" + str2 + "?query=conversation");
    }

    /* JADX INFO: renamed from: a */
    public static String m165065a(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            str2 = "&" + str;
        }
        return m165085k("/activities?limit=20&with=" + f144644v + Constants.SEPARATOR_COMMA + f144642t + Constants.SEPARATOR_COMMA + f144643u + str2);
    }

    /* JADX INFO: renamed from: a0 */
    public static String m165066a0(String str) {
        return m165085k("/moments?search=dating&with=" + m165096p0(str));
    }

    /* JADX INFO: renamed from: b */
    public static String m165067b(String str, String str2) {
        String str3;
        if (TextUtils.isEmpty(str)) {
            str3 = "";
        } else {
            str3 = "&" + str;
        }
        return m165085k("/activities?limit=20&filter=" + str2 + "&sort=unread&with=" + f144644v + Constants.SEPARATOR_COMMA + f144642t + Constants.SEPARATOR_COMMA + f144643u + str3);
    }

    /* JADX INFO: renamed from: b0 */
    public static String m165068b0(String str, String str2) {
        return m165085k("/moments?search=like&sort=" + str2 + "&with=" + m165096p0(str));
    }

    /* JADX INFO: renamed from: c */
    public static String m165069c() {
        return m165085k("/activities?&with=relationships");
    }

    /* JADX INFO: renamed from: c0 */
    public static String m165070c0(String str) {
        return m165085k("/moments?search=nearbyOnline&with=" + m165096p0(str));
    }

    /* JADX INFO: renamed from: d */
    public static String m165071d(String str) {
        return m165085k("/activities?until=" + str + "&with=relationships");
    }

    /* JADX INFO: renamed from: d0 */
    public static String m165072d0(String str) {
        return m165085k("/moments?search=nearby&with=" + m165096p0(str));
    }

    /* JADX INFO: renamed from: e */
    public static String m165073e(String str, String str2) {
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
        return m165085k(sb.toString());
    }

    /* JADX INFO: renamed from: e0 */
    public static String m165074e0(String str, String str2) {
        return m165085k("/moments?search=location&query=" + str + "&with=" + m165096p0(str2));
    }

    /* JADX INFO: renamed from: f */
    public static String m165075f(String str) {
        String str2;
        StringBuilder sb = new StringBuilder("/activities?");
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            str2 = "&filter=" + str;
        }
        sb.append(str2);
        sb.append("&with=relationships");
        return m165085k(sb.toString());
    }

    /* JADX INFO: renamed from: f0 */
    public static String m165076f0(String str, String str2) {
        return m165085k("/moments?search=location&filter=newUser&query=" + str + "&with=" + m165096p0(str2));
    }

    /* JADX INFO: renamed from: g */
    public static String m165077g(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            str2 = "&" + str;
        }
        return m165085k("/activity-users?&with=" + f144644v + Constants.SEPARATOR_COMMA + f144642t + str2);
    }

    /* JADX INFO: renamed from: g0 */
    public static String m165078g0(String str, String str2, String str3) {
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
        sb.append(f144636n);
        sb.append("&query=");
        sb.append(str);
        sb.append(str4);
        return m165085k(sb.toString());
    }

    /* JADX INFO: renamed from: h */
    public static String m165079h(String str) {
        return m165085k("/activities/" + str);
    }

    /* JADX INFO: renamed from: h0 */
    public static String m165080h0(String str, String str2, String str3) {
        return m165088l0("/" + str + "/topics/" + str2 + "/votes/" + str3);
    }

    /* JADX INFO: renamed from: i */
    public static String m165081i() {
        return m165085k("/activities?query=followers");
    }

    /* JADX INFO: renamed from: i0 */
    public static String m165082i0(String str, String str2, String str3) {
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
        return m165088l0(sb.toString());
    }

    /* JADX INFO: renamed from: j */
    public static String m165083j() {
        return m165085k("/antispam/content/detect");
    }

    /* JADX INFO: renamed from: j0 */
    public static String m165084j0(String str, String str2, String str3) {
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
        return m165088l0(sb.toString());
    }

    /* JADX INFO: renamed from: k */
    public static String m165085k(String str) {
        return f144624b + str;
    }

    /* JADX INFO: renamed from: k0 */
    public static String m165086k0(String str) {
        return m165088l0("/" + str + "?with=" + f144636n + m165094o0());
    }

    /* JADX INFO: renamed from: l */
    public static String m165087l(String str, String str2, String str3) {
        return m165088l0("/" + str + "/moments/" + str2 + "/messages/" + str3);
    }

    /* JADX INFO: renamed from: l0 */
    public static String m165088l0(String str) {
        return m165085k("/users" + str);
    }

    /* JADX INFO: renamed from: m */
    public static String m165089m(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            str2 = "&" + str;
        }
        return m165085k("/moments?search=feed&with=" + f144642t + Constants.SEPARATOR_COMMA + f144643u + Constants.SEPARATOR_COMMA + f144646x + str2);
    }

    /* JADX INFO: renamed from: m0 */
    public static String m165090m0(String str, String str2, String str3) {
        return m165088l0("/" + str + "/topics/" + str2 + "/comments/" + str3 + "/likes/me");
    }

    /* JADX INFO: renamed from: n */
    public static String m165091n(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            str2 = "&" + str;
        }
        return m165102t("/followers?with=" + f144642t + "&limit=20" + str2);
    }

    /* JADX INFO: renamed from: n0 */
    public static <T> C22306c.d<T, T> m165092n0() {
        return mkd0.m154951C();
    }

    /* JADX INFO: renamed from: o */
    public static String m165093o(String str) {
        return m165085k("/live-group" + str);
    }

    /* JADX INFO: renamed from: o0 */
    private static String m165094o0() {
        return u2h.m191495d() ? ",lives" : "";
    }

    /* JADX INFO: renamed from: p */
    public static String m165095p() {
        return m165093o("/live-circle-moments?with=users,relationships,banners&limit=20");
    }

    /* JADX INFO: renamed from: p0 */
    public static String m165096p0(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            str2 = "&" + str;
        }
        return f144642t + ",relationships," + f144643u + (u2h.m191495d() ? ",lives,rooms" : "") + str2;
    }

    /* JADX INFO: renamed from: q */
    public static String m165097q(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            str2 = "&" + str;
        }
        return m165093o("/live-circle-moments?with=users,relationships,banners".concat(str2));
    }

    /* JADX INFO: renamed from: r */
    public static String m165098r(String str, String str2, String str3, String str4) {
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
        return m165088l0(sb.toString());
    }

    /* JADX INFO: renamed from: r0 */
    public static double m165099r0() {
        return qib0.f154693H.guessedCurrentServerTime();
    }

    /* JADX INFO: renamed from: s */
    public static String m165100s(String str, String str2, String str3, String str4) {
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
        return m165088l0(sb.toString());
    }

    /* JADX INFO: renamed from: s0 */
    public static double m165101s0(double d) {
        double dM165099r0 = m165099r0();
        return dM165099r0 > d ? dM165099r0 : d + 1.0d;
    }

    /* JADX INFO: renamed from: t */
    public static String m165102t(String str) {
        return m165088l0("/me" + str);
    }

    /* JADX INFO: renamed from: u */
    public static String m165103u(String str, String str2) {
        return m165102t("/conversations/" + str + "/messages/" + str2 + "?with=" + f144638p + Constants.SEPARATOR_COMMA + f144644v);
    }

    /* JADX INFO: renamed from: v */
    public static String m165104v(String str) {
        return m165102t("/moments/" + str);
    }

    /* JADX INFO: renamed from: w */
    public static String m165105w(String str, String str2) {
        return m165088l0("/" + str + "/moments/" + str2 + "?with=," + f144642t + Constants.SEPARATOR_COMMA + f144643u);
    }

    /* JADX INFO: renamed from: x */
    public static String m165106x(String str, String str2) {
        String str3;
        if (TextUtils.isEmpty(str2)) {
            str3 = "";
        } else {
            str3 = "&" + str2;
        }
        return m165088l0("/" + str + "/moments?search=profile&with=" + f144642t + Constants.SEPARATOR_COMMA + f144643u + str3);
    }

    /* JADX INFO: renamed from: y */
    public static String m165107y() {
        return m165102t("/moments");
    }

    /* JADX INFO: renamed from: z */
    public static String m165108z(String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(m165107y());
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            str2 = "?scene=" + str;
        }
        sb.append(str2);
        return sb.toString();
    }

    /* JADX INFO: renamed from: q0 */
    public <T> q860<T> m165109q0(List<T> list, DbLinks dbLinks) {
        return new q860<>(list, dbLinks);
    }
}
