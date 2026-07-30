package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import java.util.Random;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class wsh {
    /* JADX INFO: renamed from: a */
    public static void m205496a(String str, String str2, String str3) {
        o6j0.m162861e("e_moment_post_guide", str3, j760.m140076a("topic_id", str), j760.m140076a("guide_text", str2));
    }

    /* JADX INFO: renamed from: b */
    public static String m205497b() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("post_guide_new");
            if (!TextUtils.isEmpty(strM79302F)) {
                String string = new JSONObject(strM79302F).getJSONObject("dataPreview").getString("subtitle");
                return TextUtils.isEmpty(string) ? "你的动态空空如也" : string;
            }
        } catch (Exception unused) {
        }
        return "你的动态空空如也";
    }

    /* JADX INFO: renamed from: c */
    public static String m205498c() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("post_guide_new");
            if (!TextUtils.isEmpty(strM79302F)) {
                String string = new JSONObject(strM79302F).getJSONObject("dataPreview").getString("title");
                return TextUtils.isEmpty(string) ? "发布动态认识更多新朋友" : string;
            }
        } catch (Exception unused) {
        }
        return "发布动态认识更多新朋友";
    }

    /* JADX INFO: renamed from: d */
    public static String m205499d() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("post_guide_new");
            return !TextUtils.isEmpty(strM79302F) ? new JSONObject(strM79302F).getJSONObject("dataPreview").getString("topicId") : "";
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: e */
    public static String m205500e() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("post_guide_new");
            return !TextUtils.isEmpty(strM79302F) ? new JSONObject(strM79302F).getJSONObject("dataPreview").getString("topicName") : "";
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: f */
    public static String m205501f() {
        int iNextInt = new Random().nextInt(19) + 3;
        StringBuilder sb = new StringBuilder();
        sb.append(iNextInt);
        sb.append("位");
        sb.append(CoreModule.m29932K().me_().isFemale() ? "男" : "女");
        sb.append("生看过你后离开了");
        return sb.toString();
    }

    /* JADX INFO: renamed from: g */
    public static String m205502g() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("post_guide_new");
            if (!TextUtils.isEmpty(strM79302F)) {
                String string = new JSONObject(strM79302F).getJSONObject("profile").getString("buttonText");
                return TextUtils.isEmpty(string) ? "去发布" : string;
            }
        } catch (Exception unused) {
        }
        return "去发布";
    }

    /* JADX INFO: renamed from: h */
    public static String m205503h() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("post_guide_new");
            return !TextUtils.isEmpty(strM79302F) ? new JSONObject(strM79302F).getJSONObject("profile").getString("picture") : "";
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: i */
    public static String m205504i() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("post_guide_new");
            if (!TextUtils.isEmpty(strM79302F)) {
                String string = new JSONObject(strM79302F).getJSONObject("profile").getString("subtitle");
                return TextUtils.isEmpty(string) ? "发布动态，认识更多新朋友" : string;
            }
        } catch (Exception unused) {
        }
        return "发布动态，认识更多新朋友";
    }

    /* JADX INFO: renamed from: j */
    public static String m205505j() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("post_guide_new");
            return !TextUtils.isEmpty(strM79302F) ? new JSONObject(strM79302F).getJSONObject("profile").getString("title") : "";
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: k */
    public static String m205506k() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("post_guide_new");
            return !TextUtils.isEmpty(strM79302F) ? new JSONObject(strM79302F).getJSONObject("profile").getString("topicId") : "";
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: l */
    public static String m205507l() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("post_guide_new");
            return !TextUtils.isEmpty(strM79302F) ? new JSONObject(strM79302F).getJSONObject("profile").getString("topicName") : "";
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m205508m(String str, String str2, String str3) {
        o6j0.m162868l("e_moment_post_guide", str3, j760.m140076a("topic_id", str), j760.m140076a("guide_text", str2));
    }
}
