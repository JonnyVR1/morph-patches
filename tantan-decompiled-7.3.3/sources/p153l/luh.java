package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import java.util.Random;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class luh {
    /* JADX INFO: renamed from: a */
    public static void m155929a(String str, String str2, String str3) {
        sfj0.m185598e("e_moment_post_guide", str3, pf60.m172085a("topic_id", str), pf60.m172085a("guide_text", str2));
    }

    /* JADX INFO: renamed from: b */
    public static String m155930b() {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("post_guide_new");
            if (!TextUtils.isEmpty(strM80485F)) {
                String string = new JSONObject(strM80485F).getJSONObject("dataPreview").getString("subtitle");
                return TextUtils.isEmpty(string) ? "你的动态空空如也" : string;
            }
        } catch (Exception unused) {
        }
        return "你的动态空空如也";
    }

    /* JADX INFO: renamed from: c */
    public static String m155931c() {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("post_guide_new");
            if (!TextUtils.isEmpty(strM80485F)) {
                String string = new JSONObject(strM80485F).getJSONObject("dataPreview").getString("title");
                return TextUtils.isEmpty(string) ? "发布动态认识更多新朋友" : string;
            }
        } catch (Exception unused) {
        }
        return "发布动态认识更多新朋友";
    }

    /* JADX INFO: renamed from: d */
    public static String m155932d() {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("post_guide_new");
            return !TextUtils.isEmpty(strM80485F) ? new JSONObject(strM80485F).getJSONObject("dataPreview").getString("topicId") : "";
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: e */
    public static String m155933e() {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("post_guide_new");
            return !TextUtils.isEmpty(strM80485F) ? new JSONObject(strM80485F).getJSONObject("dataPreview").getString("topicName") : "";
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: f */
    public static String m155934f() {
        int iNextInt = new Random().nextInt(19) + 3;
        StringBuilder sb = new StringBuilder();
        sb.append(iNextInt);
        sb.append("位");
        sb.append(CoreModule.m30930K().me_().isFemale() ? "男" : "女");
        sb.append("生看过你后离开了");
        return sb.toString();
    }

    /* JADX INFO: renamed from: g */
    public static String m155935g() {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("post_guide_new");
            if (!TextUtils.isEmpty(strM80485F)) {
                String string = new JSONObject(strM80485F).getJSONObject("profile").getString("buttonText");
                return TextUtils.isEmpty(string) ? "去发布" : string;
            }
        } catch (Exception unused) {
        }
        return "去发布";
    }

    /* JADX INFO: renamed from: h */
    public static String m155936h() {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("post_guide_new");
            return !TextUtils.isEmpty(strM80485F) ? new JSONObject(strM80485F).getJSONObject("profile").getString("picture") : "";
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: i */
    public static String m155937i() {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("post_guide_new");
            if (!TextUtils.isEmpty(strM80485F)) {
                String string = new JSONObject(strM80485F).getJSONObject("profile").getString("subtitle");
                return TextUtils.isEmpty(string) ? "发布动态，认识更多新朋友" : string;
            }
        } catch (Exception unused) {
        }
        return "发布动态，认识更多新朋友";
    }

    /* JADX INFO: renamed from: j */
    public static String m155938j() {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("post_guide_new");
            return !TextUtils.isEmpty(strM80485F) ? new JSONObject(strM80485F).getJSONObject("profile").getString("title") : "";
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: k */
    public static String m155939k() {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("post_guide_new");
            return !TextUtils.isEmpty(strM80485F) ? new JSONObject(strM80485F).getJSONObject("profile").getString("topicId") : "";
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: l */
    public static String m155940l() {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("post_guide_new");
            return !TextUtils.isEmpty(strM80485F) ? new JSONObject(strM80485F).getJSONObject("profile").getString("topicName") : "";
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m155941m(String str, String str2, String str3) {
        sfj0.m185605l("e_moment_post_guide", str3, pf60.m172085a("topic_id", str), pf60.m172085a("guide_text", str2));
    }
}
