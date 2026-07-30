package p149l;

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
public abstract class uxu0 implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {

    /* JADX INFO: renamed from: a */
    public final n3t0 f178760a = new n3t0();

    /* JADX INFO: renamed from: b */
    @GuardedBy("this")
    public boolean f178761b = false;

    /* JADX INFO: renamed from: c */
    @GuardedBy("this")
    public boolean f178762c = false;

    /* JADX INFO: renamed from: d */
    @GuardedBy("this")
    public hus0 f178763d;

    /* JADX INFO: renamed from: e */
    public Context f178764e;

    /* JADX INFO: renamed from: f */
    public Looper f178765f;

    /* JADX INFO: renamed from: g */
    public ScheduledExecutorService f178766g;

    /* JADX INFO: renamed from: a */
    public final synchronized void m196196a() {
        try {
            if (this.f178763d == null) {
                this.f178763d = new hus0(this.f178764e, this.f178765f, this, this);
            }
            this.f178763d.checkAvailabilityAndConnect();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m196197b() {
        try {
            this.f178762c = true;
            hus0 hus0Var = this.f178763d;
            if (hus0Var == null) {
                return;
            }
            if (hus0Var.isConnected() || this.f178763d.isConnecting()) {
                this.f178763d.disconnect();
            }
            Binder.flushPendingCommands();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        String str = String.format(Locale.US, "Remote ad service connection failed, cause: %d.", Integer.valueOf(connectionResult.getErrorCode()));
        x2t0.m206864b(str);
        this.f178760a.m157775c(new zzecf(1, str));
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public void onConnectionSuspended(int i) {
        String str = String.format(Locale.US, "Remote ad service connection suspended, cause: %d.", Integer.valueOf(i));
        x2t0.m206864b(str);
        this.f178760a.m157775c(new zzecf(1, str));
    }
}
