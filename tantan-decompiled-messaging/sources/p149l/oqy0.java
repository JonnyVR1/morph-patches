package p149l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class oqy0 extends i0r0 implements uny0 {
    public oqy0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate");
    }

    @Override // p149l.uny0
    public final String getId() throws RemoteException {
        Parcel parcelM133905P2 = m133905P2(2, m133904O());
        String string = parcelM133905P2.readString();
        parcelM133905P2.recycle();
        return string;
    }

    @Override // p149l.uny0
    public final void remove() throws RemoteException {
        m133906Y2(1, m133904O());
    }

    @Override // p149l.uny0
    /* JADX INFO: renamed from: u3 */
    public final boolean mo165509u3(uny0 uny0Var) throws RemoteException {
        Parcel parcelM133904O = m133904O();
        sws0.m186358c(parcelM133904O, uny0Var);
        Parcel parcelM133905P2 = m133905P2(16, parcelM133904O);
        boolean zM186360e = sws0.m186360e(parcelM133905P2);
        parcelM133905P2.recycle();
        return zM186360e;
    }

    @Override // p149l.uny0
    public final int zzj() throws RemoteException {
        Parcel parcelM133905P2 = m133905P2(17, m133904O());
        int i = parcelM133905P2.readInt();
        parcelM133905P2.recycle();
        return i;
    }
}
