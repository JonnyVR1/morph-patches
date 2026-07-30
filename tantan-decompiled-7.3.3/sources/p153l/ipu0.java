package p153l;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class ipu0 extends jys0 implements wmu0 {
    public ipu0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // p153l.wmu0
    public final void zza(Bundle bundle) throws RemoteException {
        Parcel parcelM147618O = m147618O();
        z0t0.m218155d(parcelM147618O, bundle);
        m147620Y2(1, parcelM147618O);
    }
}
