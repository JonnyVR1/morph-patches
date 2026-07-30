package p149l;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;

/* JADX INFO: loaded from: classes13.dex */
public class stv {

    /* JADX INFO: renamed from: a */
    public static final String f166388a = "tantan" + File.separator + "statistic.localid";

    /* JADX INFO: renamed from: b */
    public static String f166389b;

    /* JADX INFO: renamed from: a */
    public static synchronized String m185972a(Context context) {
        if (!TextUtils.isEmpty(f166389b)) {
            return f166389b;
        }
        String strM185973b = m185973b(context);
        if (!TextUtils.isEmpty(strM185973b)) {
            gwe0.m128400e(strM185973b);
            f166389b = strM185973b;
            return strM185973b;
        }
        String strM128397b = gwe0.m128397b();
        if (!TextUtils.isEmpty(strM128397b)) {
            m185974c(context, strM128397b);
            f166389b = strM128397b;
            return strM128397b;
        }
        String strM180835b = rtv.m180835b();
        if (!TextUtils.isEmpty(strM180835b)) {
            f166389b = strM180835b;
            gwe0.m128400e(strM180835b);
            m185974c(context, strM180835b);
        }
        return strM180835b;
    }

    /* JADX INFO: renamed from: b */
    public static String m185973b(Context context) {
        return !hk60.m131459b(context, new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"}) ? "" : wxf0.m205984b(wxf0.m205983a(f166388a));
    }

    /* JADX INFO: renamed from: c */
    public static void m185974c(Context context, String str) throws Throwable {
        if (hk60.m131459b(context, new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"})) {
            wxf0.m205985c(wxf0.m205983a(f166388a), str);
        }
    }
}
