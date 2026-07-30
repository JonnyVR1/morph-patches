package p007l;

import android.text.TextUtils;
import android.text.format.DateUtils;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import l.hpd0;
import l.mqi0;
import l.roj0;
import l.tpd0;
import l.vwb;
import l.zpd0;
import org.json.JSONArray;
import org.json.JSONObject;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class fm20 {

    /* JADX INFO: renamed from: a */
    public static hpd0 f8150a;

    /* JADX INFO: renamed from: b */
    public static b<roj0> f8151b;

    /* JADX INFO: renamed from: c */
    public static hpd0 f8152c;

    /* JADX INFO: renamed from: d */
    public static zpd0 f8153d;

    /* JADX INFO: renamed from: e */
    public static zpd0 f8154e;

    /* JADX INFO: renamed from: f */
    public static hpd0 f8155f;

    /* JADX INFO: renamed from: g */
    public static zpd0 f8156g;

    /* JADX INFO: renamed from: h */
    public static zpd0 f8157h;

    /* JADX INFO: renamed from: i */
    public static tpd0 f8158i;

    /* JADX INFO: renamed from: j */
    public static HashSet<String> f8159j;

    /* JADX INFO: renamed from: k */
    public static ArrayList<j60> f8160k;

    /* JADX INFO: renamed from: l */
    public static String f8161l;

    /* JADX INFO: renamed from: m */
    public static String f8162m;

    static {
        String str = "HAS_SHOW_DATING_FOLLOW_TIP" + FeedModule.m1139F().userId();
        Boolean bool = Boolean.FALSE;
        f8150a = new hpd0(str, bool);
        f8151b = b.b();
        f8152c = new hpd0("HAS_SHOW_AUDIO_MOMENT_PUBLISH_TIP" + FeedModule.m1139F().userId(), bool);
        f8153d = new zpd0("show_activities_tips_last_time_" + FeedModule.m1139F().userId(), 0L);
        f8154e = new zpd0("lastCheckLocationPermissionMillis", 0L);
        f8155f = new hpd0("HAS_SHOW_MSG_BELL_TIP" + FeedModule.m1139F().userId(), bool);
        f8156g = new zpd0("show_activities_featured_tips_last_time_" + FeedModule.m1139F().userId(), 0L);
        f8157h = new zpd0("last_auto_open_say_hi_time_" + FeedModule.m1139F().userId(), 0L);
        f8158i = new tpd0("auto_open_say_hi_count_" + FeedModule.m1139F().userId(), 0);
        f8160k = new ArrayList<>();
        f8161l = null;
        f8162m = null;
    }

    /* JADX INFO: renamed from: A */
    public static boolean m10211A() {
        try {
            String strF = RemoteConfig.x().F("discover_config");
            if (TextUtils.isEmpty(strF)) {
                return true;
            }
            return new JSONObject(strF).getBoolean("followSecondSwitch");
        } catch (Exception unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: B */
    public static boolean m10212B(String str) {
        return nkg.m12263s() && TextUtils.equals(str, "from_discover_dating");
    }

    /* JADX INFO: renamed from: C */
    public static boolean m10213C(String str) {
        if (nkg.m12263s()) {
            return TextUtils.equals(str, "from_discover_dating") || TextUtils.equals(str, "from_discover_discussion");
        }
        return false;
    }

    /* JADX INFO: renamed from: D */
    public static boolean m10214D() {
        try {
            String strF = RemoteConfig.x().F("discover_config");
            if (TextUtils.isEmpty(strF)) {
                return true;
            }
            return new JSONObject(strF).getJSONObject("datingFunction").getBoolean("distance");
        } catch (Exception unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: E */
    public static boolean m10215E() {
        try {
            String strF = RemoteConfig.x().F("discover_config");
            if (TextUtils.isEmpty(strF)) {
                return true;
            }
            return new JSONObject(strF).getJSONObject("datingFunction").getBoolean("greet");
        } catch (Exception unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: F */
    public static boolean m10216F() {
        try {
            String strF = RemoteConfig.x().F("discover_config");
            if (TextUtils.isEmpty(strF)) {
                return true;
            }
            return new JSONObject(strF).getJSONObject("datingFunction").getBoolean("time");
        } catch (Exception unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: G */
    public static boolean m10217G() {
        try {
            String strF = RemoteConfig.x().F("discover_config");
            if (TextUtils.isEmpty(strF)) {
                return false;
            }
            return new JSONObject(strF).getJSONObject("discussionFunction").getBoolean("distance");
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: H */
    public static boolean m10218H() {
        try {
            String strF = RemoteConfig.x().F("discover_config");
            if (TextUtils.isEmpty(strF)) {
                return false;
            }
            return new JSONObject(strF).getJSONObject("discussionFunction").getBoolean("greet");
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: I */
    public static boolean m10219I() {
        try {
            String strF = RemoteConfig.x().F("discover_config");
            if (TextUtils.isEmpty(strF)) {
                return false;
            }
            return new JSONObject(strF).getJSONObject("discussionFunction").getBoolean("time");
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: J */
    public static void m10220J() {
        if (nkg.m12264s0()) {
            long jLongValue = ((Long) f8157h.get()).longValue();
            int iIntValue = ((Integer) f8158i.get()).intValue();
            int iM10246z = m10246z();
            if (jLongValue <= 0 || !DateUtils.isToday(jLongValue)) {
                f8157h.put(Long.valueOf(mqi0.o()));
                f8158i.put(1);
            } else {
                if (!DateUtils.isToday(jLongValue) || iIntValue >= iM10246z) {
                    return;
                }
                f8157h.put(Long.valueOf(mqi0.o()));
                f8158i.put(Integer.valueOf(iIntValue + 1));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m10221a() {
        if (nkg.m12264s0() && !FeedModule.m1140H().me_().isFemale()) {
            long jLongValue = ((Long) f8157h.get()).longValue();
            int iIntValue = ((Integer) f8158i.get()).intValue();
            int iM10246z = m10246z();
            if (iM10246z <= 0) {
                return false;
            }
            if (jLongValue <= 0 || !DateUtils.isToday(jLongValue)) {
                return true;
            }
            if (DateUtils.isToday(jLongValue) && iIntValue < iM10246z) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static String m10222b(String str) {
        try {
            String strF = RemoteConfig.x().F("moment_activity_list");
            if (TextUtils.isEmpty(strF)) {
                return null;
            }
            return new JSONObject(strF).getJSONObject(str).getString("image_action_url");
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m10223c(int i) {
        ArrayList arrayList = (ArrayList) m10226f();
        return (vwb.J(arrayList) || arrayList.size() <= i) ? "" : ((j60) arrayList.get(i)).f9236b;
    }

    /* JADX INFO: renamed from: d */
    public static String m10224d(String str) {
        ArrayList arrayList = (ArrayList) m10226f();
        if (vwb.J(arrayList)) {
            return "";
        }
        if (TextUtils.equals(str, "from_activity_tab_one")) {
            return ((j60) arrayList.get(0)).f9236b;
        }
        return (!TextUtils.equals(str, "from_activity_tab_two") || arrayList.size() <= 1) ? "" : ((j60) arrayList.get(1)).f9236b;
    }

    /* JADX INFO: renamed from: e */
    public static String m10225e(int i) {
        ArrayList arrayList = (ArrayList) m10226f();
        return (vwb.J(arrayList) || arrayList.size() <= i) ? "" : ((j60) arrayList.get(i)).f9237c;
    }

    /* JADX INFO: renamed from: f */
    public static List<j60> m10226f() {
        if (vwb.J(f8160k)) {
            m10227g();
        }
        return f8160k;
    }

    /* JADX INFO: renamed from: g */
    public static void m10227g() {
        try {
            f8160k.clear();
            String strF = RemoteConfig.x().F("dating_tab_configs");
            if (TextUtils.isEmpty(strF)) {
                return;
            }
            JSONArray jSONArray = new JSONArray(strF);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                j60 j60Var = new j60();
                j60Var.f9235a = jSONObject.getString("tab_name");
                j60Var.f9236b = jSONObject.getString("pid");
                j60Var.f9237c = jSONObject.getString("search");
                if (!jSONObject.has("display") || jSONObject.getBoolean("display")) {
                    f8160k.add(j60Var);
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: h */
    public static String m10228h() {
        if (!TextUtils.isEmpty(f8161l)) {
            return f8161l;
        }
        String strM10230j = m10230j("secondFollowName");
        f8161l = strM10230j;
        if (!TextUtils.isEmpty(strM10230j)) {
            return f8161l;
        }
        f8161l = "关注";
        return "关注";
    }

    /* JADX INFO: renamed from: i */
    public static String m10229i() {
        if (!TextUtils.isEmpty(f8162m)) {
            return f8162m;
        }
        String strM10230j = m10230j("secondLikeName");
        f8162m = strM10230j;
        if (!TextUtils.isEmpty(strM10230j)) {
            return f8162m;
        }
        f8162m = "喜欢的人";
        return "喜欢的人";
    }

    /* JADX INFO: renamed from: j */
    public static String m10230j(String str) {
        try {
            String strF = RemoteConfig.x().F("discover_config");
            if (!TextUtils.isEmpty(strF)) {
                String string = new JSONObject(strF).getJSONObject("datingSecondName").getString(str);
                return TextUtils.isEmpty(string) ? "" : string;
            }
        } catch (Exception unused) {
        }
        return "";
    }

    /* JADX INFO: renamed from: k */
    public static String m10231k() {
        try {
            String strF = RemoteConfig.x().F("discover_config");
            if (!TextUtils.isEmpty(strF)) {
                JSONObject jSONObject = new JSONObject(strF);
                String string = jSONObject.getString("defaultTabMale");
                String string2 = jSONObject.getString("defaultTabFemale");
                if (FeedModule.m1140H().me_().isFemale()) {
                    string = string2;
                }
                if (nkg.m12213K() && TextUtils.equals(string, "like")) {
                    return m10229i();
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
    public static long m10232l() {
        try {
            String strF = RemoteConfig.x().F("feed_auto_refresh_time");
            if (TextUtils.isEmpty(strF)) {
                return 600000L;
            }
            int i = new JSONObject(strF).getInt("autoRefreshTime");
            if (i <= 0) {
                i = 10;
            }
            return i * 60000;
        } catch (Exception unused) {
            return 600000L;
        }
    }

    /* JADX INFO: renamed from: m */
    public static boolean m10233m() {
        try {
            String strF = RemoteConfig.x().F("feed_auto_refresh_time");
            if (TextUtils.isEmpty(strF)) {
                return false;
            }
            return new JSONObject(strF).getBoolean("allSwitch");
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: n */
    public static int m10234n() {
        int i;
        try {
            String strF = RemoteConfig.x().F("moment_operation_guides_config");
            if (TextUtils.isEmpty(strF) || (i = new JSONObject(strF).getInt("man_made_display_times")) <= 0) {
                return 1;
            }
            return i;
        } catch (Exception unused) {
        }
        return 1;
    }

    /* JADX INFO: renamed from: o */
    public static HashSet<String> m10235o() {
        String[] strArrSplit;
        if (NullChecker.a(f8159j)) {
            return f8159j;
        }
        HashSet<String> hashSet = new HashSet<>();
        try {
            String strF = RemoteConfig.x().F("discover_config");
            if (!TextUtils.isEmpty(strF)) {
                String string = new JSONObject(strF).getString("banner");
                if (!TextUtils.isEmpty(string) && (strArrSplit = string.split(",")) != null && strArrSplit.length > 0) {
                    for (String str : strArrSplit) {
                        hashSet.add(str);
                    }
                }
            }
        } catch (Exception unused) {
        }
        f8159j = hashSet;
        return hashSet;
    }

    /* JADX INFO: renamed from: p */
    public static String m10236p() {
        try {
            String strF = RemoteConfig.x().F("discover_config");
            if (!TextUtils.isEmpty(strF)) {
                JSONObject jSONObject = new JSONObject(strF).getJSONObject("datingSecondName");
                String string = jSONObject.getString("datingSecondNameMale");
                String string2 = jSONObject.getString("datingSecondNameFemale");
                if (FeedModule.m1140H().me_().isFemale()) {
                    string = string2;
                }
                return TextUtils.isEmpty(string) ? "全部" : string;
            }
        } catch (Exception unused) {
        }
        return "全部";
    }

    /* JADX INFO: renamed from: q */
    public static String m10237q() {
        try {
            String strF = RemoteConfig.x().F("discover_config");
            if (!TextUtils.isEmpty(strF)) {
                String string = new JSONObject(strF).getJSONObject("tabName").getString("dating");
                return TextUtils.isEmpty(string) ? "交友" : string;
            }
        } catch (Exception unused) {
        }
        return "交友";
    }

    /* JADX INFO: renamed from: r */
    public static String m10238r() {
        try {
            String strF = RemoteConfig.x().F("discover_config");
            if (!TextUtils.isEmpty(strF)) {
                String string = new JSONObject(strF).getJSONObject("tabName").getString("discussion");
                return TextUtils.isEmpty(string) ? "热议" : string;
            }
        } catch (Exception unused) {
        }
        return "热议";
    }

    /* JADX INFO: renamed from: s */
    public static boolean m10239s() {
        return m10240t() || m10241u();
    }

    /* JADX INFO: renamed from: t */
    public static boolean m10240t() {
        return !vwb.J(f8160k) && f8160k.size() == 1;
    }

    /* JADX INFO: renamed from: u */
    public static boolean m10241u() {
        return !vwb.J(f8160k) && f8160k.size() > 1;
    }

    /* JADX INFO: renamed from: v */
    public static boolean m10242v() {
        try {
            String strF = RemoteConfig.x().F("discover_config");
            if (TextUtils.isEmpty(strF)) {
                return true;
            }
            JSONObject jSONObject = new JSONObject(strF);
            String string = jSONObject.getString("defaultTabMale");
            String string2 = jSONObject.getString("defaultTabFemale");
            if (FeedModule.m1140H().me_().isFemale()) {
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
    public static boolean m10243w() {
        try {
            String strF = RemoteConfig.x().F("discover_config");
            if (TextUtils.isEmpty(strF)) {
                return true;
            }
            return new JSONObject(strF).getBoolean("discoverSwitch");
        } catch (Exception unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: x */
    public static boolean m10244x() {
        try {
            String strF = RemoteConfig.x().F("explore_state_moment4_full_config");
            if (TextUtils.isEmpty(strF)) {
                return false;
            }
            return new JSONObject(strF).getBoolean("fullSwitch");
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: y */
    public static boolean m10245y() {
        try {
            String strF = RemoteConfig.x().F("explore_state_moment4_full_config");
            if (TextUtils.isEmpty(strF)) {
                return true;
            }
            return new JSONObject(strF).getBoolean("sayHiSwitch");
        } catch (Exception unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: z */
    public static int m10246z() {
        try {
            String strF = RemoteConfig.x().F("explore_state_moment4_full_config");
            if (TextUtils.isEmpty(strF)) {
                return 1;
            }
            return new JSONObject(strF).getInt("sayHiTimes");
        } catch (Exception unused) {
            return 1;
        }
    }
}
