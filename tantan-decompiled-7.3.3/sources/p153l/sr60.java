package p153l;

import android.content.Context;
import android.os.Process;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class sr60 {
    /* JADX INFO: renamed from: a */
    public static int m187591a(@NonNull Context context, @NonNull String str, int i, int i2, @Nullable String str2) {
        if (context.checkPermission(str, i, i2) == -1) {
            return -1;
        }
        String strM118429c = dx0.m118429c(str);
        if (strM118429c == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i2);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        return ((Process.myUid() != i2 || !l950.m153327a(context.getPackageName(), str2)) ? dx0.m118428b(context, strM118429c, str2) : dx0.m118427a(context, i2, strM118429c, str2)) == 0 ? 0 : -2;
    }

    /* JADX INFO: renamed from: b */
    public static int m187592b(@NonNull Context context, @NonNull String str) {
        return m187591a(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}
