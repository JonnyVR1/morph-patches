package p009l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.remote_config.RemoteConfig;
import com.p1.mobile.putong.core.CoreModule;
import java.util.Random;
import l.j760;
import l.o6j0;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class wsh {
    /* JADX INFO: renamed from: a */
    public static void m24529a(String str, String str2, String str3) {
        o6j0.e("e_moment_post_guide", str3, new j760[]{j760.a("topic_id", str), j760.a("guide_text", str2)});
    }

    /* JADX INFO: renamed from: b */
    public static String m24530b() {
        try {
            String strM9623F = RemoteConfig.m9619x().m9623F("post_guide_new");
            if (!TextUtils.isEmpty(strM9623F)) {
                String string = new JSONObject(strM9623F).getJSONObject("dataPreview").getString("subtitle");
                return TextUtils.isEmpty(string) ? "你的动态空空如也" : string;
            }
        } catch (Exception unused) {
        }
        return "你的动态空空如也";
    }

    /* JADX INFO: renamed from: c */
    public static String m24531c() {
        try {
            String strM9623F = RemoteConfig.m9619x().m9623F("post_guide_new");
            if (!TextUtils.isEmpty(strM9623F)) {
                String string = new JSONObject(strM9623F).getJSONObject("dataPreview").getString("title");
                return TextUtils.isEmpty(string) ? "发布动态认识更多新朋友" : string;
            }
        } catch (Exception unused) {
        }
        return "发布动态认识更多新朋友";
    }

    /* JADX INFO: renamed from: d */
    public static String m24532d() {
        try {
            String strM9623F = RemoteConfig.m9619x().m9623F("post_guide_new");
            return !TextUtils.isEmpty(strM9623F) ? new JSONObject(strM9623F).getJSONObject("dataPreview").getString("topicId") : "";
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: e */
    public static String m24533e() {
        try {
            String strM9623F = RemoteConfig.m9619x().m9623F("post_guide_new");
            return !TextUtils.isEmpty(strM9623F) ? new JSONObject(strM9623F).getJSONObject("dataPreview").getString("topicName") : "";
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: f */
    public static String m24534f() {
        int iNextInt = new Random().nextInt(19) + 3;
        StringBuilder sb = new StringBuilder();
        sb.append(iNextInt);
        sb.append("位");
        sb.append(CoreModule.K().me_().isFemale() ? "男" : "女");
        sb.append("生看过你后离开了");
        return sb.toString();
    }

    /* JADX INFO: renamed from: g */
    public static String m24535g() {
        try {
            String strM9623F = RemoteConfig.m9619x().m9623F("post_guide_new");
            if (!TextUtils.isEmpty(strM9623F)) {
                String string = new JSONObject(strM9623F).getJSONObject("profile").getString("buttonText");
                return TextUtils.isEmpty(string) ? "去发布" : string;
            }
        } catch (Exception unused) {
        }
        return "去发布";
    }

    /* JADX INFO: renamed from: h */
    public static String m24536h() {
        try {
            String strM9623F = RemoteConfig.m9619x().m9623F("post_guide_new");
            return !TextUtils.isEmpty(strM9623F) ? new JSONObject(strM9623F).getJSONObject("profile").getString("picture") : "";
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: i */
    public static String m24537i() {
        try {
            String strM9623F = RemoteConfig.m9619x().m9623F("post_guide_new");
            if (!TextUtils.isEmpty(strM9623F)) {
                String string = new JSONObject(strM9623F).getJSONObject("profile").getString("subtitle");
                return TextUtils.isEmpty(string) ? "发布动态，认识更多新朋友" : string;
            }
        } catch (Exception unused) {
        }
        return "发布动态，认识更多新朋友";
    }

    /* JADX INFO: renamed from: j */
    public static String m24538j() {
        try {
            String strM9623F = RemoteConfig.m9619x().m9623F("post_guide_new");
            return !TextUtils.isEmpty(strM9623F) ? new JSONObject(strM9623F).getJSONObject("profile").getString("title") : "";
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: k */
    public static String m24539k() {
        try {
            String strM9623F = RemoteConfig.m9619x().m9623F("post_guide_new");
            return !TextUtils.isEmpty(strM9623F) ? new JSONObject(strM9623F).getJSONObject("profile").getString("topicId") : "";
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: l */
    public static String m24540l() {
        try {
            String strM9623F = RemoteConfig.m9619x().m9623F("post_guide_new");
            return !TextUtils.isEmpty(strM9623F) ? new JSONObject(strM9623F).getJSONObject("profile").getString("topicName") : "";
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m24541m(String str, String str2, String str3) {
        o6j0.l("e_moment_post_guide", str3, new j760[]{j760.a("topic_id", str), j760.a("guide_text", str2)});
    }
}
