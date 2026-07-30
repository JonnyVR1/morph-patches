package p149l;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes11.dex */
public class ys0 {

    /* JADX INFO: renamed from: a */
    public static hpd0 f199734a;

    /* JADX INFO: renamed from: b */
    public static hpd0 f199735b;

    static {
        Boolean bool = Boolean.FALSE;
        f199734a = new hpd0("anonymous_mode_moment_guide_cover_view", bool);
        f199735b = new hpd0("anonymous_mode_moment_visible_mode_guide_tips", bool);
    }

    /* JADX INFO: renamed from: a */
    public static String m215875a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return "https://auto.tancdn.com/v1/images/" + str;
    }
}
