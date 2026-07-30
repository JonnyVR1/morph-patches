package p149l;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.ads.zzecf;

/* JADX INFO: loaded from: classes6.dex */
public final class cvu0 extends evu0 {
    public cvu0(Context context) {
        this.f93389f = new fus0(context, vny0.m199084v().m185773b(), this, this);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        synchronized (this.f93385b) {
            try {
                if (!this.f93387d) {
                    this.f93387d = true;
                    try {
                        try {
                            this.f93389f.m123215c().mo151818L3(this.f93388e, new dvu0(this));
                        } catch (RemoteException | IllegalArgumentException unused) {
                            this.f93384a.m157775c(new zzecf(1));
                        }
                    } catch (Throwable th) {
                        vny0.m199079q().m212290w(th, "RemoteAdRequestClientTask.onConnected");
                        this.f93384a.m157775c(new zzecf(1));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p149l.evu0, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        x2t0.m206864b("Cannot connect to remote service, fallback to local instance.");
        this.f93384a.m157775c(new zzecf(1));
    }
}
