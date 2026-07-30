package p149l;

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
public class klp0 {

    /* JADX INFO: renamed from: a */
    public static String f123680a;

    /* JADX INFO: renamed from: b */
    public static int f123681b;

    /* JADX INFO: renamed from: c */
    public static boolean f123682c;

    /* JADX INFO: renamed from: l.klp0$a */
    public class C18043a implements ckq {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f123683a;

        public C18043a(Context context) {
            this.f123683a = context;
        }

        @Override // p149l.ckq
        /* JADX INFO: renamed from: a */
        public boolean mo107425a(Thread thread, Throwable th, boolean z) {
            if (!(th instanceof RuntimeException) || th.getMessage() == null || !th.getMessage().contains("Using WebView from more than one process at once with the same data directory is not supported")) {
                return false;
            }
            CrashHelper.m81300g(new RuntimeException("UncaughtException setDataDirectorySuffix error, suffix=" + klp0.f123680a + "，times=" + klp0.f123681b, th));
            final Context context = this.f123683a;
            ThreadUtil.m81313h(new Runnable() { // from class: l.jlp0
                @Override // java.lang.Runnable
                public final void run() {
                    klp0.m146427f(context, klp0.f123681b + 1);
                }
            }, 100L);
            return true;
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m146425d(File file, boolean z) {
        if (z) {
            try {
                if (file.exists()) {
                    return;
                }
                file.createNewFile();
            } catch (Throwable th) {
                CrashHelper.m81300g(th);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m146426e(Context context) {
        m146427f(context, 0);
    }

    /* JADX INFO: renamed from: f */
    public static void m146427f(Context context, int i) {
        if (Build.VERSION.SDK_INT < 28 || i >= 3) {
            return;
        }
        f123680a = "";
        f123681b = i;
        try {
            String strM162550c = o460.m162550c();
            if (!TextUtils.equals(context.getPackageName(), strM162550c)) {
                String str = "tt." + strM162550c;
                f123680a = str;
                WebView.setDataDirectorySuffix(str);
                f123680a = "_" + f123680a;
            }
            if (i == 2) {
                m146428g(context, f123680a);
            }
        } catch (Throwable th) {
            CrashHelper.m81300g(new RuntimeException("setDataDirectorySuffix error, suffix=" + f123680a + "，times=" + i, th));
        }
        if (f123682c) {
            return;
        }
        f123682c = true;
        alj0.m97291d().m97295g(new C18043a(context));
    }

    @TargetApi(28)
    /* JADX INFO: renamed from: g */
    public static void m146428g(Context context, String str) {
        File file = new File(context.getDataDir().getAbsolutePath() + "/app_webview" + str + "/webview_data.lock");
        if (file.exists()) {
            try {
                FileLock fileLockTryLock = new RandomAccessFile(file, "rw").getChannel().tryLock();
                if (fileLockTryLock != null) {
                    fileLockTryLock.close();
                } else {
                    m146425d(file, file.delete());
                }
            } catch (Throwable th) {
                CrashHelper.m81300g(th);
                m146425d(file, file.exists() ? file.delete() : false);
            }
        }
    }
}
