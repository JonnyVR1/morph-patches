package p153l;

import android.text.TextUtils;
import android.text.format.DateUtils;
import com.facebook.AuthenticationTokenClaims;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.could.huiyansdk.overseas.HuiYanResultSender;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes13.dex */
public class pu20 {

    /* JADX INFO: renamed from: a */
    public static jxd0 f154136a;

    /* JADX INFO: renamed from: b */
    public static C22508b<uxj0> f154137b;

    /* JADX INFO: renamed from: c */
    public static jxd0 f154138c;

    /* JADX INFO: renamed from: d */
    public static byd0 f154139d;

    /* JADX INFO: renamed from: e */
    public static byd0 f154140e;

    /* JADX INFO: renamed from: f */
    public static jxd0 f154141f;

    /* JADX INFO: renamed from: g */
    public static byd0 f154142g;

    /* JADX INFO: renamed from: h */
    public static byd0 f154143h;

    /* JADX INFO: renamed from: i */
    public static vxd0 f154144i;

    /* JADX INFO: renamed from: j */
    public static HashSet<String> f154145j;

    /* JADX INFO: renamed from: k */
    public static ArrayList<f60> f154146k;

    /* JADX INFO: renamed from: l */
    public static String f154147l;

    /* JADX INFO: renamed from: m */
    public static String f154148m;

    static {
        String str = "HAS_SHOW_DATING_FOLLOW_TIP" + FeedModule.m61405F().userId();
        Boolean bool = Boolean.FALSE;
        f154136a = new jxd0(str, bool);
        f154137b = C22508b.m222767b();
        f154138c = new jxd0("HAS_SHOW_AUDIO_MOMENT_PUBLISH_TIP" + FeedModule.m61405F().userId(), bool);
        f154139d = new byd0("show_activities_tips_last_time_" + FeedModule.m61405F().userId(), 0L);
        f154140e = new byd0("lastCheckLocationPermissionMillis", 0L);
        f154141f = new jxd0("HAS_SHOW_MSG_BELL_TIP" + FeedModule.m61405F().userId(), bool);
        f154142g = new byd0("show_activities_featured_tips_last_time_" + FeedModule.m61405F().userId(), 0L);
        f154143h = new byd0("last_auto_open_say_hi_time_" + FeedModule.m61405F().userId(), 0L);
        f154144i = new vxd0("auto_open_say_hi_count_" + FeedModule.m61405F().userId(), 0);
        f154146k = new ArrayList<>();
        f154147l = null;
        f154148m = null;
    }

