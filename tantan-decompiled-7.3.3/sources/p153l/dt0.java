package p153l;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes10.dex */
public class dt0 {

    /* JADX INFO: renamed from: a */
    public static jxd0 f90531a;

    /* JADX INFO: renamed from: b */
    public static jxd0 f90532b;

    static {
        Boolean bool = Boolean.FALSE;
        f90531a = new jxd0("anonymous_mode_moment_guide_cover_view", bool);
        f90532b = new jxd0("anonymous_mode_moment_visible_mode_guide_tips", bool);
    }

    /* JADX INFO: renamed from: a */
    public static String m117786a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return "https://auto.tancdn.com/v1/images/" + str;
    }
}
