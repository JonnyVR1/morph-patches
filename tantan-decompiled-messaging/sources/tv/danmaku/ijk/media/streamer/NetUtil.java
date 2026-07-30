package tv.danmaku.ijk.media.streamer;

import android.app.ActivityManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import com.p046p1.mobile.putong.data.Mobile;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public class NetUtil {

    /* JADX INFO: renamed from: a */
    private WeakReference<Context> f208534a;

    public NetUtil(Context context) {
        this.f208534a = new WeakReference<>(context);
    }

    /* JADX INFO: renamed from: a */
    public long m222495a() {
        try {
            ActivityManager activityManager = (ActivityManager) m222496b().getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            return memoryInfo.availMem / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
        } catch (Throwable unused) {
            return 0L;
        }
    }

    /* JADX INFO: renamed from: b */
    public Context m222496b() {
        WeakReference<Context> weakReference = this.f208534a;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        return this.f208534a.get();
    }

    /* JADX INFO: renamed from: c */
    public String m222497c() {
        NetworkInfo activeNetworkInfo;
        if (m222496b() == null || (activeNetworkInfo = ((ConnectivityManager) m222496b().getSystemService("connectivity")).getActiveNetworkInfo()) == null) {
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
    public boolean m222498d() {
        return "wifi".equals(m222497c());
    }

    /* JADX INFO: renamed from: e */
    public void m222499e() {
        m222500f();
    }

    /* JADX INFO: renamed from: f */
    public void m222500f() {
        WeakReference<Context> weakReference = this.f208534a;
        if (weakReference != null) {
            weakReference.clear();
        }
    }
}
