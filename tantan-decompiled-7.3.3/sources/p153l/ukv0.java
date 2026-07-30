package p153l;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzl;

/* JADX INFO: loaded from: classes6.dex */
public final class ukv0 extends kos0 {

    /* JADX INFO: renamed from: a */
    public final hmv0 f179461a;

    public ukv0(Context context, dlt0 dlt0Var, m7w0 m7w0Var, fmu0 fmu0Var, xhs0 xhs0Var) {
        jmv0 jmv0Var = new jmv0(fmu0Var, dlt0Var.mo116868C());
        jmv0Var.m146175e(xhs0Var);
        this.f179461a = new hmv0(new zmv0(dlt0Var, context, jmv0Var, m7w0Var), m7w0Var.m157330i());
    }

    @Override // p153l.lps0
    /* JADX INFO: renamed from: l3 */
    public final void mo136584l3(zzl zzlVar) throws RemoteException {
        this.f179461a.m136005d(zzlVar, 1);
    }

    @Override // p153l.lps0
    /* JADX INFO: renamed from: p2 */
    public final synchronized void mo136585p2(zzl zzlVar, int i) throws RemoteException {
        this.f179461a.m136005d(zzlVar, i);
    }

    @Override // p153l.lps0
    public final synchronized String zze() {
        return this.f179461a.m136003a();
    }

    @Override // p153l.lps0
    public final synchronized String zzf() {
        return this.f179461a.m136004b();
    }

    @Override // p153l.lps0
    public final synchronized boolean zzi() throws RemoteException {
        return this.f179461a.m136006e();
    }
}
