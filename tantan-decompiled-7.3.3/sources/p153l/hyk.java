package p153l;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import com.immomo.mediacore.sink.ijkStreamerUtil;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class hyk {

    /* JADX INFO: renamed from: g */
    public static final boolean f112127g;

    /* JADX INFO: renamed from: h */
    public static final boolean f112128h;

    /* JADX INFO: renamed from: i */
    private static final File f112129i;

    /* JADX INFO: renamed from: j */
    private static volatile hyk f112130j;

    /* JADX INFO: renamed from: k */
    private static volatile int f112131k;

    /* JADX INFO: renamed from: b */
    private final int f112133b;

    /* JADX INFO: renamed from: c */
    private final int f112134c;

    /* JADX INFO: renamed from: d */
    @GuardedBy("this")
    private int f112135d;

    /* JADX INFO: renamed from: e */
    @GuardedBy("this")
    private boolean f112136e = true;

    /* JADX INFO: renamed from: f */
    private final AtomicBoolean f112137f = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a */
    private final boolean f112132a = m137746f();

    static {
        int i = Build.VERSION.SDK_INT;
        f112127g = i < 29;
        f112128h = i >= 26;
        f112129i = new File("/proc/self/fd");
        f112131k = -1;
    }

    @VisibleForTesting
    public hyk() {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f112133b = ijkStreamerUtil.FFS_PROP_INT64_CREAT_TIME;
            this.f112134c = 0;
        } else {
            this.f112133b = 700;
            this.f112134c = 128;
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m137742a() {
        return f112127g && !this.f112137f.get();
    }

    /* JADX INFO: renamed from: b */
    public static hyk m137743b() {
        if (f112130j == null) {
            synchronized (hyk.class) {
                try {
                    if (f112130j == null) {
                        f112130j = new hyk();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f112130j;
    }

    /* JADX INFO: renamed from: c */
    private int m137744c() {
        return f112131k != -1 ? f112131k : this.f112133b;
    }

    /* JADX INFO: renamed from: d */
    private synchronized boolean m137745d() {
        try {
            boolean z = true;
            int i = this.f112135d + 1;
            this.f112135d = i;
            if (i >= 50) {
                this.f112135d = 0;
                if (f112129i.list().length >= m137744c()) {
                    z = false;
                }
                this.f112136e = z;
                if (!z) {
                    Log.isLoggable("Downsampler", 5);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f112136e;
    }

    /* JADX INFO: renamed from: f */
    private static boolean m137746f() {
        return (m137747g() || m137748h()) ? false : true;
    }

    /* JADX INFO: renamed from: g */
    private static boolean m137747g() {
        if (Build.VERSION.SDK_INT != 26) {
            return false;
        }
        Iterator it = Arrays.asList("SC-04J", "SM-N935", "SM-J720", "SM-G570F", "SM-G570M", "SM-G960", "SM-G965", "SM-G935", "SM-G930", "SM-A520", "SM-A720F", "moto e5", "moto e5 play", "moto e5 plus", "moto e5 cruise", "moto g(6) forge", "moto g(6) play").iterator();
        while (it.hasNext()) {
            if (Build.MODEL.startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    private static boolean m137748h() {
        if (Build.VERSION.SDK_INT != 27) {
            return false;
        }
        return Arrays.asList("LG-M250", "LG-M320", "LG-Q710AL", "LG-Q710PL", "LGM-K121K", "LGM-K121L", "LGM-K121S", "LGM-X320K", "LGM-X320L", "LGM-X320S", "LGM-X401L", "LGM-X401S", "LM-Q610.FG", "LM-Q610.FGN", "LM-Q617.FG", "LM-Q617.FGN", "LM-Q710.FG", "LM-Q710.FGN", "LM-X220PM", "LM-X220QMA", "LM-X410PM").contains(Build.MODEL);
    }

    /* JADX INFO: renamed from: e */
    public boolean m137749e(int i, int i2, boolean z, boolean z2) {
        if (!z) {
            Log.isLoggable("HardwareConfig", 2);
            return false;
        }
        if (!this.f112132a) {
            Log.isLoggable("HardwareConfig", 2);
            return false;
        }
        if (!f112128h) {
            Log.isLoggable("HardwareConfig", 2);
            return false;
        }
        if (m137742a()) {
            Log.isLoggable("HardwareConfig", 2);
            return false;
        }
        if (z2) {
            Log.isLoggable("HardwareConfig", 2);
            return false;
        }
        int i3 = this.f112134c;
        if (i < i3) {
            Log.isLoggable("HardwareConfig", 2);
            return false;
        }
        if (i2 < i3) {
            Log.isLoggable("HardwareConfig", 2);
            return false;
        }
        if (m137745d()) {
            return true;
        }
        Log.isLoggable("HardwareConfig", 2);
        return false;
    }

    @TargetApi(26)
    /* JADX INFO: renamed from: i */
    public boolean m137750i(int i, int i2, BitmapFactory.Options options, boolean z, boolean z2) {
        boolean zM137749e = m137749e(i, i2, z, z2);
        if (zM137749e) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            options.inMutable = false;
        }
        return zM137749e;
    }
}
