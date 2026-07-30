package p149l;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzbym;
import com.google.android.gms.internal.ads.zzecf;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class oxu0 extends uxu0 {

    /* JADX INFO: renamed from: h */
    public zzbym f146252h;

    public oxu0(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f178764e = context;
        this.f178765f = vny0.m199084v().m185773b();
        this.f178766g = scheduledExecutorService;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized gnr m166598c(zzbym zzbymVar, long j) {
        if (this.f178761b) {
            return jmw0.m142242o(this.f178760a, j, TimeUnit.MILLISECONDS, this.f178766g);
        }
        this.f178761b = true;
        this.f146252h = zzbymVar;
        m196196a();
        gnr gnrVarM142242o = jmw0.m142242o(this.f178760a, j, TimeUnit.MILLISECONDS, this.f178766g);
        gnrVarM142242o.addListener(new Runnable() { // from class: l.nxu0
            @Override // java.lang.Runnable
            public final void run() {
                this.f141052a.m196197b();
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
            this.f178763d.m133145c().mo171478k2(this.f146252h, new txu0(this));
        } catch (RemoteException unused) {
            this.f178760a.m157775c(new zzecf(1));
        } catch (Throwable th) {
            vny0.m199079q().m212290w(th, "RemoteAdsServiceProxyClientTask.onConnected");
            this.f178760a.m157775c(th);
        }
    }
}
