package p149l;

import android.content.pm.PackageManager;

/* JADX INFO: loaded from: classes7.dex */
public class czd {
    /* JADX INFO: renamed from: a */
    public static int m109408a() {
        try {
            return inw.m137164b().getPackageManager().getPackageInfo(inw.m137164b().getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return 0;
        }
    }
}
