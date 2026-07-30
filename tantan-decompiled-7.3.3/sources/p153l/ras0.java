package p153l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class ras0 extends p6s0 implements tas0 {
    public ras0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // p153l.tas0
    /* JADX INFO: renamed from: n5 */
    public final void mo174093n5(p1m p1mVar, abs0 abs0Var) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180044f(parcelM171038O, p1mVar);
        r6s0.m180044f(parcelM171038O, abs0Var);
        m171041Y2(4, parcelM171038O);
    }

    @Override // p153l.tas0
    public final tlu0 zzf() throws RemoteException {
        Parcel parcelM171039P2 = m171039P2(5, m171038O());
        tlu0 tlu0VarM158822o8 = mku0.m158822o8(parcelM171039P2.readStrongBinder());
        parcelM171039P2.recycle();
        return tlu0VarM158822o8;
    }
}
