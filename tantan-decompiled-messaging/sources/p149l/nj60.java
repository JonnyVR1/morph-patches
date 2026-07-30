package p149l;

import android.content.Context;
import android.os.Process;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class nj60 {
    /* JADX INFO: renamed from: a */
    public static int m159645a(@NonNull Context context, @NonNull String str, int i, int i2, @Nullable String str2) {
        if (context.checkPermission(str, i, i2) == -1) {
            return -1;
        }
        String strM205794c = ww0.m205794c(str);
        if (strM205794c == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i2);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        return ((Process.myUid() != i2 || !w050.m200828a(context.getPackageName(), str2)) ? ww0.m205793b(context, strM205794c, str2) : ww0.m205792a(context, i2, strM205794c, str2)) == 0 ? 0 : -2;
    }

    /* JADX INFO: renamed from: b */
    public static int m159646b(@NonNull Context context, @NonNull String str) {
        return m159645a(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}
