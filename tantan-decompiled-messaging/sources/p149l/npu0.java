package p149l;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzl;

/* JADX INFO: loaded from: classes6.dex */
public final class npu0 implements xou0 {

    /* JADX INFO: renamed from: a */
    public final long f140004a;

    /* JADX INFO: renamed from: b */
    public final cpu0 f140005b;

    /* JADX INFO: renamed from: c */
    public final bxv0 f140006c;

    public npu0(long j, Context context, cpu0 cpu0Var, xbt0 xbt0Var, String str) {
        this.f140004a = j;
        this.f140005b = cpu0Var;
        dxv0 dxv0VarMo135815z = xbt0Var.mo135815z();
        dxv0VarMo135815z.mo114029a(context);
        dxv0VarMo135815z.zza(str);
        this.f140006c = dxv0VarMo135815z.zzc().zza();
    }

    @Override // p149l.xou0
    /* JADX INFO: renamed from: a */
    public final void mo142759a(zzl zzlVar) {
        try {
            this.f140006c.mo104381s5(zzlVar, new lpu0(this));
        } catch (RemoteException e) {
            x2t0.m206871i("#007 Could not call remote method.", e);
        }
    }

    @Override // p149l.xou0
    public final void zzc() {
        try {
            this.f140006c.mo104377R0(new mpu0(this));
            this.f140006c.mo104379g0(s050.m181848Y2(null));
        } catch (RemoteException e) {
            x2t0.m206871i("#007 Could not call remote method.", e);
        }
    }

    @Override // p149l.xou0
    public final void zza() {
    }
}
