package p153l;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.internal.ads.zzcef;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes6.dex */
public final class lcs0 {

    /* JADX INFO: renamed from: a */
    @VisibleForTesting
    public u6s0 f131379a;

    /* JADX INFO: renamed from: b */
    @VisibleForTesting
    public boolean f131380b;

    /* JADX INFO: renamed from: c */
    public final ExecutorService f131381c;

    public lcs0(final Context context) {
        ExecutorService executorService = kbt0.f124977b;
        this.f131381c = executorService;
        executorService.execute(new Runnable() { // from class: l.gcs0
            @Override // java.lang.Runnable
            public final void run() {
                boolean zBooleanValue = ((Boolean) jas0.m144075c().m176505a(sgs0.f168088O4)).booleanValue();
                lcs0 lcs0Var = this.f103601a;
                Context context2 = context;
                if (zBooleanValue) {
                    try {
                        lcs0Var.f131379a = (u6s0) gct0.m129904b(context2, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", new fct0() { // from class: l.hcs0
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // p153l.fct0
                            public final Object zza(Object obj) {
                                return t6s0.m189544o8(obj);
                            }
                        });
                        lcs0Var.f131379a.mo184922A4(h950.m134038Y2(context2), "GMA_SDK");
                        lcs0Var.f131380b = true;
                    } catch (RemoteException | zzcef | NullPointerException unused) {
                        dct0.m115293b("Cannot dynamite load clearcut");
                    }
                }
            }
        });
    }

    public lcs0() {
        this.f131381c = kbt0.f124977b;
    }
}
