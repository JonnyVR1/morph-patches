package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.android.app.App;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes9.dex */
public class ls4 {

    /* JADX INFO: renamed from: a */
    public static String f133389a;

    /* JADX INFO: renamed from: b */
    public static String f133390b;

    /* JADX INFO: renamed from: c */
    public static wyd0 f133391c = new wyd0(App.f16088e, "saved_channel", (String) null);

    /* JADX INFO: renamed from: d */
    public static String f133392d = null;

    /* JADX INFO: renamed from: a */
    public static boolean m155670a() {
        String str = f133389a;
        return (str == null || str.equals("unknownerrorparsing") || f133389a.equals("googleplay")) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public static String m155671b() {
        if (f133390b == null) {
            f133390b = zop0.m220780b(App.f16088e, "unknownerrorparsing");
        }
        return f133390b;
    }

    /* JADX INFO: renamed from: c */
    public static void m155672c() {
        String str;
        f133391c.put("googleplay");
        f133392d = zop0.m220780b(App.f16088e, "");
        String strM220780b = null;
        try {
            str = f133391c.get();
            try {
                if (TextUtils.isEmpty(str)) {
                    strM220780b = zop0.m220780b(App.f16088e, "unknownerrorparsing");
                    if (!TextUtils.isEmpty(strM220780b) && !"unknownerrorparsing".equals(strM220780b)) {
                        f133391c.put(strM220780b);
                    }
                    str = strM220780b;
                }
            } catch (Exception e) {
                e = e;
                strM220780b = str;
                CrashHelper.m82479c(e);
            }
        } catch (Exception e2) {
            e = e2;
        }
        f133389a = str;
    }
}
