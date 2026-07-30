package p153l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class uzy0 extends o9r0 implements axy0 {
    public uzy0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate");
    }

    @Override // p153l.axy0
    public final String getId() throws RemoteException {
        Parcel parcelM166807P2 = m166807P2(2, m166806O());
        String string = parcelM166807P2.readString();
        parcelM166807P2.recycle();
        return string;
    }

    @Override // p153l.axy0
    public final void remove() throws RemoteException {
        m166808Y2(1, m166806O());
    }

    @Override // p153l.axy0
    /* JADX INFO: renamed from: u3 */
    public final boolean mo100858u3(axy0 axy0Var) throws RemoteException {
        Parcel parcelM166806O = m166806O();
        y5t0.m214320c(parcelM166806O, axy0Var);
        Parcel parcelM166807P2 = m166807P2(16, parcelM166806O);
        boolean zM214322e = y5t0.m214322e(parcelM166807P2);
        parcelM166807P2.recycle();
        return zM214322e;
    }

    @Override // p153l.axy0
    public final int zzj() throws RemoteException {
        Parcel parcelM166807P2 = m166807P2(17, m166806O());
        int i = parcelM166807P2.readInt();
        parcelM166807P2.recycle();
        return i;
    }
}
