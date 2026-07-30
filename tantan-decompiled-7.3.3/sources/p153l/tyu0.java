package p153l;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzl;

/* JADX INFO: loaded from: classes6.dex */
public final class tyu0 implements dyu0 {

    /* JADX INFO: renamed from: a */
    public final long f176705a;

    /* JADX INFO: renamed from: b */
    public final iyu0 f176706b;

    /* JADX INFO: renamed from: c */
    public final h6w0 f176707c;

    public tyu0(long j, Context context, iyu0 iyu0Var, dlt0 dlt0Var, String str) {
        this.f176705a = j;
        this.f176706b = iyu0Var;
        j6w0 j6w0VarMo116892z = dlt0Var.mo116892z();
        j6w0VarMo116892z.mo143723a(context);
        j6w0VarMo116892z.zza(str);
        this.f176707c = j6w0VarMo116892z.zzc().zza();
    }

    @Override // p153l.dyu0
    /* JADX INFO: renamed from: a */
    public final void mo118725a(zzl zzlVar) {
        try {
            this.f176707c.mo133748s5(zzlVar, new ryu0(this));
        } catch (RemoteException e) {
            dct0.m115300i("#007 Could not call remote method.", e);
        }
    }

    @Override // p153l.dyu0
    public final void zzc() {
        try {
            this.f176707c.mo133744R0(new syu0(this));
            this.f176707c.mo133746g0(h950.m134038Y2(null));
        } catch (RemoteException e) {
            dct0.m115300i("#007 Could not call remote method.", e);
        }
    }

    @Override // p153l.dyu0
    public final void zza() {
    }
}
