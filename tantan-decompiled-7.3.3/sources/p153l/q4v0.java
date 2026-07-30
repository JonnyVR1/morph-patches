package p153l;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.ads.zzbze;
import com.google.android.gms.internal.ads.zzecf;

/* JADX INFO: loaded from: classes6.dex */
public final class q4v0 extends k4v0 {

    /* JADX INFO: renamed from: g */
    public String f155618g;

    /* JADX INFO: renamed from: h */
    public int f155619h = 1;

    public q4v0(Context context) {
        this.f123936f = new l3t0(context, bxy0.m106938v().m213967b(), this, this);
    }

    /* JADX INFO: renamed from: b */
    public final hpr m175260b(zzbze zzbzeVar) {
        synchronized (this.f123932b) {
            try {
                int i = this.f155619h;
                if (i != 1 && i != 2) {
                    return pvw0.m173980g(new zzecf(2));
                }
                if (this.f123933c) {
                    return this.f123931a;
                }
                this.f155619h = 2;
                this.f123933c = true;
                this.f123935e = zzbzeVar;
                this.f123936f.checkAvailabilityAndConnect();
                this.f123931a.addListener(new Runnable() { // from class: l.o4v0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f145013a.m148299a();
                    }
                }, oct0.f146738f);
                return this.f123931a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final hpr m175261c(String str) {
        synchronized (this.f123932b) {
            try {
                int i = this.f155619h;
                if (i != 1 && i != 3) {
                    return pvw0.m173980g(new zzecf(2));
                }
                if (this.f123933c) {
                    return this.f123931a;
                }
                this.f155619h = 3;
                this.f123933c = true;
                this.f155618g = str;
                this.f123936f.checkAvailabilityAndConnect();
                this.f123931a.addListener(new Runnable() { // from class: l.p4v0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f150567a.m148299a();
                    }
                }, oct0.f146738f);
                return this.f123931a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(@Nullable Bundle bundle) {
        synchronized (this.f123932b) {
            try {
                if (!this.f123934d) {
                    this.f123934d = true;
                    try {
                        int i = this.f155619h;
                        if (i == 2) {
                            this.f123936f.m152737c().mo179707q3(this.f123935e, new j4v0(this));
                        } else if (i == 3) {
                            this.f123936f.m152737c().mo179708r1(this.f155618g, new j4v0(this));
                        } else {
                            this.f123931a.m190495c(new zzecf(1));
                        }
                    } catch (RemoteException | IllegalArgumentException unused) {
                        this.f123931a.m190495c(new zzecf(1));
                    } catch (Throwable th) {
                        bxy0.m106933q().m120275w(th, "RemoteUrlAndCacheKeyClientTask.onConnected");
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
