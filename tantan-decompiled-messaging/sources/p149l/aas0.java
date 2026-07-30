package p149l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: loaded from: classes6.dex */
public final class aas0 extends jxr0 implements ocs0 {
    public aas0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoadCallback");
    }

    @Override // p149l.ocs0
    /* JADX INFO: renamed from: t0 */
    public final void mo95571t0(zze zzeVar) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152087d(parcelM143822O, zzeVar);
        m143825Y2(2, parcelM143822O);
    }

    @Override // p149l.ocs0
    public final void zzc() throws RemoteException {
        m143825Y2(1, m143822O());
    }
}
