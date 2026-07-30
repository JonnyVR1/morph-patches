package p153l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class tms0 extends p6s0 implements fns0 {
    public tms0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    @Override // p153l.fns0
    /* JADX INFO: renamed from: w3 */
    public final void mo126378w3(nns0 nns0Var) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180044f(parcelM171038O, nns0Var);
        m171041Y2(1, parcelM171038O);
    }
}
