package p153l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class dms0 extends p6s0 implements fms0 {
    public dms0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    @Override // p153l.fms0
    /* JADX INFO: renamed from: O2 */
    public final void mo117022O2(wls0 wls0Var) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180044f(parcelM171038O, wls0Var);
        m171041Y2(1, parcelM171038O);
    }
}
