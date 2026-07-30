package p153l;

import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class vqu0 extends xls0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final String f185400a;

    /* JADX INFO: renamed from: b */
    public final ilu0 f185401b;

    /* JADX INFO: renamed from: c */
    public final ulu0 f185402c;

    public vqu0(@Nullable String str, ilu0 ilu0Var, ulu0 ulu0Var) {
        this.f185400a = str;
        this.f185401b = ilu0Var;
        this.f185402c = ulu0Var;
    }

    @Override // p153l.yls0
    /* JADX INFO: renamed from: F */
    public final void mo202456F(Bundle bundle) throws RemoteException {
        this.f185401b.m140714s(bundle);
    }

    @Override // p153l.yls0
    /* JADX INFO: renamed from: K */
    public final boolean mo202457K(Bundle bundle) throws RemoteException {
        return this.f185401b.m140682F(bundle);
    }

    @Override // p153l.yls0
    /* JADX INFO: renamed from: U4 */
    public final void mo202458U4(Bundle bundle) throws RemoteException {
        this.f185401b.m140709n(bundle);
    }

    @Override // p153l.yls0
    public final Bundle zzb() throws RemoteException {
        return this.f185402c.m196581Q();
    }

    @Override // p153l.yls0
    public final lpu0 zzc() throws RemoteException {
        return this.f185402c.m196587W();
    }

    @Override // p153l.yls0
    public final tks0 zzd() throws RemoteException {
        return this.f185402c.m196589Y();
    }

    @Override // p153l.yls0
    public final als0 zze() throws RemoteException {
        return this.f185402c.m196594b0();
    }

    @Override // p153l.yls0
    public final p1m zzf() throws RemoteException {
        return this.f185402c.m196607i0();
    }

    @Override // p153l.yls0
    public final p1m zzg() throws RemoteException {
        return h950.m134038Y2(this.f185401b);
    }

    @Override // p153l.yls0
    public final String zzh() throws RemoteException {
        return this.f185402c.m196611k0();
    }

    @Override // p153l.yls0
    public final String zzi() throws RemoteException {
        return this.f185402c.m196613l0();
    }

    @Override // p153l.yls0
    public final String zzj() throws RemoteException {
        return this.f185402c.m196615m0();
    }

    @Override // p153l.yls0
    public final String zzk() throws RemoteException {
        return this.f185402c.m196593b();
    }

    @Override // p153l.yls0
    public final String zzl() throws RemoteException {
        return this.f185400a;
    }

    @Override // p153l.yls0
    public final List zzm() throws RemoteException {
        return this.f185402c.m196603g();
    }

    @Override // p153l.yls0
    public final void zzn() throws RemoteException {
        this.f185401b.mo127848b();
    }
}
