package p153l;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
public final class dx0 {

    /* JADX INFO: renamed from: l.dx0$a */
    @RequiresApi(23)
    public static class C16643a {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static <T> T m118430a(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static int m118431b(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOpNoThrow(str, str2);
        }

        @DoNotInline
        /* JADX INFO: renamed from: c */
        public static String m118432c(String str) {
            return AppOpsManager.permissionToOp(str);
        }
    }

    /* JADX INFO: renamed from: l.dx0$b */
    @RequiresApi(29)
    public static class C16644b {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static int m118433a(@Nullable AppOpsManager appOpsManager, @NonNull String str, int i, @NonNull String str2) {
            if (appOpsManager == null) {
                return 1;
            }
            return appOpsManager.checkOpNoThrow(str, i, str2);
        }

        @NonNull
        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static String m118434b(@NonNull Context context) {
            return context.getOpPackageName();
        }

        @Nullable
        @DoNotInline
        /* JADX INFO: renamed from: c */
        public static AppOpsManager m118435c(@NonNull Context context) {
            return (AppOpsManager) context.getSystemService(AppOpsManager.class);
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m118427a(@NonNull Context context, int i, @NonNull String str, @NonNull String str2) {
        if (Build.VERSION.SDK_INT < 29) {
            return m118428b(context, str, str2);
        }
        AppOpsManager appOpsManagerM118435c = C16644b.m118435c(context);
        int iM118433a = C16644b.m118433a(appOpsManagerM118435c, str, Binder.getCallingUid(), str2);
        return iM118433a != 0 ? iM118433a : C16644b.m118433a(appOpsManagerM118435c, str, i, C16644b.m118434b(context));
    }

    /* JADX INFO: renamed from: b */
    public static int m118428b(@NonNull Context context, @NonNull String str, @NonNull String str2) {
        return C16643a.m118431b((AppOpsManager) C16643a.m118430a(context, AppOpsManager.class), str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static String m118429c(@NonNull String str) {
        return C16643a.m118432c(str);
    }
}
