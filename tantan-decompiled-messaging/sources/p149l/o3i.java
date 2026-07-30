package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.GuideStatePostConfig;
import com.p046p1.mobile.putong.feed.data.StateQuestion;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import java.util.List;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class o3i {

    /* JADX INFO: renamed from: a */
    public static zpd0 f141669a = new zpd0("last_show_moment_post_state_post_tips_time_" + FeedModule.m60221F().userId(), 0L);

    /* JADX INFO: renamed from: a */
    public static boolean m162427a() {
        long jLongValue = f141669a.get().longValue();
        return jLongValue <= 0 || mqi0.m155944o() - jLongValue > 86400000;
    }

    /* JADX INFO: renamed from: b */
    public static StateQuestion m162428b() {
        GuideStatePostConfig guideStatePostConfig = FeedModule.f38855d.f193006N0;
        if (guideStatePostConfig == null) {
            return null;
        }
        List<StateQuestion> list = guideStatePostConfig.guidePopStatesQuestions;
        if (vwb.m200296J(list)) {
            return null;
        }
        return list.get(new Random().nextInt(list.size()));
    }

    /* JADX INFO: renamed from: c */
    public static String m162429c() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("state_publish_config");
            if (TextUtils.isEmpty(strM79302F)) {
                return null;
            }
            return new JSONObject(strM79302F).getString("p_moment_post_stateid");
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m162430d() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("state_publish_config");
            if (TextUtils.isEmpty(strM79302F)) {
                return false;
            }
            return new JSONObject(strM79302F).optBoolean("p_moment_post_stateswitch");
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: e */
    public static StateQuestion m162431e() {
        GuideStatePostConfig guideStatePostConfig = FeedModule.f38855d.f193006N0;
        if (guideStatePostConfig == null) {
            return null;
        }
        List<StateQuestion> list = guideStatePostConfig.myTabGuideState;
        if (vwb.m200296J(list)) {
            return null;
        }
        return list.get(new Random().nextInt(list.size()));
    }

    /* JADX INFO: renamed from: f */
    public static String m162432f() {
        GuideStatePostConfig guideStatePostConfig = FeedModule.f38855d.f193006N0;
        return guideStatePostConfig != null ? guideStatePostConfig.momentPostStateGuideContent : "";
    }

    /* JADX INFO: renamed from: g */
    public static boolean m162433g(String str) {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("state_publish_config");
            if (!TextUtils.isEmpty(strM79302F)) {
                String string = new JSONObject(strM79302F).getString("lightpopupwindow_showpage");
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
    public static boolean m162434h() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("state_publish_config");
            if (!TextUtils.isEmpty(strM79302F)) {
                String string = new JSONObject(strM79302F).getString("lightpopupwindow_showgender");
                if (TextUtils.isEmpty(string)) {
                    string = "female";
                }
                return (FeedModule.m60222H().me_().isFemale() && TextUtils.equals("female", string)) || (!FeedModule.m60222H().me_().isFemale() && TextUtils.equals("male", string));
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public static void m162435i() {
        f141669a.put(Long.valueOf(mqi0.m155944o()));
    }
}
