package p153l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class gms0 extends p6s0 implements ims0 {
    public gms0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    @Override // p153l.ims0
    /* JADX INFO: renamed from: i4 */
    public final void mo130830i4(yls0 yls0Var) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180044f(parcelM171038O, yls0Var);
        m171041Y2(1, parcelM171038O);
    }
}
