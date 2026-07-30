package p149l;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class hhu0 extends dps0 implements weu0 {
    public hhu0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // p149l.weu0
    /* JADX INFO: renamed from: G3 */
    public final void mo131149G3(String str, String str2, Bundle bundle, long j) throws RemoteException {
        Parcel parcelM112927O = m112927O();
        parcelM112927O.writeString(str);
        parcelM112927O.writeString(str2);
        trs0.m190431d(parcelM112927O, bundle);
        parcelM112927O.writeLong(j);
        m112929Y2(1, parcelM112927O);
    }

    @Override // p149l.weu0
    public final int zza() throws RemoteException {
        Parcel parcelM112928P2 = m112928P2(2, m112927O());
        int i = parcelM112928P2.readInt();
        parcelM112928P2.recycle();
        return i;
    }
}
