package p007l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.data.OMSDialogPositon;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.GuideStatePostConfig;
import com.p000p1.mobile.putong.feed.data.StateQuestion;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import java.util.List;
import java.util.Random;
import l.mqi0;
import l.vwb;
import l.zpd0;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class o3i {

    /* JADX INFO: renamed from: a */
    public static zpd0 f10991a = new zpd0("last_show_moment_post_state_post_tips_time_" + FeedModule.m1139F().userId(), 0L);

    /* JADX INFO: renamed from: a */
    public static boolean m12431a() {
        long jLongValue = ((Long) f10991a.get()).longValue();
        return jLongValue <= 0 || mqi0.o() - jLongValue > 86400000;
    }

    /* JADX INFO: renamed from: b */
    public static StateQuestion m12432b() {
        GuideStatePostConfig guideStatePostConfig = FeedModule.f316d.f14941N0;
        if (guideStatePostConfig == null) {
            return null;
        }
        List<StateQuestion> list = guideStatePostConfig.guidePopStatesQuestions;
        if (vwb.J(list)) {
            return null;
        }
        return list.get(new Random().nextInt(list.size()));
    }

    /* JADX INFO: renamed from: c */
    public static String m12433c() {
        try {
            String strF = RemoteConfig.x().F("state_publish_config");
            if (TextUtils.isEmpty(strF)) {
                return null;
            }
            return new JSONObject(strF).getString("p_moment_post_stateid");
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m12434d() {
        try {
            String strF = RemoteConfig.x().F("state_publish_config");
            if (TextUtils.isEmpty(strF)) {
                return false;
            }
            return new JSONObject(strF).optBoolean("p_moment_post_stateswitch");
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: e */
    public static StateQuestion m12435e() {
        GuideStatePostConfig guideStatePostConfig = FeedModule.f316d.f14941N0;
        if (guideStatePostConfig == null) {
            return null;
        }
        List<StateQuestion> list = guideStatePostConfig.myTabGuideState;
        if (vwb.J(list)) {
            return null;
        }
        return list.get(new Random().nextInt(list.size()));
    }

    /* JADX INFO: renamed from: f */
    public static String m12436f() {
        GuideStatePostConfig guideStatePostConfig = FeedModule.f316d.f14941N0;
        return guideStatePostConfig != null ? guideStatePostConfig.momentPostStateGuideContent : "";
    }

    /* JADX INFO: renamed from: g */
    public static boolean m12437g(String str) {
        try {
            String strF = RemoteConfig.x().F("state_publish_config");
            if (!TextUtils.isEmpty(strF)) {
                String string = new JSONObject(strF).getString("lightpopupwindow_showpage");
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
    public static boolean m12438h() {
        try {
            String strF = RemoteConfig.x().F("state_publish_config");
            if (!TextUtils.isEmpty(strF)) {
                String string = new JSONObject(strF).getString("lightpopupwindow_showgender");
                if (TextUtils.isEmpty(string)) {
                    string = "female";
                }
                return (FeedModule.m1140H().me_().isFemale() && TextUtils.equals("female", string)) || (!FeedModule.m1140H().me_().isFemale() && TextUtils.equals("male", string));
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public static void m12439i() {
        f10991a.put(Long.valueOf(mqi0.o()));
    }
}
