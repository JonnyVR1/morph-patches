package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.io.File;

/* JADX INFO: renamed from: androidx.profileinstaller.a */
/* JADX INFO: loaded from: classes.dex */
public class C0546a {

    /* JADX INFO: renamed from: androidx.profileinstaller.a$a */
    @RequiresApi(api = 21)
    public static class a {
        /* JADX INFO: renamed from: a */
        public static File m3233a(Context context) {
            return context.getCodeCacheDir();
        }
    }

    /* JADX INFO: renamed from: androidx.profileinstaller.a$b */
    @RequiresApi(api = 24)
    public static class b {
        /* JADX INFO: renamed from: a */
        public static Context m3234a(Context context) {
            return context.createDeviceProtectedStorageContext();
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m3231a(File file) {
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
            z = m3231a(file2) && z;
        }
        return z;
    }

    /* JADX INFO: renamed from: b */
    public static void m3232b(@NonNull Context context, @NonNull ProfileInstallReceiver.C0543a c0543a) {
        if (m3231a(Build.VERSION.SDK_INT >= 34 ? b.m3234a(context).getCacheDir() : a.m3233a(b.m3234a(context)))) {
            c0543a.mo3222a(14, null);
        } else {
            c0543a.mo3222a(15, null);
        }
    }
}
