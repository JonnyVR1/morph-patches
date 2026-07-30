package p153l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.PowerManager;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class wop0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final PowerManager f190061a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public PowerManager.WakeLock f190062b;

    /* JADX INFO: renamed from: c */
    public boolean f190063c;

    /* JADX INFO: renamed from: d */
    public boolean f190064d;

    public wop0(Context context) {
        this.f190061a = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    /* JADX INFO: renamed from: a */
    public void m207344a(boolean z) {
        if (z && this.f190062b == null) {
            PowerManager powerManager = this.f190061a;
            if (powerManager == null) {
                kyv.m152151i("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                return;
            } else {
                PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                this.f190062b = wakeLockNewWakeLock;
                wakeLockNewWakeLock.setReferenceCounted(false);
            }
        }
        this.f190063c = z;
        m207346c();
    }

    /* JADX INFO: renamed from: b */
    public void m207345b(boolean z) {
        this.f190064d = z;
        m207346c();
    }

    @SuppressLint({"WakelockTimeout"})
    /* JADX INFO: renamed from: c */
    public final void m207346c() {
        PowerManager.WakeLock wakeLock = this.f190062b;
        if (wakeLock == null) {
            return;
        }
        if (this.f190063c && this.f190064d) {
            wakeLock.acquire();
        } else {
            wakeLock.release();
        }
    }
}
