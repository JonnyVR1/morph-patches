package p153l;

import android.content.Context;
import android.net.wifi.WifiManager;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class kfq0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final WifiManager f126495a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public WifiManager.WifiLock f126496b;

    /* JADX INFO: renamed from: c */
    public boolean f126497c;

    /* JADX INFO: renamed from: d */
    public boolean f126498d;

    public kfq0(Context context) {
        this.f126495a = (WifiManager) context.getApplicationContext().getSystemService("wifi");
    }

    /* JADX INFO: renamed from: a */
    public void m149619a(boolean z) {
        if (z && this.f126496b == null) {
            WifiManager wifiManager = this.f126495a;
            if (wifiManager == null) {
                kyv.m152151i("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                return;
            } else {
                WifiManager.WifiLock wifiLockCreateWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
                this.f126496b = wifiLockCreateWifiLock;
                wifiLockCreateWifiLock.setReferenceCounted(false);
            }
        }
        this.f126497c = z;
        m149621c();
    }

    /* JADX INFO: renamed from: b */
    public void m149620b(boolean z) {
        this.f126498d = z;
        m149621c();
    }

    /* JADX INFO: renamed from: c */
    public final void m149621c() {
        WifiManager.WifiLock wifiLock = this.f126496b;
        if (wifiLock == null) {
            return;
        }
        if (this.f126497c && this.f126498d) {
            wifiLock.acquire();
        } else {
            wifiLock.release();
        }
    }
}
