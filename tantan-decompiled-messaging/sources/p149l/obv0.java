package p149l;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzl;

/* JADX INFO: loaded from: classes6.dex */
public final class obv0 extends efs0 {

    /* JADX INFO: renamed from: a */
    public final bdv0 f142985a;

    public obv0(Context context, xbt0 xbt0Var, gyv0 gyv0Var, zcu0 zcu0Var, r8s0 r8s0Var) {
        ddv0 ddv0Var = new ddv0(zcu0Var, xbt0Var.mo135791C());
        ddv0Var.m111084e(r8s0Var);
        this.f142985a = new bdv0(new tdv0(xbt0Var, context, ddv0Var, gyv0Var), gyv0Var.m128773i());
    }

    @Override // p149l.fgs0
    /* JADX INFO: renamed from: l3 */
    public final void mo101747l3(zzl zzlVar) throws RemoteException {
        this.f142985a.m101296d(zzlVar, 1);
    }

    @Override // p149l.fgs0
    /* JADX INFO: renamed from: p2 */
    public final synchronized void mo101748p2(zzl zzlVar, int i) throws RemoteException {
        this.f142985a.m101296d(zzlVar, i);
    }

    @Override // p149l.fgs0
    public final synchronized String zze() {
        return this.f142985a.m101294a();
    }

    @Override // p149l.fgs0
    public final synchronized String zzf() {
        return this.f142985a.m101295b();
    }

    @Override // p149l.fgs0
    public final synchronized boolean zzi() throws RemoteException {
        return this.f142985a.m101297e();
    }
}
