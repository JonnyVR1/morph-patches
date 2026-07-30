package p149l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: loaded from: classes6.dex */
public final class kys0 extends jxr0 implements mys0 {
    public kys0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    @Override // p149l.mys0
    /* JADX INFO: renamed from: f */
    public final void mo104644f(zze zzeVar) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152087d(parcelM143822O, zzeVar);
        m143825Y2(3, parcelM143822O);
    }

    @Override // p149l.mys0
    public final void zze(int i) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        parcelM143822O.writeInt(i);
        m143825Y2(2, parcelM143822O);
    }

    @Override // p149l.mys0
    public final void zzg() throws RemoteException {
        m143825Y2(1, m143822O());
    }
}
