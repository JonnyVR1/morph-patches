package p009l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.remote_config.RemoteConfig;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class th5 {
    /* JADX INFO: renamed from: a */
    public static String m22527a() {
        try {
            String strM9623F = RemoteConfig.m9619x().m9623F("vas_commercial_card_right_slide_strategy");
            return !TextUtils.isEmpty(strM9623F) ? new JSONObject(strM9623F).optString("oneBtnMatch", "like") : "like";
        } catch (Exception unused) {
            return "like";
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m22528b() {
        try {
            String strM9623F = RemoteConfig.m9619x().m9623F("vas_commercial_card_right_slide_strategy");
            return !TextUtils.isEmpty(strM9623F) ? new JSONObject(strM9623F).optString("sayHi", "like") : "like";
        } catch (Exception unused) {
            return "like";
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m22529c() {
        try {
            String strM9623F = RemoteConfig.m9619x().m9623F("vas_commercial_card_right_slide_strategy");
            return !TextUtils.isEmpty(strM9623F) ? new JSONObject(strM9623F).optString("superLike", "like") : "like";
        } catch (Exception unused) {
            return "like";
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m22530d() {
        return "showPurchaseDialog".equals(m22527a());
    }

    /* JADX INFO: renamed from: e */
    public static boolean m22531e(String str) {
        return "match".equals(str) || "superlike".equals(str) || "chat".equals(str) || "chat_with_undo".equals(str);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m22532f() {
        return "showPurchaseDialog".equals(m22528b());
    }

    /* JADX INFO: renamed from: g */
    public static boolean m22533g() {
        try {
            String strM9623F = RemoteConfig.m9619x().m9623F("vas_commercial_card_right_slide_strategy");
            if (TextUtils.isEmpty(strM9623F)) {
                return true;
            }
            return new JSONObject(strM9623F).optBoolean("showMemberLabel", true);
        } catch (Exception unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: h */
    public static boolean m22534h() {
        return "showPurchaseDialog".equals(m22529c());
    }
}
