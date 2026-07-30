package p153l;

import android.content.Context;
import android.os.Binder;
import android.os.Looper;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.internal.ads.zzecf;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes6.dex */
public abstract class a7v0 implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {

    /* JADX INFO: renamed from: a */
    public final tct0 f68844a = new tct0();

    /* JADX INFO: renamed from: b */
    @GuardedBy("this")
    public boolean f68845b = false;

    /* JADX INFO: renamed from: c */
    @GuardedBy("this")
    public boolean f68846c = false;

    /* JADX INFO: renamed from: d */
    @GuardedBy("this")
    public n3t0 f68847d;

    /* JADX INFO: renamed from: e */
    public Context f68848e;

    /* JADX INFO: renamed from: f */
    public Looper f68849f;

    /* JADX INFO: renamed from: g */
    public ScheduledExecutorService f68850g;

    /* JADX INFO: renamed from: a */
    public final synchronized void m96385a() {
        try {
            if (this.f68847d == null) {
                this.f68847d = new n3t0(this.f68848e, this.f68849f, this, this);
            }
            this.f68847d.checkAvailabilityAndConnect();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m96386b() {
        try {
            this.f68846c = true;
            n3t0 n3t0Var = this.f68847d;
            if (n3t0Var == null) {
                return;
            }
            if (n3t0Var.isConnected() || this.f68847d.isConnecting()) {
                this.f68847d.disconnect();
            }
            Binder.flushPendingCommands();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        String str = String.format(Locale.US, "Remote ad service connection failed, cause: %d.", Integer.valueOf(connectionResult.getErrorCode()));
        dct0.m115293b(str);
        this.f68844a.m190495c(new zzecf(1, str));
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public void onConnectionSuspended(int i) {
        String str = String.format(Locale.US, "Remote ad service connection suspended, cause: %d.", Integer.valueOf(i));
        dct0.m115293b(str);
        this.f68844a.m190495c(new zzecf(1, str));
    }
}
