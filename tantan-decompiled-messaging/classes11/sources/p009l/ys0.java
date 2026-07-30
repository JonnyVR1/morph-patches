package p009l;

import android.text.TextUtils;
import l.hpd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ys0 {

    /* JADX INFO: renamed from: a */
    public static hpd0 f23216a;

    /* JADX INFO: renamed from: b */
    public static hpd0 f23217b;

    static {
        Boolean bool = Boolean.FALSE;
        f23216a = new hpd0("anonymous_mode_moment_guide_cover_view", bool);
        f23217b = new hpd0("anonymous_mode_moment_visible_mode_guide_tips", bool);
    }

    /* JADX INFO: renamed from: a */
    public static String m25508a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return "https://auto.tancdn.com/v1/images/" + str;
    }
}
