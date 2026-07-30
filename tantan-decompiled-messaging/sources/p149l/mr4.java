package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.android.app.App;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes9.dex */
public class mr4 {

    /* JADX INFO: renamed from: a */
    public static String f135329a;

    /* JADX INFO: renamed from: b */
    public static String f135330b;

    /* JADX INFO: renamed from: c */
    public static uqd0 f135331c = new uqd0(App.f15369e, "saved_channel", (String) null);

    /* JADX INFO: renamed from: d */
    public static String f135332d = null;

    /* JADX INFO: renamed from: a */
    public static boolean m156014a() {
        String str = f135329a;
        return (str == null || str.equals("unknownerrorparsing") || f135329a.equals("googleplay")) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public static String m156015b() {
        if (f135330b == null) {
            f135330b = vfp0.m198285b(App.f15369e, "unknownerrorparsing");
        }
        return f135330b;
    }

    /* JADX INFO: renamed from: c */
    public static void m156016c() {
        String str;
        f135331c.put("googleplay");
        f135332d = vfp0.m198285b(App.f15369e, "");
        String strM198285b = null;
        try {
            str = f135331c.get();
            try {
                if (TextUtils.isEmpty(str)) {
                    strM198285b = vfp0.m198285b(App.f15369e, "unknownerrorparsing");
                    if (!TextUtils.isEmpty(strM198285b) && !"unknownerrorparsing".equals(strM198285b)) {
                        f135331c.put(strM198285b);
                    }
                    str = strM198285b;
                }
            } catch (Exception e) {
                e = e;
                strM198285b = str;
                CrashHelper.m81296c(e);
            }
        } catch (Exception e2) {
            e = e2;
        }
        f135329a = str;
    }
}
