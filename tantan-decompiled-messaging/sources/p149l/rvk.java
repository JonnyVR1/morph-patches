package p149l;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import com.immomo.mediacore.sink.ijkStreamerUtil;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class rvk {

    /* JADX INFO: renamed from: f */
    private static final File f161212f = new File("/proc/self/fd");

    /* JADX INFO: renamed from: g */
    private static volatile rvk f161213g;

    /* JADX INFO: renamed from: b */
    private final int f161215b;

    /* JADX INFO: renamed from: c */
    private final int f161216c;

    /* JADX INFO: renamed from: d */
    @GuardedBy("this")
    private int f161217d;

    /* JADX INFO: renamed from: e */
    @GuardedBy("this")
    private boolean f161218e = true;

    /* JADX INFO: renamed from: a */
    private final boolean f161214a = m181301d();

    @VisibleForTesting
    public rvk() {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f161215b = ijkStreamerUtil.FFS_PROP_INT64_CREAT_TIME;
            this.f161216c = 0;
        } else {
            this.f161215b = 700;
            this.f161216c = 128;
        }
    }

    /* JADX INFO: renamed from: a */
    public static rvk m181299a() {
        if (f161213g == null) {
            synchronized (rvk.class) {
                try {
                    if (f161213g == null) {
                        f161213g = new rvk();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f161213g;
    }

    /* JADX INFO: renamed from: b */
    private synchronized boolean m181300b() {
        try {
            boolean z = true;
            int i = this.f161217d + 1;
            this.f161217d = i;
            if (i >= 50) {
                this.f161217d = 0;
                if (f161212f.list().length >= this.f161215b) {
                    z = false;
                }
                this.f161218e = z;
                if (!z) {
                    Log.isLoggable("Downsampler", 5);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f161218e;
    }

    /* JADX INFO: renamed from: d */
    private static boolean m181301d() {
        String str = Build.MODEL;
        if (str == null || str.length() < 7) {
            return true;
        }
        switch (str.substring(0, 7)) {
            case "SM-A520":
            case "SM-G930":
            case "SM-G935":
            case "SM-G960":
            case "SM-G965":
            case "SM-J720":
            case "SM-N935":
                return Build.VERSION.SDK_INT != 26;
            default:
                return true;
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean m181302c(int i, int i2, boolean z, boolean z2) {
        int i3;
        return z && this.f161214a && Build.VERSION.SDK_INT >= 26 && !z2 && i >= (i3 = this.f161216c) && i2 >= i3 && m181300b();
    }

    @TargetApi(26)
    /* JADX INFO: renamed from: e */
    public boolean m181303e(int i, int i2, BitmapFactory.Options options, boolean z, boolean z2) {
        boolean zM181302c = m181302c(i, i2, z, z2);
        if (zM181302c) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            options.inMutable = false;
        }
        return zM181302c;
    }
}
