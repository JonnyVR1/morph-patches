package p149l;

import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class phu0 extends rcs0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final String f149054a;

    /* JADX INFO: renamed from: b */
    public final ccu0 f149055b;

    /* JADX INFO: renamed from: c */
    public final ocu0 f149056c;

    public phu0(@Nullable String str, ccu0 ccu0Var, ocu0 ocu0Var) {
        this.f149054a = str;
        this.f149055b = ccu0Var;
        this.f149056c = ocu0Var;
    }

    @Override // p149l.scs0
    /* JADX INFO: renamed from: F */
    public final void mo169150F(Bundle bundle) throws RemoteException {
        this.f149055b.m106193s(bundle);
    }

    @Override // p149l.scs0
    /* JADX INFO: renamed from: K */
    public final boolean mo169151K(Bundle bundle) throws RemoteException {
        return this.f149055b.m106160F(bundle);
    }

    @Override // p149l.scs0
    /* JADX INFO: renamed from: U4 */
    public final void mo169152U4(Bundle bundle) throws RemoteException {
        this.f149055b.m106188n(bundle);
    }

    @Override // p149l.scs0
    public final Bundle zzb() throws RemoteException {
        return this.f149056c.m163574Q();
    }

    @Override // p149l.scs0
    public final fgu0 zzc() throws RemoteException {
        return this.f149056c.m163580W();
    }

    @Override // p149l.scs0
    public final nbs0 zzd() throws RemoteException {
        return this.f149056c.m163582Y();
    }

    @Override // p149l.scs0
    public final ubs0 zze() throws RemoteException {
        return this.f149056c.m163587b0();
    }

    @Override // p149l.scs0
    public final uyl zzf() throws RemoteException {
        return this.f149056c.m163600i0();
    }

    @Override // p149l.scs0
    public final uyl zzg() throws RemoteException {
        return s050.m181848Y2(this.f149055b);
    }

    @Override // p149l.scs0
    public final String zzh() throws RemoteException {
        return this.f149056c.m163604k0();
    }

    @Override // p149l.scs0
    public final String zzi() throws RemoteException {
        return this.f149056c.m163606l0();
    }

    @Override // p149l.scs0
    public final String zzj() throws RemoteException {
        return this.f149056c.m163608m0();
    }

    @Override // p149l.scs0
    public final String zzk() throws RemoteException {
        return this.f149056c.m163586b();
    }

    @Override // p149l.scs0
    public final String zzl() throws RemoteException {
        return this.f149054a;
    }

    @Override // p149l.scs0
    public final List zzm() throws RemoteException {
        return this.f149056c.m163596g();
    }

    @Override // p149l.scs0
    public final void zzn() throws RemoteException {
        this.f149055b.mo106177b();
    }
}
