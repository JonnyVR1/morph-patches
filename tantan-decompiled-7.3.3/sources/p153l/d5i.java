package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.GuideStatePostConfig;
import com.p051p1.mobile.putong.feed.data.StateQuestion;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import java.util.List;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class d5i {

    /* JADX INFO: renamed from: a */
    public static byd0 f85156a = new byd0("last_show_moment_post_state_post_tips_time_" + FeedModule.m61405F().userId(), 0L);

    /* JADX INFO: renamed from: a */
    public static boolean m114298a() {
        long jLongValue = f85156a.get().longValue();
        return jLongValue <= 0 || pzi0.m174454o() - jLongValue > 86400000;
    }

    /* JADX INFO: renamed from: b */
    public static StateQuestion m114299b() {
        GuideStatePostConfig guideStatePostConfig = FeedModule.f39703d.f121316N0;
        if (guideStatePostConfig == null) {
            return null;
        }
        List<StateQuestion> list = guideStatePostConfig.guidePopStatesQuestions;
        if (jyb.m147479J(list)) {
            return null;
        }
        return list.get(new Random().nextInt(list.size()));
    }

    /* JADX INFO: renamed from: c */
    public static String m114300c() {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("state_publish_config");
            if (TextUtils.isEmpty(strM80485F)) {
                return null;
            }
            return new JSONObject(strM80485F).getString("p_moment_post_stateid");
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m114301d() {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("state_publish_config");
            if (TextUtils.isEmpty(strM80485F)) {
                return false;
            }
            return new JSONObject(strM80485F).optBoolean("p_moment_post_stateswitch");
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: e */
    public static StateQuestion m114302e() {
        GuideStatePostConfig guideStatePostConfig = FeedModule.f39703d.f121316N0;
        if (guideStatePostConfig == null) {
            return null;
        }
        List<StateQuestion> list = guideStatePostConfig.myTabGuideState;
        if (jyb.m147479J(list)) {
            return null;
        }
        return list.get(new Random().nextInt(list.size()));
    }

    /* JADX INFO: renamed from: f */
    public static String m114303f() {
        GuideStatePostConfig guideStatePostConfig = FeedModule.f39703d.f121316N0;
        return guideStatePostConfig != null ? guideStatePostConfig.momentPostStateGuideContent : "";
    }

    /* JADX INFO: renamed from: g */
    public static boolean m114304g(String str) {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("state_publish_config");
            if (!TextUtils.isEmpty(strM80485F)) {
                String string = new JSONObject(strM80485F).getString("lightpopupwindow_showpage");
                if (!TextUtils.isEmpty(string)) {
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        if (TextUtils.equals((String) jSONArray.get(i), str)) {
                            return true;
                        }
                    }
                } else if (TextUtils.equals(str, "p_suggest_users_home_view") || TextUtils.equals(str, OMSDialogPositon.p_messages_view)) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m114305h() {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("state_publish_config");
            if (!TextUtils.isEmpty(strM80485F)) {
                String string = new JSONObject(strM80485F).getString("lightpopupwindow_showgender");
                if (TextUtils.isEmpty(string)) {
                    string = "female";
                }
                return (FeedModule.m61406H().me_().isFemale() && TextUtils.equals("female", string)) || (!FeedModule.m61406H().me_().isFemale() && TextUtils.equals("male", string));
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public static void m114306i() {
        f85156a.put(Long.valueOf(pzi0.m174454o()));
    }
}
