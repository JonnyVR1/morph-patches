package p149l;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;

/* JADX INFO: loaded from: classes7.dex */
public final class vfp0 {
    @Nullable
    /* JADX INFO: renamed from: a */
    private static String m198284a(@NonNull Context context) {
        try {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            if (applicationInfo == null) {
                return null;
            }
            return applicationInfo.sourceDir;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static String m198285b(@NonNull Context context, @NonNull String str) {
        nr4 nr4VarM198286c = m198286c(context);
        return nr4VarM198286c == null ? str : nr4VarM198286c.m160708a();
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static nr4 m198286c(@NonNull Context context) {
        String strM198284a = m198284a(context);
        if (TextUtils.isEmpty(strM198284a)) {
            return null;
        }
        return pr4.m170989a(new File(strM198284a));
    }
}
