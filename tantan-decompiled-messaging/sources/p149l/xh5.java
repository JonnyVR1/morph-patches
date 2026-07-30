package p149l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.data.Moments;
import com.tantanapp.common.network.RunnerProxy;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
public class xh5 extends RunnerProxy {
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
    private static final String f192859H5;
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
    private static final String ACCOUNT_URL = mu5.f135738f + "/v1";
    private static final String ACCOUNTS_URL = mu5.f135754v + "/v2";
    private static final String CORE_URL_V2 = mu5.f135737e + "/v2";

    static {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = mu5.f135739g;
        sb.append(str2);
        sb.append("/v1");
        CLOUD_URL = sb.toString();
        CLOUD_URL_V2 = str2 + "/v2";
        ASSETS_URL = mu5.f135742j;
        String str3 = mu5.f135757y;
        if (str3.contains("tantanapp")) {
            str = str3.replace("http://", "https://") + "/v1";
        } else {
            str = str3 + "/v1";
        }
        ORDER_API = str;
        UPDATE_URL = mu5.f135743k + "/v1";
        ABTESTING_URL = mu5.f135744l;
        AI_GROWTH_URL = mu5.f135745m;
        GROWTH_URL = mu5.f135746n + "/v1";
        f192859H5 = mu5.f135747o;
        MYTANTAN_URL = mu5.f135748p;
        AI_SUGGEST = mu5.f135751s;
        DEVICES_URL = mu5.f135755w + "/v2";
        OMS_URL = mu5.f135727A + "/v2";
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
        SUGGESTED_USERS_NORMAL = m208772t("?search=suggested&limit=100&with=" + USER_WITH);
        LOG_JOSN = false;
        MESSAGE_IN_CONVERSATION = 1;
        MESSAGE_IN_MOMENTS = 2;
        MOMENT_IN_FEED = 4;
        INFER_INVALID_MOMENT_REFERENCE = 8;
        network = qib0.f154693H;
    }

    public xh5() {
        setErrorHandler(new i2i0());
    }

    /* JADX INFO: renamed from: a */
    public static String m208753a(String str) {
        return ABTESTING_URL + str;
    }

    /* JADX INFO: renamed from: b */
    public static String m208754b(String str) {
        return ACCOUNTS_URL + str;
    }

    /* JADX INFO: renamed from: c */
    public static String m208755c(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            str2 = "&" + str;
        }
        return m208761i("/activities?limit=20&with=" + WITH_MOMENTS + Constants.SEPARATOR_COMMA + WITH_USERS + Constants.SEPARATOR_COMMA + WITH_MESSAGES + str2);
    }

    /* JADX INFO: renamed from: d */
    public static String m208756d(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            str2 = "&" + str;
        }
        return m208761i("/activities?limit=20&filter=like&with=" + WITH_MOMENTS + Constants.SEPARATOR_COMMA + WITH_USERS + Constants.SEPARATOR_COMMA + WITH_MESSAGES + str2);
    }

    /* JADX INFO: renamed from: e */
    public static String m208757e(String str) {
        return ASSETS_URL + str;
    }

    /* JADX INFO: renamed from: f */
    public static String m208758f() {
        return m208761i("/activities?query=momentLikes");
    }

    /* JADX INFO: renamed from: g */
    public static String m208759g(String str) {
        return CLOUD_URL + str;
    }

    /* JADX INFO: renamed from: h */
    public static String m208760h(String str) {
        return CLOUD_URL_V2 + str;
    }

    /* JADX INFO: renamed from: i */
    public static String m208761i(String str) {
        return CORE_URL_V2 + str;
    }

    /* JADX INFO: renamed from: j */
    public static String m208762j(String str) {
        return DEVICES_URL + str;
    }

    /* JADX INFO: renamed from: k */
    public static String m208763k(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            str2 = "&" + str;
        }
        return m208768p("/followers?with=" + WITH_USERS + "&limit=20" + str2);
    }

    /* JADX INFO: renamed from: l */
    public static String m208764l(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            str2 = "&" + str;
        }
        return m208768p("/followings?with=" + WITH_USERS + "&limit=20" + str2);
    }

    /* JADX INFO: renamed from: m */
    public static String m208765m(String str) {
        return m208768p("/friends?" + str);
    }

    /* JADX INFO: renamed from: n */
    public static String m208766n(String str) {
        return mu5.f135746n + "/v2" + str;
    }

    /* JADX INFO: renamed from: o */
    public static String m208767o(String str) {
        return f192859H5 + str;
    }

    /* JADX INFO: renamed from: p */
    public static String m208768p(String str) {
        return m208772t("/me" + str);
    }

    /* JADX INFO: renamed from: q */
    public static String m208769q(String str) {
        return MYTANTAN_URL + str;
    }

    /* JADX INFO: renamed from: r */
    public static final String m208770r(String str, String str2, String str3, String str4) {
        return m208761i("/pois/nearby?source=" + str + "&search=" + str2 + "&lat=" + str3 + "&lng=" + str4);
    }

    /* JADX INFO: renamed from: s */
    public static String m208771s(String str) {
        return ORDER_API + str;
    }

    /* JADX INFO: renamed from: t */
    public static String m208772t(String str) {
        return m208761i("/users" + str);
    }

    /* JADX INFO: renamed from: u */
    public static String m208773u(String str) {
        return m208772t("/" + str + "?with=" + USER_WITH);
    }

    /* JADX INFO: renamed from: v */
    public static String m208774v(String str) {
        String[] strArrSplit;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        String str2 = mu5.f135737e;
        sb.append(str2);
        sb.append("/");
        return (!str.startsWith(sb.toString()) || TextUtils.isEmpty(str.substring(str2.length() + 1)) || (strArrSplit = str.substring(str2.length() + 1).split("/")) == null || strArrSplit.length <= 0) ? "" : strArrSplit[0];
    }

    /* JADX INFO: renamed from: w */
    public static <T> C22306c.d<T, T> m208775w() {
        return mkd0.m154951C();
    }

    public xh5(RunnerProxy runnerProxy) {
        super(runnerProxy);
        setErrorHandler(new i2i0());
    }
}
