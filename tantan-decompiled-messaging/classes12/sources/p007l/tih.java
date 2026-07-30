package p007l;

import android.text.TextUtils;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class tih {

    /* JADX INFO: renamed from: a */
    public static String f13316a = "1";

    /* JADX INFO: renamed from: b */
    public static String f13317b = "2";

    /* JADX INFO: renamed from: c */
    public static int f13318c = 2;

    /* JADX INFO: renamed from: a */
    public static String m14552a() {
        try {
            String strF = RemoteConfig.x().F("poi_lighten_config");
            return !TextUtils.isEmpty(strF) ? new JSONObject(strF).optString("poi_bottom_button_title", "") : "";
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m14553b() {
        try {
            String strF = RemoteConfig.x().F("poi_lighten_config");
            if (TextUtils.isEmpty(strF)) {
                return 0;
            }
            return new JSONObject(strF).optInt("same_poi_per_day", 0);
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m14554c() {
        try {
            String strF = RemoteConfig.x().F("poi_lighten_config");
            if (TextUtils.isEmpty(strF)) {
                return 0;
            }
            return new JSONObject(strF).optInt("poi_published_per_day", 0);
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m14555d() {
        try {
            String strF = RemoteConfig.x().F("moment_unread_notes");
            if (TextUtils.isEmpty(strF)) {
                return true;
            }
            return new JSONObject(strF).optBoolean("MomentUnreadNotesAll", true);
        } catch (Exception unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m14556e() {
        try {
            String strF = RemoteConfig.x().F("poi_lighten_config");
            return !TextUtils.isEmpty(strF) && new JSONObject(strF).optInt("popstyle", 0) == f13318c;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m14557f() {
        try {
            String strF = RemoteConfig.x().F("poi_lighten_config");
            if (TextUtils.isEmpty(strF)) {
                return false;
            }
            return new JSONObject(strF).optBoolean("poishowswitch-female", false);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: g */
    public static boolean m14558g() {
        try {
            String strF = RemoteConfig.x().F("poi_lighten_config");
            if (TextUtils.isEmpty(strF)) {
                return false;
            }
            return new JSONObject(strF).optBoolean("poishowswitch-male", false);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: h */
    public static boolean m14559h() {
        try {
            String strF = RemoteConfig.x().F("moment_visitor_time");
            if (TextUtils.isEmpty(strF)) {
                return true;
            }
            return new JSONObject(strF).optBoolean("MomentVisitor", true);
        } catch (Exception unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: i */
    public static boolean m14560i() {
        try {
            String strF = RemoteConfig.x().F("moment_visitor_time");
            if (TextUtils.isEmpty(strF)) {
                return true;
            }
            JSONObject jSONObject = new JSONObject(strF);
            String str = f13317b;
            return str.equals(jSONObject.optString("MomentVisitorFemale", str));
        } catch (Exception unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: j */
    public static boolean m14561j() {
        try {
            String strF = RemoteConfig.x().F("moment_visitor_time");
            if (TextUtils.isEmpty(strF)) {
                return false;
            }
            return f13317b.equals(new JSONObject(strF).optString("MomentVisitorMale", f13316a));
        } catch (Exception unused) {
            return false;
        }
    }
}
