package p153l;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.internal.ads.zzbay;
import com.google.android.gms.internal.ads.zzbbb;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class hbs0 {

    /* JADX INFO: renamed from: a */
    public ScheduledFuture f108643a = null;

    /* JADX INFO: renamed from: b */
    public final Runnable f108644b = new dbs0(this);

    /* JADX INFO: renamed from: c */
    public final Object f108645c = new Object();

    /* JADX INFO: renamed from: d */
    @Nullable
    public rbs0 f108646d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public Context f108647e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public tbs0 f108648f;

    /* JADX INFO: renamed from: h */
    public static /* bridge */ /* synthetic */ void m134419h(hbs0 hbs0Var) {
        synchronized (hbs0Var.f108645c) {
            try {
                rbs0 rbs0Var = hbs0Var.f108646d;
                if (rbs0Var == null) {
                    return;
                }
                if (rbs0Var.isConnected() || hbs0Var.f108646d.isConnecting()) {
                    hbs0Var.f108646d.disconnect();
                }
                hbs0Var.f108646d = null;
                hbs0Var.f108648f = null;
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final long m134421a(zzbbb zzbbbVar) {
        synchronized (this.f108645c) {
            try {
                if (this.f108648f == null) {
                    return -2L;
                }
                if (this.f108646d.m180759c()) {
                    try {
                        return this.f108648f.m190091m4(zzbbbVar);
                    } catch (RemoteException e) {
                        dct0.m115296e("Unable to call into cache service.", e);
                    }
                }
                return -2L;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final zzbay m134422b(zzbbb zzbbbVar) {
        synchronized (this.f108645c) {
            if (this.f108648f == null) {
                return new zzbay();
            }
            try {
                boolean zM180759c = this.f108646d.m180759c();
                tbs0 tbs0Var = this.f108648f;
                if (zM180759c) {
                    return tbs0Var.m190090M6(zzbbbVar);
                }
                return tbs0Var.m190092m5(zzbbbVar);
            } catch (RemoteException e) {
                dct0.m115296e("Unable to call into cache service.", e);
                return new zzbay();
            }
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: d */
    public final synchronized rbs0 m134423d(BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        return new rbs0(this.f108647e, bxy0.m106938v().m213967b(), baseConnectionCallbacks, baseOnConnectionFailedListener);
    }

    /* JADX INFO: renamed from: i */
    public final void m134424i(Context context) {
        if (context == null) {
            return;
        }
        synchronized (this.f108645c) {
            try {
                if (this.f108647e != null) {
                    return;
                }
                this.f108647e = context.getApplicationContext();
                if (((Boolean) jas0.m144075c().m176505a(sgs0.f168297f4)).booleanValue()) {
                    m134426l();
                } else {
                    if (((Boolean) jas0.m144075c().m176505a(sgs0.f168284e4)).booleanValue()) {
                        bxy0.m106920d().m96485c(new ebs0(this));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m134425j() {
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168310g4)).booleanValue()) {
            synchronized (this.f108645c) {
                try {
                    m134426l();
                    ScheduledFuture scheduledFuture = this.f108643a;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f108643a = oct0.f146736d.schedule(this.f108644b, ((Long) jas0.m144075c().m176505a(sgs0.f168323h4)).longValue(), TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m134426l() {
        synchronized (this.f108645c) {
            try {
                if (this.f108647e != null && this.f108646d == null) {
                    rbs0 rbs0VarM134423d = m134423d(new fbs0(this), new gbs0(this));
                    this.f108646d = rbs0VarM134423d;
                    rbs0VarM134423d.checkAvailabilityAndConnect();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
