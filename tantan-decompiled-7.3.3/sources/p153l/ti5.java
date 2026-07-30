package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class ti5 {
    /* JADX INFO: renamed from: a */
    public static String m191315a() {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("vas_commercial_card_right_slide_strategy");
            return !TextUtils.isEmpty(strM80485F) ? new JSONObject(strM80485F).optString("oneBtnMatch", "like") : "like";
        } catch (Exception unused) {
            return "like";
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m191316b() {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("vas_commercial_card_right_slide_strategy");
            return !TextUtils.isEmpty(strM80485F) ? new JSONObject(strM80485F).optString("sayHi", "like") : "like";
        } catch (Exception unused) {
            return "like";
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m191317c() {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("vas_commercial_card_right_slide_strategy");
            return !TextUtils.isEmpty(strM80485F) ? new JSONObject(strM80485F).optString("superLike", "like") : "like";
        } catch (Exception unused) {
            return "like";
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m191318d() {
        return "showPurchaseDialog".equals(m191315a());
    }

    /* JADX INFO: renamed from: e */
    public static boolean m191319e(String str) {
        return "match".equals(str) || "superlike".equals(str) || "chat".equals(str) || "chat_with_undo".equals(str);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m191320f() {
        return "showPurchaseDialog".equals(m191316b());
    }

    /* JADX INFO: renamed from: g */
    public static boolean m191321g() {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("vas_commercial_card_right_slide_strategy");
            if (TextUtils.isEmpty(strM80485F)) {
                return true;
            }
            return new JSONObject(strM80485F).optBoolean("showMemberLabel", true);
        } catch (Exception unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: h */
    public static boolean m191322h() {
        return "showPurchaseDialog".equals(m191317c());
    }
}
