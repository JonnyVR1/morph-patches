package p153l;

import android.os.Binder;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.internal.ads.zzbze;
import com.google.android.gms.internal.ads.zzecf;
import org.aspectj.lang.JoinPoint;

/* JADX INFO: loaded from: classes6.dex */
public abstract class k4v0 implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {

    /* JADX INFO: renamed from: a */
    public final tct0 f123931a = new tct0();

    /* JADX INFO: renamed from: b */
    public final Object f123932b = new Object();

    /* JADX INFO: renamed from: c */
    public boolean f123933c = false;

    /* JADX INFO: renamed from: d */
    public boolean f123934d = false;

    /* JADX INFO: renamed from: e */
    public zzbze f123935e;

    /* JADX INFO: renamed from: f */
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    @VisibleForTesting(otherwise = 3)
    public l3t0 f123936f;

    /* JADX INFO: renamed from: a */
    public final void m148299a() {
        synchronized (this.f123932b) {
            try {
                this.f123934d = true;
                if (this.f123936f.isConnected() || this.f123936f.isConnecting()) {
                    this.f123936f.disconnect();
                }
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        dct0.m115293b("Disconnected from remote ad request service.");
        this.f123931a.m190495c(new zzecf(1));
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        dct0.m115293b("Cannot connect to remote service, fallback to local instance.");
    }
}
