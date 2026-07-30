package p149l;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes10.dex */
public class pvj {
    /* JADX INFO: renamed from: a */
    public static boolean m171656a(String str) {
        return TextUtils.equals(str, "from_meet_liked");
    }

    /* JADX INFO: renamed from: b */
    public static boolean m171657b(String str) {
        return TextUtils.equals(str, "from_meet_picks");
    }

    /* JADX INFO: renamed from: c */
    public static void m171658c(String str, String str2, String str3) {
        if (m171656a(str)) {
            zvf0.m220399u("e_chat_gift_bar_gift", str2, vwb.m200311Y("chat_gift_id", str3), vwb.m200311Y("showfrom_meet_sayhi", "I_like_say_hi"));
        } else if (m171657b(str)) {
            zvf0.m220399u("e_chat_gift_bar_gift", str2, vwb.m200311Y("chat_gift_id", str3), vwb.m200311Y("showfrom_meet_sayhi", "picks_say_hi"));
        } else {
            zvf0.m220399u("e_chat_gift_bar_gift", str2, vwb.m200311Y("chat_gift_id", str3));
        }
    }
}
