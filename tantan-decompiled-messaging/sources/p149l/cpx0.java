package p149l;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.GoogleMapOptions;

/* JADX INFO: loaded from: classes6.dex */
public final class cpx0 extends i0r0 implements qvl {
    public cpx0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IMapFragmentDelegate");
    }

    @Override // p149l.qvl
    /* JADX INFO: renamed from: Q */
    public final uyl mo108200Q(uyl uylVar, uyl uylVar2, Bundle bundle) throws RemoteException {
        Parcel parcelM133904O = m133904O();
        sws0.m186358c(parcelM133904O, uylVar);
        sws0.m186358c(parcelM133904O, uylVar2);
        sws0.m186359d(parcelM133904O, bundle);
        Parcel parcelM133905P2 = m133905P2(4, parcelM133904O);
        uyl uylVarM196295O = uyl.AbstractBinderC20541a.m196295O(parcelM133905P2.readStrongBinder());
        parcelM133905P2.recycle();
        return uylVarM196295O;
    }

    @Override // p149l.qvl
    /* JADX INFO: renamed from: W1 */
    public final void mo108201W1(uyl uylVar, GoogleMapOptions googleMapOptions, Bundle bundle) throws RemoteException {
        Parcel parcelM133904O = m133904O();
        sws0.m186358c(parcelM133904O, uylVar);
        sws0.m186359d(parcelM133904O, googleMapOptions);
        sws0.m186359d(parcelM133904O, bundle);
        m133906Y2(2, parcelM133904O);
    }

    @Override // p149l.qvl
    /* JADX INFO: renamed from: d */
    public final void mo108202d() throws RemoteException {
        m133906Y2(16, m133904O());
    }

    @Override // p149l.qvl
    /* JADX INFO: renamed from: e0 */
    public final void mo108203e0(xlr0 xlr0Var) throws RemoteException {
        Parcel parcelM133904O = m133904O();
        sws0.m186358c(parcelM133904O, xlr0Var);
        m133906Y2(12, parcelM133904O);
    }

    @Override // p149l.qvl
    /* JADX INFO: renamed from: l */
    public final void mo108204l(Bundle bundle) throws RemoteException {
        Parcel parcelM133904O = m133904O();
        sws0.m186359d(parcelM133904O, bundle);
        m133906Y2(3, parcelM133904O);
    }

    @Override // p149l.qvl
    /* JADX INFO: renamed from: m */
    public final void mo108205m(Bundle bundle) throws RemoteException {
        Parcel parcelM133904O = m133904O();
        sws0.m186359d(parcelM133904O, bundle);
        Parcel parcelM133905P2 = m133905P2(10, parcelM133904O);
        if (parcelM133905P2.readInt() != 0) {
            bundle.readFromParcel(parcelM133905P2);
        }
        parcelM133905P2.recycle();
    }

    @Override // p149l.qvl
    public final void onDestroy() throws RemoteException {
        m133906Y2(8, m133904O());
    }

    @Override // p149l.qvl
    public final void onLowMemory() throws RemoteException {
        m133906Y2(9, m133904O());
    }

    @Override // p149l.qvl
    public final void onPause() throws RemoteException {
        m133906Y2(6, m133904O());
    }

    @Override // p149l.qvl
    public final void onResume() throws RemoteException {
        m133906Y2(5, m133904O());
    }

    @Override // p149l.qvl
    public final void onStart() throws RemoteException {
        m133906Y2(15, m133904O());
    }

    @Override // p149l.qvl
    /* JADX INFO: renamed from: w */
    public final void mo108206w() throws RemoteException {
        m133906Y2(7, m133904O());
    }
}
