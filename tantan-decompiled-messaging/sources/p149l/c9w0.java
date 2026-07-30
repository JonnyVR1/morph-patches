package p149l;

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
public final class c9w0 implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {

    /* JADX INFO: renamed from: a */
    @VisibleForTesting
    public final w9w0 f79980a;

    /* JADX INFO: renamed from: b */
    public final String f79981b;

    /* JADX INFO: renamed from: c */
    public final String f79982c;

    /* JADX INFO: renamed from: d */
    public final LinkedBlockingQueue f79983d;

    /* JADX INFO: renamed from: e */
    public final HandlerThread f79984e;

    /* JADX INFO: renamed from: f */
    public final p8w0 f79985f;

    /* JADX INFO: renamed from: g */
    public final long f79986g;

    /* JADX INFO: renamed from: h */
    public final int f79987h;

    public c9w0(Context context, int i, int i2, String str, String str2, String str3, p8w0 p8w0Var) {
        this.f79981b = str;
        this.f79987h = i2;
        this.f79982c = str2;
        this.f79985f = p8w0Var;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.f79984e = handlerThread;
        handlerThread.start();
        this.f79986g = System.currentTimeMillis();
        w9w0 w9w0Var = new w9w0(context, handlerThread.getLooper(), this, this, 19621000);
        this.f79980a = w9w0Var;
        this.f79983d = new LinkedBlockingQueue();
        w9w0Var.checkAvailabilityAndConnect();
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: a */
    public static zzfsk m105908a() {
        return new zzfsk(null, 1);
    }

    /* JADX INFO: renamed from: b */
    public final zzfsk m105909b(int i) {
        zzfsk zzfskVar;
        try {
            zzfskVar = (zzfsk) this.f79983d.poll(50000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            m105912e(2009, this.f79986g, e);
            zzfskVar = null;
        }
        m105912e(3004, this.f79986g, null);
        if (zzfskVar != null) {
            if (zzfskVar.zzc == 7) {
                p8w0.m167825g(3);
            } else {
                p8w0.m167825g(2);
            }
        }
        return zzfskVar == null ? m105908a() : zzfskVar;
    }

    /* JADX INFO: renamed from: c */
    public final void m105910c() {
        w9w0 w9w0Var = this.f79980a;
        if (w9w0Var != null) {
            if (w9w0Var.isConnected() || this.f79980a.isConnecting()) {
                this.f79980a.disconnect();
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final eaw0 m105911d() {
        try {
            return this.f79980a.m202354c();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m105912e(int i, long j, Exception exc) {
        this.f79985f.m167827c(i, System.currentTimeMillis() - j, exc);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        eaw0 eaw0VarM105911d = m105911d();
        if (eaw0VarM105911d != null) {
            try {
                zzfsk zzfskVarM115439m5 = eaw0VarM105911d.m115439m5(new zzfsi(1, this.f79987h, this.f79981b, this.f79982c));
                m105912e(5011, this.f79986g, null);
                this.f79983d.put(zzfskVarM115439m5);
            } catch (Throwable th) {
                try {
                    m105912e(2010, this.f79986g, new Exception(th));
                } finally {
                    m105910c();
                    this.f79984e.quit();
                }
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        try {
            m105912e(4012, this.f79986g, null);
            this.f79983d.put(m105908a());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        try {
            m105912e(4011, this.f79986g, null);
            this.f79983d.put(m105908a());
        } catch (InterruptedException unused) {
        }
    }
}
