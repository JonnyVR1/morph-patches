package p153l;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public class fyj {
    /* JADX INFO: renamed from: a */
    public static boolean m128101a(String str) {
        return TextUtils.equals(str, "from_meet_liked");
    }

    /* JADX INFO: renamed from: b */
    public static boolean m128102b(String str) {
        return TextUtils.equals(str, "from_meet_picks");
    }

    /* JADX INFO: renamed from: c */
    public static void m128103c(String str, String str2, String str3) {
        if (m128101a(str)) {
            i4g0.m138523u("e_chat_gift_bar_gift", str2, jyb.m147494Y("chat_gift_id", str3), jyb.m147494Y("showfrom_meet_sayhi", "I_like_say_hi"));
        } else if (m128102b(str)) {
            i4g0.m138523u("e_chat_gift_bar_gift", str2, jyb.m147494Y("chat_gift_id", str3), jyb.m147494Y("showfrom_meet_sayhi", "picks_say_hi"));
        } else {
            i4g0.m138523u("e_chat_gift_bar_gift", str2, jyb.m147494Y("chat_gift_id", str3));
        }
    }
}
