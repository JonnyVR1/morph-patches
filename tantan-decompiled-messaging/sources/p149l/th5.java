package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class th5 {
    /* JADX INFO: renamed from: a */
    public static String m188858a() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("vas_commercial_card_right_slide_strategy");
            return !TextUtils.isEmpty(strM79302F) ? new JSONObject(strM79302F).optString("oneBtnMatch", "like") : "like";
        } catch (Exception unused) {
            return "like";
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m188859b() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("vas_commercial_card_right_slide_strategy");
            return !TextUtils.isEmpty(strM79302F) ? new JSONObject(strM79302F).optString("sayHi", "like") : "like";
        } catch (Exception unused) {
            return "like";
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m188860c() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("vas_commercial_card_right_slide_strategy");
            return !TextUtils.isEmpty(strM79302F) ? new JSONObject(strM79302F).optString("superLike", "like") : "like";
        } catch (Exception unused) {
            return "like";
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m188861d() {
        return "showPurchaseDialog".equals(m188858a());
    }

    /* JADX INFO: renamed from: e */
    public static boolean m188862e(String str) {
        return "match".equals(str) || "superlike".equals(str) || "chat".equals(str) || "chat_with_undo".equals(str);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m188863f() {
        return "showPurchaseDialog".equals(m188859b());
    }

    /* JADX INFO: renamed from: g */
    public static boolean m188864g() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("vas_commercial_card_right_slide_strategy");
            if (TextUtils.isEmpty(strM79302F)) {
                return true;
            }
            return new JSONObject(strM79302F).optBoolean("showMemberLabel", true);
        } catch (Exception unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: h */
    public static boolean m188865h() {
        return "showPurchaseDialog".equals(m188860c());
    }
}
