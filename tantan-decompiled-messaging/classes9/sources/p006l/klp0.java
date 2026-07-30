package p006l;

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
import l.alj0;
import l.ckq;
import l.o460;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class klp0 {

    /* JADX INFO: renamed from: a */
    public static String f15895a;

    /* JADX INFO: renamed from: b */
    public static int f15896b;

    /* JADX INFO: renamed from: c */
    public static boolean f15897c;

    /* JADX INFO: renamed from: l.klp0$a */
    public class C0938a implements ckq {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f15898a;

        public C0938a(Context context) {
            this.f15898a = context;
        }

        /* JADX INFO: renamed from: a */
        public boolean m18193a(Thread thread, Throwable th, boolean z) {
            if (!(th instanceof RuntimeException) || th.getMessage() == null || !th.getMessage().contains("Using WebView from more than one process at once with the same data directory is not supported")) {
                return false;
            }
            CrashHelper.g(new RuntimeException("UncaughtException setDataDirectorySuffix error, suffix=" + klp0.f15895a + "，times=" + klp0.f15896b, th));
            final Context context = this.f15898a;
            ThreadUtil.h(new Runnable() { // from class: l.jlp0
                @Override // java.lang.Runnable
                public final void run() {
                    klp0.m18190f(context, klp0.f15896b + 1);
                }
            }, 100L);
            return true;
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m18188d(File file, boolean z) {
        if (z) {
            try {
                if (file.exists()) {
                    return;
                }
                file.createNewFile();
            } catch (Throwable th) {
                CrashHelper.g(th);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m18189e(Context context) {
        m18190f(context, 0);
    }

    /* JADX INFO: renamed from: f */
    public static void m18190f(Context context, int i) {
        if (Build.VERSION.SDK_INT < 28 || i >= 3) {
            return;
        }
        f15895a = "";
        f15896b = i;
        try {
            String strC = o460.c();
            if (!TextUtils.equals(context.getPackageName(), strC)) {
                String str = "tt." + strC;
                f15895a = str;
                WebView.setDataDirectorySuffix(str);
                f15895a = "_" + f15895a;
            }
            if (i == 2) {
                m18191g(context, f15895a);
            }
        } catch (Throwable th) {
            CrashHelper.g(new RuntimeException("setDataDirectorySuffix error, suffix=" + f15895a + "，times=" + i, th));
        }
        if (f15897c) {
            return;
        }
        f15897c = true;
        alj0.d().g(new C0938a(context));
    }

    @TargetApi(28)
    /* JADX INFO: renamed from: g */
    public static void m18191g(Context context, String str) {
        File file = new File(context.getDataDir().getAbsolutePath() + "/app_webview" + str + "/webview_data.lock");
        if (file.exists()) {
            try {
                FileLock fileLockTryLock = new RandomAccessFile(file, "rw").getChannel().tryLock();
                if (fileLockTryLock != null) {
                    fileLockTryLock.close();
                } else {
                    m18188d(file, file.delete());
                }
            } catch (Throwable th) {
                CrashHelper.g(th);
                m18188d(file, file.exists() ? file.delete() : false);
            }
        }
    }
}
