package p153l;

import android.content.pm.PackageManager;

/* JADX INFO: loaded from: classes7.dex */
public class p0e {
    /* JADX INFO: renamed from: a */
    public static int m170051a() {
        try {
            return gqw.m131478b().getPackageManager().getPackageInfo(gqw.m131478b().getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return 0;
        }
    }
}
