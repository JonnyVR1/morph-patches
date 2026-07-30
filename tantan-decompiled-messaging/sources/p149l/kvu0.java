package p149l;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.ads.zzbze;
import com.google.android.gms.internal.ads.zzecf;

/* JADX INFO: loaded from: classes6.dex */
public final class kvu0 extends evu0 {

    /* JADX INFO: renamed from: g */
    public String f124795g;

    /* JADX INFO: renamed from: h */
    public int f124796h = 1;

    public kvu0(Context context) {
        this.f93389f = new fus0(context, vny0.m199084v().m185773b(), this, this);
    }

    /* JADX INFO: renamed from: b */
    public final gnr m147392b(zzbze zzbzeVar) {
        synchronized (this.f93385b) {
            try {
                int i = this.f124796h;
                if (i != 1 && i != 2) {
                    return jmw0.m142234g(new zzecf(2));
                }
                if (this.f93386c) {
                    return this.f93384a;
                }
                this.f124796h = 2;
                this.f93386c = true;
                this.f93388e = zzbzeVar;
                this.f93389f.checkAvailabilityAndConnect();
                this.f93384a.addListener(new Runnable() { // from class: l.ivu0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f115202a.m118321a();
                    }
                }, i3t0.f111377f);
                return this.f93384a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final gnr m147393c(String str) {
        synchronized (this.f93385b) {
            try {
                int i = this.f124796h;
                if (i != 1 && i != 3) {
                    return jmw0.m142234g(new zzecf(2));
                }
                if (this.f93386c) {
                    return this.f93384a;
                }
                this.f124796h = 3;
                this.f93386c = true;
                this.f124795g = str;
                this.f93389f.checkAvailabilityAndConnect();
                this.f93384a.addListener(new Runnable() { // from class: l.jvu0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f119990a.m118321a();
                    }
                }, i3t0.f111377f);
                return this.f93384a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(@Nullable Bundle bundle) {
        synchronized (this.f93385b) {
            try {
                if (!this.f93387d) {
                    this.f93387d = true;
                    try {
                        int i = this.f124796h;
                        if (i == 2) {
                            this.f93389f.m123215c().mo151820q3(this.f93388e, new dvu0(this));
                        } else if (i == 3) {
                            this.f93389f.m123215c().mo151821r1(this.f124795g, new dvu0(this));
                        } else {
                            this.f93384a.m157775c(new zzecf(1));
                        }
                    } catch (RemoteException | IllegalArgumentException unused) {
                        this.f93384a.m157775c(new zzecf(1));
                    } catch (Throwable th) {
                        vny0.m199079q().m212290w(th, "RemoteUrlAndCacheKeyClientTask.onConnected");
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
