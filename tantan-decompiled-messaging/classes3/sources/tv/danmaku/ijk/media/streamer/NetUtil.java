package tv.danmaku.ijk.media.streamer;

import android.app.ActivityManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class NetUtil {

    /* JADX INFO: renamed from: a */
    private WeakReference<Context> f12159a;

    public NetUtil(Context context) {
        this.f12159a = new WeakReference<>(context);
    }

    /* JADX INFO: renamed from: a */
    public long m10966a() {
        try {
            ActivityManager activityManager = (ActivityManager) m10967b().getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            return memoryInfo.availMem / 1048576;
        } catch (Throwable unused) {
            return 0L;
        }
    }

    /* JADX INFO: renamed from: b */
    public Context m10967b() {
        WeakReference<Context> weakReference = this.f12159a;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        return this.f12159a.get();
    }

    /* JADX INFO: renamed from: c */
    public String m10968c() {
        NetworkInfo activeNetworkInfo;
        if (m10967b() == null || (activeNetworkInfo = ((ConnectivityManager) m10967b().getSystemService("connectivity")).getActiveNetworkInfo()) == null) {
            return null;
        }
        if (activeNetworkInfo.getType() == 1) {
            return "wifi";
        }
        if (activeNetworkInfo.getType() == 0) {
            return "mobile";
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public boolean m10969d() {
        return "wifi".equals(m10968c());
    }

    /* JADX INFO: renamed from: e */
    public void m10970e() {
        m10971f();
    }

    /* JADX INFO: renamed from: f */
    public void m10971f() {
        WeakReference<Context> weakReference = this.f12159a;
        if (weakReference != null) {
            weakReference.clear();
        }
    }
}
