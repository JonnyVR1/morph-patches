package p149l;

import android.text.TextUtils;
import android.text.format.DateUtils;
import com.facebook.AuthenticationTokenClaims;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.could.huiyansdk.overseas.HuiYanResultSender;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes12.dex */
public class fm20 {

    /* JADX INFO: renamed from: a */
    public static hpd0 f98238a;

    /* JADX INFO: renamed from: b */
    public static C22393b<roj0> f98239b;

    /* JADX INFO: renamed from: c */
    public static hpd0 f98240c;

    /* JADX INFO: renamed from: d */
    public static zpd0 f98241d;

    /* JADX INFO: renamed from: e */
    public static zpd0 f98242e;

    /* JADX INFO: renamed from: f */
    public static hpd0 f98243f;

    /* JADX INFO: renamed from: g */
    public static zpd0 f98244g;

    /* JADX INFO: renamed from: h */
    public static zpd0 f98245h;

    /* JADX INFO: renamed from: i */
    public static tpd0 f98246i;

    /* JADX INFO: renamed from: j */
    public static HashSet<String> f98247j;

    /* JADX INFO: renamed from: k */
    public static ArrayList<j60> f98248k;

    /* JADX INFO: renamed from: l */
    public static String f98249l;

    /* JADX INFO: renamed from: m */
    public static String f98250m;

    static {
        String str = "HAS_SHOW_DATING_FOLLOW_TIP" + FeedModule.m60221F().userId();
        Boolean bool = Boolean.FALSE;
        f98238a = new hpd0(str, bool);
        f98239b = C22393b.m221521b();
        f98240c = new hpd0("HAS_SHOW_AUDIO_MOMENT_PUBLISH_TIP" + FeedModule.m60221F().userId(), bool);
        f98241d = new zpd0("show_activities_tips_last_time_" + FeedModule.m60221F().userId(), 0L);
        f98242e = new zpd0("lastCheckLocationPermissionMillis", 0L);
        f98243f = new hpd0("HAS_SHOW_MSG_BELL_TIP" + FeedModule.m60221F().userId(), bool);
        f98244g = new zpd0("show_activities_featured_tips_last_time_" + FeedModule.m60221F().userId(), 0L);
        f98245h = new zpd0("last_auto_open_say_hi_time_" + FeedModule.m60221F().userId(), 0L);
        f98246i = new tpd0("auto_open_say_hi_count_" + FeedModule.m60221F().userId(), 0);
        f98248k = new ArrayList<>();
        f98249l = null;
        f98250m = null;
    }

