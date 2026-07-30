package p003l;

import android.text.TextUtils;
import l.j760;
import l.vwb;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class pvj {
    /* JADX INFO: renamed from: a */
    public static boolean m8813a(String str) {
        return TextUtils.equals(str, "from_meet_liked");
    }

    /* JADX INFO: renamed from: b */
    public static boolean m8814b(String str) {
        return TextUtils.equals(str, "from_meet_picks");
    }

    /* JADX INFO: renamed from: c */
    public static void m8815c(String str, String str2, String str3) {
        if (m8813a(str)) {
            zvf0.u("e_chat_gift_bar_gift", str2, new j760[]{vwb.Y("chat_gift_id", str3), vwb.Y("showfrom_meet_sayhi", "I_like_say_hi")});
        } else if (m8814b(str)) {
            zvf0.u("e_chat_gift_bar_gift", str2, new j760[]{vwb.Y("chat_gift_id", str3), vwb.Y("showfrom_meet_sayhi", "picks_say_hi")});
        } else {
            zvf0.u("e_chat_gift_bar_gift", str2, new j760[]{vwb.Y("chat_gift_id", str3)});
        }
    }
}
