package p149l;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.internal.ads.zzcef;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public final class gns0 {

    /* JADX INFO: renamed from: b */
    public static gns0 f103626b;

    /* JADX INFO: renamed from: a */
    public final AtomicBoolean f103627a = new AtomicBoolean(false);

    @VisibleForTesting
    public gns0() {
    }

    /* JADX INFO: renamed from: a */
    public static gns0 m127186a() {
        if (f103626b == null) {
            f103626b = new gns0();
        }
        return f103626b;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final Thread m127187b(final Context context, @Nullable final String str) {
        if (!this.f103627a.compareAndSet(false, true)) {
            return null;
        }
        Thread thread = new Thread(new Runnable() { // from class: l.fns0
            @Override // java.lang.Runnable
            public final void run() {
                Context context2 = context;
                m7s0.m153417a(context2);
                if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132403t0)).booleanValue()) {
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("measurementEnabled", ((Boolean) d1s0.m109677c().m144697a(m7s0.f132248h0)).booleanValue());
                if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132339o0)).booleanValue()) {
                    bundle.putString("ad_storage", "denied");
                    bundle.putString("analytics_storage", "denied");
                }
                try {
                    ((wbt0) a3t0.m94733b(context2, "com.google.android.gms.ads.measurement.DynamiteMeasurementManager", new z2t0() { // from class: l.ens0
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // p149l.z2t0
                        public final Object zza(Object obj) {
                            return vbt0.m197735o8(obj);
                        }
                    })).mo192935c4(s050.m181848Y2(context2), new dns0(tw0.m190825k(context2, "FA-Ads", "am", str, bundle)));
                } catch (RemoteException | zzcef | NullPointerException e) {
                    x2t0.m206871i("#007 Could not call remote method.", e);
                }
            }
        });
        thread.start();
        return thread;
    }
}