    /* JADX INFO: renamed from: A */
    public static boolean m122108A() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("discover_config");
            if (TextUtils.isEmpty(strM79302F)) {
                return true;
            }
            return new JSONObject(strM79302F).getBoolean("followSecondSwitch");
        } catch (Exception unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: B */
    public static boolean m122109B(String str) {
        return nkg.m159904s() && TextUtils.equals(str, "from_discover_dating");
    }

    /* JADX INFO: renamed from: C */
    public static boolean m122110C(String str) {
        if (nkg.m159904s()) {
            return TextUtils.equals(str, "from_discover_dating") || TextUtils.equals(str, "from_discover_discussion");
        }
        return false;
    }

    /* JADX INFO: renamed from: D */
    public static boolean m122111D() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("discover_config");
            if (TextUtils.isEmpty(strM79302F)) {
                return true;
            }
            return new JSONObject(strM79302F).getJSONObject("datingFunction").getBoolean("distance");
        } catch (Exception unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: E */
    public static boolean m122112E() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("discover_config");
            if (TextUtils.isEmpty(strM79302F)) {
                return true;
            }
            return new JSONObject(strM79302F).getJSONObject("datingFunction").getBoolean("greet");
        } catch (Exception unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: F */
    public static boolean m122113F() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("discover_config");
            if (TextUtils.isEmpty(strM79302F)) {
                return true;
            }
            return new JSONObject(strM79302F).getJSONObject("datingFunction").getBoolean("time");
        } catch (Exception unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: G */
    public static boolean m122114G() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("discover_config");
            if (TextUtils.isEmpty(strM79302F)) {
                return false;
            }
            return new JSONObject(strM79302F).getJSONObject("discussionFunction").getBoolean("distance");
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: H */
    public static boolean m122115H() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("discover_config");
            if (TextUtils.isEmpty(strM79302F)) {
                return false;
            }
            return new JSONObject(strM79302F).getJSONObject("discussionFunction").getBoolean("greet");
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: I */
    public static boolean m122116I() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("discover_config");
            if (TextUtils.isEmpty(strM79302F)) {
                return false;
            }
            return new JSONObject(strM79302F).getJSONObject("discussionFunction").getBoolean("time");
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: J */
    public static void m122117J() {
        if (nkg.m159905s0()) {
            long jLongValue = f98245h.get().longValue();
            int iIntValue = f98246i.get().intValue();
            int iM122143z = m122143z();
            if (jLongValue <= 0 || !DateUtils.isToday(jLongValue)) {
                f98245h.put(Long.valueOf(mqi0.m155944o()));
                f98246i.put(1);
            } else {
                if (!DateUtils.isToday(jLongValue) || iIntValue >= iM122143z) {
                    return;
                }
                f98245h.put(Long.valueOf(mqi0.m155944o()));
                f98246i.put(Integer.valueOf(iIntValue + 1));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m122118a() {
        if (nkg.m159905s0() && !FeedModule.m60222H().me_().isFemale()) {
            long jLongValue = f98245h.get().longValue();
            int iIntValue = f98246i.get().intValue();
            int iM122143z = m122143z();
            if (iM122143z <= 0) {
                return false;
            }
            if (jLongValue <= 0 || !DateUtils.isToday(jLongValue)) {
                return true;
            }
            if (DateUtils.isToday(jLongValue) && iIntValue < iM122143z) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static String m122119b(String str) {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("moment_activity_list");
            if (TextUtils.isEmpty(strM79302F)) {
                return null;
            }
            return new JSONObject(strM79302F).getJSONObject(str).getString("image_action_url");
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m122120c(int i) {
        ArrayList arrayList = (ArrayList) m122123f();
        return (vwb.m200296J(arrayList) || arrayList.size() <= i) ? "" : ((j60) arrayList.get(i)).f116372b;
    }

    /* JADX INFO: renamed from: d */
    public static String m122121d(String str) {
        ArrayList arrayList = (ArrayList) m122123f();
        if (vwb.m200296J(arrayList)) {
            return "";
        }
        if (TextUtils.equals(str, "from_activity_tab_one")) {
            return ((j60) arrayList.get(0)).f116372b;
        }
        return (!TextUtils.equals(str, "from_activity_tab_two") || arrayList.size() <= 1) ? "" : ((j60) arrayList.get(1)).f116372b;
    }

    /* JADX INFO: renamed from: e */
    public static String m122122e(int i) {
        ArrayList arrayList = (ArrayList) m122123f();
        return (vwb.m200296J(arrayList) || arrayList.size() <= i) ? "" : ((j60) arrayList.get(i)).f116373c;
    }

    /* JADX INFO: renamed from: f */
    public static List<j60> m122123f() {
        if (vwb.m200296J(f98248k)) {
            m122124g();
        }
        return f98248k;
    }

    /* JADX INFO: renamed from: g */
    public static void m122124g() {
        try {
            f98248k.clear();
            String strM79302F = RemoteConfig.m79298x().m79302F("dating_tab_configs");
            if (TextUtils.isEmpty(strM79302F)) {
                return;
            }
            JSONArray jSONArray = new JSONArray(strM79302F);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                j60 j60Var = new j60();
                j60Var.f116371a = jSONObject.getString("tab_name");
                j60Var.f116372b = jSONObject.getString("pid");
                j60Var.f116373c = jSONObject.getString(FirebaseAnalytics.Event.SEARCH);
                if (!jSONObject.has(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION) || jSONObject.getBoolean(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION)) {
                    f98248k.add(j60Var);
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: h */
    public static String m122125h() {
        if (!TextUtils.isEmpty(f98249l)) {
            return f98249l;
        }
        String strM122127j = m122127j("secondFollowName");
        f98249l = strM122127j;
        if (!TextUtils.isEmpty(strM122127j)) {
            return f98249l;
        }
        f98249l = "关注";
        return "关注";
    }

    /* JADX INFO: renamed from: i */
    public static String m122126i() {
        if (!TextUtils.isEmpty(f98250m)) {
            return f98250m;
        }
        String strM122127j = m122127j("secondLikeName");
        f98250m = strM122127j;
        if (!TextUtils.isEmpty(strM122127j)) {
            return f98250m;
        }
        f98250m = "喜欢的人";
        return "喜欢的人";
    }

    /* JADX INFO: renamed from: j */
    public static String m122127j(String str) {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("discover_config");
            if (!TextUtils.isEmpty(strM79302F)) {
                String string = new JSONObject(strM79302F).getJSONObject("datingSecondName").getString(str);
                return TextUtils.isEmpty(string) ? "" : string;
            }
        } catch (Exception unused) {
        }
        return "";
    }

    /* JADX INFO: renamed from: k */
    public static String m122128k() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("discover_config");
            if (!TextUtils.isEmpty(strM79302F)) {
                JSONObject jSONObject = new JSONObject(strM79302F);
                String string = jSONObject.getString("defaultTabMale");
                String string2 = jSONObject.getString("defaultTabFemale");
                if (FeedModule.m60222H().me_().isFemale()) {
                    string = string2;
                }
                if (nkg.m159854K() && TextUtils.equals(string, "like")) {
                    return m122126i();
                }
                JSONObject jSONObject2 = jSONObject.getJSONObject("tabName");
                String string3 = jSONObject2.getString("dating");
                String string4 = jSONObject2.getString("discussion");
                if ("dating".equals(string)) {
                    if (TextUtils.isEmpty(string3)) {
                        return "交友";
                    }
                } else {
                    if ("discussion".equals(string)) {
                        return TextUtils.isEmpty(string4) ? "热议" : string4;
                    }
                    if (TextUtils.isEmpty(string3)) {
                        return "交友";
                    }
                }
                return string3;
            }
        } catch (Exception unused) {
        }
        return "交友";
    }

    /* JADX INFO: renamed from: l */
    public static long m122129l() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("feed_auto_refresh_time");
            if (TextUtils.isEmpty(strM79302F)) {
                return AuthenticationTokenClaims.MAX_TIME_SINCE_TOKEN_ISSUED;
            }
            int i = new JSONObject(strM79302F).getInt("autoRefreshTime");
            if (i <= 0) {
                i = 10;
            }
            return i * HuiYanResultSender.TIMEOUT_MS;
        } catch (Exception unused) {
            return AuthenticationTokenClaims.MAX_TIME_SINCE_TOKEN_ISSUED;
        }
    }

    /* JADX INFO: renamed from: m */
    public static boolean m122130m() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("feed_auto_refresh_time");
            if (TextUtils.isEmpty(strM79302F)) {
                return false;
            }
            return new JSONObject(strM79302F).getBoolean("allSwitch");
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: n */
    public static int m122131n() {
        int i;
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("moment_operation_guides_config");
            if (TextUtils.isEmpty(strM79302F) || (i = new JSONObject(strM79302F).getInt("man_made_display_times")) <= 0) {
                return 1;
            }
            return i;
        } catch (Exception unused) {
        }
        return 1;
    }

    /* JADX INFO: renamed from: o */
    public static HashSet<String> m122132o() {
        String[] strArrSplit;
        if (NullChecker.m81303a(f98247j)) {
            return f98247j;
        }
        HashSet<String> hashSet = new HashSet<>();
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("discover_config");
            if (!TextUtils.isEmpty(strM79302F)) {
                String string = new JSONObject(strM79302F).getString("banner");
                if (!TextUtils.isEmpty(string) && (strArrSplit = string.split(com.clevertap.android.sdk.Constants.SEPARATOR_COMMA)) != null && strArrSplit.length > 0) {
                    for (String str : strArrSplit) {
                        hashSet.add(str);
                    }
                }
            }
        } catch (Exception unused) {
        }
        f98247j = hashSet;
        return hashSet;
    }

    /* JADX INFO: renamed from: p */
    public static String m122133p() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("discover_config");
            if (!TextUtils.isEmpty(strM79302F)) {
                JSONObject jSONObject = new JSONObject(strM79302F).getJSONObject("datingSecondName");
                String string = jSONObject.getString("datingSecondNameMale");
                String string2 = jSONObject.getString("datingSecondNameFemale");
                if (FeedModule.m60222H().me_().isFemale()) {
                    string = string2;
                }
                return TextUtils.isEmpty(string) ? "全部" : string;
            }
        } catch (Exception unused) {
        }
        return "全部";
    }

    /* JADX INFO: renamed from: q */
    public static String m122134q() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("discover_config");
            if (!TextUtils.isEmpty(strM79302F)) {
                String string = new JSONObject(strM79302F).getJSONObject("tabName").getString("dating");
                return TextUtils.isEmpty(string) ? "交友" : string;
            }
        } catch (Exception unused) {
        }
        return "交友";
    }

    /* JADX INFO: renamed from: r */
    public static String m122135r() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("discover_config");
            if (!TextUtils.isEmpty(strM79302F)) {
                String string = new JSONObject(strM79302F).getJSONObject("tabName").getString("discussion");
                return TextUtils.isEmpty(string) ? "热议" : string;
            }
        } catch (Exception unused) {
        }
        return "热议";
    }

    /* JADX INFO: renamed from: s */
    public static boolean m122136s() {
        return m122137t() || m122138u();
    }

    /* JADX INFO: renamed from: t */
    public static boolean m122137t() {
        return !vwb.m200296J(f98248k) && f98248k.size() == 1;
    }

    /* JADX INFO: renamed from: u */
    public static boolean m122138u() {
        return !vwb.m200296J(f98248k) && f98248k.size() > 1;
    }

    /* JADX INFO: renamed from: v */
    public static boolean m122139v() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("discover_config");
            if (TextUtils.isEmpty(strM79302F)) {
                return true;
            }
            JSONObject jSONObject = new JSONObject(strM79302F);
            String string = jSONObject.getString("defaultTabMale");
            String string2 = jSONObject.getString("defaultTabFemale");
            if (FeedModule.m60222H().me_().isFemale()) {
                string = string2;
            }
            if ("dating".equals(string)) {
                return true;
            }
            return true ^ "discussion".equals(string);
        } catch (Exception unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: w */
    public static boolean m122140w() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("discover_config");
            if (TextUtils.isEmpty(strM79302F)) {
                return true;
            }
            return new JSONObject(strM79302F).getBoolean("discoverSwitch");
        } catch (Exception unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: x */
    public static boolean m122141x() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("explore_state_moment4_full_config");
            if (TextUtils.isEmpty(strM79302F)) {
                return false;
            }
            return new JSONObject(strM79302F).getBoolean("fullSwitch");
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: y */
    public static boolean m122142y() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("explore_state_moment4_full_config");
            if (TextUtils.isEmpty(strM79302F)) {
                return true;
            }
            return new JSONObject(strM79302F).getBoolean("sayHiSwitch");
        } catch (Exception unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: z */
    public static int m122143z() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("explore_state_moment4_full_config");
            if (TextUtils.isEmpty(strM79302F)) {
                return 1;
            }
            return new JSONObject(strM79302F).getInt("sayHiTimes");
        } catch (Exception unused) {
            return 1;
        }
    }
}
