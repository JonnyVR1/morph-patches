package p006l;

import android.text.TextUtils;
import com.p1.mobile.android.app.App;
import com.tantanapp.common.utils.CrashHelper;
import l.uqd0;
import l.vfp0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class mr4 {

    /* JADX INFO: renamed from: a */
    public static String f17192a;

    /* JADX INFO: renamed from: b */
    public static String f17193b;

    /* JADX INFO: renamed from: c */
    public static uqd0 f17194c = new uqd0(App.e, "saved_channel", (String) null);

    /* JADX INFO: renamed from: d */
    public static String f17195d = null;

    /* JADX INFO: renamed from: a */
    public static boolean m19498a() {
        String str = f17192a;
        return (str == null || str.equals("unknownerrorparsing") || f17192a.equals("googleplay")) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public static String m19499b() {
        if (f17193b == null) {
            f17193b = vfp0.b(App.e, "unknownerrorparsing");
        }
        return f17193b;
    }

    /* JADX INFO: renamed from: c */
    public static void m19500c() {
        String str;
        f17194c.put("googleplay");
        f17195d = vfp0.b(App.e, "");
        String strB = null;
        try {
            str = (String) f17194c.get();
            try {
                if (TextUtils.isEmpty(str)) {
                    strB = vfp0.b(App.e, "unknownerrorparsing");
                    if (!TextUtils.isEmpty(strB) && !"unknownerrorparsing".equals(strB)) {
                        f17194c.put(strB);
                    }
                    str = strB;
                }
            } catch (Exception e) {
                e = e;
                strB = str;
                CrashHelper.c(e);
            }
        } catch (Exception e2) {
            e = e2;
        }
        f17192a = str;
    }
}
