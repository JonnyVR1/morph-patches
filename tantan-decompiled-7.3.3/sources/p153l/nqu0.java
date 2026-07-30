package p153l;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class nqu0 extends jys0 implements cou0 {
    public nqu0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // p153l.cou0
    /* JADX INFO: renamed from: G3 */
    public final void mo111709G3(String str, String str2, Bundle bundle, long j) throws RemoteException {
        Parcel parcelM147618O = m147618O();
        parcelM147618O.writeString(str);
        parcelM147618O.writeString(str2);
        z0t0.m218155d(parcelM147618O, bundle);
        parcelM147618O.writeLong(j);
        m147620Y2(1, parcelM147618O);
    }

    @Override // p153l.cou0
    public final int zza() throws RemoteException {
        Parcel parcelM147619P2 = m147619P2(2, m147618O());
        int i = parcelM147619P2.readInt();
        parcelM147619P2.recycle();
        return i;
    }
}
