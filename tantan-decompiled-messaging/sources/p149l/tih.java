package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class tih {

    /* JADX INFO: renamed from: a */
    public static String f170580a = "1";

    /* JADX INFO: renamed from: b */
    public static String f170581b = "2";

    /* JADX INFO: renamed from: c */
    public static int f170582c = 2;

    /* JADX INFO: renamed from: a */
    public static String m189185a() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("poi_lighten_config");
            return !TextUtils.isEmpty(strM79302F) ? new JSONObject(strM79302F).optString("poi_bottom_button_title", "") : "";
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m189186b() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("poi_lighten_config");
            if (TextUtils.isEmpty(strM79302F)) {
                return 0;
            }
            return new JSONObject(strM79302F).optInt("same_poi_per_day", 0);
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m189187c() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("poi_lighten_config");
            if (TextUtils.isEmpty(strM79302F)) {
                return 0;
            }
            return new JSONObject(strM79302F).optInt("poi_published_per_day", 0);
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m189188d() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("moment_unread_notes");
            if (TextUtils.isEmpty(strM79302F)) {
                return true;
            }
            return new JSONObject(strM79302F).optBoolean("MomentUnreadNotesAll", true);
        } catch (Exception unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m189189e() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("poi_lighten_config");
            return !TextUtils.isEmpty(strM79302F) && new JSONObject(strM79302F).optInt("popstyle", 0) == f170582c;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m189190f() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("poi_lighten_config");
            if (TextUtils.isEmpty(strM79302F)) {
                return false;
            }
            return new JSONObject(strM79302F).optBoolean("poishowswitch-female", false);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: g */
    public static boolean m189191g() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("poi_lighten_config");
            if (TextUtils.isEmpty(strM79302F)) {
                return false;
            }
            return new JSONObject(strM79302F).optBoolean("poishowswitch-male", false);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: h */
    public static boolean m189192h() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("moment_visitor_time");
            if (TextUtils.isEmpty(strM79302F)) {
                return true;
            }
            return new JSONObject(strM79302F).optBoolean("MomentVisitor", true);
        } catch (Exception unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: i */
    public static boolean m189193i() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("moment_visitor_time");
            if (TextUtils.isEmpty(strM79302F)) {
                return true;
            }
            JSONObject jSONObject = new JSONObject(strM79302F);
            String str = f170581b;
            return str.equals(jSONObject.optString("MomentVisitorFemale", str));
        } catch (Exception unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: j */
    public static boolean m189194j() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("moment_visitor_time");
            if (TextUtils.isEmpty(strM79302F)) {
                return false;
            }
            return f170581b.equals(new JSONObject(strM79302F).optString("MomentVisitorMale", f170580a));
        } catch (Exception unused) {
            return false;
        }
    }
}
