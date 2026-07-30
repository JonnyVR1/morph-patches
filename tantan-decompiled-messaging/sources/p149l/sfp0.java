package p149l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.PowerManager;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class sfp0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final PowerManager f164326a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public PowerManager.WakeLock f164327b;

    /* JADX INFO: renamed from: c */
    public boolean f164328c;

    /* JADX INFO: renamed from: d */
    public boolean f164329d;

    public sfp0(Context context) {
        this.f164326a = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    /* JADX INFO: renamed from: a */
    public void m183994a(boolean z) {
        if (z && this.f164327b == null) {
            PowerManager powerManager = this.f164326a;
            if (powerManager == null) {
                jwv.m143689i("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                return;
            } else {
                PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                this.f164327b = wakeLockNewWakeLock;
                wakeLockNewWakeLock.setReferenceCounted(false);
            }
        }
        this.f164328c = z;
        m183996c();
    }

    /* JADX INFO: renamed from: b */
    public void m183995b(boolean z) {
        this.f164329d = z;
        m183996c();
    }

    @SuppressLint({"WakelockTimeout"})
    /* JADX INFO: renamed from: c */
    public final void m183996c() {
        PowerManager.WakeLock wakeLock = this.f164327b;
        if (wakeLock == null) {
            return;
        }
        if (this.f164328c && this.f164329d) {
            wakeLock.acquire();
        } else {
            wakeLock.release();
        }
    }
}
