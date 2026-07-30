package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Executor;
import p149l.rfx;

/* JADX INFO: renamed from: androidx.profileinstaller.c */
/* JADX INFO: loaded from: classes.dex */
public class C0547c {

    /* JADX INFO: renamed from: a */
    public static final c f2515a = new a();

    /* JADX INFO: renamed from: b */
    @NonNull
    public static final c f2516b = new b();

    /* JADX INFO: renamed from: androidx.profileinstaller.c$a */
    public class a implements c {
        @Override // androidx.profileinstaller.C0547c.c
        /* JADX INFO: renamed from: a */
        public void mo3221a(int i, @Nullable Object obj) {
        }

        @Override // androidx.profileinstaller.C0547c.c
        /* JADX INFO: renamed from: b */
        public void mo3222b(int i, @Nullable Object obj) {
        }
    }

    /* JADX INFO: renamed from: androidx.profileinstaller.c$b */
    public class b implements c {
        @Override // androidx.profileinstaller.C0547c.c
        /* JADX INFO: renamed from: a */
        public void mo3221a(int i, @Nullable Object obj) {
            String str;
            switch (i) {
                case 1:
                    str = "RESULT_INSTALL_SUCCESS";
                    break;
                case 2:
                    str = "RESULT_ALREADY_INSTALLED";
                    break;
                case 3:
                    str = "RESULT_UNSUPPORTED_ART_VERSION";
                    break;
                case 4:
                    str = "RESULT_NOT_WRITABLE";
                    break;
                case 5:
                    str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                    break;
                case 6:
                    str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                    break;
                case 7:
                    str = "RESULT_IO_EXCEPTION";
                    break;
                case 8:
                    str = "RESULT_PARSE_EXCEPTION";
                    break;
                case 9:
                default:
                    str = "";
                    break;
                case 10:
                    str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                    break;
                case 11:
                    str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                    break;
            }
            if (i == 6 || i == 7 || i == 8) {
                Log.e("ProfileInstaller", str, (Throwable) obj);
            }
        }

        @Override // androidx.profileinstaller.C0547c.c
        /* JADX INFO: renamed from: b */
        public void mo3222b(int i, @Nullable Object obj) {
        }
    }

    /* JADX INFO: renamed from: androidx.profileinstaller.c$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        void mo3221a(int i, @Nullable Object obj);

        /* JADX INFO: renamed from: b */
        void mo3222b(int i, @Nullable Object obj);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* JADX INFO: renamed from: b */
    public static boolean m3248b(@NonNull File file) {
        return new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
    }

    @WorkerThread
    /* JADX INFO: renamed from: c */
    public static void m3249c(@NonNull Context context, @NonNull Executor executor, @NonNull c cVar) {
        m3248b(context.getFilesDir());
        m3252f(executor, cVar, 11, null);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @WorkerThread
    /* JADX INFO: renamed from: d */
    public static boolean m3250d(PackageInfo packageInfo, File file, c cVar) {
        File file2 = new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
        if (!file2.exists()) {
            return false;
        }
        try {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file2));
            try {
                long j = dataInputStream.readLong();
                dataInputStream.close();
                boolean z = j == packageInfo.lastUpdateTime;
                if (z) {
                    cVar.mo3221a(2, null);
                }
                return z;
            } catch (Throwable th) {
                try {
                    dataInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
            return false;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* JADX INFO: renamed from: e */
    public static void m3251e(@NonNull PackageInfo packageInfo, @NonNull File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m3252f(@NonNull Executor executor, @NonNull final c cVar, final int i, @Nullable final Object obj) {
        executor.execute(new Runnable() { // from class: l.fq90
            @Override // java.lang.Runnable
            public final void run() {
                cVar.mo3221a(i, obj);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public static boolean m3253g(@NonNull AssetManager assetManager, @NonNull String str, @NonNull PackageInfo packageInfo, @NonNull File file, @NonNull String str2, @NonNull Executor executor, @NonNull c cVar) {
        C0546b c0546b = new C0546b(assetManager, executor, cVar, str2, "dexopt/baseline.prof", "dexopt/baseline.profm", new File(new File("/data/misc/profiles/cur/0", str), "primary.prof"));
        if (!c0546b.m3239e()) {
            return false;
        }
        boolean zM3246m = c0546b.m3242h().m3245l().m3246m();
        if (zM3246m) {
            m3251e(packageInfo, file);
        }
        return zM3246m;
    }

    @WorkerThread
    /* JADX INFO: renamed from: h */
    public static void m3254h(@NonNull Context context) {
        m3255i(context, new rfx(), f2515a);
    }

    @WorkerThread
    /* JADX INFO: renamed from: i */
    public static void m3255i(@NonNull Context context, @NonNull Executor executor, @NonNull c cVar) {
        m3256j(context, executor, cVar, false);
    }

    @WorkerThread
    /* JADX INFO: renamed from: j */
    public static void m3256j(@NonNull Context context, @NonNull Executor executor, @NonNull c cVar, boolean z) {
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        boolean z2 = false;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z && m3250d(packageInfo, filesDir, cVar)) {
                context.getPackageName();
                C0549e.m3303c(context, false);
                return;
            }
            context.getPackageName();
            if (m3253g(assets, packageName, packageInfo, filesDir, name, executor, cVar) && z) {
                z2 = true;
            }
            C0549e.m3303c(context, z2);
        } catch (PackageManager.NameNotFoundException e) {
            cVar.mo3221a(7, e);
            C0549e.m3303c(context, false);
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: k */
    public static void m3257k(@NonNull Context context, @NonNull Executor executor, @NonNull c cVar) {
        try {
            m3251e(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
            m3252f(executor, cVar, 10, null);
        } catch (PackageManager.NameNotFoundException e) {
            m3252f(executor, cVar, 7, e);
        }
    }
}
