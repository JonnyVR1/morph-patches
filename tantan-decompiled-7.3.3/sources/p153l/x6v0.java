package p153l;

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
public final class x6v0 extends a7v0 {

    /* JADX INFO: renamed from: h */
    public zzbyi f192642h;

    public x6v0(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f68848e = context;
        this.f68849f = bxy0.m106938v().m213967b();
        this.f68850g = scheduledExecutorService;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized hpr m209558c(zzbyi zzbyiVar, long j) {
        if (this.f68845b) {
            return pvw0.m173988o(this.f68844a, j, TimeUnit.MILLISECONDS, this.f68850g);
        }
        this.f68845b = true;
        this.f192642h = zzbyiVar;
        m96385a();
        hpr hprVarM173988o = pvw0.m173988o(this.f68844a, j, TimeUnit.MILLISECONDS, this.f68850g);
        hprVarM173988o.addListener(new Runnable() { // from class: l.w6v0
            @Override // java.lang.Runnable
            public final void run() {
                this.f187657a.m96386b();
            }
        }, oct0.f146738f);
        return hprVarM173988o;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final synchronized void onConnected(@Nullable Bundle bundle) {
        if (this.f68846c) {
            return;
        }
        this.f68846c = true;
        try {
            this.f68847d.m161354c().mo119835p5(this.f192642h, new z6v0(this));
        } catch (RemoteException unused) {
            this.f68844a.m190495c(new zzecf(1));
        } catch (Throwable th) {
            bxy0.m106933q().m120275w(th, "RemoteAdsServiceSignalClientTask.onConnected");
            this.f68844a.m190495c(th);
        }
    }

    @Override // p153l.a7v0, com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        String str = String.format(Locale.US, "Remote ad service connection suspended, cause: %d.", Integer.valueOf(i));
        dct0.m115293b(str);
        this.f68844a.m190495c(new zzecf(1, str));
    }
}
