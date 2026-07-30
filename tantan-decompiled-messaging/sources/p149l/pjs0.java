package p149l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: loaded from: classes6.dex */
public final class pjs0 extends jxr0 implements rjs0 {
    public pjs0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
    }

    @Override // p149l.rjs0
    /* JADX INFO: renamed from: S3 */
    public final void mo169932S3(ljs0 ljs0Var) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152089f(parcelM143822O, ljs0Var);
        m143825Y2(1, parcelM143822O);
    }

    @Override // p149l.rjs0
    /* JADX INFO: renamed from: f */
    public final void mo169933f(zze zzeVar) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152087d(parcelM143822O, zzeVar);
        m143825Y2(3, parcelM143822O);
    }

    @Override // p149l.rjs0
    public final void zze(int i) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        parcelM143822O.writeInt(i);
        m143825Y2(2, parcelM143822O);
    }
}
