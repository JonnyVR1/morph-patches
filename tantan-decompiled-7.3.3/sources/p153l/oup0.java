package p153l;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebView;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.ThreadUtil;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;

/* JADX INFO: loaded from: classes9.dex */
public class oup0 {

    /* JADX INFO: renamed from: a */
    public static String f149181a;

    /* JADX INFO: renamed from: b */
    public static int f149182b;

    /* JADX INFO: renamed from: c */
    public static boolean f149183c;

    /* JADX INFO: renamed from: l.oup0$a */
    public class C19222a implements bmq {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f149184a;

        public C19222a(Context context) {
            this.f149184a = context;
        }

        @Override // p153l.bmq
        /* JADX INFO: renamed from: a */
        public boolean mo105250a(Thread thread, Throwable th, boolean z) {
            if (!(th instanceof RuntimeException) || th.getMessage() == null || !th.getMessage().contains("Using WebView from more than one process at once with the same data directory is not supported")) {
                return false;
            }
            CrashHelper.m82483g(new RuntimeException("UncaughtException setDataDirectorySuffix error, suffix=" + oup0.f149181a + "，times=" + oup0.f149182b, th));
            final Context context = this.f149184a;
            ThreadUtil.m82496h(new Runnable() { // from class: l.nup0
                @Override // java.lang.Runnable
                public final void run() {
                    oup0.m169374f(context, oup0.f149182b + 1);
                }
            }, 100L);
            return true;
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m169372d(File file, boolean z) {
        if (z) {
            try {
                if (file.exists()) {
                    return;
                }
                file.createNewFile();
            } catch (Throwable th) {
                CrashHelper.m82483g(th);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m169373e(Context context) {
        m169374f(context, 0);
    }

    /* JADX INFO: renamed from: f */
    public static void m169374f(Context context, int i) {
        if (Build.VERSION.SDK_INT < 28 || i >= 3) {
            return;
        }
        f149181a = "";
        f149182b = i;
        try {
            String strM195380c = uc60.m195380c();
            if (!TextUtils.equals(context.getPackageName(), strM195380c)) {
                String str = "tt." + strM195380c;
                f149181a = str;
                WebView.setDataDirectorySuffix(str);
                f149181a = "_" + f149181a;
            }
            if (i == 2) {
                m169375g(context, f149181a);
            }
        } catch (Throwable th) {
            CrashHelper.m82483g(new RuntimeException("setDataDirectorySuffix error, suffix=" + f149181a + "，times=" + i, th));
        }
        if (f149183c) {
            return;
        }
        f149183c = true;
        duj0.m118149d().m118153g(new C19222a(context));
    }

    @TargetApi(28)
    /* JADX INFO: renamed from: g */
    public static void m169375g(Context context, String str) {
        File file = new File(context.getDataDir().getAbsolutePath() + "/app_webview" + str + "/webview_data.lock");
        if (file.exists()) {
            try {
                FileLock fileLockTryLock = new RandomAccessFile(file, "rw").getChannel().tryLock();
                if (fileLockTryLock != null) {
                    fileLockTryLock.close();
                } else {
                    m169372d(file, file.delete());
                }
            } catch (Throwable th) {
                CrashHelper.m82483g(th);
                m169372d(file, file.exists() ? file.delete() : false);
            }
        }
    }
}
