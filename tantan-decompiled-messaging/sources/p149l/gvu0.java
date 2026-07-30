package p149l;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbze;
import com.google.android.gms.internal.ads.zzecf;

/* JADX INFO: loaded from: classes6.dex */
public final class gvu0 extends evu0 {
    public gvu0(Context context) {
        this.f93389f = new fus0(context, vny0.m199084v().m185773b(), this, this);
    }

    /* JADX INFO: renamed from: b */
    public final gnr m128294b(zzbze zzbzeVar) {
        synchronized (this.f93385b) {
            try {
                if (this.f93386c) {
                    return this.f93384a;
                }
                this.f93386c = true;
                this.f93388e = zzbzeVar;
                this.f93389f.checkAvailabilityAndConnect();
                this.f93384a.addListener(new Runnable() { // from class: l.fvu0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f99474a.m118321a();
                    }
                }, i3t0.f111377f);
                return this.f93384a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        synchronized (this.f93385b) {
            try {
                if (!this.f93387d) {
                    this.f93387d = true;
                    try {
                        try {
                            this.f93389f.m123215c().mo151819c3(this.f93388e, new dvu0(this));
                        } catch (RemoteException | IllegalArgumentException unused) {
                            this.f93384a.m157775c(new zzecf(1));
                        }
                    } catch (Throwable th) {
                        vny0.m199079q().m212290w(th, "RemoteSignalsClientTask.onConnected");
                        this.f93384a.m157775c(new zzecf(1));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
