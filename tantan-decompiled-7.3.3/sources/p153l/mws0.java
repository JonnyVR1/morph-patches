package p153l;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.internal.ads.zzcef;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public final class mws0 {

    /* JADX INFO: renamed from: b */
    public static mws0 f139156b;

    /* JADX INFO: renamed from: a */
    public final AtomicBoolean f139157a = new AtomicBoolean(false);

    @VisibleForTesting
    public mws0() {
    }

    /* JADX INFO: renamed from: a */
    public static mws0 m160595a() {
        if (f139156b == null) {
            f139156b = new mws0();
        }
        return f139156b;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final Thread m160596b(final Context context, @Nullable final String str) {
        if (!this.f139157a.compareAndSet(false, true)) {
            return null;
        }
        Thread thread = new Thread(new Runnable() { // from class: l.lws0
            @Override // java.lang.Runnable
            public final void run() {
                Context context2 = context;
                sgs0.m185829a(context2);
                if (((Boolean) jas0.m144075c().m176505a(sgs0.f168474t0)).booleanValue()) {
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("measurementEnabled", ((Boolean) jas0.m144075c().m176505a(sgs0.f168319h0)).booleanValue());
                if (((Boolean) jas0.m144075c().m176505a(sgs0.f168410o0)).booleanValue()) {
                    bundle.putString("ad_storage", "denied");
                    bundle.putString("analytics_storage", "denied");
                }
                try {
                    ((clt0) gct0.m129904b(context2, "com.google.android.gms.ads.measurement.DynamiteMeasurementManager", new fct0() { // from class: l.kws0
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // p153l.fct0
                        public final Object zza(Object obj) {
                            return blt0.m104933o8(obj);
                        }
                    })).mo98722c4(h950.m134038Y2(context2), new jws0(ax0.m100723k(context2, "FA-Ads", "am", str, bundle)));
                } catch (RemoteException | zzcef | NullPointerException e) {
                    dct0.m115300i("#007 Could not call remote method.", e);
                }
            }
        });
        thread.start();
        return thread;
    }
}
