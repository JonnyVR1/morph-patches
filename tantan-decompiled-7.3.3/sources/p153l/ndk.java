package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.p058ui.greet.GreetAct;

/* JADX INFO: loaded from: classes12.dex */
public class ndk {
    /* JADX INFO: renamed from: a */
    public static String m162714a(String str) {
        if (TextUtils.equals("home_card", str)) {
            return "p_suggest_users_home_view,user_profile_info_view";
        }
        if (TextUtils.equals("from_picks", str)) {
            return "p_picks_view,user_profile_info_view";
        }
        if (TextUtils.equals("liked_users", str)) {
            return "p_who_i_liked,user_profile_info_view";
        }
        if (TextUtils.equals("personal_photo_album", str) || TextUtils.equals("live_user_card", str)) {
            return "album_chatroom_live,user_profile_info_view";
        }
        return (TextUtils.equals("from_meet_feed", str) || TextUtils.equals("from_meet_picks_feed", str) || TextUtils.equals("from_meet_picks_card", str)) ? "p_meet,user_profile_info_view" : "";
    }

    /* JADX INFO: renamed from: b */
    public static boolean m162715b(Act act, String str) {
        if (act instanceof GreetAct) {
            return ((GreetAct) act).m46770i2();
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static void m162716c(Act act, String str, String str2, String str3, String str4) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        i4g0.m138523u("e_chat_gift_bar_gift_send", str2, pf60.m172085a("showfrom_sayhi", m162715b(act, str3) ? "p_meet" : m162714a(str3)), pf60.m172085a("chat_gift_id", str), pf60.m172085a("other_user_id", str4));
    }
}
