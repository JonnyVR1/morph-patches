package p153l;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class z9t0 extends p6s0 implements bat0 {
    public z9t0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    @Override // p153l.bat0
    /* JADX INFO: renamed from: R4 */
    public final void mo103232R4(String str, String str2, Bundle bundle) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        parcelM171038O.writeString(str);
        parcelM171038O.writeString(str2);
        r6s0.m180042d(parcelM171038O, bundle);
        m171041Y2(3, parcelM171038O);
    }

    @Override // p153l.bat0
    public final void zzb(String str) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        parcelM171038O.writeString(str);
        m171041Y2(2, parcelM171038O);
    }
}
