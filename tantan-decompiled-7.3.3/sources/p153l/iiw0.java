package p153l;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.internal.ads.zzfsi;
import com.google.android.gms.internal.ads.zzfsk;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
@VisibleForTesting
public final class iiw0 implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {

    /* JADX INFO: renamed from: a */
    @VisibleForTesting
    public final cjw0 f115148a;

    /* JADX INFO: renamed from: b */
    public final String f115149b;

    /* JADX INFO: renamed from: c */
    public final String f115150c;

    /* JADX INFO: renamed from: d */
    public final LinkedBlockingQueue f115151d;

    /* JADX INFO: renamed from: e */
    public final HandlerThread f115152e;

    /* JADX INFO: renamed from: f */
    public final vhw0 f115153f;

    /* JADX INFO: renamed from: g */
    public final long f115154g;

    /* JADX INFO: renamed from: h */
    public final int f115155h;

    public iiw0(Context context, int i, int i2, String str, String str2, String str3, vhw0 vhw0Var) {
        this.f115149b = str;
        this.f115155h = i2;
        this.f115150c = str2;
        this.f115153f = vhw0Var;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.f115152e = handlerThread;
        handlerThread.start();
        this.f115154g = System.currentTimeMillis();
        cjw0 cjw0Var = new cjw0(context, handlerThread.getLooper(), this, this, 19621000);
        this.f115148a = cjw0Var;
        this.f115151d = new LinkedBlockingQueue();
        cjw0Var.checkAvailabilityAndConnect();
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: a */
    public static zzfsk m140164a() {
        return new zzfsk(null, 1);
    }

    /* JADX INFO: renamed from: b */
    public final zzfsk m140165b(int i) {
        zzfsk zzfskVar;
        try {
            zzfskVar = (zzfsk) this.f115151d.poll(50000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            m140168e(2009, this.f115154g, e);
            zzfskVar = null;
        }
        m140168e(3004, this.f115154g, null);
        if (zzfskVar != null) {
            if (zzfskVar.zzc == 7) {
                vhw0.m201300g(3);
            } else {
                vhw0.m201300g(2);
            }
        }
        return zzfskVar == null ? m140164a() : zzfskVar;
    }

    /* JADX INFO: renamed from: c */
    public final void m140166c() {
        cjw0 cjw0Var = this.f115148a;
        if (cjw0Var != null) {
            if (cjw0Var.isConnected() || this.f115148a.isConnecting()) {
                this.f115148a.disconnect();
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final kjw0 m140167d() {
        try {
            return this.f115148a.m110287c();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m140168e(int i, long j, Exception exc) {
        this.f115153f.m201302c(i, System.currentTimeMillis() - j, exc);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        kjw0 kjw0VarM140167d = m140167d();
        if (kjw0VarM140167d != null) {
            try {
                zzfsk zzfskVarM150076m5 = kjw0VarM140167d.m150076m5(new zzfsi(1, this.f115155h, this.f115149b, this.f115150c));
                m140168e(5011, this.f115154g, null);
                this.f115151d.put(zzfskVarM150076m5);
            } catch (Throwable th) {
                try {
                    m140168e(2010, this.f115154g, new Exception(th));
                } finally {
                    m140166c();
                    this.f115152e.quit();
                }
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        try {
            m140168e(4012, this.f115154g, null);
            this.f115151d.put(m140164a());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        try {
            m140168e(4011, this.f115154g, null);
            this.f115151d.put(m140164a());
        } catch (InterruptedException unused) {
        }
    }
}
