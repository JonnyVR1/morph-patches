package p153l;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;

/* JADX INFO: loaded from: classes11.dex */
public class tvv {

    /* JADX INFO: renamed from: a */
    public static final String f176303a = "tantan" + File.separator + "statistic.localid";

    /* JADX INFO: renamed from: b */
    public static String f176304b;

    /* JADX INFO: renamed from: a */
    public static synchronized String m192837a(Context context) {
        if (!TextUtils.isEmpty(f176304b)) {
            return f176304b;
        }
        String strM192838b = m192838b(context);
        if (!TextUtils.isEmpty(strM192838b)) {
            n4f0.m161562e(strM192838b);
            f176304b = strM192838b;
            return strM192838b;
        }
        String strM161559b = n4f0.m161559b();
        if (!TextUtils.isEmpty(strM161559b)) {
            m192839c(context, strM161559b);
            f176304b = strM161559b;
            return strM161559b;
        }
        String strM188228b = svv.m188228b();
        if (!TextUtils.isEmpty(strM188228b)) {
            f176304b = strM188228b;
            n4f0.m161562e(strM188228b);
            m192839c(context, strM188228b);
        }
        return strM188228b;
    }

    /* JADX INFO: renamed from: b */
    public static String m192838b(Context context) {
        return !ns60.m164559b(context, new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"}) ? "" : e6g0.m119580b(e6g0.m119579a(f176303a));
    }

    /* JADX INFO: renamed from: c */
    public static void m192839c(Context context, String str) throws Throwable {
        if (ns60.m164559b(context, new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"})) {
            e6g0.m119581c(e6g0.m119579a(f176303a), str);
        }
    }
}
