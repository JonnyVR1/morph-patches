package p149l;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzbyi;
import com.google.android.gms.internal.ads.zzecf;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class rxu0 extends uxu0 {

    /* JADX INFO: renamed from: h */
    public zzbyi f161511h;

    public rxu0(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f178764e = context;
        this.f178765f = vny0.m199084v().m185773b();
        this.f178766g = scheduledExecutorService;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized gnr m181647c(zzbyi zzbyiVar, long j) {
        if (this.f178761b) {
            return jmw0.m142242o(this.f178760a, j, TimeUnit.MILLISECONDS, this.f178766g);
        }
        this.f178761b = true;
        this.f161511h = zzbyiVar;
        m196196a();
        gnr gnrVarM142242o = jmw0.m142242o(this.f178760a, j, TimeUnit.MILLISECONDS, this.f178766g);
        gnrVarM142242o.addListener(new Runnable() { // from class: l.qxu0
            @Override // java.lang.Runnable
            public final void run() {
                this.f156874a.m196197b();
            }
        }, i3t0.f111377f);
        return gnrVarM142242o;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final synchronized void onConnected(@Nullable Bundle bundle) {
        if (this.f178762c) {
            return;
        }
        this.f178762c = true;
        try {
            this.f178763d.m133145c().mo171479p5(this.f161511h, new txu0(this));
        } catch (RemoteException unused) {
            this.f178760a.m157775c(new zzecf(1));
        } catch (Throwable th) {
            vny0.m199079q().m212290w(th, "RemoteAdsServiceSignalClientTask.onConnected");
            this.f178760a.m157775c(th);
        }
    }

    @Override // p149l.uxu0, com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        String str = String.format(Locale.US, "Remote ad service connection suspended, cause: %d.", Integer.valueOf(i));
        x2t0.m206864b(str);
        this.f178760a.m157775c(new zzecf(1, str));
    }
}
