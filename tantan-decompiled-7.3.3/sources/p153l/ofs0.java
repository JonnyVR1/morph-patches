package p153l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: loaded from: classes6.dex */
public final class ofs0 extends p6s0 implements xhs0 {
    public ofs0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // p153l.xhs0
    /* JADX INFO: renamed from: f */
    public final void mo127000f(zze zzeVar) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180042d(parcelM171038O, zzeVar);
        m171041Y2(8, parcelM171038O);
    }

    @Override // p153l.xhs0
    public final void zzc() throws RemoteException {
        m171041Y2(6, m171038O());
    }

    @Override // p153l.xhs0
    public final void zzd() throws RemoteException {
        m171041Y2(1, m171038O());
    }

    @Override // p153l.xhs0
    public final void zze(int i) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        parcelM171038O.writeInt(i);
        m171041Y2(2, parcelM171038O);
    }

    @Override // p153l.xhs0
    public final void zzg() throws RemoteException {
        m171041Y2(7, m171038O());
    }

    @Override // p153l.xhs0
    public final void zzh() throws RemoteException {
        m171041Y2(3, m171038O());
    }

    @Override // p153l.xhs0
    public final void zzi() throws RemoteException {
        m171041Y2(4, m171038O());
    }

    @Override // p153l.xhs0
    public final void zzj() throws RemoteException {
        m171041Y2(5, m171038O());
    }

    @Override // p153l.xhs0
    public final void zzk() throws RemoteException {
        m171041Y2(9, m171038O());
    }
}
