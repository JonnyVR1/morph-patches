package p149l;

import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.internal.ads.zzbay;
import com.google.android.gms.internal.ads.zzbbb;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class t2s0 implements BaseGmsClient.BaseConnectionCallbacks {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzbbb f167546a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ n3t0 f167547b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ v2s0 f167548c;

    public t2s0(v2s0 v2s0Var, zzbbb zzbbbVar, n3t0 n3t0Var) {
        this.f167546a = zzbbbVar;
        this.f167547b = n3t0Var;
        this.f167548c = v2s0Var;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(@Nullable Bundle bundle) {
        synchronized (this.f167548c.f179606d) {
            try {
                v2s0 v2s0Var = this.f167548c;
                if (v2s0Var.f179604b) {
                    return;
                }
                v2s0Var.f179604b = true;
                final l2s0 l2s0Var = this.f167548c.f179603a;
                if (l2s0Var == null) {
                    return;
                }
                rmw0 rmw0Var = i3t0.f111372a;
                final zzbbb zzbbbVar = this.f167546a;
                final n3t0 n3t0Var = this.f167547b;
                final gnr gnrVarMo122103a = rmw0Var.mo122103a(new Runnable() { // from class: l.q2s0
                    @Override // java.lang.Runnable
                    public final void run() {
                        t2s0 t2s0Var = this.f152303a;
                        l2s0 l2s0Var2 = l2s0Var;
                        n3t0 n3t0Var2 = n3t0Var;
                        try {
                            n2s0 n2s0VarM148305d = l2s0Var2.m148305d();
                            boolean zM148304c = l2s0Var2.m148304c();
                            zzbbb zzbbbVar2 = zzbbbVar;
                            zzbay zzbayVarM157679M6 = zM148304c ? n2s0VarM148305d.m157679M6(zzbbbVar2) : n2s0VarM148305d.m157681m5(zzbbbVar2);
                            if (!zzbayVarM157679M6.zze()) {
                                n3t0Var2.m157775c(new RuntimeException("No entry contents."));
                                v2s0.m196819e(t2s0Var.f167548c);
                                return;
                            }
                            s2s0 s2s0Var = new s2s0(t2s0Var, zzbayVarM157679M6.m13543I(), 1);
                            int i = s2s0Var.read();
                            if (i == -1) {
                                throw new IOException("Unable to read from cache.");
                            }
                            s2s0Var.unread(i);
                            n3t0Var2.m157774b(x2s0.m206857b(s2s0Var, zzbayVarM157679M6.zzd(), zzbayVarM157679M6.m13545g0(), zzbayVarM157679M6.m13541F(), zzbayVarM157679M6.m13544J()));
                        } catch (RemoteException e) {
                            e = e;
                            Throwable th = e;
                            x2t0.m206867e("Unable to obtain a cache service instance.", th);
                            n3t0Var2.m157775c(th);
                            v2s0.m196819e(t2s0Var.f167548c);
                        } catch (IOException e2) {
                            e = e2;
                            Throwable th2 = e;
                            x2t0.m206867e("Unable to obtain a cache service instance.", th2);
                            n3t0Var2.m157775c(th2);
                            v2s0.m196819e(t2s0Var.f167548c);
                        }
                    }
                });
                final n3t0 n3t0Var2 = this.f167547b;
                n3t0Var2.addListener(new Runnable() { // from class: l.r2s0
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (n3t0Var2.isCancelled()) {
                            gnrVarMo122103a.cancel(true);
                        }
                    }
                }, i3t0.f111377f);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
    }
}
