package p153l;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbze;
import com.google.android.gms.internal.ads.zzecf;

/* JADX INFO: loaded from: classes6.dex */
public final class m4v0 extends k4v0 {
    public m4v0(Context context) {
        this.f123936f = new l3t0(context, bxy0.m106938v().m213967b(), this, this);
    }

    /* JADX INFO: renamed from: b */
    public final hpr m157063b(zzbze zzbzeVar) {
        synchronized (this.f123932b) {
            try {
                if (this.f123933c) {
                    return this.f123931a;
                }
                this.f123933c = true;
                this.f123935e = zzbzeVar;
                this.f123936f.checkAvailabilityAndConnect();
                this.f123931a.addListener(new Runnable() { // from class: l.l4v0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f130019a.m148299a();
                    }
                }, oct0.f146738f);
                return this.f123931a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        synchronized (this.f123932b) {
            try {
                if (!this.f123934d) {
                    this.f123934d = true;
                    try {
                        try {
                            this.f123936f.m152737c().mo179706c3(this.f123935e, new j4v0(this));
                        } catch (RemoteException | IllegalArgumentException unused) {
                            this.f123931a.m190495c(new zzecf(1));
                        }
                    } catch (Throwable th) {
                        bxy0.m106933q().m120275w(th, "RemoteSignalsClientTask.onConnected");
                        this.f123931a.m190495c(new zzecf(1));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
