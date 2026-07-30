package p149l;

import android.content.Context;
import android.net.wifi.WifiManager;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class f6q0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final WifiManager f96160a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public WifiManager.WifiLock f96161b;

    /* JADX INFO: renamed from: c */
    public boolean f96162c;

    /* JADX INFO: renamed from: d */
    public boolean f96163d;

    public f6q0(Context context) {
        this.f96160a = (WifiManager) context.getApplicationContext().getSystemService("wifi");
    }

    /* JADX INFO: renamed from: a */
    public void m119631a(boolean z) {
        if (z && this.f96161b == null) {
            WifiManager wifiManager = this.f96160a;
            if (wifiManager == null) {
                jwv.m143689i("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                return;
            } else {
                WifiManager.WifiLock wifiLockCreateWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
                this.f96161b = wifiLockCreateWifiLock;
                wifiLockCreateWifiLock.setReferenceCounted(false);
            }
        }
        this.f96162c = z;
        m119633c();
    }

    /* JADX INFO: renamed from: b */
    public void m119632b(boolean z) {
        this.f96163d = z;
        m119633c();
    }

    /* JADX INFO: renamed from: c */
    public final void m119633c() {
        WifiManager.WifiLock wifiLock = this.f96161b;
        if (wifiLock == null) {
            return;
        }
        if (this.f96162c && this.f96163d) {
            wifiLock.acquire();
        } else {
            wifiLock.release();
        }
    }
}
