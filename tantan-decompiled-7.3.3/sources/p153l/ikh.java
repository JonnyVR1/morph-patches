package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class ikh {

    /* JADX INFO: renamed from: a */
    public static String f115365a = "1";

    /* JADX INFO: renamed from: b */
    public static String f115366b = "2";

    /* JADX INFO: renamed from: c */
    public static int f115367c = 2;

    /* JADX INFO: renamed from: a */
    public static String m140293a() {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("poi_lighten_config");
            return !TextUtils.isEmpty(strM80485F) ? new JSONObject(strM80485F).optString("poi_bottom_button_title", "") : "";
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m140294b() {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("poi_lighten_config");
            if (TextUtils.isEmpty(strM80485F)) {
                return 0;
            }
            return new JSONObject(strM80485F).optInt("same_poi_per_day", 0);
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m140295c() {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("poi_lighten_config");
            if (TextUtils.isEmpty(strM80485F)) {
                return 0;
            }
            return new JSONObject(strM80485F).optInt("poi_published_per_day", 0);
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m140296d() {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("moment_unread_notes");
            if (TextUtils.isEmpty(strM80485F)) {
                return true;
            }
            return new JSONObject(strM80485F).optBoolean("MomentUnreadNotesAll", true);
        } catch (Exception unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m140297e() {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("poi_lighten_config");
            return !TextUtils.isEmpty(strM80485F) && new JSONObject(strM80485F).optInt("popstyle", 0) == f115367c;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m140298f() {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("poi_lighten_config");
            if (TextUtils.isEmpty(strM80485F)) {
                return false;
            }
            return new JSONObject(strM80485F).optBoolean("poishowswitch-female", false);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: g */
    public static boolean m140299g() {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("poi_lighten_config");
            if (TextUtils.isEmpty(strM80485F)) {
                return false;
            }
            return new JSONObject(strM80485F).optBoolean("poishowswitch-male", false);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: h */
    public static boolean m140300h() {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("moment_visitor_time");
            if (TextUtils.isEmpty(strM80485F)) {
                return true;
            }
            return new JSONObject(strM80485F).optBoolean("MomentVisitor", true);
        } catch (Exception unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: i */
    public static boolean m140301i() {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("moment_visitor_time");
            if (TextUtils.isEmpty(strM80485F)) {
                return true;
            }
            JSONObject jSONObject = new JSONObject(strM80485F);
            String str = f115366b;
            return str.equals(jSONObject.optString("MomentVisitorFemale", str));
        } catch (Exception unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: j */
    public static boolean m140302j() {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("moment_visitor_time");
            if (TextUtils.isEmpty(strM80485F)) {
                return false;
            }
            return f115366b.equals(new JSONObject(strM80485F).optString("MomentVisitorMale", f115365a));
        } catch (Exception unused) {
            return false;
        }
    }
}
