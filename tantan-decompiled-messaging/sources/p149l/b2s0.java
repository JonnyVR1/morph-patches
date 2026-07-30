package p149l;

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
public final class b2s0 {

    /* JADX INFO: renamed from: a */
    public ScheduledFuture f72744a = null;

    /* JADX INFO: renamed from: b */
    public final Runnable f72745b = new x1s0(this);

    /* JADX INFO: renamed from: c */
    public final Object f72746c = new Object();

    /* JADX INFO: renamed from: d */
    @Nullable
    public l2s0 f72747d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public Context f72748e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public n2s0 f72749f;

    /* JADX INFO: renamed from: h */
    public static /* bridge */ /* synthetic */ void m100024h(b2s0 b2s0Var) {
        synchronized (b2s0Var.f72746c) {
            try {
                l2s0 l2s0Var = b2s0Var.f72747d;
                if (l2s0Var == null) {
                    return;
                }
                if (l2s0Var.isConnected() || b2s0Var.f72747d.isConnecting()) {
                    b2s0Var.f72747d.disconnect();
                }
                b2s0Var.f72747d = null;
                b2s0Var.f72749f = null;
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final long m100026a(zzbbb zzbbbVar) {
        synchronized (this.f72746c) {
            try {
                if (this.f72749f == null) {
                    return -2L;
                }
                if (this.f72747d.m148304c()) {
                    try {
                        return this.f72749f.m157680m4(zzbbbVar);
                    } catch (RemoteException e) {
                        x2t0.m206867e("Unable to call into cache service.", e);
                    }
                }
                return -2L;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final zzbay m100027b(zzbbb zzbbbVar) {
        synchronized (this.f72746c) {
            if (this.f72749f == null) {
                return new zzbay();
            }
            try {
                boolean zM148304c = this.f72747d.m148304c();
                n2s0 n2s0Var = this.f72749f;
                if (zM148304c) {
                    return n2s0Var.m157679M6(zzbbbVar);
                }
                return n2s0Var.m157681m5(zzbbbVar);
            } catch (RemoteException e) {
                x2t0.m206867e("Unable to call into cache service.", e);
                return new zzbay();
            }
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: d */
    public final synchronized l2s0 m100028d(BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        return new l2s0(this.f72748e, vny0.m199084v().m185773b(), baseConnectionCallbacks, baseOnConnectionFailedListener);
    }

    /* JADX INFO: renamed from: i */
    public final void m100029i(Context context) {
        if (context == null) {
            return;
        }
        synchronized (this.f72746c) {
            try {
                if (this.f72748e != null) {
                    return;
                }
                this.f72748e = context.getApplicationContext();
                if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132226f4)).booleanValue()) {
                    m100031l();
                } else {
                    if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132213e4)).booleanValue()) {
                        vny0.m199066d().m196345c(new y1s0(this));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m100030j() {
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132239g4)).booleanValue()) {
            synchronized (this.f72746c) {
                try {
                    m100031l();
                    ScheduledFuture scheduledFuture = this.f72744a;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f72744a = i3t0.f111375d.schedule(this.f72745b, ((Long) d1s0.m109677c().m144697a(m7s0.f132252h4)).longValue(), TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m100031l() {
        synchronized (this.f72746c) {
            try {
                if (this.f72748e != null && this.f72747d == null) {
                    l2s0 l2s0VarM100028d = m100028d(new z1s0(this), new a2s0(this));
                    this.f72747d = l2s0VarM100028d;
                    l2s0VarM100028d.checkAvailabilityAndConnect();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