    /* JADX INFO: renamed from: A */
    public static boolean m173796A() {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("discover_config");
            if (TextUtils.isEmpty(strM80485F)) {
                return true;
            }
            return new JSONObject(strM80485F).getBoolean("followSecondSwitch");
        } catch (Exception unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: B */
    public static boolean m173797B(String str) {
        return cmg.m111233s() && TextUtils.equals(str, "from_discover_dating");
    }

    /* JADX INFO: renamed from: C */
    public static boolean m173798C(String str) {
        if (cmg.m111233s()) {
            return TextUtils.equals(str, "from_discover_dating") || TextUtils.equals(str, "from_discover_discussion");
        }
        return false;
    }

    /* JADX INFO: renamed from: D */
    public static boolean m173799D() {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("discover_config");
            if (TextUtils.isEmpty(strM80485F)) {
                return true;
            }
            return new JSONObject(strM80485F).getJSONObject("datingFunction").getBoolean("distance");
        } catch (Exception unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: E */
    public static boolean m173800E() {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("discover_config");
            if (TextUtils.isEmpty(strM80485F)) {
                return true;
            }
            return new JSONObject(strM80485F).getJSONObject("datingFunction").getBoolean("greet");
        } catch (Exception unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: F */
    public static boolean m173801F() {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("discover_config");
            if (TextUtils.isEmpty(strM80485F)) {
                return true;
            }
            return new JSONObject(strM80485F).getJSONObject("datingFunction").getBoolean("time");
        } catch (Exception unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: G */
    public static boolean m173802G() {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("discover_config");
            if (TextUtils.isEmpty(strM80485F)) {
                return false;
            }
            return new JSONObject(strM80485F).getJSONObject("discussionFunction").getBoolean("distance");
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: H */
    public static boolean m173803H() {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("discover_config");
            if (TextUtils.isEmpty(strM80485F)) {
                return false;
            }
            return new JSONObject(strM80485F).getJSONObject("discussionFunction").getBoolean("greet");
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: I */
    public static boolean m173804I() {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("discover_config");
            if (TextUtils.isEmpty(strM80485F)) {
                return false;
            }
            return new JSONObject(strM80485F).getJSONObject("discussionFunction").getBoolean("time");
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: J */
    public static void m173805J() {
        if (cmg.m111234s0()) {
            long jLongValue = f154143h.get().longValue();
            int iIntValue = f154144i.get().intValue();
            int iM173831z = m173831z();
            if (jLongValue <= 0 || !DateUtils.isToday(jLongValue)) {
                f154143h.put(Long.valueOf(pzi0.m174454o()));
                f154144i.put(1);
            } else {
                if (!DateUtils.isToday(jLongValue) || iIntValue >= iM173831z) {
                    return;
                }
                f154143h.put(Long.valueOf(pzi0.m174454o()));
                f154144i.put(Integer.valueOf(iIntValue + 1));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m173806a() {
        if (cmg.m111234s0() && !FeedModule.m61406H().me_().isFemale()) {
            long jLongValue = f154143h.get().longValue();
            int iIntValue = f154144i.get().intValue();
            int iM173831z = m173831z();
            if (iM173831z <= 0) {
                return false;
            }
            if (jLongValue <= 0 || !DateUtils.isToday(jLongValue)) {
                return true;
            }
            if (DateUtils.isToday(jLongValue) && iIntValue < iM173831z) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static String m173807b(String str) {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("moment_activity_list");
            if (TextUtils.isEmpty(strM80485F)) {
                return null;
            }
            return new JSONObject(strM80485F).getJSONObject(str).getString("image_action_url");
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m173808c(int i) {
        ArrayList arrayList = (ArrayList) m173811f();
        return (jyb.m147479J(arrayList) || arrayList.size() <= i) ? "" : ((f60) arrayList.get(i)).f97369b;
    }

    /* JADX INFO: renamed from: d */
    public static String m173809d(String str) {
        ArrayList arrayList = (ArrayList) m173811f();
        if (jyb.m147479J(arrayList)) {
            return "";
        }
        if (TextUtils.equals(str, "from_activity_tab_one")) {
            return ((f60) arrayList.get(0)).f97369b;
        }
        return (!TextUtils.equals(str, "from_activity_tab_two") || arrayList.size() <= 1) ? "" : ((f60) arrayList.get(1)).f97369b;
    }

    /* JADX INFO: renamed from: e */
    public static String m173810e(int i) {
        ArrayList arrayList = (ArrayList) m173811f();
        return (jyb.m147479J(arrayList) || arrayList.size() <= i) ? "" : ((f60) arrayList.get(i)).f97370c;
    }

    /* JADX INFO: renamed from: f */
    public static List<f60> m173811f() {
        if (jyb.m147479J(f154146k)) {
            m173812g();
        }
        return f154146k;
    }

    /* JADX INFO: renamed from: g */
    public static void m173812g() {
        try {
            f154146k.clear();
            String strM80485F = RemoteConfig.m80481x().m80485F("dating_tab_configs");
            if (TextUtils.isEmpty(strM80485F)) {
                return;
            }
            JSONArray jSONArray = new JSONArray(strM80485F);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                f60 f60Var = new f60();
                f60Var.f97368a = jSONObject.getString("tab_name");
                f60Var.f97369b = jSONObject.getString("pid");
                f60Var.f97370c = jSONObject.getString(FirebaseAnalytics.Event.SEARCH);
                if (!jSONObject.has(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION) || jSONObject.getBoolean(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION)) {
                    f154146k.add(f60Var);
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: h */
    public static String m173813h() {
        if (!TextUtils.isEmpty(f154147l)) {
            return f154147l;
        }
        String strM173815j = m173815j("secondFollowName");
        f154147l = strM173815j;
        if (!TextUtils.isEmpty(strM173815j)) {
            return f154147l;
        }
        f154147l = "关注";
        return "关注";
    }

    /* JADX INFO: renamed from: i */
    public static String m173814i() {
        if (!TextUtils.isEmpty(f154148m)) {
            return f154148m;
        }
        String strM173815j = m173815j("secondLikeName");
        f154148m = strM173815j;
        if (!TextUtils.isEmpty(strM173815j)) {
            return f154148m;
        }
        f154148m = "喜欢的人";
        return "喜欢的人";
    }

    /* JADX INFO: renamed from: j */
    public static String m173815j(String str) {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("discover_config");
            if (!TextUtils.isEmpty(strM80485F)) {
                String string = new JSONObject(strM80485F).getJSONObject("datingSecondName").getString(str);
                return TextUtils.isEmpty(string) ? "" : string;
            }
        } catch (Exception unused) {
        }
        return "";
    }

    /* JADX INFO: renamed from: k */
    public static String m173816k() {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("discover_config");
            if (!TextUtils.isEmpty(strM80485F)) {
                JSONObject jSONObject = new JSONObject(strM80485F);
                String string = jSONObject.getString("defaultTabMale");
                String string2 = jSONObject.getString("defaultTabFemale");
                if (FeedModule.m61406H().me_().isFemale()) {
                    string = string2;
                }
                if (cmg.m111183K() && TextUtils.equals(string, "like")) {
                    return m173814i();
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
    public static long m173817l() {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("feed_auto_refresh_time");
            if (TextUtils.isEmpty(strM80485F)) {
                return AuthenticationTokenClaims.MAX_TIME_SINCE_TOKEN_ISSUED;
            }
            int i = new JSONObject(strM80485F).getInt("autoRefreshTime");
            if (i <= 0) {
                i = 10;
            }
            return i * HuiYanResultSender.TIMEOUT_MS;
        } catch (Exception unused) {
            return AuthenticationTokenClaims.MAX_TIME_SINCE_TOKEN_ISSUED;
        }
    }

    /* JADX INFO: renamed from: m */
    public static boolean m173818m() {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("feed_auto_refresh_time");
            if (TextUtils.isEmpty(strM80485F)) {
                return false;
            }
            return new JSONObject(strM80485F).getBoolean("allSwitch");
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: n */
    public static int m173819n() {
        int i;
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("moment_operation_guides_config");
            if (TextUtils.isEmpty(strM80485F) || (i = new JSONObject(strM80485F).getInt("man_made_display_times")) <= 0) {
                return 1;
            }
            return i;
        } catch (Exception unused) {
        }
        return 1;
    }

    /* JADX INFO: renamed from: o */
    public static HashSet<String> m173820o() {
        String[] strArrSplit;
        if (NullChecker.m82486a(f154145j)) {
            return f154145j;
        }
        HashSet<String> hashSet = new HashSet<>();
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("discover_config");
            if (!TextUtils.isEmpty(strM80485F)) {
                String string = new JSONObject(strM80485F).getString("banner");
                if (!TextUtils.isEmpty(string) && (strArrSplit = string.split(com.clevertap.android.sdk.Constants.SEPARATOR_COMMA)) != null && strArrSplit.length > 0) {
                    for (String str : strArrSplit) {
                        hashSet.add(str);
                    }
                }
            }
        } catch (Exception unused) {
        }
        f154145j = hashSet;
        return hashSet;
    }

    /* JADX INFO: renamed from: p */
    public static String m173821p() {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("discover_config");
            if (!TextUtils.isEmpty(strM80485F)) {
                JSONObject jSONObject = new JSONObject(strM80485F).getJSONObject("datingSecondName");
                String string = jSONObject.getString("datingSecondNameMale");
                String string2 = jSONObject.getString("datingSecondNameFemale");
                if (FeedModule.m61406H().me_().isFemale()) {
                    string = string2;
                }
                return TextUtils.isEmpty(string) ? "全部" : string;
            }
        } catch (Exception unused) {
        }
        return "全部";
    }

    /* JADX INFO: renamed from: q */
    public static String m173822q() {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("discover_config");
            if (!TextUtils.isEmpty(strM80485F)) {
                String string = new JSONObject(strM80485F).getJSONObject("tabName").getString("dating");
                return TextUtils.isEmpty(string) ? "交友" : string;
            }
        } catch (Exception unused) {
        }
        return "交友";
    }

    /* JADX INFO: renamed from: r */
    public static String m173823r() {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("discover_config");
            if (!TextUtils.isEmpty(strM80485F)) {
                String string = new JSONObject(strM80485F).getJSONObject("tabName").getString("discussion");
                return TextUtils.isEmpty(string) ? "热议" : string;
            }
        } catch (Exception unused) {
        }
        return "热议";
    }

    /* JADX INFO: renamed from: s */
    public static boolean m173824s() {
        return m173825t() || m173826u();
    }

    /* JADX INFO: renamed from: t */
    public static boolean m173825t() {
        return !jyb.m147479J(f154146k) && f154146k.size() == 1;
    }

    /* JADX INFO: renamed from: u */
    public static boolean m173826u() {
        return !jyb.m147479J(f154146k) && f154146k.size() > 1;
    }

    /* JADX INFO: renamed from: v */
    public static boolean m173827v() {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("discover_config");
            if (TextUtils.isEmpty(strM80485F)) {
                return true;
            }
            JSONObject jSONObject = new JSONObject(strM80485F);
            String string = jSONObject.getString("defaultTabMale");
            String string2 = jSONObject.getString("defaultTabFemale");
            if (FeedModule.m61406H().me_().isFemale()) {
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
    public static boolean m173828w() {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("discover_config");
            if (TextUtils.isEmpty(strM80485F)) {
                return true;
            }
            return new JSONObject(strM80485F).getBoolean("discoverSwitch");
        } catch (Exception unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: x */
    public static boolean m173829x() {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("explore_state_moment4_full_config");
            if (TextUtils.isEmpty(strM80485F)) {
                return false;
            }
            return new JSONObject(strM80485F).getBoolean("fullSwitch");
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: y */
    public static boolean m173830y() {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("explore_state_moment4_full_config");
            if (TextUtils.isEmpty(strM80485F)) {
                return true;
            }
            return new JSONObject(strM80485F).getBoolean("sayHiSwitch");
        } catch (Exception unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: z */
    public static int m173831z() {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("explore_state_moment4_full_config");
            if (TextUtils.isEmpty(strM80485F)) {
                return 1;
            }
            return new JSONObject(strM80485F).getInt("sayHiTimes");
        } catch (Exception unused) {
            return 1;
        }
    }
}
