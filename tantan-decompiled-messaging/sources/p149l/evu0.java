package p149l;

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
public abstract class evu0 implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {

    /* JADX INFO: renamed from: a */
    public final n3t0 f93384a = new n3t0();

    /* JADX INFO: renamed from: b */
    public final Object f93385b = new Object();

    /* JADX INFO: renamed from: c */
    public boolean f93386c = false;

    /* JADX INFO: renamed from: d */
    public boolean f93387d = false;

    /* JADX INFO: renamed from: e */
    public zzbze f93388e;

    /* JADX INFO: renamed from: f */
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    @VisibleForTesting(otherwise = 3)
    public fus0 f93389f;

    /* JADX INFO: renamed from: a */
    public final void m118321a() {
        synchronized (this.f93385b) {
            try {
                this.f93387d = true;
                if (this.f93389f.isConnected() || this.f93389f.isConnecting()) {
                    this.f93389f.disconnect();
                }
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        x2t0.m206864b("Disconnected from remote ad request service.");
        this.f93384a.m157775c(new zzecf(1));
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        x2t0.m206864b("Cannot connect to remote service, fallback to local instance.");
    }
}
