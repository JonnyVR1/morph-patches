package p149l;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class t0t0 extends jxr0 implements v0t0 {
    public t0t0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    @Override // p149l.v0t0
    /* JADX INFO: renamed from: R4 */
    public final void mo147220R4(String str, String str2, Bundle bundle) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        parcelM143822O.writeString(str);
        parcelM143822O.writeString(str2);
        lxr0.m152087d(parcelM143822O, bundle);
        m143825Y2(3, parcelM143822O);
    }

    @Override // p149l.v0t0
    public final void zzb(String str) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        parcelM143822O.writeString(str);
        m143825Y2(2, parcelM143822O);
    }
}
