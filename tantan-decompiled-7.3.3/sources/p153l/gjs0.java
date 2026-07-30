package p153l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: loaded from: classes6.dex */
public final class gjs0 extends p6s0 implements uls0 {
    public gjs0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoadCallback");
    }

    @Override // p153l.uls0
    /* JADX INFO: renamed from: t0 */
    public final void mo130546t0(zze zzeVar) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180042d(parcelM171038O, zzeVar);
        m171041Y2(2, parcelM171038O);
    }

    @Override // p153l.uls0
    public final void zzc() throws RemoteException {
        m171041Y2(1, m171038O());
    }
}
