package p153l;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.ads.zzecf;

/* JADX INFO: loaded from: classes6.dex */
public final class i4v0 extends k4v0 {
    public i4v0(Context context) {
        this.f123936f = new l3t0(context, bxy0.m106938v().m213967b(), this, this);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        synchronized (this.f123932b) {
            try {
                if (!this.f123934d) {
                    this.f123934d = true;
                    try {
                        try {
                            this.f123936f.m152737c().mo179705L3(this.f123935e, new j4v0(this));
                        } catch (RemoteException | IllegalArgumentException unused) {
                            this.f123931a.m190495c(new zzecf(1));
                        }
                    } catch (Throwable th) {
                        bxy0.m106933q().m120275w(th, "RemoteAdRequestClientTask.onConnected");
                        this.f123931a.m190495c(new zzecf(1));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p153l.k4v0, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        dct0.m115293b("Cannot connect to remote service, fallback to local instance.");
        this.f123931a.m190495c(new zzecf(1));
    }
}
