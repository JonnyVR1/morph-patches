package p149l;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class fux0 extends i0r0 implements rvl {
    public fux0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IMapViewDelegate");
    }

    @Override // p149l.rvl
    /* JADX INFO: renamed from: d */
    public final void mo123222d() throws RemoteException {
        m133906Y2(13, m133904O());
    }

    @Override // p149l.rvl
    /* JADX INFO: renamed from: e0 */
    public final void mo123223e0(xlr0 xlr0Var) throws RemoteException {
        Parcel parcelM133904O = m133904O();
        sws0.m186358c(parcelM133904O, xlr0Var);
        m133906Y2(9, parcelM133904O);
    }

    @Override // p149l.rvl
    public final uyl getView() throws RemoteException {
        Parcel parcelM133905P2 = m133905P2(8, m133904O());
        uyl uylVarM196295O = uyl.AbstractBinderC20541a.m196295O(parcelM133905P2.readStrongBinder());
        parcelM133905P2.recycle();
        return uylVarM196295O;
    }

    @Override // p149l.rvl
    /* JADX INFO: renamed from: l */
    public final void mo123224l(Bundle bundle) throws RemoteException {
        Parcel parcelM133904O = m133904O();
        sws0.m186359d(parcelM133904O, bundle);
        m133906Y2(2, parcelM133904O);
    }

    @Override // p149l.rvl
    /* JADX INFO: renamed from: m */
    public final void mo123225m(Bundle bundle) throws RemoteException {
        Parcel parcelM133904O = m133904O();
        sws0.m186359d(parcelM133904O, bundle);
        Parcel parcelM133905P2 = m133905P2(7, parcelM133904O);
        if (parcelM133905P2.readInt() != 0) {
            bundle.readFromParcel(parcelM133905P2);
        }
        parcelM133905P2.recycle();
    }

    @Override // p149l.rvl
    public final void onDestroy() throws RemoteException {
        m133906Y2(5, m133904O());
    }

    @Override // p149l.rvl
    public final void onLowMemory() throws RemoteException {
        m133906Y2(6, m133904O());
    }

    @Override // p149l.rvl
    public final void onPause() throws RemoteException {
        m133906Y2(4, m133904O());
    }

    @Override // p149l.rvl
    public final void onResume() throws RemoteException {
        m133906Y2(3, m133904O());
    }

    @Override // p149l.rvl
    public final void onStart() throws RemoteException {
        m133906Y2(12, m133904O());
    }
}
