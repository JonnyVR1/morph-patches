package p153l;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;

/* JADX INFO: loaded from: classes7.dex */
public final class zop0 {
    @Nullable
    /* JADX INFO: renamed from: a */
    private static String m220779a(@NonNull Context context) {
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
    public static String m220780b(@NonNull Context context, @NonNull String str) {
        ms4 ms4VarM220781c = m220781c(context);
        return ms4VarM220781c == null ? str : ms4VarM220781c.m159752a();
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static ms4 m220781c(@NonNull Context context) {
        String strM220779a = m220779a(context);
        if (TextUtils.isEmpty(strM220779a)) {
            return null;
        }
        return os4.m168959a(new File(strM220779a));
    }
}
