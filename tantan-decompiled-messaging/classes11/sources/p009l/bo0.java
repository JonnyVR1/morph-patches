package p009l;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.tantanapp.common.utils.CrashHelper;
import java.util.UUID;
import l.k0n;
import l.uqd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public final class bo0 {

    /* JADX INFO: renamed from: a */
    public static final uqd0 f10214a = new uqd0("android_id", (String) null);

    /* JADX INFO: renamed from: a */
    public static String m12179a() {
        uqd0 uqd0Var = f10214a;
        String str = (String) uqd0Var.get();
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String strM12180b = m12180b();
        uqd0Var.put(strM12180b);
        return strM12180b;
    }

    /* JADX INFO: renamed from: b */
    public static String m12180b() {
        try {
            return k0n.a();
        } catch (Throwable unused) {
            return UUID.randomUUID().toString();
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m12181c(Context context, String str) {
        Bundle bundle;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null) {
                return null;
            }
            return bundle.getString(str);
        } catch (PackageManager.NameNotFoundException e) {
            CrashHelper.c(e);
            e.printStackTrace();
            return null;
        }
    }
}
