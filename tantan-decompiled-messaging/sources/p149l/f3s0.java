package p149l;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.internal.ads.zzcef;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes6.dex */
public final class f3s0 {

    /* JADX INFO: renamed from: a */
    @VisibleForTesting
    public oxr0 f94714a;

    /* JADX INFO: renamed from: b */
    @VisibleForTesting
    public boolean f94715b;

    /* JADX INFO: renamed from: c */
    public final ExecutorService f94716c;

    public f3s0(final Context context) {
        ExecutorService executorService = e2t0.f88943b;
        this.f94716c = executorService;
        executorService.execute(new Runnable() { // from class: l.a3s0
            @Override // java.lang.Runnable
            public final void run() {
                boolean zBooleanValue = ((Boolean) d1s0.m109677c().m144697a(m7s0.f132017O4)).booleanValue();
                f3s0 f3s0Var = this.f67411a;
                Context context2 = context;
                if (zBooleanValue) {
                    try {
                        f3s0Var.f94714a = (oxr0) a3t0.m94733b(context2, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", new z2t0() { // from class: l.b3s0
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // p149l.z2t0
                            public final Object zza(Object obj) {
                                return nxr0.m161950o8(obj);
                            }
                        });
                        f3s0Var.f94714a.mo156921A4(s050.m181848Y2(context2), "GMA_SDK");
                        f3s0Var.f94715b = true;
                    } catch (RemoteException | zzcef | NullPointerException unused) {
                        x2t0.m206864b("Cannot dynamite load clearcut");
                    }
                }
            }
        });
    }

    public f3s0() {
        this.f94716c = e2t0.f88943b;
    }
}
