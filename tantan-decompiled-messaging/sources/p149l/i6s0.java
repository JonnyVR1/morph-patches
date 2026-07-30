package p149l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: loaded from: classes6.dex */
public final class i6s0 extends jxr0 implements r8s0 {
    public i6s0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // p149l.r8s0
    /* JADX INFO: renamed from: f */
    public final void mo134665f(zze zzeVar) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152087d(parcelM143822O, zzeVar);
        m143825Y2(8, parcelM143822O);
    }

    @Override // p149l.r8s0
    public final void zzc() throws RemoteException {
        m143825Y2(6, m143822O());
    }

    @Override // p149l.r8s0
    public final void zzd() throws RemoteException {
        m143825Y2(1, m143822O());
    }

    @Override // p149l.r8s0
    public final void zze(int i) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        parcelM143822O.writeInt(i);
        m143825Y2(2, parcelM143822O);
    }

    @Override // p149l.r8s0
    public final void zzg() throws RemoteException {
        m143825Y2(7, m143822O());
    }

    @Override // p149l.r8s0
    public final void zzh() throws RemoteException {
        m143825Y2(3, m143822O());
    }

    @Override // p149l.r8s0
    public final void zzi() throws RemoteException {
        m143825Y2(4, m143822O());
    }

    @Override // p149l.r8s0
    public final void zzj() throws RemoteException {
        m143825Y2(5, m143822O());
    }

    @Override // p149l.r8s0
    public final void zzk() throws RemoteException {
        m143825Y2(9, m143822O());
    }
}
