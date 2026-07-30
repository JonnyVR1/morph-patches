package p149l;

import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class nhu0 extends pcs0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final String f139036a;

    /* JADX INFO: renamed from: b */
    public final ccu0 f139037b;

    /* JADX INFO: renamed from: c */
    public final ocu0 f139038c;

    public nhu0(@Nullable String str, ccu0 ccu0Var, ocu0 ocu0Var) {
        this.f139036a = str;
        this.f139037b = ccu0Var;
        this.f139038c = ocu0Var;
    }

    @Override // p149l.qcs0
    /* JADX INFO: renamed from: K */
    public final void mo159455K(Bundle bundle) throws RemoteException {
        this.f139037b.m106188n(bundle);
    }

    @Override // p149l.qcs0
    /* JADX INFO: renamed from: v0 */
    public final boolean mo159456v0(Bundle bundle) throws RemoteException {
        return this.f139037b.m106160F(bundle);
    }

    @Override // p149l.qcs0
    /* JADX INFO: renamed from: w0 */
    public final void mo159457w0(Bundle bundle) throws RemoteException {
        this.f139037b.m106193s(bundle);
    }

    @Override // p149l.qcs0
    public final double zzb() throws RemoteException {
        return this.f139038c.m163565A();
    }

    @Override // p149l.qcs0
    public final Bundle zzc() throws RemoteException {
        return this.f139038c.m163574Q();
    }

    @Override // p149l.qcs0
    public final fgu0 zzd() throws RemoteException {
        return this.f139038c.m163580W();
    }

    @Override // p149l.qcs0
    public final nbs0 zze() throws RemoteException {
        return this.f139038c.m163582Y();
    }

    @Override // p149l.qcs0
    public final ubs0 zzf() throws RemoteException {
        return this.f139038c.m163585a0();
    }

    @Override // p149l.qcs0
    public final uyl zzg() throws RemoteException {
        return this.f139038c.m163600i0();
    }

    @Override // p149l.qcs0
    public final uyl zzh() throws RemoteException {
        return s050.m181848Y2(this.f139037b);
    }

    @Override // p149l.qcs0
    public final String zzi() throws RemoteException {
        return this.f139038c.m163606l0();
    }

    @Override // p149l.qcs0
    public final String zzj() throws RemoteException {
        return this.f139038c.m163608m0();
    }

    @Override // p149l.qcs0
    public final String zzk() throws RemoteException {
        return this.f139038c.m163586b();
    }

    @Override // p149l.qcs0
    public final String zzl() throws RemoteException {
        return this.f139036a;
    }

    @Override // p149l.qcs0
    public final String zzm() throws RemoteException {
        return this.f139038c.m163590d();
    }

    @Override // p149l.qcs0
    public final String zzn() throws RemoteException {
        return this.f139038c.m163592e();
    }

    @Override // p149l.qcs0
    public final List zzo() throws RemoteException {
        return this.f139038c.m163596g();
    }

    @Override // p149l.qcs0
    public final void zzp() throws RemoteException {
        this.f139037b.mo106177b();
    }
}
