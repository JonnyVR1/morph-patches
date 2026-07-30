package p149l;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class cgu0 extends dps0 implements qdu0 {
    public cgu0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // p149l.qdu0
    public final void zza(Bundle bundle) throws RemoteException {
        Parcel parcelM112927O = m112927O();
        trs0.m190431d(parcelM112927O, bundle);
        m112929Y2(1, parcelM112927O);
    }
}
