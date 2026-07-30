package p149l;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
public final class ww0 {

    /* JADX INFO: renamed from: l.ww0$a */
    @RequiresApi(23)
    public static class C20976a {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static <T> T m205795a(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static int m205796b(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOpNoThrow(str, str2);
        }

        @DoNotInline
        /* JADX INFO: renamed from: c */
        public static String m205797c(String str) {
            return AppOpsManager.permissionToOp(str);
        }
    }

    /* JADX INFO: renamed from: l.ww0$b */
    @RequiresApi(29)
    public static class C20977b {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static int m205798a(@Nullable AppOpsManager appOpsManager, @NonNull String str, int i, @NonNull String str2) {
            if (appOpsManager == null) {
                return 1;
            }
            return appOpsManager.checkOpNoThrow(str, i, str2);
        }

        @NonNull
        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static String m205799b(@NonNull Context context) {
            return context.getOpPackageName();
        }

        @Nullable
        @DoNotInline
        /* JADX INFO: renamed from: c */
        public static AppOpsManager m205800c(@NonNull Context context) {
            return (AppOpsManager) context.getSystemService(AppOpsManager.class);
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m205792a(@NonNull Context context, int i, @NonNull String str, @NonNull String str2) {
        if (Build.VERSION.SDK_INT < 29) {
            return m205793b(context, str, str2);
        }
        AppOpsManager appOpsManagerM205800c = C20977b.m205800c(context);
        int iM205798a = C20977b.m205798a(appOpsManagerM205800c, str, Binder.getCallingUid(), str2);
        return iM205798a != 0 ? iM205798a : C20977b.m205798a(appOpsManagerM205800c, str, i, C20977b.m205799b(context));
    }

    /* JADX INFO: renamed from: b */
    public static int m205793b(@NonNull Context context, @NonNull String str, @NonNull String str2) {
        return C20976a.m205796b((AppOpsManager) C20976a.m205795a(context, AppOpsManager.class), str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static String m205794c(@NonNull String str) {
        return C20976a.m205797c(str);
    }
}
