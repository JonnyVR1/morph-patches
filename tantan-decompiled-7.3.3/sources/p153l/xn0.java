package p153l;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.tantanapp.common.utils.CrashHelper;
import java.util.UUID;

/* JADX INFO: loaded from: classes10.dex */
public final class xn0 {

    /* JADX INFO: renamed from: a */
    public static final wyd0 f195341a = new wyd0("android_id", null);

    /* JADX INFO: renamed from: a */
    public static String m212073a() {
        wyd0 wyd0Var = f195341a;
        String str = (String) wyd0Var.get();
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String strM212074b = m212074b();
        wyd0Var.put(strM212074b);
        return strM212074b;
    }

    /* JADX INFO: renamed from: b */
    public static String m212074b() {
        try {
            return k2n.m147979a();
        } catch (Throwable unused) {
            return UUID.randomUUID().toString();
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m212075c(Context context, String str) {
        Bundle bundle;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null) {
                return null;
            }
            return bundle.getString(str);
        } catch (PackageManager.NameNotFoundException e) {
            CrashHelper.m82479c(e);
            e.printStackTrace();
            return null;
        }
    }
}
