package p149l;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.tantanapp.common.utils.CrashHelper;
import java.util.UUID;

/* JADX INFO: loaded from: classes11.dex */
public final class bo0 {

    /* JADX INFO: renamed from: a */
    public static final uqd0 f76473a = new uqd0("android_id", null);

    /* JADX INFO: renamed from: a */
    public static String m102888a() {
        uqd0 uqd0Var = f76473a;
        String str = (String) uqd0Var.get();
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String strM102889b = m102889b();
        uqd0Var.put(strM102889b);
        return strM102889b;
    }

    /* JADX INFO: renamed from: b */
    public static String m102889b() {
        try {
            return k0n.m144071a();
        } catch (Throwable unused) {
            return UUID.randomUUID().toString();
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m102890c(Context context, String str) {
        Bundle bundle;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null) {
                return null;
            }
            return bundle.getString(str);
        } catch (PackageManager.NameNotFoundException e) {
            CrashHelper.m81296c(e);
            e.printStackTrace();
            return null;
        }
    }
}
