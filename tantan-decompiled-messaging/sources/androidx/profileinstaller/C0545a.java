package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.io.File;

/* JADX INFO: renamed from: androidx.profileinstaller.a */
/* JADX INFO: loaded from: classes.dex */
public class C0545a {

    /* JADX INFO: renamed from: androidx.profileinstaller.a$a */
    @RequiresApi(api = 21)
    public static class a {
        /* JADX INFO: renamed from: a */
        public static File m3232a(Context context) {
            return context.getCodeCacheDir();
        }
    }

    /* JADX INFO: renamed from: androidx.profileinstaller.a$b */
    @RequiresApi(api = 24)
    public static class b {
        /* JADX INFO: renamed from: a */
        public static Context m3233a(Context context) {
            return context.createDeviceProtectedStorageContext();
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m3230a(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z = true;
        for (File file2 : fileArrListFiles) {
            z = m3230a(file2) && z;
        }
        return z;
    }

    /* JADX INFO: renamed from: b */
    public static void m3231b(@NonNull Context context, @NonNull ProfileInstallReceiver.C0542a c0542a) {
        if (m3230a(Build.VERSION.SDK_INT >= 34 ? b.m3233a(context).getCacheDir() : a.m3232a(b.m3233a(context)))) {
            c0542a.mo3221a(14, null);
        } else {
            c0542a.mo3221a(15, null);
        }
    }
}
