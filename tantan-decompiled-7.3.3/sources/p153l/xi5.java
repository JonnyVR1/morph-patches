package p153l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.data.Moments;
import com.tantanapp.common.network.RunnerProxy;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class xi5 extends RunnerProxy {
    public static final String ABTESTING_URL;
    private static final String AI_GROWTH_URL;
    private static final String AI_SUGGEST;
    private static final String API_VERSION = "v1";
    public static final String API_VERSION_V2 = "v2";
    public static final String API_VERSION_V3 = "v3";
    private static final String ASSETS_URL;
    private static final String CLOUD_URL;
    private static final String CLOUD_URL_V2;
    public static String CONVERSATION_WITH = null;
    private static final String DEVICES_URL;
    private static final String GROWTH_URL;

    /* JADX INFO: renamed from: H5 */
    private static final String f194433H5;
    public static int INFER_INVALID_MOMENT_REFERENCE = 0;
    public static boolean LOG_JOSN = false;
    public static int MESSAGE_IN_CONVERSATION = 0;
    public static int MESSAGE_IN_MOMENTS = 0;
    public static String MESSAGE_WITH = null;
    public static int MOMENT_IN_FEED = 0;
    private static final String MYTANTAN_URL;
    private static final String OMS_URL;
    private static final String ORDER_API;
    public static final String QUERY_ACTIVITIES_DEFAULT = "limit=20";
    public static final String QUERY_ACTIVITIES_LIMIT1 = "limit=1";
    public static String QUERY_CONVERSATIONS_DEFAULT = null;
    public static final String QUERY_FEED_DEFAULT = "limit=20";
    public static String QUERY_MOMENTS_DEFAULT = null;
    public static final String QUERY_MOMENT_COMMENTS_DEFAULT = "";
    public static final String QUERY_MOMENT_LIKES_DEFAULT = "";
    public static String QUERY_MOMENT_MUTED_USERS_DEFAULT = null;
    public static final String QUERY_MOMENT_TOPIC_AGGREGATION_FEED_DEFAULT = "limit=20";
    public static final String QUERY_MOMENT_TOPIC_FEED_DEFAULT = "limit=20";
    public static final String QUERY_NEARBY_FEED_DEFAULT = "limit=20";
    public static final String SUGGESTED_USERS_NORMAL;
    public static final String TAG = "ApiBase";
    public static String TBH_WITH;
    public static final String UPDATE_URL;
    public static String USER_WITH;
    public static String USER_WITH_PUBLIC_MOMENTS;
    public static String WITH_DY_MOMENTS;
    public static String WITH_GIFT_RECORDS;
    public static String WITH_MESSAGES;
    public static String WITH_MOMENTS;
    public static String WITH_RELATIONSHIPS;
    public static String WITH_USERS;
    public static Network network;
    private static final String ACCOUNT_URL = qv5.f159702f + "/v1";
    private static final String ACCOUNTS_URL = qv5.f159718v + "/v2";
    private static final String CORE_URL_V2 = qv5.f159701e + "/v2";

    static {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = qv5.f159703g;
        sb.append(str2);
        sb.append("/v1");
        CLOUD_URL = sb.toString();
        CLOUD_URL_V2 = str2 + "/v2";
        ASSETS_URL = qv5.f159706j;
        String str3 = qv5.f159721y;
        if (str3.contains("tantanapp")) {
            str = str3.replace("http://", "https://") + "/v1";
        } else {
            str = str3 + "/v1";
        }
        ORDER_API = str;
        UPDATE_URL = qv5.f159707k + "/v1";
        ABTESTING_URL = qv5.f159708l;
        AI_GROWTH_URL = qv5.f159709m;
        GROWTH_URL = qv5.f159710n + "/v1";
        f194433H5 = qv5.f159711o;
        MYTANTAN_URL = qv5.f159712p;
        AI_SUGGEST = qv5.f159715s;
        DEVICES_URL = qv5.f159719w + "/v2";
        OMS_URL = qv5.f159691A + "/v2";
        USER_WITH = "contacts,questions,followships";
        USER_WITH_PUBLIC_MOMENTS = "contacts,questions,followships,user.publicMoments";
        MESSAGE_WITH = "questions,stickers";
        CONVERSATION_WITH = "relationships";
        TBH_WITH = "questions,users";
        WITH_GIFT_RECORDS = "giftRecords";
        WITH_USERS = "users," + USER_WITH;
        WITH_MESSAGES = "messages," + MESSAGE_WITH;
        WITH_MOMENTS = Moments.TYPE;
        WITH_RELATIONSHIPS = "relationships";
        WITH_DY_MOMENTS = "dynamic_moments";
        QUERY_CONVERSATIONS_DEFAULT = "limit=100";
        QUERY_MOMENTS_DEFAULT = "limit=20";
        QUERY_MOMENT_MUTED_USERS_DEFAULT = "";
        SUGGESTED_USERS_NORMAL = m211118t("?search=suggested&limit=100&with=" + USER_WITH);
        LOG_JOSN = false;
        MESSAGE_IN_CONVERSATION = 1;
        MESSAGE_IN_MOMENTS = 2;
        MOMENT_IN_FEED = 4;
        INFER_INVALID_MOMENT_REFERENCE = 8;
        network = uqb0.f180376H;
    }

    public xi5() {
        setErrorHandler(new rai0());
    }

    /* JADX INFO: renamed from: a */
    public static String m211099a(String str) {
        return ABTESTING_URL + str;
    }

    /* JADX INFO: renamed from: b */
    public static String m211100b(String str) {
        return ACCOUNTS_URL + str;
    }

    /* JADX INFO: renamed from: c */
    public static String m211101c(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            str2 = "&" + str;
        }
        return m211107i("/activities?limit=20&with=" + WITH_MOMENTS + Constants.SEPARATOR_COMMA + WITH_USERS + Constants.SEPARATOR_COMMA + WITH_MESSAGES + str2);
    }

    /* JADX INFO: renamed from: d */
    public static String m211102d(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            str2 = "&" + str;
        }
        return m211107i("/activities?limit=20&filter=like&with=" + WITH_MOMENTS + Constants.SEPARATOR_COMMA + WITH_USERS + Constants.SEPARATOR_COMMA + WITH_MESSAGES + str2);
    }

    /* JADX INFO: renamed from: e */
    public static String m211103e(String str) {
        return ASSETS_URL + str;
    }

    /* JADX INFO: renamed from: f */
    public static String m211104f() {
        return m211107i("/activities?query=momentLikes");
    }

    /* JADX INFO: renamed from: g */
    public static String m211105g(String str) {
        return CLOUD_URL + str;
    }

    /* JADX INFO: renamed from: h */
    public static String m211106h(String str) {
        return CLOUD_URL_V2 + str;
    }

    /* JADX INFO: renamed from: i */
    public static String m211107i(String str) {
        return CORE_URL_V2 + str;
    }

    /* JADX INFO: renamed from: j */
    public static String m211108j(String str) {
        return DEVICES_URL + str;
    }

    /* JADX INFO: renamed from: k */
    public static String m211109k(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            str2 = "&" + str;
        }
        return m211114p("/followers?with=" + WITH_USERS + "&limit=20" + str2);
    }

    /* JADX INFO: renamed from: l */
    public static String m211110l(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            str2 = "&" + str;
        }
        return m211114p("/followings?with=" + WITH_USERS + "&limit=20" + str2);
    }

    /* JADX INFO: renamed from: m */
    public static String m211111m(String str) {
        return m211114p("/friends?" + str);
    }

    /* JADX INFO: renamed from: n */
    public static String m211112n(String str) {
        return qv5.f159710n + "/v2" + str;
    }

    /* JADX INFO: renamed from: o */
    public static String m211113o(String str) {
        return f194433H5 + str;
    }

    /* JADX INFO: renamed from: p */
    public static String m211114p(String str) {
        return m211118t("/me" + str);
    }

    /* JADX INFO: renamed from: q */
    public static String m211115q(String str) {
        return MYTANTAN_URL + str;
    }

    /* JADX INFO: renamed from: r */
    public static final String m211116r(String str, String str2, String str3, String str4) {
        return m211107i("/pois/nearby?source=" + str + "&search=" + str2 + "&lat=" + str3 + "&lng=" + str4);
    }

    /* JADX INFO: renamed from: s */
    public static String m211117s(String str) {
        return ORDER_API + str;
    }

    /* JADX INFO: renamed from: t */
    public static String m211118t(String str) {
        return m211107i("/users" + str);
    }

    /* JADX INFO: renamed from: u */
    public static String m211119u(String str) {
        return m211118t("/" + str + "?with=" + USER_WITH);
    }

    /* JADX INFO: renamed from: v */
    public static String m211120v(String str) {
        String[] strArrSplit;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        String strM154220m = qv5.f159701e;
        sb.append(strM154220m);
        sb.append("/");
        if (!str.startsWith(sb.toString())) {
            strM154220m = lhl.INSTANCE.m154220m(strM154220m);
            if (!str.startsWith(strM154220m + "/")) {
                strM154220m = null;
            }
        }
        return (strM154220m == null || TextUtils.isEmpty(str.substring(strM154220m.length() + 1)) || (strArrSplit = str.substring(strM154220m.length() + 1).split("/")) == null || strArrSplit.length <= 0) ? "" : strArrSplit[0];
    }

    /* JADX INFO: renamed from: w */
    public static <T> C22421c.d<T, T> m211121w() {
        return psd0.m173592C();
    }

    public xi5(RunnerProxy runnerProxy) {
        super(runnerProxy);
        setErrorHandler(new rai0());
    }
}
