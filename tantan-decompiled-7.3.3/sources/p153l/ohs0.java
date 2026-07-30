package p153l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class ohs0 extends p6s0 implements yhs0 {
    public ohs0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
    }

    @Override // p153l.yhs0
    /* JADX INFO: renamed from: I2 */
    public final void mo167740I2(nhs0 nhs0Var) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180044f(parcelM171038O, nhs0Var);
        m171041Y2(1, parcelM171038O);
    }
}
