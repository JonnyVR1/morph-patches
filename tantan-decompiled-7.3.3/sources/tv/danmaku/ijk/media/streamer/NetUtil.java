package tv.danmaku.ijk.media.streamer;

import android.app.ActivityManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import com.p051p1.mobile.putong.data.Mobile;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public class NetUtil {

    /* JADX INFO: renamed from: a */
    private WeakReference<Context> f209456a;

    public NetUtil(Context context) {
        this.f209456a = new WeakReference<>(context);
    }

    /* JADX INFO: renamed from: a */
    public long m223741a() {
        try {
            ActivityManager activityManager = (ActivityManager) m223742b().getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            return memoryInfo.availMem / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
        } catch (Throwable unused) {
            return 0L;
        }
    }

    /* JADX INFO: renamed from: b */
    public Context m223742b() {
        WeakReference<Context> weakReference = this.f209456a;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        return this.f209456a.get();
    }

    /* JADX INFO: renamed from: c */
    public String m223743c() {
        NetworkInfo activeNetworkInfo;
        if (m223742b() == null || (activeNetworkInfo = ((ConnectivityManager) m223742b().getSystemService("connectivity")).getActiveNetworkInfo()) == null) {
            return null;
        }
        if (activeNetworkInfo.getType() == 1) {
            return "wifi";
        }
        if (activeNetworkInfo.getType() == 0) {
            return Mobile.TYPE;
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public boolean m223744d() {
        return "wifi".equals(m223743c());
    }

    /* JADX INFO: renamed from: e */
    public void m223745e() {
        m223746f();
    }

    /* JADX INFO: renamed from: f */
    public void m223746f() {
        WeakReference<Context> weakReference = this.f209456a;
        if (weakReference != null) {
            weakReference.clear();
        }
    }
}
