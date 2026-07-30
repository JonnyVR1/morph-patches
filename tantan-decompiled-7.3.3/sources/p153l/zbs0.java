package p153l;

import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.internal.ads.zzbay;
import com.google.android.gms.internal.ads.zzbbb;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class zbs0 implements BaseGmsClient.BaseConnectionCallbacks {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzbbb f203700a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ tct0 f203701b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bcs0 f203702c;

    public zbs0(bcs0 bcs0Var, zzbbb zzbbbVar, tct0 tct0Var) {
        this.f203700a = zzbbbVar;
        this.f203701b = tct0Var;
        this.f203702c = bcs0Var;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(@Nullable Bundle bundle) {
        synchronized (this.f203702c.f76198d) {
            try {
                bcs0 bcs0Var = this.f203702c;
                if (bcs0Var.f76196b) {
                    return;
                }
                bcs0Var.f76196b = true;
                final rbs0 rbs0Var = this.f203702c.f76195a;
                if (rbs0Var == null) {
                    return;
                }
                xvw0 xvw0Var = oct0.f146733a;
                final zzbbb zzbbbVar = this.f203700a;
                final tct0 tct0Var = this.f203701b;
                final hpr hprVarMo155970a = xvw0Var.mo155970a(new Runnable() { // from class: l.wbs0
                    @Override // java.lang.Runnable
                    public final void run() {
                        zbs0 zbs0Var = this.f188268a;
                        rbs0 rbs0Var2 = rbs0Var;
                        tct0 tct0Var2 = tct0Var;
                        try {
                            tbs0 tbs0VarM180760d = rbs0Var2.m180760d();
                            boolean zM180759c = rbs0Var2.m180759c();
                            zzbbb zzbbbVar2 = zzbbbVar;
                            zzbay zzbayVarM190090M6 = zM180759c ? tbs0VarM180760d.m190090M6(zzbbbVar2) : tbs0VarM180760d.m190092m5(zzbbbVar2);
                            if (!zzbayVarM190090M6.zze()) {
                                tct0Var2.m190495c(new RuntimeException("No entry contents."));
                                bcs0.m103548e(zbs0Var.f203702c);
                                return;
                            }
                            ybs0 ybs0Var = new ybs0(zbs0Var, zzbayVarM190090M6.m13597I(), 1);
                            int i = ybs0Var.read();
                            if (i == -1) {
                                throw new IOException("Unable to read from cache.");
                            }
                            ybs0Var.unread(i);
                            tct0Var2.m190494b(dcs0.m115283b(ybs0Var, zzbayVarM190090M6.zzd(), zzbayVarM190090M6.m13599h0(), zzbayVarM190090M6.m13595F(), zzbayVarM190090M6.m13598J()));
                        } catch (RemoteException e) {
                            e = e;
                            Throwable th = e;
                            dct0.m115296e("Unable to obtain a cache service instance.", th);
                            tct0Var2.m190495c(th);
                            bcs0.m103548e(zbs0Var.f203702c);
                        } catch (IOException e2) {
                            e = e2;
                            Throwable th2 = e;
                            dct0.m115296e("Unable to obtain a cache service instance.", th2);
                            tct0Var2.m190495c(th2);
                            bcs0.m103548e(zbs0Var.f203702c);
                        }
                    }
                });
                final tct0 tct0Var2 = this.f203701b;
                tct0Var2.addListener(new Runnable() { // from class: l.xbs0
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (tct0Var2.isCancelled()) {
                            hprVarMo155970a.cancel(true);
                        }
                    }
                }, oct0.f146738f);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
    }
}
